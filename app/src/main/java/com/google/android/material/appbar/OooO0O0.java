package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f27308OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f27309OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f27310OooO0OO;

    public OooO0O0(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f27310OooO0OO = baseBehavior;
        this.f27308OooO00o = coordinatorLayout;
        this.f27309OooO0O0 = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f27310OooO0OO.OooOO0(this.f27308OooO00o, this.f27309OooO0O0, iIntValue);
    }
}
