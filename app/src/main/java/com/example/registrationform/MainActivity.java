package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private RadioGroup radioCourse;
    private RadioButton radioButton;
    private Button button;
    EditText name;
    String arr[] = {"Semester 1", "Semester 2", "Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioCourse = (RadioGroup) findViewById(R.id.radioGroup);
        button=findViewById(R.id.submit);

         name=findViewById(R.id.nameid);

//        submit.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                int selectedId = radioCourse.getCheckedRadioButtonId();
//                radioButton = (RadioButton) findViewById(selectedId);
//               Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,arr);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,""+adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent = new Intent(MainActivity.this,Result.class);
 startActivity(intent);
     }
 });

    }
}
