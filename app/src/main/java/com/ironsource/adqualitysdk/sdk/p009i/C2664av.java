package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.av */
/* loaded from: classes2.dex */
public final class C2664av extends AbstractC2661as.AnonymousClass3 {

    /* renamed from: ﺙ */
    private static int f4772 = 1;

    /* renamed from: ﻐ */
    private static char f4773 = 15908;

    /* renamed from: ﻛ */
    private static int f4774 = 0;

    /* renamed from: ｋ */
    private static char f4775 = 45182;

    /* renamed from: ﾇ */
    private static char f4776 = 21380;

    /* renamed from: ﾒ */
    private static char f4777 = 22872;

    public C2664av(C2663au c2663au) {
        m5176(c2663au);
    }

    /* renamed from: ﱟ */
    public final boolean m5226() {
        f4772 = (f4774 + 11) % 128;
        boolean zOptBoolean = m5175().optBoolean(m5225("翢椚♗綌", TextUtils.getOffsetAfter("", 0) + 4).intern(), true);
        f4772 = (f4774 + 9) % 128;
        return zOptBoolean;
    }

    /* renamed from: ﻐ */
    public final int m5227() {
        int i = f4774 + 23;
        f4772 = i % 128;
        if (i % 2 == 0) {
            m5174().m5218();
            throw null;
        }
        int iM5218 = m5174().m5218();
        int i2 = f4774 + 109;
        f4772 = i2 % 128;
        if (i2 % 2 != 0) {
            return iM5218;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final int m5228() {
        f4772 = (f4774 + 109) % 128;
        int iM5223 = m5174().m5223();
        f4774 = (f4772 + 71) % 128;
        return iM5223;
    }

    /* renamed from: ｋ */
    public final List<String> m5229() {
        int i = f4774 + 91;
        f4772 = i % 128;
        if (i % 2 != 0) {
            return m5174().m5221();
        }
        m5174().m5221();
        throw null;
    }

    /* renamed from: ﾇ */
    public final List<String> m5230() {
        List<String> listM5222;
        int i = f4772 + 123;
        f4774 = i % 128;
        if (i % 2 != 0) {
            listM5222 = m5174().m5222();
            int i2 = 93 / 0;
        } else {
            listM5222 = m5174().m5222();
        }
        int i3 = f4774 + 29;
        f4772 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return listM5222;
    }

    /* renamed from: ﾒ */
    public final boolean m5231() {
        JSONObject jSONObjectM5175;
        int iIndexOf;
        int i = f4774 + 59;
        f4772 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM5175 = m5175();
            iIndexOf = TextUtils.indexOf((CharSequence) "", (char) 25, 0, 0) + 3;
        } else {
            jSONObjectM5175 = m5175();
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5;
        }
        return jSONObjectM5175.optBoolean(m5225("翢椚ሽ峨", iIndexOf).intern(), true);
    }

    /* renamed from: ﻐ */
    private static String m5225(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f4775)) ^ ((c2 >>> 5) + f4773)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4776) ^ ((c3 + i3) ^ ((c3 << 4) + f4777))));
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
