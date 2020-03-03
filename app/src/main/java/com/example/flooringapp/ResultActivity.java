package com.example.flooringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvLengthCalc;
    TextView tvWidthCalc;
    TextView tvResult;
    FloorTileCalculator Calc = new FloorTileCalculator();
    String bundleWidth;
    String bundleLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvLengthCalc = (TextView) findViewById(R.id.textViewLengthTemp);
        tvWidthCalc = (TextView) findViewById(R.id.textViewWidthTemp);
        tvResult = (TextView) findViewById(R.id.textViewResultTemp);

        Bundle extras = getIntent().getExtras();
        bundleWidth = extras.getString("WIDTH");
        bundleLength = extras.getString("LENGTH");

        Calc.setWidth(Double.parseDouble(bundleWidth));
        Calc.setLength(Double.parseDouble(bundleLength));

        tvLengthCalc.setText(bundleLength);
        tvWidthCalc.setText(bundleWidth);
        tvResult.setText(Calc.tileCalculate(bundleWidth, bundleLength).toString());

    }
}
