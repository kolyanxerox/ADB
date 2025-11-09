package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.iu */
/* loaded from: classes2.dex */
public final class C2879iu {

    /* renamed from: ﻛ */
    private String f6852;

    /* renamed from: ｋ */
    private long f6853;

    /* renamed from: ﾇ */
    private b f6854;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.iu$b */
    public static class b {

        /* renamed from: ﾇ */
        private String f6855;

        /* renamed from: ﾒ */
        private int f6856;

        public b(int i, String str) {
            this.f6856 = i;
            this.f6855 = str;
        }

        /* renamed from: ﻐ */
        public final int m7124() {
            return this.f6856;
        }

        /* renamed from: ﾒ */
        public final String m7125() {
            return this.f6855;
        }
    }

    public C2879iu(String str, int i, String str2, long j) {
        this.f6852 = str;
        this.f6853 = j;
        this.f6854 = new b(i, str2);
    }

    /* renamed from: ﻐ */
    public final JSONObject m7120() throws JSONException {
        return !TextUtils.isEmpty(this.f6852) ? new JSONObject(this.f6852) : new JSONObject();
    }

    /* renamed from: ﻛ */
    public final long m7121() {
        return this.f6853;
    }

    /* renamed from: ｋ */
    public final String m7122() {
        return this.f6852;
    }

    /* renamed from: ﾇ */
    public final b m7123() {
        return this.f6854;
    }
}
