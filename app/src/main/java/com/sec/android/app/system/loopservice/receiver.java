package com.sec.android.app.system.loopservice;

 
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        try
        {
        //Toast.makeText(context,"THIS IS MY ALARM",Toast.LENGTH_LONG).show();

        //Toast.makeText(context,"ALARM RECEIVER",Toast.LENGTH_LONG).show()
        Intent i = new Intent(context, MainService.class);
        context.startService(i);

        }
        catch ( Exception e  )
        {
        //Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
