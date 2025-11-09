package com.ironsource;

import com.ironsource.C2633a7;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28459OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C2633a7 f28460OooOo0o;

    public /* synthetic */ OooO00o(C2633a7 c2633a7, int i) {
        this.f28459OooOo0O = i;
        this.f28460OooOo0o = c2633a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28459OooOo0O) {
            case 0:
                C2633a7.a.m4789a(this.f28460OooOo0o);
                break;
            default:
                C2633a7.b.m4791a(this.f28460OooOo0o);
                break;
        }
    }
}
