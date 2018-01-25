package com.sec.android.app.system.loopservice;

import android.content.Context;
import android.widget.Toast; 

public class displayToast implements Runnable {
    private final Context mContext;
    String mText;

    public displayToast(Context mContext, String text){
        this.mContext = mContext;
        mText = text;
    }

    public void run(){
        Toast.makeText(mContext, mText, Toast.LENGTH_LONG).show();
    }
}