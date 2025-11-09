package com.ironsource;

import com.ironsource.C2992c2;
import com.ironsource.InterfaceC3223ii;
import com.ironsource.mediationsdk.C3367c;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* renamed from: com.ironsource.u2 */
/* loaded from: classes2.dex */
public class C3719u2 extends C3349m1 {

    /* renamed from: g */
    private final C3349m1 f12141g;

    /* renamed from: h */
    private final C3544q2 f12142h;

    /* renamed from: i */
    private InterfaceC3140g5 f12143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3719u2(C3349m1 adTools, AbstractC3718u1 adUnitData, C2992c2.b level) {
        super(adTools, level);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
        this.f12141g = adTools;
        C3544q2 c3544q2M7840a = C2951av.m7840a(adUnitData, adUnitData.m12510e().m11090c());
        kotlin.jvm.internal.OooOo.OooO0Oo(c3544q2M7840a, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f12142h = c3544q2M7840a;
    }

    /* renamed from: a */
    public final BaseAdAdapter<?, ?> m12527a(C2626a0 instanceData) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        return C3367c.m10097b().m10113a(instanceData.m4760u(), instanceData.m4747h(), instanceData.m4748i().mo9364b().m8436b());
    }

    /* renamed from: c */
    public final void m12531c(AbstractRunnableC3302ks task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        C2986bv.m8032a(C2986bv.f7654a, task, 0L, 2, null);
    }

    /* renamed from: e */
    public final String m12532e(String serverData) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(serverData, "serverData");
        String strM10136c = C3368d.m10127b().m10136c(serverData);
        kotlin.jvm.internal.OooOo.OooO0Oo(strM10136c, "getInstance().getDynamic…romServerData(serverData)");
        return strM10136c;
    }

    /* renamed from: h */
    public final C3544q2 m12533h() {
        return this.f12142h;
    }

    /* renamed from: i */
    public final InterfaceC3140g5 m12534i() {
        return this.f12143i;
    }

    /* renamed from: j */
    public final String m12535j() {
        return C3404p.m10470j().m10552i();
    }

    /* renamed from: k */
    public final Map<String, String> m12536k() {
        return C3404p.m10470j().m10561p();
    }

    /* renamed from: l */
    public final IronSourceSegment m12537l() {
        return C2951av.m7838a();
    }

    /* renamed from: m */
    public final InterfaceC3223ii.a m12538m() {
        return C3495on.f10667s.m11211a().mo8482e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3719u2(C3719u2 adUnitTools, C2992c2.b level) {
        super(adUnitTools, level);
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.OooOo.OooO0o0(level, "level");
        this.f12141g = adUnitTools.f12141g;
        this.f12142h = adUnitTools.f12142h;
        this.f12143i = adUnitTools.f12143i;
    }

    /* renamed from: a */
    public final BaseAdAdapter<?, ?> m12528a(NetworkSettings providerSettings, IronSource.AD_UNIT adFormat, UUID adId) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerSettings, "providerSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        return C3367c.m10097b().m10113a(providerSettings, adFormat, adId);
    }

    /* renamed from: a */
    public final String m12529a(long j, String instanceName) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceName, "instanceName");
        String transId = IronSourceUtils.getTransId(j, instanceName);
        kotlin.jvm.internal.OooOo.OooO0Oo(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }

    /* renamed from: a */
    public final void m12530a(InterfaceC3140g5 interfaceC3140g5) {
        this.f12143i = interfaceC3140g5;
    }
}
