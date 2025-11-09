package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class gq0 extends wo0 implements Runnable {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final Runnable f19446OooOoo;

    public gq0(Runnable runnable) {
        runnable.getClass();
        this.f19446OooOoo = runnable;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        return OooO0oO.OooOo.OooOO0O("task=[", this.f19446OooOoo.toString(), C3034d9.i.f8179e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19446OooOoo.run();
        } catch (Throwable th) {
            OooO0oO(th);
            throw th;
        }
    }
}
