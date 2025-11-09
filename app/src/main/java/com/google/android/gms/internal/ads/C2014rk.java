package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.rk */
/* loaded from: classes2.dex */
public final class C2014rk implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23870OooO00o;

    /* renamed from: OooO0O0 */
    public final p31 f23871OooO0O0;

    /* renamed from: OooO0OO */
    public final r31 f23872OooO0OO;

    public /* synthetic */ C2014rk(p31 p31Var, r31 r31Var, int i) {
        this.f23870OooO00o = i;
        this.f23871OooO0O0 = p31Var;
        this.f23872OooO0OO = r31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f23870OooO00o) {
            case 0:
                return new C2249xx(19, (Oooo0OO.o00Ooo) this.f23872OooO0OO.f23738OooO00o, (C1904ok) this.f23871OooO0O0.zzb());
            case 1:
                return new x10((C1998r4) this.f23871OooO0O0.zzb(), (uc0) this.f23872OooO0OO.f23738OooO00o);
            case 2:
                Context context = (Context) this.f23871OooO0O0.zzb();
                AbstractC2243xr abstractC2243xr = (AbstractC2243xr) this.f23872OooO0OO.f23738OooO00o;
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new u60(context, abstractC2243xr, c2163vl, 0);
            case 3:
                return new w60((Context) this.f23871OooO0O0.zzb(), 0, (AbstractC2243xr) this.f23872OooO0OO.f23738OooO00o);
            case 4:
                return new a70((Context) this.f23871OooO0O0.zzb(), (AbstractC1837ms) this.f23872OooO0OO.f23738OooO00o);
            case 5:
                return new w60((Context) this.f23871OooO0O0.zzb(), 1, (AbstractC1990qx) this.f23872OooO0OO.f23738OooO00o);
            default:
                return new w60((Context) this.f23871OooO0O0.zzb(), 2, (i10) this.f23872OooO0OO.f23738OooO00o);
        }
    }

    public C2014rk(r31 r31Var, p31 p31Var) {
        this.f23870OooO00o = 0;
        this.f23872OooO0OO = r31Var;
        this.f23871OooO0O0 = p31Var;
    }
}
