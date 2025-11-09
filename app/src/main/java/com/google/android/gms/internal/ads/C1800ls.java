package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

/* renamed from: com.google.android.gms.internal.ads.ls */
/* loaded from: classes2.dex */
public final class C1800ls implements InterfaceC1399av {

    /* renamed from: OooOo, reason: collision with root package name */
    public final kd0 f20941OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1722jo f20942OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final h20 f20943OooOo0o;

    public C1800ls(InterfaceC1722jo interfaceC1722jo, h20 h20Var, kd0 kd0Var) {
        this.f20942OooOo0O = interfaceC1722jo;
        this.f20943OooOo0o = h20Var;
        this.f20941OooOo = kd0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        InterfaceC1722jo interfaceC1722jo;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0)).booleanValue() || (interfaceC1722jo = this.f20942OooOo0O) == null) {
            return;
        }
        String str = true != zzac.zza(interfaceC1722jo.OooO0oO()) ? "0" : "1";
        C1548ey c1548eyOooO00o = this.f20943OooOo0o.OooO00o();
        c1548eyOooO00o.OooO0oO("action", "hcp");
        c1548eyOooO00o.OooO0oO("hcp", str);
        c1548eyOooO00o.OooOO0(this.f20941OooOo);
        c1548eyOooO00o.OooOOO0();
    }
}
