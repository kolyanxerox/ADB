package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class oOO0OO0O extends Thread {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final boolean f22808OooOoo0 = oOOo0O00.f22855OooO00o;

    /* renamed from: OooOo, reason: collision with root package name */
    public final O0O0 f22809OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final PriorityBlockingQueue f22810OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final PriorityBlockingQueue f22811OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2051sk f22812OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public volatile boolean f22813OooOoO0 = false;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final C1847n1 f22814OooOoOO;

    public oOO0OO0O(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, O0O0 o0o0, C1847n1 c1847n1) {
        this.f22810OooOo0O = priorityBlockingQueue;
        this.f22811OooOo0o = priorityBlockingQueue2;
        this.f22809OooOo = o0o0;
        this.f22814OooOoOO = c1847n1;
        this.f22812OooOoO = new C2051sk(this, priorityBlockingQueue2, c1847n1);
    }

    public final void OooO00o() {
        oOOO00o0 oooo00o0 = (oOOO00o0) this.f22810OooOo0O.take();
        oooo00o0.zzm("cache-queue-take");
        oooo00o0.OooO0o();
        try {
            oooo00o0.zzw();
            oOO0O0O ooo0o0oOooO00o = this.f22809OooOo.OooO00o(oooo00o0.zzj());
            if (ooo0o0oOooO00o == null) {
                oooo00o0.zzm("cache-miss");
                if (!this.f22812OooOoO.OooOOoo(oooo00o0)) {
                    this.f22811OooOo0o.put(oooo00o0);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ooo0o0oOooO00o.f22805OooO0o0 < jCurrentTimeMillis) {
                    oooo00o0.zzm("cache-hit-expired");
                    oooo00o0.zze(ooo0o0oOooO00o);
                    if (!this.f22812OooOoO.OooOOoo(oooo00o0)) {
                        this.f22811OooOo0o.put(oooo00o0);
                    }
                } else {
                    oooo00o0.zzm("cache-hit");
                    byte[] bArr = ooo0o0oOooO00o.f22800OooO00o;
                    Map map = ooo0o0oOooO00o.f22806OooO0oO;
                    OoooOOO.o0O0oo00 o0o0oo00OooO00o = oooo00o0.OooO00o(new oOOO00(200, bArr, map, oOOO00.OooO00o(map), false));
                    oooo00o0.zzm("cache-hit-parsed");
                    if (!(((oOOOoo00) o0o0oo00OooO00o.f14471OooOoO0) == null)) {
                        oooo00o0.zzm("cache-parsing-failed");
                        O0O0 o0o0 = this.f22809OooOo;
                        String strZzj = oooo00o0.zzj();
                        synchronized (o0o0) {
                            try {
                                oOO0O0O ooo0o0oOooO00o2 = o0o0.OooO00o(strZzj);
                                if (ooo0o0oOooO00o2 != null) {
                                    ooo0o0oOooO00o2.f22804OooO0o = 0L;
                                    ooo0o0oOooO00o2.f22805OooO0o0 = 0L;
                                    o0o0.OooO0OO(strZzj, ooo0o0oOooO00o2);
                                }
                            } finally {
                            }
                        }
                        oooo00o0.zze(null);
                        if (!this.f22812OooOoO.OooOOoo(oooo00o0)) {
                            this.f22811OooOo0o.put(oooo00o0);
                        }
                    } else if (ooo0o0oOooO00o.f22804OooO0o < jCurrentTimeMillis) {
                        oooo00o0.zzm("cache-hit-refresh-needed");
                        oooo00o0.zze(ooo0o0oOooO00o);
                        o0o0oo00OooO00o.f14469OooOo0O = true;
                        if (this.f22812OooOoO.OooOOoo(oooo00o0)) {
                            this.f22814OooOoOO.OooO0OO(oooo00o0, o0o0oo00OooO00o, null);
                        } else {
                            this.f22814OooOoOO.OooO0OO(oooo00o0, o0o0oo00OooO00o, new wp0(this, false, oooo00o0, 3));
                        }
                    } else {
                        this.f22814OooOoOO.OooO0OO(oooo00o0, o0o0oo00OooO00o, null);
                    }
                }
            }
            oooo00o0.OooO0o();
        } catch (Throwable th) {
            oooo00o0.OooO0o();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f22808OooOoo0) {
            oOOo0O00.OooO0OO("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f22809OooOo.OooO0O0();
        while (true) {
            try {
                OooO00o();
            } catch (InterruptedException unused) {
                if (this.f22813OooOoO0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                oOOo0O00.OooO0O0("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
