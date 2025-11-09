package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15781OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1041h0 f15782OooOo0o;

    public /* synthetic */ o00Ooo(C1041h0 c1041h0, int i) {
        this.f15781OooOo0O = i;
        this.f15782OooOo0o = c1041h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15781OooOo0O) {
            case 0:
                this.f15782OooOo0o.m831e();
                break;
            case 1:
                this.f15782OooOo0o.m833f();
                break;
            case 2:
                this.f15782OooOo0o.m821a();
                break;
            default:
                this.f15782OooOo0o.m828d();
                break;
        }
    }
}
