package com.ironsource;

import com.ironsource.C2984bt;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28457OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3535ps f28458OooOo0o;

    public /* synthetic */ OooO(C3535ps c3535ps, int i) {
        this.f28457OooOo0O = i;
        this.f28458OooOo0o = c3535ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28457OooOo0O) {
            case 0:
                C2984bt.m8019c(this.f28458OooOo0o);
                break;
            default:
                C2984bt.b.m8028b(this.f28458OooOo0o);
                break;
        }
    }
}
