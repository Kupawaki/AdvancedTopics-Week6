package com.example.drawing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText leftTF = findViewById(R.id.leftTF);
        EditText topTF = findViewById(R.id.topTF);
        EditText rightTF = findViewById(R.id.rightTF);
        EditText bottomTF = findViewById(R.id.bottomTF);
        Button drawBTN = findViewById(R.id.drawBTN);

        drawBTN.setOnClickListener(view ->
        {
            ConstraintLayout cl = findViewById(R.id.mainCL);
            cl.addView(new Shape(MainActivity.this,
                    Integer.parseInt(String.valueOf(leftTF.getText())),
                    Integer.parseInt(String.valueOf(topTF.getText())),
                    Integer.parseInt(String.valueOf(rightTF.getText())),
                    Integer.parseInt(String.valueOf(bottomTF.getText()))));
        });
    }

}