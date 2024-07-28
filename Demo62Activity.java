package fpl.quangnm.lab1.demo6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import fpl.quangnm.lab1.R;

public class Demo62Activity extends AppCompatActivity {
    Button btnstart, btnstop,btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo62);
        btnstart = findViewById(R.id.demo62_btnstart);
        btnstop = findViewById(R.id.btn_demo62stop);
        btn = findViewById(R.id.demo62btnBackgroub);
        btnstart.setOnClickListener(view -> {
            startService(new Intent(Demo62Activity.this,ForcegroundService.class));
        });
        btnstop.setOnClickListener(view -> {
            startService(new Intent(Demo62Activity.this,ForcegroundService.class));
        });
        btn.setOnClickListener(view -> {
            startService(new Intent(Demo62Activity.this,BackgroubService.class));
        });
    }
}