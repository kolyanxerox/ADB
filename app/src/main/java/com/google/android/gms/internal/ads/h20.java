package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h20 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final k20 f19525OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final cq0 f19526OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f19527OooO0OO;

    public h20(k20 k20Var, cq0 cq0Var) {
        this.f19525OooO00o = k20Var;
        k20Var.getClass();
        this.f19527OooO0OO = new HashMap(k20Var.f20416OooO00o);
        this.f19526OooO0O0 = cq0Var;
    }

    public final C1548ey OooO00o() {
        C1548ey c1548ey = new C1548ey(this);
        ((ConcurrentHashMap) c1548ey.f18708OooOo0o).putAll(this.f19527OooO0OO);
        return c1548ey;
    }

    public final void OooO0O0() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0oO)).booleanValue()) {
            C1548ey c1548eyOooO00o = OooO00o();
            c1548eyOooO00o.OooO0oO("action", "pecr");
            c1548eyOooO00o.OooOOO0();
        }
    }
}
