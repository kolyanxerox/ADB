package com.ironsource;

import java.lang.Thread;

/* renamed from: com.ironsource.o9 */
/* loaded from: classes2.dex */
public class C3481o9 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f10639a;

    public C3481o9(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10639a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C3516p9 c3516p9 = new C3516p9(th);
        if (c3516p9.m11370d()) {
            new C3360mc(c3516p9.m11368b(), "" + System.currentTimeMillis(), "Crash").m10019a();
        }
        this.f10639a.uncaughtException(thread, th);
    }
}
