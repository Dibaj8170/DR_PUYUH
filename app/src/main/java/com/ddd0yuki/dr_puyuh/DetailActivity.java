package com.ddd0yuki.dr_puyuh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    String[] listArray={"Radang Usus","Tetelo","Berak Kapur","Berak Darah","Snot","Cacingan"};
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_listpenyakit,listArray);
        listview = (ListView) findViewById(R.id.listPenyakit);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String) listview.getAdapter().getItem(position);
                if (value.equals("Radang Usus")){
                    startActivity( new Intent(DetailActivity.this, Result1Activity.class));
                } else  if (value.equals("Tetelo")){
                    startActivity( new Intent(DetailActivity.this, Result2Activity.class));
                } else  if (value.equals("Berak Kapur")){
                    startActivity( new Intent(DetailActivity.this, Result3Activity.class));
                } else  if (value.equals("Berak Darah")){
                    startActivity( new Intent(DetailActivity.this, Result4Activity.class));
                } else  if (value.equals("Snot")){
                    startActivity( new Intent(DetailActivity.this, Result5Activity.class));
                } else  if (value.equals("Cacingan")){
                    startActivity( new Intent(DetailActivity.this, Result6Activity.class));
                }
            }
        });
    }
}
