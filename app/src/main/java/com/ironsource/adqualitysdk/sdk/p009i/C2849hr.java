package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hr */
/* loaded from: classes2.dex */
public final class C2849hr {

    /* renamed from: ｋ */
    private static C2849hr f6653;

    /* renamed from: ﻛ */
    private final C2846ho f6655 = new C2846ho();

    /* renamed from: ﻐ */
    private final C2854hw f6654 = new C2854hw();

    private C2849hr() {
    }

    /* renamed from: ﻛ */
    public static synchronized C2849hr m6916() {
        try {
            if (f6653 == null) {
                f6653 = new C2849hr();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6653;
    }

    /* renamed from: ﾇ */
    public static synchronized void m6917() {
        f6653 = null;
    }

    /* renamed from: ｋ */
    public final C2846ho m6918() {
        return this.f6655;
    }

    /* renamed from: ﾒ */
    public final C2854hw m6919() {
        return this.f6654;
    }
}
