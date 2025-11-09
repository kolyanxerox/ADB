package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dl */
/* loaded from: classes2.dex */
public final class C2735dl {

    /* renamed from: ﮐ */
    private static int f6072 = 1;

    /* renamed from: ﱟ */
    private static long f6073 = 4877835772717127964L;

    /* renamed from: ﻏ */
    private static int f6074;

    /* renamed from: ﻐ */
    private String f6075;

    /* renamed from: ﻛ */
    private String f6076;

    /* renamed from: ｋ */
    private boolean f6077;

    /* renamed from: ﾇ */
    private String f6078;

    /* renamed from: ﾒ */
    private String f6079;

    public C2735dl(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f6075 = jSONObject.optString(m6617("奫精ᾛ댵풠框跜", 41843 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            this.f6078 = jSONObject.optString(m6617("奿竔ḿ㎄ퟯ\ueb31", (ViewConfiguration.getLongPressTimeout() >> 16) + 9127).intern());
            this.f6079 = jSONObject.optString(m6617("她粓ኆ⢋캡", 9719 - Color.red(0)).intern());
            this.f6076 = jSONObject.optString(m6617("奫ხ쩐薯缩㚊\ue0e1", 18839 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            this.f6077 = jSONObject.optBoolean(m6617("奩ᤲ\ud9c3顎堐ᢹ\udb40鯶宾ᨪ", 16477 - TextUtils.getTrimmedLength("")).intern());
        }
    }

    /* renamed from: ﻐ */
    public final String m6618() {
        String str;
        int i = f6072 + 5;
        int i2 = i % 128;
        f6074 = i2;
        if (i % 2 != 0) {
            str = this.f6075;
            int i3 = 43 / 0;
        } else {
            str = this.f6075;
        }
        f6072 = (i2 + 67) % 128;
        return str;
    }

    /* renamed from: ﻛ */
    public final String m6619() {
        String str;
        int i = f6072 + 43;
        int i2 = i % 128;
        f6074 = i2;
        if (i % 2 != 0) {
            str = this.f6079;
            int i3 = 7 / 0;
        } else {
            str = this.f6079;
        }
        f6072 = (i2 + 41) % 128;
        return str;
    }

    /* renamed from: ｋ */
    public final String m6620() {
        int i = f6072 + 71;
        f6074 = i % 128;
        if (i % 2 == 0) {
            return this.f6078;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final boolean m6621() {
        int i = f6074 + 71;
        int i2 = i % 128;
        f6072 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.f6077;
        int i3 = i2 + 77;
        f6074 = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public final String m6622() {
        int i = f6074 + 1;
        f6072 = i % 128;
        if (i % 2 != 0) {
            return this.f6076;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6617(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6073);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
