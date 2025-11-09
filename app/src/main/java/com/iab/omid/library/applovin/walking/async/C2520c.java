package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.applovin.walking.async.c */
/* loaded from: classes2.dex */
public class C2520c implements AbstractAsyncTaskC2519b.a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f3570a;

    /* renamed from: b */
    private final ThreadPoolExecutor f3571b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC2519b> f3572c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC2519b f3573d = null;

    public C2520c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f3570a = linkedBlockingQueue;
        this.f3571b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m4225a() {
        AbstractAsyncTaskC2519b abstractAsyncTaskC2519bPoll = this.f3572c.poll();
        this.f3573d = abstractAsyncTaskC2519bPoll;
        if (abstractAsyncTaskC2519bPoll != null) {
            abstractAsyncTaskC2519bPoll.m4221a(this.f3571b);
        }
    }

    /* renamed from: b */
    public void m4226b(AbstractAsyncTaskC2519b abstractAsyncTaskC2519b) {
        abstractAsyncTaskC2519b.m4219a(this);
        this.f3572c.add(abstractAsyncTaskC2519b);
        if (this.f3573d == null) {
            m4225a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b.a
    /* renamed from: a */
    public void mo4222a(AbstractAsyncTaskC2519b abstractAsyncTaskC2519b) {
        this.f3573d = null;
        m4225a();
    }
}
