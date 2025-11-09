package OoooOOO;

import Oooo00O.o000000O;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0OO0o00 extends oO0Oo {

    /* renamed from: Oooo000 */
    public static final AtomicLong f14505Oooo000 = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: OooOo */
    public o0OOooO0 f14506OooOo;

    /* renamed from: OooOoO */
    public final PriorityBlockingQueue f14507OooOoO;

    /* renamed from: OooOoO0 */
    public o0OOooO0 f14508OooOoO0;

    /* renamed from: OooOoOO */
    public final LinkedBlockingQueue f14509OooOoOO;

    /* renamed from: OooOoo */
    public final o0OO0 f14510OooOoo;

    /* renamed from: OooOoo0 */
    public final o0OO0 f14511OooOoo0;

    /* renamed from: OooOooO */
    public final Object f14512OooOooO;

    /* renamed from: OooOooo */
    public final Semaphore f14513OooOooo;

    public o0OO0o00(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14512OooOooO = new Object();
        this.f14513OooOooo = new Semaphore(2);
        this.f14507OooOoO = new PriorityBlockingQueue();
        this.f14509OooOoOO = new LinkedBlockingQueue();
        this.f14511OooOoo0 = new o0OO0(this, "Thread death: Uncaught exception on worker thread");
        this.f14510OooOoo = new o0OO0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // OoooOOO.o0o0000
    public final void OooOO0O() {
        if (Thread.currentThread() != this.f14506OooOo) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // OoooOOO.oO0Oo
    public final boolean OooOO0o() {
        return false;
    }

    public final void OooOOOO() {
        if (Thread.currentThread() != this.f14508OooOoO0) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void OooOOOo() {
        if (Thread.currentThread() == this.f14506OooOo) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final o0OO0O0 OooOOo(Callable callable) {
        OooOOO0();
        o0OO0O0 o0oo0o0 = new o0OO0O0(this, callable, false);
        if (Thread.currentThread() != this.f14506OooOo) {
            OooOo(o0oo0o0);
            return o0oo0o0;
        }
        if (!this.f14507OooOoO.isEmpty()) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0O0("Callable skipped the worker queue.");
        }
        o0oo0o0.run();
        return o0oo0o0;
    }

    public final boolean OooOOo0() {
        return Thread.currentThread() == this.f14506OooOo;
    }

    public final o0OO0O0 OooOOoo(Callable callable) {
        OooOOO0();
        o0OO0O0 o0oo0o0 = new o0OO0O0(this, callable, true);
        if (Thread.currentThread() == this.f14506OooOo) {
            o0oo0o0.run();
            return o0oo0o0;
        }
        OooOo(o0oo0o0);
        return o0oo0o0;
    }

    public final void OooOo(o0OO0O0 o0oo0o0) {
        synchronized (this.f14512OooOooO) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f14507OooOoO;
                priorityBlockingQueue.add(o0oo0o0);
                o0OOooO0 o0ooooo0 = this.f14506OooOo;
                if (o0ooooo0 == null) {
                    o0OOooO0 o0ooooo02 = new o0OOooO0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f14506OooOo = o0ooooo02;
                    o0ooooo02.setUncaughtExceptionHandler(this.f14511OooOoo0);
                    this.f14506OooOo.start();
                } else {
                    Object obj = o0ooooo0.f14571OooOo0O;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object OooOo0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            o0OO0o00 o0oo0o00 = ((o0OO0oO0) this.f14574OooOo0O).f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0O0oo0o o0o0oo0o = o0o0o0o0.f14396OooOooO;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                o0o0oo0o.OooO0O0(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o02);
            o0o0o0o02.f14396OooOooO.OooO0O0("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void OooOo00(Runnable runnable) {
        OooOOO0();
        o000000O.OooO0oo(runnable);
        OooOo(new o0OO0O0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void OooOo0O(Runnable runnable) {
        OooOOO0();
        OooOo(new o0OO0O0(this, runnable, true, "Task exception on worker thread"));
    }

    public final void OooOo0o(Runnable runnable) {
        OooOOO0();
        o0OO0O0 o0oo0o0 = new o0OO0O0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14512OooOooO) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f14509OooOoOO;
                linkedBlockingQueue.add(o0oo0o0);
                o0OOooO0 o0ooooo0 = this.f14508OooOoO0;
                if (o0ooooo0 == null) {
                    o0OOooO0 o0ooooo02 = new o0OOooO0(this, "Measurement Network", linkedBlockingQueue);
                    this.f14508OooOoO0 = o0ooooo02;
                    o0ooooo02.setUncaughtExceptionHandler(this.f14510OooOoo);
                    this.f14508OooOoO0.start();
                } else {
                    Object obj = o0ooooo0.f14571OooOo0O;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
