package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0O00 implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public int f21773OooO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public v91 f21777OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o000O f21779OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public C2107u2 f21780OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o0000O0 f21781OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f21782OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o00O0 f21783OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public long f21784OooOOO0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f21774OooO00o = new byte[42];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f21775OooO0O0 = new r40(new byte[32768], 0);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O00 f21776OooO0OO = new o0000O00();

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f21778OooO0o = 0;

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f21778OooO0o = 0;
        } else {
            o00O0 o00o0 = this.f21783OooOO0O;
            if (o00o0 != null) {
                o00o0.OooO0O0(j2);
            }
        }
        this.f21784OooOOO0 = j2 != 0 ? -1L : 0L;
        this.OooOO0o = 0;
        this.f21775OooO0O0.OooO0oO(0);
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        C2107u2 c2107u2OooO00o = new o000(0).OooO00o((o000000) o00000oo2, AbstractC1641hg.f19728OooOO0O);
        if (c2107u2OooO00o != null) {
            c2107u2OooO00o.OooO00o();
        }
        r40 r40Var = new r40(4);
        ((o000000) o00000oo2).OooO0o(r40Var.f23745OooO00o, 0, 4, false);
        return r40Var.OooOooO() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        v91 v91Var = (v91) o0000ooo;
        this.f21777OooO0Oo = v91Var;
        this.f21779OooO0o0 = v91Var.OooO0oO(0, 1);
        v91Var.OooO0OO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) throws C2185w6, EOFException, InterruptedIOException {
        o0000O0 o0000o02;
        int i;
        v91 v91Var;
        o000O00 o0000ooVar;
        v91 v91Var2;
        long j;
        boolean z;
        long j2;
        boolean zOooo00O;
        int i2 = 2;
        boolean z2 = true;
        int i3 = this.f21778OooO0o;
        C2107u2 c2107u2 = null;
        if (i3 == 0) {
            ((o000000) o00000oo2).f21651OooOoOO = 0;
            o000000 o000000Var = (o000000) o00000oo2;
            long jZze = o000000Var.zze();
            C2107u2 c2107u2OooO00o = new o000(0).OooO00o(o000000Var, null);
            if (c2107u2OooO00o != null && c2107u2OooO00o.OooO00o() != 0) {
                c2107u2 = c2107u2OooO00o;
            }
            o000000Var.OooO((int) (o000000Var.zze() - jZze));
            this.f21780OooO0oO = c2107u2;
            this.f21778OooO0o = 1;
            return 0;
        }
        byte[] bArr = this.f21774OooO00o;
        if (i3 == 1) {
            ((o000000) o00000oo2).OooO0o(bArr, 0, 42, false);
            ((o000000) o00000oo2).f21651OooOoOO = 0;
            this.f21778OooO0o = 2;
            return 0;
        }
        int i4 = 3;
        if (i3 == 2) {
            r40 r40Var = new r40(4);
            ((o000000) o00000oo2).OooO0o0(r40Var.f23745OooO00o, 0, 4, false);
            if (r40Var.OooOooO() != 1716281667) {
                throw C2185w6.OooO00o(null, "Failed to read FLAC stream marker.");
            }
            this.f21778OooO0o = 3;
            return 0;
        }
        if (i3 != 3) {
            long jOooo000 = 0;
            if (i3 == 4) {
                ((o000000) o00000oo2).f21651OooOoOO = 0;
                r40 r40Var2 = new r40(2);
                o000000 o000000Var2 = (o000000) o00000oo2;
                o000000Var2.OooO0o(r40Var2.f23745OooO00o, 0, 2, false);
                int iOooOoO = r40Var2.OooOoO();
                if ((iOooOoO >> 2) != 16382) {
                    o000000Var2.f21651OooOoOO = 0;
                    throw C2185w6.OooO00o(null, "First frame does not start with sync code.");
                }
                o000000Var2.f21651OooOoOO = 0;
                this.f21782OooOO0 = iOooOoO;
                v91 v91Var3 = this.f21777OooO0Oo;
                int i5 = i80.f19994OooO00o;
                long j3 = o000000Var2.f21650OooOoO0;
                o0000O0 o0000o03 = this.f21781OooO0oo;
                o0000o03.getClass();
                if (o0000o03.f21667OooOO0O != null) {
                    o0000ooVar = new o0000oo(o0000o03, 0, j3);
                    i = 0;
                    v91Var2 = v91Var3;
                } else {
                    long j4 = o000000Var2.f21646OooOo;
                    if (j4 == -1 || o0000o03.f21666OooOO0 <= 0) {
                        i = 0;
                        v91Var = v91Var3;
                        o0000ooVar = new o0000oo(o0000o03.OooO00o(), 0L);
                    } else {
                        int i6 = this.f21782OooOO0;
                        sj0 sj0Var = new sj0(o0000o03, i2);
                        oOo0o00 ooo0o00 = new oOo0o00(o0000o03, i6);
                        long jOooO00o = o0000o03.OooO00o();
                        int i7 = o0000o03.f21660OooO0OO;
                        int i8 = o0000o03.f21661OooO0Oo;
                        if (i8 > 0) {
                            j = ((i8 + i7) / 2) + 1;
                            i = 0;
                            v91Var = v91Var3;
                        } else {
                            int i9 = o0000o03.f21659OooO0O0;
                            long j5 = 4096;
                            int i10 = o0000o03.f21658OooO00o;
                            if (i10 == i9 && i10 > 0) {
                                j5 = i10;
                            }
                            i = 0;
                            v91Var = v91Var3;
                            j = (((j5 * o0000o03.f21664OooO0oO) * o0000o03.f21665OooO0oo) / 8) + 64;
                        }
                        o00O0 o00o0 = new o00O0(sj0Var, ooo0o00, jOooO00o, o0000o03.f21666OooOO0, j3, j4, j, Math.max(6, i7));
                        this.f21783OooOO0O = o00o0;
                        o0000ooVar = o00o0.f21737OooO00o;
                    }
                    v91Var2 = v91Var;
                }
                v91Var2.OooO(o0000ooVar);
                this.f21778OooO0o = 5;
                return i;
            }
            this.f21779OooO0o0.getClass();
            this.f21781OooO0oo.getClass();
            o00O0 o00o02 = this.f21783OooOO0O;
            if (o00o02 != null && o00o02.f21739OooO0OO != null) {
                return o00o02.OooO00o((o000000) o00000oo2, o0000o00);
            }
            if (this.f21784OooOOO0 == -1) {
                ((o000000) o00000oo2).f21651OooOoOO = 0;
                o000000 o000000Var3 = (o000000) o00000oo2;
                o000000Var3.OooO0oO(1, false);
                byte[] bArr2 = new byte[1];
                o000000Var3.OooO0o(bArr2, 0, 1, false);
                int i11 = bArr2[0] & 1;
                boolean z3 = 1 == i11;
                o000000Var3.OooO0oO(2, false);
                i = 1 != i11 ? 6 : 7;
                r40 r40Var3 = new r40(i);
                byte[] bArr3 = r40Var3.f23745OooO00o;
                int i12 = 0;
                while (i12 < i) {
                    int iOooO0OO = o000000Var3.OooO0OO(bArr3, i12, i - i12);
                    if (iOooO0OO == -1) {
                        break;
                    }
                    i12 += iOooO0OO;
                }
                r40Var3.OooO(i12);
                o000000Var3.f21651OooOoOO = 0;
                try {
                    jOooo000 = r40Var3.Oooo000();
                    if (!z3) {
                        jOooo000 *= r4.f21659OooO0O0;
                    }
                } catch (NumberFormatException unused) {
                    z2 = false;
                }
                if (!z2) {
                    throw C2185w6.OooO00o(null, null);
                }
                this.f21784OooOOO0 = jOooo000;
            } else {
                r40 r40Var4 = this.f21775OooO0O0;
                int i13 = r40Var4.f23747OooO0OO;
                if (i13 < 32768) {
                    int iOooOO0 = ((o000000) o00000oo2).OooOO0(r40Var4.f23745OooO00o, i13, 32768 - i13);
                    z = iOooOO0 == -1;
                    if (!z) {
                        r40Var4.OooO(i13 + iOooOO0);
                    } else if (r40Var4.OooOOOO() == 0) {
                        long j6 = this.f21784OooOOO0 * 1000000;
                        o0000O0 o0000o04 = this.f21781OooO0oo;
                        int i14 = i80.f19994OooO00o;
                        this.f21779OooO0o0.OooO00o(j6 / o0000o04.f21663OooO0o0, 1, this.OooOO0o, 0, null);
                        return -1;
                    }
                } else {
                    z = false;
                }
                int i15 = r40Var4.f23746OooO0O0;
                int i16 = this.OooOO0o;
                int i17 = this.f21773OooO;
                if (i16 < i17) {
                    r40Var4.OooOO0O(Math.min(i17 - i16, r40Var4.OooOOOO()));
                }
                this.f21781OooO0oo.getClass();
                int i18 = r40Var4.f23746OooO0O0;
                while (true) {
                    int i19 = r40Var4.f23747OooO0OO - 16;
                    o0000O00 o0000o002 = this.f21776OooO0OO;
                    if (i18 <= i19) {
                        r40Var4.OooOO0(i18);
                        if (af0.Oooo00O(r40Var4, this.f21781OooO0oo, this.f21782OooOO0, o0000o002)) {
                            r40Var4.OooOO0(i18);
                            j2 = o0000o002.f21668OooO00o;
                            break;
                        }
                        i18++;
                    } else {
                        if (z) {
                            while (true) {
                                int i20 = r40Var4.f23747OooO0OO;
                                if (i18 > i20 - this.f21773OooO) {
                                    r40Var4.OooOO0(i20);
                                    break;
                                }
                                r40Var4.OooOO0(i18);
                                try {
                                    zOooo00O = af0.Oooo00O(r40Var4, this.f21781OooO0oo, this.f21782OooOO0, o0000o002);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zOooo00O = false;
                                }
                                if (r40Var4.f23746OooO0O0 <= r40Var4.f23747OooO0OO && zOooo00O) {
                                    r40Var4.OooOO0(i18);
                                    j2 = o0000o002.f21668OooO00o;
                                    break;
                                }
                                i18++;
                            }
                        } else {
                            r40Var4.OooOO0(i18);
                        }
                        j2 = -1;
                    }
                }
                int i21 = r40Var4.f23746OooO0O0 - i15;
                r40Var4.OooOO0(i15);
                this.f21779OooO0o0.OooO0Oo(i21, r40Var4);
                int i22 = this.OooOO0o + i21;
                this.OooOO0o = i22;
                if (j2 != -1) {
                    long j7 = this.f21784OooOOO0 * 1000000;
                    o0000O0 o0000o05 = this.f21781OooO0oo;
                    int i23 = i80.f19994OooO00o;
                    this.f21779OooO0o0.OooO00o(j7 / o0000o05.f21663OooO0o0, 1, i22, 0, null);
                    this.OooOO0o = 0;
                    this.f21784OooOOO0 = j2;
                }
                if (r40Var4.OooOOOO() < 16) {
                    int iOooOOOO = r40Var4.OooOOOO();
                    byte[] bArr4 = r40Var4.f23745OooO00o;
                    System.arraycopy(bArr4, r40Var4.f23746OooO0O0, bArr4, 0, iOooOOOO);
                    r40Var4.OooOO0(0);
                    r40Var4.OooO(iOooOOOO);
                    return 0;
                }
            }
            return 0;
        }
        ?? r1 = 0;
        o0000O0 o0000o06 = this.f21781OooO0oo;
        while (true) {
            ((o000000) o00000oo2).f21651OooOoOO = r1;
            byte[] bArr5 = new byte[4];
            o000OOo0 o000ooo02 = new o000OOo0(bArr5, 4);
            o000000 o000000Var4 = (o000000) o00000oo2;
            o000000Var4.OooO0o(bArr5, r1, 4, r1);
            boolean zOooOo0o = o000ooo02.OooOo0o();
            int iOooO0o = o000ooo02.OooO0o(i);
            int iOooO0o2 = o000ooo02.OooO0o(24) + 4;
            if (iOooO0o == 0) {
                byte[] bArr6 = new byte[38];
                o000000Var4.OooO0o0(bArr6, r1, 38, r1);
                o0000o06 = new o0000O0(bArr6, 4);
            } else {
                if (o0000o06 == null) {
                    throw new IllegalArgumentException();
                }
                if (iOooO0o == i4) {
                    r40 r40Var5 = new r40(iOooO0o2);
                    o000000Var4.OooO0o0(r40Var5.f23745OooO00o, 0, iOooO0o2, false);
                    o0000o06 = new o0000O0(o0000o06.f21658OooO00o, o0000o06.f21659OooO0O0, o0000o06.f21660OooO0OO, o0000o06.f21661OooO0Oo, o0000o06.f21663OooO0o0, o0000o06.f21664OooO0oO, o0000o06.f21665OooO0oo, o0000o06.f21666OooOO0, ze0.OooOo(r40Var5), o0000o06.OooOO0o);
                } else {
                    C2107u2 c2107u22 = o0000o06.OooOO0o;
                    if (iOooO0o == 4) {
                        r40 r40Var6 = new r40(iOooO0o2);
                        o000000Var4.OooO0o0(r40Var6.f23745OooO00o, 0, iOooO0o2, false);
                        r40Var6.OooOO0O(4);
                        C2107u2 c2107u2OooOo0o = ze0.OooOo0o(Arrays.asList((String[]) ze0.Oooo0(r40Var6, false, false).f23242OooOo0o));
                        if (c2107u22 != null) {
                            c2107u2OooOo0o = c2107u22.OooO0o0(c2107u2OooOo0o);
                        }
                        o0000o02 = new o0000O0(o0000o06.f21658OooO00o, o0000o06.f21659OooO0O0, o0000o06.f21660OooO0OO, o0000o06.f21661OooO0Oo, o0000o06.f21663OooO0o0, o0000o06.f21664OooO0oO, o0000o06.f21665OooO0oo, o0000o06.f21666OooOO0, o0000o06.f21667OooOO0O, c2107u2OooOo0o);
                    } else if (iOooO0o == 6) {
                        r40 r40Var7 = new r40(iOooO0o2);
                        o000000Var4.OooO0o0(r40Var7.f23745OooO00o, 0, iOooO0o2, false);
                        r40Var7.OooOO0O(4);
                        C2107u2 c2107u23 = new C2107u2(rm0.OooOOo0(o00OO0O0.OooO00o(r40Var7)));
                        if (c2107u22 != null) {
                            c2107u23 = c2107u22.OooO0o0(c2107u23);
                        }
                        o0000o02 = new o0000O0(o0000o06.f21658OooO00o, o0000o06.f21659OooO0O0, o0000o06.f21660OooO0OO, o0000o06.f21661OooO0Oo, o0000o06.f21663OooO0o0, o0000o06.f21664OooO0oO, o0000o06.f21665OooO0oo, o0000o06.f21666OooOO0, o0000o06.f21667OooOO0O, c2107u23);
                    } else {
                        o000000Var4.OooO(iOooO0o2);
                    }
                    o0000o06 = o0000o02;
                }
            }
            int i24 = i80.f19994OooO00o;
            this.f21781OooO0oo = o0000o06;
            if (zOooOo0o) {
                this.f21773OooO = Math.max(o0000o06.f21660OooO0OO, 6);
                this.f21779OooO0o0.OooO0o0(this.f21781OooO0oo.OooO0O0(bArr, this.f21780OooO0oO));
                this.f21778OooO0o = 4;
                return 0;
            }
            r1 = 0;
            i4 = 3;
            i = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
