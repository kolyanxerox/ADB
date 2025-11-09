package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class o0000O0 {

    /* renamed from: OooO */
    public final int f21657OooO;

    /* renamed from: OooO00o */
    public final int f21658OooO00o;

    /* renamed from: OooO0O0 */
    public final int f21659OooO0O0;

    /* renamed from: OooO0OO */
    public final int f21660OooO0OO;

    /* renamed from: OooO0Oo */
    public final int f21661OooO0Oo;

    /* renamed from: OooO0o */
    public final int f21662OooO0o;

    /* renamed from: OooO0o0 */
    public final int f21663OooO0o0;

    /* renamed from: OooO0oO */
    public final int f21664OooO0oO;

    /* renamed from: OooO0oo */
    public final int f21665OooO0oo;

    /* renamed from: OooOO0 */
    public final long f21666OooOO0;

    /* renamed from: OooOO0O */
    public final C2249xx f21667OooOO0O;
    public final C2107u2 OooOO0o;

    public o0000O0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C2249xx c2249xx, C2107u2 c2107u2) {
        this.f21658OooO00o = i;
        this.f21659OooO0O0 = i2;
        this.f21660OooO0OO = i3;
        this.f21661OooO0Oo = i4;
        this.f21663OooO0o0 = i5;
        this.f21662OooO0o = OooO0Oo(i5);
        this.f21664OooO0oO = i6;
        this.f21665OooO0oo = i7;
        this.f21657OooO = OooO0OO(i7);
        this.f21666OooOO0 = j;
        this.f21667OooOO0O = c2249xx;
        this.OooOO0o = c2107u2;
    }

    public static int OooO0OO(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int OooO0Oo(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long OooO00o() {
        long j = this.f21666OooOO0;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f21663OooO0o0;
    }

    public final o0OoOo0 OooO0O0(byte[] bArr, C2107u2 c2107u2) {
        bArr[4] = -128;
        C2107u2 c2107u22 = this.OooOO0o;
        if (c2107u22 != null) {
            c2107u2 = c2107u22.OooO0o0(c2107u2);
        }
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO("audio/flac");
        int i = this.f21661OooO0Oo;
        if (i <= 0) {
            i = -1;
        }
        jb1Var.f20252OooOOO0 = i;
        jb1Var.f20264OooOoOO = this.f21664OooO0oO;
        jb1Var.f20266OooOoo0 = this.f21663OooO0o0;
        jb1Var.f20265OooOoo = i80.OooOOo0(this.f21665OooO0oo);
        jb1Var.f20253OooOOOO = Collections.singletonList(bArr);
        jb1Var.f20249OooOO0 = c2107u2;
        return new o0OoOo0(jb1Var);
    }

    public o0000O0(byte[] bArr, int i) {
        o000OOo0 o000ooo02 = new o000OOo0(bArr, bArr.length);
        o000ooo02.OooOOoo(i * 8);
        this.f21658OooO00o = o000ooo02.OooO0o(16);
        this.f21659OooO0O0 = o000ooo02.OooO0o(16);
        this.f21660OooO0OO = o000ooo02.OooO0o(24);
        this.f21661OooO0Oo = o000ooo02.OooO0o(24);
        int iOooO0o = o000ooo02.OooO0o(20);
        this.f21663OooO0o0 = iOooO0o;
        this.f21662OooO0o = OooO0Oo(iOooO0o);
        this.f21664OooO0oO = o000ooo02.OooO0o(3) + 1;
        int iOooO0o2 = o000ooo02.OooO0o(5) + 1;
        this.f21665OooO0oo = iOooO0o2;
        this.f21657OooO = OooO0OO(iOooO0o2);
        this.f21666OooOO0 = o000ooo02.OooO0oo(36);
        this.f21667OooOO0O = null;
        this.OooOO0o = null;
    }
}
