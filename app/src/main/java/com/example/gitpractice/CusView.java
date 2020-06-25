package com.example.gitpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class CusView extends View {
    public CusView(Context context) {
        this(context,null);
    }

    public CusView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);

    }

    public CusView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        base = new SpannableStringBuilder("好好学习，天天向上");
        dynamicLayout = new DynamicLayout(base, base, new TextPaint(), 1080,
                Layout.Alignment.ALIGN_NORMAL, 1.0f, 0, true);
    }

    DynamicLayout dynamicLayout;
    SpannableStringBuilder base;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Log.e("abc","hhhhhhhhhh-->"+dynamicLayout.getHeight());



        dynamicLayout.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        base.clear();
        base.append("good ood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydyood good stydygood stydy");
        postInvalidate();

        return super.onTouchEvent(event);
    }
}
