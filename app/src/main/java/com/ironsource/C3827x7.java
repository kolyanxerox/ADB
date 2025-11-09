package com.ironsource;

import com.ironsource.AbstractC3619s7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;

/* renamed from: com.ironsource.x7 */
/* loaded from: classes2.dex */
public final class C3827x7<Smash extends AbstractC3619s7<?>> extends AbstractC3610rx<Smash> {

    /* renamed from: h */
    private boolean f12594h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3827x7(int i, boolean z, List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        this.f12594h = z2;
    }

    @Override // com.ironsource.AbstractC3610rx
    /* renamed from: c */
    public void mo10013c(Smash smash) {
        String str;
        kotlin.jvm.internal.OooOo.OooO0o0(smash, "smash");
        if (!smash.m11881w()) {
            IronLog.INTERNAL.verbose(smash.m11868g().name() + " - Smash " + smash.mo9129c() + " (non-bidder) is ready to load");
            smash.m11863a(true);
            m11778c().add(smash);
            return;
        }
        this.f12594h = true;
        if (m11779d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.mo9129c() + ". No other instances will be loaded at the same time.";
            smash.m11863a(true);
            m11778c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.mo9129c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.m11868g().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.ironsource.AbstractC3610rx
    /* renamed from: e */
    public boolean mo11781e() {
        return super.mo11781e() || this.f12594h;
    }

    public /* synthetic */ C3827x7(int i, boolean z, List list, boolean z2, int i2, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }
}
