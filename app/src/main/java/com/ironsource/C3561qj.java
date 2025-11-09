package com.ironsource;

import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* renamed from: com.ironsource.qj */
/* loaded from: classes2.dex */
public final class C3561qj extends C3682t0 {

    /* renamed from: s */
    private final String f10945s;

    /* renamed from: t */
    private final List<NetworkSettings> f10946t;

    /* renamed from: u */
    private final C3736uj f10947u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C3561qj(String str, List<? extends NetworkSettings> list, C3736uj configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        C3477o5 c3477o5M12690g = configs.m12690g();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M12690g, "configs.interstitialAuctionSettings");
        super(ad_unit, str, list, c3477o5M12690g, configs.m12686c(), configs.m12687d(), configs.m12689f(), configs.m12685b(), -1, new C3350m2(C3350m2.a.MANUAL, configs.m12690g().m11097j(), configs.m12690g().m11089b(), -1L), new C3137g2(-1L), configs.m12691h(), configs.m12694k(), configs.m12696m(), configs.m12695l(), false, 32768, null);
        this.f10945s = str;
        this.f10946t = list;
        this.f10947u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3561qj m11561a(C3561qj c3561qj, String str, List list, C3736uj c3736uj, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3561qj.f10945s;
        }
        if ((i & 2) != 0) {
            list = c3561qj.f10946t;
        }
        if ((i & 4) != 0) {
            c3736uj = c3561qj.f10947u;
        }
        return c3561qj.m11562a(str, list, c3736uj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3561qj)) {
            return false;
        }
        C3561qj c3561qj = (C3561qj) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f10945s, c3561qj.f10945s) && kotlin.jvm.internal.OooOo.OooO00o(this.f10946t, c3561qj.f10946t) && kotlin.jvm.internal.OooOo.OooO00o(this.f10947u, c3561qj.f10947u);
    }

    public int hashCode() {
        String str = this.f10945s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f10946t;
        return this.f10947u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: j */
    public List<NetworkSettings> mo8379j() {
        return this.f10946t;
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: o */
    public String mo8380o() {
        return this.f10945s;
    }

    /* renamed from: s */
    public final String m11563s() {
        return this.f10945s;
    }

    /* renamed from: t */
    public final List<NetworkSettings> m11564t() {
        return this.f10946t;
    }

    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f10945s + ", providerList=" + this.f10946t + ", configs=" + this.f10947u + ')';
    }

    /* renamed from: u */
    public final C3736uj m11565u() {
        return this.f10947u;
    }

    /* renamed from: v */
    public final C3736uj m11566v() {
        return this.f10947u;
    }

    /* renamed from: a */
    public final C3561qj m11562a(String str, List<? extends NetworkSettings> list, C3736uj configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3561qj(str, list, configs);
    }
}
