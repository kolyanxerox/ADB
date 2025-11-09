package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ironsource.cc */
/* loaded from: classes2.dex */
final class HandlerThreadC3002cc extends HandlerThread {

    /* renamed from: a */
    private Handler f7732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC3002cc(String name) {
        super(name);
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
    }

    /* renamed from: a */
    public final void m8108a() {
        this.f7732a = new Handler(getLooper());
    }

    /* renamed from: a */
    public final void m8109a(Runnable task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        Handler handler = this.f7732a;
        if (handler != null) {
            handler.post(task);
        }
    }
}
