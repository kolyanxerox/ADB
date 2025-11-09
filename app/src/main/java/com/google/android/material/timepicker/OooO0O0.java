package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class OooO0O0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f27974OooOo0O;

    public OooO0O0(ClockFaceView clockFaceView) {
        this.f27974OooOo0O = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f27974OooOo0O;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f27949OooOoO0.f27964OooOo0o) - clockFaceView.f27956Oooo000;
        if (height != clockFaceView.f27981OooOo0o) {
            clockFaceView.f27981OooOo0o = height;
            clockFaceView.OooO00o();
            int i = clockFaceView.f27981OooOo0o;
            ClockHandView clockHandView = clockFaceView.f27949OooOoO0;
            clockHandView.f27971OooOooo = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
