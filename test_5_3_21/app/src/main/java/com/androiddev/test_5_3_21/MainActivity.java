package com.androiddev.test_5_3_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.calculate);
        EditText amount = (EditText) findViewById(R.id.amount);
        EditText currencyFrom = (EditText) findViewById(R.id.currencyFrom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temporary = currencyFrom.getText().toString().toLowerCase();
                String temporary2 = amount.getText().toString();

                double temp = Double.parseDouble(amount.getText().toString());
                if (!TextUtils.isEmpty(temporary) && !TextUtils.isEmpty(temporary2)) {
                    if (temporary.equals("usd")) {
                        temp = temp * 84.40;
                        Toast.makeText(MainActivity.this, "USD: " + temporary2 + " = KGS: " + temp, Toast.LENGTH_LONG).show();
                    }
                    if (temporary.equals("rub")) {
                        temp = temp * 1.14;
                        Toast.makeText(MainActivity.this, "RUB: " + temporary2 + " = KGS: " + temp, Toast.LENGTH_LONG).show();
                    }
                    if (temporary.equals("eur")) {
                        temp = temp * 101.45;
                        Toast.makeText(MainActivity.this, "EUR: " + temporary2 + " = KGS: " + temp, Toast.LENGTH_LONG).show();
                    }
                }
            }
        });



    }
}