package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gm */
/* loaded from: classes2.dex */
public final class RunnableC1610gm implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f19382OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19383OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f19384OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC1684im f19385OooOoO0;

    public /* synthetic */ RunnableC1610gm(AbstractC1684im abstractC1684im, int i, int i2, int i3) {
        this.f19383OooOo0O = i3;
        this.f19384OooOo0o = i;
        this.f19382OooOo = i2;
        this.f19385OooOoO0 = abstractC1684im;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19383OooOo0O) {
            case 0:
                C1831mm c1831mm = ((TextureViewSurfaceTextureListenerC1647hm) this.f19385OooOoO0).f19824Oooo0OO;
                if (c1831mm != null) {
                    c1831mm.OooOO0(this.f19384OooOo0o, this.f19382OooOo);
                    break;
                }
                break;
            default:
                C1831mm c1831mm2 = ((TextureViewSurfaceTextureListenerC2312zm) this.f19385OooOoO0).f26196OooOoOO;
                if (c1831mm2 != null) {
                    c1831mm2.OooOO0(this.f19384OooOo0o, this.f19382OooOo);
                    break;
                }
                break;
        }
    }
}
