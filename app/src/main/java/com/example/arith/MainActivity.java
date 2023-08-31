package com.example.arith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sum(View v)
    {
        EditText first= findViewById(R.id.num1);
        EditText Second= findViewById(R.id.num2);
        Button btn1=findViewById(R.id.add);
        String a=first.getText().toString();
        String b=Second.getText().toString();
        Integer val1=Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1=val1+val2;
        Toast.makeText(getApplicationContext(),"sum ="+add1,Toast.LENGTH_LONG).show();

    }
    public void sub(View v)
    {
        EditText first= findViewById(R.id.num1);
        EditText Second= findViewById(R.id.num2);
        Button btn2=findViewById(R.id.sub);
        String a=first.getText().toString();
        String b=Second.getText().toString();
        Integer val1=Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1=val1-val2;
        Toast.makeText(getApplicationContext(),"sub ="+add1,Toast.LENGTH_LONG).show();

    }
    public void mul(View v)
    {
        EditText first= findViewById(R.id.num1);
        EditText Second= findViewById(R.id.num2);
        Button btn3=findViewById(R.id.mul);
        String a=first.getText().toString();
        String b=Second.getText().toString();
        Integer val1=Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1=val1*+val2;
        Toast.makeText(getApplicationContext(),"mul ="+add1,Toast.LENGTH_LONG).show();

    }
    public void div(View v)
    {
        EditText first= findViewById(R.id.num1);
        EditText Second= findViewById(R.id.num2);
        Button btn1=findViewById(R.id.div);
        String a=first.getText().toString();
        String b=Second.getText().toString();
        Integer val1=Integer.parseInt(a);
        Integer val2=Integer.parseInt(b);
        Integer add1=val1/val2;
        Toast.makeText(getApplicationContext(),"div ="+add1,Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}