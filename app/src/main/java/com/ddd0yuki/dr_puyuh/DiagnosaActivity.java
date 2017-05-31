package com.ddd0yuki.dr_puyuh;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DiagnosaActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnEnter, btnReset;
    private CheckBox    cekM1, cekM2, cekM3, cekM4, cekM5,
                        cekB1, cekB2, cekB3, cekB4,
                        cekF1, cekF2, cekF3, cekF4,
                        cekL1, cekL2, cekL3, cekL4, cekL5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        btnEnter    = (Button) findViewById(R.id.btnEnter);
        btnReset    = (Button) findViewById(R.id.btnReset);

        cekM1   = (CheckBox) findViewById(R.id.cekM1);
        cekM2   = (CheckBox) findViewById(R.id.cekM2);
        cekM3   = (CheckBox) findViewById(R.id.cekM3);
        cekM4   = (CheckBox) findViewById(R.id.cekM4);
        cekM5   = (CheckBox) findViewById(R.id.cekM5);
        cekB1   = (CheckBox) findViewById(R.id.cekB1);
        cekB2   = (CheckBox) findViewById(R.id.cekB2);
        cekB3   = (CheckBox) findViewById(R.id.cekB3);
        cekB4   = (CheckBox) findViewById(R.id.cekB4);
        cekF1   = (CheckBox) findViewById(R.id.cekF1);
        cekF2   = (CheckBox) findViewById(R.id.cekF2);
        cekF3   = (CheckBox) findViewById(R.id.cekF3);
        cekF4   = (CheckBox) findViewById(R.id.cekF4);
        cekL1   = (CheckBox) findViewById(R.id.cekL1);
        cekL2   = (CheckBox) findViewById(R.id.cekL2);
        cekL3   = (CheckBox) findViewById(R.id.cekL3);
        cekL4   = (CheckBox) findViewById(R.id.cekL4);
        cekL5   = (CheckBox) findViewById(R.id.cekL5);

        btnEnter.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnEnter){
            Diagnosa();
        } else if (v.getId()==R.id.btnReset){
            cekM1.setChecked(false);
            cekM2.setChecked(false);
            cekM3.setChecked(false);
            cekM4.setChecked(false);
            cekM5.setChecked(false);
            cekB1.setChecked(false);
            cekB2.setChecked(false);
            cekB3.setChecked(false);
            cekB4.setChecked(false);
            cekF1.setChecked(false);
            cekF2.setChecked(false);
            cekF3.setChecked(false);
            cekF4.setChecked(false);
            cekL1.setChecked(false);
            cekL2.setChecked(false);
            cekL3.setChecked(false);
            cekL4.setChecked(false);
            cekL5.setChecked(false);
        }
    }

    public void Diagnosa(){
        if(cekL1.isChecked() && cekM5.isChecked() && cekF1.isChecked() && cekB3.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result1Activity.class));
        } else if (cekL3.isChecked() && cekL1.isChecked() && cekL2.isChecked() && cekM5.isChecked() && cekM4.isChecked()
                && cekB2.isChecked() && cekB4.isChecked() && cekF4.isChecked() && cekF2.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result2Activity.class));
        } else if (cekB3.isChecked() && cekL4.isChecked() && cekL3.isChecked() && cekF1.isChecked() && cekF3.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result3Activity.class));
        } else if (cekB1.isChecked() && cekB4.isChecked() && cekL4.isChecked() && cekF3.isChecked() && cekF1.isChecked()
                && cekL2.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result4Activity.class));
        } else if (cekM1.isChecked() && cekM2.isChecked() && cekM3.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result5Activity.class));
        } else if (cekM1.isChecked() && cekL1.isChecked() && cekB4.isChecked() && cekL3.isChecked()){
            startActivity( new Intent(DiagnosaActivity.this, Result6Activity.class));
        } else {
            Toast.makeText(this, "Periksa kembali pilihan Anda", Toast.LENGTH_SHORT).show();
        }

    }

}
