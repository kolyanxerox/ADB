package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.im */
/* loaded from: classes2.dex */
public final class C2871im {

    /* renamed from: ﱡ */
    private static int f6841 = 0;

    /* renamed from: ﻏ */
    private static int f6842 = 1;

    /* renamed from: ﻐ */
    private static Map<String, Object> f6843;

    /* renamed from: ﻛ */
    private static char[] f6844;

    /* renamed from: ｋ */
    private static Map<String, Integer> f6845;

    /* renamed from: ﾇ */
    private static Map<String, Integer> f6846;

    /* renamed from: ﾒ */
    private static char f6847;

    static {
        m7118();
        f6843 = new HashMap();
        f6846 = new HashMap();
        f6845 = new HashMap();
        int i = f6842 + 15;
        f6841 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static void m7116(Context context, String str, JSONObject jSONObject, Object... objArr) {
        C2866ih.m7090(context).m7097(new Intent(str).putExtra(C2869ik.f6795, jSONObject.toString()));
        int i = f6841 + 97;
        f6842 = i % 128;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
        }
    }

    /* renamed from: ｋ */
    private static String m7117(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6844;
                char c = f6847;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﾇ */
    public static void m7118() {
        f6847 = (char) 1;
        f6844 = new char[]{':'};
    }
}
