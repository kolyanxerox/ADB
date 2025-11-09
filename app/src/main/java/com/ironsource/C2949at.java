package com.ironsource;

/* renamed from: com.ironsource.at */
/* loaded from: classes2.dex */
public final class C2949at {

    /* renamed from: a */
    private final C3535ps f7559a;

    /* renamed from: b */
    private final C3814ws f7560b;

    public C2949at(C3535ps error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f7559a = error;
        this.f7560b = null;
    }

    /* renamed from: a */
    public final C3535ps m7831a() {
        return this.f7559a;
    }

    /* renamed from: b */
    public final C3814ws m7832b() {
        return this.f7560b;
    }

    /* renamed from: c */
    public final boolean m7833c() {
        C3814ws c3814ws;
        if (this.f7559a == null && (c3814ws = this.f7560b) != null) {
            return c3814ws.m12966c().m11644p();
        }
        return false;
    }

    public C2949at(C3814ws sdkInitResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(sdkInitResponse, "sdkInitResponse");
        this.f7560b = sdkInitResponse;
        this.f7559a = null;
    }
}
