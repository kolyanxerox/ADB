package o000OO0O;

import OooOOO.OooOO0;
import OooOOo0.o0OOO0o;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000Oo0O.OooOo00;
import o000Ooo.OooOo;
import o000Ooo.o0000;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO, reason: collision with root package name */
    public final OooOo00 f30206OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final double f30207OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final double f30208OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f30209OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f30210OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayBlockingQueue f30211OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f30212OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ThreadPoolExecutor f30213OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final o0OOO0o f30214OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f30215OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f30216OooOO0O;

    public OooO0OO(o0OOO0o o0ooo0o, o000O0O0.OooO0OO oooO0OO, OooOo00 oooOo00) {
        double d = oooO0OO.f30122OooO0Oo;
        this.f30207OooO00o = d;
        this.f30208OooO0O0 = oooO0OO.f30124OooO0o0;
        this.f30209OooO0OO = oooO0OO.f30123OooO0o * 1000;
        this.f30214OooO0oo = o0ooo0o;
        this.f30206OooO = oooOo00;
        this.f30210OooO0Oo = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f30212OooO0o0 = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f30211OooO0o = arrayBlockingQueue;
        this.f30213OooO0oO = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f30215OooOO0 = 0;
        this.f30216OooOO0O = 0L;
    }

    public final int OooO00o() {
        if (this.f30216OooOO0O == 0) {
            this.f30216OooOO0O = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f30216OooOO0O) / this.f30209OooO0OO);
        int iMin = this.f30211OooO0o.size() == this.f30212OooO0o0 ? Math.min(100, this.f30215OooOO0 + iCurrentTimeMillis) : Math.max(0, this.f30215OooOO0 - iCurrentTimeMillis);
        if (this.f30215OooOO0 != iMin) {
            this.f30215OooOO0 = iMin;
            this.f30216OooOO0O = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void OooO0O0(final OooOo oooOo, final TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + oooOo.f30418OooO0O0;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z = SystemClock.elapsedRealtime() - this.f30210OooO0Oo < 2000;
        this.f30214OooO0oo.OooOOOO(new OooOOO.OooO00o(oooOo.f30417OooO00o, OooOOO.OooO0OO.f13316OooOo), new OooOO0() { // from class: o000OO0O.OooO0O0
            @Override // OooOOO.OooOO0
            public final void OooO00o(Exception exc) throws Throwable {
                OooO0OO oooO0OO = this.f30203OooOo0O;
                oooO0OO.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new OooOOOO(6, oooO0OO, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = o0000.f30426OooO00o;
                    boolean z3 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z3 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                taskCompletionSource2.trySetResult(oooOo);
            }
        });
    }
}
