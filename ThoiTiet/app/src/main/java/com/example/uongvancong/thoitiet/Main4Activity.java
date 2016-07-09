package com.example.uongvancong.thoitiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout hn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        hn_back = (LinearLayout) findViewById(R.id.hn_back);
        hn_back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hn_back:{
                Intent intent = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
