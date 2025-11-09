package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b30 implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17362OooOo0O;

    /* renamed from: OooOo0o */
    public Object f17363OooOo0o;

    public /* synthetic */ b30() {
        this.f17362OooOo0O = 18;
    }

    private final void OooO00o() {
        w71 w71Var = (w71) this.f17363OooOo0o;
        synchronized (w71Var.f25248OooO00o) {
            try {
                if (w71Var.OooOO0o) {
                    return;
                }
                long j = w71Var.f25257OooOO0O - 1;
                w71Var.f25257OooOO0O = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    w71Var.OooO00o();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (w71Var.f25248OooO00o) {
                    w71Var.f25259OooOOO0 = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00000oO.OooOOO oooOOO;
        switch (this.f17362OooOo0O) {
            case 0:
                String str = zzv.zzp().OooO0Oo().zzg().f21508OooO0o0;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                C2274yl c2274yl = (C2274yl) this.f17363OooOo0o;
                if (zIsEmpty) {
                    c2274yl.zzd(new Exception());
                    return;
                } else {
                    c2274yl.zzc(str);
                    return;
                }
            case 1:
                ((l40) this.f17363OooOo0o).OooO00o();
                return;
            case 2:
                ((l40) this.f17363OooOo0o).OooO00o();
                return;
            case 3:
                o00000oO.OooOOO oooOOOOooOo0O = ((OooOOo0.o0OOO0o) ((wj0) this.f17363OooOo0o).f25318OooOo0o).OooOo0O();
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0Oo)).booleanValue()) {
                    ze0.OooOOo0(oooOOOOooOo0O, "persistFlags");
                    return;
                } else {
                    oooOOOOooOo0O.addListener(new wp0(0, oooOOOOooOo0O, new or0("persistFlags", 3)), AbstractC2200wl.f25327OooO0oO);
                    return;
                }
            case 4:
                x70 x70Var = (x70) this.f17363OooOo0o;
                synchronized (x70Var) {
                    ((Oooo0OO.oo000o) x70Var.f25540OooO00o).getClass();
                    x70Var.f25547OooO0oo = SystemClock.elapsedRealtime() - x70Var.f25539OooO;
                }
                return;
            case 5:
                w80 w80Var = (w80) this.f17363OooOo0o;
                synchronized (w80Var) {
                    w80Var.o000O0O0(3, "Signal collection timeout.");
                }
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOoo00)).booleanValue();
                Throwable th = (Throwable) this.f17363OooOo0o;
                if (zBooleanValue) {
                    zzv.zzp().OooO("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    zzv.zzp().OooO0oO("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 7:
                fc0 fc0Var = (fc0) this.f17363OooOo0o;
                fc0Var.getClass();
                fc0Var.f18917OooO0Oo.o0OOO0o(af0.Oooo0O0(6, null, null));
                return;
            case 8:
                ((c90) this.f17363OooOo0o).OoooOOO();
                return;
            case 9:
                jc0 jc0Var = (jc0) this.f17363OooOo0o;
                jc0Var.getClass();
                jc0Var.f20276OooO0Oo.o0OOO0o(af0.Oooo0O0(6, null, null));
                return;
            case 10:
                yc0 yc0Var = (yc0) this.f17363OooOo0o;
                yc0Var.getClass();
                yc0Var.f25900OooO0Oo.o0OOO0o(af0.Oooo0O0(6, null, null));
                return;
            case 11:
                fd0 fd0Var = (fd0) this.f17363OooOo0o;
                fd0Var.getClass();
                fd0Var.f18927OooO0Oo.o0OOO0o(af0.Oooo0O0(6, null, null));
                return;
            case 12:
                ((bd0) this.f17363OooOo0o).OoooOOO();
                return;
            case 13:
                ((WebView) this.f17363OooOo0o).destroy();
                return;
            case 14:
                C1548ey c1548ey = ((zh0) this.f17363OooOo0o).f26179OooO0o0;
                c1548ey.getClass();
                ci0 ci0Var = new ci0(c1548ey);
                bi0 bi0Var = (bi0) c1548ey.f18706OooOo;
                ci0Var.f17047OooO00o = bi0Var;
                ArrayDeque arrayDeque = (ArrayDeque) bi0Var.f17507OooOo;
                arrayDeque.add(ci0Var);
                if (((ai0) bi0Var.f17510OooOoO0) == null) {
                    ai0 ai0Var = (ai0) arrayDeque.poll();
                    bi0Var.f17510OooOoO0 = ai0Var;
                    if (ai0Var != null) {
                        ai0Var.executeOnExecutor((ThreadPoolExecutor) bi0Var.f17509OooOo0o, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                lj0 lj0Var = new lj0();
                Log.d("GASS", "Clearcut logging disabled");
                ((TaskCompletionSource) this.f17363OooOo0o).setResult(new ij0(lj0Var));
                return;
            case 16:
                C1643hi c1643hi = (C1643hi) this.f17363OooOo0o;
                if (((bk0) c1643hi.f19794OooOooo) != null) {
                    ((or0) c1643hi.f19788OooOoO).OooO0OO("Unbind from service.", new Object[0]);
                    Context context = (Context) c1643hi.f19786OooOo0O;
                    rk0 rk0Var = (rk0) c1643hi.f19793OooOooO;
                    rk0Var.getClass();
                    context.unbindService(rk0Var);
                    c1643hi.f19785OooOo = false;
                    c1643hi.f19794OooOooo = null;
                    c1643hi.f19793OooOooO = null;
                    synchronized (((ArrayList) c1643hi.f19790OooOoOO)) {
                        ((ArrayList) c1643hi.f19790OooOoOO).clear();
                    }
                    return;
                }
                return;
            case 17:
                C1643hi c1643hi2 = ((rk0) this.f17363OooOo0o).f23873OooOo0O;
                ((or0) c1643hi2.f19788OooOoO).OooO0OO("unlinkToDeath", new Object[0]);
                IInterface iInterface = (bk0) c1643hi2.f19794OooOooo;
                iInterface.getClass();
                ((AbstractC2144v2) iInterface).asBinder().unlinkToDeath((pk0) c1643hi2.f19792OooOoo0, 0);
                c1643hi2.f19794OooOooo = null;
                c1643hi2.f19785OooOo = false;
                return;
            case 18:
                lq0 lq0Var = (lq0) this.f17363OooOo0o;
                if (lq0Var == null || (oooOOO = lq0Var.f20933OooOoo) == null) {
                    return;
                }
                this.f17363OooOo0o = null;
                if (oooOOO.isDone()) {
                    lq0Var.OooOO0o(oooOOO);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = lq0Var.f20934OooOooO;
                    lq0Var.f20934OooOooO = null;
                    String str2 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str2 = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            lq0Var.OooO0oO(new kq0(str2, 0));
                            throw th2;
                        }
                    }
                    lq0Var.OooO0oO(new kq0(str2 + ": " + oooOOO.toString(), 0));
                    return;
                } finally {
                    oooOOO.cancel(true);
                }
            case 19:
                v51 v51Var = (v51) this.f17363OooOo0o;
                try {
                    synchronized (v51Var) {
                    }
                    try {
                        v51Var.f24851OooO00o.OooO0O0(v51Var.f24852OooO0O0, v51Var.f24853OooO0OO);
                        return;
                    } finally {
                        v51Var.OooO00o(true);
                    }
                } catch (l41 e) {
                    AbstractC1641hg.OooOOO0("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 20:
                h61 h61Var = (h61) this.f17363OooOo0o;
                h61Var.OooO(h61Var.OooO0oO(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new qv0(25));
                h61Var.f19578OooO0o.OooO0Oo();
                return;
            case 21:
                h71 h71Var = (h71) this.f17363OooOo0o;
                if (h71Var.o000oOoO >= 300000) {
                    ((i71) h71Var.OooOO0o.f21493OooOo0o).f19987o0000o0O = true;
                    h71Var.o000oOoO = 0L;
                    return;
                }
                return;
            case 22:
                OooO00o();
                return;
            default:
                OooOO0 oooOO0 = (OooOO0) this.f17363OooOo0o;
                oooOO0.OooOO0o--;
                return;
        }
    }

    public b30(vh0 vh0Var) {
        this.f17362OooOo0O = 13;
        this.f17363OooOo0o = vh0Var.f24979OooO0o0;
    }

    public /* synthetic */ b30(Object obj, int i) {
        this.f17362OooOo0O = i;
        this.f17363OooOo0o = obj;
    }
}
