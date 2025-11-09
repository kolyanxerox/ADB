package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15585OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0995c4 f15586OooOo0o;

    public /* synthetic */ OooOO0O(AbstractC0995c4 abstractC0995c4, int i) {
        this.f15585OooOo0O = i;
        this.f15586OooOo0o = abstractC0995c4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15585OooOo0O) {
            case 0:
                this.f15586OooOo0o.m461b();
                break;
            case 1:
                this.f15586OooOo0o.m463c();
                break;
            default:
                this.f15586OooOo0o.m464d();
                break;
        }
    }
}
