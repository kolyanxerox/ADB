package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ei */
/* loaded from: classes2.dex */
public final class C2759ei extends AbstractC2755ee {

    /* renamed from: ﱟ */
    private static int f6261 = 1;

    /* renamed from: ﻐ */
    private static int f6262 = 0;

    /* renamed from: ｋ */
    private static int f6263 = 0;

    /* renamed from: ﾇ */
    private static char f6264 = 0;

    /* renamed from: ﾒ */
    private static long f6265 = -9076982150857276290L;

    /* renamed from: ﻛ */
    private AbstractC2755ee f6266;

    public C2759ei(AbstractC2755ee abstractC2755ee, C2736dm c2736dm) {
        super(c2736dm);
        this.f6266 = abstractC2755ee;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f6261 = (f6262 + 115) % 128;
            return true;
        }
        if (obj != null && C2759ei.class == obj.getClass()) {
            C2759ei c2759ei = (C2759ei) obj;
            AbstractC2755ee abstractC2755ee = this.f6266;
            if (abstractC2755ee != null) {
                int i = f6261 + 5;
                f6262 = i % 128;
                int i2 = i % 2;
                boolean zEquals = abstractC2755ee.equals(c2759ei.f6266);
                if (i2 != 0) {
                    int i3 = 50 / 0;
                }
                return zEquals;
            }
            if (c2759ei.f6266 == null) {
                f6261 = (f6262 + 29) % 128;
                return true;
            }
            f6261 = (f6262 + 69) % 128;
        }
        return false;
    }

    public final int hashCode() {
        int i = f6261;
        f6262 = (i + 51) % 128;
        AbstractC2755ee abstractC2755ee = this.f6266;
        if (abstractC2755ee == null) {
            int i2 = i + 11;
            f6262 = i2 % 128;
            if (i2 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i3 = i + 5;
        f6262 = i3 % 128;
        if (i3 % 2 != 0) {
            abstractC2755ee.hashCode();
            throw null;
        }
        int iHashCode = abstractC2755ee.hashCode();
        int i4 = f6261 + 27;
        f6262 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m6769(47264702 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 655), "뾕턳輂砂", "\uf3b0", "䑾憗ᓓ興").intern());
        sb.append(this.f6266);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6769(298434062 - Color.red(0), (char) (16179 - TextUtils.lastIndexOf("", '0', 0)), "ຉ즾㐑䰿", "\uf09b", "䑾憗ᓓ興"));
        int i = f6262 + 35;
        f6261 = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
        return strOooOO0O;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        int i = f6261 + 45;
        f6262 = i % 128;
        if (i % 2 == 0) {
            return this.f6266.m6760(c2741dr, c2712cp);
        }
        this.f6266.m6760(c2741dr, c2712cp);
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6769(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6265) ^ f6263) ^ f6264);
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
}
