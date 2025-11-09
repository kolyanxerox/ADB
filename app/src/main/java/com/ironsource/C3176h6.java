package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* renamed from: com.ironsource.h6 */
/* loaded from: classes2.dex */
public final class C3176h6 extends C3682t0 {

    /* renamed from: s */
    private final String f8843s;

    /* renamed from: t */
    private final List<NetworkSettings> f8844t;

    /* renamed from: u */
    private final C3723u6 f8845u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C3176h6(String str, List<? extends NetworkSettings> list, C3723u6 configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        C3477o5 c3477o5M12547d = configs.m12547d();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M12547d, "configs.bannerAuctionSettings");
        super(ad_unit, str, list, c3477o5M12547d, configs.m12542a(), (int) (configs.m12545b() / 1000), configs.m12546c(), configs.m12549f(), -1, C3211i6.m9280b(configs), new C3137g2(configs.m12553j()), configs.m12548e(), configs.m12555l(), configs.m12557n(), configs.m12556m(), false, 32768, null);
        this.f8843s = str;
        this.f8844t = list;
        this.f8845u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3176h6 m9093a(C3176h6 c3176h6, String str, List list, C3723u6 c3723u6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3176h6.f8843s;
        }
        if ((i & 2) != 0) {
            list = c3176h6.f8844t;
        }
        if ((i & 4) != 0) {
            c3723u6 = c3176h6.f8845u;
        }
        return c3176h6.m9094a(str, list, c3723u6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3176h6)) {
            return false;
        }
        C3176h6 c3176h6 = (C3176h6) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8843s, c3176h6.f8843s) && kotlin.jvm.internal.OooOo.OooO00o(this.f8844t, c3176h6.f8844t) && kotlin.jvm.internal.OooOo.OooO00o(this.f8845u, c3176h6.f8845u);
    }

    public int hashCode() {
        String str = this.f8843s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f8844t;
        return this.f8845u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: j */
    public List<NetworkSettings> mo8379j() {
        return this.f8844t;
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: o */
    public String mo8380o() {
        return this.f8843s;
    }

    /* renamed from: s */
    public final String m9095s() {
        return this.f8843s;
    }

    /* renamed from: t */
    public final List<NetworkSettings> m9096t() {
        return this.f8844t;
    }

    public String toString() {
        return "BannerAdManagerData(userId=" + this.f8843s + ", providerList=" + this.f8844t + ", configs=" + this.f8845u + ')';
    }

    /* renamed from: u */
    public final C3723u6 m9097u() {
        return this.f8845u;
    }

    /* renamed from: v */
    public final C3723u6 m9098v() {
        return this.f8845u;
    }

    /* renamed from: a */
    public final C3176h6 m9094a(String str, List<? extends NetworkSettings> list, C3723u6 configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3176h6(str, list, configs);
    }
}
