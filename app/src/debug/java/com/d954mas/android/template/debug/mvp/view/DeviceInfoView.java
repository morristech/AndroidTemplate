package com.d954mas.android.template.debug.mvp.view;


import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface DeviceInfoView extends MvpView {
    void setMake(String make);

    void setModel(String model);

    void setResolution(String resolution);

    void setDensity(String density);

    void setRelease(String release);

    void setApi(String api);
}
