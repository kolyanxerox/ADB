package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3438n1;
import com.ironsource.C2992c2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.ironsource.l6 */
/* loaded from: classes2.dex */
public class C3315l6 extends AbstractC3438n1 {

    /* renamed from: k */
    private final WeakReference<InterfaceC3478o6> f9301k;

    /* renamed from: l */
    private final a f9302l;

    /* renamed from: m */
    private final C3354m6 f9303m;

    /* renamed from: com.ironsource.l6$a */
    public final class a extends AbstractC3438n1.a implements InterfaceC3893z5 {
        public a() {
            super();
        }

        @Override // com.ironsource.InterfaceC3893z5
        /* renamed from: a */
        public void mo9744a(C3825x5 instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            IronLog.INTERNAL.verbose(C3315l6.this.m10920a(instance.m13277p()));
            InterfaceC3478o6 interfaceC3478o6 = (InterfaceC3478o6) C3315l6.this.f9301k.get();
            if (interfaceC3478o6 != null) {
                interfaceC3478o6.mo11028j();
            }
        }

        @Override // com.ironsource.InterfaceC3893z5
        /* renamed from: b */
        public void mo9745b(C3825x5 instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            IronLog.INTERNAL.verbose(C3315l6.this.m10920a(instance.m13277p()));
            InterfaceC3478o6 interfaceC3478o6 = (InterfaceC3478o6) C3315l6.this.f9301k.get();
            if (interfaceC3478o6 != null) {
                interfaceC3478o6.mo11030m();
            }
        }

        @Override // com.ironsource.InterfaceC3893z5
        /* renamed from: c */
        public void mo9746c(C3825x5 instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            IronLog.INTERNAL.verbose(C3315l6.this.m10920a(instance.m13277p()));
            InterfaceC3478o6 interfaceC3478o6 = (InterfaceC3478o6) C3315l6.this.f9301k.get();
            if (interfaceC3478o6 != null) {
                interfaceC3478o6.mo11029k();
            }
        }

        @Override // com.ironsource.AbstractC3438n1.a, com.ironsource.InterfaceC3025d0
        /* renamed from: b */
        public void mo8253b(AbstractC3887z instance) {
            kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
            super.mo8253b(instance);
            InterfaceC3787w1 interfaceC3787w1M10932i = C3315l6.this.m10932i();
            if (interfaceC3787w1M10932i != null) {
                interfaceC3787w1M10932i.mo8044b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3315l6(C3349m1 tools, C3354m6 adUnitData, InterfaceC3478o6 listener) {
        String str;
        int iM13115b;
        super(tools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.OooOo.OooO0o0(tools, "tools");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f9301k = new WeakReference<>(listener);
        this.f9302l = new a();
        this.f9303m = adUnitData;
        Placement placementM10930g = m10930g();
        IronLog.INTERNAL.verbose("placement = " + placementM10930g);
        if (placementM10930g == null || TextUtils.isEmpty(placementM10930g.getPlacementName())) {
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{placementM10930g == null ? "placement is null" : "placement name is empty"}, 1));
            iM13115b = C3855y1.m13115b(adUnitData.mo9364b().m8434a());
        } else {
            str = null;
            iM13115b = 510;
        }
        if (str != null) {
            IronLog.API.error(m10920a(str));
            m10921a(iM13115b, str);
        }
    }

    /* renamed from: m */
    private final ISBannerSize m9741m() {
        return m10929f().m9957a(this.f9303m.mo9364b().m9442h());
    }

    @Override // com.ironsource.AbstractC3438n1
    /* renamed from: a */
    public InterfaceC2990c0 mo9217a() {
        return new o000oOoO(this, 1);
    }

    @Override // com.ironsource.AbstractC3438n1
    /* renamed from: b */
    public C3508p1 mo9743b() {
        return new C3618s6(this.f9303m.mo9364b(), m9738a(m9741m()));
    }

    /* renamed from: a */
    private final ISBannerSize m9738a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? C3395l.m10352a() : ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final AbstractC3887z m9739a(C3315l6 this$0, C2626a0 instanceData, C3135g0 adInstancePayload) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        return new C3825x5(new C3719u2(this$0.m10929f(), C2992c2.b.PROVIDER), instanceData, adInstancePayload, this$0.f9302l);
    }

    /* renamed from: a */
    public final void m9742a(InterfaceC3852xw interfaceC3852xw, InterfaceC3787w1 displayListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(displayListener, "displayListener");
        if (interfaceC3852xw != null) {
            m10922a(new C2961b6(interfaceC3852xw), displayListener);
        }
    }
}
