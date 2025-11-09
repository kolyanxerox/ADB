package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.qb */
/* loaded from: classes2.dex */
public final class C1968qb implements vp0, InterfaceC1466cp {

    /* renamed from: OooOo0O */
    public final /* synthetic */ InterfaceC1722jo f23565OooOo0O;

    public C1968qb(InterfaceC1722jo interfaceC1722jo) {
        this.f23565OooOo0O = interfaceC1722jo;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzv.zzp().OooO0oo("DefaultGmsgHandlers.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public /* bridge */ /* synthetic */ void mo13705zzb(Object obj) {
        String str = (String) obj;
        InterfaceC1722jo interfaceC1722jo = this.f23565OooOo0O;
        new zzbw(interfaceC1722jo.getContext(), interfaceC1722jo.zzn().afmaVersion, str, null, interfaceC1722jo.OooO0OO() != null ? interfaceC1722jo.OooO0OO().f20552o0OOO0o : null).zzb();
    }

    public /* synthetic */ C1968qb(C1658hx c1658hx, InterfaceC1722jo interfaceC1722jo) {
        this.f23565OooOo0O = interfaceC1722jo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public void zza(boolean z, int i, String str, String str2) {
        InterfaceC1722jo interfaceC1722jo = this.f23565OooOo0O;
        interfaceC1722jo.o0ooOO0();
        interfaceC1722jo.zzN().o0OOO0o();
    }
}
