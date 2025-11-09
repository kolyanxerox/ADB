package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.C0987b6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.d6 */
/* loaded from: classes.dex */
public class C1007d6 extends AbstractRunnableC1036g5 {

    /* renamed from: o */
    private static final AtomicBoolean f660o = new AtomicBoolean();

    /* renamed from: g */
    private final C1284x2 f661g;

    /* renamed from: h */
    private final JSONObject f662h;

    /* renamed from: i */
    private final List f663i;

    /* renamed from: j */
    private final AbstractC1118a.a f664j;

    /* renamed from: k */
    private final WeakReference f665k;

    /* renamed from: l */
    private final String f666l;

    /* renamed from: m */
    private long f667m;

    /* renamed from: n */
    private final List f668n;

    /* renamed from: com.applovin.impl.d6$b */
    public class b extends AbstractRunnableC1036g5 {

        /* renamed from: g */
        private final long f669g;

        /* renamed from: h */
        private final int f670h;

        /* renamed from: i */
        private final AbstractC1266v2 f671i;

        /* renamed from: j */
        private final List f672j;

        /* renamed from: com.applovin.impl.d6$b$a */
        public class a extends AbstractC1024f3 {

            /* renamed from: b */
            final /* synthetic */ MaxAdFormat f674b;

            /* renamed from: c */
            final /* synthetic */ String f675c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC1118a.a aVar, MaxAdFormat maxAdFormat, String str) {
                super(aVar);
                this.f674b = maxAdFormat;
                this.f675c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f669g;
                C1240o unused = b.this.f778c;
                if (C1240o.m3200a()) {
                    C1240o c1240o = b.this.f778c;
                    String str2 = b.this.f777b;
                    StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jElapsedRealtime, "Ad failed to load in ", " ms for ");
                    sbOooOOo.append(this.f674b.getLabel());
                    sbOooOOo.append(" ad unit ");
                    sbOooOOo.append(str);
                    sbOooOOo.append(" with error: ");
                    sbOooOOo.append(maxError);
                    c1240o.m3211a(str2, sbOooOOo.toString());
                }
                b.this.m618b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.m616a(bVar.f671i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f670h >= b.this.f672j.size() - 1) {
                    C1007d6.this.m607b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f776a.m2918r0().m403a((AbstractRunnableC1036g5) new b(bVar2.f670h + 1, b.this.f672j), C0987b6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.m618b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f669g;
                C1240o unused = b.this.f778c;
                if (C1240o.m3200a()) {
                    C1240o c1240o = b.this.f778c;
                    String str = b.this.f777b;
                    StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jElapsedRealtime, "Ad loaded in ", "ms for ");
                    sbOooOOo.append(this.f674b.getLabel());
                    sbOooOOo.append(" ad unit ");
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo(sbOooOOo, this.f675c, c1240o, str);
                }
                AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) maxAd;
                b.this.m616a(abstractC1266v2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i = b.this.f670h;
                while (true) {
                    i++;
                    if (i >= b.this.f672j.size()) {
                        C1007d6.this.m606b(abstractC1266v2);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.m616a((AbstractC1266v2) bVar.f672j.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        public /* synthetic */ b(C1007d6 c1007d6, int i, List list, a aVar) {
            this(i, list);
        }

        /* renamed from: b */
        public void m618b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM3642b = C1007d6.this.f661g.m3642b();
            MaxAdFormat maxAdFormatM3640a = C1007d6.this.f661g.m3640a();
            if (C1240o.m3200a()) {
                C1240o c1240o = this.f778c;
                String str = this.f777b;
                StringBuilder sb = new StringBuilder("Loading ad ");
                sb.append(this.f670h + 1);
                sb.append(" of ");
                sb.append(this.f672j.size());
                sb.append(" from ");
                sb.append(this.f671i.m899c());
                sb.append(" for ");
                sb.append(maxAdFormatM3640a.getLabel());
                sb.append(" ad unit ");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo(sb, strM3642b, c1240o, str);
            }
            m618b("started to load ad");
            Context context = (Context) C1007d6.this.f665k.get();
            Activity activityM2926v0 = context instanceof Activity ? (Activity) context : this.f776a.m2926v0();
            this.f776a.m2881a0().m3222b(this.f671i);
            this.f776a.m2860X().loadThirdPartyMediatedAd(strM3642b, this.f671i, activityM2926v0, new a(C1007d6.this.f664j, maxAdFormatM3640a, strM3642b));
        }

        private b(int i, List list) {
            super(C1007d6.this.f777b, C1007d6.this.f776a, C1007d6.this.f661g.m3642b());
            this.f669g = SystemClock.elapsedRealtime();
            this.f670h = i;
            this.f671i = (AbstractC1266v2) list.get(i);
            this.f672j = list;
        }

        /* renamed from: a */
        public void m616a(AbstractC1266v2 abstractC1266v2, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            C1007d6.this.f668n.add(new MaxNetworkResponseInfoImpl(adLoadState, AbstractC1249t3.m3314a(abstractC1266v2.m895b()), abstractC1266v2.m3509F(), abstractC1266v2.m3523U(), j, abstractC1266v2.m3506C(), maxError));
        }
    }

    public C1007d6(C1284x2 c1284x2, JSONObject jSONObject, Context context, C1220k c1220k, AbstractC1118a.a aVar) {
        super("TaskProcessMediationWaterfall", c1220k, c1284x2.m3642b());
        this.f661g = c1284x2;
        this.f662h = jSONObject;
        this.f664j = aVar;
        this.f665k = new WeakReference(context);
        this.f666l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("ads", jSONObject);
        this.f663i = new ArrayList(jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            this.f663i.add(AbstractC1266v2.m3497a(c1284x2, JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null), jSONObject, c1220k));
        }
        this.f668n = new ArrayList(this.f663i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f667m = SystemClock.elapsedRealtime();
        if (this.f662h.optBoolean("is_testing", false) && !this.f776a.m2922t0().m493c() && f660o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new o0OO00O(this, 6));
        }
        String strM3642b = this.f661g.m3642b();
        MaxAdFormat maxAdFormatM3640a = this.f661g.m3640a();
        if (this.f663i.size() > 0) {
            if (C1240o.m3200a()) {
                this.f778c.m3211a(this.f777b, "Starting waterfall for " + maxAdFormatM3640a.getLabel() + " ad unit " + strM3642b + " with " + this.f663i.size() + " ad(s)...");
            }
            this.f776a.m2918r0().m402a(new b(0, this.f663i));
            return;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3218k(this.f777b, "No ads were returned from the server for " + maxAdFormatM3640a.getLabel() + " ad unit " + strM3642b);
        }
        AbstractC1078k7.m1194a(strM3642b, maxAdFormatM3640a, this.f662h, this.f776a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f662h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (AbstractC1249t3.m3323a(this.f662h, strM3642b, this.f776a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, OooO0oO.OooOo.OooOO0O("Ad Unit ID ", strM3642b, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (AbstractC1078k7.m1228c(this.f776a) && ((Boolean) this.f776a.m2866a(C1268v4.f2858o6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            m607b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        OooO oooO = new OooO(5, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            C1031g0.m768a(millis, this.f776a, oooO);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(oooO, millis);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m611e() {
        AbstractC1078k7.m1195a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f776a.m2926v0());
    }

    /* renamed from: b */
    public void m606b(AbstractC1266v2 abstractC1266v2) {
        this.f776a.m2881a0().m3224c(abstractC1266v2);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f667m;
        if (C1240o.m3200a()) {
            C1240o c1240o = this.f778c;
            String str = this.f777b;
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jElapsedRealtime, "Waterfall loaded in ", "ms from ");
            sbOooOOo.append(abstractC1266v2.m899c());
            sbOooOOo.append(" for ");
            sbOooOOo.append(this.f661g.m3640a().getLabel());
            sbOooOOo.append(" ad unit ");
            sbOooOOo.append(this.f661g.m3642b());
            c1240o.m3215d(str, sbOooOOo.toString());
        }
        abstractC1266v2.m3531a(new MaxAdWaterfallInfoImpl(abstractC1266v2, jElapsedRealtime, this.f668n, this.f666l));
        AbstractC1168q2.m2248f(this.f664j, abstractC1266v2);
    }

    /* renamed from: a */
    public void m607b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f668n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f668n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String strM3642b = this.f661g.m3642b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f667m;
        if (C1240o.m3200a()) {
            C1240o c1240o = this.f778c;
            String str = this.f777b;
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(jElapsedRealtime, "Waterfall failed in ", "ms for ");
            sbOooOOo.append(this.f661g.m3640a().getLabel());
            sbOooOOo.append(" ad unit ");
            sbOooOOo.append(strM3642b);
            sbOooOOo.append(" with error: ");
            sbOooOOo.append(maxError);
            c1240o.m3215d(str, sbOooOOo.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f662h, "waterfall_name", ""), JsonUtils.getString(this.f662h, "waterfall_test_name", ""), jElapsedRealtime, this.f668n, this.f661g, JsonUtils.optList(JsonUtils.getJSONArray(this.f662h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f666l, JsonUtils.getString(this.f662h, "event_id", "")));
        AbstractC1168q2.m2169a(this.f664j, strM3642b, maxError);
    }
}
