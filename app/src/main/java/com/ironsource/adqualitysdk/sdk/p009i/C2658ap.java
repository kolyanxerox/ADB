package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ap */
/* loaded from: classes2.dex */
public final class C2658ap extends AbstractC2661as.AnonymousClass3 {

    /* renamed from: ﻐ */
    private static long f4696 = 0;

    /* renamed from: ﻛ */
    private static int f4697 = 1;

    /* renamed from: ｋ */
    private static int f4698 = 0;

    /* renamed from: ﾇ */
    private static int f4699 = 1532859845;

    /* renamed from: ﾒ */
    private static char f4700;

    /* renamed from: ﻐ */
    public final Object m5124(String str) {
        int i = f4697 + 91;
        f4698 = i % 128;
        if (i % 2 != 0) {
            m5125();
            throw null;
        }
        JSONObject jSONObjectM5125 = m5125();
        if (jSONObjectM5125 == null) {
            return null;
        }
        Object objOpt = jSONObjectM5125.opt(str);
        f4698 = (f4697 + 45) % 128;
        return objOpt;
    }

    /* renamed from: ﻛ */
    public final JSONObject m5125() {
        JSONObject jSONObjectM5175;
        String strM5123;
        int i = f4698 + 119;
        f4697 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM5175 = m5175();
            strM5123 = m5123((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (244 >>> TextUtils.getOffsetAfter("", 1)), "\ue78d韌殠ﴅ", "뗪뇵㑦ᾆꝀ岲", "\u0000\u0000\u0000\u0000");
        } else {
            jSONObjectM5175 = m5175();
            strM5123 = m5123(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1387 - TextUtils.getOffsetAfter("", 0)), "\ue78d韌殠ﴅ", "뗪뇵㑦ᾆꝀ岲", "\u0000\u0000\u0000\u0000");
        }
        return jSONObjectM5175.optJSONObject(strM5123.intern());
    }

    /* renamed from: ｋ */
    public final String m5126() {
        f4698 = (f4697 + 19) % 128;
        String strOptString = m5175().optString(m5123((-380034850) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (23681 - TextUtils.lastIndexOf("", '0')), "\udebf夠苩\udd5c", "\ue459ꝳ\ue56f", "\u0000\u0000\u0000\u0000").intern());
        f4697 = (f4698 + 51) % 128;
        return strOptString;
    }

    /* renamed from: ｋ */
    private static String m5123(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4696) ^ f4699) ^ f4700);
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
