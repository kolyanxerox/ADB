package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class eu0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final eu0 f18703OooO0O0 = new eu0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f18704OooO00o = new AtomicReference(new pu0(new C1548ey(29)));

    public final Class OooO00o() {
        HashMap map = ((pu0) this.f18704OooO00o.get()).f23429OooO0O0;
        if (map.containsKey(pq0.class)) {
            return ((ru0) map.get(pq0.class)).zza();
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No input primitive class for ", pq0.class.toString(), " available"));
    }

    public final Object OooO0O0(ii0 ii0Var, Class cls) {
        pu0 pu0Var = (pu0) this.f18704OooO00o.get();
        pu0Var.getClass();
        nu0 nu0Var = new nu0(ii0Var.getClass(), cls);
        HashMap map = pu0Var.f23428OooO00o;
        if (map.containsKey(nu0Var)) {
            return ((lu0) map.get(nu0Var)).f20962OooO0OO.OooO0OO(ii0Var);
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0O("No PrimitiveConstructor for ", nu0Var.toString(), " available"));
    }

    public final synchronized void OooO0OO(lu0 lu0Var) {
        C1548ey c1548ey = new C1548ey((pu0) this.f18704OooO00o.get());
        c1548ey.OooO0OO(lu0Var);
        this.f18704OooO00o.set(new pu0(c1548ey));
    }

    public final synchronized void OooO0Oo(ru0 ru0Var) {
        C1548ey c1548ey = new C1548ey((pu0) this.f18704OooO00o.get());
        Class clsZzb = ru0Var.zzb();
        HashMap map = (HashMap) c1548ey.f18706OooOo;
        if (map.containsKey(clsZzb)) {
            ru0 ru0Var2 = (ru0) map.get(clsZzb);
            if (!ru0Var2.equals(ru0Var) || !ru0Var.equals(ru0Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            map.put(clsZzb, ru0Var);
        }
        this.f18704OooO00o.set(new pu0(c1548ey));
    }
}
