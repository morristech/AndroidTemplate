package com.d954mas.android.template.developer_settings.developer_settings;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Button;

import com.codemonkeylabs.fpslibrary.TinyDancer;
import com.d954mas.android.template.R;
import com.d954mas.android.template.developer_settings.iface.ViewContainer;
import com.jakewharton.scalpel.ScalpelFrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewContainerImpl implements ViewContainer {
    private boolean scalpel = false;

    @Override
    public ViewGroup forActivity(Activity activity) {
        activity.setContentView(R.layout.debug_activity_frame);
        final ViewHolder viewHolder = new ViewHolder();
        ButterKnife.bind(viewHolder, activity);
        viewHolder.getScalpelButton().setOnClickListener(view -> {
            scalpel = !scalpel;
            viewHolder.getContent().setLayerInteractionEnabled(scalpel);
        });
        viewHolder.getTinyDancerButton().setOnClickListener(view -> {
            TinyDancer.create().show(activity);
        });
        return viewHolder.content;
    }

    static class ViewHolder {
        @BindView(R.id.debug_content) ScalpelFrameLayout content;
        @BindView(R.id.scalpel_button) Button scalpelButton;
        @BindView(R.id.tiny_dancer_button) Button tinyDancerButton;

        public ScalpelFrameLayout getContent() {
            return content;
        }

        public Button getTinyDancerButton() {
            return tinyDancerButton;
        }

        public Button getScalpelButton() {
            return scalpelButton;
        }
    }

}
