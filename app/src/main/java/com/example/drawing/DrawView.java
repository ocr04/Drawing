package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    Paint p = new Paint();
    int y = 0, dY = 5;
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.argb(255, 25, 0, 100));
        canvas.drawCircle(200, 1100, 10.5f, p); //galaxy start
        canvas.drawCircle(0, 900, 10.5f, p);
        canvas.drawCircle(970, 1870, 10.5f, p);
        canvas.drawLine(0f, 900f, 970f,1870f, p);
        canvas.drawCircle(900, 400, 10.5f, p); //galaxy end
        canvas.drawCircle(900, 400, 10.5f, p);

        invalidate();
    }

    protected int[] getColor (int x, int y) {
        int [] toReturn = {0};
        return toReturn;
    }

    protected int getDistance (int x, int y) {
        if(x - y > -900) {
            return (int) Math.sqrt(Math.pow(200-x, 2) + Math.pow(900-y,2));
        }
        return 0;
    }
}
