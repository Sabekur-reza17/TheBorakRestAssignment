package com.sabekur2017.theborakrestassignment.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiBuilder {
    public static final String BASE_URL = "https://www.getpostman.com/collections/";
    private Retrofit retrofit;
    public RetrofitApiBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public TvApiService getTvApiService(){
        return retrofit.create(TvApiService.class);
    }

}
