package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ir0 implements ru0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f20112OooO00o;

    /* renamed from: OooO0O0 */
    public static final ir0 f20107OooO0O0 = new ir0(0);

    /* renamed from: OooO0OO */
    public static final lu0 f20108OooO0OO = new lu0(ut0.class, pq0.class, new el0(2));

    /* renamed from: OooO0Oo */
    public static final ir0 f20109OooO0Oo = new ir0(1);

    /* renamed from: OooO0o0 */
    public static final ir0 f20111OooO0o0 = new ir0(2);

    /* renamed from: OooO0o */
    public static final lu0 f20110OooO0o = new lu0(ut0.class, xq0.class, new xs0(23));

    public /* synthetic */ ir0(int i) {
        this.f20112OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.ru0
    public final Object OooO00o(bi0 bi0Var) throws GeneralSecurityException {
        switch (this.f20112OooO00o) {
            case 0:
                return new hr0(bi0Var);
            case 1:
                if (((qu0) bi0Var.f17507OooOo) == null) {
                    throw new GeneralSecurityException("no primary in primitive set");
                }
                Iterator it = ((HashMap) bi0Var.f17509OooOo0o).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                    }
                }
                return new ev0();
            default:
                nv0 nv0Var = new nv0();
                if (!((wt0) bi0Var.f17510OooOoO0).f25408OooO00o.isEmpty()) {
                    bu0 bu0Var = (bu0) cu0.f18058OooO0O0.f18060OooO00o.get();
                    if (bu0Var == null) {
                        bu0Var = cu0.f18059OooO0OO;
                    }
                    ii0.OooOO0o(bi0Var);
                    bu0Var.getClass();
                }
                return nv0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.ru0
    public final Class zza() {
        switch (this.f20112OooO00o) {
            case 0:
                return pq0.class;
            case 1:
                return ev0.class;
            default:
                return xq0.class;
        }
    }

    @Override // com.google.android.gms.internal.ads.ru0
    public final Class zzb() {
        switch (this.f20112OooO00o) {
            case 0:
                return pq0.class;
            case 1:
                return ev0.class;
            default:
                return xq0.class;
        }
    }
}
