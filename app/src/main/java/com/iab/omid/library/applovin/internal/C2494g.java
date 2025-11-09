package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.applovin.internal.g */
/* loaded from: classes2.dex */
public class C2494g {

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C2494g f3493b = new C2494g();

    /* renamed from: a */
    private Context f3494a;

    private C2494g() {
    }

    /* renamed from: b */
    public static C2494g m4055b() {
        return f3493b;
    }

    /* renamed from: a */
    public Context m4056a() {
        return this.f3494a;
    }

    /* renamed from: a */
    public void m4057a(Context context) {
        this.f3494a = context != null ? context.getApplicationContext() : null;
    }
}
