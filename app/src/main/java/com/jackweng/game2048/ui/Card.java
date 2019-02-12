package com.jackweng.game2048.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

    private TextView lable;

    public Card(Context context) {
        super(context);
        lable = new TextView(getContext());
        lable.setTextSize(32);

        LayoutParams lp = new LayoutParams(-1, -1);
        addView(lable, lp);
        setNum(0);
    }

    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        lable.setText(num + "");
    }

    public boolean equals(Card o) {
        return getNum() == o.getNum();
    }
}
