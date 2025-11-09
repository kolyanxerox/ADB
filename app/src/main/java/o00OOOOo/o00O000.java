package o00OOOoO;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public class o00O000 {

    /* renamed from: OooO0Oo */
    public static final o00oOoo f32601OooO0Oo = new o00oOoo();

    /* renamed from: OooO00o */
    public boolean f32602OooO00o;

    /* renamed from: OooO0O0 */
    public long f32603OooO0O0;

    /* renamed from: OooO0OO */
    public long f32604OooO0OO;

    public o00O000 OooO00o() {
        this.f32602OooO00o = false;
        return this;
    }

    public o00O000 OooO0O0() {
        this.f32604OooO0OO = 0L;
        return this;
    }

    public long OooO0OO() {
        if (this.f32602OooO00o) {
            return this.f32603OooO0O0;
        }
        throw new IllegalStateException("No deadline");
    }

    public o00O000 OooO0Oo(long j) {
        this.f32602OooO00o = true;
        this.f32603OooO0O0 = j;
        return this;
    }

    public void OooO0o() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f32602OooO00o && this.f32603OooO0O0 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean OooO0o0() {
        return this.f32602OooO00o;
    }

    public o00O000 OooO0oO(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        OooOo.OooO0o0(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "timeout < 0: ").toString());
        }
        this.f32604OooO0OO = unit.toNanos(j);
        return this;
    }
}
