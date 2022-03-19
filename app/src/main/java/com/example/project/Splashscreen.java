package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void,Void,Void> {
        ApiInterface anInterface;
        List<Negaraaa> daftarNegara;
        @Override
        protected Void doInBackground(Void... voids) {
            anInterface=ApiClient.ambilNegara().create(ApiInterface.class);
            Call<List<Negaraaa>> listCall=anInterface.getlistNegara();
            listCall.enqueue(new Callback<List<Negaraaa>>() {
                @Override
                public void onResponse(Call<List<Negaraaa>> call, Response<List<Negaraaa>> response) {
                    daftarNegara=response.body();
                    Intent kirim = new Intent(Splashscreen.this,MainActivity.class);
                    kirim.putExtra("negaranya", (Serializable) daftarNegara);
                    startActivity(kirim);
                    finish();

                }

                @Override
                public void onFailure(Call<List<Negaraaa>> call, Throwable t) {

                }
            });
            return null;
        }
    }
}