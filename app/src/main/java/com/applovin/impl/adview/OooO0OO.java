package com.applovin.impl.adview;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.C1301z1;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements View.OnTouchListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15610OooOo0O;

    public /* synthetic */ OooO0OO(int i) {
        this.f15610OooOo0O = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15610OooOo0O) {
            case 0:
                return C0967b.m254a(view, motionEvent);
            default:
                return C1301z1.m3831a(view, motionEvent);
        }
    }
}
