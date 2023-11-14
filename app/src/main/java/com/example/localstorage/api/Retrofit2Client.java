package com.example.localstorage.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Retrofit2Client {

    public static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(" http://localhost:9090/")
            .addConverterFactory(GsonConverterFactory.create());

    private static final Retrofit retrofit = builder.build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
