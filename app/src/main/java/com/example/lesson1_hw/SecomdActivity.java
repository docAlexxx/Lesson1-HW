package com.example.lesson1_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecomdActivity extends AppCompatActivity {
    private TextView resultText;
    private Button button;
    private EditText positionTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secomd);

        resultText = (TextView) findViewById(R.id.resolution);
        button = findViewById(R.id.done_button);
        positionTitle = findViewById(R.id.position_title);


        button.setOnClickListener(v -> {
            String position = positionTitle.getText().toString();
            resultText.setText("Profile for " + position + " is added.");

        });
    }
}