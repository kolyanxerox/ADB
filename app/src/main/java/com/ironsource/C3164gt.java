package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC3118fi;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* renamed from: com.ironsource.gt */
/* loaded from: classes2.dex */
public final class C3164gt implements InterfaceC3118fi, InterfaceC3118fi.a {

    /* renamed from: a */
    private final InterfaceC3199ht f8760a;

    /* renamed from: b */
    private final InterfaceC3882ys f8761b;

    /* renamed from: c */
    private final InterfaceC3621s9 f8762c;

    /* renamed from: d */
    private int f8763d;

    /* renamed from: e */
    private long f8764e;

    /* renamed from: com.ironsource.gt$a */
    public static final class a {

        /* renamed from: a */
        public static final a f8765a = new a();

        /* renamed from: b */
        public static final int f8766b = -1;

        /* renamed from: c */
        public static final int f8767c = 0;

        /* renamed from: d */
        public static final long f8768d = -1;

        private a() {
        }
    }

    public C3164gt(InterfaceC3199ht storage, InterfaceC3882ys initResponseStorage, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(storage, "storage");
        kotlin.jvm.internal.OooOo.OooO0o0(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f8760a = storage;
        this.f8761b = initResponseStorage;
        this.f8762c = currentTimeProvider;
        this.f8763d = -1;
        this.f8764e = -1L;
    }

    /* renamed from: b */
    private final int m9016b(Context context, InterfaceC3199ht interfaceC3199ht) {
        int iMo9540b = interfaceC3199ht.mo9540b(context, 0) + 1;
        interfaceC3199ht.mo9539a(context, iMo9540b);
        return iMo9540b;
    }

    @Override // com.ironsource.InterfaceC3118fi
    /* renamed from: a */
    public long mo8699a() {
        return this.f8764e;
    }

    @Override // com.ironsource.InterfaceC3118fi
    /* renamed from: c */
    public int mo8701c() {
        return this.f8763d;
    }

    public /* synthetic */ C3164gt(InterfaceC3199ht interfaceC3199ht, InterfaceC3882ys interfaceC3882ys, InterfaceC3621s9 interfaceC3621s9, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(interfaceC3199ht, (i & 2) != 0 ? new C3916zs() : interfaceC3882ys, (i & 4) != 0 ? new InterfaceC3621s9.a() : interfaceC3621s9);
    }

    /* renamed from: a */
    private final long m9015a(Context context, InterfaceC3199ht interfaceC3199ht) {
        long jMo9538a = interfaceC3199ht.mo9538a(context, -1L);
        if (this.f8761b.mo13219a(context) || jMo9538a != -1) {
            return jMo9538a;
        }
        long jMo11889a = this.f8762c.mo11889a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jMo11889a);
        interfaceC3199ht.mo9541b(context, jMo11889a);
        return jMo11889a;
    }

    @Override // com.ironsource.InterfaceC3118fi
    /* renamed from: b */
    public String mo8700b() {
        String sessionId = IronSourceUtils.getSessionId();
        kotlin.jvm.internal.OooOo.OooO0Oo(sessionId, "getSessionId()");
        return sessionId;
    }

    @Override // com.ironsource.InterfaceC3118fi.a
    /* renamed from: a */
    public void mo8702a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f8763d = m9016b(context, this.f8760a);
        this.f8764e = m9015a(context, this.f8760a);
    }
}
