package com.juborajsarker.assignment.api;

import com.juborajsarker.assignment.json_class.MainStation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Api {

    String BASE_URL = "https://api.myjson.com/";

    @GET
    Call<List<MainStation>> getStationList(@Url String url);
}
