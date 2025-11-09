package o000Oo;

import OoooOOO.C0001o0;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o000Oo0O.oo000o;

/* loaded from: classes2.dex */
public final class oo0o0Oo {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f30319OooO0Oo = TimeUnit.HOURS.toMillis(24);

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final long f30320OooO0o0 = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f30321OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f30322OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f30323OooO0OO;

    public oo0o0Oo() {
        if (C0001o0.f14093Oooo00O == null) {
            Pattern pattern = oo000o.f30391OooO0OO;
            C0001o0.f14093Oooo00O = new C0001o0(20);
        }
        C0001o0 c0001o0 = C0001o0.f14093Oooo00O;
        if (oo000o.f30392OooO0Oo == null) {
            oo000o.f30392OooO0Oo = new oo000o(c0001o0);
        }
        this.f30321OooO00o = oo000o.f30392OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean OooO00o() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f30323OooO0OO     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            o000Oo0O.oo000o r0 = r4.f30321OooO00o     // Catch: java.lang.Throwable -> L19
            OoooOOO.o0 r0 = r0.f30393OooO00o     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f30322OooO0O0     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oo.oo0o0Oo.OooO00o():boolean");
    }

    public final synchronized void OooO0O0(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f30323OooO0OO = 0;
            }
            return;
        }
        this.f30323OooO0OO++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.f30323OooO0OO);
                this.f30321OooO00o.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f30320OooO0o0);
            } else {
                jMin = f30319OooO0Oo;
            }
            this.f30321OooO00o.f30393OooO00o.getClass();
            this.f30322OooO0O0 = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
