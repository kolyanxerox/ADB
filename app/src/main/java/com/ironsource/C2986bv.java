package com.ironsource;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.bv */
/* loaded from: classes2.dex */
public final class C2986bv {

    /* renamed from: a */
    public static final C2986bv f7654a = new C2986bv();

    /* renamed from: b */
    private static final oo00o.OooO0OO f7655b = o0OOO0.OooO0oo(a.f7656a);

    /* renamed from: com.ironsource.bv$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f7656a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a */
        public final C3341ls invoke() {
            return new C3341ls(16, null, null, 6, null);
        }
    }

    private C2986bv() {
    }

    /* renamed from: a */
    private final C3341ls m8031a() {
        return (C3341ls) f7655b.getValue();
    }

    /* renamed from: a */
    public static /* synthetic */ void m8032a(C2986bv c2986bv, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c2986bv.m8034a(runnable, j);
    }

    /* renamed from: a */
    public final void m8033a(Runnable action) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m8032a(this, action, 0L, 2, null);
    }

    /* renamed from: a */
    public final void m8034a(Runnable action, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(action, "action");
        m8031a().schedule(action, j, TimeUnit.MILLISECONDS);
    }
}
