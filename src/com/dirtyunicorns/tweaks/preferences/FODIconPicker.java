/*
 * Copyright (C) 2020 The Evolution X Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dirtyunicorns.tweaks.preferences;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.android.settings.R;

import com.android.settingslib.Utils;
import com.android.settingslib.widget.LayoutPreference;

public class FODIconPicker extends LayoutPreference {

    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;

    private View mRootView;

    private static ImageButton Button0;
    private static ImageButton Button1;
    private static ImageButton Button2;
    private static ImageButton Button3;
    private static ImageButton Button4;
    private static ImageButton Button5;
    private static ImageButton Button6;
    private static ImageButton Button7;
    private static ImageButton Button8;
    private static ImageButton Button9;
    private static ImageButton Button10;
    private static ImageButton Button11;
    private static ImageButton Button12;
    private static ImageButton Button13;
    private static ImageButton Button14;
    private static ImageButton Button15;
    private static ImageButton Button16;
    private static ImageButton Button17;
    private static ImageButton Button18;
    private static ImageButton Button19;
    private static ImageButton Button20;
    private static ImageButton Button21;
    private static ImageButton Button22;
    private static ImageButton Button23;
    private static ImageButton Button24;
    private static ImageButton Button25;
    private static ImageButton Button26;
    private static ImageButton Button27;
    private static ImageButton Button28;
    private static ImageButton Button29;
    private static ImageButton Button30;
    private static ImageButton Button31;
    private static ImageButton Button32;
    private static ImageButton Button33;
    private static ImageButton Button34;
    private static ImageButton Button35;
    private static ImageButton Button36;
    private static ImageButton Button37;
    private static ImageButton Button38;
    private static ImageButton Button39;
    private static ImageButton Button40;
    private static ImageButton Button41;

    private static final String TAG = "FODIconPicker";

    public FODIconPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0 /* defStyleAttr */);
    }

    public FODIconPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Preference);
        mAllowDividerAbove = TypedArrayUtils.getBoolean(a, R.styleable.Preference_allowDividerAbove,
                R.styleable.Preference_allowDividerAbove, false);
        mAllowDividerBelow = TypedArrayUtils.getBoolean(a, R.styleable.Preference_allowDividerBelow,
                R.styleable.Preference_allowDividerBelow, false);
        a.recycle();

        a = context.obtainStyledAttributes(
                attrs, R.styleable.Preference, defStyleAttr, 0);
        int layoutResource = a.getResourceId(R.styleable.Preference_android_layout, 0);
        if (layoutResource == 0) {
            throw new IllegalArgumentException("LayoutPreference requires a layout to be defined");
        }
        a.recycle();

        // Need to create view now so that findViewById can be called immediately.
        final View view = LayoutInflater.from(getContext())
                .inflate(layoutResource, null, false);
        setView(view, context);
    }

    private void setView(View view, Context context) {
        setLayoutResource(R.layout.layout_preference_frame);
        mRootView = view;
        setShouldDisableView(false);
        Button0 = findViewById(R.id.fodicon0_button);
        Button1 = findViewById(R.id.fodicon1_button);
        Button2 = findViewById(R.id.fodicon2_button);
        Button3 = findViewById(R.id.fodicon3_button);
        Button4 = findViewById(R.id.fodicon4_button);
        Button5 = findViewById(R.id.fodicon5_button);
        Button6 = findViewById(R.id.fodicon6_button);
        Button7 = findViewById(R.id.fodicon7_button);
        Button8 = findViewById(R.id.fodicon8_button);
        Button9 = findViewById(R.id.fodicon9_button);
        Button10 = findViewById(R.id.fodicon10_button);
        Button11 = findViewById(R.id.fodicon11_button);
        Button12 = findViewById(R.id.fodicon12_button);
        Button13 = findViewById(R.id.fodicon13_button);
        Button14 = findViewById(R.id.fodicon14_button);
        Button15 = findViewById(R.id.fodicon15_button);
        Button16 = findViewById(R.id.fodicon16_button);
        Button17 = findViewById(R.id.fodicon17_button);
        Button18 = findViewById(R.id.fodicon18_button);
        Button19 = findViewById(R.id.fodicon19_button);
        Button20 = findViewById(R.id.fodicon20_button);
        Button21 = findViewById(R.id.fodicon21_button);
        Button22 = findViewById(R.id.fodicon22_button);
        Button23 = findViewById(R.id.fodicon23_button);
        Button24 = findViewById(R.id.fodiconunfunny_button);
        Button25 = findViewById(R.id.fodiconspiral_button);
        Button26 = findViewById(R.id.fodicon26_button);
        Button27 = findViewById(R.id.fodicon27_button);
        Button28 = findViewById(R.id.fodicon28_button);
        Button29 = findViewById(R.id.fodicon29_button);
        Button30 = findViewById(R.id.fodicon30_button);
        Button31 = findViewById(R.id.fodicon31_button);
        Button32 = findViewById(R.id.fodicon32_button);
        Button33 = findViewById(R.id.fodicon33_button);
        Button34 = findViewById(R.id.fodicon34_button);
        Button35 = findViewById(R.id.fodicon35_button);
        Button36 = findViewById(R.id.fodicon36_button);
        Button37 = findViewById(R.id.fodicon37_button);
        Button38 = findViewById(R.id.fodicon38_button);
        Button39 = findViewById(R.id.fodicon39_button);
        Button40 = findViewById(R.id.fodicon40_button);
        Button41 = findViewById(R.id.fodicon41_button);

        int defaultfodicon = Settings.System.getInt(
                context.getContentResolver(), Settings.System.FOD_ICON, 0);
        if (defaultfodicon==0) {
            updateHighlightedItem(Button0, context);
        } else if (defaultfodicon==1) {
            updateHighlightedItem(Button1, context);
        } else if (defaultfodicon==2) {
            updateHighlightedItem(Button2, context);
        } else if (defaultfodicon==3) {
            updateHighlightedItem(Button3, context);
        } else if (defaultfodicon==4) {
            updateHighlightedItem(Button4, context);
        } else if (defaultfodicon == 5) {
            updateHighlightedItem(Button5, context);
        } else if (defaultfodicon == 6) {
            updateHighlightedItem(Button6, context);
        } else if (defaultfodicon == 7) {
            updateHighlightedItem(Button7, context);
        } else if (defaultfodicon == 8) {
            updateHighlightedItem(Button8, context);
        } else if (defaultfodicon == 9) {
            updateHighlightedItem(Button9, context);
        } else if (defaultfodicon == 10) {
            updateHighlightedItem(Button10, context);
        } else if (defaultfodicon == 11) {
            updateHighlightedItem(Button11, context);
        } else if (defaultfodicon == 12) {
            updateHighlightedItem(Button12, context);
        } else if (defaultfodicon == 13) {
            updateHighlightedItem(Button13, context);
        } else if (defaultfodicon == 14) {
            updateHighlightedItem(Button14, context);
        } else if (defaultfodicon == 15) {
            updateHighlightedItem(Button15, context);
        } else if (defaultfodicon == 16) {
            updateHighlightedItem(Button16, context);
        } else if (defaultfodicon == 17) {
            updateHighlightedItem(Button17, context);
        } else if (defaultfodicon == 18) {
            updateHighlightedItem(Button18, context);
        } else if (defaultfodicon == 19) {
            updateHighlightedItem(Button19, context);
        } else if (defaultfodicon == 20) {
            updateHighlightedItem(Button20, context);
        } else if (defaultfodicon == 21) {
            updateHighlightedItem(Button21, context);
        } else if (defaultfodicon == 22) {
            updateHighlightedItem(Button22, context);
        } else if (defaultfodicon == 23) {
            updateHighlightedItem(Button23, context);
        } else if (defaultfodicon == 24) {
            updateHighlightedItem(Button24, context);
        } else if (defaultfodicon == 25) {
            updateHighlightedItem(Button25, context);
        } else if (defaultfodicon == 26) {
            updateHighlightedItem(Button26, context);
        } else if (defaultfodicon == 27) {
            updateHighlightedItem(Button27, context);
        } else if (defaultfodicon == 28) {
            updateHighlightedItem(Button28, context);
        } else if (defaultfodicon == 29) {
            updateHighlightedItem(Button29, context);
        } else if (defaultfodicon == 30) {
            updateHighlightedItem(Button30, context);
        } else if (defaultfodicon == 31) {
            updateHighlightedItem(Button31, context);
        } else if (defaultfodicon == 32) {
            updateHighlightedItem(Button32, context);
        } else if (defaultfodicon == 33) {
            updateHighlightedItem(Button33, context);
        } else if (defaultfodicon == 34) {
            updateHighlightedItem(Button34, context);
        } else if (defaultfodicon == 35) {
            updateHighlightedItem(Button35, context);
        } else if (defaultfodicon == 36) {
            updateHighlightedItem(Button36, context);
        } else if (defaultfodicon == 37) {
            updateHighlightedItem(Button37, context);
        } else if (defaultfodicon == 38) {
            updateHighlightedItem(Button38, context);
        } else if (defaultfodicon == 39) {
            updateHighlightedItem(Button39, context);
        } else if (defaultfodicon == 40) {
            updateHighlightedItem(Button40, context);
        } else if (defaultfodicon == 41) {
            updateHighlightedItem(Button41, context);
        }


        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(0, context);
                updateHighlightedItem(Button0, context);
            }
        });
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(1, context);
                updateHighlightedItem(Button1, context);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(2, context);
                updateHighlightedItem(Button2, context);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(3, context);
                updateHighlightedItem(Button3, context);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(4, context);
                updateHighlightedItem(Button4, context);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(5, context);
                updateHighlightedItem(Button5, context);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(6, context);
                updateHighlightedItem(Button6, context);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(7, context);
                updateHighlightedItem(Button7, context);
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(8, context);
                updateHighlightedItem(Button8, context);
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(9, context);
                updateHighlightedItem(Button9, context);
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(10, context);
                updateHighlightedItem(Button10, context);
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(11, context);
                updateHighlightedItem(Button11, context);
            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(12, context);
                updateHighlightedItem(Button12, context);
            }
        });
        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(13, context);
                updateHighlightedItem(Button13, context);
            }
        });
        Button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(14, context);
                updateHighlightedItem(Button14, context);
            }
        });
        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(15, context);
                updateHighlightedItem(Button15, context);
            }
        });
        Button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(16, context);
                updateHighlightedItem(Button16, context);
            }
        });
        Button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(17, context);
                updateHighlightedItem(Button17, context);
            }
        });
        Button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(18, context);
                updateHighlightedItem(Button18, context);
            }
        });
        Button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(19, context);
                updateHighlightedItem(Button19, context);
            }
        });
        Button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(20, context);
                updateHighlightedItem(Button20, context);
            }
        });
        Button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(21, context);
                updateHighlightedItem(Button21, context);
            }
        });
        Button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(22, context);
                updateHighlightedItem(Button22, context);
            }
        });
        Button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(23, context);
                updateHighlightedItem(Button23, context);
            }
        });
        Button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(24, context);
                updateHighlightedItem(Button24, context);
            }
        });
        Button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(25, context);
                updateHighlightedItem(Button25, context);
            }
        });
        Button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(26, context);
                updateHighlightedItem(Button26, context);
            }
        });
        Button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(27, context);
                updateHighlightedItem(Button27, context);
            }
        });
        Button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(28, context);
                updateHighlightedItem(Button28, context);
            }
        });
        Button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(29, context);
                updateHighlightedItem(Button29, context);
            }
        });
        Button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(30, context);
                updateHighlightedItem(Button30, context);
            }
        });
        Button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(31, context);
                updateHighlightedItem(Button31, context);
            }
        });
        Button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(32, context);
                updateHighlightedItem(Button32, context);
            }
        });
        Button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(33, context);
                updateHighlightedItem(Button33, context);
            }
        });
        Button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(34, context);
                updateHighlightedItem(Button34, context);
            }
        });
        Button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(35, context);
                updateHighlightedItem(Button35, context);
            }
        });
        Button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(36, context);
                updateHighlightedItem(Button36, context);
            }
        });
        Button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(37, context);
                updateHighlightedItem(Button37, context);
            }
        });
        Button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(38, context);
                updateHighlightedItem(Button38, context);
            }
        });
        Button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(39, context);
                updateHighlightedItem(Button39, context);
            }
        });
        Button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(40, context);
                updateHighlightedItem(Button40, context);
            }
        });
        Button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSettings(41, context);
                updateHighlightedItem(Button41, context);
            }
        });

    }
 
    private void updateSettings(int fodicon, Context context) {
        Settings.System.putInt(context.getContentResolver(), Settings.System.FOD_ICON, fodicon);
    }

    private void updateHighlightedItem(ImageButton activebutton, Context context) {
        int defaultcolor = context.getResources().getColor(R.color.fod_item_background_stroke_color);
        ColorStateList defaulttint = ColorStateList.valueOf(defaultcolor);
        Button0.setBackgroundTintList(defaulttint);
        Button1.setBackgroundTintList(defaulttint);
        Button2.setBackgroundTintList(defaulttint);
        Button3.setBackgroundTintList(defaulttint);
        Button4.setBackgroundTintList(defaulttint);
        Button5.setBackgroundTintList(defaulttint);
        Button6.setBackgroundTintList(defaulttint);
        Button7.setBackgroundTintList(defaulttint);
        Button8.setBackgroundTintList(defaulttint);
        Button9.setBackgroundTintList(defaulttint);
        Button10.setBackgroundTintList(defaulttint);
        Button11.setBackgroundTintList(defaulttint);
        Button12.setBackgroundTintList(defaulttint);
        Button13.setBackgroundTintList(defaulttint);
        Button14.setBackgroundTintList(defaulttint);
        Button15.setBackgroundTintList(defaulttint);
        Button16.setBackgroundTintList(defaulttint);
        Button17.setBackgroundTintList(defaulttint);
        Button18.setBackgroundTintList(defaulttint);
        Button19.setBackgroundTintList(defaulttint);
        Button20.setBackgroundTintList(defaulttint);
        Button21.setBackgroundTintList(defaulttint);
        Button22.setBackgroundTintList(defaulttint);
        Button23.setBackgroundTintList(defaulttint);
        Button24.setBackgroundTintList(defaulttint);
        Button25.setBackgroundTintList(defaulttint);
        Button26.setBackgroundTintList(defaulttint);
        Button27.setBackgroundTintList(defaulttint);
        Button28.setBackgroundTintList(defaulttint);
        Button29.setBackgroundTintList(defaulttint);
        Button30.setBackgroundTintList(defaulttint);
        Button31.setBackgroundTintList(defaulttint);
        Button32.setBackgroundTintList(defaulttint);
        Button33.setBackgroundTintList(defaulttint);
        Button34.setBackgroundTintList(defaulttint);
        Button35.setBackgroundTintList(defaulttint);
        Button36.setBackgroundTintList(defaulttint);
        Button38.setBackgroundTintList(defaulttint);
        Button39.setBackgroundTintList(defaulttint);
        Button40.setBackgroundTintList(defaulttint);
        Button41.setBackgroundTintList(defaulttint);
        activebutton.setBackgroundTintList(Utils.getColorAttr(getContext(), android.R.attr.colorAccent));
    }
}
