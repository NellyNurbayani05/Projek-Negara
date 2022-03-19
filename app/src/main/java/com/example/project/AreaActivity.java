package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class AreaActivity extends AppCompatActivity {
    GifImageView gifNext;
    Negaraaa daftarNegara;
    TextView txtnamanegara,txtarea,txtpopulation;
    ImageView imgbendera,imglogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        txtnamanegara=(TextView) findViewById(R.id.txt_nama_negara);
        txtarea=(TextView) findViewById(R.id.txt_area);
        txtpopulation=(TextView) findViewById(R.id.txt_population);
        imgbendera=(ImageView) findViewById(R.id.img_bendera);
        imglogo=(ImageView) findViewById(R.id.img_logo);
        gifNext=(GifImageView) findViewById(R.id.gif_next);
        Intent dapet=getIntent();
        daftarNegara= (Negaraaa) dapet.getSerializableExtra("neg");
        txtarea.setText(daftarNegara.getArea().toString());
        txtnamanegara.setText(daftarNegara.getName().getCommon().toString());
        txtpopulation.setText(daftarNegara.getPopulation().toString());
        Picasso.with(AreaActivity.this).load(daftarNegara.getCoatOfArms().getPng()).into(imglogo);
        Picasso.with(AreaActivity.this).load(daftarNegara.getFlags().getPng()).into(imgbendera );
        gifNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent PindahGift= new Intent(AreaActivity.this, RegionActivity.class);
                PindahGift.putExtra("dapet",daftarNegara);
                startActivity(PindahGift);
            }
        });
    }
}