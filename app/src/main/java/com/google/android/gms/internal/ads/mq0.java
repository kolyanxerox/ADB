package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class mq0 extends aq0 {

    /* renamed from: OooOo */
    public final /* synthetic */ int f21335OooOo = 0;

    /* renamed from: OooOoO */
    public final Object f21336OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ nq0 f21337OooOoO0;

    public mq0(nq0 nq0Var, kp0 kp0Var) {
        this.f21337OooOoO0 = nq0Var;
        this.f21336OooOoO = kp0Var;
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final Object OooO00o() {
        switch (this.f21335OooOo) {
            case 0:
                kp0 kp0Var = (kp0) this.f21336OooOoO;
                o00000oO.OooOOO oooOOOMo13700zza = kp0Var.mo13700zza();
                if (oooOOOMo13700zza != null) {
                    return oooOOOMo13700zza;
                }
                throw new NullPointerException(xh0.Oooo0("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", kp0Var));
            default:
                return ((Callable) this.f21336OooOoO).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final String OooO0O0() {
        switch (this.f21335OooOo) {
            case 0:
                return ((kp0) this.f21336OooOoO).toString();
            default:
                return ((Callable) this.f21336OooOoO).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final void OooO0o(Object obj) {
        switch (this.f21335OooOo) {
            case 0:
                this.f21337OooOoO0.OooOO0o((o00000oO.OooOOO) obj);
                break;
            default:
                this.f21337OooOoO0.OooO0o(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final void OooO0o0(Throwable th) {
        switch (this.f21335OooOo) {
            case 0:
                this.f21337OooOoO0.OooO0oO(th);
                break;
            default:
                this.f21337OooOoO0.OooO0oO(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.aq0
    public final boolean OooO0oO() {
        switch (this.f21335OooOo) {
        }
        return this.f21337OooOoO0.isDone();
    }

    public mq0(nq0 nq0Var, Callable callable) {
        this.f21337OooOoO0 = nq0Var;
        callable.getClass();
        this.f21336OooOoO = callable;
    }
}
