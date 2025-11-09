package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15587OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1002d1 f15588OooOo0o;

    public /* synthetic */ OooOOO(C1002d1 c1002d1, int i) {
        this.f15587OooOo0O = i;
        this.f15588OooOo0o = c1002d1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15587OooOo0O) {
            case 0:
                this.f15588OooOo0o.m539e();
                break;
            case 1:
                this.f15588OooOo0o.m544j();
                break;
            default:
                this.f15588OooOo0o.m543i();
                break;
        }
    }
}
