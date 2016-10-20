package com.d954mas.android.template.ui.activities;

import android.content.Context;
import android.os.Bundle;

import com.d954mas.android.template.BaseApp;
import com.d954mas.android.template.R;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class MainActivity extends BaseActivity {
    @Inject Context application;
    @Inject OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentViewInContainer(R.layout.activity_main);
        BaseApp.get(this).getAppComponent().inject(this);
    }
}