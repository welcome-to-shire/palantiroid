package shire.bcho.palantiroid.notification;

import android.util.Log;

import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

import shire.bcho.palantiroid.notification.NotificationService;

/**
 * Boot up notification check service.
 */
public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (! NotificationService.isServiceCreated()) {
            Intent serviceIntent = new Intent(context, NotificationService.class);
            context.startService(serviceIntent);
        }
        Toast.makeText(context, "Service started...", Toast.LENGTH_LONG).show();
    }
}
