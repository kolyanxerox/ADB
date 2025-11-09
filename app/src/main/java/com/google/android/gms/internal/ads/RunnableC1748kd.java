package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kd */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1748kd implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f20483OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20484OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1822md f20485OooOo0o;

    public /* synthetic */ RunnableC1748kd(C1822md c1822md, String str, int i) {
        this.f20484OooOo0O = i;
        this.f20485OooOo0o = c1822md;
        this.f20483OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20484OooOo0O) {
            case 0:
                this.f20485OooOo0o.f21202OooOo0O.loadUrl(this.f20483OooOo);
                break;
            case 1:
                this.f20485OooOo0o.f21202OooOo0O.zza(this.f20483OooOo);
                break;
            case 2:
                this.f20485OooOo0o.f21202OooOo0O.loadData(this.f20483OooOo, "text/html", "UTF-8");
                break;
            default:
                this.f20485OooOo0o.f21202OooOo0O.loadData(this.f20483OooOo, "text/html", "UTF-8");
                break;
        }
    }
}
