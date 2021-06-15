package com.example.finalproject;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Clock extends AppCompatActivity {
    private NotificationManager mNotificationManager;
    private static final int NOTIFICATION_ID = 0;
    private static final String PRIMARY_CHANNEL_ID = "primary_channel_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        ToggleButton breakfastButton = findViewById(R.id.breakfastButton);


        Intent intentBreak = new Intent(this, BreakfastAlarm.class);


        final boolean alarmSetBreak = (PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentBreak, PendingIntent.FLAG_NO_CREATE) != null);
        breakfastButton.setChecked(alarmSetBreak);


        final PendingIntent pendingIntentBreak = PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentBreak, PendingIntent.FLAG_UPDATE_CURRENT);
        final AlarmManager alarmManagerBreak = (AlarmManager) getSystemService(ALARM_SERVICE);


        breakfastButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    if (alarmManagerBreak != null){
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.HOUR, 6);
                        calendar.set(Calendar.MINUTE, 30);
                        alarmManagerBreak.setExact( AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntentBreak);
                        Toast.makeText(Clock.this, R.string.toast_message, Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    if (alarmManagerBreak != null){
                        alarmManagerBreak.cancel(pendingIntentBreak);
                        mNotificationManager.cancelAll();
                    }
                }
            }
        });
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createNotificationChannel();

        ToggleButton lunchButton = findViewById(R.id.lunchButton);
        ToggleButton dinnerButton = findViewById(R.id.dinnerButton);
        Intent intentLunch = new Intent(this, LunchAlarm.class);
        Intent intentDinner = new Intent(this, DinnerAlarm.class);
        final boolean alarmSetLunch = (PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentLunch, PendingIntent.FLAG_NO_CREATE) != null);
        lunchButton.setChecked(alarmSetLunch);
        final boolean alarmSetDinner = (PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentDinner, PendingIntent.FLAG_NO_CREATE) != null);
        dinnerButton.setChecked(alarmSetDinner);
        final PendingIntent pendingIntentLunch = PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentLunch, PendingIntent.FLAG_UPDATE_CURRENT);
        final AlarmManager alarmManagerLunch = (AlarmManager) getSystemService(ALARM_SERVICE);
        final PendingIntent pendingIntentDinner = PendingIntent.getBroadcast(this, NOTIFICATION_ID, intentDinner, PendingIntent.FLAG_UPDATE_CURRENT);
        final AlarmManager alarmManagerDinner = (AlarmManager) getSystemService(ALARM_SERVICE);

        lunchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    if (alarmManagerLunch != null){
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.HOUR, 11);
                        calendar.set(Calendar.MINUTE, 30);
                        alarmManagerLunch.setExact( AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntentLunch);
                        Toast.makeText(Clock.this, R.string.toast_message, Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    if (alarmManagerLunch != null){
                        alarmManagerLunch.cancel(pendingIntentLunch);
                        mNotificationManager.cancelAll();
                    }
                }
            }
        });
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createNotificationChannel();


        dinnerButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    if (alarmManagerDinner != null){
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.HOUR, 17);
                        calendar.set(Calendar.MINUTE, 30);
                        alarmManagerDinner.setExact( AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntentDinner);
                        Toast.makeText(Clock.this, R.string.toast_message, Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    if (alarmManagerDinner != null){
                        alarmManagerDinner.cancel(pendingIntentDinner);
                        mNotificationManager.cancelAll();
                    }
                }
            }
        });
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID, getString(R.string.channel_name), NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor( Color.WHITE);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription(getString(R.string.channel_desc));
            mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

}