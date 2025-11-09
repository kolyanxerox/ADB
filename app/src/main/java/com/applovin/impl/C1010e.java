package com.applovin.impl;

import java.util.Map;

/* renamed from: com.applovin.impl.e */
/* loaded from: classes.dex */
public class C1010e {

    /* renamed from: a */
    private final String f702a;

    /* renamed from: b */
    private final String f703b;

    /* renamed from: c */
    private final Map f704c;

    /* renamed from: d */
    private final boolean f705d;

    public C1010e(String str, String str2) {
        this(str, str2, null, false);
    }

    /* renamed from: a */
    public String m654a() {
        return this.f703b;
    }

    /* renamed from: b */
    public Map m655b() {
        return this.f704c;
    }

    /* renamed from: c */
    public String m656c() {
        return this.f702a;
    }

    /* renamed from: d */
    public boolean m657d() {
        return this.f705d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f702a + "', backupUrl='" + this.f703b + "', headers='" + this.f704c + "', shouldFireInWebView='" + this.f705d + "'}";
    }

    public C1010e(String str, String str2, Map map, boolean z) {
        this.f702a = str;
        this.f703b = str2;
        this.f704c = map;
        this.f705d = z;
    }
}
