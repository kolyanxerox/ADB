package com.ironsource;

import com.ironsource.AbstractC3718u1;
import com.ironsource.C3350m2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.m6 */
/* loaded from: classes2.dex */
public final class C3354m6 extends AbstractC3718u1 {

    /* renamed from: z */
    public static final a f9491z = new a(null);

    /* renamed from: t */
    private final C3245j6 f9492t;

    /* renamed from: u */
    private final boolean f9493u;

    /* renamed from: v */
    private final C3683t1 f9494v;

    /* renamed from: w */
    private final C3723u6 f9495w;

    /* renamed from: x */
    private final String f9496x;

    /* renamed from: y */
    private final String f9497y;

    /* renamed from: com.ironsource.m6$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3354m6 m10008a(C3245j6 adProperties, C3122fm c3122fm, boolean z) {
            List<C2980bp> listM8726d;
            C3571qt c3571qtM11051d;
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            AbstractC3718u1.a aVar = AbstractC3718u1.f12122r;
            C3725u8 c3725u8M11635c = (c3122fm == null || (c3571qtM11051d = c3122fm.m11051d()) == null) ? null : c3571qtM11051d.m11635c();
            C3723u6 c3723u6M12634c = c3725u8M11635c != null ? c3725u8M11635c.m12634c() : null;
            if (c3723u6M12634c == null) {
                throw new IllegalStateException("Error getting " + adProperties.m8434a() + " configurations");
            }
            if (c3122fm == null || (listM8726d = c3122fm.m8726d(adProperties.m8439e(), adProperties.m8437c())) == null) {
                listM8726d = o00O0.oo000o.f31251OooOo0O;
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listM8726d, 10));
            Iterator<T> it = listM8726d.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2980bp) it.next()).m7963f());
            }
            C3840xk c3840xkM13069b = C3840xk.m13069b();
            kotlin.jvm.internal.OooOo.OooO0Oo(c3840xkM13069b, "getInstance()");
            return new C3354m6(adProperties, z, new C3683t1(userIdForNetworks, arrayList, c3840xkM13069b), c3723u6M12634c);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3354m6(C3245j6 adProperties, boolean z, C3683t1 adUnitCommonData, C3723u6 configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        String strM12356f = adUnitCommonData.m12356f();
        List<NetworkSettings> listM12354d = adUnitCommonData.m12354d();
        C3840xk c3840xkM12355e = adUnitCommonData.m12355e();
        C3477o5 c3477o5M12547d = configs.m12547d();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M12547d, "configs.bannerAuctionSettings");
        super(adProperties, z, strM12356f, listM12354d, c3840xkM12355e, c3477o5M12547d, configs.m12542a(), (int) (configs.m12545b() / 1000), configs.m12546c(), configs.m12549f(), -1, new C3350m2(C3350m2.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.m12547d().m11097j(), configs.m12547d().m11089b(), 1000 * configs.m12551h()), configs.m12548e(), configs.m12555l(), configs.m12557n(), configs.m12556m(), false, 65536, null);
        this.f9492t = adProperties;
        this.f9493u = z;
        this.f9494v = adUnitCommonData;
        this.f9495w = configs;
        this.f9496x = "BN";
        this.f9497y = C3157gm.f8743d;
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: A */
    public C3245j6 mo9364b() {
        return this.f9492t;
    }

    /* renamed from: B */
    public final C3683t1 m9999B() {
        return this.f9494v;
    }

    /* renamed from: C */
    public final C3723u6 m10000C() {
        return this.f9495w;
    }

    /* renamed from: a */
    public final C3354m6 m10001a(C3245j6 adProperties, boolean z, C3683t1 adUnitCommonData, C3723u6 configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3354m6(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: c */
    public String mo9366c() {
        return this.f9496x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3354m6)) {
            return false;
        }
        C3354m6 c3354m6 = (C3354m6) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f9492t, c3354m6.f9492t) && this.f9493u == c3354m6.f9493u && kotlin.jvm.internal.OooOo.OooO00o(this.f9494v, c3354m6.f9494v) && kotlin.jvm.internal.OooOo.OooO00o(this.f9495w, c3354m6.f9495w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f9492t.hashCode() * 31;
        boolean z = this.f9493u;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f9495w.hashCode() + ((this.f9494v.hashCode() + ((iHashCode + i) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: j */
    public String mo9367j() {
        return this.f9497y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f9492t + ", isPublisherLoad=" + this.f9493u + ", adUnitCommonData=" + this.f9494v + ", configs=" + this.f9495w + ')';
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: u */
    public boolean mo10003u() {
        return this.f9493u;
    }

    /* renamed from: w */
    public final C3245j6 m10004w() {
        return this.f9492t;
    }

    /* renamed from: x */
    public final boolean m10005x() {
        return this.f9493u;
    }

    /* renamed from: y */
    public final C3683t1 m10006y() {
        return this.f9494v;
    }

    /* renamed from: z */
    public final C3723u6 m10007z() {
        return this.f9495w;
    }

    /* renamed from: a */
    public static /* synthetic */ C3354m6 m9997a(C3354m6 c3354m6, C3245j6 c3245j6, boolean z, C3683t1 c3683t1, C3723u6 c3723u6, int i, Object obj) {
        if ((i & 1) != 0) {
            c3245j6 = c3354m6.f9492t;
        }
        if ((i & 2) != 0) {
            z = c3354m6.f9493u;
        }
        if ((i & 4) != 0) {
            c3683t1 = c3354m6.f9494v;
        }
        if ((i & 8) != 0) {
            c3723u6 = c3354m6.f9495w;
        }
        return c3354m6.m10001a(c3245j6, z, c3683t1, c3723u6);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public JSONObject mo9365b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: a */
    public AdData mo10002a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(mo9365b(providerSettings), mo9364b().m8434a(), m12522r(), new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), new C3240j1().m9411b(mo9364b().m9442h())));
        kotlin.jvm.internal.OooOo.OooO0Oo(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
