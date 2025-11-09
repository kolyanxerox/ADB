package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes2.dex */
public final class qb1 extends HandlerThread implements Handler.Callback {

    /* renamed from: OooOo, reason: collision with root package name */
    public Error f23573OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public RunnableC2063sw f23574OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Handler f23575OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public rb1 f23576OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public RuntimeException f23577OooOoO0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC2063sw runnableC2063sw;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        int i2 = message.arg1;
                        RunnableC2063sw runnableC2063sw2 = this.f23574OooOo0O;
                        if (runnableC2063sw2 == null) {
                            throw null;
                        }
                        runnableC2063sw2.OooO00o(i2);
                        SurfaceTexture surfaceTexture = this.f23574OooOo0O.f24177OooOoOO;
                        surfaceTexture.getClass();
                        this.f23576OooOoO = new rb1(this, surfaceTexture, i2 != 0);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (Error e) {
                        AbstractC1641hg.OooOOO0("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.f23573OooOo = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        AbstractC1641hg.OooOOO0("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.f23577OooOoO0 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C1510dx e3) {
                    AbstractC1641hg.OooOOO0("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f23577OooOoO0 = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    runnableC2063sw = this.f23574OooOo0O;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (runnableC2063sw == null) {
                    throw null;
                }
                runnableC2063sw.OooO0O0();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
