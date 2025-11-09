package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.in */
/* loaded from: classes2.dex */
public final class C3228in {

    /* renamed from: a */
    private final int f9034a;

    /* renamed from: b */
    private final int f9035b;

    /* renamed from: c */
    private final int f9036c;

    /* renamed from: d */
    private final boolean f9037d;

    public C3228in(JSONObject applicationLogger) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationLogger, "applicationLogger");
        this.f9034a = applicationLogger.optInt(C3262jn.f9130a, 3);
        this.f9035b = applicationLogger.optInt(C3262jn.f9131b, 3);
        this.f9036c = applicationLogger.optInt("console", 3);
        this.f9037d = applicationLogger.optBoolean(C3262jn.f9133d, false);
    }

    /* renamed from: a */
    public final int m9357a() {
        return this.f9036c;
    }

    /* renamed from: b */
    public final int m9358b() {
        return this.f9035b;
    }

    /* renamed from: c */
    public final int m9359c() {
        return this.f9034a;
    }

    /* renamed from: d */
    public final boolean m9360d() {
        return this.f9037d;
    }
}
