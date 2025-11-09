package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f11852a;

    /* renamed from: b */
    private static Map<String, String> f11853b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f11852a == null) {
            f11852a = new IronSourceQaProperties();
        }
        return f11852a;
    }

    public static boolean isInitialized() {
        return f11852a != null;
    }

    public Map<String, String> getParameters() {
        return f11853b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f11853b.put(str, str2);
    }
}
