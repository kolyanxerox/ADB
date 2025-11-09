package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sq */
/* loaded from: classes2.dex */
public class C3673sq implements InterfaceC2957b2 {

    /* renamed from: a */
    private final String f11929a;

    public C3673sq(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        this.f11929a = placementName;
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 enumC3889z1) {
        HashMap map = new HashMap();
        map.put("placement", this.f11929a);
        return map;
    }
}
