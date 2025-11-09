package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class x91 extends n81 {

    /* renamed from: OooO, reason: collision with root package name */
    public final o0O f25572OooO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final im0 f25573OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final int f25574OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f25575OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f25576OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f25577OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public gb1 f25578OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public C1550f f25579OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final rh0 f25580OooOOo0;

    public /* synthetic */ x91(C1550f c1550f, im0 im0Var, rh0 rh0Var, g61 g61Var, int i) {
        o0O o0o = o0O.f21864Oooo00o;
        this.f25579OooOOOo = c1550f;
        this.f25573OooO0oo = im0Var;
        this.f25580OooOOo0 = rh0Var;
        this.f25572OooO = o0o;
        this.f25574OooOO0 = i;
        this.f25575OooOO0O = true;
        this.OooOO0o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO00o(g91 g91Var) {
        v91 v91Var = (v91) g91Var;
        if (v91Var.f24915Oooo0oo) {
            for (aa1 aa1Var : v91Var.f24913Oooo0o0) {
                aa1Var.OooOO0o();
                if (aa1Var.f17015OooOoOO != null) {
                    aa1Var.f17015OooOoOO = null;
                    aa1Var.f16996OooO0o = null;
                }
            }
        }
        de0 de0Var = v91Var.f24903OooOooO;
        hb1 hb1Var = (hb1) de0Var.f18240OooOo;
        if (hb1Var != null) {
            hb1Var.OooO00o(true);
        }
        q91 q91Var = new q91(v91Var, 3);
        ExecutorC2126ul executorC2126ul = (ExecutorC2126ul) de0Var.f18242OooOo0o;
        executorC2126ul.execute(q91Var);
        ((ExecutorService) executorC2126ul.f24655OooOo0o).shutdown();
        v91Var.f24906Oooo0.removeCallbacksAndMessages(null);
        v91Var.f24910Oooo0O0 = null;
        v91Var.f24932Oooooo0 = true;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final g91 OooO0O0(h91 h91Var, eb1 eb1Var, long j) {
        zm0 zm0VarMo13706zza = this.f25573OooO0oo.mo13706zza();
        gb1 gb1Var = this.f25578OooOOOO;
        if (gb1Var != null) {
            zm0VarMo13706zza.OooO0oo(gb1Var);
        }
        oO00o00O oo00o00o = OooO0OO().f18716OooO0O0;
        oo00o00o.getClass();
        af0.OooOo0O(this.f21442OooO0oO);
        bi0 bi0Var = new bi0((o0000) this.f25580OooOOo0.f23865OooOo0O);
        o71 o71Var = new o71(this.f21439OooO0Oo.f22355OooO0O0, h91Var);
        o71 o71Var2 = new o71(this.f21438OooO0OO.f22355OooO0O0, h91Var);
        long jOooOOoo = i80.OooOOoo(-9223372036854775807L);
        return new v91(oo00o00o.f22536OooO00o, zm0VarMo13706zza, bi0Var, this.f25572OooO, o71Var, o71Var2, this, eb1Var, this.f25574OooOO0, jOooOOoo);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final synchronized C1550f OooO0OO() {
        return this.f25579OooOOOo;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOO0(gb1 gb1Var) {
        this.f25578OooOOOO = gb1Var;
        Looper.myLooper().getClass();
        af0.OooOo0O(this.f21442OooO0oO);
        OooOo00();
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOO0() {
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final synchronized void OooOOOo(C1550f c1550f) {
        this.f25579OooOOOo = c1550f;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOo() {
    }

    public final void OooOOoo(boolean z, long j, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.OooOO0o;
        }
        if (!this.f25575OooOO0O && this.OooOO0o == j && this.f25577OooOOO0 == z && this.f25576OooOOO == z2) {
            return;
        }
        this.OooOO0o = j;
        this.f25577OooOOO0 = z;
        this.f25576OooOOO = z2;
        this.f25575OooOO0O = false;
        OooOo00();
    }

    public final void OooOo00() {
        long j = this.OooOO0o;
        boolean z = this.f25577OooOOO0;
        boolean z2 = this.f25576OooOOO;
        C1550f c1550fOooO0OO = OooO0OO();
        AbstractC1787lf ea1Var = new ea1(j, j, z, c1550fOooO0OO, z2 ? c1550fOooO0OO.f18717OooO0OO : null);
        if (this.f25575OooOO0O) {
            ea1Var = new w91(ea1Var);
        }
        OooOO0O(ea1Var);
    }
}
