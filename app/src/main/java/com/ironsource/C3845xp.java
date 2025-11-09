package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.xp */
/* loaded from: classes2.dex */
public final class C3845xp {

    /* renamed from: a */
    private final C2992c2 f12666a;

    public C3845xp(C2992c2 eventsWrapper) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventsWrapper, "eventsWrapper");
        this.f12666a = eventsWrapper;
    }

    /* renamed from: a */
    public final void m13105a() {
        this.f12666a.m8075a(EnumC3889z1.OPERATIONAL_LOAD_AD, new HashMap());
    }

    /* renamed from: b */
    public final void m13109b() {
        this.f12666a.m8075a(EnumC3889z1.PAUSE_AD, null);
    }

    /* renamed from: c */
    public final void m13110c() {
        this.f12666a.m8075a(EnumC3889z1.RESUME_AD, null);
    }

    /* renamed from: a */
    public final void m13107a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f12666a.m8075a(EnumC3889z1.OPERATIONAL_LOAD_SUCCESS, map);
    }

    /* renamed from: a */
    public final void m13108a(long j, int i, String reason) {
        kotlin.jvm.internal.OooOo.OooO0o0(reason, "reason");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        map.put("reason", reason);
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f12666a.m8075a(EnumC3889z1.OPERATIONAL_LOAD_FAILED, map);
    }

    /* renamed from: a */
    public final void m13106a(double d) {
        this.f12666a.m8075a(EnumC3889z1.OPERATIONAL_SET_CONFIGURATIONS, o00O0.o0O0O00.OooOOOo(new oo00o.OooOO0(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }
}
