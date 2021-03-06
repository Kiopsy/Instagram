package com.example.instagram.utilities;

import android.app.Application;

import androidx.appcompat.app.ActionBar;

import com.example.instagram.R;
import com.example.instagram.models.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();


        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("453dDNHzmrTMzZEjXnk6QUAY7YxxLXmCbegvHpni")
                .clientKey("j8XvyDZ6Yw1wfTEt4D1ZLCh0nhruqwqb8edRCwbe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
