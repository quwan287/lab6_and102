package fpl.quangnm.lab1.demo6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import fpl.quangnm.lab1.R;

public class Demo6Activity extends AppCompatActivity {
    Button btn_demo61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo6);
        btn_demo61 = findViewById(R.id.btn_demo61);
        btn_demo61.setOnClickListener(view -> {
            senNotification();
        });
    }
    @SuppressLint("MissingPermission")
    private void senNotification(){
        NotificationCompat.Builder builder= new NotificationCompat.Builder(this,App.CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Thong bao")
                .setContentText("Thong bao cu the")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,builder.build());
    }
}