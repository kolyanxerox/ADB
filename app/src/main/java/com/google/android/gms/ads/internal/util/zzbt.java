package com.google.android.gms.ads.internal.util;

import Oooo00O.o000000O;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.pj0;

/* loaded from: classes2.dex */
public final class zzbt {

    /* renamed from: OooO00o, reason: collision with root package name */
    public HandlerThread f16242OooO00o = null;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public pj0 f16243OooO0O0 = null;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f16244OooO0OO = 0;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f16245OooO0Oo = new Object();

    public final Handler zza() {
        return this.f16243OooO0O0;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f16245OooO0Oo) {
            try {
                if (this.f16244OooO0OO != 0) {
                    o000000O.OooO(this.f16242OooO00o, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f16242OooO00o == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f16242OooO00o = handlerThread;
                    handlerThread.start();
                    this.f16243OooO0O0 = new pj0(this.f16242OooO00o.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    this.f16245OooO0Oo.notifyAll();
                }
                this.f16244OooO0OO++;
                looper = this.f16242OooO00o.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
