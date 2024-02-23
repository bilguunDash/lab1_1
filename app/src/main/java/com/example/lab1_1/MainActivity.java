package com.example.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1 = findViewById(R.id.input); //Андройд хөгжүүлэлтийн хувьд findViewById() ашиглан XML байршлын файлд тодорхойлсон ID-аар нь харагдацын лавлагааг олох нь нийтлэг практик юм.
        EditText input2 = findViewById(R.id.input2);

        Button button = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        TextView result = (TextView) findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int sum = num1 + num2;

                result.setText("Хариу : " + Integer.toString(sum));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int minus = num1 - num2;

                result.setText("Хариу : " + Integer.toString(minus));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int divide = num1 / num2;

                result.setText("Хариу : " + Integer.toString(divide));
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int multiply = num1 * num2;

                result.setText("Хариу : " + Integer.toString(multiply));
            }
        });
    }
}

