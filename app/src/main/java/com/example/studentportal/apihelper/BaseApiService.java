package com.example.studentportal.apihelper;

import java.util.Date;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface BaseApiService {
    //Fungsi untuk memanggil API
    @FormUrlEncoded
    @POST("user/getLogin")
    Call<ResponseBody> loginRequest(@Field("npm") String npm,
                                    @Field("password") String password);

    @FormUrlEncoded
    @PUT("akun/updateAkun")
    Call<ResponseBody> aktivasiRequest(@Field("npm") String npm,
                                         @Field("password") String password,
                                         @Field("tglLahir") String tglLahir);
}
