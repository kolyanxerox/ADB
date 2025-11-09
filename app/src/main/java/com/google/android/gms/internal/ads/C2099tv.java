package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.tv */
/* loaded from: classes2.dex */
public final class C2099tv extends p11 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ScheduledExecutorService f24511OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f24512OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Oooo0OO.o00Ooo f24513OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f24514OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public long f24515OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public long f24516OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f24517OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public ScheduledFuture f24518OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public ScheduledFuture f24519Oooo000;

    public C2099tv(ScheduledExecutorService scheduledExecutorService, Oooo0OO.o00Ooo o00ooo2) {
        super(Collections.EMPTY_SET);
        this.f24512OooOoO = -1L;
        this.f24514OooOoOO = -1L;
        this.f24516OooOoo0 = -1L;
        this.f24515OooOoo = -1L;
        this.f24517OooOooO = false;
        this.f24511OooOo = scheduledExecutorService;
        this.f24513OooOoO0 = o00ooo2;
    }

    public final synchronized void o0000(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f24517OooOooO) {
                long j = this.f24515OooOoo;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f24515OooOoo = millis;
                return;
            }
            ((Oooo0OO.oo000o) this.f24513OooOoO0).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f24514OooOoOO;
            if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                o0000oo(millis);
            }
        }
    }

    public final synchronized void o00000oo(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f24517OooOooO) {
                long j = this.f24516OooOoo0;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f24516OooOoo0 = millis;
                return;
            }
            ((Oooo0OO.oo000o) this.f24513OooOoO0).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f24512OooOoO;
            if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                o0000O00(millis);
            }
        }
    }

    public final synchronized void o0000O00(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f24518OooOooo;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f24518OooOooo.cancel(false);
            }
            ((Oooo0OO.oo000o) this.f24513OooOoO0).getClass();
            this.f24512OooOoO = SystemClock.elapsedRealtime() + j;
            this.f24518OooOooo = this.f24511OooOo.schedule(new RunnableC2062sv(this, 0), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void o0000oo(long j) {
        try {
            ScheduledFuture scheduledFuture = this.f24519Oooo000;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f24519Oooo000.cancel(false);
            }
            ((Oooo0OO.oo000o) this.f24513OooOoO0).getClass();
            this.f24514OooOoOO = SystemClock.elapsedRealtime() + j;
            this.f24519Oooo000 = this.f24511OooOo.schedule(new RunnableC2062sv(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f24517OooOooO = false;
        o0000O00(0L);
    }
}
