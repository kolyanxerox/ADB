package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;

/* renamed from: com.ironsource.ox */
/* loaded from: classes2.dex */
public abstract class AbstractC3505ox {

    /* renamed from: c */
    public static final a f10719c = new a(null);

    /* renamed from: a */
    private final C3349m1 f10720a;

    /* renamed from: b */
    private final InterfaceC3913zp f10721b;

    /* renamed from: com.ironsource.ox$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final AbstractC3505ox m11244a(C3719u2 adTools, AbstractC3718u1 adUnitData, InterfaceC3913zp outcomeReporter, C3272jx waterfallInstances, AbstractC3100f0 adInstanceLoadStrategy) {
            kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
            kotlin.jvm.internal.OooOo.OooO0o0(adUnitData, "adUnitData");
            kotlin.jvm.internal.OooOo.OooO0o0(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.OooOo.OooO0o0(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.OooOo.OooO0o0(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.m12521q() ? new C3677su(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new C3447na(adTools, outcomeReporter, waterfallInstances);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public AbstractC3505ox(C3349m1 adTools, InterfaceC3913zp outcomeReporter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(outcomeReporter, "outcomeReporter");
        this.f10720a = adTools;
        this.f10721b = outcomeReporter;
    }

    /* renamed from: b */
    private final void m11241b(AbstractC3887z abstractC3887z, List<? extends AbstractC3887z> list) {
        for (AbstractC3887z abstractC3887z2 : list) {
            if (abstractC3887z2 == abstractC3887z) {
                abstractC3887z.m13266a(true);
                return;
            }
            abstractC3887z2.m13266a(false);
            IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10720a, abstractC3887z2.m13277p() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    /* renamed from: a */
    public abstract void mo10980a();

    /* renamed from: a */
    public abstract void mo10981a(AbstractC3887z abstractC3887z);

    /* renamed from: a */
    public final void m11242a(AbstractC3887z instance, String str, C3840xk publisherDataHolder) {
        kotlin.jvm.internal.OooOo.OooO0o0(instance, "instance");
        kotlin.jvm.internal.OooOo.OooO0o0(publisherDataHolder, "publisherDataHolder");
        this.f10721b.mo8280a(instance, str, publisherDataHolder);
    }

    /* renamed from: b */
    public abstract void mo10982b(AbstractC3887z abstractC3887z);

    /* renamed from: c */
    public abstract void mo10983c(AbstractC3887z abstractC3887z);

    /* renamed from: a */
    public final void m11243a(AbstractC3887z instanceToShow, List<? extends AbstractC3887z> orderedInstances) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceToShow, "instanceToShow");
        kotlin.jvm.internal.OooOo.OooO0o0(orderedInstances, "orderedInstances");
        m11241b(instanceToShow, orderedInstances);
        mo10983c(instanceToShow);
    }
}
