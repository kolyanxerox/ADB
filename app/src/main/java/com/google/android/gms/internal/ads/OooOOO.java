package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;

/* loaded from: classes2.dex */
public final class OooOOO implements DisplayManager.DisplayListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final DisplayManager f16810OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16811OooO0O0;

    public OooOOO(OooOo00 oooOo00, DisplayManager displayManager) {
        this.f16811OooO0O0 = oooOo00;
        this.f16810OooO00o = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            OooOo00.OooO00o(this.f16811OooO0O0, this.f16810OooO00o.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
