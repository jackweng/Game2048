package com.jackweng.game2048.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {
    public GameView(Context context) {
        super(context);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initGameView();
    }

    private void initGameView() {
        setColumnCount(4);
        setOnTouchListener(new OnTouchListener() {
            //记录起始位置和偏移坐标
            private float startX, startY, offsetX, offsetY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: //监听手指按下的初始位置坐标
                        startX = event.getX();
                        startY = event.getY();
                        break;

                    case MotionEvent.ACTION_UP: //监听手指离开时的位置坐标
                        offsetX = event.getX() - startX;
                        offsetY = event.getY() - startY;

                        if (Math.abs(offsetX) > Math.abs(offsetY)) {
                            if (offsetX < -5) {
                                System.out.println("left");
                            } else if (offsetX > 5) {
                                System.out.println("right");
                            }
                        } else {
                            if (offsetY < -5) {
                                System.out.println("up");
                            } else if (offsetY > 5) {
                                System.out.println("down");
                            }
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int cardWidth = (Math.min(w, h) - 10) / 4;
        addCards(cardWidth, cardWidth);
    }

    private void addCards(int cardWith, int cardHeight){
        Card c;
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                c=new Card(getContext());
                c.setNum(2);
                addView(c, cardWith, cardHeight);
            }
        }
    }
}
