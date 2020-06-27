package com.example.gitpractice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DynamicLayout dynamicLayout;
    SpannableStringBuilder base;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //11111111111
        //2222222222
        //3333333333
        //6666666
        ///4444444444
        ///55555555
        char ch=' ';
        char ch1='a';
        int i='\t';
        if(ch==' ')
        {
            Log.e("abc",i+"111111");
        }

        if(ch1=='a')
        {
            Log.e("abc","222222");
        }
//        Log.e("abc","a"+ch);
//        Log.e("abc","b"+ch1);

        base = new SpannableStringBuilder("好好学习，天天向上");
        dynamicLayout = new DynamicLayout(base, base, new TextPaint(), 1080,
                Layout.Alignment.ALIGN_NORMAL, 1.0f, 0, true);


        final TextView tv=findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                float aa=tv.getLineSpacingExtra();
//                float bb=tv.getLineSpacingMultiplier();
//
//                Log.e("aa","aa:"+aa);
//                Log.e("aa","bb:"+bb);

                int firstHeight = dynamicLayout.getHeight();
                base.clear();
                base.append("good good std good study,day day upd good study,day day upd good study,day day upd good study,day day upudy,day day up");
                int secondHeight = dynamicLayout.getHeight();

                Log.e("abc",secondHeight+"");
            }
        });


    }

    private void test() {
        System.out.println("111111");
        System.out.println("222222");
        System.out.println("333333");
        System.out.println("soft soft");
        System.out.println("soft");
        System.out.println("53分支第一次提交");
    }
}
