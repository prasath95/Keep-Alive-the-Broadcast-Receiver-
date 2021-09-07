package com.pms.keepRunning;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    public static final String TAG = "MyReceiver";


    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        Toast.makeText(context.getApplicationContext(), "%%%"+action, Toast.LENGTH_SHORT).show();

        }

}
