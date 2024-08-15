package com.ltrsoft.andromotapp.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class PercentageCircleView extends View {

    private int percentage = 0;
    private Paint circlePaint;
    private Paint textPaint;
    private RectF circleBounds;

    public PercentageCircleView(Context context) {
        super(context);
        init();
    }

    public PercentageCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PercentageCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Initialize paint objects
        circlePaint = new Paint();
        circlePaint.setColor(Color.BLUE);
        circlePaint.setStyle(Paint.Style.STROKE);
        circlePaint.setStrokeWidth(20);

        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(80);
        textPaint.setTextAlign(Paint.Align.CENTER);


        // Set up the bounding rectangle for the circle
        circleBounds = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Calculate the bounding rectangle for the circle based on the view's dimensions
//        circleBounds.set(0, 0, getWidth(), getHeight());

        int radius = Math.min(getWidth(), getHeight()) / 2;

        // Calculate the center of the view
        int centerX = getWidth() / 2;
        int centerY = (int) (getHeight() / 1.8);
        int centeryy = (int) (getHeight()/2.2);

        // Adjust the bounding rectangle for the circle to ensure it fits properly within the view
        circleBounds.set(centerX - radius, centerY - radius, centerX + radius, centeryy + radius);


        // Draw the circle
        canvas.drawArc(circleBounds, -90, percentage * 3.6f, false, circlePaint);

        // Draw the percentage text in the center of the view
        canvas.drawText(percentage + "%", getWidth() / 2f, getHeight() / 2f - ((textPaint.descent() + textPaint.ascent()) / 2), textPaint);
    }

    public void setPercentage(int percentage) {
        // Clamp the percentage value between 0 and 100
        this.percentage = Math.max(0, Math.min(100, percentage));
//        this.percentage = 100;
        // Redraw the view
        invalidate();
    }
}

