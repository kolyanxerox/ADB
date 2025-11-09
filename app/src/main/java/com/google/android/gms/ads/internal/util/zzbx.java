package com.google.android.gms.ads.internal.util;

import Oooo0OO.oo000o;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class zzbx {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f16250OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f16251OooO0O0 = Long.MIN_VALUE;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f16252OooO0OO = new Object();

    public zzbx(long j) {
        this.f16250OooO00o = j;
    }

    public final void zza(long j) {
        synchronized (this.f16252OooO0OO) {
            this.f16250OooO00o = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.f16252OooO0OO) {
            try {
                ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f16251OooO0O0 + this.f16250OooO00o > jElapsedRealtime) {
                    return false;
                }
                this.f16251OooO0O0 = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
