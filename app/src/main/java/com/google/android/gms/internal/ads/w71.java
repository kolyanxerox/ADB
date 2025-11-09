package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class w71 extends MediaCodec.Callback {

    /* renamed from: OooO, reason: collision with root package name */
    public MediaFormat f25247OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HandlerThread f25249OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Handler f25250OooO0OO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public MediaFormat f25255OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public MediaCodec.CodecException f25256OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f25257OooOO0O;
    public boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public hk0 f25258OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public IllegalStateException f25259OooOOO0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f25248OooO00o = new Object();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final CircularIntArray f25251OooO0Oo = new CircularIntArray();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final CircularIntArray f25253OooO0o0 = new CircularIntArray();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque f25252OooO0o = new ArrayDeque();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayDeque f25254OooO0oO = new ArrayDeque();

    public w71(HandlerThread handlerThread) {
        this.f25249OooO0O0 = handlerThread;
    }

    public final void OooO00o() {
        ArrayDeque arrayDeque = this.f25254OooO0oO;
        if (!arrayDeque.isEmpty()) {
            this.f25247OooO = (MediaFormat) arrayDeque.getLast();
        }
        this.f25251OooO0Oo.clear();
        this.f25253OooO0o0.clear();
        this.f25252OooO0o.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f25248OooO00o) {
            this.f25256OooOO0 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        x41 x41Var;
        synchronized (this.f25248OooO00o) {
            try {
                this.f25251OooO0Oo.addLast(i);
                hk0 hk0Var = this.f25258OooOOO;
                if (hk0Var != null && (x41Var = ((f81) hk0Var.f19809OooOo0o).f18844OoooOo0) != null) {
                    x41Var.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f25248OooO00o) {
            try {
                MediaFormat mediaFormat = this.f25247OooO;
                if (mediaFormat != null) {
                    this.f25253OooO0o0.addLast(-2);
                    this.f25254OooO0oO.add(mediaFormat);
                    this.f25247OooO = null;
                }
                this.f25253OooO0o0.addLast(i);
                this.f25252OooO0o.add(bufferInfo);
                hk0 hk0Var = this.f25258OooOOO;
                if (hk0Var != null) {
                    x41 x41Var = ((f81) hk0Var.f19809OooOo0o).f18844OoooOo0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f25248OooO00o) {
            this.f25253OooO0o0.addLast(-2);
            this.f25254OooO0oO.add(mediaFormat);
            this.f25247OooO = null;
        }
    }
}
