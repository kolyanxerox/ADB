package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.od */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1897od implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f22971OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1822md f22972OooOo0o;

    public /* synthetic */ RunnableC1897od(C1822md c1822md, int i) {
        this.f22971OooOo0O = i;
        this.f22972OooOo0o = c1822md;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22971OooOo0O) {
            case 0:
                this.f22972OooOo0o.f21202OooOo0O.destroy();
                break;
            case 1:
                this.f22972OooOo0o.f21202OooOo0O.destroy();
                break;
            default:
                C1895ob c1895ob = AbstractC2005rb.f23829OooOOOO;
                C1822md c1822md = this.f22972OooOo0o;
                c1822md.OooOO0("/result", c1895ob);
                c1822md.f21202OooOo0O.destroy();
                break;
        }
    }
}
