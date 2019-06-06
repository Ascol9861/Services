package com.example.services;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnOne, btnTwo;
    NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.btnNotifyOne);
        btnTwo = findViewById(R.id.btnNotifyTwo);

        notificationManagerCompat = NotificationManagerCompat.from(this);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });
    }

    private void DisplayNotification(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Channel1")
                .setSmallIcon(R.drawable.ic_comment_black_24dp)
                .setContentTitle("First Message")
                .setContentText("This is first message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1, builder.build());
    }

    private void DisplayNotification2(){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "Channel2")
                .setSmallIcon(R.drawable.ic_comment_black_24dp)
                .setContentTitle("Second Message")
                .setContentText("This is second message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1, builder.build());
    }
}
