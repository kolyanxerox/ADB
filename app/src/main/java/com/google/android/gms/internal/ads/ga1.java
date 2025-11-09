package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ga1 implements g91, f91 {

    /* renamed from: OooOo, reason: collision with root package name */
    public f91 f19285OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final g91 f19286OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f19287OooOo0o;

    public ga1(g91 g91Var, long j) {
        this.f19286OooOo0O = g91Var;
        this.f19287OooOo0o = j;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO00o(long j) {
        g91 g91Var = this.f19286OooOo0O;
        long j2 = this.f19287OooOo0o;
        return g91Var.OooO00o(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0O0(long j, a61 a61Var) {
        g91 g91Var = this.f19286OooOo0O;
        long j2 = this.f19287OooOo0o;
        return g91Var.OooO0O0(j - j2, a61Var) + j2;
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void OooO0OO(g91 g91Var) {
        f91 f91Var = this.f19285OooOo;
        f91Var.getClass();
        f91Var.OooO0OO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0Oo(long j) {
        this.f19286OooOo0O.OooO0Oo(j - this.f19287OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0o(za1[] za1VarArr, boolean[] zArr, ba1[] ba1VarArr, boolean[] zArr2, long j) {
        ba1[] ba1VarArr2 = new ba1[ba1VarArr.length];
        int i = 0;
        while (true) {
            ba1 ba1Var = null;
            if (i >= ba1VarArr.length) {
                break;
            }
            fa1 fa1Var = (fa1) ba1VarArr[i];
            if (fa1Var != null) {
                ba1Var = fa1Var.f18909OooO00o;
            }
            ba1VarArr2[i] = ba1Var;
            i++;
        }
        long j2 = this.f19287OooOo0o;
        long jOooO0o = this.f19286OooOo0O.OooO0o(za1VarArr, zArr, ba1VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ba1VarArr.length; i2++) {
            ba1 ba1Var2 = ba1VarArr2[i2];
            if (ba1Var2 == null) {
                ba1VarArr[i2] = null;
            } else {
                ba1 ba1Var3 = ba1VarArr[i2];
                if (ba1Var3 == null || ((fa1) ba1Var3).f18909OooO00o != ba1Var2) {
                    ba1VarArr[i2] = new fa1(ba1Var2, j2);
                }
            }
        }
        return jOooO0o + j2;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
        this.f19286OooOo0O.OooO0o0(j - this.f19287OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final /* bridge */ /* synthetic */ void OooO0oO(ca1 ca1Var) {
        f91 f91Var = this.f19285OooOo;
        f91Var.getClass();
        f91Var.OooO0oO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0oo(f91 f91Var, long j) {
        this.f19285OooOo = f91Var;
        this.f19286OooOo0O.OooO0oo(this, j - this.f19287OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        e51 e51Var = new e51();
        e51Var.f18499OooO0O0 = f51Var.f18789OooO0O0;
        e51Var.f18500OooO0OO = f51Var.f18790OooO0OO;
        e51Var.f18498OooO00o = f51Var.f18788OooO00o - this.f19287OooOo0o;
        return this.f19286OooOo0O.OooOO0(new f51(e51Var));
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        long jZzb = this.f19286OooOo0O.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f19287OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        long jZzc = this.f19286OooOo0O.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f19287OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long zzd() {
        long jZzd = this.f19286OooOo0O.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f19287OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final ha1 zzh() {
        return this.f19286OooOo0O.zzh();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void zzk() {
        this.f19286OooOo0O.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        return this.f19286OooOo0O.zzp();
    }
}
