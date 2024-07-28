package fpl.quangnm.lab1.demo6;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BackgroubService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //mo trang web goole.com
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/"));
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent1);
                stopSelf();
            }
        },5000);
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Stop Service",
                Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
