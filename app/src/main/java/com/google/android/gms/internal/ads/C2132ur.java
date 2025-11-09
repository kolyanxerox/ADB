package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ur */
/* loaded from: classes2.dex */
public final class C2132ur implements InterfaceC1738k3 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f24765OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f24766OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public ScheduledFuture f24767OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f24768OooO0Oo = -1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f24770OooO0o0 = -1;

    /* renamed from: OooO0o, reason: collision with root package name */
    public gc0 f24769OooO0o = null;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f24771OooO0oO = false;

    public C2132ur(ScheduledExecutorService scheduledExecutorService, Oooo0OO.o00Ooo o00ooo2) {
        this.f24765OooO00o = scheduledExecutorService;
        this.f24766OooO0O0 = o00ooo2;
        zzv.zzb().OooO0O0(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1738k3
    public final void zza(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.f24771OooO0oO) {
                        if (this.f24770OooO0o0 > 0 && (scheduledFuture = this.f24767OooO0OO) != null && scheduledFuture.isCancelled()) {
                            this.f24767OooO0OO = this.f24765OooO00o.schedule(this.f24769OooO0o, this.f24770OooO0o0, TimeUnit.MILLISECONDS);
                        }
                        this.f24771OooO0oO = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f24771OooO0oO) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f24767OooO0OO;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f24770OooO0o0 = -1L;
                } else {
                    this.f24767OooO0OO.cancel(true);
                    long j = this.f24768OooO0Oo;
                    ((Oooo0OO.oo000o) this.f24766OooO0O0).getClass();
                    this.f24770OooO0o0 = j - SystemClock.elapsedRealtime();
                }
                this.f24771OooO0oO = true;
            } finally {
            }
        }
    }
}
