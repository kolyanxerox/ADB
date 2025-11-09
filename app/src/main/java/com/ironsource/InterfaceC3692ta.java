package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.ta */
/* loaded from: classes2.dex */
public interface InterfaceC3692ta {

    /* renamed from: com.ironsource.ta$a */
    public static final class a {

        /* renamed from: a */
        private final Map<String, Object> f12044a;

        public a(String providerName) {
            kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
            this.f12044a = o00O0.o0O0O00.OooOOo(new oo00o.OooOO0(IronSourceConstants.EVENTS_PROVIDER, providerName), new oo00o.OooOO0(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        /* renamed from: a */
        public final Map<String, Object> m12417a() {
            return o00O0.o0O0O00.OooOoO0(this.f12044a);
        }

        /* renamed from: a */
        public final void m12418a(String key, Object value) {
            kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this.f12044a.put(key, value);
        }
    }

    /* renamed from: com.ironsource.ta$b */
    public static final class b implements InterfaceC3692ta {

        /* renamed from: a */
        private final InterfaceC3903zf f12045a;

        /* renamed from: b */
        private final a f12046b;

        public b(InterfaceC3903zf eventManager, a eventBaseData) {
            kotlin.jvm.internal.OooOo.OooO0o0(eventManager, "eventManager");
            kotlin.jvm.internal.OooOo.OooO0o0(eventBaseData, "eventBaseData");
            this.f12045a = eventManager;
            this.f12046b = eventBaseData;
        }

        @Override // com.ironsource.InterfaceC3692ta
        /* renamed from: a */
        public void mo12415a(EnumC2638ac eventName, EnumC3054dt enumC3054dt) {
            kotlin.jvm.internal.OooOo.OooO0o0(eventName, "eventName");
            Map<String, Object> mapM12417a = this.f12046b.m12417a();
            if (enumC3054dt != null) {
                mapM12417a.put(IronSourceConstants.EVENTS_EXT1, enumC3054dt.toString());
            }
            this.f12045a.mo12605a(new C3899zb(eventName, new JSONObject(o00O0.o0O0O00.OooOo(mapM12417a))));
        }

        @Override // com.ironsource.InterfaceC3692ta
        /* renamed from: a */
        public void mo12416a(EnumC2638ac eventName, String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(eventName, "eventName");
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            Map<String, Object> mapM12417a = this.f12046b.m12417a();
            mapM12417a.put("spId", instanceId);
            this.f12045a.mo12605a(new C3899zb(eventName, new JSONObject(o00O0.o0O0O00.OooOo(mapM12417a))));
        }
    }

    /* renamed from: a */
    void mo12415a(EnumC2638ac enumC2638ac, EnumC3054dt enumC3054dt);

    /* renamed from: a */
    void mo12416a(EnumC2638ac enumC2638ac, String str);
}
