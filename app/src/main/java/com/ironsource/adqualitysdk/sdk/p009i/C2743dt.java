package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.p009i.C2915kc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dt */
/* loaded from: classes2.dex */
public class C2743dt {

    /* renamed from: ﱟ */
    private static boolean f6162 = true;

    /* renamed from: ﱡ */
    private static int f6163 = 0;

    /* renamed from: ﺙ */
    private static boolean f6164 = true;

    /* renamed from: ﻏ */
    private static int f6165 = 1;

    /* renamed from: ﻛ */
    private static char[] f6166 = {377, 394, 383, 395, 378, 391, 380, 401, 349, 312, 392, 385, 390, 389, 381, 396, 384, 357, 397, 388, 400, 379, 398};

    /* renamed from: ﾇ */
    private static int f6167 = 280;

    /* renamed from: ﻐ */
    private String[] f6168;

    /* renamed from: ｋ */
    private String f6169;

    /* renamed from: ﾒ */
    private AbstractC2794fq f6170;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dt$1 */
    public class AnonymousClass1 implements C2915kc.b<String> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
        /* renamed from: ｋ */
        public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
            return C2746dw.m6725(jSONArray.optString(i));
        }
    }

    public C2743dt(String str, String str2, JSONObject jSONObject) {
        this.f6169 = C2746dw.m6725(str2);
        List listM7438 = C2915kc.m7438(jSONObject.optJSONArray(m6709(null, null, Color.alpha(0) + 127, "\u0084\u0083\u0082\u0081").intern()), new C2915kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
            /* renamed from: ｋ */
            public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
                return C2746dw.m6725(jSONArray.optString(i));
            }
        });
        String[] strArr = new String[listM7438.size()];
        this.f6168 = strArr;
        listM7438.toArray(strArr);
        try {
            this.f6170 = new C2742ds(str, str2).m6703(C2740dq.m6648(str, str2, jSONObject.optString(m6709(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0088\u0087\u0086\u0085").intern())));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(m6709(null, null, View.MeasureSpec.getMode(0) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a\u0083\u008d\u008c\u0084\u0082\u0081\u008b\u008a\u0082\u0086\u0082\u0082\u0089").intern());
            sb.append(this.f6169);
            C2713cq.m6350(str, sb.toString(), th);
        }
    }

    /* renamed from: ﻐ */
    private static String m6709(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f6166;
                int i2 = f6167;
                if (f6164) {
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
                if (f6162) {
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

    /* renamed from: ｋ */
    private Map<String, Object> m6710(C2712cp c2712cp, List<Object> list, List<String> list2) {
        if (list.size() == list2.size()) {
            HashMap map = new HashMap();
            f6163 = (f6165 + 81) % 128;
            for (int i = 0; i < list.size(); i++) {
                f6163 = (f6165 + 123) % 128;
                map.put(list2.get(i), list.get(i));
            }
            return map;
        }
        String strM6290 = c2712cp.m6290();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6169);
        sb.append(m6709(null, null, KeyEvent.getDeadChar(0, 0) + 127, "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a").intern());
        sb.append(list2.size());
        sb.append(m6709(null, null, 127 - View.MeasureSpec.getSize(0), "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a").intern());
        sb.append(list.size());
        C2713cq.m6350(strM6290, sb.toString(), null);
        return null;
    }

    /* renamed from: ﾒ */
    public final String m6712() {
        int i = f6165;
        int i2 = i + 25;
        f6163 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f6169;
        f6163 = (i + 95) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    public final C2744du m6711(C2741dr c2741dr, C2712cp c2712cp, List<Object> list) {
        C2741dr c2741dr2 = new C2741dr(m6710(c2712cp, list, Arrays.asList(this.f6168)), c2741dr.m6657());
        AbstractC2794fq abstractC2794fq = this.f6170;
        if (abstractC2794fq != null) {
            f6165 = (f6163 + 39) % 128;
            C2744du c2744duMo6796 = abstractC2794fq.mo6796(c2741dr2, c2712cp);
            f6163 = (f6165 + 57) % 128;
            return c2744duMo6796;
        }
        String strM6290 = c2712cp.m6290();
        StringBuilder sb = new StringBuilder();
        sb.append(m6709(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u0092").intern());
        sb.append(this.f6169);
        sb.append(m6709(null, null, MotionEvent.axisFromString("") + 128, "\u0088\u0087\u0086\u0085\u008a\u0094\u0094\u0093\u008d\u008a\u0084\u0081\u0091\u008a").intern());
        C2713cq.m6350(strM6290, sb.toString(), null);
        return null;
    }
}
