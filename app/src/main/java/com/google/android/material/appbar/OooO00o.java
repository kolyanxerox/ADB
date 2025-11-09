package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000.OooOOO0 f27306OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f27307OooO0O0;

    public OooO00o(AppBarLayout appBarLayout, o000000.OooOOO0 oooOOO0) {
        this.f27307OooO0O0 = appBarLayout;
        this.f27306OooO00o = oooOOO0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f27306OooO00o.OooOO0o(fFloatValue);
        AppBarLayout appBarLayout = this.f27307OooO0O0;
        Drawable drawable = appBarLayout.f27246Oooo0o;
        if (drawable instanceof o000000.OooOOO0) {
            ((o000000.OooOOO0) drawable).OooOO0o(fFloatValue);
        }
        Iterator it = appBarLayout.f27245Oooo0OO.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
    }
}
