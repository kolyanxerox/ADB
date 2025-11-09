package com.google.android.gms.internal.ads;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class z51 {

    /* renamed from: OooO00o */
    public boolean f26093OooO00o;

    /* renamed from: OooO0O0 */
    public int f26094OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f26095OooO0OO;

    public z51(f81 f81Var, int i) {
        this.f26095OooO0OO = f81Var;
        this.f26094OooO0O0 = i;
        this.f26093OooO00o = false;
    }

    public static boolean OooOO0o(f81 f81Var) {
        return f81Var.f18822OooOoo != 0;
    }

    public boolean OooO(h51 h51Var) {
        ba1 ba1Var = h51Var.f19560OooO0OO[this.f26094OooO0O0];
        f81 f81Var = (f81) this.f26095OooO0OO;
        if (f81Var.f18824OooOooO == ba1Var) {
            return ba1Var == null || f81Var.OooOO0();
        }
        return false;
    }

    public int OooO00o() {
        return OooOO0o((f81) this.f26095OooO0OO) ? 1 : 0;
    }

    public void OooO0O0() {
        f81 f81Var = (f81) this.f26095OooO0OO;
        if (OooOO0o(f81Var)) {
            f81Var.OooooOo();
        }
    }

    public void OooO0OO() {
        f81 f81Var = (f81) this.f26095OooO0OO;
        af0.OooooO0(f81Var.f18822OooOoo == 0);
        f81Var.OooO0OO();
        this.f26093OooO00o = false;
    }

    public void OooO0Oo(long j, long j2) {
        f81 f81Var = (f81) this.f26095OooO0OO;
        if (OooOO0o(f81Var)) {
            f81Var.OooOO0o(j, j2);
        }
    }

    public void OooO0o() {
        if (this.f26093OooO00o) {
            f81 f81Var = (f81) this.f26095OooO0OO;
            af0.OooooO0(f81Var.f18822OooOoo == 0);
            dx0 dx0Var = f81Var.f18816OooOo;
            dx0Var.f18417OooOo = null;
            dx0Var.f18419OooOo0o = null;
            f81Var.OooO0Oo();
            this.f26093OooO00o = false;
        }
    }

    public void OooO0o0(o0OoOo0[] o0oooo0Arr, ba1 ba1Var, long j, long j2, h91 h91Var) {
        ((f81) this.f26095OooO0OO).OooO0oo(o0oooo0Arr, ba1Var, j, j2, h91Var);
    }

    public void OooO0oO(Object obj) {
        f81 f81Var = (f81) this.f26095OooO0OO;
        if (f81Var.f18818OooOo0o == 2) {
            f81Var.OooO0O0(1, obj);
        }
    }

    public boolean OooO0oo(h51 h51Var) {
        ba1 ba1Var = h51Var.f19560OooO0OO[this.f26094OooO0O0];
        f81 f81Var = (f81) this.f26095OooO0OO;
        boolean z = ba1Var != f81Var.f18824OooOooO;
        return z || (!z && f81Var.OooOO0()) || f81Var.OooOOO() || f81Var.OooOOO0();
    }

    public boolean OooOO0() {
        return ((f81) this.f26095OooO0OO).OooOO0();
    }

    public boolean OooOO0O(h51 h51Var) {
        f81 f81Var = null;
        if (h51Var != null) {
            ba1 ba1Var = h51Var.f19560OooO0OO[this.f26094OooO0O0];
            if (ba1Var != null) {
                f81 f81Var2 = (f81) this.f26095OooO0OO;
                if (f81Var2.f18824OooOooO == ba1Var) {
                    f81Var = f81Var2;
                }
            }
        }
        return f81Var != null;
    }

    public z51(FloatingActionButton floatingActionButton) {
        this.f26093OooO00o = false;
        this.f26094OooO0O0 = 0;
        this.f26095OooO0OO = floatingActionButton;
    }
}
