package com.example.gitpractice;

import android.content.Context;
import android.text.style.ImageSpan;

import androidx.annotation.NonNull;

public class CusSpan extends ImageSpan {

    public CusSpan(@NonNull Context context, int resourceId) {
        super(context, resourceId);
    }

}
