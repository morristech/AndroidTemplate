package com.d954mas.android.template;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpFacade;
import com.d954mas.android.template.dagger.singleton.components.AppComponent;
import com.frogermcs.androiddevmetrics.AndroidDevMetrics;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

@SuppressLint("Registered")
public abstract class BaseApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        MvpFacade.init();
        component = initAppComponent();
        component.devMetricsProxy().init();
        component.leakCanaryProxy().init();
        component.stethoProxy().init();
        component.blockCanaryProxy().init();
        AndroidDevMetrics.initWith(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
        Picasso picasso = component.picasso();
        picasso.setIndicatorsEnabled(BuildConfig.DEBUG);
        Picasso.setSingletonInstance(picasso);
    }

    @NonNull
    protected abstract AppComponent initAppComponent();

    // Prevent need in a singleton (global) reference to the application object.
    @NonNull
    public static BaseApp get(@NonNull Context context) {
        return (BaseApp) context.getApplicationContext();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return component;
    }

}
