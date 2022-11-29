package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv3;
    Button ventana2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ventana2=(Button)findViewById(R.id.ventana2);

        ventana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ventana2.class);
                startActivity(i);

            }
        });

                et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2=(EditText) findViewById(R.id.editTextTextPersonName2);
        tv3=(TextView) findViewById(R.id.textView3);
    }
    public void ejecutar(View view){
        tv3.setText(et1.getText().toString()+""+et2.getText().toString());
    }
}