package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lq0 extends sp0 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public o00000oO.OooOOO f20933OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ScheduledFuture f20934OooOooO;

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        o00000oO.OooOOO oooOOO = this.f20933OooOoo;
        ScheduledFuture scheduledFuture = this.f20934OooOooO;
        if (oooOOO == null) {
            return null;
        }
        String strOooOO0O = OooO0oO.OooOo.OooOO0O("inputFuture=[", oooOOO.toString(), C3034d9.i.f8179e);
        if (scheduledFuture == null) {
            return strOooOO0O;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strOooOO0O;
        }
        return strOooOO0O + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooO0o0() {
        OooOO0O(this.f20933OooOoo);
        ScheduledFuture scheduledFuture = this.f20934OooOooO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f20933OooOoo = null;
        this.f20934OooOooO = null;
    }
}
