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

/* renamed from: com.ironsource.vr */
/* loaded from: classes2.dex */
public final class C3779vr extends AbstractC3718u1 {

    /* renamed from: z */
    public static final a f12410z = new a(null);

    /* renamed from: t */
    private final C3061e1 f12411t;

    /* renamed from: u */
    private final boolean f12412u;

    /* renamed from: v */
    private final C3683t1 f12413v;

    /* renamed from: w */
    private final C2983bs f12414w;

    /* renamed from: x */
    private final String f12415x;

    /* renamed from: y */
    private final String f12416y;

    /* renamed from: com.ironsource.vr$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3779vr m12810a(C3061e1 adProperties, C3122fm c3122fm, boolean z) {
            List<C2980bp> listM8726d;
            C3571qt c3571qtM11051d;
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            AbstractC3718u1.a aVar = AbstractC3718u1.f12122r;
            C3725u8 c3725u8M11635c = (c3122fm == null || (c3571qtM11051d = c3122fm.m11051d()) == null) ? null : c3571qtM11051d.m11635c();
            C2983bs c2983bsM12637f = c3725u8M11635c != null ? c3725u8M11635c.m12637f() : null;
            if (c2983bsM12637f == null) {
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
            return new C3779vr(adProperties, z, new C3683t1(userIdForNetworks, arrayList, c3840xkM13069b), c2983bsM12637f);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3779vr(C3061e1 adProperties, boolean z, C3683t1 adUnitCommonData, C2983bs configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        String strM12356f = adUnitCommonData.m12356f();
        List<NetworkSettings> listM12354d = adUnitCommonData.m12354d();
        C3840xk c3840xkM12355e = adUnitCommonData.m12355e();
        C3477o5 c3477o5M7994k = configs.m7994k();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3477o5M7994k, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z, strM12356f, listM12354d, c3840xkM12355e, c3477o5M7994k, configs.m7990g(), configs.m7991h(), configs.m7993j(), configs.m7985b(), configs.m7986c(), new C3350m2(C3350m2.a.MANUAL, configs.m7994k().m11097j(), configs.m7994k().m11089b(), -1L), configs.m7995l(), configs.m7989f(), configs.m7998o(), configs.m7997n(), false, 65536, null);
        this.f12411t = adProperties;
        this.f12412u = z;
        this.f12413v = adUnitCommonData;
        this.f12414w = configs;
        this.f12415x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f12416y = C3157gm.f8741b;
    }

    /* renamed from: A */
    public final C3683t1 m12803A() {
        return this.f12413v;
    }

    /* renamed from: B */
    public final C2983bs m12804B() {
        return this.f12414w;
    }

    /* renamed from: a */
    public final C3779vr m12805a(C3061e1 adProperties, boolean z, C3683t1 adUnitCommonData, C2983bs configs) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.OooOo.OooO0o0(configs, "configs");
        return new C3779vr(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public C3061e1 mo9364b() {
        return this.f12411t;
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: c */
    public String mo9366c() {
        return this.f12415x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3779vr)) {
            return false;
        }
        C3779vr c3779vr = (C3779vr) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12411t, c3779vr.f12411t) && this.f12412u == c3779vr.f12412u && kotlin.jvm.internal.OooOo.OooO00o(this.f12413v, c3779vr.f12413v) && kotlin.jvm.internal.OooOo.OooO00o(this.f12414w, c3779vr.f12414w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f12411t.hashCode() * 31;
        boolean z = this.f12412u;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f12414w.hashCode() + ((this.f12413v.hashCode() + ((iHashCode + i) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: j */
    public String mo9367j() {
        return this.f12416y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f12411t + ", isPublisherLoad=" + this.f12412u + ", adUnitCommonData=" + this.f12413v + ", configs=" + this.f12414w + ')';
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: u */
    public boolean mo10003u() {
        return this.f12412u;
    }

    /* renamed from: w */
    public final C3061e1 m12806w() {
        return this.f12411t;
    }

    /* renamed from: x */
    public final boolean m12807x() {
        return this.f12412u;
    }

    /* renamed from: y */
    public final C3683t1 m12808y() {
        return this.f12413v;
    }

    /* renamed from: z */
    public final C2983bs m12809z() {
        return this.f12414w;
    }

    /* renamed from: a */
    public static /* synthetic */ C3779vr m12802a(C3779vr c3779vr, C3061e1 c3061e1, boolean z, C3683t1 c3683t1, C2983bs c2983bs, int i, Object obj) {
        if ((i & 1) != 0) {
            c3061e1 = c3779vr.f12411t;
        }
        if ((i & 2) != 0) {
            z = c3779vr.f12412u;
        }
        if ((i & 4) != 0) {
            c3683t1 = c3779vr.f12413v;
        }
        if ((i & 8) != 0) {
            c2983bs = c3779vr.f12414w;
        }
        return c3779vr.m12805a(c3061e1, z, c3683t1, c2983bs);
    }

    @Override // com.ironsource.AbstractC3718u1
    /* renamed from: b */
    public JSONObject mo9365b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
