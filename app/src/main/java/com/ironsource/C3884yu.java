package com.ironsource;

import android.os.Handler;

/* renamed from: com.ironsource.yu */
/* loaded from: classes2.dex */
public final class C3884yu implements InterfaceC3196hq {

    /* renamed from: a */
    private final Handler f12780a;

    /* renamed from: b */
    private final long f12781b;

    /* renamed from: c */
    private long f12782c;

    /* renamed from: d */
    private long f12783d;

    /* renamed from: e */
    private long f12784e;

    /* renamed from: f */
    private final b f12785f;

    /* renamed from: com.ironsource.yu$a */
    public static final class a {

        /* renamed from: a */
        private final long f12786a;

        /* renamed from: b */
        private final long f12787b;

        public a(long j, long j2) {
            this.f12786a = j;
            this.f12787b = j2;
        }

        /* renamed from: a */
        public final long m13228a() {
            return this.f12786a;
        }

        /* renamed from: b */
        public final long m13230b() {
            return this.f12787b;
        }

        /* renamed from: c */
        public final long m13231c() {
            return this.f12786a;
        }

        /* renamed from: d */
        public final long m13232d() {
            return this.f12787b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12786a == aVar.f12786a && this.f12787b == aVar.f12787b;
        }

        public int hashCode() {
            return Long.hashCode(this.f12787b) + (Long.hashCode(this.f12786a) * 31);
        }

        public String toString() {
            return "Status(remainingTime=" + this.f12786a + ", timePassed=" + this.f12787b + ')';
        }

        /* renamed from: a */
        public final a m13229a(long j, long j2) {
            return new a(j, j2);
        }

        /* renamed from: a */
        public static /* synthetic */ a m13227a(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.f12786a;
            }
            if ((i & 2) != 0) {
                j2 = aVar.f12787b;
            }
            return aVar.m13229a(j, j2);
        }
    }

    /* renamed from: com.ironsource.yu$b */
    public static final class b extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ Runnable f12788a;

        public b(Runnable runnable) {
            this.f12788a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f12788a.run();
        }
    }

    public C3884yu(Handler handler, Runnable task, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        this.f12780a = handler;
        this.f12781b = j;
        this.f12785f = new b(task);
        this.f12784e = m13224c();
        mo9224a();
    }

    /* renamed from: c */
    private final long m13224c() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    private final long m13225d() {
        return this.f12781b - this.f12782c;
    }

    @Override // com.ironsource.InterfaceC3196hq
    /* renamed from: a */
    public a mo9224a() {
        if (m13226e()) {
            this.f12783d = m13224c();
            this.f12784e = 0L;
            this.f12780a.postDelayed(this.f12785f, m13225d());
        }
        return new a(m13225d(), this.f12782c);
    }

    @Override // com.ironsource.InterfaceC3196hq
    /* renamed from: b */
    public a mo9225b() {
        if (!m13226e()) {
            long jM13224c = m13224c();
            this.f12784e = jM13224c;
            this.f12782c = (jM13224c - this.f12783d) + this.f12782c;
            this.f12780a.removeCallbacks(this.f12785f);
        }
        return new a(m13225d(), this.f12782c);
    }

    /* renamed from: e */
    public final boolean m13226e() {
        return this.f12784e > 0;
    }
}
