package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class oO0OO00o implements oOo0000O {

    /* renamed from: OooO, reason: collision with root package name */
    public int f22670OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final r40 f22671OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f22673OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f22674OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o000O f22675OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public String f22676OooO0o0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f22678OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f22679OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o0OoOo0 f22680OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f22682OooOOO0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22677OooO0oO = 0;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public long f22684OooOOOo = -9223372036854775807L;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f22672OooO0O0 = new AtomicInteger();

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f22681OooOOO = -1;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f22683OooOOOO = -1;

    public oO0OO00o(String str, int i, int i2) {
        this.f22671OooO00o = new r40(new byte[i2]);
        this.f22673OooO0OO = str;
        this.f22674OooO0Oo = i;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO00o(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0O0(r40 r40Var) throws C2185w6 {
        int i;
        boolean z;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        int i5;
        byte b3;
        int i6;
        long jOooOo0;
        int i7;
        int i8;
        int i9;
        int iOooO0o;
        int i10;
        int iOooO0o2;
        long jOooOo02;
        int i11;
        int i12 = 4;
        af0.OooOo0O(this.f22675OooO0o);
        while (r40Var.OooOOOO() > 0) {
            int i13 = this.f22677OooO0oO;
            r40 r40Var2 = this.f22671OooO00o;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        int iOooO0o3 = -2147483647;
                        int i14 = 8;
                        if (i13 != 3) {
                            if (i13 == i12) {
                                i6 = i12;
                                if (OooO0o(r40Var, r40Var2.f23745OooO00o, 6)) {
                                    o000OOo0 o000ooo0OooO0oO = wz0.OooO0oO(r40Var2.f23745OooO00o);
                                    o000ooo0OooO0oO.OooOo0(32);
                                    int iOooO0o4 = wz0.OooO0o(o000ooo0OooO0oO, wz0.f25452OooOOOO) + 1;
                                    this.f22683OooOOOO = iOooO0o4;
                                    int i15 = this.f22678OooO0oo;
                                    if (i15 > iOooO0o4) {
                                        int i16 = i15 - iOooO0o4;
                                        this.f22678OooO0oo = i15 - i16;
                                        r40Var.OooOO0(r40Var.f23746OooO0O0 - i16);
                                    }
                                    this.f22677OooO0oO = 5;
                                }
                            } else if (i13 != 5) {
                                int iMin = Math.min(r40Var.OooOOOO(), this.OooOO0o - this.f22678OooO0oo);
                                this.f22675OooO0o.OooO0Oo(iMin, r40Var);
                                int i17 = this.f22678OooO0oo + iMin;
                                this.f22678OooO0oo = i17;
                                if (i17 == this.OooOO0o) {
                                    af0.OooooO0(this.f22684OooOOOo != -9223372036854775807L);
                                    this.f22675OooO0o.OooO00o(this.f22684OooOOOo, this.f22682OooOOO0 == i12 ? 0 : 1, this.OooOO0o, 0, null);
                                    this.f22684OooOOOo += this.f22679OooOO0;
                                    this.f22677OooO0oO = 0;
                                }
                            } else if (OooO0o(r40Var, r40Var2.f23745OooO00o, this.f22683OooOOOO)) {
                                AtomicInteger atomicInteger = this.f22672OooO0O0;
                                byte[] bArr = r40Var2.f23745OooO00o;
                                i6 = i12;
                                o000OOo0 o000ooo0OooO0oO2 = wz0.OooO0oO(bArr);
                                int iOooO0o5 = o000ooo0OooO0oO2.OooO0o(32);
                                int iOooO0o6 = wz0.OooO0o(o000ooo0OooO0oO2, wz0.f25449OooOO0O);
                                int i18 = iOooO0o6 + 1;
                                char c = iOooO0o5 == 1078008818 ? (char) 1 : (char) 0;
                                if (c == 0) {
                                    jOooOo0 = -9223372036854775807L;
                                } else {
                                    if (!o000ooo0OooO0oO2.OooOo0o()) {
                                        throw C2185w6.OooO0O0("Only supports full channel mask-based audio presentation");
                                    }
                                    int i19 = iOooO0o6 - 1;
                                    int i20 = bArr[i19] << 8;
                                    int i21 = bArr[iOooO0o6] & ForkServer.ERROR;
                                    int i22 = i80.f19994OooO00o;
                                    char c2 = 65535;
                                    for (int i23 = 0; i23 < i19; i23++) {
                                        byte b4 = bArr[i23];
                                        int i24 = (c2 >> '\f') ^ ((b4 & ForkServer.ERROR) >> 4);
                                        int[] iArr = i80.OooOO0o;
                                        char c3 = (char) (iArr[i24] ^ ((char) (c2 << 4)));
                                        c2 = (char) (((char) (c3 << 4)) ^ iArr[(b4 & 15) ^ (c3 >> '\f')]);
                                    }
                                    if ((((char) i20) | i21) != c2) {
                                        throw C2185w6.OooO00o(null, "CRC check failed");
                                    }
                                    int iOooO0o7 = o000ooo0OooO0oO2.OooO0o(2);
                                    if (iOooO0o7 != 0) {
                                        if (iOooO0o7 == 1) {
                                            i8 = 480;
                                        } else {
                                            if (iOooO0o7 != 2) {
                                                throw C2185w6.OooO00o(null, "Unsupported base duration index in DTS UHD header: " + iOooO0o7);
                                            }
                                            i8 = 384;
                                        }
                                        i7 = 3;
                                    } else {
                                        i7 = 3;
                                        i8 = 512;
                                    }
                                    int iOooO0o8 = o000ooo0OooO0oO2.OooO0o(i7) + 1;
                                    int iOooO0o9 = o000ooo0OooO0oO2.OooO0o(2);
                                    if (iOooO0o9 == 0) {
                                        i9 = 32000;
                                    } else if (iOooO0o9 == 1) {
                                        i9 = 44100;
                                    } else {
                                        if (iOooO0o9 != 2) {
                                            throw C2185w6.OooO00o(null, "Unsupported clock rate index in DTS UHD header: " + iOooO0o9);
                                        }
                                        i9 = 48000;
                                    }
                                    if (o000ooo0OooO0oO2.OooOo0o()) {
                                        o000ooo0OooO0oO2.OooOo0(36);
                                    }
                                    iOooO0o3 = i9 * (1 << o000ooo0OooO0oO2.OooO0o(2));
                                    jOooOo0 = i80.OooOo0(i8 * iOooO0o8, 1000000L, i9, RoundingMode.DOWN);
                                }
                                int i25 = iOooO0o3;
                                int iOooO0o10 = 0;
                                for (char c4 = 0; c4 < c; c4 = 1) {
                                    iOooO0o10 += wz0.OooO0o(o000ooo0OooO0oO2, wz0.OooOO0o);
                                }
                                for (int i26 = 0; i26 <= 0; i26++) {
                                    if (c != 0) {
                                        atomicInteger.set(wz0.OooO0o(o000ooo0OooO0oO2, wz0.f25451OooOOO0));
                                    }
                                    iOooO0o10 += atomicInteger.get() != 0 ? wz0.OooO0o(o000ooo0OooO0oO2, wz0.f25450OooOOO) : 0;
                                }
                                int i27 = i18 + iOooO0o10;
                                oo000o oo000oVar = new oo000o("audio/vnd.dts.uhd;profile=p2", 2, i25, i27, jOooOo0);
                                if (this.f22682OooOOO0 == 3) {
                                    OooO0o0(oo000oVar);
                                }
                                this.OooOO0o = i27;
                                this.f22679OooOO0 = jOooOo0 == -9223372036854775807L ? 0L : jOooOo0;
                                r40Var2.OooOO0(0);
                                this.f22675OooO0o.OooO0Oo(this.f22683OooOOOO, r40Var2);
                                this.f22677OooO0oO = 6;
                            } else {
                                continue;
                            }
                            i12 = i6;
                        } else {
                            int i28 = i12;
                            if (OooO0o(r40Var, r40Var2.f23745OooO00o, this.f22681OooOOO)) {
                                o000OOo0 o000ooo0OooO0oO3 = wz0.OooO0oO(r40Var2.f23745OooO00o);
                                o000ooo0OooO0oO3.OooOo0(40);
                                int iOooO0o11 = o000ooo0OooO0oO3.OooO0o(2);
                                boolean zOooOo0o = o000ooo0OooO0oO3.OooOo0o();
                                int i29 = true != zOooOo0o ? 16 : 20;
                                o000ooo0OooO0oO3.OooOo0(true != zOooOo0o ? 8 : 12);
                                int iOooO0o12 = o000ooo0OooO0oO3.OooO0o(i29) + 1;
                                boolean zOooOo0o2 = o000ooo0OooO0oO3.OooOo0o();
                                if (zOooOo0o2) {
                                    iOooO0o = o000ooo0OooO0oO3.OooO0o(2);
                                    int iOooO0o13 = o000ooo0OooO0oO3.OooO0o(3) + 1;
                                    if (o000ooo0OooO0oO3.OooOo0o()) {
                                        o000ooo0OooO0oO3.OooOo0(36);
                                    }
                                    int iOooO0o14 = o000ooo0OooO0oO3.OooO0o(3) + 1;
                                    int iOooO0o15 = o000ooo0OooO0oO3.OooO0o(3) + 1;
                                    if (iOooO0o14 != 1 || iOooO0o15 != 1) {
                                        throw C2185w6.OooO0O0("Multiple audio presentations or assets not supported");
                                    }
                                    int i30 = iOooO0o11 + 1;
                                    int iOooO0o16 = o000ooo0OooO0oO3.OooO0o(i30);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if (((iOooO0o16 >> i31) & 1) == 1) {
                                            o000ooo0OooO0oO3.OooOo0(i14);
                                        }
                                        i31++;
                                        i14 = 8;
                                    }
                                    i10 = iOooO0o13 * 512;
                                    if (o000ooo0OooO0oO3.OooOo0o()) {
                                        o000ooo0OooO0oO3.OooOo0(2);
                                        int iOooO0o17 = (o000ooo0OooO0oO3.OooO0o(2) + 1) << 2;
                                        int iOooO0o18 = o000ooo0OooO0oO3.OooO0o(2) + 1;
                                        for (int i32 = 0; i32 < iOooO0o18; i32++) {
                                            o000ooo0OooO0oO3.OooOo0(iOooO0o17);
                                        }
                                    }
                                } else {
                                    iOooO0o = -1;
                                    i10 = 0;
                                }
                                o000ooo0OooO0oO3.OooOo0(i29);
                                o000ooo0OooO0oO3.OooOo0(12);
                                if (zOooOo0o2) {
                                    if (o000ooo0OooO0oO3.OooOo0o()) {
                                        o000ooo0OooO0oO3.OooOo0(i28);
                                    }
                                    if (o000ooo0OooO0oO3.OooOo0o()) {
                                        o000ooo0OooO0oO3.OooOo0(24);
                                    }
                                    if (o000ooo0OooO0oO3.OooOo0o()) {
                                        o000ooo0OooO0oO3.OooOo0O(o000ooo0OooO0oO3.OooO0o(10) + 1);
                                    }
                                    o000ooo0OooO0oO3.OooOo0(5);
                                    iOooO0o3 = wz0.f25448OooOO0[o000ooo0OooO0oO3.OooO0o(4)];
                                    iOooO0o2 = o000ooo0OooO0oO3.OooO0o(8) + 1;
                                } else {
                                    iOooO0o2 = -1;
                                }
                                int i33 = iOooO0o3;
                                if (zOooOo0o2) {
                                    if (iOooO0o == 0) {
                                        i11 = 32000;
                                    } else if (iOooO0o == 1) {
                                        i11 = 44100;
                                    } else {
                                        if (iOooO0o != 2) {
                                            throw C2185w6.OooO00o(null, "Unsupported reference clock code in DTS HD header: " + iOooO0o);
                                        }
                                        i11 = 48000;
                                    }
                                    jOooOo02 = i80.OooOo0(i10, 1000000L, i11, RoundingMode.DOWN);
                                } else {
                                    jOooOo02 = -9223372036854775807L;
                                }
                                OooO0o0(new oo000o("audio/vnd.dts.hd;profile=lbr", iOooO0o2, i33, iOooO0o12, jOooOo02));
                                this.OooOO0o = iOooO0o12;
                                this.f22679OooOO0 = jOooOo02 == -9223372036854775807L ? 0L : jOooOo02;
                                r40Var2.OooOO0(0);
                                this.f22675OooO0o.OooO0Oo(this.f22681OooOOO, r40Var2);
                                this.f22677OooO0oO = 6;
                            }
                        }
                    } else if (OooO0o(r40Var, r40Var2.f23745OooO00o, 7)) {
                        o000OOo0 o000ooo0OooO0oO4 = wz0.OooO0oO(r40Var2.f23745OooO00o);
                        o000ooo0OooO0oO4.OooOo0(42);
                        this.f22681OooOOO = o000ooo0OooO0oO4.OooO0o(true != o000ooo0OooO0oO4.OooOo0o() ? 8 : 12) + 1;
                        this.f22677OooO0oO = 3;
                    }
                } else if (OooO0o(r40Var, r40Var2.f23745OooO00o, 18)) {
                    byte[] bArr2 = r40Var2.f23745OooO00o;
                    if (this.f22680OooOO0O == null) {
                        String str = this.f22676OooO0o0;
                        o000OOo0 o000ooo0OooO0oO5 = wz0.OooO0oO(bArr2);
                        o000ooo0OooO0oO5.OooOo0(60);
                        int i34 = wz0.f25446OooO0oO[o000ooo0OooO0oO5.OooO0o(6)];
                        int i35 = wz0.f25447OooO0oo[o000ooo0OooO0oO5.OooO0o(4)];
                        int iOooO0o19 = o000ooo0OooO0oO5.OooO0o(5);
                        int i36 = iOooO0o19 >= 29 ? -1 : (wz0.f25439OooO[iOooO0o19] * 1000) / 2;
                        o000ooo0OooO0oO5.OooOo0(10);
                        int i37 = i34 + (o000ooo0OooO0oO5.OooO0o(2) > 0 ? 1 : 0);
                        jb1 jb1Var = new jb1();
                        jb1Var.f20241OooO00o = str;
                        jb1Var.OooO0OO("audio/vnd.dts");
                        jb1Var.f20247OooO0oO = i36;
                        jb1Var.f20264OooOoOO = i37;
                        jb1Var.f20266OooOoo0 = i35;
                        jb1Var.f20254OooOOOo = null;
                        jb1Var.f20244OooO0Oo = this.f22673OooO0OO;
                        jb1Var.f20245OooO0o = this.f22674OooO0Oo;
                        o0OoOo0 o0oooo0 = new o0OoOo0(jb1Var);
                        this.f22680OooOO0O = o0oooo0;
                        this.f22675OooO0o.OooO0o0(o0oooo0);
                    }
                    byte b5 = bArr2[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i4 = (bArr2[7] & 3) << 12;
                            i5 = (bArr2[6] & ForkServer.ERROR) << 4;
                            b3 = bArr2[9];
                        } else if (b5 != 31) {
                            i = (((bArr2[5] & 3) << 12) | ((bArr2[6] & ForkServer.ERROR) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                            z = false;
                        } else {
                            i4 = (bArr2[6] & 3) << 12;
                            i5 = (bArr2[7] & ForkServer.ERROR) << 4;
                            b3 = bArr2[8];
                        }
                        i = (i4 | i5 | ((b3 & 60) >> 2)) + 1;
                        z = true;
                    } else {
                        i = (((bArr2[4] & 3) << 12) | ((bArr2[7] & ForkServer.ERROR) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                        z = false;
                    }
                    if (z) {
                        i = (i * 16) / 14;
                    }
                    this.OooOO0o = i;
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i2 = (bArr2[4] & 7) << 4;
                            b2 = bArr2[7];
                        } else if (b5 != 31) {
                            i2 = (bArr2[4] & 1) << 6;
                            b = bArr2[5];
                        } else {
                            i2 = (bArr2[5] & 7) << 4;
                            b2 = bArr2[6];
                        }
                        i3 = b2 & 60;
                        this.f22679OooOO0 = ii0.OooOo0O(i80.OooOo00(this.f22680OooOO0O.f22235OooOoo, (((i3 >> 2) | i2) + 1) * 32));
                        r40Var2.OooOO0(0);
                        this.f22675OooO0o.OooO0Oo(18, r40Var2);
                        this.f22677OooO0oO = 6;
                    } else {
                        i2 = (bArr2[5] & 1) << 6;
                        b = bArr2[4];
                    }
                    i3 = b & 252;
                    this.f22679OooOO0 = ii0.OooOo0O(i80.OooOo00(this.f22680OooOO0O.f22235OooOoo, (((i3 >> 2) | i2) + 1) * 32));
                    r40Var2.OooOO0(0);
                    this.f22675OooO0o.OooO0Oo(18, r40Var2);
                    this.f22677OooO0oO = 6;
                }
                i12 = 4;
            } else {
                while (r40Var.OooOOOO() > 0) {
                    int i38 = this.f22670OooO << 8;
                    this.f22670OooO = i38;
                    int iOooOo0O = i38 | r40Var.OooOo0O();
                    this.f22670OooO = iOooOo0O;
                    int i39 = (iOooOo0O == 2147385345 || iOooOo0O == -25230976 || iOooOo0O == 536864768 || iOooOo0O == -14745368) ? 1 : (iOooOo0O == 1683496997 || iOooOo0O == 622876772) ? 2 : (iOooOo0O == 1078008818 || iOooOo0O == -233094848) ? 3 : (iOooOo0O == 1908687592 || iOooOo0O == -398277519) ? 4 : 0;
                    this.f22682OooOOO0 = i39;
                    if (i39 != 0) {
                        byte[] bArr3 = r40Var2.f23745OooO00o;
                        bArr3[0] = (byte) ((iOooOo0O >> 24) & 255);
                        bArr3[1] = (byte) ((iOooOo0O >> 16) & 255);
                        bArr3[2] = (byte) ((iOooOo0O >> 8) & 255);
                        bArr3[3] = (byte) (iOooOo0O & 255);
                        this.f22678OooO0oo = 4;
                        this.f22670OooO = 0;
                        if (i39 == 3 || i39 == 4) {
                            this.f22677OooO0oO = 4;
                        } else if (i39 == 1) {
                            this.f22677OooO0oO = 1;
                        } else {
                            this.f22677OooO0oO = 2;
                        }
                        i12 = 4;
                    }
                }
                i12 = 4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0OO(int i, long j) {
        this.f22684OooOOOo = j;
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void OooO0Oo(o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
        ooo00o00.OooO00o();
        ooo00o00.OooO0O0();
        this.f22676OooO0o0 = ooo00o00.f22887OooO0o0;
        ooo00o00.OooO0O0();
        this.f22675OooO0o = o0000ooo.OooO0oO(ooo00o00.f22886OooO0Oo, 1);
    }

    public final boolean OooO0o(r40 r40Var, byte[] bArr, int i) {
        int iMin = Math.min(r40Var.OooOOOO(), i - this.f22678OooO0oo);
        r40Var.OooO0o(bArr, this.f22678OooO0oo, iMin);
        int i2 = this.f22678OooO0oo + iMin;
        this.f22678OooO0oo = i2;
        return i2 == i;
    }

    public final void OooO0o0(oo000o oo000oVar) {
        int i;
        int i2 = oo000oVar.f23024OooO0O0;
        if (i2 == -2147483647 || (i = oo000oVar.f23025OooO0OO) == -1) {
            return;
        }
        o0OoOo0 o0oooo0 = this.f22680OooOO0O;
        String str = oo000oVar.f23023OooO00o;
        if (o0oooo0 != null && i == o0oooo0.f22236OooOoo0 && i2 == o0oooo0.f22235OooOoo && str.equals(o0oooo0.f22222OooOOO0)) {
            return;
        }
        o0OoOo0 o0oooo02 = this.f22680OooOO0O;
        jb1 jb1Var = o0oooo02 == null ? new jb1() : new jb1(o0oooo02);
        jb1Var.f20241OooO00o = this.f22676OooO0o0;
        jb1Var.OooO0OO(str);
        jb1Var.f20264OooOoOO = i;
        jb1Var.f20266OooOoo0 = i2;
        jb1Var.f20244OooO0Oo = this.f22673OooO0OO;
        jb1Var.f20245OooO0o = this.f22674OooO0Oo;
        o0OoOo0 o0oooo03 = new o0OoOo0(jb1Var);
        this.f22680OooOO0O = o0oooo03;
        this.f22675OooO0o.OooO0o0(o0oooo03);
    }

    @Override // com.google.android.gms.internal.ads.oOo0000O
    public final void zze() {
        this.f22677OooO0oO = 0;
        this.f22678OooO0oo = 0;
        this.f22670OooO = 0;
        this.f22684OooOOOo = -9223372036854775807L;
        this.f22672OooO0O0.set(0);
    }
}
