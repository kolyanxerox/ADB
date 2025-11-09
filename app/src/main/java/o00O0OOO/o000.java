package o00O0oOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import o00O0O0O.OooOOO0;

/* loaded from: classes3.dex */
public final class o000 extends o00O000 implements Runnable {

    /* renamed from: OooOoo */
    public static final o000 f31479OooOoo;

    /* renamed from: OooOooO */
    public static final long f31480OooOooO;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        o000 o000Var = new o000();
        f31479OooOoo = o000Var;
        o000Var.OooOOOo(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f31480OooOooO = timeUnit.toNanos(l.longValue());
    }

    @Override // o00O0oOo.o00O000, o00O0oOo.o000O00
    public final o000OO00 OooO0Oo(long j, Runnable runnable, OooOOO0 oooOOO0) {
        long j2 = j > 0 ? j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return o00OO0OO.f31547OooOo0O;
        }
        long jNanoTime = System.nanoTime();
        o00O0000 o00o0000 = new o00O0000(j2 + jNanoTime, runnable);
        OooOoO0(jNanoTime, o00o0000);
        return o00o0000;
    }

    @Override // o00O0oOo.o00O000o
    public final Thread OooOOOO() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f31479OooOoo.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // o00O0oOo.o00O000
    public final void OooOo0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.OooOo0(runnable);
    }

    @Override // o00O0oOo.o00O000o
    public final void OooOo00(long j, o0O0ooO o0o0ooo) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void OooOoO() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            o00O000.f31524OooOoO.set(this, null);
            o00O000.f31525OooOoOO.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOooOo;
        o0o0Oo.f31568OooO00o.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zOooOo) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jOooOOo = OooOOo();
                    if (jOooOOo == LocationRequestCompat.PASSIVE_INTERVAL) {
                        long jNanoTime = System.nanoTime();
                        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                            j = f31480OooOooO + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            OooOoO();
                            if (OooOo()) {
                                return;
                            }
                            OooOOOO();
                            return;
                        }
                        if (jOooOOo > j2) {
                            jOooOOo = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jOooOOo > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            OooOoO();
                            if (OooOo()) {
                                return;
                            }
                            OooOOOO();
                            return;
                        }
                        LockSupport.parkNanos(this, jOooOOo);
                    }
                }
            }
        } finally {
            _thread = null;
            OooOoO();
            if (!OooOo()) {
                OooOOOO();
            }
        }
    }

    @Override // o00O0oOo.o00O000, o00O0oOo.o00O000o
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return "DefaultExecutor";
    }
}
