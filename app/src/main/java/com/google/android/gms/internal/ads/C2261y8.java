package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.gms.internal.ads.y8 */
/* loaded from: classes2.dex */
public final class C2261y8 extends RelativeLayout {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final float[] f25863OooOo0o = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: OooOo0O, reason: collision with root package name */
    public AnimationDrawable f25864OooOo0O;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f25864OooOo0O;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
