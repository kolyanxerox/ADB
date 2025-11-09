package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* renamed from: com.google.android.gms.internal.ads.fm */
/* loaded from: classes2.dex */
public final class RunnableC1573fm implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18969OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1647hm f18970OooOo0o;

    public /* synthetic */ RunnableC1573fm(TextureViewSurfaceTextureListenerC1647hm textureViewSurfaceTextureListenerC1647hm, int i) {
        this.f18969OooOo0O = i;
        this.f18970OooOo0o = textureViewSurfaceTextureListenerC1647hm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18969OooOo0O) {
            case 0:
                C1831mm c1831mm = this.f18970OooOo0o.f19824Oooo0OO;
                if (c1831mm != null) {
                    c1831mm.OooO0Oo();
                    break;
                }
                break;
            case 1:
                C1831mm c1831mm2 = this.f18970OooOo0o.f19824Oooo0OO;
                if (c1831mm2 != null) {
                    RunnableC1794lm runnableC1794lm = c1831mm2.f21286OooOoO;
                    runnableC1794lm.f20903OooOo0o = false;
                    pj0 pj0Var = zzs.zza;
                    pj0Var.removeCallbacks(runnableC1794lm);
                    pj0Var.postDelayed(runnableC1794lm, 250L);
                    pj0Var.post(new RunnableC1757km(c1831mm2, 1));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC1647hm textureViewSurfaceTextureListenerC1647hm = this.f18970OooOo0o;
                C1831mm c1831mm3 = textureViewSurfaceTextureListenerC1647hm.f19824Oooo0OO;
                if (c1831mm3 != null) {
                    c1831mm3.OooO0o0();
                    textureViewSurfaceTextureListenerC1647hm.f19824Oooo0OO.OooO();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC1647hm textureViewSurfaceTextureListenerC1647hm2 = this.f18970OooOo0o;
                C1831mm c1831mm4 = textureViewSurfaceTextureListenerC1647hm2.f19824Oooo0OO;
                if (c1831mm4 != null) {
                    if (!textureViewSurfaceTextureListenerC1647hm2.f19826Oooo0o0) {
                        c1831mm4.OooO0oo();
                        textureViewSurfaceTextureListenerC1647hm2.f19826Oooo0o0 = true;
                    }
                    textureViewSurfaceTextureListenerC1647hm2.f19824Oooo0OO.OooO0o();
                    break;
                }
                break;
            default:
                C1831mm c1831mm5 = this.f18970OooOo0o.f19824Oooo0OO;
                if (c1831mm5 != null) {
                    c1831mm5.OooO0o0();
                    break;
                }
                break;
        }
    }
}
