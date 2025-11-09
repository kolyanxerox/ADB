package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.xt */
/* loaded from: classes2.dex */
public final class C2245xt implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25793OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1834mp f25794OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1982qp f25795OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f25796OooO0Oo;

    public /* synthetic */ C2245xt(C1834mp c1834mp, C1982qp c1982qp, p31 p31Var, int i) {
        this.f25793OooO00o = i;
        this.f25794OooO0O0 = c1834mp;
        this.f25795OooO0OO = c1982qp;
        this.f25796OooO0Oo = p31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        C1602ge c1602ge;
        switch (this.f25793OooO00o) {
            case 0:
                Context contextOooO00o = this.f25794OooO0O0.OooO00o();
                nf0 nf0Var = (nf0) this.f25796OooO0Oo.zzb();
                VersionInfoParcel versionInfoParcelOooO00o = this.f25795OooO0OO.OooO00o();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C2208wt(contextOooO00o, nf0Var, versionInfoParcelOooO00o, c2163vl);
            case 1:
                Context contextOooO00o2 = this.f25794OooO0O0.OooO00o();
                VersionInfoParcel versionInfoParcelOooO00o2 = this.f25795OooO0OO.OooO00o();
                nf0 nf0Var2 = (nf0) this.f25796OooO0Oo.zzb();
                synchronized (new Object()) {
                    Context applicationContext = contextOooO00o2.getApplicationContext();
                    if (applicationContext != null) {
                        contextOooO00o2 = applicationContext;
                    }
                    c1602ge = new C1602ge(contextOooO00o2, versionInfoParcelOooO00o2, (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17710OooO00o), nf0Var2);
                }
                return c1602ge;
            default:
                return new nf0(this.f25794OooO0O0.OooO00o(), this.f25795OooO0OO.OooO00o(), (s10) this.f25796OooO0Oo.zzb(), new C2007rd(10));
        }
    }

    public C2245xt(C1834mp c1834mp, p31 p31Var, C1982qp c1982qp) {
        this.f25793OooO00o = 0;
        this.f25794OooO0O0 = c1834mp;
        this.f25796OooO0Oo = p31Var;
        this.f25795OooO0OO = c1982qp;
    }
}
