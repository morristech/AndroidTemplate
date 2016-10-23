package com.d954mas.android.template.utils;


import android.os.Looper;

public class UICallback<T> {
    public void onResponse(T response) {
        isUI();
    }

    private void isUI() {
        if (Looper.myLooper() != Looper.getMainLooper())
            throw new RuntimeException("UICallback should only work on ui thread");
    }

    public void onFail(Throwable t) {
        isUI();
    }
}
