package com.ddd0yuki.dr_puyuh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Result2Activity extends AppCompatActivity {

    private Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        btnHome = (Button) findViewById(R.id.btnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result2Activity.this, MainActivity.class));
            }
        });
    }
}
