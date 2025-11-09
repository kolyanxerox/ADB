package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class aq0 extends AtomicReference implements Runnable {

    /* renamed from: OooOo0O */
    public static final RunnableC2105u0 f17085OooOo0O = new RunnableC2105u0(8);

    /* renamed from: OooOo0o */
    public static final RunnableC2105u0 f17086OooOo0o = new RunnableC2105u0(8);

    public abstract Object OooO00o();

    public abstract String OooO0O0();

    public final void OooO0OO(Thread thread) {
        Runnable runnable = (Runnable) get();
        zp0 zp0Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zp0;
            RunnableC2105u0 runnableC2105u0 = f17086OooOo0o;
            if (!z2) {
                if (runnable != runnableC2105u0) {
                    break;
                }
            } else {
                zp0Var = (zp0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC2105u0 || compareAndSet(runnable, runnableC2105u0)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zp0Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void OooO0o(Object obj);

    public abstract void OooO0o0(Throwable th);

    public abstract boolean OooO0oO();

    public final void OooO0oo() {
        RunnableC2105u0 runnableC2105u0 = f17086OooOo0o;
        RunnableC2105u0 runnableC2105u02 = f17085OooOo0O;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zp0 zp0Var = new zp0(this);
            zp0Var.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zp0Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(runnableC2105u02)) == runnableC2105u0) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(runnableC2105u02)) == runnableC2105u0) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objOooO00o = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zOooO0oO = OooO0oO();
            RunnableC2105u0 runnableC2105u0 = f17085OooOo0O;
            if (!zOooO0oO) {
                try {
                    objOooO00o = OooO00o();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC2105u0)) {
                            OooO0OO(threadCurrentThread);
                        }
                        OooO0o0(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnableC2105u0)) {
                            OooO0OO(threadCurrentThread);
                        }
                        OooO0o(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC2105u0)) {
                OooO0OO(threadCurrentThread);
            }
            if (zOooO0oO) {
                return;
            }
            OooO0o(objOooO00o);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return OooO0oO.OooOo.OooOoo(runnable == f17085OooOo0O ? "running=[DONE]" : runnable instanceof zp0 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? OooO0oO.OooOo.OooOO0O("running=[RUNNING ON ", ((Thread) runnable).getName(), C3034d9.i.f8179e) : "running=[NOT STARTED YET]", ", ", OooO0O0());
    }
}
