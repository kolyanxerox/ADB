package com.ironsource;

import com.ironsource.C3473o1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.a0 */
/* loaded from: classes2.dex */
public final class C2626a0 {

    /* renamed from: a */
    private final AbstractC3718u1 f3858a;

    /* renamed from: b */
    private final NetworkSettings f3859b;

    /* renamed from: c */
    private final C3244j5 f3860c;

    /* renamed from: d */
    private final C2629a3 f3861d;

    /* renamed from: e */
    private final C3353m5 f3862e;

    /* renamed from: f */
    private final int f3863f;

    /* renamed from: g */
    private final C3170h0 f3864g;

    /* renamed from: h */
    private final IronSource.AD_UNIT f3865h;

    /* renamed from: i */
    private final JSONObject f3866i;

    /* renamed from: j */
    private final String f3867j;

    /* renamed from: k */
    private final int f3868k;

    /* renamed from: l */
    private final String f3869l;

    /* renamed from: m */
    private final C3353m5 f3870m;

    /* renamed from: n */
    private final String f3871n;

    /* renamed from: o */
    private final String f3872o;

    /* renamed from: p */
    private final int f3873p;

    /* renamed from: q */
    private final AdData f3874q;

    public C2626a0(AbstractC3718u1 adUnitData, NetworkSettings providerSettings, C3244j5 auctionData, C2629a3 adapterConfig, C3353m5 auctionResponseItem, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionResponseItem, "auctionResponseItem");
        this.f3858a = adUnitData;
        this.f3859b = providerSettings;
        this.f3860c = auctionData;
        this.f3861d = adapterConfig;
        this.f3862e = auctionResponseItem;
        this.f3863f = i;
        this.f3864g = new C3170h0(C3473o1.a.DidntAttemptToLoad);
        IronSource.AD_UNIT ad_unitM8434a = adUnitData.mo9364b().m8434a();
        this.f3865h = ad_unitM8434a;
        this.f3866i = auctionData.m9439h();
        this.f3867j = auctionData.m9438g();
        this.f3868k = auctionData.m9440i();
        this.f3869l = auctionData.m9437f();
        this.f3870m = auctionData.m9441j();
        String strM4771f = adapterConfig.m4771f();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM4771f, "adapterConfig.providerName");
        this.f3871n = strM4771f;
        this.f3872o = String.format("%s %s", Arrays.copyOf(new Object[]{strM4771f, Integer.valueOf(hashCode())}, 2));
        this.f3873p = adapterConfig.m4769d();
        String strM9994k = auctionResponseItem.m9994k();
        Map<String, Object> mapM12446a = C3702tk.m12446a(auctionResponseItem.m9984a());
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM12446a, "jsonObjectToMap(auctionResponseItem.adData)");
        mapM12446a.put("adUnit", ad_unitM8434a);
        HashMap map = new HashMap();
        Map<String, Object> mapM12446a2 = C3702tk.m12446a(adapterConfig.m4768c());
        kotlin.jvm.internal.OooOo.OooO0Oo(mapM12446a2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapM12446a2);
        mapM12446a.put("userId", adUnitData.m12522r());
        mapM12446a.put("adUnitId", adUnitData.mo9364b().m8437c());
        mapM12446a.put("isMultipleAdUnits", Boolean.TRUE);
        this.f3874q = new AdData(strM9994k, map, mapM12446a);
    }

    /* renamed from: a */
    public static /* synthetic */ C2626a0 m4737a(C2626a0 c2626a0, AbstractC3718u1 abstractC3718u1, NetworkSettings networkSettings, C3244j5 c3244j5, C2629a3 c2629a3, C3353m5 c3353m5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC3718u1 = c2626a0.f3858a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c2626a0.f3859b;
        }
        if ((i2 & 4) != 0) {
            c3244j5 = c2626a0.f3860c;
        }
        if ((i2 & 8) != 0) {
            c2629a3 = c2626a0.f3861d;
        }
        if ((i2 & 16) != 0) {
            c3353m5 = c2626a0.f3862e;
        }
        if ((i2 & 32) != 0) {
            i = c2626a0.f3863f;
        }
        C3353m5 c3353m52 = c3353m5;
        int i3 = i;
        return c2626a0.m4738a(abstractC3718u1, networkSettings, c3244j5, c2629a3, c3353m52, i3);
    }

    /* renamed from: b */
    public final NetworkSettings m4741b() {
        return this.f3859b;
    }

    /* renamed from: c */
    public final C3244j5 m4742c() {
        return this.f3860c;
    }

    /* renamed from: d */
    public final C2629a3 m4743d() {
        return this.f3861d;
    }

    /* renamed from: e */
    public final C3353m5 m4744e() {
        return this.f3862e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2626a0)) {
            return false;
        }
        C2626a0 c2626a0 = (C2626a0) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f3858a, c2626a0.f3858a) && kotlin.jvm.internal.OooOo.OooO00o(this.f3859b, c2626a0.f3859b) && kotlin.jvm.internal.OooOo.OooO00o(this.f3860c, c2626a0.f3860c) && kotlin.jvm.internal.OooOo.OooO00o(this.f3861d, c2626a0.f3861d) && kotlin.jvm.internal.OooOo.OooO00o(this.f3862e, c2626a0.f3862e) && this.f3863f == c2626a0.f3863f;
    }

    /* renamed from: f */
    public final int m4745f() {
        return this.f3863f;
    }

    /* renamed from: g */
    public final AdData m4746g() {
        return this.f3874q;
    }

    /* renamed from: h */
    public final IronSource.AD_UNIT m4747h() {
        return this.f3865h;
    }

    public int hashCode() {
        return Integer.hashCode(this.f3863f) + ((this.f3862e.hashCode() + ((this.f3861d.hashCode() + ((this.f3860c.hashCode() + ((this.f3859b.hashCode() + (this.f3858a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* renamed from: i */
    public final AbstractC3718u1 m4748i() {
        return this.f3858a;
    }

    /* renamed from: j */
    public final C2629a3 m4749j() {
        return this.f3861d;
    }

    /* renamed from: k */
    public final C3244j5 m4750k() {
        return this.f3860c;
    }

    /* renamed from: l */
    public final String m4751l() {
        return this.f3869l;
    }

    /* renamed from: m */
    public final String m4752m() {
        return this.f3867j;
    }

    /* renamed from: n */
    public final C3353m5 m4753n() {
        return this.f3862e;
    }

    /* renamed from: o */
    public final int m4754o() {
        return this.f3868k;
    }

    /* renamed from: p */
    public final C3353m5 m4755p() {
        return this.f3870m;
    }

    /* renamed from: q */
    public final JSONObject m4756q() {
        return this.f3866i;
    }

    /* renamed from: r */
    public final String m4757r() {
        return this.f3871n;
    }

    /* renamed from: s */
    public final int m4758s() {
        return this.f3873p;
    }

    /* renamed from: t */
    public final C3170h0 m4759t() {
        return this.f3864g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdInstanceData(adUnitData=");
        sb.append(this.f3858a);
        sb.append(", providerSettings=");
        sb.append(this.f3859b);
        sb.append(", auctionData=");
        sb.append(this.f3860c);
        sb.append(", adapterConfig=");
        sb.append(this.f3861d);
        sb.append(", auctionResponseItem=");
        sb.append(this.f3862e);
        sb.append(", sessionDepth=");
        return OooO0oO.OooOo.OooOOO0(sb, this.f3863f, ')');
    }

    /* renamed from: u */
    public final NetworkSettings m4760u() {
        return this.f3859b;
    }

    /* renamed from: v */
    public final int m4761v() {
        return this.f3863f;
    }

    /* renamed from: w */
    public final String m4762w() {
        return this.f3872o;
    }

    /* renamed from: a */
    public final C2626a0 m4738a(AbstractC3718u1 adUnitData, NetworkSettings providerSettings, C3244j5 auctionData, C2629a3 adapterConfig, C3353m5 auctionResponseItem, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        kotlin.jvm.internal.OooOo.OooO0o0(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionResponseItem, "auctionResponseItem");
        return new C2626a0(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i);
    }

    /* renamed from: a */
    public final AbstractC3718u1 m4739a() {
        return this.f3858a;
    }

    /* renamed from: a */
    public final void m4740a(C3473o1.a performance) {
        kotlin.jvm.internal.OooOo.OooO0o0(performance, "performance");
        this.f3864g.m9030b(performance);
    }
}
