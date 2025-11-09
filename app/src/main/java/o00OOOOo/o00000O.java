package o00OOOoO;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public class o00000O extends o00O000 {

    /* renamed from: OooO, reason: collision with root package name */
    public static final Condition f32540OooO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final ReentrantLock f32541OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final long f32542OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final long f32543OooOO0O;
    public static o00000O OooOO0o;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o00000O f32544OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f32545OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f32546OooO0oO;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f32541OooO0oo = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        OooOo.OooO0Oo(conditionNewCondition, "lock.newCondition()");
        f32540OooO = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f32542OooOO0 = millis;
        f32543OooOO0O = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final boolean OooO() {
        ReentrantLock reentrantLock = f32541OooO0oo;
        reentrantLock.lock();
        try {
            if (!this.f32545OooO0o0) {
                return false;
            }
            this.f32545OooO0o0 = false;
            o00000O o00000o = OooOO0o;
            while (o00000o != null) {
                o00000O o00000o2 = o00000o.f32544OooO0o;
                if (o00000o2 == this) {
                    o00000o.f32544OooO0o = this.f32544OooO0o;
                    this.f32544OooO0o = null;
                    return false;
                }
                o00000o = o00000o2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void OooO0oo() {
        o00000O o00000o;
        long j = this.f32604OooO0OO;
        boolean z = this.f32602OooO00o;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f32541OooO0oo;
            reentrantLock.lock();
            try {
                if (this.f32545OooO0o0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f32545OooO0o0 = true;
                if (OooOO0o == null) {
                    OooOO0o = new o00000O();
                    Oooo0oO.o000000O o000000o2 = new Oooo0oO.o000000O("Okio Watchdog");
                    o000000o2.setDaemon(true);
                    o000000o2.start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f32546OooO0oO = Math.min(j, OooO0OO() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f32546OooO0oO = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f32546OooO0oO = OooO0OO();
                }
                long j2 = this.f32546OooO0oO - jNanoTime;
                o00000O o00000o2 = OooOO0o;
                OooOo.OooO0O0(o00000o2);
                while (true) {
                    o00000o = o00000o2.f32544OooO0o;
                    if (o00000o == null || j2 < o00000o.f32546OooO0oO - jNanoTime) {
                        break;
                    } else {
                        o00000o2 = o00000o;
                    }
                }
                this.f32544OooO0o = o00000o;
                o00000o2.f32544OooO0o = this;
                if (o00000o2 == OooOO0o) {
                    f32540OooO.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public void OooOO0() {
    }
}
