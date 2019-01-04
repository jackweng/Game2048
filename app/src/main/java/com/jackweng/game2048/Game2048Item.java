package com.jackweng.game2048;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.util.Log;

public class Game2048Item extends View {

    private Context mContext;
    private int mNumber;
    private Paint mPaint;

    public Game2048Item(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        mPaint = new Paint();
    }

    public void setNumber(int num) {
        mNumber = num;
    }

    public int getNumber() {
        return mNumber;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int bgColor = mContext.getResources().getColor(R.color.color_0);
        switch (mNumber) {
            case 0:
                bgColor = mContext.getResources().getColor(R.color.color_0);
                break;
            case 2:
                bgColor = mContext.getResources().getColor(R.color.color_2);
                break;
            case 4:
                bgColor = mContext.getResources().getColor(R.color.color_4);
                break;
            case 8:
                bgColor = mContext.getResources().getColor(R.color.color_8);
                break;
            case 16:
                bgColor = mContext.getResources().getColor(R.color.color_16);
                break;
            case 32:
                bgColor = mContext.getResources().getColor(R.color.color_32);
                break;
            case 64:
                bgColor = mContext.getResources().getColor(R.color.color_64);
                break;
            case 128:
                bgColor = mContext.getResources().getColor(R.color.color_128);
                break;
            case 256:
                bgColor = mContext.getResources().getColor(R.color.color_256);
                break;
            case 512:
                bgColor = mContext.getResources().getColor(R.color.color_512);
                break;
            case 1024:
                bgColor = mContext.getResources().getColor(R.color.color_1024);
                break;
            case 2048:
                bgColor = mContext.getResources().getColor(R.color.color_2048);
                break;
            case 4096:
                bgColor = mContext.getResources().getColor(R.color.color_4096);
                break;
            default:
                bgColor = mContext.getResources().getColor(R.color.color_0);
                break;
        }
        mPaint.setColor(bgColor);
    }
}