package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ky */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1769ky implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC2181w2 f20712OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20713OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1917oy f20714OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1769ky(C1917oy c1917oy, InterfaceViewOnClickListenerC1881nz interfaceViewOnClickListenerC1881nz, int i) {
        this.f20713OooOo0O = i;
        switch (i) {
            case 1:
                this.f20714OooOo0o = c1917oy;
                this.f20712OooOo = (AbstractBinderC2181w2) interfaceViewOnClickListenerC1881nz;
                break;
            default:
                this.f20714OooOo0o = c1917oy;
                this.f20712OooOo = (AbstractBinderC2181w2) interfaceViewOnClickListenerC1881nz;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.nz, com.google.android.gms.internal.ads.w2] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20713OooOo0O) {
            case 0:
                this.f20714OooOo0o.OooOOO(this.f20712OooOo);
                break;
            default:
                this.f20714OooOo0o.OooOOOO(this.f20712OooOo);
                break;
        }
    }
}
