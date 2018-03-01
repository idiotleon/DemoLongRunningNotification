package com.leontheprofessional.demolongrunningnotification.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by leon on 2/28/18.
 */

public class ISLongRunning extends IntentService {

    private static final String TAG = ISLongRunning.class.getSimpleName();

    public ISLongRunning(){
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
    }
}
