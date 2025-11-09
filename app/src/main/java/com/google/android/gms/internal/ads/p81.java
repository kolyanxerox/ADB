package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* loaded from: classes2.dex */
public final class p81 implements g91, f91 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final z81 f23244OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public f91 f23245OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f23246OooOoO;

    /* renamed from: OooOo, reason: collision with root package name */
    public o81[] f23243OooOo = new o81[0];

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f23247OooOoO0 = 0;

    public p81(z81 z81Var, long j) {
        this.f23244OooOo0O = z81Var;
        this.f23246OooOoO = j;
    }

    public final boolean OooO() {
        return this.f23247OooOoO0 != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO00o(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f23247OooOoO0 = r0
            com.google.android.gms.internal.ads.o81[] r0 = r7.f23243OooOo
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f22364OooO0O0 = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.gms.internal.ads.z81 r0 = r7.f23244OooOo0O
            long r0 = r0.OooO00o(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L34
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L35
            long r3 = r7.f23246OooOoO
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L34
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L35
        L34:
            r2 = r9
        L35:
            com.google.android.gms.internal.ads.af0.OooooO0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p81.OooO00o(long):long");
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0O0(long j, a61 a61Var) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(a61Var.f16918OooO00o, j));
        long j2 = this.f23246OooOoO;
        long j3 = j2 == Long.MIN_VALUE ? LocationRequestCompat.PASSIVE_INTERVAL : j2 - j;
        long j4 = a61Var.f16919OooO0O0;
        long jMax2 = Math.max(0L, Math.min(j4, j3));
        if (jMax != a61Var.f16918OooO00o || jMax2 != j4) {
            a61Var = new a61(jMax, jMax2);
        }
        return this.f23244OooOo0O.OooO0O0(j, a61Var);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void OooO0OO(g91 g91Var) {
        f91 f91Var = this.f23245OooOo0o;
        f91Var.getClass();
        f91Var.OooO0OO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0Oo(long j) {
        this.f23244OooOo0O.OooO0Oo(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.google.android.gms.internal.ads.g91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0o(com.google.android.gms.internal.ads.za1[] r14, boolean[] r15, com.google.android.gms.internal.ads.ba1[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r16
            int r1 = r0.length
            com.google.android.gms.internal.ads.o81[] r2 = new com.google.android.gms.internal.ads.o81[r1]
            r13.f23243OooOo = r2
            com.google.android.gms.internal.ads.ba1[] r6 = new com.google.android.gms.internal.ads.ba1[r1]
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r0.length
            r10 = 0
            if (r2 >= r3) goto L20
            com.google.android.gms.internal.ads.o81[] r3 = r13.f23243OooOo
            r4 = r0[r2]
            com.google.android.gms.internal.ads.o81 r4 = (com.google.android.gms.internal.ads.o81) r4
            r3[r2] = r4
            if (r4 == 0) goto L1b
            com.google.android.gms.internal.ads.ba1 r10 = r4.f22363OooO00o
        L1b:
            r6[r2] = r10
            int r2 = r2 + 1
            goto Lb
        L20:
            com.google.android.gms.internal.ads.z81 r3 = r13.f23244OooOo0O
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            long r14 = r3.OooO0o(r4, r5, r6, r7, r8)
            boolean r2 = r13.OooO()
            r3 = 0
            if (r2 == 0) goto L3a
            int r2 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r2 != 0) goto L3a
            r7 = r3
            goto L3c
        L3a:
            r7 = r18
        L3c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13.f23247OooOoO0 = r11
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            r5 = 1
            if (r2 == 0) goto L5a
            int r2 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r2 < 0) goto L59
            long r2 = r13.f23246OooOoO
            r7 = -9223372036854775808
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L5a
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L59
            goto L5a
        L59:
            r5 = r1
        L5a:
            com.google.android.gms.internal.ads.af0.OooooO0(r5)
        L5d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            r2 = r6[r1]
            if (r2 != 0) goto L69
            com.google.android.gms.internal.ads.o81[] r2 = r13.f23243OooOo
            r2[r1] = r10
            goto L7a
        L69:
            com.google.android.gms.internal.ads.o81[] r3 = r13.f23243OooOo
            r4 = r3[r1]
            if (r4 == 0) goto L73
            com.google.android.gms.internal.ads.ba1 r4 = r4.f22363OooO00o
            if (r4 == r2) goto L7a
        L73:
            com.google.android.gms.internal.ads.o81 r4 = new com.google.android.gms.internal.ads.o81
            r4.<init>(r13, r2)
            r3[r1] = r4
        L7a:
            com.google.android.gms.internal.ads.o81[] r2 = r13.f23243OooOo
            r2 = r2[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5d
        L83:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p81.OooO0o(com.google.android.gms.internal.ads.za1[], boolean[], com.google.android.gms.internal.ads.ba1[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
        this.f23244OooOo0O.OooO0o0(j);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final /* bridge */ /* synthetic */ void OooO0oO(ca1 ca1Var) {
        f91 f91Var = this.f23245OooOo0o;
        f91Var.getClass();
        f91Var.OooO0oO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0oo(f91 f91Var, long j) {
        this.f23245OooOo0o = f91Var;
        this.f23244OooOo0O.OooO0oo(this, j);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        return this.f23244OooOo0O.OooOO0(f51Var);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        long jZzb = this.f23244OooOo0O.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.f23246OooOoO;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        long jZzc = this.f23244OooOo0O.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.f23246OooOoO;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long zzd() {
        if (OooO()) {
            long j = this.f23247OooOoO0;
            this.f23247OooOoO0 = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.f23244OooOo0O.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        af0.OooooO0(jZzd2 >= 0);
        long j2 = this.f23246OooOoO;
        af0.OooooO0(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final ha1 zzh() {
        return this.f23244OooOo0O.zzh();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void zzk() {
        this.f23244OooOo0O.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        return this.f23244OooOo0O.zzp();
    }
}
