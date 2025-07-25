package com.spark.checkbox2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cbMon, cbTue, cbWed, cbThu, cbFri, cbSat, cbSun;
    EditText etMon, etTue, etWed, etThu, etFri, etSat, etSun;
    Button saveDetailsButton;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbMon = findViewById(R.id.mon1);
        cbTue = findViewById(R.id.tue1);
        cbWed = findViewById(R.id.wed2);
        cbThu = findViewById(R.id.tues);
        cbFri = findViewById(R.id.frii);
        cbSat = findViewById(R.id.sat1);
        cbSun = findViewById(R.id.sun1);

        etMon = findViewById(R.id.Mon1);
        etTue = findViewById(R.id.Tue1);
        etWed = findViewById(R.id.Wed1);
        etThu = findViewById(R.id.Thuu);
        etFri = findViewById(R.id.Frii1);
        etSat = findViewById(R.id.Sat1);
        etSun = findViewById(R.id.Sun1);

        // Save Button
        saveDetailsButton = findViewById(R.id.saveDetailsButton);

        saveDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder result = new StringBuilder();
                result.append("Week-off Summary:\n");

                result.append("Mon: ").append(cbMon.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Tue: ").append(cbTue.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Wed: ").append(cbWed.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Thu: ").append(cbThu.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Fri: ").append(cbFri.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Sat: ").append(cbSat.isChecked() ? "Week-off" : "Working").append("\n");
                result.append("Sun: ").append(cbSun.isChecked() ? "Week-off" : "Working").append("\n");

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
