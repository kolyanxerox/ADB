package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.sw */
/* loaded from: classes2.dex */
public final class RunnableC2063sw implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final int[] f24171OooOoo0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: OooOo, reason: collision with root package name */
    public EGLDisplay f24172OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Handler f24173OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f24174OooOo0o = new int[1];

    /* renamed from: OooOoO, reason: collision with root package name */
    public EGLSurface f24175OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public EGLContext f24176OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public SurfaceTexture f24177OooOoOO;

    public RunnableC2063sw(Handler handler) {
        this.f24173OooOo0O = handler;
    }

    public final void OooO00o(int i) throws C1510dx {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        ze0.OooOOOo("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        ze0.OooOOOo("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        this.f24172OooOo = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f24171OooOoo0, 0, eGLConfigArr, 0, 1, iArr2, 0);
        ze0.OooOOOo(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f24172OooOo, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        ze0.OooOOOo("eglCreateContext failed", eGLContextEglCreateContext != null);
        this.f24176OooOoO0 = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f24172OooOo;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            ze0.OooOOOo("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        ze0.OooOOOo("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        this.f24175OooOoO = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = this.f24174OooOo0o;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C1510dx(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f24177OooOoOO = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void OooO0O0() {
        this.f24173OooOo0O.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f24177OooOoOO;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f24174OooOo0o, 0);
            }
            EGLDisplay eGLDisplay = this.f24172OooOo;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f24172OooOo;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f24175OooOoO;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f24172OooOo, this.f24175OooOoO);
            }
            EGLContext eGLContext = this.f24176OooOoO0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f24172OooOo, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f24172OooOo;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f24172OooOo);
            }
            this.f24172OooOo = null;
            this.f24176OooOoO0 = null;
            this.f24175OooOoO = null;
            this.f24177OooOoOO = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f24172OooOo;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f24172OooOo;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f24175OooOoO;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f24172OooOo, this.f24175OooOoO);
            }
            EGLContext eGLContext2 = this.f24176OooOoO0;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f24172OooOo, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f24172OooOo;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f24172OooOo);
            }
            this.f24172OooOo = null;
            this.f24176OooOoO0 = null;
            this.f24175OooOoO = null;
            this.f24177OooOoOO = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f24173OooOo0O.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f24177OooOoOO;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
