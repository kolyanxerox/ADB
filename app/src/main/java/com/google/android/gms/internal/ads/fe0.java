package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class fe0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final LinkedBlockingDeque f18935OooO00o = new LinkedBlockingDeque();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final x00 f18936OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2163vl f18937OooO0OO;

    public fe0(x00 x00Var, C2163vl c2163vl) {
        this.f18936OooO0O0 = x00Var;
        this.f18937OooO0OO = c2163vl;
    }

    public final synchronized o00000oO.OooOOO OooO00o() {
        OooO0O0(1);
        return (o00000oO.OooOOO) this.f18935OooO00o.poll();
    }

    public final synchronized void OooO0O0(int i) {
        int size = i - this.f18935OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f18935OooO00o.add(this.f18937OooO0OO.OooO0O0(this.f18936OooO0O0));
        }
    }
}
