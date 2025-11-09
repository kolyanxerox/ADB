package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15614OooO00o;

    public /* synthetic */ OooO00o(int i) {
        this.f15614OooO00o = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15614OooO00o) {
            case 0:
                return MessagingServiceImpl.m496a(runnable);
            default:
                return SimpleThreadPoolExecutor.lambda$new$0(runnable);
        }
    }
}
