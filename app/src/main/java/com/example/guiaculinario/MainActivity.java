package com.example.guiaculinario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLocal1 = findViewById(R.id.btnLocal1);
        Button btnLocal2 = findViewById(R.id.btnLocal2);
        Button btnLocal3 = findViewById(R.id.btnLocal3);

        btnLocal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("scrollToSection", "local1tela2");
                startActivity(intent);
            }
        });

        btnLocal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("scrollToSection", "local2Tela2");
                startActivity(intent);
            }
        });

        btnLocal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("scrollToSection", "local3Tela2");
                startActivity(intent);
            }
        });
    }
}