package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gr */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1615gr implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19447OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1689ir f19448OooOo0o;

    public /* synthetic */ RunnableC1615gr(C1689ir c1689ir, int i) {
        this.f19447OooOo0O = i;
        this.f19448OooOo0o = c1689ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19447OooOo0O) {
            case 0:
                C1689ir c1689ir = this.f19448OooOo0o;
                c1689ir.getClass();
                c1689ir.f20094OooOo0o.execute(new RunnableC1615gr(c1689ir, 1));
                break;
            default:
                this.f19448OooOo0o.OooO0o();
                break;
        }
    }
}
