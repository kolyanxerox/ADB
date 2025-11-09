package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.fn */
/* loaded from: classes2.dex */
public final class C1574fn extends zzb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC1722jo f18981OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC1869nn f18982OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f18983OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String[] f18984OooO0o0;

    public C1574fn(InterfaceC1722jo interfaceC1722jo, AbstractC1869nn abstractC1869nn, String str, String[] strArr) {
        this.f18981OooO0O0 = interfaceC1722jo;
        this.f18982OooO0OO = abstractC1869nn;
        this.f18983OooO0Oo = str;
        this.f18984OooO0o0 = strArr;
        zzv.zzz().f19387OooOo0O.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f18982OooO0OO.OooOOo(this.f18983OooO0Oo, this.f18984OooO0o0);
        } finally {
            zzs.zza.post(new RunnableC1442c1(this, 14));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final o00000oO.OooOOO zzb() {
        return (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17841o000o0o)).booleanValue() && (this.f18982OooO0OO instanceof C2017rn)) ? AbstractC2200wl.f25325OooO0o.OooO0O0(new CallableC1736k1(this, 2)) : super.zzb();
    }
}
