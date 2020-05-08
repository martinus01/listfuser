package com.example.listfuser;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Launchlibrary {
    @GET("/1.3/launch/next/10")
    Call<RestLaunchResponse> getLaunchResponse();

}
