 package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebChromeClient;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.picasso.Picasso;

import java.security.PrivateKey;
import java.util.List;
import java.util.Map;

import pl.droidsonroids.gif.GifImageView;

public class MapsActivity extends AppCompatActivity {
    GifImageView gifback;
    Negaraaa daftarNegara;
    TextView txtNamaNegara;
    ImageView imgbendera;
    WebView maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        txtNamaNegara = (TextView) findViewById(R.id.txt_nama_negara);
        imgbendera = (ImageView) findViewById(R.id.img_bendera);
        maps = (WebView) findViewById(R.id.webview);
        openBrowser();
        gifback = (GifImageView) findViewById(R.id.gifback1);
        Intent dapet = getIntent();
        daftarNegara = (Negaraaa) dapet.getSerializableExtra("dapet");
        txtNamaNegara.setText(daftarNegara.getName().getCommon().toString());
        Picasso.with(MapsActivity.this).load(daftarNegara.getFlags().getPng()).into(imgbendera);
        gifback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent PindahGift = new Intent(MapsActivity.this, MainActivity.class);
                PindahGift.putExtra("dapet", daftarNegara);
                startActivity(PindahGift);

            }

        });
    }
    @SuppressWarnings("static-acces")

    private void openBrowser()
    {
        String url = "https://goo.gl/maps/tiQ9Baekb1jQtDSD9";
        WebChromeClient wcc = new WebChromeClient();
        maps.setWebChromeClient(wcc);
        maps.getSettings() .setJavaScriptEnabled(true);
        maps.getSettings ().setBuiltInZoomControls(true);
        maps.enableSlowWholeDocumentDraw();
        maps.loadUrl(url);
    }


}


