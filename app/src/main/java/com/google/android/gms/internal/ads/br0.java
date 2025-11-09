package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class br0 {

    /* renamed from: OooO00o */
    public static final /* synthetic */ int f17590OooO00o = 0;

    static {
        Logger.getLogger(br0.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(pq0.class);
        hashSet.add(qq0.class);
        hashSet.add(cr0.class);
        hashSet.add(sq0.class);
        hashSet.add(rq0.class);
        hashSet.add(xq0.class);
        hashSet.add(sv0.class);
        hashSet.add(zq0.class);
        hashSet.add(ar0.class);
        Collections.unmodifiableSet(hashSet);
    }

    public static Object OooO00o(kx0 kx0Var, Class cls) throws GeneralSecurityException {
        String strOooOoOO = kx0Var.OooOoOO();
        jz0 jz0VarOooOoO = kx0Var.OooOoO();
        st0 st0VarOooO0OO = mt0.f21351OooO0Oo.OooO0OO(strOooOoOO);
        boolean zEquals = st0VarOooO0OO.f24159OooO0O0.equals(cls);
        Class cls2 = st0VarOooO0OO.f24159OooO0O0;
        if (zEquals) {
            return eu0.f18703OooO0O0.OooO0O0(fu0.f19127OooO0O0.OooO00o(su0.OooO00o(st0VarOooO0OO.f24158OooO00o, jz0VarOooOoO, st0VarOooO0OO.f24160OooO0OO, fy0.RAW, null)), cls2);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(st0.class);
        String string = cls2.toString();
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbOooOOo0.append(string);
        throw new GeneralSecurityException(sbOooOOo0.toString());
    }
}
