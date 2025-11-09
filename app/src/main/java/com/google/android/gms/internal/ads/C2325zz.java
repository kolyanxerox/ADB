package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zz */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2325zz implements lp0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26396OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ dp0 f26397OooO0O0;

    public /* synthetic */ C2325zz(dp0 dp0Var, int i) {
        this.f26396OooO00o = i;
        this.f26397OooO0O0 = dp0Var;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) throws z70 {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
        switch (this.f26396OooO00o) {
            case 0:
                if (interfaceC1722jo == null || interfaceC1722jo.zzq() == null) {
                    throw new z70(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f26397OooO0O0;
            default:
                if (interfaceC1722jo != null) {
                    return this.f26397OooO0O0;
                }
                throw new z70(1, "Retrieve Web View from image ad response failed.");
        }
    }
}
