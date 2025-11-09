package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class s71 implements z71 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final a81 f24027OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final MediaCodec f24028OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final w71 f24029OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f24030OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final dx0 f24031OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f24032OooOoOO = 0;

    public /* synthetic */ s71(MediaCodec mediaCodec, HandlerThread handlerThread, a81 a81Var, dx0 dx0Var) {
        this.f24028OooOo0O = mediaCodec;
        this.f24029OooOo0o = new w71(handlerThread);
        this.f24027OooOo = a81Var;
        this.f24031OooOoO0 = dx0Var;
    }

    public static void OooO0o(s71 s71Var, MediaFormat mediaFormat, Surface surface, int i) {
        dx0 dx0Var;
        LoudnessCodecController loudnessCodecController;
        w71 w71Var = s71Var.f24029OooOo0o;
        af0.OooooO0(w71Var.f25250OooO0OO == null);
        HandlerThread handlerThread = w71Var.f25249OooO0O0;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = s71Var.f24028OooOo0O;
        mediaCodec.setCallback(w71Var, handler);
        w71Var.f25250OooO0OO = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        s71Var.f24027OooOo.zzh();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (i80.f19994OooO00o >= 35 && (dx0Var = s71Var.f24031OooOoO0) != null && ((loudnessCodecController = (LoudnessCodecController) dx0Var.f18417OooOo) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            af0.OooooO0(((HashSet) dx0Var.f18419OooOo0o).add(mediaCodec));
        }
        s71Var.f24032OooOoOO = 1;
    }

    public static String OooO0oO(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final boolean OooO(hk0 hk0Var) {
        w71 w71Var = this.f24029OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            w71Var.f25258OooOOO = hk0Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ByteBuffer OooO00o(int i) {
        return this.f24028OooOo0O.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ByteBuffer OooO0O0(int i) {
        return this.f24028OooOo0O.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooO0OO(Surface surface) {
        this.f24028OooOo0O.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooO0Oo(int i, int i2, int i3, long j) {
        this.f24027OooOo.OooO00o(i, i2, i3, j);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooO0o0(int i, h31 h31Var, long j) {
        this.f24027OooOo.OooO0OO(i, h31Var, j);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooO0oo(int i, long j) {
        this.f24028OooOo0O.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooOO0(int i) {
        this.f24028OooOo0O.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final int OooOO0O(MediaCodec.BufferInfo bufferInfo) {
        this.f24027OooOo.zzc();
        w71 w71Var = this.f24029OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            try {
                IllegalStateException illegalStateException = w71Var.f25259OooOOO0;
                if (illegalStateException != null) {
                    w71Var.f25259OooOOO0 = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = w71Var.f25256OooOO0;
                if (codecException != null) {
                    w71Var.f25256OooOO0 = null;
                    throw codecException;
                }
                if (w71Var.f25257OooOO0O > 0 || w71Var.OooOO0o) {
                    return -1;
                }
                if (w71Var.f25253OooO0o0.isEmpty()) {
                    return -1;
                }
                int iPopFirst = w71Var.f25253OooO0o0.popFirst();
                if (iPopFirst >= 0) {
                    af0.OooOo0O(w71Var.f25255OooO0oo);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) w71Var.f25252OooO0o.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    w71Var.f25255OooO0oo = (MediaFormat) w71Var.f25254OooO0oO.remove();
                    iPopFirst = -2;
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooOO0o(int i) {
        this.f24028OooOo0O.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void OooOOO0(Bundle bundle) {
        this.f24027OooOo.OooO0O0(bundle);
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final int zza() {
        this.f24027OooOo.zzc();
        w71 w71Var = this.f24029OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            try {
                IllegalStateException illegalStateException = w71Var.f25259OooOOO0;
                if (illegalStateException != null) {
                    w71Var.f25259OooOOO0 = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = w71Var.f25256OooOO0;
                if (codecException != null) {
                    w71Var.f25256OooOO0 = null;
                    throw codecException;
                }
                int iPopFirst = -1;
                if (w71Var.f25257OooOO0O > 0 || w71Var.OooOO0o) {
                    return -1;
                }
                if (!w71Var.f25251OooO0Oo.isEmpty()) {
                    iPopFirst = w71Var.f25251OooO0Oo.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        w71 w71Var = this.f24029OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            try {
                mediaFormat = w71Var.f25255OooO0oo;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void zzi() {
        this.f24028OooOo0O.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void zzj() {
        this.f24027OooOo.zzb();
        this.f24028OooOo0O.flush();
        w71 w71Var = this.f24029OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            w71Var.f25257OooOO0O++;
            Handler handler = w71Var.f25250OooO0OO;
            int i = i80.f19994OooO00o;
            handler.post(new b30(w71Var, 22));
        }
        this.f24028OooOo0O.start();
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final void zzm() {
        dx0 dx0Var;
        dx0 dx0Var2;
        dx0 dx0Var3;
        try {
            try {
                if (this.f24032OooOoOO == 1) {
                    this.f24027OooOo.zzg();
                    w71 w71Var = this.f24029OooOo0o;
                    synchronized (w71Var.f25248OooO00o) {
                        w71Var.OooOO0o = true;
                        w71Var.f25249OooO0O0.quit();
                        w71Var.OooO00o();
                    }
                }
                this.f24032OooOoOO = 2;
                if (this.f24030OooOoO) {
                    return;
                }
                int i = i80.f19994OooO00o;
                if (i >= 30 && i < 33) {
                    this.f24028OooOo0O.stop();
                }
                if (i >= 35 && (dx0Var3 = this.f24031OooOoO0) != null) {
                    dx0Var3.OooOOoo(this.f24028OooOo0O);
                }
                this.f24028OooOo0O.release();
                this.f24030OooOoO = true;
            } catch (Throwable th) {
                if (!this.f24030OooOoO) {
                    int i2 = i80.f19994OooO00o;
                    if (i2 >= 30 && i2 < 33) {
                        this.f24028OooOo0O.stop();
                    }
                    if (i2 >= 35 && (dx0Var2 = this.f24031OooOoO0) != null) {
                        dx0Var2.OooOOoo(this.f24028OooOo0O);
                    }
                    this.f24028OooOo0O.release();
                    this.f24030OooOoO = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (i80.f19994OooO00o >= 35 && (dx0Var = this.f24031OooOoO0) != null) {
                dx0Var.OooOOoo(this.f24028OooOo0O);
            }
            this.f24028OooOo0O.release();
            this.f24030OooOoO = true;
            throw th2;
        }
    }
}
