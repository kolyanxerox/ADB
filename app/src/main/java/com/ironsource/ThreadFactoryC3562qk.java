package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ironsource.qk */
/* loaded from: classes2.dex */
final class ThreadFactoryC3562qk implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f10948a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        kotlin.jvm.internal.OooOo.OooO0o0(r, "r");
        return new Thread(r, String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f10948a.incrementAndGet())}, 2)));
    }
}
