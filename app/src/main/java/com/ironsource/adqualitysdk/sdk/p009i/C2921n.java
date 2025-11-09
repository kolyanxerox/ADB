package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.n */
/* loaded from: classes2.dex */
public final class C2921n {

    /* renamed from: ﻏ */
    private static int f7238 = 1;

    /* renamed from: ﻐ */
    private static boolean f7239 = true;

    /* renamed from: ﻛ */
    private static int f7240 = 254;

    /* renamed from: ｋ */
    private static char[] f7241 = {264, 327, 368, 365, 364, 337, 371, 353, 355, 286, 319, 354, 335, 351, 362, 359, 370, 375, 312};

    /* renamed from: ﾇ */
    private static boolean f7242 = true;

    /* renamed from: ﾒ */
    private static int f7243;

    /* renamed from: ﱟ */
    public static void m7499(String str, String str2) {
        f7243 = (f7238 + 37) % 128;
        m7510(str, str, str2);
        int i = f7238 + 77;
        f7243 = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    /* renamed from: ﱡ */
    public static void m7500(String str, String str2) {
        int i = f7243 + 51;
        f7238 = i % 128;
        int i2 = i % 2;
        m7515(str, str2, null);
        if (i2 == 0) {
            throw null;
        }
        f7238 = (f7243 + 119) % 128;
    }

    /* renamed from: ﻐ */
    public static void m7502(String str, String str2) {
        f7243 = (f7238 + 21) % 128;
        m7521(str, str2, (Throwable) null);
        f7243 = (f7238 + 71) % 128;
    }

    /* renamed from: ﻛ */
    private static boolean m7508() {
        f7243 = (f7238 + 43) % 128;
        boolean zM7581 = C2925r.m7548().m7581();
        f7238 = (f7243 + 63) % 128;
        return zM7581;
    }

    /* renamed from: ｋ */
    public static void m7509(String str, String str2) {
        f7243 = (f7238 + 15) % 128;
        m7506(str, str2, null);
        f7238 = (f7243 + 109) % 128;
    }

    /* renamed from: ﾇ */
    private static ISAdQualityLogLevel m7513() {
        int i = f7243 + 59;
        f7238 = i % 128;
        if (i % 2 == 0) {
            C2925r.m7548().m7580();
            throw null;
        }
        ISAdQualityLogLevel iSAdQualityLogLevelM7580 = C2925r.m7548().m7580();
        f7243 = (f7238 + 23) % 128;
        return iSAdQualityLogLevelM7580;
    }

    /* renamed from: ﾒ */
    public static void m7521(String str, String str2, Throwable th) {
        int i = f7243 + 1;
        f7238 = i % 128;
        if (i % 2 == 0) {
            m7516(str, str, str2, th, false);
        } else {
            m7516(str, str, str2, th, true);
        }
        f7243 = (f7238 + 21) % 128;
    }

    /* renamed from: ﻐ */
    public static void m7503(String str, String str2, boolean z) {
        f7243 = (f7238 + 25) % 128;
        m7512(str, str, str2, z);
        f7238 = (f7243 + 117) % 128;
    }

    /* renamed from: ﻛ */
    public static void m7506(String str, String str2, Throwable th) {
        f7243 = (f7238 + 1) % 128;
        m7516(str, str, str2, th, false);
        f7238 = (f7243 + 3) % 128;
    }

    /* renamed from: ｋ */
    public static void m7512(String str, String str2, String str3, boolean z) {
        f7238 = (f7243 + 125) % 128;
        m7516(str, str2, str3, null, z);
        f7238 = (f7243 + 87) % 128;
    }

    /* renamed from: ﾇ */
    private static void m7516(String str, String str2, String str3, Throwable th, boolean z) {
        if (!m7508()) {
            if (z) {
                f7243 = (f7238 + 117) % 128;
                if (m7513().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
                    f7238 = (f7243 + 51) % 128;
                    Log.e(m7501(str2), str3, th);
                    return;
                }
                return;
            }
            return;
        }
        int i = f7238 + 113;
        f7243 = i % 128;
        if (i % 2 == 0) {
            Log.e(m7501(str), str3, th);
        } else {
            Log.e(m7501(str), str3, th);
            int i2 = 56 / 0;
        }
    }

    /* renamed from: ﾒ */
    private static void m7520(String str, String str2, String str3, boolean z) {
        int i = f7238 + 13;
        f7243 = i % 128;
        if (i % 2 != 0) {
            m7508();
            throw null;
        }
        if (m7508()) {
            Log.i(m7501(str), str3);
            return;
        }
        if (z) {
            f7243 = (f7238 + InterfaceC3173h3.d.b.f8819b) % 128;
            if (!(!m7513().shouldPrintLog(ISAdQualityLogLevel.INFO))) {
                Log.i(m7501(str2), str3);
                f7243 = (f7238 + 77) % 128;
            }
        }
        int i2 = f7243 + 75;
        f7238 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
    }

    /* renamed from: ﻐ */
    private static String m7501(String str) {
        String strOooOO0o = AbstractC2183w4.OooOO0o(new StringBuilder(), m7517(128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (String) null, (int[]) null, "\u008a\u0093\u0092\u0091\u0090\u008f\u008e\u0087\u008d\u008c\u008b\u008a\u0089\u0088\u0083\u0087\u0084\u0086\u0085\u0084\u0083\u0082"), str);
        f7243 = (f7238 + 73) % 128;
        return strOooOO0o;
    }

    /* renamed from: ﻛ */
    public static void m7507(String str, String str2, Throwable th, boolean z) {
        int i = f7243 + 73;
        f7238 = i % 128;
        int i2 = i % 2;
        m7516(str, str, str2, th, z);
        if (i2 == 0) {
            throw null;
        }
        int i3 = f7243 + 99;
        f7238 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private static void m7511(String str, String str2, String str3, Object obj) {
        int i = f7243 + 3;
        f7238 = i % 128;
        int i2 = i % 2;
        m7505(str, str2, str3, obj, true);
        f7243 = (f7238 + 99) % 128;
    }

    /* renamed from: ﻛ */
    public static void m7504(String str, String str2) {
        int i = f7238 + 107;
        f7243 = i % 128;
        if (i % 2 != 0) {
            m7520(str, str, str2, false);
        } else {
            m7520(str, str, str2, true);
        }
        int i2 = f7238 + 95;
        f7243 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
    }

    /* renamed from: ｋ */
    private static void m7510(String str, String str2, String str3) {
        int i = f7238 + 87;
        f7243 = i % 128;
        if (i % 2 == 0) {
            if (m7508()) {
                Log.v(m7501(str), str3);
                return;
            } else {
                if (m7513().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
                    Log.v(m7501(str2), str3);
                    f7243 = (f7238 + InterfaceC3173h3.d.b.f8823f) % 128;
                    return;
                }
                return;
            }
        }
        m7508();
        throw null;
    }

    /* renamed from: ﻛ */
    public static void m7505(String str, String str2, String str3, Object obj, boolean z) {
        f7238 = (f7243 + 7) % 128;
        if (obj != null) {
            StringBuilder sbOooOo0O = OooOo.OooOo0O(str3);
            sbOooOo0O.append(m7517(175 - AndroidCharacter.getMirror('0'), (String) null, (int[]) null, "\u0081").intern());
            sbOooOo0O.append(obj.toString());
            str3 = sbOooOo0O.toString();
        }
        if (m7508()) {
            f7243 = (f7238 + 93) % 128;
            Log.d(m7501(str), str3);
        } else if (z) {
            f7238 = (f7243 + 77) % 128;
            if (m7513().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m7501(str2), str3);
            }
        }
    }

    /* renamed from: ﾇ */
    public static void m7514(String str, String str2) {
        f7238 = (f7243 + 77) % 128;
        m7520(str, str, str2, false);
        int i = f7238 + 45;
        f7243 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static void m7515(String str, String str2, Object obj) {
        int i = f7238 + 59;
        f7243 = i % 128;
        int i2 = i % 2;
        m7505(str, str, str2, obj, false);
    }

    /* renamed from: ﾒ */
    public static void m7518(String str, String str2) {
        int i = f7238 + 13;
        f7243 = i % 128;
        int i2 = i % 2;
        m7511(str, str, str2, (Object) null);
        if (i2 != 0) {
            int i3 = 61 / 0;
        }
    }

    /* renamed from: ﾒ */
    public static void m7519(String str, String str2, Object obj) {
        f7238 = (f7243 + 13) % 128;
        m7511(str, str, str2, obj);
        f7238 = (f7243 + 9) % 128;
    }

    /* renamed from: ﾒ */
    private static String m7517(int i, String str, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f7241;
                int i2 = f7240;
                if (f7239) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f7242) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
