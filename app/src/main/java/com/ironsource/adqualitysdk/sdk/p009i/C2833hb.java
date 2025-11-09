package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.p009i.C2699cc;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hb */
/* loaded from: classes2.dex */
public final class C2833hb extends AbstractC2813gi {

    /* renamed from: ﱡ */
    private static int f6557 = 1;

    /* renamed from: ﻐ */
    private static char f6558 = 63193;

    /* renamed from: ﻛ */
    private static char f6559 = 42727;

    /* renamed from: ｋ */
    private static char f6560 = 7753;

    /* renamed from: ﾇ */
    private static char f6561 = 9000;

    /* renamed from: ﾒ */
    private static int f6562;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hb$b */
    public static class b extends AbstractC2813gi {

        /* renamed from: ﻛ */
        private static int f6563 = 0;

        /* renamed from: ｋ */
        private static char[] f6564 = {'p', 222, 214, 215, 215, 214, 211, 186, 194, 214, 211, 201, 196, 186, 159, 185, 214, 211, 217, 212, 202, 175, 184, 211, 202, 175, 184, 212, 204, 206, 215, 220, 211, 212, 184, 177, 179, 190, 222, 214, 211, 217, 185, 181, 214, 209, 132, 266, 257, 246, 255, 264, 261, 255};

        /* renamed from: ﾒ */
        private static int f6565 = 1;

        /* renamed from: ﺙ */
        private static boolean m6854() {
            boolean zM5447 = C2672bc.m5447(new C2833hb());
            int i = f6565 + 113;
            f6563 = i % 128;
            if (i % 2 != 0) {
                int i2 = 71 / 0;
            }
            return zM5447;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            if ((r0 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            r0 = 8 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            return m6855(true, new int[]{0, 46, 104, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000").intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (m6854() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            if (m6854() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6563 + 65;
            com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6565 = r0 % 128;
         */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String mo6812() {
            /*
                r3 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6565
                int r0 = r0 + 125
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6563 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L17
                boolean r0 = m6854()
                r2 = 57
                int r2 = r2 / r1
                if (r0 == 0) goto L2e
                goto L1d
            L17:
                boolean r0 = m6854()
                if (r0 == 0) goto L2e
            L1d:
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6563
                int r0 = r0 + 65
                int r2 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.f6565 = r2
                int r0 = r0 % 2
                r2 = 0
                if (r0 != 0) goto L2d
                r0 = 8
                int r0 = r0 / r1
            L2d:
                return r2
            L2e:
                r0 = 46
                r2 = 104(0x68, float:1.46E-43)
                int[] r0 = new int[]{r1, r0, r2, r1}
                java.lang.String r1 = "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000"
                r2 = 1
                java.lang.String r0 = m6855(r2, r0, r1)
                java.lang.String r0 = r0.intern()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2833hb.b.mo6812():java.lang.String");
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻛ */
        public final String mo6813() {
            f6563 = (f6565 + 23) % 128;
            String strIntern = m6855(false, new int[]{46, 8, 148, 5}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001").intern();
            f6563 = (f6565 + 59) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            f6563 = (f6565 + 85) % 128;
            if (!m6854()) {
                return AdUnitActivity.class;
            }
            int i = f6565 + 95;
            f6563 = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            C2699cc.e eVar = new C2699cc.e(mo6813());
            f6565 = (f6563 + 123) % 128;
            return eVar;
        }

        /* renamed from: ﻛ */
        private static String m6855(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                    System.arraycopy(f6564, i, cArr, 0, i2);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6562 = (f6557 + 5) % 128;
        String strIntern = m6853("팇Ƿꋸ\ue9d2絩ႾↁᏥ決\uf680䲇ﮡ\udc89䤋髥ḻ濆㻅鬊뼸빓颴맔\uf5e6孬\udc2b\ue562浸髥ḻ濆㻅鬊뼸", Color.blue(0) + 34).intern();
        int i = f6562 + 39;
        f6557 = i % 128;
        if (i % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6562 + 35;
        f6557 = i % 128;
        int i2 = i % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        return (i2 == 0 ? m6853("絩ႾↁᏥȗ\ud87e\uf2a6\uf23c", 107 % (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1))) : m6853("絩ႾↁᏥȗ\ud87e\uf2a6\uf23c", 9 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = (f6557 + 121) % 128;
        f6562 = i;
        int i2 = i + 77;
        f6557 = i2 % 128;
        if (i2 % 2 != 0) {
            return UnityServices.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2699cc c2699cc = new C2699cc(mo6813());
        f6562 = (f6557 + 47) % 128;
        return c2699cc;
    }

    /* renamed from: ﻛ */
    private static String m6853(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6558)) ^ ((c2 >>> 5) + f6559)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6561) ^ ((c3 + i3) ^ ((c3 << 4) + f6560))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
