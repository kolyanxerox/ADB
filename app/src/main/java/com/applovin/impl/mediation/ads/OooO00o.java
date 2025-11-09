package com.applovin.impl.mediation.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15678OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f15679OooOo0o;

    public /* synthetic */ OooO00o(MaxAdViewImpl maxAdViewImpl, int i) {
        this.f15678OooOo0O = i;
        this.f15679OooOo0o = maxAdViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15678OooOo0O) {
            case 0:
                this.f15679OooOo0o.m1603g();
                break;
            default:
                this.f15679OooOo0o.m1592c();
                break;
        }
    }
}
