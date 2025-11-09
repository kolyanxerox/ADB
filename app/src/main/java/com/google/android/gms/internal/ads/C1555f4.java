package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.f4 */
/* loaded from: classes2.dex */
public final class C1555f4 implements InterfaceC1738k3 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18774OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f18775OooO0O0;

    public /* synthetic */ C1555f4(Object obj, int i) {
        this.f18774OooO00o = i;
        this.f18775OooO0O0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1738k3
    public final void zza(boolean z) {
        switch (this.f18774OooO00o) {
            case 0:
                C1592g4 c1592g4 = (C1592g4) this.f18775OooO0O0;
                if (!z) {
                    C1592g4.OooO0O0(c1592g4);
                    break;
                } else {
                    c1592g4.OooO0Oo();
                    break;
                }
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.OooOo0)).booleanValue()) {
                    ((rg0) this.f18775OooO0O0).OooO0o(z);
                    break;
                }
                break;
        }
    }
}
