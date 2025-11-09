package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class zza implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f16168OooO00o = new AtomicInteger(1);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f16169OooO0O0;

    public zza(String str) {
        this.f16169OooO0O0 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f16169OooO0O0 + ") #" + this.f16168OooO00o.getAndIncrement());
    }
}
