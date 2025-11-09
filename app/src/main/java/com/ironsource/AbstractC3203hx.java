package com.ironsource;

import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.ironsource.hx */
/* loaded from: classes2.dex */
public abstract class AbstractC3203hx {

    /* renamed from: d */
    public static final a f8956d = new a(null);

    /* renamed from: a */
    private final C3719u2 f8957a;

    /* renamed from: b */
    private final AbstractC3718u1 f8958b;

    /* renamed from: c */
    private final InterfaceC3913zp f8959c;

    /* renamed from: com.ironsource.hx$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final AbstractC3203hx m9246a(C3719u2 adTools, AbstractC3718u1 adUnitData) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
            return adUnitData.m12524t() ? new C3512p5(adTools, adUnitData) : new C3195hp(adTools, adUnitData);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.hx$b */
    public static final class b implements InterfaceC3913zp {
    }

    public AbstractC3203hx(C3719u2 adTools, AbstractC3718u1 adUnitData) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        this.f8957a = adTools;
        this.f8958b = adUnitData;
        this.f8959c = new b();
    }

    /* renamed from: a */
    public final C3272jx m9244a(List<? extends C3353m5> waterfallItems, Map<String, C3135g0> adInstancePayloads, C3244j5 auctionData, InterfaceC2990c0 adInstanceFactory) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayloads, "adInstancePayloads");
        kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8957a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i = 0; i < size; i++) {
            C3353m5 c3353m5 = waterfallItems.get(i);
            AbstractC3887z abstractC3887zM9242a = m9242a(c3353m5, auctionData, adInstanceFactory, adInstancePayloads.get(c3353m5.m9986c()));
            if (abstractC3887zM9242a != null && abstractC3887zM9242a.m13269g() != null) {
                arrayList.add(abstractC3887zM9242a);
            }
        }
        C3272jx c3272jx = new C3272jx(arrayList);
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f8957a, "updateWaterfall() - next waterfall is " + c3272jx + ".toWaterfallString()", (String) null, 2, (Object) null));
        return c3272jx;
    }

    /* renamed from: a */
    public abstract void mo9222a(InterfaceC2990c0 interfaceC2990c0, InterfaceC3237ix interfaceC3237ix);

    /* renamed from: a */
    private final AbstractC3887z m9242a(C3353m5 c3353m5, C3244j5 c3244j5, InterfaceC2990c0 interfaceC2990c0, C3135g0 c3135g0) throws JSONException {
        String strM9986c;
        String str;
        AbstractC3718u1 abstractC3718u1 = this.f8958b;
        String strM9986c2 = c3353m5.m9986c();
        kotlin.jvm.internal.OooOo.OooO0Oo(strM9986c2, "item.instanceName");
        NetworkSettings networkSettingsM12505a = abstractC3718u1.m12505a(strM9986c2);
        if (networkSettingsM12505a == null) {
            strM9986c = c3353m5.m9986c();
            kotlin.jvm.internal.OooOo.OooO0Oo(strM9986c, "item.instanceName");
            str = "Could not find matching provider settings for auction response item";
        } else {
            if (c3135g0 != null) {
                C3367c.m10097b().m10116b(networkSettingsM12505a, this.f8958b.mo9364b().m8434a(), this.f8958b.mo9364b().m8436b());
                int iM9971f = this.f8957a.m9971f();
                AbstractC3718u1 abstractC3718u12 = this.f8958b;
                return interfaceC2990c0.mo8067a(new C2626a0(abstractC3718u12, networkSettingsM12505a, c3244j5, new C2629a3(networkSettingsM12505a, abstractC3718u12.mo9365b(networkSettingsM12505a), this.f8958b.mo9364b().m8434a()), c3353m5, iM9971f), c3135g0);
            }
            strM9986c = c3353m5.m9986c();
            kotlin.jvm.internal.OooOo.OooO0Oo(strM9986c, "item.instanceName");
            str = "Could not find matching adInstancePayload for auction response item";
        }
        m9243a(str, strM9986c);
        return null;
    }

    /* renamed from: a */
    public InterfaceC3913zp mo9245a() {
        return this.f8959c;
    }

    /* renamed from: a */
    private final void m9243a(String str, String str2) {
        String strOooOoo = OooO0oO.OooOo.OooOoo(str, " - item = ", str2);
        IronLog.INTERNAL.error(C3349m1.m9956a(this.f8957a, strOooOoo, (String) null, 2, (Object) null));
        this.f8957a.m9970e().m7911h().m9920i(strOooOoo);
    }
}
