package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.List;

/* loaded from: classes2.dex */
public final class qa0 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23553OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1797lp f23554OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f23555OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f23556OooO0Oo;

    public /* synthetic */ qa0(C1797lp c1797lp, p31 p31Var, p31 p31Var2, int i) {
        this.f23553OooO00o = i;
        this.f23554OooO0O0 = c1797lp;
        this.f23555OooO0OO = p31Var;
        this.f23556OooO0Oo = p31Var2;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f23553OooO00o) {
            case 0:
                k90 k90Var = new k90(this.f23554OooO0O0.f20919OooO0O0.OooO00o(), 0);
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) this.f23555OooO0OO.zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new ma0(k90Var, 2147483647L, o00ooo2, c2163vl, (h20) this.f23556OooO0Oo.zzb());
            default:
                Object k90Var2 = new k90(this.f23554OooO0O0.f20919OooO0O0.OooO00o(), 0);
                Object obj = (ma0) this.f23555OooO0OO.zzb();
                if (true == ((List) this.f23556OooO0Oo.zzb()).contains(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
                    k90Var2 = obj;
                }
                ii0.Oooo000(k90Var2);
                return k90Var2;
        }
    }
}
