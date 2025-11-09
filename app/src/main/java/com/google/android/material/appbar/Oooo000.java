package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;

/* loaded from: classes2.dex */
public abstract class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f27330OooO00o = {R.attr.stateListAnimator};

    public static void OooO00o(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(com.github.superadb.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.github.superadb.R.attr.state_liftable, -2130903987}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
