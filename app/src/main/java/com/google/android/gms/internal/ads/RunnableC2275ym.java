package com.google.android.gms.internal.ads;

import com.ironsource.C3912zo;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* renamed from: com.google.android.gms.internal.ads.ym */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2275ym implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f25941OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25942OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2312zm f25943OooOo0o;

    public /* synthetic */ RunnableC2275ym(TextureViewSurfaceTextureListenerC2312zm textureViewSurfaceTextureListenerC2312zm, String str, int i) {
        this.f25942OooOo0O = i;
        this.f25943OooOo0o = textureViewSurfaceTextureListenerC2312zm;
        this.f25941OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25942OooOo0O) {
            case 0:
                C1831mm c1831mm = this.f25943OooOo0o.f26196OooOoOO;
                if (c1831mm != null) {
                    c1831mm.OooO0OO(Constants.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", this.f25941OooOo);
                    break;
                }
                break;
            default:
                C1831mm c1831mm2 = this.f25943OooOo0o.f26196OooOoOO;
                if (c1831mm2 != null) {
                    c1831mm2.OooO0OO(C3912zo.a.f13038g, "what", "ExoPlayerAdapter error", "extra", this.f25941OooOo);
                    break;
                }
                break;
        }
    }
}
