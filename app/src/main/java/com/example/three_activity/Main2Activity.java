package com.example.three_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int page;
    String no;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text2 = findViewById(R.id.text2);
        no ="0";
        page =2;

        Intent it=getIntent();
        no = it.getStringExtra("page");

        text2.setText(no+"→ "+page);
    }

    public void twotoone(View view) {
        Intent it = new Intent(this,MainActivity.class);
        it.putExtra("page",no+"→ "+page);
        startActivityForResult(it,page);
    }

    public void twotothree(View view) {

        Intent it = new Intent(this,Main3Activity.class);
        it.putExtra("page",no+"→ "+page);
        startActivityForResult(it,page);

    }

}
