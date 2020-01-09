package com.sabekur2017.theborakrestassignment.service;

import com.sabekur2017.theborakrestassignment.models.TvChannelModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface TvApiService {
    @GET
    Call<TvChannelModel> getTvChannelModel(@Url String key);
}
