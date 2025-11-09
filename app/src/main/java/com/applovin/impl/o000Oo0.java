package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class o000Oo0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15767OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1265v1 f15768OooOo0o;

    public /* synthetic */ o000Oo0(AbstractC1265v1 abstractC1265v1, int i) {
        this.f15767OooOo0O = i;
        this.f15768OooOo0o = abstractC1265v1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15767OooOo0O) {
            case 0:
                this.f15768OooOo0o.m3451i();
                break;
            default:
                this.f15768OooOo0o.m3452j();
                break;
        }
    }
}
