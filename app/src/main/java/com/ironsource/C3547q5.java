package com.ironsource;

import com.ironsource.C3511p4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C3387e;
import com.ironsource.mediationsdk.C3388f;
import com.ironsource.mediationsdk.C3391i;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.q5 */
/* loaded from: classes2.dex */
public class C3547q5 {

    /* renamed from: a */
    private final C3719u2 f10883a;

    /* renamed from: b */
    private final AbstractC3718u1 f10884b;

    /* renamed from: c */
    private final C3387e f10885c;

    /* renamed from: d */
    private final C3030d5 f10886d;

    /* renamed from: com.ironsource.q5$a */
    public static final class a implements C3511p4.d {

        /* renamed from: b */
        final /* synthetic */ InterfaceC3582r5 f10888b;

        public a(InterfaceC3582r5 interfaceC3582r5) {
            this.f10888b = interfaceC3582r5;
        }

        @Override // com.ironsource.C3511p4.d
        /* renamed from: a */
        public void mo11274a(C3511p4 auction) {
            kotlin.jvm.internal.OooOo.OooO0o0(auction, "auction");
            C3547q5.this.m11503b(auction, this.f10888b);
        }

        @Override // com.ironsource.C3511p4.d
        /* renamed from: a */
        public void mo11275a(C3511p4 auction, String error) {
            kotlin.jvm.internal.OooOo.OooO0o0(auction, "auction");
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3547q5.this.m11503b(auction, this.f10888b);
        }
    }

    /* renamed from: com.ironsource.q5$b */
    public static final class b implements InterfaceC3581r4 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3582r5 f10889a;

        /* renamed from: b */
        final /* synthetic */ C3511p4 f10890b;

        public b(InterfaceC3582r5 interfaceC3582r5, C3511p4 c3511p4) {
            this.f10889a = interfaceC3582r5;
            this.f10890b = c3511p4;
        }

        @Override // com.ironsource.InterfaceC3581r4
        /* renamed from: a */
        public void mo10175a(int i, String errorMessage, int i2, String auctionFallback, long j) {
            kotlin.jvm.internal.OooOo.OooO0o0(errorMessage, "errorMessage");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionFallback, "auctionFallback");
            this.f10889a.mo11289a(i, errorMessage, i2, auctionFallback, j);
        }

        @Override // com.ironsource.InterfaceC3581r4
        /* renamed from: a */
        public void mo10178a(List<C3353m5> newWaterfall, String auctionId, C3353m5 c3353m5, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            kotlin.jvm.internal.OooOo.OooO0o0(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.OooOo.OooO0o0(auctionId, "auctionId");
            this.f10889a.mo11290a(newWaterfall, this.f10890b.m11264c(), auctionId, c3353m5, jSONObject, jSONObject2, i, j, i2, str);
        }
    }

    public C3547q5(C3719u2 adTools, AbstractC3718u1 adUnitData) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f10883a = adTools;
        this.f10884b = adUnitData;
        C3477o5 c3477o5M12510e = adUnitData.m12510e();
        String sessionId = IronSourceUtils.getSessionId();
        kotlin.jvm.internal.OooOo.OooO0Oo(sessionId, "getSessionId()");
        C3387e c3387e = new C3387e(new C3388f(c3477o5M12510e, sessionId));
        this.f10885c = c3387e;
        this.f10886d = new C3030d5(adTools, c3387e);
    }

    /* renamed from: a */
    private final C3391i m11498a(C3511p4 c3511p4, int i) {
        C3391i c3391i = new C3391i(this.f10884b.mo9364b().m8434a());
        c3391i.m10307b(IronSourceUtils.isEncryptedResponse());
        c3391i.m10303a(c3511p4.m11265d().m8449a());
        c3391i.m10302a(c3511p4.m11265d().m8453b());
        c3391i.m10298a(this.f10883a.m12533h());
        c3391i.m10294a(i);
        c3391i.m10297a(this.f10883a.m12537l());
        C3270jv c3270jvM8441g = this.f10884b.mo9364b().m8441g();
        c3391i.m10315e(c3270jvM8441g != null ? c3270jvM8441g.m9545b() : false);
        c3391i.m10300a(this.f10884b.mo9364b().m8438d());
        InterfaceC3140g5 interfaceC3140g5M12534i = this.f10883a.m12534i();
        if (interfaceC3140g5M12534i != null) {
            interfaceC3140g5M12534i.mo8877a(c3391i);
        }
        return c3391i;
    }

    /* renamed from: b */
    public final C3030d5 m11505b() {
        return this.f10886d;
    }

    /* renamed from: a */
    private final String m11499a() {
        return C3349m1.m9956a(this.f10883a, (String) null, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m11503b(C3511p4 c3511p4, InterfaceC3582r5 interfaceC3582r5) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m11500a("auction waterfallString = " + ((Object) c3511p4.m11265d().m8454c())));
        if (!c3511p4.m11268g()) {
            ironLog.verbose(m11500a("auction failed - no candidates"));
            this.f10883a.m9970e().m7905b().m11491a(1005, "No candidates available for auctioning");
            interfaceC3582r5.mo11288a(C3855y1.m13118e(this.f10884b.mo9364b().m8434a()), "no available ad to load");
        } else {
            this.f10883a.m9970e().m7905b().m11496b(c3511p4.m11265d().m8454c().toString());
            this.f10885c.m10264a(ContextProvider.getInstance().getApplicationContext(), m11498a(c3511p4, this.f10883a.m9971f()), new b(interfaceC3582r5, c3511p4));
        }
    }

    /* renamed from: a */
    private final String m11500a(String str) {
        return C3349m1.m9956a(this.f10883a, str, (String) null, 2, (Object) null);
    }

    /* renamed from: a */
    private final void m11501a(C3511p4 c3511p4, InterfaceC3582r5 interfaceC3582r5) {
        if (c3511p4.m11267f()) {
            c3511p4.m11263a(new a(interfaceC3582r5));
        } else {
            m11503b(c3511p4, interfaceC3582r5);
        }
    }

    /* renamed from: a */
    public void m11504a(InterfaceC3582r5 completionListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(m11499a());
        this.f10883a.m9970e().m7905b().m11494a(this.f10884b.mo9364b().m8438d());
        m11501a(new C3511p4(this.f10883a, this.f10884b), completionListener);
    }
}
