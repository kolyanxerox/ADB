package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ironsource.gk */
/* loaded from: classes2.dex */
public final class HandlerThreadC3155gk extends HandlerThread {

    /* renamed from: a */
    private Handler f8739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC3155gk(String name) {
        super(name);
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
    }

    /* renamed from: a */
    public final void m8980a() {
        this.f8739a = new Handler(getLooper());
    }

    /* renamed from: b */
    public final void m8983b(Runnable task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        Handler handler = this.f8739a;
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m8979a(HandlerThreadC3155gk handlerThreadC3155gk, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        handlerThreadC3155gk.m8982a(runnable, j);
    }

    /* renamed from: a */
    public final void m8981a(Runnable task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        m8979a(this, task, 0L, 2, null);
    }

    /* renamed from: a */
    public final void m8982a(Runnable task, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        Handler handler = this.f8739a;
        if (handler != null) {
            handler.postDelayed(task, j);
        }
    }
}
