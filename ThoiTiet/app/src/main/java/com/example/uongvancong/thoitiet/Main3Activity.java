package com.example.uongvancong.thoitiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout nd_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        nd_back = (LinearLayout) findViewById(R.id.nd_back);
        nd_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.nd_back:{
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
