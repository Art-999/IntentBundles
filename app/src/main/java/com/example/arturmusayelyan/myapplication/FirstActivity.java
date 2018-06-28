package com.example.arturmusayelyan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String KAY_1 = "key_1";
    public final static String KAY_2 = "key_2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.second_activity_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(KAY_1, "Artur");
        intent.putExtra(KAY_2, "Musayelyan");
        startActivity(intent);
    }
}
