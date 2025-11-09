package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class i40 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final p31 f19940OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1797lp f19941OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1984qr f19942OooO0OO;

    public i40(p31 p31Var, C1797lp c1797lp, C1984qr c1984qr) {
        this.f19940OooO00o = p31Var;
        this.f19941OooO0O0 = c1797lp;
        this.f19942OooO0OO = c1984qr;
    }

    @Override // com.google.android.gms.internal.ads.z31
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final h40 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f19940OooO00o.zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        C2163vl c2163vl2 = AbstractC2200wl.f25322OooO0O0;
        ii0.Oooo000(c2163vl2);
        Context contextOooO00o = this.f19941OooO0O0.f20919OooO0O0.OooO00o();
        ii0.Oooo000(c2163vl);
        return new h40(scheduledExecutorService, c2163vl, c2163vl2, new l40(contextOooO00o, c2163vl, 1), p31.OooO00o(new w31(this.f19942OooO0OO)));
    }
}
