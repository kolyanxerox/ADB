package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3438n1;
import com.ironsource.C2992c2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Arrays;

/* renamed from: com.ironsource.ho */
/* loaded from: classes2.dex */
public final class C3194ho extends AbstractC3438n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3194ho(C3349m1 adTools, C3229io adUnitData, InterfaceC3263jo listener) {
        String str;
        int iM13115b;
        super(adTools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        Placement placementM10930g = m10930g();
        IronLog.INTERNAL.verbose("placement = " + placementM10930g);
        if (placementM10930g == null || TextUtils.isEmpty(placementM10930g.getPlacementName())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placementM10930g == null ? "placement is null" : "placement name is empty"}, 1));
            iM13115b = C3855y1.m13115b(adUnitData.mo9364b().m8434a());
        } else {
            str = null;
            iM13115b = 510;
        }
        if (str != null) {
            IronLog.API.error(m10920a(str));
            m10921a(iM13115b, str);
        }
    }

    @Override // com.ironsource.AbstractC3438n1
    /* renamed from: a */
    public InterfaceC2990c0 mo9217a() {
        return new o000oOoO(this, 0);
    }

    /* renamed from: a */
    public static final AbstractC3887z m9216a(C3194ho this$0, C2626a0 adInstanceData, C3135g0 adInstancePayload) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceData, "adInstanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        return new C3911zn(new C3719u2(this$0.m10929f(), C2992c2.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC3438n1.a());
    }
}
