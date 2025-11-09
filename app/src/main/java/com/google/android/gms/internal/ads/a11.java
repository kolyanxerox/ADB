package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a11 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final a11 f16875OooO0OO = new a11();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f16877OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final sj0 f16876OooO00o = new sj0(1);

    public final g11 OooO00o(Class cls) {
        g11 g11VarOooOoOO;
        Charset charset = i01.f19888OooO00o;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f16877OooO0O0;
        g11 g11Var = (g11) concurrentHashMap.get(cls);
        if (g11Var != null) {
            return g11Var;
        }
        sj0 sj0Var = this.f16876OooO00o;
        sj0Var.getClass();
        o0O o0o = h11.f19523OooO00o;
        zz0.class.isAssignableFrom(cls);
        c11 c11VarOooO00o = ((hk0) sj0Var.f24094OooOo0o).OooO00o(cls);
        if ((c11VarOooO00o.f17650OooO0Oo & 2) == 2) {
            o0O o0o2 = h11.f19523OooO00o;
            qv0 qv0Var = uz0.f24794OooO00o;
            g11VarOooOoOO = new w01(o0o2, c11VarOooO00o.f17647OooO00o);
        } else {
            int i = x01.f25493OooO00o;
            int i2 = o01.f21851OooO00o;
            o0O o0o3 = h11.f19523OooO00o;
            qv0 qv0Var2 = c11VarOooO00o.OooO00o() + (-1) != 1 ? uz0.f24794OooO00o : null;
            int i3 = r01.f23725OooO00o;
            g11VarOooOoOO = v01.OooOoOO(c11VarOooO00o, o0o3, qv0Var2);
        }
        g11 g11Var2 = (g11) concurrentHashMap.putIfAbsent(cls, g11VarOooOoOO);
        return g11Var2 == null ? g11VarOooOoOO : g11Var2;
    }
}
