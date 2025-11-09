package com.unity3d.ads.adplayer;

import android.view.MotionEvent;
import android.view.View;
import o00000O0.OooOOO0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements View.OnTouchListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28613OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f28614OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f28613OooOo0O = i;
        this.f28614OooOo0o = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f28613OooOo0O) {
            case 0:
                return AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) this.f28614OooOo0o, view, motionEvent);
            default:
                OooOOO0 oooOOO0 = (OooOOO0) this.f28614OooOo0o;
                oooOOO0.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - oooOOO0.OooOO0o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        oooOOO0.f29164OooOO0 = false;
                    }
                    oooOOO0.OooOo0();
                    oooOOO0.f29164OooOO0 = true;
                    oooOOO0.OooOO0o = System.currentTimeMillis();
                }
                return false;
        }
    }
}
