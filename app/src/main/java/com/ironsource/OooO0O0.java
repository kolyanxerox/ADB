package com.ironsource;

import com.ironsource.C3019ct;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3465ns f28461OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28462OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3710ts f28463OooOo0o;

    public /* synthetic */ OooO0O0(C3465ns c3465ns, InterfaceC3710ts interfaceC3710ts) {
        this.f28462OooOo0O = 2;
        this.f28461OooOo = c3465ns;
        this.f28463OooOo0o = interfaceC3710ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28462OooOo0O) {
            case 0:
                C2984bt.m8015b(this.f28463OooOo0o, this.f28461OooOo);
                break;
            case 1:
                C3019ct.m8221a(this.f28463OooOo0o, this.f28461OooOo);
                break;
            default:
                C3019ct.a.m8228a(this.f28461OooOo, this.f28463OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooO0O0(InterfaceC3710ts interfaceC3710ts, C3465ns c3465ns, int i) {
        this.f28462OooOo0O = i;
        this.f28463OooOo0o = interfaceC3710ts;
        this.f28461OooOo = c3465ns;
    }
}
