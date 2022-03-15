package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class Shape extends View
{
    public int left;
    public int top;
    public int right;
    public int bottom;
    public int color;
    public int shape;

    Paint paint = new Paint();

    public Shape(Context context, int l, int t, int r, int b)
    {
        super(context);
        left = l;
        top = t;
        right = r;
        bottom = b;
    }

    @Override
    public void onDraw(Canvas canvas)
    {

        Random rand = new Random();
        color = rand.nextInt(5-1);
        Log.d("PAINT", "Num = " + color);
        switch (color)
        {
            case 0:
                paint.setColor(Color.GREEN);
                break;
            case 1:
                paint.setColor(Color.RED);
                break;
            case 2:
                paint.setColor(Color.BLUE);
                break;
            default:
                paint.setColor(Color.BLACK);
                break;
        }

        try
        {
            Random rand2 = new Random();
            shape = rand2.nextInt(5-1);
            Log.d("PAINT", "shape = " + color);
            switch (color)
            {
                case 0:
                    canvas.drawRect(left,top,right,bottom,paint);
                    break;
                case 1:
                    canvas.drawCircle(left,top,right,paint);
                    break;
                case 2:
                    canvas.drawArc(left,top,right,bottom,90,45,true,paint);
                    break;
                default:
                    canvas.drawRoundRect(left,top,right,bottom,20,20,paint);
                    break;
            }
        }
        catch(Exception e)
        {
            Log.d("PAINT", "Something has gone horribly wrong: " + e.getMessage());
        }
    }
}
