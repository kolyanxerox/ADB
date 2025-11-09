package com.ironsource;

import android.content.Context;

/* renamed from: com.ironsource.lu */
/* loaded from: classes2.dex */
public final class C3343lu implements InterfaceC3213i8 {

    /* renamed from: d */
    public static final a f9434d = new a(null);

    /* renamed from: e */
    public static final int f9435e = -1;

    /* renamed from: f */
    public static final long f9436f = -1;

    /* renamed from: a */
    private final Context f9437a;

    /* renamed from: b */
    private final String f9438b;

    /* renamed from: c */
    private final InterfaceC3153gi f9439c;

    /* renamed from: com.ironsource.lu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3343lu(Context context, String baseName, InterfaceC3153gi sdkSharedPref) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(baseName, "baseName");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkSharedPref, "sdkSharedPref");
        this.f9437a = context;
        this.f9438b = baseName;
        this.f9439c = sdkSharedPref;
    }

    /* renamed from: a */
    private final Integer m9892a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: b */
    public Long mo9296b(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        return m9893a(Long.valueOf(this.f9439c.mo8978b(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".pacing_last_show_time")).m10889a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: c */
    public Integer mo9298c(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        return m9892a(Integer.valueOf(this.f9439c.mo8977b(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".show_count_show_counter")).m10889a(), -1)));
    }

    public /* synthetic */ C3343lu(Context context, String str, InterfaceC3153gi interfaceC3153gi, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(context, str, (i & 4) != 0 ? new C3342lt() : interfaceC3153gi);
    }

    /* renamed from: a */
    private final Long m9893a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: a */
    public Long mo9293a(String identifier) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        return m9893a(Long.valueOf(this.f9439c.mo8978b(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".show_count_threshold")).m10889a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: b */
    public void mo9297b(String identifier, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f9439c.mo8976a(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".pacing_last_show_time")).m10889a(), j);
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: a */
    public void mo9294a(String identifier, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f9439c.mo8975a(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".show_count_show_counter")).m10889a(), i);
    }

    @Override // com.ironsource.InterfaceC3213i8
    /* renamed from: a */
    public void mo9295a(String identifier, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(identifier, "identifier");
        this.f9439c.mo8976a(this.f9437a, new C3432mu(identifier, OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f9438b, ".show_count_threshold")).m10889a(), j);
    }
}
