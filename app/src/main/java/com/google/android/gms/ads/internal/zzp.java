package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1663i1;

/* loaded from: classes2.dex */
final class zzp implements View.OnTouchListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzu f16344OooOo0O;

    public zzp(zzu zzuVar) {
        this.f16344OooOo0O = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1663i1 c1663i1 = this.f16344OooOo0O.f16359OooOoo;
        if (c1663i1 == null) {
            return false;
        }
        c1663i1.f19893OooO0O0.zzk(motionEvent);
        return false;
    }
}
