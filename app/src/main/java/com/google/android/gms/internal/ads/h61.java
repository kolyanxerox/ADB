package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class h61 implements l91, p71 {

    /* renamed from: OooO */
    public boolean f19573OooO;

    /* renamed from: OooO00o */
    public final k50 f19574OooO00o;

    /* renamed from: OooO0O0 */
    public final C1528ee f19575OooO0O0;

    /* renamed from: OooO0OO */
    public final C2045se f19576OooO0OO;

    /* renamed from: OooO0Oo */
    public final s20 f19577OooO0Oo;

    /* renamed from: OooO0o */
    public t00 f19578OooO0o;

    /* renamed from: OooO0o0 */
    public final SparseArray f19579OooO0o0;

    /* renamed from: OooO0oO */
    public b61 f19580OooO0oO;

    /* renamed from: OooO0oo */
    public m60 f19581OooO0oo;

    public h61(k50 k50Var) {
        k50Var.getClass();
        this.f19574OooO00o = k50Var;
        int i = i80.f19994OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        this.f19578OooO0o = new t00(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, k50Var, new f61(17));
        C1528ee c1528ee = new C1528ee();
        this.f19575OooO0O0 = c1528ee;
        this.f19576OooO0OO = new C2045se();
        s20 s20Var = new s20();
        s20Var.f23976OooOo0O = c1528ee;
        pm0 pm0Var = rm0.f23913OooOo0o;
        s20Var.f23977OooOo0o = gn0.f19388OooOoO;
        s20Var.f23975OooOo = mn0.f21307OooOoo0;
        this.f19577OooO0Oo = s20Var;
        this.f19579OooO0o0 = new SparseArray();
    }

    public final void OooO(d61 d61Var, int i, InterfaceC1770kz interfaceC1770kz) {
        this.f19579OooO0o0.put(i, d61Var);
        t00 t00Var = this.f19578OooO0o;
        t00Var.OooO0OO(i, interfaceC1770kz);
        t00Var.OooO0O0();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO00o(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        OooO(OooOO0O(i, h91Var), 1002, new f61(19));
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0O0(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        OooO(OooOO0O(i, h91Var), 1000, new qv0(29));
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0OO(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        OooO(OooOO0O(i, h91Var), 1001, new f61(21));
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0Oo(int i, h91 h91Var, e91 e91Var) {
        d61 d61VarOooOO0O = OooOO0O(i, h91Var);
        OooO(d61VarOooOO0O, 1004, new dx0(6, d61VarOooOO0O, e91Var));
    }

    public final void OooO0o(b61 b61Var, Looper looper) {
        boolean z = true;
        if (this.f19580OooO0oO != null && !((rm0) this.f19577OooO0Oo.f23977OooOo0o).isEmpty()) {
            z = false;
        }
        af0.OooooO0(z);
        b61Var.getClass();
        this.f19580OooO0oO = b61Var;
        this.f19581OooO0oo = this.f19574OooO00o.OooO00o(looper, null);
        t00 t00Var = this.f19578OooO0o;
        this.f19578OooO0o = new t00(t00Var.f24218OooO0Oo, looper, t00Var.f24215OooO00o, new dx0(5, this, b61Var), t00Var.f24214OooO);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0o0(int i, h91 h91Var, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        d61 d61VarOooOO0O = OooOO0O(i, h91Var);
        OooO(d61VarOooOO0O, 1003, new rh0(d61VarOooOO0O, y81Var, e91Var, iOException, z));
    }

    public final d61 OooO0oO() {
        return OooOO0((h91) this.f19577OooO0Oo.f23979OooOoO0);
    }

    public final d61 OooO0oo(AbstractC1787lf abstractC1787lf, int i, h91 h91Var) {
        h91 h91Var2 = true == abstractC1787lf.OooOOOO() ? null : h91Var;
        this.f19574OooO00o.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (abstractC1787lf.equals(this.f19580OooO0oO.o00000Oo()) && i == this.f19580OooO0oO.o000000()) {
            z = true;
        }
        long jOooOo0O = 0;
        if (h91Var2 == null || !h91Var2.OooO0O0()) {
            if (z) {
                b61 b61Var = this.f19580OooO0oO;
                b61Var.f17421OooOoO0.OooO00o();
                w41 w41Var = b61Var.f17420OooOo;
                w41Var.OooOo00();
                jOooOo0O = w41Var.o0000O00(w41Var.f25227ooOO);
            } else if (!abstractC1787lf.OooOOOO()) {
                abstractC1787lf.OooO0o0(i, this.f19576OooO0OO, 0L).getClass();
                jOooOo0O = i80.OooOo0O(0L);
            }
        } else if (z && this.f19580OooO0oO.o00000oo() == h91Var2.f19658OooO0O0 && this.f19580OooO0oO.o0000() == h91Var2.f19659OooO0OO) {
            jOooOo0O = this.f19580OooO0oO.o0000oo();
        }
        long j = jOooOo0O;
        h91 h91Var3 = (h91) this.f19577OooO0Oo.f23979OooOoO0;
        AbstractC1787lf abstractC1787lfO00000Oo = this.f19580OooO0oO.o00000Oo();
        int iO000000 = this.f19580OooO0oO.o000000();
        long jO0000oo = this.f19580OooO0oO.o0000oo();
        b61 b61Var2 = this.f19580OooO0oO;
        b61Var2.f17421OooOoO0.OooO00o();
        w41 w41Var2 = b61Var2.f17420OooOo;
        w41Var2.OooOo00();
        return new d61(jElapsedRealtime, abstractC1787lf, i, h91Var2, j, abstractC1787lfO00000Oo, iO000000, h91Var3, jO0000oo, i80.OooOo0O(w41Var2.f25227ooOO.f23771OooOOo0));
    }

    public final d61 OooOO0(h91 h91Var) {
        this.f19580OooO0oO.getClass();
        AbstractC1787lf abstractC1787lf = h91Var == null ? null : (AbstractC1787lf) ((mn0) this.f19577OooO0Oo.f23975OooOo).get(h91Var);
        if (h91Var != null && abstractC1787lf != null) {
            return OooO0oo(abstractC1787lf, abstractC1787lf.OooOOO(h91Var.f19657OooO00o, this.f19575OooO0O0).f18576OooO0OO, h91Var);
        }
        int iO000000 = this.f19580OooO0oO.o000000();
        AbstractC1787lf abstractC1787lfO00000Oo = this.f19580OooO0oO.o00000Oo();
        if (iO000000 >= abstractC1787lfO00000Oo.OooO0OO()) {
            abstractC1787lfO00000Oo = AbstractC1787lf.f20867OooO00o;
        }
        return OooO0oo(abstractC1787lfO00000Oo, iO000000, null);
    }

    public final d61 OooOO0O(int i, h91 h91Var) {
        b61 b61Var = this.f19580OooO0oO;
        b61Var.getClass();
        if (h91Var != null) {
            return ((AbstractC1787lf) ((mn0) this.f19577OooO0Oo.f23975OooOo).get(h91Var)) != null ? OooOO0(h91Var) : OooO0oo(AbstractC1787lf.f20867OooO00o, i, h91Var);
        }
        AbstractC1787lf abstractC1787lfO00000Oo = b61Var.o00000Oo();
        if (i >= abstractC1787lfO00000Oo.OooO0OO()) {
            abstractC1787lfO00000Oo = AbstractC1787lf.f20867OooO00o;
        }
        return OooO0oo(abstractC1787lfO00000Oo, i, null);
    }

    public final d61 OooOO0o() {
        return OooOO0((h91) this.f19577OooO0Oo.f23980OooOoOO);
    }
}
