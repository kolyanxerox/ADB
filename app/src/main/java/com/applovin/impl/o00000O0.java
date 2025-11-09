package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class o00000O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15709OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1094m3 f15710OooOo0o;

    public /* synthetic */ o00000O0(C1094m3 c1094m3, int i) {
        this.f15709OooOo0O = i;
        this.f15710OooOo0o = c1094m3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15709OooOo0O) {
            case 0:
                this.f15710OooOo0o.m1496h();
                break;
            default:
                this.f15710OooOo0o.m1487d();
                break;
        }
    }
}
