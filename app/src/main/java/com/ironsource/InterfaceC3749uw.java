package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.uw */
/* loaded from: classes2.dex */
public interface InterfaceC3749uw {
    /* renamed from: a */
    void mo8283a() throws C3605rs;

    /* renamed from: a */
    default void m12724a(boolean z, o00O0Oo.OooO0O0 lazyError) {
        kotlin.jvm.internal.OooOo.OooO0o0(lazyError, "lazyError");
        if (!z) {
            throw new C3605rs((IronSourceError) lazyError.invoke());
        }
    }
}
