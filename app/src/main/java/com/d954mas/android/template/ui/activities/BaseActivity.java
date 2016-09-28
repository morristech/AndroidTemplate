package com.d954mas.android.template.ui.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.d954mas.android.template.BaseApp;
import com.d954mas.android.template.developer_settings.iface.ViewContainer;

import javax.inject.Inject;

@SuppressWarnings("PMD.AbstractClassWithoutAnyMethod")
public abstract class BaseActivity extends AppCompatActivity {
    @Inject ViewContainer viewContainer;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseApp.get(this).getAppComponent().inject(this);
    }

    protected void setContentViewInContainer(@LayoutRes int layout) {
        LayoutInflater inflater = getLayoutInflater();
        ViewGroup container = viewContainer.forActivity(this);
        inflater.inflate(layout, container);
    }
}

