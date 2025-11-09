package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.l4 */
/* loaded from: classes.dex */
public class C1085l4 {

    /* renamed from: a */
    private final String f1107a;

    /* renamed from: b */
    private Map f1108b;

    private C1085l4(String str, Map map) {
        this.f1107a = str;
        this.f1108b = map;
    }

    /* renamed from: a */
    public static C1085l4 m1327a(String str) {
        return m1328a(str, null);
    }

    /* renamed from: b */
    public String m1330b() {
        return this.f1107a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f1107a + "'params='" + this.f1108b + "'}";
    }

    /* renamed from: a */
    public static C1085l4 m1328a(String str, Map map) {
        return new C1085l4(str, map);
    }

    /* renamed from: a */
    public Map m1329a() {
        return this.f1108b;
    }
}
