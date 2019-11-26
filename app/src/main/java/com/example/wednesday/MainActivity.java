package com.example.wednesday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.color_spinner);
        final CheckBox checkBox = findViewById(R.id.check_conditions);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "the selected item:" + spinner.getSelectedItem(), Toast.LENGTH_SHORT).show();
                if (checkBox.isChecked())
                    Log.i("spinner","condition accepted");
                else
                    Log.i("spinner","condition must be accepted");
            }
        });
//        RadioGroup radioGroup = findViewById(R.id.radio_group);
//        int id = radioGroup.getCheckedRadioButtonId();
//        Log.i("idradio","itemchecker"+ id);


       // CheckBox checkBox = findViewById(R.id.check_conditions);
    }

    public void  itemChecker(View view){
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        //both ids give the same result
        //int id = radioGroup.getCheckedRadioButtonId();
        int id = view.getId();
        Log.i("idradio","itemchecker"+ id);
        switch (id){
            case R.id.yellow:
                Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
            case R.id.blue:
                Toast.makeText(this, "blue", Toast.LENGTH_SHORT).show();
            case R.id.green:
                Toast.makeText(this, "green", Toast.LENGTH_SHORT).show();
            case R.id.black:
                Toast.makeText(this, "black", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
