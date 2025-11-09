package com.ironsource;

import com.ironsource.AbstractC3718u1;
import com.ironsource.C3350m2;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.sj */
/* loaded from: classes2.dex */
public final class C3666sj extends AbstractC3718u1 {

    /* renamed from: z */
    public static final a f11913z = new a(null);

    /* renamed from: t */
    private final C3061e1 f11914t;

    /* renamed from: u */
    private final boolean f11915u;

    /* renamed from: v */
    private final C3683t1 f11916v;

    /* renamed from: w */
    private final C3736uj f11917w;

    /* renamed from: x */
    private final String f11918x;

    /* renamed from: y */
    private final String f11919y;

    /* renamed from: com.ironsource.sj$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3666sj m12286a(C3061e1 adProperties, C3122fm c3122fm, boolean z) {
            List<C2980bp> listM8726d;
            C3571qt c3571qtM11051d;
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            AbstractC3718u1.a aVar = AbstractC3718u1.f12122r;
            C3725u8 c3725u8M11635c = (c3122fm == null || (c3571qtM11051d = c3122fm.m11051d()) == null) ? null : c3571qtM11051d.m11635c();
            C3736uj c3736ujM12635d = c3725u8M11635c != null ? c3725u8M11635c.m12635d() : null;
            if (c3736ujM12635d == null) {
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
            return new C3666sj(adProperties, z, new C3683t1(userIdForNetworks, arrayList, c3840xkM13069b), c3736ujM12635d);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3666sj(C3061e1 adProperties, boolean z, C3683t1 adUnitCommonData, C3736uj configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        String strM12356f = adUnitCommonData.m12356f();
        List<NetworkSettings> listM12354d = adUnitCommonData.m12354d();
        C3840xk c3840xkM12355e = adUnitCommonData.m12355e();
        C3477o5 c3477o5M12690g = configs.m12690g();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M12690g, "configs.interstitialAuctionSettings");
        super(adProperties, z, strM12356f, listM12354d, c3840xkM12355e, c3477o5M12690g, configs.m12686c(), configs.m12687d(), configs.m12689f(), configs.m12685b(), -1, new C3350m2(C3350m2.a.MANUAL, configs.m12690g().m11097j(), configs.m12690g().m11089b(), -1L), configs.m12691h(), configs.m12694k(), configs.m12696m(), configs.m12695l(), false, 65536, null);
        this.f11914t = adProperties;
        this.f11915u = z;
        this.f11916v = adUnitCommonData;
        this.f11917w = configs;
        this.f11918x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f11919y = C3157gm.f8742c;
    }

    /* renamed from: A */
    public final C3683t1 m12279A() {
        return this.f11916v;
    }

    /* renamed from: B */
    public final C3736uj m12280B() {
        return this.f11917w;
    }

    /* renamed from: a */
    public final C3666sj m12281a(C3061e1 adProperties, boolean z, C3683t1 adUnitCommonData, C3736uj configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3666sj(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public C3061e1 mo9364b() {
        return this.f11914t;
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: c */
    public String mo9366c() {
        return this.f11918x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3666sj)) {
            return false;
        }
        C3666sj c3666sj = (C3666sj) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f11914t, c3666sj.f11914t) && this.f11915u == c3666sj.f11915u && kotlin.jvm.internal.OooOo.OooO00o(this.f11916v, c3666sj.f11916v) && kotlin.jvm.internal.OooOo.OooO00o(this.f11917w, c3666sj.f11917w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f11914t.hashCode() * 31;
        boolean z = this.f11915u;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f11917w.hashCode() + ((this.f11916v.hashCode() + ((iHashCode + i) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: j */
    public String mo9367j() {
        return this.f11919y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f11914t + ", isPublisherLoad=" + this.f11915u + ", adUnitCommonData=" + this.f11916v + ", configs=" + this.f11917w + ')';
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: u */
    public boolean mo10003u() {
        return this.f11915u;
    }

    /* renamed from: w */
    public final C3061e1 m12282w() {
        return this.f11914t;
    }

    /* renamed from: x */
    public final boolean m12283x() {
        return this.f11915u;
    }

    /* renamed from: y */
    public final C3683t1 m12284y() {
        return this.f11916v;
    }

    /* renamed from: z */
    public final C3736uj m12285z() {
        return this.f11917w;
    }

    /* renamed from: a */
    public static /* synthetic */ C3666sj m12278a(C3666sj c3666sj, C3061e1 c3061e1, boolean z, C3683t1 c3683t1, C3736uj c3736uj, int i, Object obj) {
        if ((i & 1) != 0) {
            c3061e1 = c3666sj.f11914t;
        }
        if ((i & 2) != 0) {
            z = c3666sj.f11915u;
        }
        if ((i & 4) != 0) {
            c3683t1 = c3666sj.f11916v;
        }
        if ((i & 8) != 0) {
            c3736uj = c3666sj.f11917w;
        }
        return c3666sj.m12281a(c3061e1, z, c3683t1, c3736uj);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public JSONObject mo9365b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
