package com.applovin.impl.mediation.ads;

import OooO0oO.OooOo;
import OooOo0o.o000oOoO;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1031g0;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1258u3;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.C1302z2;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.InterfaceC1185s1;
import com.applovin.impl.mediation.C1120b;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1205a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends AbstractC1118a implements C1205a.a, C1060j.b {

    /* renamed from: a */
    private final InterfaceC1110a f1299a;

    /* renamed from: b */
    private final WeakReference f1300b;

    /* renamed from: c */
    private final C1111b f1301c;

    /* renamed from: d */
    private final C1120b f1302d;

    /* renamed from: e */
    private final Object f1303e;

    /* renamed from: f */
    private C1302z2 f1304f;

    /* renamed from: g */
    private EnumC1112c f1305g;

    /* renamed from: h */
    private final AtomicBoolean f1306h;

    /* renamed from: i */
    private final AtomicBoolean f1307i;

    /* renamed from: j */
    private C1031g0 f1308j;

    /* renamed from: k */
    private long f1309k;

    /* renamed from: l */
    private boolean f1310l;

    /* renamed from: m */
    private boolean f1311m;

    /* renamed from: n */
    private String f1312n;

    /* renamed from: o */
    private String f1313o;

    /* renamed from: p */
    private String f1314p;

    /* renamed from: q */
    private WeakReference f1315q;

    /* renamed from: r */
    private WeakReference f1316r;

    /* renamed from: s */
    private WeakReference f1317s;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface InterfaceC1110a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum EnumC1112c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, InterfaceC1110a interfaceC1110a, String str2, C1220k c1220k, Context context) {
        super(str, maxAdFormat, str2, c1220k);
        this.f1303e = new Object();
        this.f1304f = null;
        this.f1305g = EnumC1112c.IDLE;
        this.f1306h = new AtomicBoolean();
        this.f1307i = new AtomicBoolean();
        this.f1315q = new WeakReference(null);
        this.f1316r = new WeakReference(null);
        this.f1317s = new WeakReference(null);
        this.f1299a = interfaceC1110a;
        this.f1301c = createAdListenerWrapper();
        this.f1302d = new C1120b(c1220k);
        this.f1300b = new WeakReference(context);
        c1220k.m2903j().m1028a(this);
        C1240o.m3206g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public C1111b createAdListenerWrapper() {
        return new C1111b();
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1118a
    public void destroy() {
        m1612a(EnumC1112c.DESTROYED, new o000oOoO(this, 8));
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f1303e) {
            try {
                C1302z2 c1302z2 = this.f1304f;
                z = c1302z2 != null && c1302z2.m3524V() && this.f1305g == EnumC1112c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.sdk.m2839I().m3048c(this.adUnitId);
        }
        return z;
    }

    public void loadAd() {
        loadAd(EnumC1050i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.C1205a.a
    public void onAdExpired(InterfaceC1185s1 interfaceC1185s1) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f1306h.set(true);
        InterfaceC1110a interfaceC1110a = this.f1299a;
        Activity activity = interfaceC1110a != null ? interfaceC1110a.getActivity() : null;
        if (activity == null && (activity = this.sdk.m2893e().m439b()) == null) {
            m1635e();
            this.f1301c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.m2860X().loadAd(this.adUnitId, null, this.adFormat, EnumC1050i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f1301c);
        }
    }

    @Override // com.applovin.impl.C1060j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C1302z2 c1302z2 = this.f1304f;
        if (c1302z2 == null || !c1302z2.m3518P().equalsIgnoreCase(str)) {
            return;
        }
        this.f1304f.m3536h(str2);
        AbstractC1168q2.m2209b(this.adReviewListener, str2, this.f1304f);
    }

    public void showAd(String str, String str2, Activity activity) {
        C1302z2 c1302z2;
        List listM492b = this.sdk.m2922t0().m492b();
        if (!this.sdk.m2922t0().m494d() || listM492b == null || (c1302z2 = this.f1304f) == null || listM492b.contains(c1302z2.m899c())) {
            if (activity == null) {
                activity = this.sdk.m2926v0();
            }
            Activity activity2 = activity;
            if (m1624a(activity2, str)) {
                m1612a(EnumC1112c.SHOWING, new OooOo0O.OooO0O0(this, str, str2, activity2, 6));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f1304f.m899c() + "> which is not in the list of selected ad networks " + listM492b;
        C1240o.m3207h(this.tag, str3);
        m1612a(EnumC1112c.IDLE, new OooO0OO(this, str3, 2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f1299a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public /* synthetic */ void m1628b(String str) {
        C1302z2 c1302z2 = this.f1304f;
        m1618a((MaxAd) c1302z2);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(c1302z2);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
        }
        AbstractC1168q2.m2165a(this.adListener, (MaxAd) c1302z2, (MaxError) maxErrorImpl, true);
        this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1302z2);
    }

    /* renamed from: c */
    public /* synthetic */ void m1630c() {
        synchronized (this.f1303e) {
            try {
                if (this.f1304f != null) {
                    if (C1240o.m3200a()) {
                        this.logger.m3211a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f1304f + "...");
                    }
                    this.sdk.m2860X().destroyAd(this.f1304f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.m2903j().m1029b(this);
        this.f1302d.m1681a();
        C1031g0 c1031g0 = this.f1308j;
        if (c1031g0 != null) {
            c1031g0.m771a();
            this.f1308j = null;
        }
        super.destroy();
    }

    /* renamed from: d */
    public void m1633d() {
        if (((Boolean) this.sdk.m2866a(C1268v4.f2533A2)).booleanValue()) {
            this.sdk.m2916q0().m3800b(C1286x4.f3045Q);
        }
        if (this.f1308j != null) {
            this.sdk.m2916q0().m3800b(C1286x4.f3046R);
            this.f1308j.m771a();
            this.f1308j = null;
        }
    }

    /* renamed from: e */
    public void m1635e() {
        C1302z2 c1302z2;
        if (this.f1306h.compareAndSet(true, false)) {
            synchronized (this.f1303e) {
                c1302z2 = this.f1304f;
                this.f1304f = null;
            }
            this.sdk.m2860X().destroyAd(c1302z2);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* renamed from: f */
    public void m1638f() {
        Long l = (Long) this.sdk.m2866a(C1268v4.f2541B2);
        if (l.longValue() <= 0) {
            return;
        }
        this.f1308j = C1031g0.m769a(l.longValue(), true, this.sdk, new OooO(1, this, l));
    }

    /* renamed from: g */
    public void m1639g() {
        Activity activityM2926v0 = (Activity) this.f1315q.get();
        if (activityM2926v0 == null) {
            activityM2926v0 = this.sdk.m2926v0();
        }
        Activity activity = activityM2926v0;
        if (this.f1310l) {
            showAd(this.f1312n, this.f1313o, (ViewGroup) this.f1316r.get(), (Lifecycle) this.f1317s.get(), activity);
        } else {
            showAd(this.f1312n, this.f1313o, activity);
        }
    }

    public void loadAd(EnumC1050i enumC1050i) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f1305g == EnumC1112c.DESTROYED) {
            boolean zM1228c = AbstractC1078k7.m1228c(this.sdk);
            this.sdk.m2832E().m572a(C0993c2.f474E0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zM1228c));
            if (zM1228c) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            InterfaceC1110a interfaceC1110a = this.f1299a;
            m1612a(EnumC1112c.LOADING, new OooOo0O.OooO0O0(this, interfaceC1110a != null ? interfaceC1110a.getActivity() : null, (Context) this.f1300b.get(), enumC1050i, 5));
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb.append(this.f1304f);
            sb.append("), listener=");
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str);
        }
        AbstractC1168q2.m2249f(this.adListener, (MaxAd) this.f1304f, true);
    }

    /* renamed from: a */
    public /* synthetic */ void m1611a(Activity activity, Context context, EnumC1050i enumC1050i) {
        Context context2;
        Context contextM2824o = activity;
        if (activity != null) {
            context2 = contextM2824o;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.m2926v0() != null) {
                contextM2824o = this.sdk.m2926v0();
            } else {
                contextM2824o = C1220k.m2824o();
            }
            context2 = contextM2824o;
        }
        this.sdk.m2860X().loadAd(this.adUnitId, null, this.adFormat, enumC1050i, this.localExtraParameters, this.extraParameters, context2, this.f1301c);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        C1302z2 c1302z2;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.m2866a(AbstractC1144o3.f1630a8)).booleanValue()) {
                C1240o.m3207h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                AbstractC1168q2.m2165a(this.adListener, (MaxAd) this.f1304f, (MaxError) maxErrorImpl, true);
                this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f1304f);
                return;
            }
            List listM492b = this.sdk.m2922t0().m492b();
            if (this.sdk.m2922t0().m494d() && listM492b != null && (c1302z2 = this.f1304f) != null && !listM492b.contains(c1302z2.m899c())) {
                String str3 = "Attempting to show ad from <" + this.f1304f.m899c() + "> which is not in the list of selected ad networks " + listM492b;
                C1240o.m3207h(this.tag, str3);
                m1612a(EnumC1112c.IDLE, new OooO0OO(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.m2926v0();
            }
            Activity activity2 = activity;
            if (m1624a(activity2, str)) {
                m1612a(EnumC1112c.SHOWING, new com.applovin.impl.mediation.OooO0O0(this, str, str2, activity2, viewGroup, lifecycle));
                return;
            }
            return;
        }
        C1240o.m3207h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str4 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(this.f1304f);
            sb.append(", error=");
            sb.append(maxErrorImpl2);
            sb.append("), listener=");
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str4);
        }
        AbstractC1168q2.m2165a(this.adListener, (MaxAd) this.f1304f, (MaxError) maxErrorImpl2, true);
        this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f1304f);
    }

    /* renamed from: a */
    public /* synthetic */ void m1622a(String str, String str2, Activity activity) {
        m1621a(str, str2);
        this.f1310l = false;
        this.f1315q = new WeakReference(activity);
        this.sdk.m2860X().showFullscreenAd(this.f1304f, activity, this.f1301c);
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    public class C1111b implements MaxAdListener, MaxAdRevenueListener, AbstractC1118a.a {
        public C1111b() {
        }

        /* renamed from: a */
        public /* synthetic */ void m1648a(C1302z2 c1302z2, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f1311m) {
                C1240o c1240o = MaxFullscreenAdImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m3211a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c1302z2.m3852j(MaxFullscreenAdImpl.this.f1314p);
                MaxFullscreenAdImpl.this.sdk.m2848P().m3597a(C0993c2.f526l0, c1302z2, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f1314p));
                MaxFullscreenAdImpl.this.m1639g();
                return;
            }
            C1240o c1240o2 = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                C1240o c1240o3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o3, str);
            }
            AbstractC1168q2.m2249f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                C1240o c1240o2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o2, str);
            }
            AbstractC1168q2.m2168a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final C1302z2 c1302z2 = (C1302z2) maxAd;
            MaxFullscreenAdImpl.this.m1633d();
            final boolean z = MaxFullscreenAdImpl.this.f1311m;
            if (z) {
                C1240o c1240o = MaxFullscreenAdImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m3214b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.m2848P().m3597a(C0993c2.f530n0, c1302z2, CollectionUtils.hashMap("details", c1302z2.m3858o0()));
                MaxFullscreenAdImpl.this.f1311m = false;
            }
            MaxFullscreenAdImpl.this.m1612a(EnumC1112c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15687OooOo0O.m1650a(maxAd, z, c1302z2, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            C1302z2 c1302z2 = (C1302z2) maxAd;
            if (MaxFullscreenAdImpl.this.f1311m) {
                C1240o c1240o = MaxFullscreenAdImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m3211a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.m2848P().m3597a(C0993c2.f528m0, c1302z2, CollectionUtils.hashMap("details", c1302z2.m3858o0()));
                MaxFullscreenAdImpl.this.f1311m = false;
            }
            MaxFullscreenAdImpl.this.sdk.m2895f().m2478a(c1302z2);
            MaxFullscreenAdImpl.this.m1627b(c1302z2);
            MaxFullscreenAdImpl.this.m1638f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.m2866a(AbstractC1144o3.f1638f8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.m2918r0().m409b(new C1156p6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new OooO(3, this, c1302z2)), C0987b6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            C1240o c1240o2 = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                C1240o c1240o3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o3, str);
            }
            AbstractC1168q2.m2228c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f1311m = false;
            MaxFullscreenAdImpl.this.m1633d();
            MaxFullscreenAdImpl.this.m1612a(EnumC1112c.IDLE, new OooO(2, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.m1635e();
            MaxFullscreenAdImpl.this.m1612a(EnumC1112c.IDLE, new androidx.webkit.OooO00o(this, str, maxError, 12));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            C1302z2 c1302z2;
            synchronized (MaxFullscreenAdImpl.this.f1303e) {
                c1302z2 = MaxFullscreenAdImpl.this.f1304f;
            }
            MaxFullscreenAdImpl.this.sdk.m2839I().m3043a(MaxFullscreenAdImpl.this.adUnitId);
            C1302z2 c1302z22 = (C1302z2) maxAd;
            MaxFullscreenAdImpl.this.m1617a(c1302z22);
            if (!MaxFullscreenAdImpl.this.f1306h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.m1612a(EnumC1112c.READY, new androidx.webkit.OooO00o(this, c1302z22, maxAd, 11));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f1307i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.m1639g();
            }
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m3211a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c1302z2 + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            AbstractC1168q2.m2162a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c1302z2, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                C1240o c1240o2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbOooOoO0 = OooOo.OooOoO0("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbOooOoO0.append(MaxFullscreenAdImpl.this.requestListener);
                c1240o2.m3211a(str2, sbOooOoO0.toString());
            }
            AbstractC1168q2.m2172a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m3211a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            AbstractC1168q2.m2174a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* renamed from: a */
        public /* synthetic */ void m1651a(String str, MaxError maxError) {
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                C1240o c1240o2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o2, str2);
            }
            AbstractC1168q2.m2170a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* renamed from: a */
        public /* synthetic */ void m1647a(C1302z2 c1302z2) {
            if (c1302z2.m3541w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.m2848P().m3595a(C0993c2.f514f0, c1302z2);
        }

        /* renamed from: a */
        public /* synthetic */ void m1649a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m1618a(maxAd);
            C1240o c1240o = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                C1240o c1240o2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o2, str);
            }
            AbstractC1168q2.m2244e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* renamed from: a */
        public /* synthetic */ void m1650a(MaxAd maxAd, boolean z, C1302z2 c1302z2, MaxError maxError) {
            MaxFullscreenAdImpl.this.m1618a(maxAd);
            if (!z && c1302z2.m3863t0()) {
                if (MaxFullscreenAdImpl.this.m1629b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new o000oOoO(this, 9));
                    return;
                }
                C1240o c1240o = MaxFullscreenAdImpl.this.logger;
                if (C1240o.m3200a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m3214b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.m2848P().m3595a(C0993c2.f524k0, c1302z2);
            }
            C1240o c1240o2 = MaxFullscreenAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                C1240o c1240o3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(maxAd);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxFullscreenAdImpl.this.adListener, c1240o3, str);
            }
            AbstractC1168q2.m2165a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* renamed from: a */
        public /* synthetic */ void m1646a() {
            MaxFullscreenAdImpl.this.f1311m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* renamed from: b */
    public void m1627b(AbstractC1266v2 abstractC1266v2) {
        if (((Boolean) this.sdk.m2866a(C1268v4.f2533A2)).booleanValue()) {
            List listM897b = abstractC1266v2.m897b("mappk_urls");
            if (CollectionUtils.isEmpty(listM897b)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listM897b));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(AbstractC1013e2.m678a(abstractC1266v2)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(AbstractC1249t3.m3320a(abstractC1266v2, this.sdk)));
            this.sdk.m2916q0().m3801b(C1286x4.f3045Q, jSONObject.toString());
        }
    }

    /* renamed from: c */
    public /* synthetic */ void m1632c(String str) {
        C1302z2 c1302z2 = this.f1304f;
        m1618a((MaxAd) c1302z2);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1240o.m3200a()) {
            C1240o c1240o = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(c1302z2);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
        }
        AbstractC1168q2.m2165a(this.adListener, (MaxAd) c1302z2, (MaxError) maxErrorImpl, true);
        this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1302z2);
    }

    /* renamed from: a */
    public /* synthetic */ void m1623a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        m1621a(str, str2);
        this.f1310l = true;
        this.f1315q = new WeakReference(activity);
        this.f1316r = new WeakReference(viewGroup);
        this.f1317s = new WeakReference(lifecycle);
        this.sdk.m2860X().showFullscreenAd(this.f1304f, viewGroup, lifecycle, activity, this.f1301c);
    }

    /* renamed from: a */
    private boolean m1624a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f1305g == EnumC1112c.DESTROYED) {
            boolean zM1228c = AbstractC1078k7.m1228c(this.sdk);
            this.sdk.m2832E().m572a(C0993c2.f474E0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zM1228c));
            if (zM1228c) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strOooOOOo = OooOo.OooOOOo(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            C1240o.m3207h(this.tag, strOooOOOo);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strOooOOOo);
            C1258u3 c1258u3 = new C1258u3(this.adUnitId, this.adFormat, str);
            if (C1240o.m3200a()) {
                C1240o c1240o = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(c1258u3);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
            }
            AbstractC1168q2.m2165a(this.adListener, (MaxAd) c1258u3, (MaxError) maxErrorImpl, true);
            if (this.f1304f != null) {
                this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f1304f);
            }
            return false;
        }
        Long l = (Long) this.sdk.m2866a(AbstractC1144o3.f1616M7);
        Long l2 = (Long) this.sdk.m2866a(AbstractC1144o3.f1609F7);
        if (l.longValue() > 0 && (this.f1304f.getTimeToLiveMillis() < l2.longValue() || this.f1306h.get())) {
            this.f1307i.set(true);
            this.sdk.m2918r0().m404a(new C1156p6(this.sdk, "handleShowOnLoadTimeoutError", new OooO0OO(this, str, 1)), C0987b6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (AbstractC1078k7.m1157a(C1220k.m2824o()) != 0 && this.sdk.m2912o0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!AbstractC1078k7.m1228c(this.sdk)) {
                if (((Boolean) this.sdk.m2866a(AbstractC1144o3.f1629Z7)).booleanValue()) {
                    C1240o.m3207h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (C1240o.m3200a()) {
                        C1240o c1240o2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(this.f1304f);
                        sb2.append(", error=");
                        sb2.append(maxErrorImpl2);
                        sb2.append("), listener=");
                        androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb2, this.adListener, c1240o2, str3);
                    }
                    AbstractC1168q2.m2165a(this.adListener, (MaxAd) this.f1304f, (MaxError) maxErrorImpl2, true);
                    this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f1304f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.m2839I().m3050d() && !this.sdk.m2839I().m3049c()) {
            return true;
        }
        C1240o.m3207h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (C1240o.m3200a()) {
            C1240o c1240o3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb3.append(this.f1304f);
            sb3.append(", error=");
            sb3.append(maxErrorImpl3);
            sb3.append("), listener=");
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb3, this.adListener, c1240o3, str4);
        }
        AbstractC1168q2.m2165a(this.adListener, (MaxAd) this.f1304f, (MaxError) maxErrorImpl3, true);
        this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f1304f);
        return false;
    }

    /* renamed from: b */
    public boolean m1629b() {
        if (this.sdk.m2851R() != null) {
            return this.sdk.m2851R().m1755e(this.adUnitId);
        }
        return this.sdk.m2849Q().m1704d(this.adUnitId);
    }

    /* renamed from: a */
    public /* synthetic */ void m1620a(String str) {
        if (this.f1307i.compareAndSet(true, false)) {
            C1240o.m3207h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.m2839I().m3048c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            C1258u3 c1258u3 = new C1258u3(this.adUnitId, this.adFormat, str);
            if (C1240o.m3200a()) {
                C1240o c1240o = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(c1258u3);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, this.adListener, c1240o, str2);
            }
            AbstractC1168q2.m2165a(this.adListener, (MaxAd) c1258u3, (MaxError) maxErrorImpl, true);
            if (this.f1304f != null) {
                this.sdk.m2860X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f1304f);
            }
        }
    }

    /* renamed from: a */
    private void m1621a(String str, String str2) {
        this.f1302d.m1683e(this.f1304f);
        this.f1304f.m911g(str);
        this.f1304f.m909f(str2);
        this.f1312n = str;
        this.f1313o = str2;
        this.f1314p = this.f1304f.getNetworkName();
        this.sdk.m2933z().m551d(this.f1304f);
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f1304f + "...");
        }
        m1674a((AbstractC1266v2) this.f1304f);
    }

    /* renamed from: a */
    private void m1610a() {
        C1302z2 c1302z2;
        synchronized (this.f1303e) {
            c1302z2 = this.f1304f;
            this.f1304f = null;
        }
        this.sdk.m2860X().destroyAd(c1302z2);
    }

    /* renamed from: a */
    public /* synthetic */ void m1619a(Long l) {
        this.f1309k = l.longValue() + this.f1309k;
        this.sdk.m2916q0().m3801b(C1286x4.f3046R, Long.valueOf(this.f1309k));
    }

    /* renamed from: a */
    public void m1617a(C1302z2 c1302z2) {
        if (this.sdk.m2895f().m2480a(c1302z2, this)) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(this.tag, "Handle ad loaded for regular ad: " + c1302z2);
            }
            this.f1304f = c1302z2;
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c1302z2);
    }

    /* renamed from: a */
    public void m1612a(EnumC1112c enumC1112c, Runnable runnable) {
        boolean z;
        EnumC1112c enumC1112c2 = this.f1305g;
        synchronized (this.f1303e) {
            try {
                EnumC1112c enumC1112c3 = EnumC1112c.IDLE;
                if (enumC1112c2 == enumC1112c3) {
                    if (enumC1112c == EnumC1112c.LOADING || enumC1112c == EnumC1112c.DESTROYED) {
                        z = true;
                    } else {
                        if (enumC1112c == EnumC1112c.SHOWING) {
                            C1240o.m3207h(this.tag, "No ad is loading or loaded");
                        } else if (C1240o.m3200a()) {
                            this.logger.m3214b(this.tag, "Unable to transition to: " + enumC1112c);
                        }
                        z = false;
                    }
                } else {
                    EnumC1112c enumC1112c4 = EnumC1112c.LOADING;
                    if (enumC1112c2 == enumC1112c4) {
                        if (enumC1112c != enumC1112c3) {
                            if (enumC1112c == enumC1112c4) {
                                C1240o.m3207h(this.tag, "An ad is already loading");
                            } else if (enumC1112c != EnumC1112c.READY) {
                                if (enumC1112c == EnumC1112c.SHOWING) {
                                    C1240o.m3207h(this.tag, "An ad is not ready to be shown yet");
                                } else if (enumC1112c != EnumC1112c.DESTROYED) {
                                    if (C1240o.m3200a()) {
                                        this.logger.m3214b(this.tag, "Unable to transition to: " + enumC1112c);
                                    }
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        EnumC1112c enumC1112c5 = EnumC1112c.READY;
                        if (enumC1112c2 == enumC1112c5) {
                            if (enumC1112c != enumC1112c3) {
                                if (enumC1112c == enumC1112c4) {
                                    C1240o.m3207h(this.tag, "An ad is already loaded");
                                } else if (enumC1112c == enumC1112c5) {
                                    if (C1240o.m3200a()) {
                                        this.logger.m3214b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (enumC1112c != EnumC1112c.SHOWING && enumC1112c != EnumC1112c.DESTROYED) {
                                    if (C1240o.m3200a()) {
                                        this.logger.m3214b(this.tag, "Unable to transition to: " + enumC1112c);
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            EnumC1112c enumC1112c6 = EnumC1112c.SHOWING;
                            if (enumC1112c2 == enumC1112c6) {
                                if (enumC1112c != enumC1112c3) {
                                    if (enumC1112c == enumC1112c4) {
                                        C1240o.m3207h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (enumC1112c == enumC1112c5) {
                                        if (C1240o.m3200a()) {
                                            this.logger.m3214b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (enumC1112c == enumC1112c6) {
                                        C1240o.m3207h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (enumC1112c != EnumC1112c.DESTROYED) {
                                        if (C1240o.m3200a()) {
                                            this.logger.m3214b(this.tag, "Unable to transition to: " + enumC1112c);
                                        }
                                    }
                                }
                                z = true;
                            } else if (enumC1112c2 == EnumC1112c.DESTROYED) {
                                C1240o.m3207h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (C1240o.m3200a()) {
                                this.logger.m3214b(this.tag, "Unknown state: " + this.f1305g);
                            }
                            z = false;
                        }
                    }
                }
                if (z) {
                    if (C1240o.m3200a()) {
                        this.logger.m3211a(this.tag, "Transitioning from " + this.f1305g + " to " + enumC1112c + "...");
                    }
                    this.f1305g = enumC1112c;
                } else if (C1240o.m3200a()) {
                    this.logger.m3218k(this.tag, "Not allowed to transition from " + this.f1305g + " to " + enumC1112c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m1618a(MaxAd maxAd) {
        this.sdk.m2895f().m2478a((C1302z2) maxAd);
        this.f1302d.m1681a();
        m1610a();
        this.sdk.m2881a0().m3220a((AbstractC1266v2) maxAd);
    }
}
