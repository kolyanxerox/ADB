package com.applovin.impl;

import com.applovin.impl.adview.C0972g;

/* loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f15745OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15746OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C0972g f15747OooOo0o;

    public /* synthetic */ o000O00(C0972g c0972g, Runnable runnable, int i) {
        this.f15746OooOo0O = i;
        this.f15747OooOo0o = c0972g;
        this.f15745OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15746OooOo0O) {
            case 0:
                AbstractC1265v1.m3443c(this.f15747OooOo0o, this.f15745OooOo);
                break;
            case 1:
                AbstractC1265v1.m3437b(this.f15747OooOo0o, this.f15745OooOo);
                break;
            default:
                AbstractC1265v1.m3429a(this.f15747OooOo0o, this.f15745OooOo);
                break;
        }
    }
}
