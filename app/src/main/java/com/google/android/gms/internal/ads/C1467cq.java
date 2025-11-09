package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cq */
/* loaded from: classes2.dex */
public final class C1467cq {

    /* renamed from: OooO, reason: collision with root package name */
    public final short[] f18022OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f18023OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f18024OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final float f18025OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final float f18026OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f18027OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f18028OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f18029OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f18030OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public short[] f18031OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f18032OooOO0O;
    public short[] OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public short[] f18033OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f18034OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f18035OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public int f18036OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public int f18037OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public int f18038OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public int f18039OooOOoo;
    public int OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public int f18040OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f18041OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public double f18042OooOo0o;

    public C1467cq(int i, int i2, float f, float f2, int i3) {
        this.f18023OooO00o = i;
        this.f18024OooO0O0 = i2;
        this.f18025OooO0OO = f;
        this.f18026OooO0Oo = f2;
        this.f18028OooO0o0 = i / i3;
        this.f18027OooO0o = i / CommonGatewayClient.CODE_400;
        int i4 = i / 65;
        this.f18029OooO0oO = i4;
        int i5 = i4 + i4;
        this.f18030OooO0oo = i5;
        this.f18022OooO = new short[i5];
        int i6 = i5 * i2;
        this.f18031OooOO0 = new short[i6];
        this.OooOO0o = new short[i6];
        this.f18033OooOOO = new short[i6];
    }

    public static void OooO0Oo(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i7])) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int OooO00o(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.f18024OooO0O0 * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.OooOo0 = i4 / i6;
        this.f18041OooOo0O = i7 / i5;
        return i6;
    }

    public final void OooO0O0(short[] sArr, int i, int i2) {
        short[] sArrOooO0o = OooO0o(this.OooOO0o, this.f18034OooOOO0, i2);
        this.OooOO0o = sArrOooO0o;
        int i3 = this.f18034OooOOO0;
        int i4 = this.f18024OooO0O0;
        System.arraycopy(sArr, i * i4, sArrOooO0o, i3 * i4, i2 * i4);
        this.f18034OooOOO0 += i2;
    }

    public final void OooO0OO(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.f18030OooO0oo / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f18024OooO0O0;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i3 * i4) + (i7 * i) + i5];
                    i5++;
                }
            }
            this.f18022OooO[i4] = (short) (i6 / i3);
        }
    }

    public final short[] OooO0o(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f18024OooO0O0;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final void OooO0o0() {
        float f;
        double d;
        int iOooO00o;
        int i;
        int iRound;
        int iRound2;
        float f2;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        float f3 = this.f18025OooO0OO;
        float f4 = this.f18026OooO0Oo;
        double d2 = f3 / f4;
        int i5 = this.f18034OooOOO0;
        int i6 = this.f18023OooO00o;
        int i7 = this.f18024OooO0O0;
        int i8 = 0;
        int i9 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i10 = this.f18032OooOO0O;
            int i11 = this.f18030OooO0oo;
            if (i10 >= i11) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f18037OooOOo;
                    if (i13 > 0) {
                        int iMin = Math.min(i11, i13);
                        OooO0O0(this.f18031OooOO0, i12, iMin);
                        this.f18037OooOOo -= iMin;
                        i12 += iMin;
                        f = f4;
                        d = d2;
                    } else {
                        short[] sArr = this.f18031OooOO0;
                        int i14 = i6 > 4000 ? i6 / 4000 : i9;
                        int i15 = this.f18029OooO0oO;
                        int i16 = this.f18027OooO0o;
                        if (i7 == i9 && i14 == i9) {
                            iOooO00o = OooO00o(sArr, i12, i16, i15);
                            f = f4;
                            d = d2;
                        } else {
                            OooO0OO(sArr, i12, i14);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.f18022OooO;
                            int iOooO00o2 = OooO00o(sArr2, i8, i16 / i14, i15 / i14);
                            if (i14 != 1) {
                                int i17 = iOooO00o2 * i14;
                                int i18 = i14 * 4;
                                int i19 = i17 - i18;
                                if (i19 >= i16) {
                                    i16 = i19;
                                }
                                int i20 = i17 + i18;
                                if (i20 <= i15) {
                                    i15 = i20;
                                }
                                if (i7 == 1) {
                                    iOooO00o = OooO00o(sArr, i12, i16, i15);
                                } else {
                                    OooO0OO(sArr, i12, 1);
                                    iOooO00o = OooO00o(sArr2, i8, i16, i15);
                                }
                            } else {
                                iOooO00o = iOooO00o2;
                            }
                        }
                        int i21 = this.OooOo0;
                        int i22 = this.f18041OooOo0O;
                        if (i21 == 0 || (i = this.f18039OooOOoo) == 0 || i22 > i21 * 3 || i21 + i21 <= this.f18040OooOo00 * 3) {
                            i = iOooO00o;
                        }
                        int i23 = i12 + i;
                        this.f18040OooOo00 = i21;
                        this.f18039OooOOoo = iOooO00o;
                        double d3 = i;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f18031OooOO0;
                            double d4 = d - 1.0d;
                            if (d >= 2.0d) {
                                double d5 = (d3 / d4) + this.f18042OooOo0o;
                                iRound2 = (int) Math.round(d5);
                                this.f18042OooOo0o = d5 - iRound2;
                            } else {
                                double d6 = ((d3 * (2.0d - d)) / d4) + this.f18042OooOo0o;
                                int iRound3 = (int) Math.round(d6);
                                this.f18037OooOOo = iRound3;
                                this.f18042OooOo0o = d6 - iRound3;
                                iRound2 = i;
                            }
                            short[] sArrOooO0o = OooO0o(this.OooOO0o, this.f18034OooOOO0, iRound2);
                            this.OooOO0o = sArrOooO0o;
                            int i24 = i12;
                            int i25 = iRound2;
                            OooO0Oo(i25, this.f18024OooO0O0, sArrOooO0o, this.f18034OooOOO0, sArr3, i24, sArr3, i23);
                            this.f18034OooOOO0 += i25;
                            i12 = i + i25 + i24;
                        } else {
                            int i26 = i12;
                            short[] sArr4 = this.f18031OooOO0;
                            double d7 = 1.0d - d;
                            if (d < 0.5d) {
                                double d8 = ((d3 * d) / d7) + this.f18042OooOo0o;
                                iRound = (int) Math.round(d8);
                                this.f18042OooOo0o = d8 - iRound;
                            } else {
                                double d9 = ((d3 * ((d + d) - 1.0d)) / d7) + this.f18042OooOo0o;
                                int iRound4 = (int) Math.round(d9);
                                this.f18037OooOOo = iRound4;
                                this.f18042OooOo0o = d9 - iRound4;
                                iRound = i;
                            }
                            int i27 = i + iRound;
                            short[] sArrOooO0o2 = OooO0o(this.OooOO0o, this.f18034OooOOO0, i27);
                            this.OooOO0o = sArrOooO0o2;
                            System.arraycopy(sArr4, i26 * i7, sArrOooO0o2, this.f18034OooOOO0 * i7, i * i7);
                            int i28 = iRound;
                            OooO0Oo(i28, this.f18024OooO0O0, this.OooOO0o, this.f18034OooOOO0 + i, sArr4, i23, sArr4, i26);
                            this.f18034OooOOO0 += i27;
                            i12 = i26 + i28;
                        }
                    }
                    if (i12 + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                    f4 = f;
                    d2 = d;
                    i8 = 0;
                }
                int i29 = this.f18032OooOO0O - i12;
                short[] sArr5 = this.f18031OooOO0;
                System.arraycopy(sArr5, i12 * i7, sArr5, 0, i29 * i7);
                this.f18032OooOO0O = i29;
            }
            f2 = this.f18028OooO0o0 * f;
            if (f2 != 1.0f || this.f18034OooOOO0 == i5) {
            }
            long j3 = i6;
            long j4 = (long) (i6 / f2);
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i30 = this.f18034OooOOO0 - i5;
            short[] sArrOooO0o3 = OooO0o(this.f18033OooOOO, this.f18035OooOOOO, i30);
            this.f18033OooOOO = sArrOooO0o3;
            System.arraycopy(this.OooOO0o, i5 * i7, sArrOooO0o3, this.f18035OooOOOO * i7, i30 * i7);
            this.f18034OooOOO0 = i5;
            this.f18035OooOOOO += i30;
            int i31 = 0;
            while (true) {
                i2 = this.f18035OooOOOO;
                i3 = i2 - 1;
                if (i31 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.f18036OooOOOo + 1;
                    j = i4;
                    long j5 = j * j4;
                    j2 = this.f18038OooOOo0;
                    if (j5 <= j2 * j3) {
                        break;
                    }
                    this.OooOO0o = OooO0o(this.OooOO0o, this.f18034OooOOO0, 1);
                    int i32 = 0;
                    while (i32 < i7) {
                        short[] sArr6 = this.OooOO0o;
                        int i33 = this.f18034OooOOO0 * i7;
                        short[] sArr7 = this.f18033OooOOO;
                        int i34 = (i31 * i7) + i32;
                        short s = sArr7[i34];
                        short s2 = sArr7[i34 + i7];
                        long j6 = j4;
                        long j7 = (r11 + 1) * j6;
                        long j8 = j7 - (this.f18036OooOOOo * j6);
                        long j9 = j7 - (this.f18038OooOOo0 * j3);
                        sArr6[i33 + i32] = (short) ((((j8 - j9) * s2) + (j9 * s)) / j8);
                        i32++;
                        j4 = j6;
                    }
                    this.f18038OooOOo0++;
                    this.f18034OooOOO0++;
                    j4 = j4;
                }
                long j10 = j4;
                this.f18036OooOOOo = i4;
                if (j == j3) {
                    this.f18036OooOOOo = 0;
                    af0.OooooO0(j2 == j10);
                    this.f18038OooOOo0 = 0;
                }
                i31++;
                j4 = j10;
            }
            if (i3 != 0) {
                short[] sArr8 = this.f18033OooOOO;
                System.arraycopy(sArr8, i3 * i7, sArr8, 0, (i2 - i3) * i7);
                this.f18035OooOOOO -= i3;
                return;
            }
            return;
        }
        OooO0O0(this.f18031OooOO0, 0, this.f18032OooOO0O);
        this.f18032OooOO0O = 0;
        f = f4;
        f2 = this.f18028OooO0o0 * f;
        if (f2 != 1.0f) {
        }
    }
}
