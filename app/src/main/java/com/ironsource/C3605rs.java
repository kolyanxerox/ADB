package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.rs */
/* loaded from: classes2.dex */
public final class C3605rs extends IllegalArgumentException {

    /* renamed from: a */
    private final IronSourceError f11222a;

    /* renamed from: b */
    private final int f11223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3605rs(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f11222a = error;
        this.f11223b = error.getErrorCode();
    }

    /* renamed from: a */
    public final IronSourceError m11760a() {
        return this.f11222a;
    }

    /* renamed from: b */
    public final int m11761b() {
        return this.f11223b;
    }
}
