package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* renamed from: com.ironsource.tq */
/* loaded from: classes2.dex */
public final class C3708tq {

    /* renamed from: a */
    private final String f12098a;

    /* renamed from: b */
    private final LevelPlay.AdFormat f12099b;

    public C3708tq(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        this.f12098a = placementName;
        this.f12099b = adFormat;
    }

    /* renamed from: a */
    public final String m12482a() {
        return this.f12098a + '_' + this.f12099b;
    }
}
