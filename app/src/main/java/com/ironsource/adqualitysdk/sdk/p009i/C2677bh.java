package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bh */
/* loaded from: classes2.dex */
public final class C2677bh extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5128 = 1;

    /* renamed from: ﾇ */
    private static int f5129 = 0;

    /* renamed from: ﾒ */
    private static int f5130 = 124;

    public C2677bh(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﱟ */
    public final boolean mo5450() {
        int i = (f5128 + 51) % 128;
        f5129 = i;
        f5128 = (i + 51) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        int i = f5128 + 15;
        f5129 = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    public final Class mo5382(String str) {
        int i = (f5129 + 55) % 128;
        f5128 = i;
        int i2 = i + 13;
        f5129 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5128 + 21;
        f5129 = i % 128;
        return (i % 2 != 0 ? m5469(3 / View.resolveSizeAndState(0, 1, 1), 16 % (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 16345 << TextUtils.lastIndexOf("", 'N'), "\ufffb\b\uffff\ufffe\uffff\u0006￼", false) : m5469(View.resolveSizeAndState(0, 0, 0) + 3, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, TextUtils.lastIndexOf("", '0') + 195, "\ufffb\b\uffff\ufffe\uffff\u0006￼", true)).intern();
    }

    /* renamed from: ﾒ */
    private static String m5469(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f5130);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
