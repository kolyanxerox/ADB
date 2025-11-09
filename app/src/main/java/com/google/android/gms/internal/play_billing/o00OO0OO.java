package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00OO0OO extends o00O0 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public oo0o0O0 f27065OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public ScheduledFuture f27066OooOooO;

    @Override // com.google.android.gms.internal.play_billing.o00O00O
    public final String OooO0O0() {
        oo0o0O0 oo0o0o0 = this.f27065OooOoo;
        ScheduledFuture scheduledFuture = this.f27066OooOooO;
        if (oo0o0o0 == null) {
            return null;
        }
        String strOooOO0O = OooO0oO.OooOo.OooOO0O("inputFuture=[", oo0o0o0.toString(), C3034d9.i.f8179e);
        if (scheduledFuture == null) {
            return strOooOO0O;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strOooOO0O;
        }
        return strOooOO0O + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.o00O00O
    public final void OooO0OO() {
        oo0o0O0 oo0o0o0 = this.f27065OooOoo;
        if ((oo0o0o0 != null) & (this.f27054OooOo0O instanceof o000O)) {
            Object obj = this.f27054OooOo0O;
            oo0o0o0.cancel((obj instanceof o000O) && ((o000O) obj).f26996OooO00o);
        }
        ScheduledFuture scheduledFuture = this.f27066OooOooO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f27065OooOoo = null;
        this.f27066OooOooO = null;
    }
}
