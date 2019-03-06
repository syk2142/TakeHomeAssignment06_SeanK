package com.example.takehomeassignment06_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private double mAmount,mTax,mTip;
    private TextView summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Your Receipt");


        summary = (TextView) findViewById(R.id.receipt_textView);
        Intent intent = getIntent();

        mAmount = Double.parseDouble(intent.getStringExtra("Amount"));
        mTax = Double.parseDouble(intent.getStringExtra("Tax"));
        mTip = Double.parseDouble(intent.getStringExtra("Tip"));

        summary.setText("Total: "+ mAmount+"\nSales Tax: " + mTax*mAmount+
                "\nTip: "+ mTip*mAmount +"\nGrand Total: "+mAmount*(1+mTax+mTip));
    }
}