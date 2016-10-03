package com.d954mas.android.template.dagger.activity.modules;

import android.app.Activity;

import com.d954mas.android.template.dagger.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity
    Activity providesActivity() {
        return this.activity;
    }
}
