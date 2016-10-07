package com.d954mas.android.template.debug.mvp.presenter;


import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.codemonkeylabs.fpslibrary.TinyDancer;
import com.d954mas.android.template.debug.mvp.view.TinyDancerView;

@InjectViewState
public class TinyDancerPresenter extends MvpPresenter<TinyDancerView> {
    private boolean showTimeDancer = false;

    public void toggleTinyDancer(Context context, boolean isEnabled) {
        if (showTimeDancer == isEnabled) {
            return;
        }
        showTimeDancer = isEnabled;
        if (showTimeDancer) {
            TinyDancer.create().show(context);
        } else {
            try {
                TinyDancer.hide(context);
            } catch (NullPointerException e) {
                //pass
            }

        }
    }

    public boolean isShowTimeDancer() {
        return showTimeDancer;
    }
}
