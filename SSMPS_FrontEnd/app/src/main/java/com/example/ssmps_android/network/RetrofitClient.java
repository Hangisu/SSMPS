package com.example.ssmps_android.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static Retrofit instance = null;
    private static final String URL = "http://192.168.0.30:8080";

    public static Retrofit getInstance(TokenInterceptor interceptor){
        if(instance == null){
            OkHttpClient client = new OkHttpClient.Builder()
                                      .addInterceptor(interceptor)
                                      .build();

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            instance = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .client(client)
                    .build();

        }
        return instance;
    }
}