package com.d954mas.android.template.debug.iface;

import android.app.Activity;
import android.view.ViewGroup;

public interface ViewContainer {
    ViewGroup forActivity(Activity activity);

    void initDebugView(Activity activity);
}
