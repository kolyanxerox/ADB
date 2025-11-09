package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.pg */
/* loaded from: classes2.dex */
public final class C3523pg implements InterfaceC3919zv {

    /* renamed from: c */
    private static boolean f10824c;

    /* renamed from: e */
    private static final HandlerThreadC3155gk f10826e;

    /* renamed from: f */
    private static final HandlerThreadC3155gk f10827f;

    /* renamed from: g */
    private static final HandlerThreadC3155gk f10828g;

    /* renamed from: a */
    public static final C3523pg f10822a = new C3523pg();

    /* renamed from: b */
    private static final Handler f10823b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static final oo00o.OooO0OO f10825d = o0OOO0.OooO0oo(a.f10829a);

    /* renamed from: com.ironsource.pg$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f10829a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3341ls invoke() {
            return new C3341ls(0, null, null, 7, null);
        }
    }

    static {
        HandlerThreadC3155gk handlerThreadC3155gk = new HandlerThreadC3155gk("isadplayer-background");
        handlerThreadC3155gk.start();
        handlerThreadC3155gk.m8980a();
        f10826e = handlerThreadC3155gk;
        HandlerThreadC3155gk handlerThreadC3155gk2 = new HandlerThreadC3155gk("isadplayer-publisher-callbacks");
        handlerThreadC3155gk2.start();
        handlerThreadC3155gk2.m8980a();
        f10827f = handlerThreadC3155gk2;
        HandlerThreadC3155gk handlerThreadC3155gk3 = new HandlerThreadC3155gk("isadplayer-release");
        handlerThreadC3155gk3.start();
        handlerThreadC3155gk3.m8980a();
        f10828g = handlerThreadC3155gk3;
    }

    private C3523pg() {
    }

    /* renamed from: b */
    private final C3341ls m11391b() {
        return (C3341ls) f10825d.getValue();
    }

    /* renamed from: f */
    private final boolean m11394f(Runnable runnable) {
        return f10824c && m11391b().getQueue().contains(runnable);
    }

    /* renamed from: a */
    public final Looper m11395a() {
        return f10826e.getLooper();
    }

    /* renamed from: c */
    public final ThreadPoolExecutor m11401c() {
        return m11391b();
    }

    /* renamed from: d */
    public final void m11404d(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m11393c(this, action, 0L, 2, null);
    }

    /* renamed from: e */
    public final void m11407e(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        if (m11394f(action)) {
            m11391b().remove(action);
        } else {
            f10828g.m8983b(action);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m11390a(C3523pg c3523pg, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3523pg.m11400b(runnable, j);
    }

    /* renamed from: b */
    public static /* synthetic */ void m11392b(C3523pg c3523pg, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3523pg.m11403c(runnable, j);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11393c(C3523pg c3523pg, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3523pg.m11405d(runnable, j);
    }

    /* renamed from: d */
    public final void m11405d(Runnable action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        f10823b.postDelayed(action, j);
    }

    @Override // com.ironsource.InterfaceC3919zv
    /* renamed from: a */
    public void mo11396a(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m11393c(this, action, 0L, 2, null);
    }

    /* renamed from: b */
    public final void m11399b(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m11390a(this, action, 0L, 2, (Object) null);
    }

    /* renamed from: c */
    public final void m11402c(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m11392b(this, action, 0L, 2, null);
    }

    /* renamed from: d */
    public final boolean m11406d() {
        return f10824c;
    }

    @Override // com.ironsource.InterfaceC3919zv
    /* renamed from: a */
    public void mo11397a(Runnable action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        if (f10824c) {
            m11391b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f10828g.m8982a(action, j);
        }
    }

    /* renamed from: b */
    public final void m11400b(Runnable action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        f10826e.m8982a(action, j);
    }

    /* renamed from: c */
    public final void m11403c(Runnable action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        f10827f.m8982a(action, j);
    }

    /* renamed from: a */
    public final void m11398a(boolean z) {
        f10824c = z;
    }
}
