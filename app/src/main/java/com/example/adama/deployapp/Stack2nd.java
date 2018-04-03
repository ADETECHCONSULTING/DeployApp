package com.example.adama.deployapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.appcenter.analytics.Analytics;

public class Stack2nd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack2nd);

        Analytics.trackEvent("Stack 2nd Activity works great");

    }
}
