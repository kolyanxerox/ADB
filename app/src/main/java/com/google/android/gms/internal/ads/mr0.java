package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final /* synthetic */ class mr0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21341OooO00o;

    public /* synthetic */ mr0(int i) {
        this.f21341OooO00o = i;
    }

    public final ii0 OooO00o(yq0 yq0Var, Integer num) throws GeneralSecurityException {
        boolean z = false;
        switch (this.f21341OooO00o) {
            case 0:
                qr0 qr0Var = (qr0) yq0Var;
                lu0 lu0Var = nr0.f21571OooO00o;
                int i = qr0Var.f23683OooO00o;
                if (i != 16 && i != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C1386ai c1386ai = new C1386ai(16);
                c1386ai.f17044OooOo0o = qr0Var;
                c1386ai.f17045OooOoO = num;
                c1386ai.f17042OooOo = pd0.OooO0oo(i);
                c1386ai.f17046OooOoO0 = pd0.OooO0oo(qr0Var.f23684OooO0O0);
                return c1386ai.OooOo0o();
            case 1:
                ur0 ur0Var = (ur0) yq0Var;
                lu0 lu0Var2 = sr0.f24149OooO00o;
                int i2 = ur0Var.f24772OooO00o;
                if (i2 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                bi0 bi0Var = new bi0(3, z);
                bi0Var.f17509OooOo0o = ur0Var;
                bi0Var.f17510OooOoO0 = num;
                bi0Var.f17507OooOo = pd0.OooO0oo(i2);
                return bi0Var.OooO0oo();
            case 2:
                xr0 xr0Var = (xr0) yq0Var;
                lu0 lu0Var3 = wr0.f25393OooO00o;
                int i3 = xr0Var.f25788OooO00o;
                if (i3 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                bi0 bi0Var2 = new bi0(4, z);
                bi0Var2.f17509OooOo0o = xr0Var;
                bi0Var2.f17510OooOoO0 = num;
                bi0Var2.f17507OooOo = pd0.OooO0oo(i3);
                return bi0Var2.OooO();
            case 3:
                as0 as0Var = (as0) yq0Var;
                bi0 bi0Var3 = new bi0(5, z);
                bi0Var3.f17509OooOo0o = as0Var;
                bi0Var3.f17510OooOoO0 = num;
                bi0Var3.f17507OooOo = pd0.OooO0oo(as0Var.f17096OooO00o);
                return bi0Var3.OooOO0();
            case 4:
                lu0 lu0Var4 = cs0.f18052OooO00o;
                return bs0.o00ooo(((ds0) yq0Var).f18405OooO00o, pd0.OooO0oo(32), num);
            case 5:
                return hs0.o00ooo((is0) yq0Var, num);
            case 6:
                return ks0.o00ooo((ls0) yq0Var, num);
            case 7:
                return os0.o00ooo((ps0) yq0Var, pd0.OooO0oo(32), num);
            case 8:
                lu0 lu0Var5 = rs0.f23937OooO00o;
                return qs0.o00ooo(((ss0) yq0Var).f24154OooO00o, pd0.OooO0oo(32), num);
            case 9:
                zt0 zt0Var = zt0.f26384OooO0O0;
                tu0 tu0Var = ((vt0) yq0Var).f25135OooO00o;
                mt0 mt0Var = mt0.f21351OooO0Oo;
                mx0 mx0Var = tu0Var.f24510OooO0O0;
                st0 st0VarOooO0OO = mt0Var.OooO0OO(mx0Var.OooOoo0());
                if (!((Boolean) mt0Var.f21353OooO0O0.get(mx0Var.OooOoo0())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                jz0 jz0VarOooOoOO = mx0Var.OooOoOO();
                st0VarOooO0OO.getClass();
                lx0 lx0VarOooOo0o = mx0.OooOo0o();
                lx0VarOooOo0o.OooO0oO(st0VarOooO0OO.f24158OooO00o);
                lx0VarOooOo0o.OooO0oo(jz0VarOooOoOO);
                lx0VarOooOo0o.OooO0o(fy0.RAW);
                mx0 mx0Var2 = (mx0) lx0VarOooOo0o.OooO0O0();
                tu0 tu0Var2 = new tu0(mx0Var2, zu0.OooO00o(mx0Var2.OooOoo0()));
                fu0 fu0Var = fu0.f19127OooO0O0;
                su0 su0Var = (su0) fu0Var.OooO0OO(zt0.f26384OooO0O0.OooO00o(fu0Var.OooO0O0(tu0Var2), null));
                jx0 jx0VarOooOo0o = kx0.OooOo0o();
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOoo((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24163OooO00o);
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOooO((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24165OooO0OO);
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOoo0((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24166OooO0Oo);
                kx0 kx0Var = (kx0) jx0VarOooOo0o.OooO0O0();
                return new ut0(su0.OooO00o(kx0Var.OooOoOO(), kx0Var.OooOoO(), kx0Var.OooOo(), mx0Var.OooOoO(), num));
            case 10:
                dv0 dv0Var = (dv0) yq0Var;
                int i4 = dv0Var.f18412OooO00o;
                if (i4 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                bi0 bi0Var4 = new bi0(7, z);
                bi0Var4.f17509OooOo0o = dv0Var;
                bi0Var4.f17507OooOo = pd0.OooO0oo(i4);
                bi0Var4.f17510OooOoO0 = num;
                return bi0Var4.OooOO0O();
            default:
                jv0 jv0Var = (jv0) yq0Var;
                bi0 bi0Var5 = new bi0(9, z);
                bi0Var5.f17509OooOo0o = jv0Var;
                bi0Var5.f17507OooOo = pd0.OooO0oo(jv0Var.f20395OooO00o);
                bi0Var5.f17510OooOoO0 = num;
                return bi0Var5.OooOOO0();
        }
    }
}
