package com.ironsource;

import com.ironsource.C3019ct;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3535ps f28464OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28465OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3710ts f28466OooOo0o;

    public /* synthetic */ OooO0OO(InterfaceC3710ts interfaceC3710ts, C3535ps c3535ps, int i) {
        this.f28465OooOo0O = i;
        this.f28466OooOo0o = interfaceC3710ts;
        this.f28464OooOo = c3535ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28465OooOo0O) {
            case 0:
                C2984bt.m8016b(this.f28466OooOo0o, this.f28464OooOo);
                break;
            default:
                C3019ct.a.m8229a(this.f28466OooOo0o, this.f28464OooOo);
                break;
        }
    }
}
