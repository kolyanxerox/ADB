package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class rb1 extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final qb1 zzd;
    private boolean zze;

    public /* synthetic */ rb1(qb1 qb1Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.zzd = qb1Var;
        this.zza = z;
    }

    public static rb1 OooO00o(Context context, boolean z) {
        boolean z2 = false;
        af0.OooooO0(!z || OooO0O0(context));
        qb1 qb1Var = new qb1("ExoPlayer:PlaceholderSurface");
        int i = z ? zzb : 0;
        qb1Var.start();
        Handler handler = new Handler(qb1Var.getLooper(), qb1Var);
        qb1Var.f23575OooOo0o = handler;
        qb1Var.f23574OooOo0O = new RunnableC2063sw(handler);
        synchronized (qb1Var) {
            qb1Var.f23575OooOo0o.obtainMessage(1, i, 0).sendToTarget();
            while (qb1Var.f23576OooOoO == null && qb1Var.f23577OooOoO0 == null && qb1Var.f23573OooOo == null) {
                try {
                    qb1Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = qb1Var.f23577OooOoO0;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = qb1Var.f23573OooOo;
        if (error != null) {
            throw error;
        }
        rb1 rb1Var = qb1Var.f23576OooOoO;
        rb1Var.getClass();
        return rb1Var;
    }

    public static synchronized boolean OooO0O0(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!zzc) {
                int i2 = i80.f19994OooO00o;
                if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(i80.f19996OooO0OO) || "XT1650".equals(i80.f19997OooO0Oo))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                zzb = i;
                zzc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    Handler handler = this.zzd.f23575OooOo0o;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
