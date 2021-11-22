package com.Syafei.retrovolley.retrofit;

import com.Syafei.retrovolley.Request;
import com.Syafei.retrovolley.User;
import com.Syafei.retrovolley.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {

    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Registration.php")
    Call<Request> sendUser(@Body User user);
}
