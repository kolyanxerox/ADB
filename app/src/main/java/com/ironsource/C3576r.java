package com.ironsource;

import com.ironsource.InterfaceC3150gf;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.r */
/* loaded from: classes2.dex */
public final class C3576r implements InterfaceC3150gf, InterfaceC3150gf.a {

    /* renamed from: a */
    private final Map<IronSource.AD_UNIT, AtomicBoolean> f11163a = o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0(IronSource.AD_UNIT.REWARDED_VIDEO, new AtomicBoolean(false)), new oo00o.OooOO0(IronSource.AD_UNIT.INTERSTITIAL, new AtomicBoolean(false)), new oo00o.OooOO0(IronSource.AD_UNIT.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC3150gf.a
    /* renamed from: a */
    public void mo8948a(IronSource.AD_UNIT adFormat, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f11163a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC3150gf
    /* renamed from: a */
    public boolean mo8947a(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f11163a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
