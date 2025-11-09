package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class z81 implements g91, f91 {

    /* renamed from: OooOo */
    public n81 f26123OooOo;

    /* renamed from: OooOo0O */
    public final h91 f26124OooOo0O;

    /* renamed from: OooOo0o */
    public final long f26125OooOo0o;

    /* renamed from: OooOoO */
    public f91 f26126OooOoO;

    /* renamed from: OooOoO0 */
    public g91 f26127OooOoO0;

    /* renamed from: OooOoOO */
    public long f26128OooOoOO = -9223372036854775807L;

    /* renamed from: OooOoo0 */
    public final eb1 f26129OooOoo0;

    public z81(h91 h91Var, eb1 eb1Var, long j) {
        this.f26124OooOo0O = h91Var;
        this.f26129OooOoo0 = eb1Var;
        this.f26125OooOo0o = j;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO00o(long j) {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.OooO00o(j);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0O0(long j, a61 a61Var) {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.OooO0O0(j, a61Var);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void OooO0OO(g91 g91Var) {
        f91 f91Var = this.f26126OooOoO;
        int i = i80.f19994OooO00o;
        f91Var.OooO0OO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0Oo(long j) {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        g91Var.OooO0Oo(j);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0o(za1[] za1VarArr, boolean[] zArr, ba1[] ba1VarArr, boolean[] zArr2, long j) {
        long j2 = this.f26128OooOoOO;
        long j3 = (j2 == -9223372036854775807L || j != this.f26125OooOo0o) ? j : j2;
        this.f26128OooOoOO = -9223372036854775807L;
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.OooO0o(za1VarArr, zArr, ba1VarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        g91Var.OooO0o0(j);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final /* bridge */ /* synthetic */ void OooO0oO(ca1 ca1Var) {
        f91 f91Var = this.f26126OooOoO;
        int i = i80.f19994OooO00o;
        f91Var.OooO0oO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0oo(f91 f91Var, long j) {
        this.f26126OooOoO = f91Var;
        g91 g91Var = this.f26127OooOoO0;
        if (g91Var != null) {
            long j2 = this.f26128OooOoOO;
            if (j2 == -9223372036854775807L) {
                j2 = this.f26125OooOo0o;
            }
            g91Var.OooO0oo(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        g91 g91Var = this.f26127OooOoO0;
        return g91Var != null && g91Var.OooOO0(f51Var);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long zzd() {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.zzd();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final ha1 zzh() {
        g91 g91Var = this.f26127OooOoO0;
        int i = i80.f19994OooO00o;
        return g91Var.zzh();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void zzk() {
        g91 g91Var = this.f26127OooOoO0;
        if (g91Var != null) {
            g91Var.zzk();
            return;
        }
        n81 n81Var = this.f26123OooOo;
        if (n81Var != null) {
            n81Var.OooOOo();
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        g91 g91Var = this.f26127OooOoO0;
        return g91Var != null && g91Var.zzp();
    }
}
