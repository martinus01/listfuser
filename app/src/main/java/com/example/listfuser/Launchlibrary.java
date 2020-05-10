package com.example.listfuser;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Launchlibrary {
    @GET("upcomminglaunch.json")
    Call<RestLaunchResponse> getLaunchResponse();

}
