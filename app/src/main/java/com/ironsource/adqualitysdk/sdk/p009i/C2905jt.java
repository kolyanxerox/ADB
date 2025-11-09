package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jt */
/* loaded from: classes2.dex */
public final class C2905jt {

    /* renamed from: ﻛ */
    private static int f7147 = 1;

    /* renamed from: ｋ */
    private static int f7148 = 0;

    /* renamed from: ﾇ */
    private static char f7149 = 6;

    /* renamed from: ﾒ */
    private static char[] f7150 = {'f', 's', 'a', 'u', 't', 'i', 'd', 'p', 'A', 'Q', 'l', 'y', 'S', 'D', 'K', 'E', 'v', 'e', 'n', 'G', 'r', 'o', ' ', 'g', '/', 'm', 'j', 'h', 'k', 'q', 'w', 'x', 'z', '{', '|', '}'};

    /* renamed from: ｋ */
    public static JSONObject m7336(String str, C2666ax c2666ax, boolean z, C2657ao c2657ao) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!(!z)) {
            try {
                jSONObject.put(m7335((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 116), "\u0001\u0002", ImageFormat.getBitsPerPixel(0) + 3).intern(), true);
                f7147 = (f7148 + InterfaceC3173h3.d.b.f8823f) % 128;
            } catch (JSONException e) {
                C2921n.m7506(m7335((byte) (72 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\t\u0007\u000f\t\u0004\b\u0000\u0005\u0006\u0011\u000e\u000f\u0010\u0011\f\u0017\u0001\u0016\f\u0017\u000e\u0017\u0003\u0005\u0016\u0015", 26 - TextUtils.indexOf("", "")).intern(), m7335((byte) ((Process.myTid() >> 22) + 118), "\u000e\u0015\u0015\u0016\u0015\u0017\u0000\b\u000b\u0000\u0013\u0012\u0012\u0004\u0002\u0017\u0002\u0005\u0017\u0004\u0013\u0000\u0005\u0003ââ\u001c\u0006\u0003\u0002\n\u001c\u0001\t\b\u0000\u0005\u0010\u001c\n\u0001\u001d\u0010\u0017\u0003\u0016\u0014\u001c\u0003\u0013ä", (KeyEvent.getMaxKeyCode() >> 16) + 51).intern(), e);
            }
        }
        if (c2657ao.m5109()) {
            int i = f7148 + 35;
            f7147 = i % 128;
            if (i % 2 == 0) {
                jSONObject.put(m7335((byte) (66 >> Process.getGidForName("")), "\u0003\u0004\u0005\u0000 ", 5 - TextUtils.getOffsetBefore("", 1)).intern(), false);
            } else {
                jSONObject.put(m7335((byte) (59 - Process.getGidForName("")), "\u0003\u0004\u0005\u0000 ", 5 - TextUtils.getOffsetBefore("", 0)).intern(), true);
            }
        }
        jSONObject.put(m7335((byte) (Drawable.resolveOpacity(0, 0) + 94), "\t\u0001\u0000\u000b", TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern(), str);
        C2915kc.m7433(jSONObject, c2666ax.m5308());
        C2915kc.m7433(jSONObject, c2666ax.m5305());
        f7147 = (f7148 + 71) % 128;
        return jSONObject;
    }

    /* renamed from: ｋ */
    private static String m7335(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f7150;
                char c = f7149;
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
}
