package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class Shape extends View
{
    public int left;
    public int top;
    public int right;
    public int bottom;

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
        paint.setColor(Color.BLACK);
        Rect rect = new Rect(left, top, right, bottom);

        try
        {
            canvas.drawRect(rect, paint);
        }
        catch(Exception e)
        {
            Log.d("PAINT", "Something has gone horribly wrong: " + e.getMessage());
        }
    }
}
