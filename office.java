package com.example.smartofficecontrol;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLightOn, btnLightOff;
    Button btnFanOn, btnFanOff;
    Button btnAcOn, btnAcOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLightOn = findViewById(R.id.btnLightOn);
        btnLightOff = findViewById(R.id.btnLightOff);
        btnFanOn = findViewById(R.id.btnFanOn);
        btnFanOff = findViewById(R.id.btnFanOff);
        btnAcOn = findViewById(R.id.btnAcOn);
        btnAcOff = findViewById(R.id.btnAcOff);

        btnLightOn.setOnClickListener(v ->
                Toast.makeText(this, "Light Turned ON", Toast.LENGTH_SHORT).show());

        btnLightOff.setOnClickListener(v ->
                Toast.makeText(this, "Light Turned OFF", Toast.LENGTH_SHORT).show());

        btnFanOn.setOnClickListener(v ->
                Toast.makeText(this, "Fan Turned ON", Toast.LENGTH_SHORT).show());

        btnFanOff.setOnClickListener(v ->
                Toast.makeText(this, "Fan Turned OFF", Toast.LENGTH_SHORT).show());

        btnAcOn.setOnClickListener(v ->
                Toast.makeText(this, "AC Turned ON", Toast.LENGTH_SHORT).show());

        btnAcOff.setOnClickListener(v ->
                Toast.makeText(this, "AC Turned OFF", Toast.LENGTH_SHORT).show());
    }
}
