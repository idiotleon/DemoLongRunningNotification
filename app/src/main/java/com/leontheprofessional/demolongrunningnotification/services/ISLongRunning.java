package com.leontheprofessional.demolongrunningnotification.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.leontheprofessional.demolongrunningnotification.R;

/**
 * Created by leon on 2/28/18.
 */

public class ISLongRunning extends IntentService {

    private static final String TAG = ISLongRunning.class.getSimpleName();

    private static final String CHANNEL_ID = "long_running_notification";

    public ISLongRunning() {
        super("Long Running Notification");
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public ISLongRunning(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.v(TAG, "onHandleIntent() got called");

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_info_black_24px)
                .setContentTitle("Notification Title")
                .setContentText("Notification Content Text")
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("Much longer text that cannot fit one line..."))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
    }
}
