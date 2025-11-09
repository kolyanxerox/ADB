package com.ironsource;

import com.ironsource.C3034d9;
import org.json.JSONObject;

/* renamed from: com.ironsource.xt */
/* loaded from: classes2.dex */
public final class C3849xt {

    /* renamed from: a */
    private EnumC3883yt f12680a;

    public C3849xt(JSONObject config) {
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        this.f12680a = EnumC3883yt.f12774b.m13223a(config.optInt(C3034d9.a.f7933t, EnumC3883yt.CurrentlyLoadedAds.m13222b()));
    }

    /* renamed from: a */
    public final EnumC3883yt m13113a() {
        return this.f12680a;
    }
}
