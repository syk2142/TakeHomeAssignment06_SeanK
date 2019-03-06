package com.example.takehomeassignment06_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    private EditText mAmount,mTax,mTip;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Tip Calculator");



        mAmount = (EditText)findViewById(R.id.anount_editText);
        mTax = (EditText)findViewById(R.id.tax_editText);
        mTip = (EditText)findViewById(R.id.tip_editText);
        submit = (Button)findViewById(R.id.submit_button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Amount",mAmount.getText().toString());
                intent.putExtra("Tax",mTax.getText().toString());
                intent.putExtra("Tip",mTip.getText().toString());
                startActivity(intent);
            }
        });
    }


}
