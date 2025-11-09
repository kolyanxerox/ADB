package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.gc */
/* loaded from: classes2.dex */
public abstract class AbstractC3147gc implements InterfaceC2957b2 {
    /* renamed from: a */
    public final Map<String, Object> m8942a(C3061e1 adProperties) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.m8434a().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adProperties.adFormat.toString()");
        map.put(C3157gm.f8745f, string);
        map.put("adf", Integer.valueOf(C2951av.m7846b(adProperties.m8434a())));
        String string2 = adProperties.m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string2, "adProperties.adId.toString()");
        map.put(C3157gm.f8748i, string2);
        map.put("mediationAdUnitId", adProperties.m8437c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
