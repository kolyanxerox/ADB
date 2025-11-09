package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.wm */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2201wm implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25329OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2312zm f25330OooOo0o;

    public /* synthetic */ RunnableC2201wm(TextureViewSurfaceTextureListenerC2312zm textureViewSurfaceTextureListenerC2312zm, int i) {
        this.f25329OooOo0O = i;
        this.f25330OooOo0o = textureViewSurfaceTextureListenerC2312zm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25329OooOo0O) {
            case 0:
                C1831mm c1831mm = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm != null) {
                    c1831mm.OooO0oo();
                    break;
                }
                break;
            case 1:
                C1831mm c1831mm2 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm2 != null) {
                    c1831mm2.OooO0o();
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC2312zm textureViewSurfaceTextureListenerC2312zm = this.f25330OooOo0o;
                C2164vm c2164vm = textureViewSurfaceTextureListenerC2312zm.f20062OooOo0o;
                float f = c2164vm.f24998OooO0OO ? c2164vm.f25001OooO0o0 ? 0.0f : c2164vm.f25000OooO0o : 0.0f;
                C2313zn c2313zn = textureViewSurfaceTextureListenerC2312zm.f26197OooOoo;
                if (c2313zn == null) {
                    zzo.zzj("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        b61 b61Var = c2313zn.f26219OooOoo0;
                        if (b61Var != null) {
                            b61Var.f17421OooOoO0.OooO00o();
                            w41 w41Var = b61Var.f17420OooOo;
                            w41Var.OooOo00();
                            float fMax = Math.max(0.0f, Math.min(f, 1.0f));
                            if (w41Var.f25217OooooOo != fMax) {
                                w41Var.f25217OooooOo = fMax;
                                w41Var.o0000O(1, 2, Float.valueOf(fMax * w41Var.f25204OoooO0.f18783OooO0o0));
                                qv0 qv0Var = new qv0(17);
                                t00 t00Var = w41Var.f25195Oooo00O;
                                t00Var.OooO0OO(22, qv0Var);
                                t00Var.OooO0O0();
                                break;
                            } else {
                                break;
                            }
                        }
                    } catch (IOException e) {
                        zzo.zzk("", e);
                        return;
                    }
                }
                break;
            case 3:
                C1831mm c1831mm3 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm3 != null) {
                    c1831mm3.OooO();
                    break;
                }
                break;
            case 4:
                C1831mm c1831mm4 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm4 != null) {
                    c1831mm4.OooO0o0();
                    break;
                }
                break;
            case 5:
                C1831mm c1831mm5 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm5 != null) {
                    RunnableC1794lm runnableC1794lm = c1831mm5.f21286OooOoO;
                    runnableC1794lm.f20903OooOo0o = false;
                    pj0 pj0Var = zzs.zza;
                    pj0Var.removeCallbacks(runnableC1794lm);
                    pj0Var.postDelayed(runnableC1794lm, 250L);
                    pj0Var.post(new RunnableC1757km(c1831mm5, 1));
                    break;
                }
                break;
            case 6:
                C1831mm c1831mm6 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm6 != null) {
                    c1831mm6.OooO0Oo();
                    break;
                }
                break;
            default:
                C1831mm c1831mm7 = this.f25330OooOo0o.f26196OooOoOO;
                if (c1831mm7 != null) {
                    c1831mm7.OooO0oO();
                    break;
                }
                break;
        }
    }
}
