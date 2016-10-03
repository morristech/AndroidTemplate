package com.d954mas.android.template.dagger.activity.components;

import android.app.Activity;

import com.d954mas.android.template.dagger.PerActivity;
import com.d954mas.android.template.dagger.activity.modules.ActivityModule;
import com.d954mas.android.template.dagger.singleton.components.AppComponent;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
interface ActivityComponent {
    //Exposed to sub-graphs.
    Activity activity();
}