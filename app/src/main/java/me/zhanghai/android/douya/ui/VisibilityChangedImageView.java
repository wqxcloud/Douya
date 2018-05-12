/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.ui;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class VisibilityChangedImageView extends AppCompatImageView {

    public VisibilityChangedImageView(Context context) {
        super(context);
    }

    public VisibilityChangedImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VisibilityChangedImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            onVisibilityAggregated(visibility == VISIBLE);
        }
    }
}
