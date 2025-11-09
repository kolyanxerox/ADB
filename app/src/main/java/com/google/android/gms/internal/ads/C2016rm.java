package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.rm */
/* loaded from: classes2.dex */
public final class C2016rm extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: OoooOOO, reason: collision with root package name */
    public static final float[] f23886OoooOOO = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: OooOo, reason: collision with root package name */
    public final float[] f23887OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C1979qm f23888OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final float[] f23889OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final float[] f23890OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final float[] f23891OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final float[] f23892OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final float[] f23893OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final float[] f23894OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public float f23895OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public float f23896OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final Object f23897Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public SurfaceTexture f23898Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public float f23899Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int f23900Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public int f23901Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public SurfaceTexture f23902Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public int f23903Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public int f23904Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public int f23905Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final FloatBuffer f23906Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final CountDownLatch f23907Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public EGLSurface f23908OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public EGLDisplay f23909OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public EGL10 f23910OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public EGLContext f23911OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public volatile boolean f23912OoooOO0;
    public volatile boolean o000oOoO;

    public C2016rm(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f23906Oooo0oO = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f23886OoooOOO).position(0);
        this.f23889OooOo0o = new float[9];
        this.f23887OooOo = new float[9];
        this.f23891OooOoO0 = new float[9];
        this.f23890OooOoO = new float[9];
        this.f23892OooOoOO = new float[9];
        this.f23894OooOoo0 = new float[9];
        this.f23893OooOoo = new float[9];
        this.f23895OooOooO = Float.NaN;
        C1979qm c1979qm = new C1979qm(context);
        this.f23888OooOo0O = c1979qm;
        c1979qm.f23649OooOoo = this;
        this.f23907Oooo0oo = new CountDownLatch(1);
        this.f23897Oooo = new Object();
    }

    public static final int OooO(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        OooO0o0("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            OooO0o0("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            OooO0o0("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            OooO0o0("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                OooO0o0("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    public static final void OooO0o(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        float f26 = f9 * f24;
        fArr[7] = f26 + (f22 * fArr3[4]) + (f19 * f25);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    public static final void OooO0o0(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    public static final void OooO0oO(float f, float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void OooO0oo(float f, float[] fArr) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public final void OooO00o(int i, int i2) {
        synchronized (this.f23897Oooo) {
            this.f23901Oooo00o = i;
            this.f23900Oooo00O = i2;
            this.f23912OoooOO0 = true;
            this.f23897Oooo.notifyAll();
        }
    }

    public final void OooO0O0() {
        synchronized (this.f23897Oooo) {
            this.o000oOoO = true;
            this.f23902Oooo0O0 = null;
            this.f23897Oooo.notifyAll();
        }
    }

    public final void OooO0OO(float f, float f2) {
        int i = this.f23901Oooo00o;
        int i2 = this.f23900Oooo00O;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.f23896OooOooo -= (f * 1.7453293f) / f3;
        float f4 = this.f23899Oooo000 - ((f2 * 1.7453293f) / f3);
        this.f23899Oooo000 = f4;
        if (f4 < -1.5707964f) {
            this.f23899Oooo000 = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f23899Oooo000 = 1.5707964f;
        }
    }

    public final void OooO0Oo() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f23908OoooO;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f23910OoooO00.eglMakeCurrent(this.f23909OoooO0, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f23910OoooO00.eglDestroySurface(this.f23909OoooO0, this.f23908OoooO);
            this.f23908OoooO = null;
        }
        EGLContext eGLContext = this.f23911OoooO0O;
        if (eGLContext != null) {
            this.f23910OoooO00.eglDestroyContext(this.f23909OoooO0, eGLContext);
            this.f23911OoooO0O = null;
        }
        EGLDisplay eGLDisplay = this.f23909OoooO0;
        if (eGLDisplay != null) {
            this.f23910OoooO00.eglTerminate(eGLDisplay);
            this.f23909OoooO0 = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f23904Oooo0o++;
        synchronized (this.f23897Oooo) {
            this.f23897Oooo.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2016rm.run():void");
    }
}
