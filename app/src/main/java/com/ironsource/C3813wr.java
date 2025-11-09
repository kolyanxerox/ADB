package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* renamed from: com.ironsource.wr */
/* loaded from: classes2.dex */
public final class C3813wr extends C3682t0 {

    /* renamed from: s */
    private final String f12526s;

    /* renamed from: t */
    private final List<NetworkSettings> f12527t;

    /* renamed from: u */
    private final C2983bs f12528u;

    /* renamed from: v */
    private final boolean f12529v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C3813wr(String str, List<? extends NetworkSettings> list, C2983bs configs, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        C3477o5 c3477o5M7994k = configs.m7994k();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M7994k, "configs.rewardedVideoAuctionSettings");
        super(ad_unit, str, list, c3477o5M7994k, configs.m7990g(), configs.m7991h(), configs.m7993j(), configs.m7985b(), configs.m7986c(), C3847xr.m13112b(configs, z), new C3137g2(-1L), configs.m7995l(), configs.m7989f(), configs.m7998o(), configs.m7997n(), false, 32768, null);
        this.f12526s = str;
        this.f12527t = list;
        this.f12528u = configs;
        this.f12529v = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C3813wr m12956a(C3813wr c3813wr, String str, List list, C2983bs c2983bs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3813wr.f12526s;
        }
        if ((i & 2) != 0) {
            list = c3813wr.f12527t;
        }
        if ((i & 4) != 0) {
            c2983bs = c3813wr.f12528u;
        }
        if ((i & 8) != 0) {
            z = c3813wr.f12529v;
        }
        return c3813wr.m12957a(str, list, c2983bs, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3813wr)) {
            return false;
        }
        C3813wr c3813wr = (C3813wr) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12526s, c3813wr.f12526s) && kotlin.jvm.internal.OooOo.OooO00o(this.f12527t, c3813wr.f12527t) && kotlin.jvm.internal.OooOo.OooO00o(this.f12528u, c3813wr.f12528u) && this.f12529v == c3813wr.f12529v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f12526s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f12527t;
        int iHashCode2 = (this.f12528u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        boolean z = this.f12529v;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: j */
    public List<NetworkSettings> mo8379j() {
        return this.f12527t;
    }

    @Override // com.ironsource.C3682t0
    /* renamed from: o */
    public String mo8380o() {
        return this.f12526s;
    }

    /* renamed from: s */
    public final String m12958s() {
        return this.f12526s;
    }

    /* renamed from: t */
    public final List<NetworkSettings> m12959t() {
        return this.f12527t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedVideoAdDataManager(userId=");
        sb.append(this.f12526s);
        sb.append(", providerList=");
        sb.append(this.f12527t);
        sb.append(", configs=");
        sb.append(this.f12528u);
        sb.append(", isManual=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f12529v, ')');
    }

    /* renamed from: u */
    public final C2983bs m12960u() {
        return this.f12528u;
    }

    /* renamed from: v */
    public final boolean m12961v() {
        return this.f12529v;
    }

    /* renamed from: w */
    public final C2983bs m12962w() {
        return this.f12528u;
    }

    /* renamed from: x */
    public final boolean m12963x() {
        return this.f12529v;
    }

    /* renamed from: a */
    public final C3813wr m12957a(String str, List<? extends NetworkSettings> list, C2983bs configs, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3813wr(str, list, configs, z);
    }
}
