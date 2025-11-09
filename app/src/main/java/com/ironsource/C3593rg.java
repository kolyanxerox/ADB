package com.ironsource;

import com.ironsource.lifecycle.C3331b;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.rg */
/* loaded from: classes2.dex */
public final class C3593rg implements InterfaceC3352m4 {
    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: a */
    public void mo9735a(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        C3331b.m9799d().m9807a(observer);
    }

    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: b */
    public void mo9736b(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        C3331b.m9799d().m9809b(observer);
    }
}
