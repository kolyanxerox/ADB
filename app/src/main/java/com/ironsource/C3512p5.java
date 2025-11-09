package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C3512p5;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.p5 */
/* loaded from: classes2.dex */
public final class C3512p5 extends AbstractC3203hx {

    /* renamed from: e */
    private final C3719u2 f10738e;

    /* renamed from: f */
    private final AbstractC3718u1 f10739f;

    /* renamed from: g */
    private final C3547q5 f10740g;

    /* renamed from: h */
    private final InterfaceC3913zp f10741h;

    /* renamed from: i */
    private InterfaceC3582r5 f10742i;

    /* renamed from: com.ironsource.p5$a */
    public static final class a implements InterfaceC3582r5 {

        /* renamed from: b */
        final /* synthetic */ InterfaceC2990c0 f10744b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC3237ix f10745c;

        public a(InterfaceC2990c0 interfaceC2990c0, InterfaceC3237ix interfaceC3237ix) {
            this.f10744b = interfaceC2990c0;
            this.f10745c = interfaceC3237ix;
        }

        @Override // com.ironsource.InterfaceC3582r5
        /* renamed from: a */
        public void mo11288a(int i, String errorReason) {
            kotlin.jvm.internal.OooOo.OooO0o0(errorReason, "errorReason");
            this.f10745c.mo8844a(i, errorReason);
        }

        @Override // com.ironsource.InterfaceC3582r5
        /* renamed from: a */
        public void mo11289a(final int i, final String errorMessage, final int i2, final String auctionFallback, final long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "auctionFallback");
            C3719u2 c3719u2 = C3512p5.this.f10738e;
            final C3512p5 c3512p5 = C3512p5.this;
            final InterfaceC2990c0 interfaceC2990c0 = this.f10744b;
            final InterfaceC3237ix interfaceC3237ix = this.f10745c;
            c3719u2.m13090a(new Runnable() { // from class: com.ironsource.oo0o0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    String str = auctionFallback;
                    C3512p5.a.m11286a(c3512p5, interfaceC2990c0, interfaceC3237ix, i, errorMessage, i2, str, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static final void m11286a(C3512p5 this$0, InterfaceC2990c0 adInstanceFactory, InterfaceC3237ix waterfallFetcherListener, int i, String errorMessage, int i2, String auctionFallback, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.OooOo.OooO0o0(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "$errorMessage");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "$auctionFallback");
            this$0.f10742i = null;
            this$0.m11277a(adInstanceFactory, waterfallFetcherListener, i, errorMessage, i2, auctionFallback, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static final void m11287a(C3512p5 this$0, InterfaceC2990c0 adInstanceFactory, InterfaceC3237ix waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.OooOo.OooO0o0(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.OooOo.OooO0o0(newWaterfall, "$newWaterfall");
            kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayloads, "$adInstancePayloads");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "$auctionId");
            this$0.f10742i = null;
            this$0.m11279a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c3353m5, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.InterfaceC3582r5
        /* renamed from: a */
        public void mo11290a(final List<C3353m5> newWaterfall, final Map<String, C3135g0> adInstancePayloads, final String auctionId, final C3353m5 c3353m5, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str) {
            kotlin.jvm.internal.OooOo.OooO0o0(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayloads, "adInstancePayloads");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
            C3719u2 c3719u2 = C3512p5.this.f10738e;
            final C3512p5 c3512p5 = C3512p5.this;
            final InterfaceC2990c0 interfaceC2990c0 = this.f10744b;
            final InterfaceC3237ix interfaceC3237ix = this.f10745c;
            c3719u2.m13090a(new Runnable() { // from class: com.ironsource.o0OO00O
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3512p5.a.m11287a(c3512p5, interfaceC2990c0, interfaceC3237ix, newWaterfall, adInstancePayloads, auctionId, c3353m5, jSONObject, jSONObject2, i, j, i2, str);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3512p5(C3719u2 adTools, AbstractC3718u1 adUnitData) {
        super(adTools, adUnitData);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f10738e = adTools;
        this.f10739f = adUnitData;
        C3547q5 c3547q5 = new C3547q5(adTools, adUnitData);
        this.f10740g = c3547q5;
        this.f10741h = c3547q5.m11505b();
    }

    @Override // com.ironsource.AbstractC3203hx
    /* renamed from: a */
    public InterfaceC3913zp mo9245a() {
        return this.f10741h;
    }

    @Override // com.ironsource.AbstractC3203hx
    /* renamed from: a */
    public void mo9222a(InterfaceC2990c0 adInstanceFactory, InterfaceC3237ix waterfallFetcherListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f10740g.m11504a(aVar);
        this.f10742i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m11277a(InterfaceC2990c0 interfaceC2990c0, InterfaceC3237ix interfaceC3237ix, int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10738e, "Auction failed (error " + i + " - " + str + ')', (String) null, 2, (Object) null));
        boolean zM11101n = this.f10739f.m12510e().m11101n();
        String strM13011a = C3824x4.f12566a.m13011a(zM11101n);
        C3244j5 c3244j5 = new C3244j5(strM13011a, null, null, i2, str2);
        C2967bc c2967bcM9970e = this.f10738e.m9970e();
        c2967bcM9970e.m7903a(new C3686t4(c3244j5));
        c2967bcM9970e.m7905b().m11492a(j, i, str);
        if (zM11101n) {
            m11278a(interfaceC2990c0, interfaceC3237ix, i2, str2, strM13011a);
        } else {
            m11280a(interfaceC3237ix);
        }
    }

    /* renamed from: a */
    private final void m11278a(InterfaceC2990c0 interfaceC2990c0, InterfaceC3237ix interfaceC3237ix, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10738e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new C3195hp(this.f10738e, this.f10739f).m9223a(interfaceC3237ix, i, str, str2, interfaceC2990c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m11279a(InterfaceC2990c0 interfaceC2990c0, InterfaceC3237ix interfaceC3237ix, List<C3353m5> list, Map<String, C3135g0> map, String str, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) throws JSONException {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10738e, (String) null, (String) null, 3, (Object) null));
        C3244j5 c3244j5 = new C3244j5(str, jSONObject, c3353m5, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f10738e.m9970e().m7911h().m9896a(i2, str2);
        }
        m11285a(jSONObject2);
        C3272jx c3272jxM9244a = m9244a(list, map, c3244j5, interfaceC2990c0);
        this.f10738e.m9970e().m7903a(new C3686t4(c3244j5));
        this.f10738e.m9970e().m7905b().m11493a(j, this.f10739f.m12525v() + ";wtf=" + c3272jxM9244a.m9560c());
        this.f10738e.m9970e().m7905b().m11497c(c3272jxM9244a.m9561d());
        m11281a(c3272jxM9244a, interfaceC3237ix);
    }

    /* renamed from: a */
    private final void m11280a(InterfaceC3237ix interfaceC3237ix) {
        interfaceC3237ix.mo8844a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }

    /* renamed from: a */
    private final void m11281a(C3272jx c3272jx, InterfaceC3237ix interfaceC3237ix) {
        this.f10738e.m12533h().m11468a(c3272jx);
        interfaceC3237ix.mo8845a(c3272jx);
    }

    /* renamed from: a */
    private final void m11285a(JSONObject jSONObject) {
        IronLog ironLog;
        C3719u2 c3719u2;
        String strM12525v;
        int i;
        try {
            if (jSONObject == null) {
                this.f10739f.m12508b(false);
                ironLog = IronLog.INTERNAL;
                c3719u2 = this.f10738e;
                strM12525v = "loading configuration from auction response is null, using the following: " + this.f10739f.m12525v();
            } else {
                try {
                    if (jSONObject.has(C3368d.f9626x) && (i = jSONObject.getInt(C3368d.f9626x)) > 0) {
                        this.f10739f.m12506a(i);
                    }
                    if (jSONObject.has(C3368d.f9627y)) {
                        this.f10739f.m12507a(jSONObject.getBoolean(C3368d.f9627y));
                    }
                    this.f10739f.m12508b(jSONObject.optBoolean(C3368d.f9628z, false));
                    ironLog = IronLog.INTERNAL;
                    c3719u2 = this.f10738e;
                    strM12525v = this.f10739f.m12525v();
                } catch (JSONException e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.f10739f.mo9364b().m8434a() + " Error: " + e.getMessage());
                    ironLog2.verbose(C3349m1.m9956a(this.f10738e, this.f10739f.m12525v(), (String) null, 2, (Object) null));
                    return;
                }
            }
            ironLog.verbose(C3349m1.m9956a(c3719u2, strM12525v, (String) null, 2, (Object) null));
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10738e, this.f10739f.m12525v(), (String) null, 2, (Object) null));
            throw th;
        }
    }
}
