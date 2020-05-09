package com.example.listfuser;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Launchlibrary {
    @GET("launch/next/10")
    Call<RestLaunchResponse> getLaunchResponse();

}
