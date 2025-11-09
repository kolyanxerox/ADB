package com.ironsource;

import com.ironsource.mediationsdk.C3390h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.q2 */
/* loaded from: classes2.dex */
public final class C3544q2 extends C3390h {

    /* renamed from: e */
    private final Map<String, C3239j0> f10866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3544q2(List<? extends NetworkSettings> providers, int i) {
        super(providers, i);
        kotlin.jvm.internal.OooOo.OooO0o0(providers, "providers");
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(providers, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO < 16 ? 16 : iOooOOOO);
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((NetworkSettings) it.next()).getProviderName(), new C3239j0(i));
        }
        this.f10866e = linkedHashMap;
    }

    @Override // com.ironsource.mediationsdk.C3390h
    /* renamed from: a */
    public String mo10287a(String instanceName) {
        String strM9404d;
        kotlin.jvm.internal.OooOo.OooO0o0(instanceName, "instanceName");
        C3239j0 c3239j0 = this.f10866e.get(instanceName);
        return (c3239j0 == null || (strM9404d = c3239j0.m9404d()) == null) ? "" : strM9404d;
    }

    /* renamed from: a */
    public final void m11468a(C3272jx waterfallInstances) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
        List<AbstractC3887z> listM9559b = waterfallInstances.m9559b();
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(listM9559b, 10));
        if (iOooOOOO < 16) {
            iOooOOOO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO);
        for (AbstractC3887z abstractC3887z : listM9559b) {
            linkedHashMap.put(abstractC3887z.m13276o(), abstractC3887z.m13279r());
        }
        m11467a(linkedHashMap);
    }

    /* renamed from: a */
    private final void m11467a(Map<String, C3170h0> map) {
        for (Map.Entry<String, C3239j0> entry : this.f10866e.entrySet()) {
            entry.getValue().m9403a(map.get(entry.getKey()));
        }
    }
}
