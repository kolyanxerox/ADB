package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dn */
/* loaded from: classes2.dex */
public final class C2737dn {

    /* renamed from: ﱟ */
    private static int f6085 = 154;

    /* renamed from: ﱡ */
    private static int f6086 = 1;

    /* renamed from: ﺙ */
    private static int f6087;

    /* renamed from: ﻏ */
    private String f6088;

    /* renamed from: ﻐ */
    private String f6089;

    /* renamed from: ﻛ */
    private ISAdQualityAdType f6090;

    /* renamed from: ｋ */
    private List<String> f6091;

    /* renamed from: ﾇ */
    private JSONObject f6092;

    /* renamed from: ﾒ */
    private String f6093;

    public C2737dn(JSONObject jSONObject) {
        this.f6090 = ISAdQualityAdType.UNKNOWN;
        this.f6089 = C2746dw.m6725(jSONObject.optString(m6626(-TextUtils.lastIndexOf("", '0', 0, 0), 4 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 266, "\ufff5\u0004\t\u0000", false).intern()));
        String strM6725 = C2746dw.m6725(jSONObject.optString(m6626(ExpandableListView.getPackedPositionGroup(0L) + 2, (Process.myPid() >> 22) + 6, 255 - TextUtils.lastIndexOf("", '0', 0, 0), "\ufffe\ufffb\uffff\n\u0013￮", true).intern()));
        if (!TextUtils.isEmpty(strM6725)) {
            this.f6090 = ISAdQualityAdType.fromInt(Integer.parseInt(strM6725));
        }
        this.f6092 = jSONObject.optJSONObject(m6626(6 - Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 6, Color.argb(0, 0, 0, 0) + 261, "\b\u0002\ufff6\u0007\ufff6\u0005", true).intern());
        this.f6091 = C2915kc.m7436(jSONObject, m6626(3 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 10, TextUtils.getOffsetBefore("", 0) + 261, "\t\ufff8\ufff6\b\ufffa\ufffe\t\ufffe\u000b\ufffe", true).intern(), new ArrayList());
        this.f6093 = C2746dw.m6725(jSONObject.optString(m6626(View.resolveSize(0, 0) + 1, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 259, "\t\r\u0000￼\u000e\uffdd\u0000\u0003\u000b￼", false).intern()));
        this.f6088 = C2746dw.m6725(jSONObject.optString(m6626(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - Color.alpha(0), 258 - View.getDefaultSize(0, 0), "\n\u000f�\ufffa￮\u0001�\u000f\u000b\uffdf�\f\f�", false).intern()));
    }

    /* renamed from: ﺙ */
    public final String m6627() {
        int i = f6086 + 91;
        int i2 = i % 128;
        f6087 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        String str = this.f6088;
        f6086 = (i2 + 55) % 128;
        return str;
    }

    /* renamed from: ﻐ */
    public final ISAdQualityAdType m6628() {
        int i = f6087;
        ISAdQualityAdType iSAdQualityAdType = this.f6090;
        int i2 = i + 97;
        f6086 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return iSAdQualityAdType;
    }

    /* renamed from: ﻛ */
    public final String m6629() {
        int i = f6087;
        String str = this.f6089;
        f6086 = (i + 15) % 128;
        return str;
    }

    /* renamed from: ｋ */
    public final String m6630() {
        int i = f6086 + 31;
        f6087 = i % 128;
        if (i % 2 == 0) {
            return this.f6093;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final List<String> m6631() {
        List<String> list;
        int i = f6086;
        int i2 = i + 53;
        f6087 = i2 % 128;
        if (i2 % 2 != 0) {
            list = this.f6091;
            int i3 = 39 / 0;
        } else {
            list = this.f6091;
        }
        f6087 = (i + 51) % 128;
        return list;
    }

    /* renamed from: ﾒ */
    public final JSONObject m6632() {
        int i = f6086 + 29;
        f6087 = i % 128;
        if (i % 2 == 0) {
            return this.f6092;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6626(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f6085);
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
