package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.util.TypedValue;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fo */
/* loaded from: classes2.dex */
public final class C2792fo extends C2796fs {

    /* renamed from: ﱡ */
    private static int f6362 = 1;

    /* renamed from: ﻐ */
    private static char f6363 = 15483;

    /* renamed from: ﻛ */
    private static char f6364 = 25611;

    /* renamed from: ｋ */
    private static int f6365 = 0;

    /* renamed from: ﾇ */
    private static char f6366 = 24013;

    /* renamed from: ﾒ */
    private static char f6367 = 64362;

    public C2792fo(AbstractC2755ee abstractC2755ee) {
        super(abstractC2755ee);
    }

    /* renamed from: ﻐ */
    private static String m6803(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6364)) ^ ((c2 >>> 5) + f6366)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6363) ^ ((c3 + i3) ^ ((c3 << 4) + f6367))));
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2796fs
    public final String toString() {
        f6365 = (f6362 + 31) % 128;
        if (m6808() == null) {
            return m6803("\uf343篝㦏雏蚷\ud884蓗⻁", 7 - TextUtils.getOffsetBefore("", 0)).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6803("\uf343篝㦏雏蚷\ud884\u009f\ue5f2", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern());
        sb.append(super.toString());
        String string = sb.toString();
        int i = f6365 + 95;
        f6362 = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2796fs, com.ironsource.adqualitysdk.sdk.p009i.AbstractC2794fq
    /* renamed from: ｋ */
    public final C2744du mo6796(C2741dr c2741dr, C2712cp c2712cp) {
        f6365 = (f6362 + 85) % 128;
        C2744du c2744duMo6796 = super.mo6796(c2741dr, c2712cp);
        c2744duMo6796.m6719(true);
        int i = f6365 + 71;
        f6362 = i % 128;
        if (i % 2 != 0) {
            return c2744duMo6796;
        }
        throw null;
    }
}
