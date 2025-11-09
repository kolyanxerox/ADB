package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00oOoo implements o00000O {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O f21840OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21842OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o00O000 f21843OooO0oO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f21845OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o00O00 f21846OooOO0O;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f21849OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f21850OooOOOo;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f21839OooO0OO = true;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f21837OooO00o = new r40(12);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0ooO f21838OooO0O0 = new o0O0ooO();

    /* renamed from: OooO0o, reason: collision with root package name */
    public o0000Ooo f21841OooO0o = new o0O(16);

    /* renamed from: OooO, reason: collision with root package name */
    public o00O00[] f21836OooO = new o00O00[0];

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f21848OooOOO0 = -1;

    /* renamed from: OooOOO, reason: collision with root package name */
    public long f21847OooOOO = -1;
    public int OooOO0o = -1;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f21844OooO0oo = -9223372036854775807L;

    public o00oOoo(o0O o0o) {
        this.f21840OooO0Oo = o0o;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        this.f21845OooOO0 = -1L;
        this.f21846OooOO0O = null;
        for (o00O00 o00o00 : this.f21836OooO) {
            if (o00o00.f21750OooOO0 == 0) {
                o00o00.f21749OooO0oo = 0;
            } else {
                o00o00.f21749OooO0oo = o00o00.f21752OooOOO0[i80.OooOO0(o00o00.OooOO0o, j, true)];
            }
        }
        if (j == 0) {
            this.f21842OooO0o0 = this.f21836OooO.length != 0 ? 3 : 0;
        } else {
            this.f21842OooO0o0 = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        r40 r40Var = this.f21837OooO00o;
        ((o000000) o00000oo2).OooO0o(r40Var.f23745OooO00o, 0, 12, false);
        r40Var.OooOO0(0);
        if (r40Var.OooOOo() == 1179011410) {
            r40Var.OooOO0O(4);
            if (r40Var.OooOOo() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f21842OooO0o0 = 0;
        if (this.f21839OooO0OO) {
            o0000ooo = new de0(o0000ooo, this.f21840OooO0Oo);
        }
        this.f21841OooO0o = o0000ooo;
        this.f21845OooOO0 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x038e  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r30, com.google.android.gms.internal.ads.o0000O00 r31) throws com.google.android.gms.internal.ads.C2185w6, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00oOoo.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
