package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC3918zu;

/* renamed from: com.ironsource.te */
/* loaded from: classes2.dex */
public final class C3696te implements InterfaceC3918zu {

    /* renamed from: a */
    private final a f12048a;

    /* renamed from: com.ironsource.te$a */
    public interface a {
        /* renamed from: a */
        void mo12423a(Runnable runnable, long j);
    }

    /* renamed from: com.ironsource.te$b */
    public static final class b extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3918zu.a f12049a;

        /* renamed from: b */
        final /* synthetic */ Runnable f12050b;

        public b(InterfaceC3918zu.a aVar, Runnable runnable) {
            this.f12049a = aVar;
            this.f12050b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            if (this.f12049a.m13428b()) {
                return;
            }
            this.f12050b.run();
        }
    }

    public C3696te() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    private final AbstractRunnableC3302ks m12421a(InterfaceC3918zu.a aVar, Runnable runnable) {
        return new b(aVar, runnable);
    }

    public C3696te(a handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
        this.f12048a = handler;
    }

    @Override // com.ironsource.InterfaceC3918zu
    /* renamed from: a */
    public InterfaceC3918zu.a mo12422a(Runnable task, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        InterfaceC3918zu.a aVar = new InterfaceC3918zu.a();
        this.f12048a.mo12423a(m12421a(aVar, task), o00O0oOO.OooOO0O.OooO0Oo(j));
        return aVar;
    }

    public /* synthetic */ C3696te(a aVar, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? C3731ue.m12670a(new Handler(Looper.getMainLooper())) : aVar);
    }
}
