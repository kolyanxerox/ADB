package com.ironsource;

/* renamed from: com.ironsource.iq */
/* loaded from: classes2.dex */
public abstract class AbstractC3231iq {

    /* renamed from: a */
    private InterfaceC3265jq f9044a;

    /* renamed from: b */
    private long f9045b;

    /* renamed from: c */
    private boolean f9046c;

    public AbstractC3231iq() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public final InterfaceC3265jq m9373a() {
        return this.f9044a;
    }

    /* renamed from: b */
    public abstract String mo7852b();

    /* renamed from: c */
    public final long m9376c() {
        return this.f9045b;
    }

    /* renamed from: d */
    public final boolean m9377d() {
        return this.f9046c;
    }

    public AbstractC3231iq(boolean z) {
        this.f9046c = z;
    }

    /* renamed from: a */
    public final void m9374a(InterfaceC3265jq interfaceC3265jq) {
        this.f9044a = interfaceC3265jq;
    }

    public /* synthetic */ AbstractC3231iq(boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: a */
    public final void m9375a(boolean z) {
        this.f9046c = z;
        if (!z) {
            InterfaceC3265jq interfaceC3265jq = this.f9044a;
            if (interfaceC3265jq != null) {
                interfaceC3265jq.mo9535b(this);
                return;
            }
            return;
        }
        this.f9045b = System.currentTimeMillis();
        InterfaceC3265jq interfaceC3265jq2 = this.f9044a;
        if (interfaceC3265jq2 != null) {
            interfaceC3265jq2.mo9534a(this);
        }
    }
}
