package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.co */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1465co implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18019OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1538eo f18020OooOo0o;

    public /* synthetic */ RunnableC1465co(C1538eo c1538eo, int i) {
        this.f18019OooOo0O = i;
        this.f18020OooOo0o = c1538eo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18019OooOo0O) {
            case 0:
                C1831mm c1831mm = this.f18020OooOo0o.f18634OooOoO;
                if (c1831mm != null) {
                    c1831mm.OooO0oO();
                    break;
                }
                break;
            case 1:
                C1538eo c1538eo = this.f18020OooOo0o;
                C1831mm c1831mm2 = c1538eo.f18634OooOoO;
                if (c1831mm2 != null) {
                    if (!c1538eo.f18636OooOoOO) {
                        c1831mm2.OooO0oo();
                        c1538eo.f18636OooOoOO = true;
                    }
                    c1538eo.f18634OooOoO.OooO0o();
                    break;
                }
                break;
            default:
                C1831mm c1831mm3 = this.f18020OooOo0o.f18634OooOoO;
                if (c1831mm3 != null) {
                    c1831mm3.OooO0o0();
                    break;
                }
                break;
        }
    }
}
