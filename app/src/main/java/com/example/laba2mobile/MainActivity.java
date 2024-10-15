package com.example.laba2mobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });

        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        });
    }
}