package com.ddd0yuki.dr_puyuh;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnDiagnosa, btnDetail, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDiagnosa = (Button) findViewById(R.id.btnDiagnosa);
        btnDetail   = (Button) findViewById(R.id.btnDetail);
        btnAbout    = (Button) findViewById(R.id.btnAbout);

        btnDiagnosa.setOnClickListener(this);
        btnDetail.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnDiagnosa){
            Intent intent = new Intent(MainActivity.this, DiagnosaActivity.class);
            startActivity(intent);
        } else  if (v.getId()==R.id.btnDetail) {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            startActivity(intent);
        } else  if (v.getId()==R.id.btnAbout){
            Intent intent = new Intent(MainActivity.this, AboutActivity .class);
            startActivity(intent);
        }
    }
}
