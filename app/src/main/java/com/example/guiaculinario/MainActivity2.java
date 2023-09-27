package com.example.guiaculinario;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ScrollView scrollView = findViewById(R.id.scrollView);

        String scrollToSection = getIntent().getStringExtra("scrollToSection");
        if (scrollToSection != null) {
            View targetView = findViewById(getResources().getIdentifier(scrollToSection, "id", getPackageName()));
            if (targetView != null) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.smoothScrollTo(0, targetView.getTop());
                    }
                });
            }
        }

        Button btnSiteA = findViewById(R.id.btnSiteA);
        btnSiteA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.applebees.com.br/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnSiteC = findViewById(R.id.btnSiteC);
        btnSiteC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://cafecomgato.com.br/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnSiteJ = findViewById(R.id.btnSiteJ);
        btnSiteJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagramUsername = "bigjeffsburger";
                String url = "https://www.instagram.com/" + instagramUsername + "/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button btnTelefoneA = findViewById(R.id.btnTelefoneA);
        btnTelefoneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefone = "tel:(15) 99242-9898";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telefone));
                startActivity(intent);
            }
        });

        Button btnTelefoneC = findViewById(R.id.btnTelefoneC);
        btnTelefoneC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefone = "tel:(15) 3326-0658";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telefone));
                startActivity(intent);
            }
        });

        Button btnTelefoneJ = findViewById(R.id.btnTelefoneJ);
        btnTelefoneJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String telefone = "tel:(15) 3358-7810";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(telefone));
                startActivity(intent);
            }
        });

        ImageButton mapsJeffs = findViewById(R.id.mapsJeffs);
        mapsJeffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = "Avenida+das+Hortênsias+111";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        ImageButton mapsCafe = findViewById(R.id.mapsCafe);
        mapsCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = "Avenida+Pereira+da+Silva+866";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        ImageButton mapsApple = findViewById(R.id.mapsApple);
        mapsApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = "Rua+Pedro+Molina+72";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

    }
}

