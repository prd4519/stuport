package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.studentportal.apihelper.BaseApiService;
import com.example.studentportal.apihelper.UtilsApi;
import com.google.gson.JsonIOException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Aktivasi extends AppCompatActivity {

    EditText edtNpm, edtPassword, edtTgl;
    Context mContext;
    BaseApiService mApiService;
    MD5 md5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivasi);

        mContext = this;
        mApiService = UtilsApi.getAPIService(); //meng-init yang ada di package API

        edtNpm = (EditText)findViewById(R.id.editTextNPM);
        edtPassword = (EditText)findViewById(R.id.editTextPassword);
        edtTgl = (EditText)findViewById(R.id.editTglLahir);

        md5 = new MD5();

        Button btnAktivasiAkun = (Button) findViewById(R.id.btnAktif);
        btnAktivasiAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestAktivasi();
            }
        });

    }

    private void RequestAktivasi(){
        String npm = edtNpm.getText().toString();
        String password = MD5.md5(edtPassword.getText().toString());
        String tglLahir = edtTgl.getText().toString();

        mApiService.aktivasiRequest(npm, password, tglLahir)
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if(response.isSuccessful()){
                            try {
                                JSONObject jsonObject = new JSONObject(response.body().string());
                                if(jsonObject.getString("error").equals("false")){
                                    String ok = jsonObject.getString("ok");
                                    Toast.makeText(mContext, ok, Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(mContext, MainActivity.class);
                                    startActivity(intent);
                                }else {
                                    String message = jsonObject.getString("message");
                                    Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
                                }
                            }catch (JSONException e){
                                e.printStackTrace();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        } else{
                            Log.i("debug", "onResponse: GAGAL");
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e("debug", "onFailure: ERROR > " + t.toString());
                    }
                });
    }
}