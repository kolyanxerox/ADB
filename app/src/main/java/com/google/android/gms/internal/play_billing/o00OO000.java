package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class o00OO000 extends o00O00O implements Runnable, o00oOoo {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final Runnable f27062OooOoo;

    public o00OO000(Runnable runnable) {
        runnable.getClass();
        this.f27062OooOoo = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.o00O00O
    public final String OooO0O0() {
        return OooO0oO.OooOo.OooOO0O("task=[", this.f27062OooOoo.toString(), C3034d9.i.f8179e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f27062OooOoo.run();
        } catch (Throwable th) {
            OooO0Oo(th);
            throw th;
        }
    }
}
