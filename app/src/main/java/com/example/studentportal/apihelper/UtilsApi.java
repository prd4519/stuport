package com.example.studentportal.apihelper;

public class UtilsApi {
    //localhost
    public static final String BASE_URL_API = "http://192.168.43.122/api_sistem_login/";

    //deklarasi Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
