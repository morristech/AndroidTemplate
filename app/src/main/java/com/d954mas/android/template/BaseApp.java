package com.d954mas.android.template;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.d954mas.android.template.dagger.components.AppComponent;
import com.frogermcs.androiddevmetrics.AndroidDevMetrics;

import timber.log.Timber;

public abstract class BaseApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = initAppComponent();
        Timber.plant(new Timber.DebugTree());
        component.devMetricsProxy().init();
        component.leakCanaryProxy().init();
        component.stethoProxy().init();
        component.blockCanaryProxy().init();
        AndroidDevMetrics.initWith(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

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
