package com.example.project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("all")
    Call<List<Negaraaa>> getlistNegara();
}
