package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ironsource.n */
/* loaded from: classes2.dex */
public final class C3436n extends AbstractC3147gc {

    /* renamed from: a */
    private final IronSource.AD_UNIT f10338a;

    /* renamed from: b */
    private final UUID f10339b;

    /* renamed from: c */
    private final String f10340c;

    public C3436n(IronSource.AD_UNIT adFormat, UUID adId, String adUnitId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        this.f10338a = adFormat;
        this.f10339b = adId;
        this.f10340c = adUnitId;
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        return m8942a(new C3061e1(this.f10338a, this.f10339b, this.f10340c, null, null, null, 56, null));
    }
}
