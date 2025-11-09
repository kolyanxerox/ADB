package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.Gravity;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bf */
/* loaded from: classes2.dex */
public final class C2675bf extends AbstractC2676bg {

    /* renamed from: ﺙ */
    private static int f5107 = 1;

    /* renamed from: ﻐ */
    private static char[] f5108 = {358, 367, 354, 355, 365, 357};

    /* renamed from: ﻛ */
    private static int f5109 = 289;

    /* renamed from: ｋ */
    private static boolean f5110 = true;

    /* renamed from: ﾇ */
    private static boolean f5111 = true;

    /* renamed from: ﾒ */
    private static int f5112;

    public C2675bf(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    private static String m5453(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f5108;
                int i2 = f5109;
                if (f5110) {
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
                if (f5111) {
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﱟ */
    public final boolean mo5450() {
        int i = (f5112 + 33) % 128;
        f5107 = i;
        int i2 = i + 35;
        f5112 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        int i = f5112 + 59;
        f5107 = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    public final Class mo5382(String str) {
        int i = f5112 + 85;
        f5107 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5107 + 57;
        f5112 = i % 128;
        return m5453(null, null, i % 2 != 0 ? 116 << Gravity.getAbsoluteGravity(1, 1) : Gravity.getAbsoluteGravity(0, 0) + 127, "\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern();
    }
}
