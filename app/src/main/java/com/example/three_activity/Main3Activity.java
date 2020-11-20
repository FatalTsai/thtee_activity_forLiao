package com.example.three_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    int page;
    String no;
    TextView text3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text3 = findViewById(R.id.text3);
        page =3;
        no ="0";
        Intent it=getIntent();
        no = it.getStringExtra("page");

        text3.setText(no+"→ "+page);

    }



    public void threetoone(View view) {
        Intent it = new Intent(this,MainActivity.class);
        it.putExtra("page",no+"→ "+page);
        startActivityForResult(it,page);
    }

    public void threetotwo(View view) {
        Intent it = new Intent(this,Main2Activity.class);
        it.putExtra("page",no+"→ "+page);
        startActivityForResult(it,page);
    }





}
