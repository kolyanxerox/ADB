package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* renamed from: com.ironsource.l4 */
/* loaded from: classes2.dex */
public class C3313l4 implements InterfaceC3254jf {

    /* renamed from: a */
    private final InterfaceC3006cg f9299a;

    /* renamed from: b */
    private InterfaceC3352m4 f9300b;

    /* renamed from: com.ironsource.l4$a */
    public static final class a {
        /* renamed from: a */
        public final InterfaceC3352m4 m9737a(C3243j4 c3243j4, InterfaceC3006cg featureAvailabilityService) {
            kotlin.jvm.internal.OooOo.OooO0o0(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.mo8126a());
            StringBuilder sb = new StringBuilder("isAndroidxApplicationLifecycleEnabled: ");
            sb.append(c3243j4 != null ? Boolean.valueOf(c3243j4.m9428k()) : null);
            ironLog.verbose(sb.toString());
            boolean z = false;
            if (featureAvailabilityService.mo8126a()) {
                C3053ds.m8391i().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((c3243j4 != null ? c3243j4.m9428k() : false) && featureAvailabilityService.mo8126a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C3685t3() : new C3593rg();
        }
    }

    public C3313l4(InterfaceC3006cg featureAvailabilityService) {
        kotlin.jvm.internal.OooOo.OooO0o0(featureAvailabilityService, "featureAvailabilityService");
        this.f9299a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC3254jf
    /* renamed from: a */
    public void mo9481a(C3243j4 c3243j4) {
        if (this.f9300b == null) {
            this.f9300b = new a().m9737a(c3243j4, this.f9299a);
        }
    }

    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: b */
    public void mo9736b(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        InterfaceC3352m4 interfaceC3352m4 = this.f9300b;
        if (interfaceC3352m4 != null) {
            interfaceC3352m4.mo9736b(observer);
        }
    }

    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: a */
    public void mo9735a(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        InterfaceC3352m4 interfaceC3352m4 = this.f9300b;
        if (interfaceC3352m4 != null) {
            interfaceC3352m4.mo9735a(observer);
        }
    }
}
