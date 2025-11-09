package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o81 implements ba1 {

    /* renamed from: OooO00o */
    public final ba1 f22363OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f22364OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ p81 f22365OooO0OO;

    public o81(p81 p81Var, ba1 ba1Var) {
        this.f22365OooO0OO = p81Var;
        this.f22363OooO00o = ba1Var;
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final int OooO00o(long j) {
        if (this.f22365OooO0OO.OooO()) {
            return -3;
        }
        return this.f22363OooO00o.OooO00o(j);
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final int OooO0O0(dx0 dx0Var, c41 c41Var, int i) {
        p81 p81Var = this.f22365OooO0OO;
        if (p81Var.OooO()) {
            return -3;
        }
        if (this.f22364OooO0O0) {
            c41Var.f24281OooO0O0 = 4;
            return -4;
        }
        long jZzb = p81Var.zzb();
        int iOooO0O0 = this.f22363OooO00o.OooO0O0(dx0Var, c41Var, i);
        if (iOooO0O0 != -5) {
            long j = p81Var.f23246OooOoO;
            if (j == Long.MIN_VALUE || ((iOooO0O0 != -4 || c41Var.f17683OooO0oO < j) && !(iOooO0O0 == -3 && jZzb == Long.MIN_VALUE && !c41Var.f17681OooO0o))) {
                return iOooO0O0;
            }
            c41Var.OooO0Oo();
            c41Var.f24281OooO0O0 = 4;
            this.f22364OooO0O0 = true;
            return -4;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) dx0Var.f18419OooOo0o;
        o0oooo0.getClass();
        int i2 = o0oooo0.f22240Oooo000;
        int i3 = o0oooo0.f22238OooOooo;
        if (i3 == 0) {
            if (i2 == 0) {
                return -5;
            }
            i3 = 0;
        }
        int i4 = p81Var.f23246OooOoO == Long.MIN_VALUE ? i2 : 0;
        jb1 jb1Var = new jb1(o0oooo0);
        jb1Var.f20267OooOooO = i3;
        jb1Var.f20268OooOooo = i4;
        dx0Var.f18419OooOo0o = new o0OoOo0(jb1Var);
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final void zzd() {
        this.f22363OooO00o.zzd();
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final boolean zze() {
        return !this.f22365OooO0OO.OooO() && this.f22363OooO00o.zze();
    }
}
