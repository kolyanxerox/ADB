package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes2.dex */
public final class t41 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ w41 f24239OooOo0O;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        w41 w41Var = this.f24239OooOo0O;
        w41Var.o0000OO0(surface);
        w41Var.f25213Ooooo00 = surface;
        w41Var.o000OO(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        w41 w41Var = this.f24239OooOo0O;
        w41Var.o0000OO0(null);
        w41Var.o000OO(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f24239OooOo0O.o000OO(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f24239OooOo0O.o000OO(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f24239OooOo0O.o000OO(0, 0);
    }
}
