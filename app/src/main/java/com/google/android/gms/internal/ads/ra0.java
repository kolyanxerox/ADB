package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class ra0 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23811OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2112u7 f23812OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f23813OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f23814OooO0Oo;

    public /* synthetic */ ra0(C2112u7 c2112u7, p31 p31Var, p31 p31Var2, int i) {
        this.f23811OooO00o = i;
        this.f23812OooO0O0 = c2112u7;
        this.f23813OooO0OO = p31Var;
        this.f23814OooO0Oo = p31Var2;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f23811OooO00o) {
            case 0:
                t90 t90VarOooO00o = this.f23812OooO0O0.OooO00o();
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) this.f23813OooO0OO.zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new ma0(t90VarOooO00o, 2147483647L, o00ooo2, c2163vl, (h20) this.f23814OooO0Oo.zzb());
            default:
                Object objOooO00o = this.f23812OooO0O0.OooO00o();
                Object obj = (ma0) this.f23813OooO0OO.zzb();
                if (true == ((List) this.f23814OooO0Oo.zzb()).contains("29")) {
                    objOooO00o = obj;
                }
                ii0.Oooo000(objOooO00o);
                return objOooO00o;
        }
    }
}
