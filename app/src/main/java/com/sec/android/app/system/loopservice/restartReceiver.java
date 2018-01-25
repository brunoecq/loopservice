package com.sec.android.app.system.loopservice;

import android.app.AlarmManager; 
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.Toast;

public class restartReceiver extends BroadcastReceiver {
    private AlarmManager alarmMgr;
    private PendingIntent alarmIntent;

    @Override
    public void onReceive(Context context, Intent intent) {

        //try
        //{
        //Toast.makeText(context,"THIS IS MY ALARM",Toast.LENGTH_LONG).show();
        if (intent != null) {
            if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
              //  Toast.makeText(context, "REINICIANDO ALARMA", Toast.LENGTH_LONG).show();

                Intent i = new Intent(context, bootService.class);
                ComponentName service = context.startService(i);

                if (null == service) {
                    // something really wrong here
                    //Log.e(TAG, "Could not start service ");
                }
                else {
                    //Log.e(TAG, "Successfully started service ");
                }
            }
        }
        //}
        //catch ( Exception e  )
        //{
        //Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        //}
    }
}
