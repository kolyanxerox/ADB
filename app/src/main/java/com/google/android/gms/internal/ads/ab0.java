package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class ab0 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f17016OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final q31 f17017OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final v31 f17018OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final v31 f17019OooO0Oo;

    public ab0(C1834mp c1834mp, C1982qp c1982qp, C1797lp c1797lp) {
        this.f17016OooO00o = 1;
        this.f17017OooO0O0 = c1834mp;
        this.f17018OooO0OO = c1982qp;
        this.f17019OooO0Oo = c1797lp;
    }

    public m90 OooO00o() {
        Context contextOooO00o = ((C1834mp) this.f17017OooO0O0).OooO00o();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90(contextOooO00o, c2163vl, ((C1876nu) this.f17019OooO0Oo).OooO00o(), ((C1982qp) this.f17018OooO0OO).OooO00o());
    }

    public m90 OooO0O0() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90(c2163vl, (Object) ((C1834mp) this.f17017OooO0O0).OooO00o(), (Object) ((C1982qp) this.f17018OooO0OO).OooO00o(), (Object) ((C1797lp) this.f17019OooO0Oo).OooO0OO(), 7);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f17016OooO00o) {
            case 0:
                return OooO00o();
            case 1:
                return OooO0O0();
            default:
                ii0.Oooo000(((C2197wi) ((zb0) this.f17017OooO0O0).f26143OooO0O0.f13283OooOo).zzd);
                C1978ql c1978ql = (C1978ql) ((p31) this.f17019OooO0Oo).zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((p31) this.f17018OooO0OO).zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new t90(c1978ql, scheduledExecutorService, c2163vl);
        }
    }

    public /* synthetic */ ab0(q31 q31Var, v31 v31Var, v31 v31Var2, int i) {
        this.f17016OooO00o = i;
        this.f17017OooO0O0 = q31Var;
        this.f17019OooO0Oo = v31Var;
        this.f17018OooO0OO = v31Var2;
    }
}
