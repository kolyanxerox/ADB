package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2689bt;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gp */
/* loaded from: classes2.dex */
public final class C2820gp {

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.gp$b */
    public static class b extends AbstractC2813gi {

        /* renamed from: ﻐ */
        private static char[] f6495 = {'7', 'k', 'k', 'M', 'M', 'n', 'i', 'W', 'G', 'K', '_', 'f', 'i', 'l', 'f', 'l', 'q', '[', 'K', C3037dc.f8244T, 'L', 'g', 'k', 'p', 'M', 'M', 'f', 'i', 'l', 'f', 'l', '@', '~', '~', 132, 127, 'y', 127, '|', 'y'};

        /* renamed from: ｋ */
        private static int f6496 = 1;

        /* renamed from: ﾒ */
        private static int f6497;

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            f6497 = (f6496 + 83) % 128;
            String strIntern = m6838(true, new int[]{0, 31, 0, 7}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001").intern();
            int i = f6497 + 71;
            f6496 = i % 128;
            if (i % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻛ */
        public final String mo6813() {
            f6497 = (f6496 + 11) % 128;
            String strIntern = m6838(false, new int[]{31, 9, 19, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern();
            f6496 = (f6497 + InterfaceC3173h3.d.b.f8821d) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = f6497;
            f6496 = (i + 41) % 128;
            int i2 = i + 11;
            f6496 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
            return MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            AbstractC2689bt.d dVar = new AbstractC2689bt.d(mo6813());
            f6497 = (f6496 + 81) % 128;
            return dVar;
        }

        /* renamed from: ｋ */
        private static String m6838(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (C2831h.f6553) {
                try {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    char[] cArr = new char[i2];
                    System.arraycopy(f6495, i, cArr, 0, i2);
                    if (bArr != null) {
                        char[] cArr2 = new char[i2];
                        C2831h.f6552 = 0;
                        char c = 0;
                        while (true) {
                            int i5 = C2831h.f6552;
                            if (i5 >= i2) {
                                break;
                            }
                            if (bArr[i5] == 1) {
                                cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                            } else {
                                cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                            }
                            c = cArr2[i5];
                            C2831h.f6552 = i5 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i6 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i6, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        C2831h.f6552 = 0;
                        while (true) {
                            int i7 = C2831h.f6552;
                            if (i7 >= i2) {
                                break;
                            }
                            cArr4[i7] = cArr[(i2 - i7) - 1];
                            C2831h.f6552 = i7 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i3 > 0) {
                        C2831h.f6552 = 0;
                        while (true) {
                            int i8 = C2831h.f6552;
                            if (i8 >= i2) {
                                break;
                            }
                            cArr[i8] = (char) (cArr[i8] - iArr[2]);
                            C2831h.f6552 = i8 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.gp$d */
    public static class d extends AbstractC2813gi {

        /* renamed from: ﻐ */
        private static int[] f6498 = {-2079118221, 1212876267, -1227102910, -1517201004, 385957965, -2057761635, -1580260878, 1356142049, 1899406728, -1203592119, -1883079362, -2003866453, 1906955476, 1336559771, 1306254280, -172234682, -1043469899, -897218289};

        /* renamed from: ﾇ */
        private static int f6499 = 0;

        /* renamed from: ﾒ */
        private static int f6500 = 1;

        /* renamed from: ﾒ */
        private static String m6839(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f6498.clone();
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            f6500 = (f6499 + 61) % 128;
            String strIntern = m6839(new int[]{1867023693, 1101525955, 1175830377, 1983488376, 1504169384, 1648314324, 1455978300, 261464830, -1740147301, -685179090, -593626943, 1980029667, 1150756543, 222017236}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27).intern();
            f6499 = (f6500 + 83) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻛ */
        public final String mo6813() {
            f6499 = (f6500 + 95) % 128;
            String strIntern = m6839(new int[]{-1865750967, -1480672260, 2144942115, 1779962929, 329920381, -714258382}, 9 - View.resolveSize(0, 0)).intern();
            int i = f6499 + 7;
            f6500 = i % 128;
            if (i % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = (f6499 + 93) % 128;
            f6500 = i;
            f6499 = (i + 19) % 128;
            return MBridgeSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            AbstractC2689bt.e eVar = new AbstractC2689bt.e(mo6813());
            int i = f6500 + 31;
            f6499 = i % 128;
            if (i % 2 == 0) {
                return eVar;
            }
            throw null;
        }
    }

    public C2820gp() {
    }

    public C2820gp(Context context) {
        context.getApplicationContext();
    }
}
