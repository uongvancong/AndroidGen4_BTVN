package com.example.uongvancong.thoitiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout haiphong, namdinh, hanam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        haiphong = (LinearLayout) findViewById(R.id.haiphong);
        haiphong.setOnClickListener(this);
        namdinh = (LinearLayout) findViewById(R.id.namdinh);
        namdinh.setOnClickListener(this);
        hanam = (LinearLayout) findViewById(R.id.hanam);
        hanam.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.haiphong: {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.namdinh: {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.hanam: {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
                break;
            }

        }
    }
}
