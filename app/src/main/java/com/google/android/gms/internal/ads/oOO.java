package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class oOO extends Thread {

    /* renamed from: OooOo, reason: collision with root package name */
    public final O0O0 f22748OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final PriorityBlockingQueue f22749OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2249xx f22750OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C1847n1 f22751OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public volatile boolean f22752OooOoO0 = false;

    public oOO(PriorityBlockingQueue priorityBlockingQueue, C2249xx c2249xx, O0O0 o0o0, C1847n1 c1847n1) {
        this.f22749OooOo0O = priorityBlockingQueue;
        this.f22750OooOo0o = c2249xx;
        this.f22748OooOo = o0o0;
        this.f22751OooOoO = c1847n1;
    }

    public final void OooO00o() {
        C1847n1 c1847n1 = this.f22751OooOoO;
        oOOO00o0 oooo00o0 = (oOOO00o0) this.f22749OooOo0O.take();
        SystemClock.elapsedRealtime();
        oooo00o0.OooO0o();
        Object obj = null;
        try {
            try {
                try {
                    oooo00o0.zzm("network-queue-take");
                    oooo00o0.zzw();
                    TrafficStats.setThreadStatsTag(oooo00o0.zzc());
                    oOOO00 oooo00Zza = this.f22750OooOo0o.zza(oooo00o0);
                    oooo00o0.zzm("network-http-complete");
                    if (oooo00Zza.f22825OooO0o0 && oooo00o0.zzv()) {
                        oooo00o0.OooO0OO("not-modified");
                        oooo00o0.OooO0Oo();
                    } else {
                        OoooOOO.o0O0oo00 o0o0oo00OooO00o = oooo00o0.OooO00o(oooo00Zza);
                        oooo00o0.zzm("network-parse-complete");
                        oOO0O0O ooo0o0o = (oOO0O0O) o0o0oo00OooO00o.f14468OooOo;
                        if (ooo0o0o != null) {
                            this.f22748OooOo.OooO0OO(oooo00o0.zzj(), ooo0o0o);
                            oooo00o0.zzm("network-cache-written");
                        }
                        oooo00o0.zzq();
                        c1847n1.OooO0OO(oooo00o0, o0o0oo00OooO00o, null);
                        oooo00o0.OooO0o0(o0o0oo00OooO00o);
                    }
                } catch (Exception e) {
                    Log.e("Volley", oOOo0O00.OooO0Oo("Unhandled exception %s", e.toString()), e);
                    oOOOoo00 oooooo00 = new oOOOoo00(e);
                    SystemClock.elapsedRealtime();
                    c1847n1.getClass();
                    oooo00o0.zzm("post-error");
                    ((oOO0Oo00) c1847n1.f21381OooOo0o).f22818OooOo0o.post(new o000oOoO(oooo00o0, new OoooOOO.o0O0oo00(oooooo00), obj, 1));
                    oooo00o0.OooO0Oo();
                }
            } catch (oOOOoo00 e2) {
                SystemClock.elapsedRealtime();
                c1847n1.getClass();
                oooo00o0.zzm("post-error");
                ((oOO0Oo00) c1847n1.f21381OooOo0o).f22818OooOo0o.post(new o000oOoO(oooo00o0, new OoooOOO.o0O0oo00(e2), obj, 1));
                oooo00o0.OooO0Oo();
            }
            oooo00o0.OooO0o();
        } catch (Throwable th) {
            oooo00o0.OooO0o();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                OooO00o();
            } catch (InterruptedException unused) {
                if (this.f22752OooOoO0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                oOOo0O00.OooO0O0("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
