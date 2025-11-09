package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class s51 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f24006OooO00o = new Object();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Looper f24007OooO0O0 = null;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public HandlerThread f24008OooO0OO = null;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f24009OooO0Oo = 0;

    public final void OooO00o() {
        HandlerThread handlerThread;
        synchronized (this.f24006OooO00o) {
            try {
                af0.OooooO0(this.f24009OooO0Oo > 0);
                int i = this.f24009OooO0Oo - 1;
                this.f24009OooO0Oo = i;
                if (i == 0 && (handlerThread = this.f24008OooO0OO) != null) {
                    handlerThread.quit();
                    this.f24008OooO0OO = null;
                    this.f24007OooO0O0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
