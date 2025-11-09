package com.ironsource;

/* renamed from: com.ironsource.zv */
/* loaded from: classes2.dex */
public interface InterfaceC3919zv {
    /* renamed from: a */
    static /* synthetic */ void m13429a(InterfaceC3919zv interfaceC3919zv, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        interfaceC3919zv.mo11397a(runnable, j);
    }

    /* renamed from: a */
    void mo11396a(Runnable runnable);

    /* renamed from: a */
    void mo11397a(Runnable runnable, long j);
}
