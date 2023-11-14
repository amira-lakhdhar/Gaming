package com.example.localstorage.api;


import com.example.localstorage.entities.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @GET("mangas")
    Call<List<User>> findAll();

    @GET("User/{id}")
    Call<User> findById(@Path("id") long id);

    @POST("mangas")
    Call<User> save(@Body User manga);

    @PUT("mangas/{id}")
    Call<User> update(@Body User manga);

    @DELETE("mangas/{id}")
    Call<User> delete(@Path("id") long id);


}
