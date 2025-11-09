package com.ironsource;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C3780vs f28475OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28476OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f28477OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3710ts f28478OooOoO0;

    public /* synthetic */ OooOOO0(Context context, C3780vs c3780vs, InterfaceC3710ts interfaceC3710ts, int i) {
        this.f28476OooOo0O = i;
        this.f28477OooOo0o = context;
        this.f28475OooOo = c3780vs;
        this.f28478OooOoO0 = interfaceC3710ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28476OooOo0O) {
            case 0:
                C3019ct.m8224d(this.f28477OooOo0o, this.f28475OooOo, this.f28478OooOoO0);
                break;
            default:
                C3019ct.m8222b(this.f28477OooOo0o, this.f28475OooOo, this.f28478OooOoO0);
                break;
        }
    }
}
