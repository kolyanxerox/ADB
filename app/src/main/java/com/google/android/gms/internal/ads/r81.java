package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r81 implements l91, p71 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Integer f23804OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public o71 f23805OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o71 f23806OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t81 f23807OooO0Oo;

    public r81(t81 t81Var, Integer num) {
        this.f23807OooO0Oo = t81Var;
        this.f23805OooO0O0 = new o71(t81Var.f21438OooO0OO.f22355OooO0O0, null);
        this.f23806OooO0OO = new o71(t81Var.f21439OooO0Oo.f22355OooO0O0, null);
        this.f23804OooO00o = num;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO00o(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        if (OooO0oO(h91Var)) {
            o71 o71Var = this.f23805OooO0O0;
            e91 e91VarOooO0o = OooO0o(e91Var, h91Var);
            o71Var.getClass();
            o71Var.OooO00o(new j91(o71Var, y81Var, e91VarOooO0o, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0O0(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        if (OooO0oO(h91Var)) {
            o71 o71Var = this.f23805OooO0O0;
            e91 e91VarOooO0o = OooO0o(e91Var, h91Var);
            o71Var.getClass();
            o71Var.OooO00o(new j91(o71Var, y81Var, e91VarOooO0o, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0OO(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        if (OooO0oO(h91Var)) {
            o71 o71Var = this.f23805OooO0O0;
            e91 e91VarOooO0o = OooO0o(e91Var, h91Var);
            o71Var.getClass();
            o71Var.OooO00o(new j91(o71Var, y81Var, e91VarOooO0o, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0Oo(int i, h91 h91Var, e91 e91Var) {
        if (OooO0oO(h91Var)) {
            o71 o71Var = this.f23805OooO0O0;
            e91 e91VarOooO0o = OooO0o(e91Var, h91Var);
            o71Var.getClass();
            o71Var.OooO00o(new dx0(11, o71Var, e91VarOooO0o));
        }
    }

    public final e91 OooO0o(e91 e91Var, h91 h91Var) {
        t81 t81Var = this.f23807OooO0Oo;
        Integer num = this.f23804OooO00o;
        long j = e91Var.f18527OooO0OO;
        t81Var.OooOo0O(num, j);
        long j2 = e91Var.f18528OooO0Oo;
        t81Var.OooOo0O(num, j2);
        return (j == e91Var.f18527OooO0OO && j2 == e91Var.f18528OooO0Oo) ? e91Var : new e91(e91Var.f18525OooO00o, e91Var.f18526OooO0O0, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0o0(int i, h91 h91Var, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        if (OooO0oO(h91Var)) {
            o71 o71Var = this.f23805OooO0O0;
            e91 e91VarOooO0o = OooO0o(e91Var, h91Var);
            o71Var.getClass();
            o71Var.OooO00o(new fj0(o71Var, y81Var, e91VarOooO0o, iOException, z));
        }
    }

    public final boolean OooO0oO(h91 h91Var) {
        h91 h91VarOooOo0o;
        Integer num = this.f23804OooO00o;
        t81 t81Var = this.f23807OooO0Oo;
        if (h91Var != null) {
            h91VarOooOo0o = t81Var.OooOo0o(num, h91Var);
            if (h91VarOooOo0o == null) {
                return false;
            }
        } else {
            h91VarOooOo0o = null;
        }
        t81Var.OooOo0(num);
        o71 o71Var = this.f23805OooO0O0;
        o71Var.getClass();
        if (!Objects.equals(o71Var.f22354OooO00o, h91VarOooOo0o)) {
            this.f23805OooO0O0 = new o71(t81Var.f21438OooO0OO.f22355OooO0O0, h91VarOooOo0o);
        }
        o71 o71Var2 = this.f23806OooO0OO;
        o71Var2.getClass();
        if (Objects.equals(o71Var2.f22354OooO00o, h91VarOooOo0o)) {
            return true;
        }
        this.f23806OooO0OO = new o71(t81Var.f21439OooO0Oo.f22355OooO0O0, h91VarOooOo0o);
        return true;
    }
}
