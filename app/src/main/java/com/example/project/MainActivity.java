package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    SemuaNegaraAdapter adapter;
    ApiInterface anInterface;
    RecyclerView.LayoutManager layoutManager;
    List<Negaraaa> daftarNegara;
    RecyclerView rvNegara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNegara=(RecyclerView) findViewById(R.id.ngr_item);
        layoutManager=new LinearLayoutManager(this);
        rvNegara.setLayoutManager(layoutManager);
        Intent dapet=getIntent();
        daftarNegara= (List<Negaraaa>) dapet.getSerializableExtra("negaranya");
        adapter=new SemuaNegaraAdapter(MainActivity.this,daftarNegara);
        rvNegara.setAdapter(adapter);
    }
}