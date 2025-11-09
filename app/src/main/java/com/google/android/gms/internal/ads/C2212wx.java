package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wx */
/* loaded from: classes2.dex */
public final class C2212wx implements InterfaceC1506dt {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Map f25415OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Map f25416OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Map f25417OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f25418OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C2213wy f25419OooO0o0;

    public C2212wx(Map map, Map map2, Map map3, p31 p31Var, C2213wy c2213wy) {
        this.f25415OooO00o = map;
        this.f25416OooO0O0 = map2;
        this.f25417OooO0OO = map3;
        this.f25418OooO0Oo = p31Var;
        this.f25419OooO0o0 = c2213wy;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1506dt
    public final i60 OooO00o(int i, String str) {
        i60 i60VarOooO00o;
        i60 i60Var = (i60) this.f25415OooO00o.get(str);
        if (i60Var != null) {
            return i60Var;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            m70 m70Var = (m70) this.f25417OooO0OO.get(str);
            if (m70Var != null) {
                return new j60(m70Var, new o0O0o00O(5));
            }
            i60VarOooO00o = (i60) this.f25416OooO0O0.get(str);
            if (i60VarOooO00o == null) {
                return null;
            }
        } else if (this.f25419OooO0o0.f25424OooO0Oo == null || (i60VarOooO00o = ((InterfaceC1506dt) this.f25418OooO0Oo.zzb()).OooO00o(i, str)) == null) {
            return null;
        }
        return new j60(i60VarOooO00o, new o0O0o00O(6));
    }
}
