package com.example.admin.durban_tour_guild_app;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Admin on 7/26/2017.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
