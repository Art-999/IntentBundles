package com.example.arturmusayelyan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundleExtras = getIntent().getExtras();
        if (bundleExtras != null) {
            String value1 = bundleExtras.getString(FirstActivity.KAY_1);
            String value2 = bundleExtras.getString(FirstActivity.KAY_2);

            Toast.makeText(this, "Values are:\n First value: " + value1 + "\n Second value: " + value2, Toast.LENGTH_SHORT).show();
        }
    }
}
