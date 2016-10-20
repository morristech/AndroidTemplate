package com.d954mas.android.template.debug.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.d954mas.android.template.App;
import com.d954mas.android.template.R;
import com.d954mas.android.template.dagger.singleton.components.DaggerDebugAppComponent;
import com.d954mas.android.template.debug.iface.LynxProxy;

import javax.inject.Inject;

import butterknife.BindView;

//do not use mvp because logic is very simple
public class LynxDebugFragment extends BaseDebugFragment {
    @BindView(R.id.show_logs) Button showLogBtn;
    @Inject LynxProxy lynxProxy;

    @Nullable @Override public View onCreateView(LayoutInflater inflater,
                                                 @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.debug_fragment_lynx, container, false);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTitle("Logs");
        ((DaggerDebugAppComponent) App.get(getContext()).getAppComponent()).inject(this);
        showLogBtn.setOnClickListener(v -> lynxProxy.showLynx(getContext()));
    }
}
