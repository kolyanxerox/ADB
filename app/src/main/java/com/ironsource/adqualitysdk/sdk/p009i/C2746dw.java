package com.ironsource.adqualitysdk.sdk.p009i;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dw */
/* loaded from: classes2.dex */
public final class C2746dw {

    /* renamed from: ﻐ */
    private static Map<String, String> f6182 = new HashMap();

    /* renamed from: ﾒ */
    public static String m6725(String str) {
        String str2 = f6182.get(str);
        if (str2 != null) {
            return str2;
        }
        f6182.put(str, str);
        return str;
    }
}
