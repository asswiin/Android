package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connect views
        num1 = findViewById(R.id.editTextText5);
        num2 = findViewById(R.id.editTextText6);
        result = findViewById(R.id.textView5);
        add = findViewById(R.id.button7);
        sub = findViewById(R.id.button8);
        mul = findViewById(R.id.button9);
        div = findViewById(R.id.button10);

        // +
        add.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a + b));
        });

        // -
        sub.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a - b));
        });

        // *
        mul.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            result.setText("Result: " + (a * b));
        });

        // /
        div.setOnClickListener(v -> {
            double a = Double.parseDouble(num1.getText().toString());
            double b = Double.parseDouble(num2.getText().toString());
            if (b == 0) {
                result.setText("Cannot divide by 0");
            } else {
                result.setText("Result: " + (a / b));
            }
        });
    }
}

