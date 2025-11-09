package com.ironsource;

import android.content.Context;

/* renamed from: com.ironsource.jt */
/* loaded from: classes2.dex */
public final class C3268jt implements InterfaceC3199ht {

    /* renamed from: a */
    private final InterfaceC3153gi f9173a;

    /* renamed from: com.ironsource.jt$a */
    public static final class a {

        /* renamed from: a */
        public static final a f9174a = new a();

        /* renamed from: b */
        public static final String f9175b = "sessionNumber";

        /* renamed from: c */
        public static final String f9176c = "firstSessionTimestamp";

        private a() {
        }
    }

    public C3268jt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC3570qs
    /* renamed from: a */
    public long mo9538a(Context context, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return this.f9173a.mo8978b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC3303kt
    /* renamed from: b */
    public int mo9540b(Context context, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return this.f9173a.mo8977b(context, a.f9175b, i);
    }

    public C3268jt(InterfaceC3153gi sdkSharedPref) {
        kotlin.jvm.internal.OooOo.OooO0o0(sdkSharedPref, "sdkSharedPref");
        this.f9173a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC3303kt
    /* renamed from: a */
    public void mo9539a(Context context, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f9173a.mo8975a(context, a.f9175b, i);
    }

    @Override // com.ironsource.InterfaceC3570qs
    /* renamed from: b */
    public void mo9541b(Context context, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        this.f9173a.mo8976a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ C3268jt(InterfaceC3153gi interfaceC3153gi, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? new C3342lt() : interfaceC3153gi);
    }
}
