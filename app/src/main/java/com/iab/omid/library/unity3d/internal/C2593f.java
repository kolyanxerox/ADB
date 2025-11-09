package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.unity3d.internal.f */
/* loaded from: classes2.dex */
public class C2593f {

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C2593f f3762b = new C2593f();

    /* renamed from: a */
    private Context f3763a;

    private C2593f() {
    }

    /* renamed from: b */
    public static C2593f m4557b() {
        return f3762b;
    }

    /* renamed from: a */
    public Context m4558a() {
        return this.f3763a;
    }

    /* renamed from: a */
    public void m4559a(Context context) {
        this.f3763a = context != null ? context.getApplicationContext() : null;
    }
}
