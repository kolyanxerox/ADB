package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class m90 implements kb0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f21146OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f21147OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f21148OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f21149OooO0Oo;

    /* renamed from: OooO0o0 */
    public final Object f21150OooO0o0;

    public m90(Context context, C2163vl c2163vl, vd0 vd0Var, VersionInfoParcel versionInfoParcel) {
        this.f21146OooO00o = 6;
        this.f21148OooO0OO = context;
        this.f21149OooO0Oo = c2163vl;
        this.f21147OooO0O0 = vd0Var;
        this.f21150OooO0o0 = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f21146OooO00o) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        x90 x90Var;
        switch (this.f21146OooO00o) {
            case 0:
                AbstractC1448c7.OooO00o((Context) this.f21148OooO0OO);
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 7));
            case 1:
                return ii0.Ooooooo(((ma0) this.f21149OooO0Oo).zzb(), new C2123ui(this, 3), AbstractC2200wl.f25327OooO0oO);
            case 2:
                C2148v6 c2148v6 = AbstractC1448c7.o0Ooo0oo;
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue();
                y90 y90Var = (y90) this.f21150OooO0o0;
                if (zBooleanValue && (x90Var = y90Var.f25873OooO0O0) != null) {
                    return ii0.OooooOO(x90Var);
                }
                if (xh0.OooOo((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17818o000OO0O)) || (!((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue() && (y90Var.f25872OooO00o.get() || !((d30) this.f21147OooO0O0).f18141OooO0O0))) {
                    return ii0.OooooOO(new x90(0, new Bundle()));
                }
                y90Var.f25872OooO00o.set(true);
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 9));
            case 3:
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 15));
            case 4:
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 19));
            case 5:
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 21));
            case 6:
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 23));
            default:
                return ((C2163vl) this.f21149OooO0Oo).OooO0O0(new CallableC1736k1(this, 25));
        }
    }

    public /* synthetic */ m90(C2163vl c2163vl, Object obj, Object obj2, Object obj3, int i) {
        this.f21146OooO00o = i;
        this.f21149OooO0Oo = c2163vl;
        this.f21148OooO0OO = obj;
        this.f21147OooO0O0 = obj2;
        this.f21150OooO0o0 = obj3;
    }

    public /* synthetic */ m90(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f21146OooO00o = i;
        this.f21149OooO0Oo = obj;
        this.f21147OooO0O0 = obj2;
        this.f21148OooO0OO = obj3;
        this.f21150OooO0o0 = obj4;
    }
}
