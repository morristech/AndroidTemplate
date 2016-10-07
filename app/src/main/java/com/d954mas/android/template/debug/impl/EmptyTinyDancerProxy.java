package com.d954mas.android.template.debug.impl;


import android.content.Context;

import com.d954mas.android.template.debug.iface.TinyDancerProxy;

public class EmptyTinyDancerProxy implements TinyDancerProxy {

    @Override public void showTinyDancer(Context context) {
        //pass
    }

    @Override public void hideTinyDancer(Context context) {
        //pass
    }
}
