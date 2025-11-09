package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hb1 extends Handler implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public IOException f19686OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final s91 f19687OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public v91 f19688OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public Thread f19689OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f19690OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f19691OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ de0 f19692OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public volatile boolean f19693OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(de0 de0Var, Looper looper, s91 s91Var, v91 v91Var, long j) {
        super(looper);
        this.f19692OooOoo = de0Var;
        this.f19687OooOo0O = s91Var;
        this.f19688OooOo0o = v91Var;
    }

    public final void OooO00o(boolean z) {
        this.f19693OooOoo0 = z;
        this.f19686OooOo = null;
        if (hasMessages(1)) {
            this.f19691OooOoOO = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f19691OooOoOO = true;
                    this.f19687OooOo0O.f24046OooO0oO = true;
                    Thread thread = this.f19689OooOoO;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f19692OooOoo.f18240OooOo = null;
            SystemClock.elapsedRealtime();
            v91 v91Var = this.f19688OooOo0o;
            v91Var.getClass();
            v91Var.OooOO0O(this.f19687OooOo0O, true);
            this.f19688OooOo0o = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        oOO00O0 ooo00o0;
        o000O00 o000o002;
        if (this.f19693OooOoo0) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            SystemClock.elapsedRealtime();
            this.f19688OooOo0o.getClass();
            this.f19686OooOo = null;
            de0 de0Var = this.f19692OooOoo;
            ExecutorC2126ul executorC2126ul = (ExecutorC2126ul) de0Var.f18242OooOo0o;
            hb1 hb1Var = (hb1) de0Var.f18240OooOo;
            hb1Var.getClass();
            executorC2126ul.execute(hb1Var);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f19692OooOoo.f18240OooOo = null;
        SystemClock.elapsedRealtime();
        v91 v91Var = this.f19688OooOo0o;
        v91Var.getClass();
        if (this.f19691OooOoOO) {
            v91Var.OooOO0O(this.f19687OooOo0O, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                v91Var.OooOO0o(this.f19687OooOo0O);
                return;
            } catch (RuntimeException e) {
                AbstractC1641hg.OooOOO0("LoadTask", "Unexpected exception handling load completed", e);
                this.f19692OooOoo.f18243OooOoO0 = new ib1(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19686OooOo = iOException;
        int i3 = this.f19690OooOoO0;
        this.f19690OooOoO0 = i3 + 1;
        s91 s91Var = this.f19687OooOo0O;
        Uri uri = s91Var.f24041OooO0O0.f24211OooOo0o;
        y81 y81Var = new y81();
        int i4 = i80.f19994OooO00o;
        if ((iOException instanceof C2185w6) || (iOException instanceof FileNotFoundException) || (iOException instanceof bv0) || (iOException instanceof ib1)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof hn0) && ((hn0) cause).f19832OooOo0O == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i3 * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            ooo00o0 = de0.f18239OooOoo0;
        } else {
            int iOooOOO0 = v91Var.OooOOO0();
            int i5 = iOooOOO0 > v91Var.f24929OooooOO ? 1 : 0;
            if (v91Var.f24925OoooOoo || !((o000o002 = v91Var.f24919OoooO0O) == null || o000o002.zza() == -9223372036854775807L)) {
                v91Var.f24929OooooOO = iOooOOO0;
            } else {
                boolean z = v91Var.f24915Oooo0oo;
                if (!z || v91Var.OooOo0O()) {
                    v91Var.f24922OoooOOo = z;
                    v91Var.f24926Ooooo00 = 0L;
                    v91Var.f24929OooooOO = 0;
                    for (aa1 aa1Var : v91Var.f24913Oooo0o0) {
                        aa1Var.OooOOO0(false);
                    }
                    s91Var.f24044OooO0o.f21668OooO00o = 0L;
                    s91Var.f24039OooO = 0L;
                    s91Var.f24047OooO0oo = true;
                    s91Var.OooOO0o = false;
                } else {
                    v91Var.f24928OooooO0 = true;
                    ooo00o0 = de0.f18238OooOoOO;
                }
            }
            ooo00o0 = new oOO00O0(i5, jMin);
        }
        int i6 = ooo00o0.f22786OooO00o;
        boolean z2 = !(i6 == 0 || i6 == 1);
        e91 e91Var = new e91(-1, null, i80.OooOo0O(s91Var.f24039OooO), i80.OooOo0O(v91Var.f24916OoooO));
        o71 o71Var = v91Var.f24899OooOoO0;
        o71Var.OooO00o(new fj0(o71Var, y81Var, e91Var, iOException, z2));
        int i7 = ooo00o0.f22786OooO00o;
        if (i7 == 3) {
            this.f19692OooOoo.f18243OooOoO0 = this.f19686OooOo;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f19690OooOoO0 = 1;
            }
            long jMin2 = ooo00o0.f22787OooO0O0;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.f19690OooOoO0 - 1) * 1000, 5000);
            }
            de0 de0Var2 = this.f19692OooOoo;
            af0.OooooO0(((hb1) de0Var2.f18240OooOo) == null);
            de0Var2.f18240OooOo = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
                return;
            }
            SystemClock.elapsedRealtime();
            this.f19688OooOo0o.getClass();
            this.f19686OooOo = null;
            ExecutorC2126ul executorC2126ul2 = (ExecutorC2126ul) de0Var2.f18242OooOo0o;
            hb1 hb1Var2 = (hb1) de0Var2.f18240OooOo;
            hb1Var2.getClass();
            executorC2126ul2.execute(hb1Var2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f19691OooOoOO;
                this.f19689OooOoO = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f19687OooOo0O.getClass().getSimpleName()));
                try {
                    this.f19687OooOo0O.OooO00o();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19689OooOoO = null;
                Thread.interrupted();
            }
            if (this.f19693OooOoo0) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f19693OooOoo0) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.f19693OooOoo0) {
                return;
            }
            AbstractC1641hg.OooOOO0("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new ib1(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.f19693OooOoo0) {
                return;
            }
            AbstractC1641hg.OooOOO0("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new ib1(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.f19693OooOoo0) {
                AbstractC1641hg.OooOOO0("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
