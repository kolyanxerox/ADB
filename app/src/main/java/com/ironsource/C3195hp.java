package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.hp */
/* loaded from: classes2.dex */
public final class C3195hp extends AbstractC3203hx {

    /* renamed from: e */
    private final C3719u2 f8910e;

    /* renamed from: f */
    private final AbstractC3718u1 f8911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195hp(C3719u2 tools, AbstractC3718u1 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f8910e = tools;
        this.f8911f = adUnitData;
    }

    /* renamed from: b */
    private final C3244j5 m9219b() {
        return new C3244j5("", new JSONObject(), null, 0, "");
    }

    /* renamed from: c */
    private final Map<String, C3135g0> m9220c() {
        C3270jv c3270jvM8441g = this.f8911f.mo9364b().m8441g();
        List<NetworkSettings> listM12517m = this.f8911f.m12517m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM12517m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c3270jvM8441g == null || c3270jvM8441g.m9544a(networkSettings, this.f8911f.mo9364b().m8434a())) {
                if (!networkSettings.isBidder(this.f8911f.mo9364b().m8434a())) {
                    arrayList.add(obj);
                }
            }
        }
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(arrayList, 10));
        if (iOooOOOO < 16) {
            iOooOOOO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            NetworkSettings networkSettings2 = (NetworkSettings) obj2;
            linkedHashMap.put(networkSettings2.getProviderInstanceName(), new C3135g0(this.f8910e, this.f8911f, networkSettings2));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    private final List<C3353m5> m9221d() {
        C3270jv c3270jvM8441g = this.f8911f.mo9364b().m8441g();
        List<NetworkSettings> listM12517m = this.f8911f.m12517m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM12517m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c3270jvM8441g == null || c3270jvM8441g.m9544a(networkSettings, this.f8911f.mo9364b().m8434a())) {
                if (!networkSettings.isBidder(this.f8911f.mo9364b().m8434a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(o00O0.Oooo000.OooOo0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new C3353m5(((NetworkSettings) obj2).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.AbstractC3203hx
    /* renamed from: a */
    public void mo9222a(InterfaceC2990c0 adInstanceFactory, InterfaceC3237ix waterfallFetcherListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8910e, "auction disabled", (String) null, 2, (Object) null));
        m9218a(waterfallFetcherListener, m9219b(), adInstanceFactory);
    }

    /* renamed from: a */
    public final void m9223a(InterfaceC3237ix waterfallFetcherListener, int i, String auctionFallback, String auctionId, InterfaceC2990c0 adInstanceFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "adInstanceFactory");
        m9218a(waterfallFetcherListener, new C3244j5(auctionId, new JSONObject(), null, i, auctionFallback), adInstanceFactory);
    }

    /* renamed from: a */
    private final void m9218a(InterfaceC3237ix interfaceC3237ix, C3244j5 c3244j5, InterfaceC2990c0 interfaceC2990c0) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8910e, (String) null, (String) null, 3, (Object) null));
        interfaceC3237ix.mo8845a(m9244a(m9221d(), m9220c(), c3244j5, interfaceC2990c0));
    }
}
