package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t40 implements u40 {

    /* renamed from: OooO00o */
    public final Map f24236OooO00o;

    /* renamed from: OooO0O0 */
    public final C2163vl f24237OooO0O0;

    /* renamed from: OooO0OO */
    public final C2136uv f24238OooO0OO;

    public t40(Map map, C2163vl c2163vl, C2136uv c2136uv) {
        this.f24236OooO00o = map;
        this.f24237OooO0O0 = c2163vl;
        this.f24238OooO0OO = c2136uv;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final o00000oO.OooOOO OooO00o(C2197wi c2197wi) {
        this.f24238OooO0OO.OoooO0(c2197wi);
        ap0 ap0VarOoooo00 = ii0.Ooooo00(new a40(3));
        for (String str : ((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0ooo)).split(",")) {
            z31 z31Var = (z31) this.f24236OooO00o.get(str.trim());
            if (z31Var != null) {
                ap0VarOoooo00 = ii0.OoooOoO(ap0VarOoooo00, a40.class, new C1786le(6, z31Var, c2197wi), this.f24237OooO0O0);
            }
        }
        ap0VarOoooo00.addListener(new wp0(0, ap0VarOoooo00, new sj0(this, 20)), AbstractC2200wl.f25327OooO0oO);
        return ap0VarOoooo00;
    }
}
