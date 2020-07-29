package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {

        //create a constant variable for the ration from euro to dollar
        final double euroToDollarRatio = .91;

        Log.i("Info", "Button Pressed!");

        /* reads the currency value in dollars that the user input */
        EditText currencyInputEditText = (EditText) findViewById(R.id.currencyInputEditText);
        String inputDollarValue = currencyInputEditText.getText().toString();

        //converts the EditText object into a string and then into an integer
        double currencyInDollars = Integer.parseInt(inputDollarValue);
        double convertedCurrency = euroToDollarRatio*currencyInDollars;
        String result = String.format("%.2f", convertedCurrency);

        /* displays the result of euroToDollar*currencyInDollars (converts dollar to euro) in a Toast. */
        Toast.makeText(this, "$" + String.format("%.2f",currencyInDollars) + " is " + "€" + result, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
