package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xm */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2238xm implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f25644OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25645OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f25646OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f25647OooOoO0;

    public /* synthetic */ RunnableC2238xm(Object obj, boolean z, long j, int i) {
        this.f25645OooOo0O = i;
        this.f25647OooOoO0 = obj;
        this.f25646OooOo0o = z;
        this.f25644OooOo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25645OooOo0O) {
            case 0:
                ((TextureViewSurfaceTextureListenerC2312zm) this.f25647OooOoO0).f26193OooOo.Oooo0O0(this.f25644OooOo, this.f25646OooOo0o);
                break;
            case 1:
                ((InterfaceC1722jo) this.f25647OooOoO0).Oooo0O0(this.f25644OooOo, this.f25646OooOo0o);
                break;
            default:
                ((AbstractC1870no) this.f25647OooOoO0).f21527OooOo0O.Oooo0O0(this.f25644OooOo, this.f25646OooOo0o);
                break;
        }
    }
}
