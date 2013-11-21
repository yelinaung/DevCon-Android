package org.devcon.android.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Ye Lin Aung on 13/11/15.
 */
public class RobotoLightTV extends TextView {
    public RobotoLightTV(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        createFont();
    }

    public RobotoLightTV(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public RobotoLightTV(Context context) {
        super(context);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Light.ttf");
        setTypeface(font);
    }
}
