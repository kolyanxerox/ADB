package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class d70 implements i60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC1837ms f18187OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final x60 f18188OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2163vl f18189OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C2098tu f18190OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final f20 f18191OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ScheduledExecutorService f18192OooO0o0;

    public d70(AbstractC1837ms abstractC1837ms, x60 x60Var, C2098tu c2098tu, ScheduledExecutorService scheduledExecutorService, C2163vl c2163vl, f20 f20Var) {
        this.f18187OooO00o = abstractC1837ms;
        this.f18188OooO0O0 = x60Var;
        this.f18190OooO0Oo = c2098tu;
        this.f18192OooO0o0 = scheduledExecutorService;
        this.f18189OooO0OO = c2163vl;
        this.f18191OooO0o = f20Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        InterfaceC2152va interfaceC2152vaOooO00o = ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).OooO00o();
        boolean zOooO00o = this.f18188OooO0O0.OooO00o(rd0Var, kd0Var);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000o0)).booleanValue()) {
            String str = interfaceC2152vaOooO00o != null ? "1" : "0";
            f20 f20Var = this.f18191OooO0o;
            f20Var.f18766OooO00o.put("has_dbl", str);
            f20Var.f18766OooO00o.put("crdb", true == zOooO00o ? "1" : "0");
        }
        return interfaceC2152vaOooO00o != null && zOooO00o;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        return this.f18189OooO0OO.OooO0O0(new CallableC1544eu(this, rd0Var, kd0Var, 3));
    }
}
