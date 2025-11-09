package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.ViewConfiguration;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ez */
/* loaded from: classes2.dex */
public final class C2776ez extends AbstractC2761ek {

    /* renamed from: ﻐ */
    private static long f6315 = 0;

    /* renamed from: ﻛ */
    private static int f6316 = 0;

    /* renamed from: ｋ */
    private static char f6317 = 47057;

    /* renamed from: ﾇ */
    private static int f6318 = 1;

    /* renamed from: ﾒ */
    private static int f6319;

    public C2776ez(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ｋ */
    private static String m6789(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6315) ^ f6316) ^ f6317);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6319 = (f6318 + 33) % 128;
        String strIntern = m6789(TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25534), "䈿ꕒ뺞鹣", "뉸\ue07b", "\u0000\u0000\u0000\u0000").intern();
        int i = f6318 + 27;
        f6319 = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    public final boolean mo6773(int i) {
        int i2 = (f6319 + 97) % 128;
        f6318 = i2;
        if (i == 0) {
            return false;
        }
        int i3 = i2 + 17;
        f6319 = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﾇ */
    public final boolean mo6775(String str, String str2) {
        if (!str.equals(str2)) {
            int i = f6319 + 29;
            f6318 = i % 128;
            return i % 2 != 0;
        }
        int i2 = f6318 + 9;
        f6319 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    public final boolean mo6774(Object obj, Object obj2) {
        int i = f6318 + 15;
        int i2 = i % 128;
        f6319 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (obj != obj2) {
            return true;
        }
        f6318 = (i2 + 65) % 128;
        return false;
    }
}
