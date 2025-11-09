package com.ironsource;

import com.ironsource.C2992c2;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.bc */
/* loaded from: classes2.dex */
public final class C2967bc implements InterfaceC2957b2 {

    /* renamed from: a */
    private final IronSource.AD_UNIT f7585a;

    /* renamed from: b */
    private final C2992c2 f7586b;

    /* renamed from: c */
    private final List<InterfaceC2957b2> f7587c;

    /* renamed from: d */
    private final C3665si f7588d;

    /* renamed from: e */
    private final C2978bn f7589e;

    /* renamed from: f */
    private final C3167gw f7590f;

    /* renamed from: g */
    private final C3546q4 f7591g;

    /* renamed from: h */
    private final C3348m0 f7592h;

    /* renamed from: i */
    private final C3345lw f7593i;

    /* renamed from: j */
    private final C3845xp f7594j;

    public C2967bc(IronSource.AD_UNIT adFormat, C2992c2.b level, List<? extends InterfaceC2957b2> eventsInterfaces, AbstractC3724u7 abstractC3724u7) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
        kotlin.jvm.internal.OooOo.OooO0o0(eventsInterfaces, "eventsInterfaces");
        this.f7585a = adFormat;
        C2992c2 c2992c2 = new C2992c2(adFormat, level, this, abstractC3724u7);
        this.f7586b = c2992c2;
        this.f7587c = o00O0.OooOo00.Oooo0o(eventsInterfaces);
        C3665si c3665si = c2992c2.f7683e;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3665si, "wrapper.init");
        this.f7588d = c3665si;
        C2978bn c2978bn = c2992c2.f7684f;
        kotlin.jvm.internal.OooOo.OooO0Oo(c2978bn, "wrapper.load");
        this.f7589e = c2978bn;
        C3167gw c3167gw = c2992c2.f7685g;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3167gw, "wrapper.token");
        this.f7590f = c3167gw;
        C3546q4 c3546q4 = c2992c2.f7686h;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3546q4, "wrapper.auction");
        this.f7591g = c3546q4;
        C3348m0 c3348m0 = c2992c2.f7687i;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3348m0, "wrapper.adInteraction");
        this.f7592h = c3348m0;
        C3345lw c3345lw = c2992c2.f7688j;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3345lw, "wrapper.troubleshoot");
        this.f7593i = c3345lw;
        C3845xp c3845xp = c2992c2.f7689k;
        kotlin.jvm.internal.OooOo.OooO0Oo(c3845xp, "wrapper.operational");
        this.f7594j = c3845xp;
    }

    /* renamed from: a */
    public final C3348m0 m7902a() {
        return this.f7592h;
    }

    /* renamed from: b */
    public final C3546q4 m7905b() {
        return this.f7591g;
    }

    /* renamed from: c */
    public final List<InterfaceC2957b2> m7906c() {
        return this.f7587c;
    }

    /* renamed from: d */
    public final C3665si m7907d() {
        return this.f7588d;
    }

    /* renamed from: e */
    public final C2978bn m7908e() {
        return this.f7589e;
    }

    /* renamed from: f */
    public final C3845xp m7909f() {
        return this.f7594j;
    }

    /* renamed from: g */
    public final C3167gw m7910g() {
        return this.f7590f;
    }

    /* renamed from: h */
    public final C3345lw m7911h() {
        return this.f7593i;
    }

    public /* synthetic */ C2967bc(IronSource.AD_UNIT ad_unit, C2992c2.b bVar, List list, AbstractC3724u7 abstractC3724u7, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(ad_unit, bVar, (i & 4) != 0 ? o00O0.oo000o.f31251OooOo0O : list, (i & 8) != 0 ? null : abstractC3724u7);
    }

    @Override // com.ironsource.InterfaceC2957b2
    /* renamed from: a */
    public Map<String, Object> mo4765a(EnumC3889z1 event) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        HashMap map = new HashMap();
        Iterator<InterfaceC2957b2> it = this.f7587c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapMo4765a = it.next().mo4765a(event);
            kotlin.jvm.internal.OooOo.OooO0Oo(mapMo4765a, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapMo4765a);
        }
        return map;
    }

    /* renamed from: a */
    public final void m7903a(InterfaceC2957b2 eventInterface) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventInterface, "eventInterface");
        this.f7587c.add(eventInterface);
    }

    /* renamed from: a */
    public final void m7904a(boolean z) {
        if (z) {
            this.f7589e.m7949a(true);
        } else {
            if (z) {
                throw new OooOOO0.OooO00o();
            }
            if (this.f7585a == IronSource.AD_UNIT.BANNER) {
                this.f7589e.m7940a();
            } else {
                this.f7589e.m7949a(false);
            }
        }
    }
}
