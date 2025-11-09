package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import java.util.UUID;

/* renamed from: com.ironsource.fo */
/* loaded from: classes2.dex */
public final class C3124fo extends C3061e1 {
    public C3124fo() {
        this(C3697tf.f12051a.m12424a(), "", null, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3124fo(UUID adId, String adUnitId, Placement placement) {
        super(IronSource.AD_UNIT.NATIVE_AD, adId, adUnitId, placement, null, null, 48, null);
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
    }

    public /* synthetic */ C3124fo(UUID uuid, String str, Placement placement, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(uuid, str, (i & 4) != 0 ? null : placement);
    }
}
