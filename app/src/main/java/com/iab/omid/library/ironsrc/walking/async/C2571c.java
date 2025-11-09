package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.c */
/* loaded from: classes2.dex */
public class C2571c implements AbstractAsyncTaskC2570b.a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f3705a;

    /* renamed from: b */
    private final ThreadPoolExecutor f3706b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC2570b> f3707c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC2570b f3708d = null;

    public C2571c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f3705a = linkedBlockingQueue;
        this.f3706b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m4478a() {
        AbstractAsyncTaskC2570b abstractAsyncTaskC2570bPoll = this.f3707c.poll();
        this.f3708d = abstractAsyncTaskC2570bPoll;
        if (abstractAsyncTaskC2570bPoll != null) {
            abstractAsyncTaskC2570bPoll.m4474a(this.f3706b);
        }
    }

    /* renamed from: b */
    public void m4479b(AbstractAsyncTaskC2570b abstractAsyncTaskC2570b) {
        abstractAsyncTaskC2570b.m4472a(this);
        this.f3707c.add(abstractAsyncTaskC2570b);
        if (this.f3708d == null) {
            m4478a();
        }
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b.a
    /* renamed from: a */
    public void mo4475a(AbstractAsyncTaskC2570b abstractAsyncTaskC2570b) {
        this.f3708d = null;
        m4478a();
    }
}
