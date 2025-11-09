package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* renamed from: com.ironsource.a2 */
/* loaded from: classes2.dex */
public final class C2628a2 extends AbstractC3147gc {

    /* renamed from: a */
    private final C3349m1 f3876a;

    /* renamed from: b */
    private final C3061e1 f3877b;

    /* renamed from: c */
    private final String f3878c;

    public C2628a2(C3349m1 adTools, C3061e1 adProperties, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        this.f3876a = adTools;
        this.f3877b = adProperties;
        this.f3878c = str;
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        Map<String, Object> mapM8942a = m8942a(this.f3877b);
        mapM8942a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapM8942a.put("sessionDepth", Integer.valueOf(this.f3876a.m9971f()));
        String str = this.f3878c;
        if (str != null) {
            mapM8942a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapM8942a;
    }

    public /* synthetic */ C2628a2(C3349m1 c3349m1, C3061e1 c3061e1, String str, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3349m1, c3061e1, (i & 4) != 0 ? null : str);
    }
}
