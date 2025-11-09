package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0OOOO0o extends o0OOOO00 {

    /* renamed from: OooOOO, reason: collision with root package name */
    public ab1 f22151OooOOO;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f22152OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f22153OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public p80 f22154OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public o000O0o f22155OooOOo0;

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final long OooO00o(r40 r40Var) {
        byte b = r40Var.f23745OooO00o[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ab1 ab1Var = this.f22151OooOOO;
        af0.OooOo0O(ab1Var);
        boolean z = ((o0000o0.OooOOO[]) ab1Var.f17023OooOoO)[(b >> 1) & (255 >>> (8 - ab1Var.f17021OooOo0O))].f29577OooOo0o;
        o000O0o o000o0o2 = (o000O0o) ab1Var.f17022OooOo0o;
        int i = !z ? o000o0o2.f21708OooO0o0 : o000o0o2.f21707OooO0o;
        int i2 = this.f22153OooOOOo ? (this.f22152OooOOOO + i) / 4 : 0;
        byte[] bArr = r40Var.f23745OooO00o;
        int length = bArr.length;
        int i3 = r40Var.f23747OooO0OO + 4;
        if (length < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
            r40Var.OooO0oo(bArrCopyOf.length, bArrCopyOf);
        } else {
            r40Var.OooO(i3);
        }
        long j = i2;
        byte[] bArr2 = r40Var.f23745OooO00o;
        int i4 = r40Var.f23747OooO0OO;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.f22153OooOOOo = true;
        this.f22152OooOOOO = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final void OooO0O0(boolean z) {
        super.OooO0O0(z);
        if (z) {
            this.f22151OooOOO = null;
            this.f22155OooOOo0 = null;
            this.f22154OooOOo = null;
        }
        this.f22152OooOOOO = 0;
        this.f22153OooOOOo = false;
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final boolean OooO0OO(r40 r40Var, long j, C2249xx c2249xx) throws C2185w6 {
        ab1 ab1Var;
        o000O0o o000o0o2;
        int i;
        int i2;
        o000O0o o000o0o3;
        long jFloor;
        if (this.f22151OooOOO != null) {
            ((o0OoOo0) c2249xx.f25815OooOo0o).getClass();
            return false;
        }
        o000O0o o000o0o4 = this.f22155OooOOo0;
        int i3 = 1;
        int i4 = 4;
        if (o000o0o4 == null) {
            ze0.Oooo0oO(1, r40Var, false);
            r40Var.OooOOoo();
            int iOooOo0O = r40Var.OooOo0O();
            int iOooOOoo = r40Var.OooOOoo();
            int iOooOOo = r40Var.OooOOo();
            if (iOooOOo <= 0) {
                iOooOOo = -1;
            }
            int iOooOOo2 = r40Var.OooOOo();
            int i5 = iOooOOo2 <= 0 ? -1 : iOooOOo2;
            r40Var.OooOOo();
            int iOooOo0O2 = r40Var.OooOo0O();
            int iPow = (int) Math.pow(2.0d, iOooOo0O2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iOooOo0O2 & 240) >> 4);
            r40Var.OooOo0O();
            ?? CopyOf = Arrays.copyOf(r40Var.f23745OooO00o, r40Var.f23747OooO0OO);
            o000O0o o000o0o5 = new o000O0o();
            o000o0o5.f21703OooO00o = iOooOo0O;
            o000o0o5.f21704OooO0O0 = iOooOOoo;
            o000o0o5.f21705OooO0OO = iOooOOo;
            o000o0o5.f21706OooO0Oo = i5;
            o000o0o5.f21708OooO0o0 = iPow;
            o000o0o5.f21707OooO0o = iPow2;
            o000o0o5.f21709OooO0oO = CopyOf;
            this.f22155OooOOo0 = o000o0o5;
        } else {
            p80 p80Var = this.f22154OooOOo;
            if (p80Var == null) {
                this.f22154OooOOo = ze0.Oooo0(r40Var, true, true);
            } else {
                int i6 = r40Var.f23747OooO0OO;
                byte[] bArr = new byte[i6];
                System.arraycopy(r40Var.f23745OooO00o, 0, bArr, 0, i6);
                int i7 = 5;
                ze0.Oooo0oO(5, r40Var, false);
                int iOooOo0O3 = r40Var.OooOo0O() + 1;
                o000OOo0 o000ooo02 = new o000OOo0(r40Var.f23745OooO00o);
                int i8 = 8;
                o000ooo02.OooO0o0(r40Var.f23746OooO0O0 * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    if (i9 < iOooOo0O3) {
                        int i12 = i8;
                        if (o000ooo02.OooO0Oo(24) != 5653314) {
                            throw C2185w6.OooO00o(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((o000ooo02.f21727OooO0Oo * 8) + o000ooo02.f21728OooO0o0));
                        }
                        int iOooO0Oo = o000ooo02.OooO0Oo(16);
                        int iOooO0Oo2 = o000ooo02.OooO0Oo(24);
                        if (o000ooo02.OooO0oO()) {
                            o000ooo02.OooO0o0(5);
                            for (int iOooO0Oo3 = 0; iOooO0Oo3 < iOooO0Oo2; iOooO0Oo3 += o000ooo02.OooO0Oo(ze0.OooO0OO(iOooO0Oo2 - iOooO0Oo3))) {
                            }
                        } else {
                            boolean zOooO0oO = o000ooo02.OooO0oO();
                            for (int i13 = 0; i13 < iOooO0Oo2; i13++) {
                                if (!zOooO0oO) {
                                    o000ooo02.OooO0o0(5);
                                } else if (o000ooo02.OooO0oO()) {
                                    o000ooo02.OooO0o0(5);
                                }
                            }
                        }
                        int iOooO0Oo4 = o000ooo02.OooO0Oo(i4);
                        if (iOooO0Oo4 > 2) {
                            throw C2185w6.OooO00o(null, "lookup type greater than 2 not decodable: " + iOooO0Oo4);
                        }
                        if (iOooO0Oo4 != 1) {
                            if (iOooO0Oo4 != 2) {
                                o000o0o3 = o000o0o4;
                            }
                            i9++;
                            i8 = i12;
                            o000o0o4 = o000o0o3;
                            i4 = 4;
                        } else {
                            i10 = iOooO0Oo4;
                        }
                        o000ooo02.OooO0o0(32);
                        o000ooo02.OooO0o0(32);
                        int iOooO0Oo5 = o000ooo02.OooO0Oo(i4) + 1;
                        o000ooo02.OooO0o0(1);
                        if (i10 != 1) {
                            o000o0o3 = o000o0o4;
                            jFloor = iOooO0Oo * iOooO0Oo2;
                        } else if (iOooO0Oo != 0) {
                            o000o0o3 = o000o0o4;
                            jFloor = (long) Math.floor(Math.pow(iOooO0Oo2, 1.0d / iOooO0Oo));
                        } else {
                            o000o0o3 = o000o0o4;
                            jFloor = 0;
                        }
                        o000ooo02.OooO0o0((int) (jFloor * iOooO0Oo5));
                        i9++;
                        i8 = i12;
                        o000o0o4 = o000o0o3;
                        i4 = 4;
                    } else {
                        o000O0o o000o0o6 = o000o0o4;
                        int i14 = i8;
                        int i15 = 6;
                        int iOooO0Oo6 = o000ooo02.OooO0Oo(6) + 1;
                        for (int i16 = 0; i16 < iOooO0Oo6; i16++) {
                            if (o000ooo02.OooO0Oo(16) != 0) {
                                throw C2185w6.OooO00o(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iOooO0Oo7 = o000ooo02.OooO0Oo(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < iOooO0Oo7) {
                                int iOooO0Oo8 = o000ooo02.OooO0Oo(i11);
                                if (iOooO0Oo8 == 0) {
                                    int i19 = i14;
                                    i = i3;
                                    o000ooo02.OooO0o0(i19);
                                    o000ooo02.OooO0o0(16);
                                    o000ooo02.OooO0o0(16);
                                    o000ooo02.OooO0o0(6);
                                    o000ooo02.OooO0o0(i19);
                                    int iOooO0Oo9 = o000ooo02.OooO0Oo(4) + 1;
                                    int i20 = 0;
                                    while (i20 < iOooO0Oo9) {
                                        o000ooo02.OooO0o0(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (iOooO0Oo8 != i3) {
                                        throw C2185w6.OooO00o(null, "floor type greater than 1 not decodable: " + iOooO0Oo8);
                                    }
                                    int iOooO0Oo10 = o000ooo02.OooO0Oo(i7);
                                    int[] iArr = new int[iOooO0Oo10];
                                    i = i3;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < iOooO0Oo10; i22++) {
                                        int iOooO0Oo11 = o000ooo02.OooO0Oo(4);
                                        iArr[i22] = iOooO0Oo11;
                                        if (iOooO0Oo11 > i21) {
                                            i21 = iOooO0Oo11;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = o000ooo02.OooO0Oo(i18) + 1;
                                        int iOooO0Oo12 = o000ooo02.OooO0Oo(i10);
                                        if (iOooO0Oo12 > 0) {
                                            i2 = i14;
                                            o000ooo02.OooO0o0(i2);
                                        } else {
                                            i2 = i14;
                                        }
                                        int i25 = 0;
                                        while (i25 < (i << iOooO0Oo12)) {
                                            o000ooo02.OooO0o0(i2);
                                            i25++;
                                            i2 = 8;
                                        }
                                        i24++;
                                        i14 = 8;
                                        i10 = 2;
                                        i18 = 3;
                                    }
                                    o000ooo02.OooO0o0(i10);
                                    int iOooO0Oo13 = o000ooo02.OooO0Oo(4);
                                    int i26 = 0;
                                    int i27 = 0;
                                    for (int i28 = 0; i28 < iOooO0Oo10; i28++) {
                                        i26 += iArr2[iArr[i28]];
                                        while (i27 < i26) {
                                            o000ooo02.OooO0o0(iOooO0Oo13);
                                            i27++;
                                        }
                                    }
                                }
                                i17++;
                                i3 = i;
                                i14 = 8;
                                i15 = 6;
                                i10 = 2;
                                i11 = 16;
                                i7 = 5;
                            } else {
                                int i29 = i3;
                                int iOooO0Oo14 = o000ooo02.OooO0Oo(i15) + 1;
                                int i30 = 0;
                                while (i30 < iOooO0Oo14) {
                                    if (o000ooo02.OooO0Oo(16) > 2) {
                                        throw C2185w6.OooO00o(null, "residueType greater than 2 is not decodable");
                                    }
                                    o000ooo02.OooO0o0(24);
                                    o000ooo02.OooO0o0(24);
                                    o000ooo02.OooO0o0(24);
                                    int iOooO0Oo15 = o000ooo02.OooO0Oo(i15) + 1;
                                    int i31 = 8;
                                    o000ooo02.OooO0o0(8);
                                    int[] iArr3 = new int[iOooO0Oo15];
                                    for (int i32 = 0; i32 < iOooO0Oo15; i32++) {
                                        iArr3[i32] = ((o000ooo02.OooO0oO() ? o000ooo02.OooO0Oo(5) : 0) * 8) + o000ooo02.OooO0Oo(3);
                                    }
                                    int i33 = 0;
                                    while (i33 < iOooO0Oo15) {
                                        int i34 = 0;
                                        while (i34 < i31) {
                                            if ((iArr3[i33] & (i29 << i34)) != 0) {
                                                o000ooo02.OooO0o0(i31);
                                            }
                                            i34++;
                                            i31 = 8;
                                        }
                                        i33++;
                                        i31 = 8;
                                    }
                                    i30++;
                                    i15 = 6;
                                }
                                int iOooO0Oo16 = o000ooo02.OooO0Oo(i15) + 1;
                                int i35 = 0;
                                while (i35 < iOooO0Oo16) {
                                    int iOooO0Oo17 = o000ooo02.OooO0Oo(16);
                                    if (iOooO0Oo17 != 0) {
                                        AbstractC1641hg.OooOO0("VorbisUtil", "mapping type other than 0 not supported: " + iOooO0Oo17);
                                        o000o0o2 = o000o0o6;
                                    } else {
                                        int iOooO0Oo18 = o000ooo02.OooO0oO() ? o000ooo02.OooO0Oo(4) + 1 : i29;
                                        boolean zOooO0oO2 = o000ooo02.OooO0oO();
                                        o000o0o2 = o000o0o6;
                                        int i36 = o000o0o2.f21703OooO00o;
                                        if (zOooO0oO2) {
                                            int iOooO0Oo19 = o000ooo02.OooO0Oo(8) + 1;
                                            for (int i37 = 0; i37 < iOooO0Oo19; i37++) {
                                                int i38 = i36 - 1;
                                                o000ooo02.OooO0o0(ze0.OooO0OO(i38));
                                                o000ooo02.OooO0o0(ze0.OooO0OO(i38));
                                            }
                                        }
                                        if (o000ooo02.OooO0Oo(2) != 0) {
                                            throw C2185w6.OooO00o(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iOooO0Oo18 > i29) {
                                            for (int i39 = 0; i39 < i36; i39++) {
                                                o000ooo02.OooO0o0(4);
                                            }
                                        }
                                        for (int i40 = 0; i40 < iOooO0Oo18; i40++) {
                                            o000ooo02.OooO0o0(8);
                                            o000ooo02.OooO0o0(8);
                                            o000ooo02.OooO0o0(8);
                                        }
                                    }
                                    i35++;
                                    o000o0o6 = o000o0o2;
                                    i29 = 1;
                                }
                                o000O0o o000o0o7 = o000o0o6;
                                int iOooO0Oo20 = o000ooo02.OooO0Oo(6);
                                int i41 = iOooO0Oo20 + 1;
                                o0000o0.OooOOO[] oooOOOArr = new o0000o0.OooOOO[i41];
                                for (int i42 = 0; i42 < i41; i42++) {
                                    boolean zOooO0oO3 = o000ooo02.OooO0oO();
                                    o000ooo02.OooO0Oo(16);
                                    o000ooo02.OooO0Oo(16);
                                    o000ooo02.OooO0Oo(8);
                                    oooOOOArr[i42] = new o0000o0.OooOOO(zOooO0oO3, 1);
                                }
                                if (!o000ooo02.OooO0oO()) {
                                    throw C2185w6.OooO00o(null, "framing bit after modes not set as expected");
                                }
                                ab1Var = new ab1(o000o0o7, p80Var, bArr, oooOOOArr, ze0.OooO0OO(iOooO0Oo20));
                            }
                        }
                    }
                }
            }
        }
        ab1Var = null;
        this.f22151OooOOO = ab1Var;
        if (ab1Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        o000O0o o000o0o8 = (o000O0o) ab1Var.f17022OooOo0o;
        arrayList.add((byte[]) o000o0o8.f21709OooO0oO);
        arrayList.add((byte[]) ab1Var.f17024OooOoO0);
        C2107u2 c2107u2OooOo0o = ze0.OooOo0o(rm0.OooOOOo((String[]) ((p80) ab1Var.f17020OooOo).f23242OooOo0o));
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO("audio/vorbis");
        jb1Var.f20247OooO0oO = o000o0o8.f21706OooO0Oo;
        jb1Var.f20248OooO0oo = o000o0o8.f21705OooO0OO;
        jb1Var.f20264OooOoOO = o000o0o8.f21703OooO00o;
        jb1Var.f20266OooOoo0 = o000o0o8.f21704OooO0O0;
        jb1Var.f20253OooOOOO = arrayList;
        jb1Var.f20249OooOO0 = c2107u2OooOo0o;
        c2249xx.f25815OooOo0o = new o0OoOo0(jb1Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0OOOO00
    public final void OooO0Oo(long j) {
        this.f22146OooO0oO = j;
        this.f22153OooOOOo = j != 0;
        o000O0o o000o0o2 = this.f22155OooOOo0;
        this.f22152OooOOOO = o000o0o2 != null ? o000o0o2.f21708OooO0o0 : 0;
    }
}
