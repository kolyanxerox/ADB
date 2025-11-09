package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.ironsrc.internal.g */
/* loaded from: classes2.dex */
public class C2545g {

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C2545g f3628b = new C2545g();

    /* renamed from: a */
    private Context f3629a;

    private C2545g() {
    }

    /* renamed from: b */
    public static C2545g m4308b() {
        return f3628b;
    }

    /* renamed from: a */
    public Context m4309a() {
        return this.f3629a;
    }

    /* renamed from: a */
    public void m4310a(Context context) {
        this.f3629a = context != null ? context.getApplicationContext() : null;
    }
}
