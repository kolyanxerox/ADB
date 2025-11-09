package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.si */
/* loaded from: classes2.dex */
public class C3665si {

    /* renamed from: a */
    private final C2992c2 f11912a;

    public C3665si(C2992c2 c2992c2) {
        this.f11912a = c2992c2;
    }

    /* renamed from: a */
    public void m12274a() {
        this.f11912a.m8075a(EnumC3889z1.INIT_SUCCESS, null);
    }

    /* renamed from: a */
    public void m12275a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", str);
        this.f11912a.m8075a(EnumC3889z1.INIT_FAILED, map);
    }

    /* renamed from: a */
    public void m12276a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f11912a.m8075a(EnumC3889z1.INIT_ENDED, map);
    }

    /* renamed from: a */
    public void m12277a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f11912a.m8075a(EnumC3889z1.INIT_STARTED, map);
    }
}
