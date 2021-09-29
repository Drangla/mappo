package com.fhtechnikum.mappo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Appointments extends AppCompatActivity {
    public static final String INTENT_KEY = "appointments_key";
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments);

        //text = findViewById(R.id.textView);
        //text.setText(getIntent().getStringExtra(INTENT_KEY));

    }
}