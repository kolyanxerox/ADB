package com.applovin.impl;

import android.content.Context;

/* renamed from: com.applovin.impl.m4 */
/* loaded from: classes.dex */
public class C1095m4 {

    /* renamed from: a */
    private final String f1196a;

    /* renamed from: b */
    private final String f1197b;

    /* renamed from: c */
    private final boolean f1198c;

    public C1095m4(String str, String str2, Context context) {
        this.f1196a = str.replace("android.permission.", "");
        this.f1197b = str2;
        this.f1198c = AbstractC1141o0.m1937a(str, context);
    }

    /* renamed from: a */
    public String m1497a() {
        return this.f1197b;
    }

    /* renamed from: b */
    public String m1498b() {
        return this.f1196a;
    }

    /* renamed from: c */
    public boolean m1499c() {
        return this.f1198c;
    }
}
