package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jy */
/* loaded from: classes2.dex */
public final class C1732jy implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20400OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1651hq f20401OooO0O0;

    public /* synthetic */ C1732jy(C1651hq c1651hq, int i) {
        this.f20400OooO00o = i;
        this.f20401OooO0O0 = c1651hq;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f20400OooO00o) {
            case 0:
                return new BinderC1695iy(this.f20401OooO0O0.OooO00o());
            default:
                return new d10(this.f20401OooO0O0.OooO00o());
        }
    }
}
