package fpl.quangnm.lab1.demo6;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import fpl.quangnm.lab1.R;

public class ForcegroundService extends Service {
    @SuppressLint("ForegroundServiceType")
    @Override
    public void onCreate() {
        super.onCreate();
    }
    @SuppressLint({"ForegroundServiceType", "MissingPermission"})
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent notificationIntent=new
                Intent(this,Demo62Activity.class);
        PendingIntent pendingIntent
                =PendingIntent.getActivity(this,0,
                notificationIntent, PendingIntent.FLAG_IMMUTABLE);
        Notification notification=new
                NotificationCompat.Builder(this,App.CHANNEL_ID)
                .setContentTitle("Service thong bao")
                .setContentText("Noi dung can thong bao cua service")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentIntent(pendingIntent)
                .build();
        //startForeground(1,notification);
        NotificationManagerCompat notificationManager=
                NotificationManagerCompat.from(this);

        notificationManager.notify(1,notification);
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
