package edu.northeastern.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //add few variables that will connect to our buttons
    private Button makeItRain;
    private TextView moneyValue;
    private Button showInfo;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeItRain = findViewById(R.id.buttonMakeItRain);
        moneyValue = findViewById(R.id.moneyValue);

//        //one way to set onclick for the button
//        makeItRain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MainActivity", "onClick: Make it rain ");
//
//            }
//        });

    }
    //another way to set onClick events for the button
    public void showMoney(View view) {
        //format number into currency
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 100;
        moneyValue.setText(numberFormat.format(moneyCounter));
        //Log.d("MIR", "onClick: " + moneyCounter);
    }


}