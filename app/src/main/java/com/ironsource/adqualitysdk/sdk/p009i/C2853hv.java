package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2844hm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hv */
/* loaded from: classes2.dex */
public class C2853hv extends AbstractC2844hm {

    /* renamed from: ﮐ */
    private List<Class> f6662 = new ArrayList();

    /* renamed from: ﱟ */
    private List<Class> f6663;

    /* renamed from: ﱡ */
    private Class f6664;

    /* renamed from: ﺙ */
    private boolean f6665;

    /* renamed from: ﻏ */
    private int f6666;

    /* renamed from: ｋ */
    private int f6667;

    public C2853hv() {
        mo6875();
    }

    /* renamed from: ﭖ */
    public final int m6947() {
        return this.f6666;
    }

    /* renamed from: ﮐ */
    public final List<Class> m6948() {
        return this.f6663;
    }

    /* renamed from: ﱟ */
    public final int m6949() {
        return this.f6667;
    }

    /* renamed from: ﱡ */
    public final List<Class> m6950() {
        return this.f6662;
    }

    /* renamed from: ﺙ */
    public final boolean m6951() {
        return this.f6665;
    }

    /* renamed from: ﻏ */
    public final Class m6952() {
        return this.f6664;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hv$a */
    public static class a extends AbstractC2844hm.c implements InterfaceC2707ck {

        /* renamed from: ﻐ */
        private static long f6668 = 1609200948675792367L;

        /* renamed from: ﻛ */
        private static int f6669 = 0;

        /* renamed from: ﾇ */
        private static int[] f6670 = {-129357110, 347140254, -552350281, 1622005726, 2062429550, 1505933401, 262872982, -1663125662, 1549923047, -1381309151, -607586045, -1276496287, 1959461654, 134699940, -1118718795, 629247644, -516180928, -1060319385};

        /* renamed from: ﾒ */
        private static int f6671 = 1;

        /* renamed from: ｋ */
        private C2853hv f6672 = new C2853hv();

        /* renamed from: ﻐ */
        private a m6953(int i) {
            C2853hv c2853hv;
            int i2;
            int i3 = f6669 + 113;
            f6671 = i3 % 128;
            if (i3 % 2 == 0) {
                c2853hv = this.f6672;
                i2 = i ^ c2853hv.f6619;
            } else {
                c2853hv = this.f6672;
                i2 = i | c2853hv.f6619;
            }
            c2853hv.f6619 = i2;
            return this;
        }

        /* renamed from: ﻛ */
        private a m6957(Class cls) {
            f6671 = (f6669 + 61) % 128;
            this.f6672.f6664 = cls;
            f6669 = (f6671 + 17) % 128;
            return this;
        }

        /* renamed from: ｋ */
        private a m6960(boolean z) {
            int i = f6669 + 5;
            f6671 = i % 128;
            if (i % 2 == 0) {
                this.f6672.f6665 = z;
                throw null;
            }
            this.f6672.f6665 = z;
            f6671 = (f6669 + 21) % 128;
            return this;
        }

        /* renamed from: ﾇ */
        private a m6961(int i) {
            int i2 = f6669 + 107;
            f6671 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f6672.f6667 = i;
                int i3 = 54 / 0;
            } else {
                this.f6672.f6667 = i;
            }
            f6669 = (f6671 + 123) % 128;
            return this;
        }

        /* renamed from: ﾒ */
        private a m6964(int i) {
            f6669 = (f6671 + 5) % 128;
            this.f6672.f6666 = i;
            int i2 = f6669 + 83;
            f6671 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
            }
            return this;
        }

        /* renamed from: ﻐ */
        private a m6955(boolean z, int i) {
            int i2 = f6671 + 119;
            f6669 = i2 % 128;
            if (i2 % 2 == 0) {
                C2853hv c2853hv = this.f6672;
                c2853hv.f6618 = z;
                c2853hv.f6621 = i;
                return this;
            }
            C2853hv c2853hv2 = this.f6672;
            c2853hv2.f6618 = z;
            c2853hv2.f6621 = i;
            throw null;
        }

        /* renamed from: ﻛ */
        private a m6956(int i) {
            int i2 = f6669;
            int i3 = i2 + 3;
            f6671 = i3 % 128;
            int i4 = i3 % 2;
            C2853hv c2853hv = this.f6672;
            c2853hv.f6620 = i | c2853hv.f6620;
            f6671 = (i2 + 47) % 128;
            return this;
        }

        /* renamed from: ﾒ */
        private static String m6965(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f6668, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6668));
                            C2777f.f6321 = i2 + 1;
                        } else {
                            str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* renamed from: ｋ */
        private a m6959() {
            f6669 = (f6671 + 107) % 128;
            this.f6672.mo6875();
            f6669 = (f6671 + 67) % 128;
            return this;
        }

        /* renamed from: ﾇ */
        private a m6962(Class cls) {
            int i = f6669 + 93;
            f6671 = i % 128;
            if (i % 2 != 0) {
                this.f6672.f6662.add(cls);
                return this;
            }
            this.f6672.f6662.add(cls);
            throw null;
        }

        /* renamed from: ﻛ */
        private C2853hv m6958() {
            int i = (f6671 + 3) % 128;
            f6669 = i;
            C2853hv c2853hv = this.f6672;
            int i2 = i + 81;
            f6671 = i2 % 128;
            if (i2 % 2 != 0) {
                return c2853hv;
            }
            throw null;
        }

        /* renamed from: ﻐ */
        private a m6954(List<Class> list) {
            int i = f6669 + 5;
            f6671 = i % 128;
            if (i % 2 == 0) {
                this.f6672.f6663 = list;
                int i2 = 20 / 0;
                return this;
            }
            this.f6672.f6663 = list;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo5466(java.lang.String r10, java.util.List<java.lang.Object> r11, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r12) {
            /*
                Method dump skipped, instructions count: 766
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2853hv.a.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﾇ */
        private static String m6963(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f6670.clone();
                    C2723d.f5951 = 0;
                    while (true) {
                        int i2 = C2723d.f5951;
                        if (i2 < iArr.length) {
                            int i3 = iArr[i2];
                            char c = (char) (i3 >> 16);
                            cArr[0] = c;
                            char c2 = (char) i3;
                            cArr[1] = c2;
                            char c3 = (char) (iArr[i2 + 1] >> 16);
                            cArr[2] = c3;
                            char c4 = (char) iArr[i2 + 1];
                            cArr[3] = c4;
                            C2723d.f5954 = (c << 16) + c2;
                            C2723d.f5952 = (c3 << 16) + c4;
                            C2723d.m6462(iArr2);
                            for (int i4 = 0; i4 < 16; i4++) {
                                int i5 = C2723d.f5954 ^ iArr2[i4];
                                C2723d.f5954 = i5;
                                int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                                int i6 = C2723d.f5954;
                                C2723d.f5954 = iM6461;
                                C2723d.f5952 = i6;
                            }
                            int i7 = C2723d.f5954;
                            int i8 = C2723d.f5952;
                            C2723d.f5954 = i8;
                            C2723d.f5952 = i7;
                            int i9 = i7 ^ iArr2[16];
                            C2723d.f5952 = i9;
                            int i10 = i8 ^ iArr2[17];
                            C2723d.f5954 = i10;
                            cArr[0] = (char) (i10 >>> 16);
                            cArr[1] = (char) i10;
                            cArr[2] = (char) (i9 >>> 16);
                            cArr[3] = (char) i9;
                            C2723d.m6462(iArr2);
                            int i11 = C2723d.f5951;
                            cArr2[i11 << 1] = cArr[0];
                            cArr2[(i11 << 1) + 1] = cArr[1];
                            cArr2[(i11 << 1) + 2] = cArr[2];
                            cArr2[(i11 << 1) + 3] = cArr[3];
                            C2723d.f5951 = i11 + 2;
                        } else {
                            str = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2844hm
    /* renamed from: ﻐ */
    public final void mo6875() {
        super.mo6875();
        this.f6664 = null;
        this.f6667 = 0;
        this.f6665 = true;
        this.f6662.clear();
        this.f6663 = null;
        this.f6666 = -1;
    }
}
