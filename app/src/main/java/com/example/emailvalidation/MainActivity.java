package com.example.emailvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button validate;
    EditText input;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validate = findViewById(R.id.button);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);

        validate.setOnClickListener(view -> {
            String temp = input.getText().toString().trim();
            if (temp.contains("@")) {
                result.setText("VALID");
            } else {
                result.setText("INVALID");
            }
        });
    }
}