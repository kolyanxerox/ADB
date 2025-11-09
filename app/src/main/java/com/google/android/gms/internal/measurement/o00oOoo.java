package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class o00oOoo implements ThreadFactory {

    /* renamed from: OooO00o */
    public final ThreadFactory f26537OooO00o;

    public o00oOoo(o00O00OO o00o00oo) {
        Objects.requireNonNull(o00o00oo);
        this.f26537OooO00o = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f26537OooO00o.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
