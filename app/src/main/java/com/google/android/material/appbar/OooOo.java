package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final View f27323OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f27324OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f27325OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f27326OooO0Oo;

    public OooOo(View view) {
        this.f27323OooO00o = view;
    }

    public final void OooO00o() {
        int i = this.f27326OooO0Oo;
        View view = this.f27323OooO00o;
        ViewCompat.offsetTopAndBottom(view, i - (view.getTop() - this.f27324OooO0O0));
        ViewCompat.offsetLeftAndRight(view, 0 - (view.getLeft() - this.f27325OooO0OO));
    }

    public final boolean OooO0O0(int i) {
        if (this.f27326OooO0Oo == i) {
            return false;
        }
        this.f27326OooO0Oo = i;
        OooO00o();
        return true;
    }
}
