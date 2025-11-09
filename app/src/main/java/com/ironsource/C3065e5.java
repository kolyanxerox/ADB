package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.e5 */
/* loaded from: classes2.dex */
public final class C3065e5 {

    /* renamed from: a */
    private final AbstractC3718u1 f8371a;

    /* renamed from: b */
    private final Map<String, Object> f8372b;

    /* renamed from: c */
    private final List<String> f8373c;

    /* renamed from: d */
    private final StringBuilder f8374d;

    public C3065e5(AbstractC3718u1 adUnitData) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f8371a = adUnitData;
        this.f8372b = new HashMap();
        this.f8373c = new ArrayList();
        this.f8374d = new StringBuilder();
    }

    /* renamed from: a */
    public final Map<String, Object> m8449a() {
        return this.f8372b;
    }

    /* renamed from: b */
    public final List<String> m8453b() {
        return this.f8373c;
    }

    /* renamed from: c */
    public final StringBuilder m8454c() {
        return this.f8374d;
    }

    /* renamed from: d */
    public final boolean m8455d() {
        return (this.f8372b.isEmpty() && this.f8373c.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public final void m8450a(C2998c8 biddingResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(biddingResponse, "biddingResponse");
        String strM8103c = biddingResponse.m8103c();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM8103c, "biddingResponse.instanceName");
        int iM8104d = biddingResponse.m8104d();
        Map<String, Object> mapM8101a = biddingResponse.m8101a();
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM8101a, "biddingResponse.biddingData");
        m8448a(strM8103c, iM8104d, mapM8101a);
    }

    /* renamed from: a */
    public final void m8451a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        List<String> list = this.f8373c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.OooOo.OooO0Oo(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.f8374d;
        sb.append(providerSettings.getInstanceType(this.f8371a.mo9364b().m8434a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(",");
    }

    /* renamed from: a */
    public final void m8452a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.OooOo.OooO0Oo(providerInstanceName, "providerSettings.providerInstanceName");
        m8448a(providerInstanceName, providerSettings.getInstanceType(this.f8371a.mo9364b().m8434a()), biddingData);
    }

    /* renamed from: a */
    private final void m8448a(String str, int i, Map<String, ? extends Object> map) {
        this.f8372b.put(str, map);
        StringBuilder sb = this.f8374d;
        sb.append(i);
        sb.append(str);
        sb.append(",");
    }
}
