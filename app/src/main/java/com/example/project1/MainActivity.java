package com.example.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText panjang;
private EditText lebar;
private EditText tinggi;
private TextView Total;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panjang = (EditText) findViewById(R.id.panjang);
        lebar = (EditText) findViewById(R.id.lebar);
        tinggi = (EditText) findViewById(R.id.tinggi);
        Total = (TextView) findViewById(R.id.Total);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(panjang.getText().toString());
                int b = Integer.parseInt(lebar.getText().toString());
                int c = Integer.parseInt(tinggi.getText().toString());
                int d = (a*b*c)/2;
                Total.setText("" + d);
            }
        });
    }
}
