package com.ironsource;

import com.ironsource.AbstractC3619s7;
import java.util.List;

/* renamed from: com.ironsource.qx */
/* loaded from: classes2.dex */
public final class C3575qx<Smash extends AbstractC3619s7<?>> {

    /* renamed from: a */
    private final AbstractC3610rx<Smash> f11162a;

    public C3575qx(AbstractC3610rx<Smash> smashPicker) {
        kotlin.jvm.internal.OooOo.OooO0o0(smashPicker, "smashPicker");
        this.f11162a = smashPicker;
    }

    /* renamed from: a */
    public final List<Smash> m11692a() {
        return this.f11162a.m11778c();
    }

    /* renamed from: b */
    public final boolean m11693b() {
        return this.f11162a.m11778c().isEmpty() && this.f11162a.m11777a().isEmpty();
    }

    /* renamed from: c */
    public final boolean m11694c() {
        return this.f11162a.m11779d() == 0;
    }
}
