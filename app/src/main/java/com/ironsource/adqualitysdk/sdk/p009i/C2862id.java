package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.p009i.C2864if;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.id */
/* loaded from: classes2.dex */
public final class C2862id {

    /* renamed from: ﻐ */
    private String f6730;

    /* renamed from: ﻛ */
    private C2867ii f6731;

    /* renamed from: ｋ */
    private C2864if f6732;

    /* renamed from: ﾒ */
    private Context f6733;

    public C2862id(Context context, String str, String str2) {
        this.f6733 = context.getApplicationContext();
        this.f6730 = str2;
        this.f6731 = new C2867ii(this.f6733, str);
        this.f6732 = new C2864if(C2860ib.f6722, this.f6733.getPackageName(), C2868ij.m7111(this.f6733), this.f6730);
    }

    /* renamed from: ﻛ */
    public final int m7073(String str) {
        try {
            return this.f6731.m7104(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: ｋ */
    public final void m7074(String str) {
        try {
            this.f6731.m7103(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ */
    public final HashMap<String, String> m7075(String str, int i) {
        try {
            HashMap<String, String> mapM7105 = this.f6731.m7105(str, i);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM7105.keySet()) {
                String str3 = mapM7105.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f6732.m7083(str3));
                    } catch (C2864if.c unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ */
    public final String m7076(String str) {
        try {
            String strM7106 = this.f6731.m7106(str);
            if (strM7106 == null || TextUtils.isEmpty(strM7106)) {
                return strM7106;
            }
            try {
                return this.f6732.m7083(strM7106);
            } catch (C2864if.c unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ */
    public final void m7077(String str, String str2) {
        try {
            this.f6731.m7102(str, this.f6732.m7082(str2));
        } catch (Throwable unused) {
        }
    }
}
