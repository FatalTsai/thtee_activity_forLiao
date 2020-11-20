package com.example.three_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int thispage;
    String no;
    Button Totwo;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thispage =1;
        Totwo = findViewById(R.id.two);
        text1 = findViewById(R.id.text1);
        no ="0";


        Intent it=getIntent();
        no = it.getStringExtra("page");
        text1.setText(no+"→ "+thispage);
    }

    public void totwo(View view) {

        Intent it = new Intent(this,Main2Activity.class);
        it.putExtra("page",no+"→ "+thispage);
        startActivityForResult(it,thispage);
    }

    public void tothree(View view) {
        Intent it = new Intent(this,Main3Activity.class);
        it.putExtra("page",no+"→ "+thispage);
        startActivityForResult(it,thispage);
    }



}
