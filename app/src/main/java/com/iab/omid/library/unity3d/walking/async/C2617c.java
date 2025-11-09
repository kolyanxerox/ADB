package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.iab.omid.library.unity3d.walking.async.c */
/* loaded from: classes2.dex */
public class C2617c implements AbstractAsyncTaskC2616b.a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f3833a;

    /* renamed from: b */
    private final ThreadPoolExecutor f3834b;

    /* renamed from: c */
    private final ArrayDeque<AbstractAsyncTaskC2616b> f3835c = new ArrayDeque<>();

    /* renamed from: d */
    private AbstractAsyncTaskC2616b f3836d = null;

    public C2617c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f3833a = linkedBlockingQueue;
        this.f3834b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: a */
    private void m4712a() {
        AbstractAsyncTaskC2616b abstractAsyncTaskC2616bPoll = this.f3835c.poll();
        this.f3836d = abstractAsyncTaskC2616bPoll;
        if (abstractAsyncTaskC2616bPoll != null) {
            abstractAsyncTaskC2616bPoll.m4708a(this.f3834b);
        }
    }

    /* renamed from: b */
    public void m4713b(AbstractAsyncTaskC2616b abstractAsyncTaskC2616b) {
        abstractAsyncTaskC2616b.m4706a(this);
        this.f3835c.add(abstractAsyncTaskC2616b);
        if (this.f3836d == null) {
            m4712a();
        }
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b.a
    /* renamed from: a */
    public void mo4709a(AbstractAsyncTaskC2616b abstractAsyncTaskC2616b) {
        this.f3836d = null;
        m4712a();
    }
}
