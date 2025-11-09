package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;

/* renamed from: com.applovin.impl.p6 */
/* loaded from: classes.dex */
public class C1156p6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final Runnable f1724g;

    public C1156p6(C1220k c1220k, String str, Runnable runnable) {
        this(c1220k, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1724g.run();
    }

    public C1156p6(C1220k c1220k, boolean z, String str, Runnable runnable) {
        super(OooO0oO.OooOo.OooOO0("TaskRunnable:", str), c1220k, z);
        this.f1724g = runnable;
    }
}
