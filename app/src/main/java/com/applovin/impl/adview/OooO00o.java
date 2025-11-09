package com.applovin.impl.adview;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15607OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C0962a f15608OooOo0o;

    public /* synthetic */ OooO00o(C0962a c0962a, int i) {
        this.f15607OooOo0O = i;
        this.f15608OooOo0o = c0962a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15607OooOo0O) {
            case 0:
                this.f15608OooOo0o.m193s();
                break;
            case 1:
                this.f15608OooOo0o.m190p();
                break;
            case 2:
                this.f15608OooOo0o.m192r();
                break;
            case 3:
                this.f15608OooOo0o.m191q();
                break;
            case 4:
                this.f15608OooOo0o.m194t();
                break;
            default:
                this.f15608OooOo0o.m189o();
                break;
        }
    }
}
