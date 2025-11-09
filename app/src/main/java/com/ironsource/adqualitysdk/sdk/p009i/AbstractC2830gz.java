package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.ironsource.InterfaceC3173h3;
import com.vungle.warren.VungleApiClient;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gz */
/* loaded from: classes2.dex */
public abstract class AbstractC2830gz extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static char[] f6540 = {'v', 19255, 38634, 57761, 11620, 30767};

    /* renamed from: ﻛ */
    private static long f6541 = 976425894902778690L;

    /* renamed from: ﾇ */
    private static int f6542 = 0;

    /* renamed from: ﾒ */
    private static int f6543 = 1;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.gz$c */
    public static class c extends AbstractC2830gz {

        /* renamed from: ﻐ */
        private static long f6544 = 0;

        /* renamed from: ﻛ */
        private static int f6545 = 0;

        /* renamed from: ｋ */
        private static char f6546 = 54151;

        /* renamed from: ﾇ */
        private static int f6547 = 1;

        /* renamed from: ﾒ */
        private static int f6548;

        /* renamed from: ﻛ */
        private static String m6850(int i, char c, String str, String str2, String str3) {
            String str4;
            char[] charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = charArray;
            char[] charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = charArray2;
            char[] charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = charArray3;
            synchronized (C2885j.f6936) {
                try {
                    char[] cArr4 = (char[]) cArr3.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length = cArr2.length;
                    char[] cArr6 = new char[length];
                    C2885j.f6934 = 0;
                    while (true) {
                        int i2 = C2885j.f6934;
                        if (i2 < length) {
                            int i3 = (i2 + 2) % 4;
                            int i4 = (i2 + 3) % 4;
                            int i5 = cArr4[i2 % 4] * 32718;
                            char c2 = cArr5[i3];
                            char c3 = (char) ((i5 + c2) % 65535);
                            C2885j.f6935 = c3;
                            cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                            cArr4[i4] = c3;
                            int i6 = C2885j.f6934;
                            cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6544) ^ f6545) ^ f6546);
                            C2885j.f6934 = i6 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str4;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﻐ */
        public final String mo6812() {
            f6547 = (f6548 + 21) % 128;
            String strIntern = m6850(1562235182 - MotionEvent.axisFromString(""), (char) ((Process.getThreadPriority(0) + 20) >> 6), "⿅᷑陝捱", "읫㹞圪䚞蟃賻쾇⥪맅祜渻嗇\uaad0廗㉴㵹⬻\uf24f炟耸㫶㭤ວ渹\ue7e4秲\uedf6訚ⵛ쮹➀య⯶", "\u0000\u0000\u0000\u0000").intern();
            int i = f6548 + 37;
            f6547 = i % 128;
            if (i % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = f6548 + 9;
            int i2 = i % 128;
            f6547 = i2;
            if (i % 2 == 0) {
                throw null;
            }
            int i3 = i2 + 51;
            f6548 = i3 % 128;
            if (i3 % 2 == 0) {
                return VungleApiClient.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            C2700cd c2700cd = new C2700cd(m6850(ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 18431), "鍢︲﹪㭇", "そ╉\ueb9c\uab1a驇퓢", "\u0000\u0000\u0000\u0000").intern());
            int i = f6547 + 7;
            f6548 = i % 128;
            if (i % 2 == 0) {
                return c2700cd;
            }
            throw null;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.gz$e */
    public static class e extends AbstractC2830gz {

        /* renamed from: ﻐ */
        private static int f6549 = 1;

        /* renamed from: ﻛ */
        private static int f6550;

        /* renamed from: ｋ */
        private static int[] f6551 = {-166519512, 771190380, -1021251276, 2002935051, -384155315, 1720935986, -1420635925, 447681101, -2006366280, -868082003, 2124188974, -604079263, -1036450136, -769972014, -1674965777, 1926117700, -72276627, -1956067187};

        /* renamed from: ﻛ */
        private static String m6851(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f6551.clone();
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
            int i = f6550 + 93;
            f6549 = i % 128;
            return (i % 2 == 0 ? m6851(new int[]{-1671615976, -356356412, 63039004, -1432051197, 646148875, 908773823, -712483812, -1148860541, 1804087072, 517514856, -1865104729, -991014761, -196292485, -2048437421, 82813273, -974088893, 1861605489, 750244452, -1216066011, 2029038506, -720223063, -432728645, -1138143007, -285953095}, 62 - KeyEvent.keyCodeFromString("")) : m6851(new int[]{-1671615976, -356356412, 63039004, -1432051197, 646148875, 908773823, -712483812, -1148860541, 1804087072, 517514856, -1865104729, -991014761, -196292485, -2048437421, 82813273, -974088893, 1861605489, 750244452, -1216066011, 2029038506, -720223063, -432728645, -1138143007, -285953095}, 47 - KeyEvent.keyCodeFromString(""))).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ｋ */
        public final Class mo6814() {
            int i = f6549;
            int i2 = i + 9;
            f6550 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            f6550 = (i + 37) % 128;
            return com.vungle.ads.internal.network.VungleApiClient.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
        /* renamed from: ﾇ */
        public final AbstractC2676bg mo6815() {
            C2705ci c2705ci = new C2705ci(mo6813());
            int i = f6550 + 123;
            f6549 = i % 128;
            if (i % 2 == 0) {
                int i2 = 24 / 0;
            }
            return c2705ci;
        }
    }

    /* renamed from: ﾒ */
    private static String m6849(int i, int i2, char c2) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6540[i2 + i3] ^ (i3 * f6541)) ^ c2);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6543 = (f6542 + 63) % 128;
        String strIntern = m6849((ViewConfiguration.getEdgeSlop() >> 16) + 6, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i = f6543 + InterfaceC3173h3.d.b.f8819b;
        f6542 = i % 128;
        if (i % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
