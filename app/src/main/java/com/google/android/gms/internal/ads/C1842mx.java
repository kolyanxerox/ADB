package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mx */
/* loaded from: classes2.dex */
public final class C1842mx implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21359OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2249xx f21360OooO0O0;

    public /* synthetic */ C1842mx(C2249xx c2249xx, int i) {
        this.f21359OooO00o = i;
        this.f21360OooO0O0 = c2249xx;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f21359OooO00o) {
            case 0:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f21360OooO0O0.f25813OooOo;
                if (interfaceC1722jo == null) {
                    return null;
                }
                return interfaceC1722jo.OooOOo();
            case 1:
                InterfaceC1722jo interfaceC1722jo2 = (InterfaceC1722jo) this.f21360OooO0O0.f25813OooOo;
                if (interfaceC1722jo2 != null) {
                    return interfaceC1722jo2.OooOOo();
                }
                return null;
            default:
                return (InterfaceC1722jo) this.f21360OooO0O0.f25813OooOo;
        }
    }
}
