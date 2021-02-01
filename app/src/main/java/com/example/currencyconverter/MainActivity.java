package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view)
    {
        EditText dollorAmount = (EditText) findViewById(R.id.dollorAmt);

        Double amount = Double.parseDouble(dollorAmount.getText().toString());

        Double pound = amount * 0.75;

        Toast.makeText(this, String.format("%.2f",pound), Toast.LENGTH_SHORT).show();

        Log.i("Info", dollorAmount.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}