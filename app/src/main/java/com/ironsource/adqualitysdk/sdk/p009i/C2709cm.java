package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.adqualitysdk.sdk.p009i.C2711co;
import com.ironsource.adqualitysdk.sdk.p009i.C2857hz;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cm */
/* loaded from: classes2.dex */
public class C2709cm {

    /* renamed from: ﻐ */
    private C2711co f5662;

    /* renamed from: ｋ */
    private int f5663;

    /* renamed from: ﾇ */
    private List<String> f5664;

    /* renamed from: ﾒ */
    private C2857hz.d f5665;

    /* renamed from: ﻐ */
    public final C2711co m6204() {
        return this.f5662;
    }

    /* renamed from: ﻛ */
    public final C2857hz m6205(InterfaceC2856hy interfaceC2856hy) {
        return this.f5665.m7053(interfaceC2856hy, this.f5664, this.f5663);
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cm$a */
    public static class a extends C2722cz implements InterfaceC2707ck {

        /* renamed from: ﮐ */
        private static int f5666 = 1;

        /* renamed from: ﱟ */
        private static int f5667;

        /* renamed from: ﻐ */
        private static char[] f5668 = {'s', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8557, 39637, 5176, 36461, 's', 31182, 62242, 27986, 59081, 24630, 55920, 21454, 52528, 18256, 49371, 14889, 46177, 11741, 42777, 8553, 39633, 5160, 36469, 2004, 33071, 's', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42775, 8548, 39616, 5160, 17430, 15787, 46919, 10551, 41644, 9299, 40469, 6059, 35157, 815, 33957, 32369, 61440, 27066, 58188, 's', 31182, 62242, 27980, 59077, 24633, 55878, 21448, 52520, 18295, 49350, 14879, 46187, 11741, 42777, 8554, 39644, 5175, 36451, 2002, 33064, 64366, 29917, 60979, 26747, 59298, 40479, 5363, 35459, 280, 34791, 15777, 46111, 10977, 41115, 10001, 56779, 21434, 51730, 16615, 50865, 32002, 62462, 27070, 57359, 26339, 7333, 'c', 31198, 62245, 28021, 59075, 24634, 55873, 21445, 52541, 18272, 49349, 14868, 46177, 11739, 42802, 8554, 39636};

        /* renamed from: ﾇ */
        private static long f5669 = 3178654271887669675L;

        /* renamed from: ﾒ */
        private static long f5670 = 9036385983134046093L;

        /* renamed from: ﻛ */
        private C2711co.b f5671;

        /* renamed from: ｋ */
        private C2709cm f5672;

        public a(List<String> list, int i) {
            C2709cm c2709cm = new C2709cm();
            this.f5672 = c2709cm;
            c2709cm.f5665 = new C2857hz.d();
            this.f5672.f5664 = list;
            this.f5672.f5663 = i;
            this.f5671 = new C2711co.b();
        }

        /* renamed from: ﻐ */
        private static String m6206(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f5670, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5670));
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

        /* renamed from: ﾒ */
        private C2709cm m6208() {
            f5666 = (f5667 + 5) % 128;
            this.f5672.f5662 = this.f5671.m6237();
            C2709cm c2709cm = this.f5672;
            f5666 = (f5667 + 77) % 128;
            return c2709cm;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0233  */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
        /* renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo5466(java.lang.String r13, java.util.List<java.lang.Object> r14, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r15) {
            /*
                Method dump skipped, instructions count: 970
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2709cm.a.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﾇ */
        private static String m6207(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f5668[i2 + i3] ^ (i3 * f5669)) ^ c);
                            C2642a.f4436 = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }
}
