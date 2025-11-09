package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ee */
/* loaded from: classes2.dex */
public abstract class AbstractC2755ee {

    /* renamed from: ﱡ */
    private static int f6238 = 1;

    /* renamed from: ﻏ */
    private static int f6239 = 0;

    /* renamed from: ﻛ */
    private static char f6240 = 16001;

    /* renamed from: ｋ */
    private static char f6241 = 10835;

    /* renamed from: ﾇ */
    private static char f6242 = 20394;

    /* renamed from: ﾒ */
    private static char f6243 = 34640;

    /* renamed from: ﻐ */
    private C2736dm f6244;

    public AbstractC2755ee(C2736dm c2736dm) {
        this.f6244 = c2736dm;
    }

    /* renamed from: ﻐ */
    public static String m6758(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        f6238 = (f6239 + 23) % 128;
        int i = 0;
        boolean z = true;
        while (i < length) {
            f6239 = (f6238 + 59) % 128;
            Object obj = objArr[i];
            if (!z) {
                sb.append(m6757("\u07b9\ueb43", 2 - TextUtils.indexOf("", "")).intern());
            }
            if (obj instanceof String) {
                sb.append(m6757("歘\uee84", -MotionEvent.axisFromString("")).intern());
                sb.append(obj);
                sb.append(m6757("歘\uee84", -Process.getGidForName("")).intern());
            } else {
                sb.append(obj);
                f6238 = (f6239 + 25) % 128;
            }
            i++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ｋ */
    public abstract C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp);

    /* renamed from: ｋ */
    public final String m6759() {
        f6238 = (f6239 + 95) % 128;
        if (this.f6244 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6757("肕愹᱅䀷䘩짖Ḥ뚔矦ꢕ頜都", 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        sb.append(this.f6244);
        String string = sb.toString();
        f6239 = (f6238 + 63) % 128;
        return string;
    }

    /* renamed from: ﾇ */
    public final C2744du m6760(C2741dr c2741dr, C2712cp c2712cp) {
        C2744du c2744duMo6724;
        AbstractC2755ee abstractC2755ee = this;
        while (true) {
            c2744duMo6724 = abstractC2755ee.mo6724(c2741dr, c2712cp);
            if (c2744duMo6724 == null) {
                break;
            }
            int i = f6238 + 9;
            f6239 = i % 128;
            if (i % 2 != 0) {
                boolean z = c2744duMo6724.m6717() instanceof AbstractC2755ee;
                throw null;
            }
            if (!(c2744duMo6724.m6717() instanceof AbstractC2755ee)) {
                break;
            }
            abstractC2755ee = (AbstractC2755ee) c2744duMo6724.m6717();
        }
        f6239 = (f6238 + 7) % 128;
        return c2744duMo6724;
    }

    /* renamed from: ﾒ */
    public final int m6761() {
        int i = f6238 + 99;
        f6239 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        C2736dm c2736dm = this.f6244;
        if (c2736dm == null) {
            return -1;
        }
        int iM6625 = c2736dm.m6625();
        int i2 = f6239 + 107;
        f6238 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return iM6625;
    }

    /* renamed from: ﻐ */
    private static String m6757(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6242)) ^ ((c2 >>> 5) + f6241)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6243) ^ ((c3 + i3) ^ ((c3 << 4) + f6240))));
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
