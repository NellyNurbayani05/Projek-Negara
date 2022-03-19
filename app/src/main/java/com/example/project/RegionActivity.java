package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class RegionActivity extends AppCompatActivity {
    GifImageView gifNext;
    Negaraaa daftarNegara;
    TextView txtNamaNegara, txtwilayah, txtbenua;
    ImageView imgbendera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        txtNamaNegara=(TextView) findViewById(R.id.txt_nama_negara);
        txtwilayah=(TextView) findViewById(R.id.txt_region);
        txtbenua=(TextView) findViewById(R.id.txt_contient);
        imgbendera=(ImageView) findViewById(R.id.img_bendera);
        gifNext=(GifImageView) findViewById(R.id.gif_next);
        Intent dapet=getIntent();
        daftarNegara= (Negaraaa) dapet.getSerializableExtra("dapet");
        txtNamaNegara.setText(daftarNegara.getName().getCommon().toString());
        txtwilayah.setText(daftarNegara.getRegion().toString());
        txtbenua.setText(daftarNegara.getContinents().toString());
        Picasso.with(RegionActivity.this).load(daftarNegara.getFlags().getPng()).into(imgbendera);
        gifNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PindahGift= new Intent(RegionActivity.this, MapsActivity.class);
                PindahGift.putExtra("dapet",daftarNegara);
                startActivity(PindahGift);
            }
        });

    }
}