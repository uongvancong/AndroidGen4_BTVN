package com.example.uongvancong.addemployee;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddEmployee extends AppCompatActivity implements View.OnClickListener {
    EditText edtname;
    TextView tvbd;
    String s;
    Button btnsave;
    Spinner spinnerBirhPlace;
    RadioButton radioButton1, radioButton2, radioButton3;
    RadioGroup rggender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        init();
        String arr[] = {"Hà Nội", "Hà Nam", "Hà Tây", "Hà Đông"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerBirhPlace.setAdapter(arrayAdapter);
        tvbd.setOnClickListener(this);
        btnsave.setOnClickListener(this);
    }

    public void init() {
        edtname = (EditText) findViewById(R.id.edtname);
        tvbd = (TextView) findViewById(R.id.tvbd);
        btnsave = (Button) findViewById(R.id.btnsave);
        spinnerBirhPlace = (Spinner) findViewById(R.id.birthplace);
        radioButton1 = (RadioButton) findViewById(R.id.radio1);
        radioButton2 = (RadioButton) findViewById(R.id.radio2);
        radioButton3 = (RadioButton) findViewById(R.id.radio3);
        rggender = (RadioGroup) findViewById(R.id.rggender);
    }
    public boolean isCheckRadioButton(){
        if(!radioButton1.isChecked() && !radioButton2.isChecked()&&!radioButton3.isChecked()) return true;
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnsave: {
                if (edtname.getText().toString().isEmpty() || tvbd.getText().toString().isEmpty() ||isCheckRadioButton()) {
                    Toast.makeText(this, "Hãy Nhập Đủ Dữ Liệu", Toast.LENGTH_LONG).show();
                } else {
                    String gender;
                    int rbCheckedID = rggender.getCheckedRadioButtonId();
                    RadioButton temp = (RadioButton) findViewById(rbCheckedID);

                    s = "Name: "+ edtname.getText().toString()+"\n\n"+"Birthday: "+tvbd.getText().toString()+"\n\n"+"BirhPlace:"+spinnerBirhPlace.getSelectedItem().toString()+"\n\n"+"Gender: "+temp.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("kq", s);

                    Intent intent = new Intent(AddEmployee.this, EmployeeDetail.class);
                    intent.putExtra("data", bundle);
                    startActivity(intent);
                }
                break;
            }
            case R.id.tvbd: {
                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        tvbd.setText(datePicker.getDayOfMonth() + " / " + (datePicker.getMonth() + 1) + " / " + datePicker.getYear());
                    }
                };
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, onDateSetListener, 1995, 2, 28);
                datePickerDialog.show();
                break;
            }
        }


    }
}
