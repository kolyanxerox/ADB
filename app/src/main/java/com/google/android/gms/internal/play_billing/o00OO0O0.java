package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.kq0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o00OO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o00OO0OO f27064OooOo0O;

    @Override // java.lang.Runnable
    public final void run() {
        oo0o0O0 oo0o0o0;
        o000OO00 o000oo002;
        o00OO0OO o00oo0oo = this.f27064OooOo0O;
        if (o00oo0oo == null || (oo0o0o0 = o00oo0oo.f27065OooOoo) == null) {
            return;
        }
        this.f27064OooOo0O = null;
        if (oo0o0o0.isDone()) {
            Object obj = o00oo0oo.f27054OooOo0O;
            if (obj == null) {
                if (oo0o0o0.isDone()) {
                    if (o00O00O.f27051OooOoOO.OooOooO(o00oo0oo, null, o00O00O.OooO0o0(oo0o0o0))) {
                        o00O00O.OooO0oo(o00oo0oo);
                        return;
                    }
                    return;
                }
                o00O0000 o00o0000 = new o00O0000(o00oo0oo, oo0o0o0);
                if (o00O00O.f27051OooOoOO.OooOooO(o00oo0oo, null, o00o0000)) {
                    try {
                        oo0o0o0.OooO00o(o00o0000, oo00o.f27205OooOo0O);
                        return;
                    } catch (Throwable th) {
                        try {
                            o000oo002 = new o000OO00(th);
                        } catch (Error | Exception unused) {
                            o000oo002 = o000OO00.f27023OooO0O0;
                        }
                        o00O00O.f27051OooOoOO.OooOooO(o00oo0oo, o00o0000, o000oo002);
                        return;
                    }
                }
                obj = o00oo0oo.f27054OooOo0O;
            }
            if (obj instanceof o000O) {
                oo0o0o0.cancel(((o000O) obj).f26996OooO00o);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = o00oo0oo.f27066OooOooO;
            o00oo0oo.f27066OooOooO = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    o00oo0oo.OooO0Oo(new kq0(str, 1));
                    throw th2;
                }
            }
            o00oo0oo.OooO0Oo(new kq0(str + ": " + oo0o0o0.toString(), 1));
        } finally {
            oo0o0o0.cancel(true);
        }
    }
}
