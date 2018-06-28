package com.ceolabs.myapplication.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

//    BASE URL MERUPAKAN NAMA SITUS/DOMAIN
    public static final String BASE_URL = "http://muslimsalat.com/";

    public static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null ){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }



}
