package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;

/* renamed from: com.ironsource.j6 */
/* loaded from: classes2.dex */
public final class C3245j6 extends C3061e1 {

    /* renamed from: g */
    private final LevelPlayAdSize f9074g;

    /* renamed from: h */
    private final Boolean f9075h;

    /* renamed from: i */
    private final Long f9076i;

    public C3245j6() {
        this(C3697tf.f12051a.m12424a(), "", null, null, null, null, null, null, 252, null);
    }

    /* renamed from: h */
    public final LevelPlayAdSize m9442h() {
        return this.f9074g;
    }

    /* renamed from: i */
    public final Boolean m9443i() {
        return this.f9075h;
    }

    /* renamed from: j */
    public final Long m9444j() {
        return this.f9076i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245j6(UUID adId, String adUnitId, Placement placement, LevelPlayAdSize adSize, Boolean bool, Long l, C3270jv c3270jv, Double d) {
        super(IronSource.AD_UNIT.BANNER, adId, adUnitId, placement, c3270jv, d);
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(adSize, "adSize");
        this.f9074g = adSize;
        this.f9075h = bool;
        this.f9076i = l;
    }

    public /* synthetic */ C3245j6(UUID uuid, String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, C3270jv c3270jv, Double d, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(uuid, str, (i & 4) != 0 ? null : placement, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : c3270jv, (i & 128) != 0 ? null : d);
    }
}
