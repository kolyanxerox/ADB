package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15750OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15751OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1265v1 f15752OooOo0o;

    public /* synthetic */ o000O00O(AbstractC1265v1 abstractC1265v1, String str, int i) {
        this.f15751OooOo0O = i;
        this.f15752OooOo0o = abstractC1265v1;
        this.f15750OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15751OooOo0O) {
            case 0:
                this.f15752OooOo0o.m3439b(this.f15750OooOo);
                break;
            default:
                this.f15752OooOo0o.m3444c(this.f15750OooOo);
                break;
        }
    }
}
