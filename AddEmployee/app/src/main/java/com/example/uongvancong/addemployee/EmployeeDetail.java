package com.example.uongvancong.addemployee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmployeeDetail extends AppCompatActivity implements View.OnClickListener {
    Button btnback;
    TextView tvres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_detail);
        init();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        String s = bundle.getString("kq");
        tvres.setText(s);
        btnback.setOnClickListener(this);
    }
    public void init(){
        btnback = (Button) findViewById(R.id.btnback);
        tvres = (TextView) findViewById(R.id.tvres);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnback:{
                Intent intent = new Intent(EmployeeDetail.this, AddEmployee.class);
                startActivity(intent);
                break;
            }
        }
    }
}
