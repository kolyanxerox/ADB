package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class oo0O extends AtomicReference implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o00O0OO0 f27208OooOo = new o00O0OO0();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o00O0OO0 f27209OooOoO0 = new o00O0OO0();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Callable f27210OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO f27211OooOo0o;

    public oo0O(o00OO o00oo, Callable callable) {
        this.f27211OooOo0o = o00oo;
        callable.getClass();
        this.f27210OooOo0O = callable;
    }

    public final void OooO00o(Thread thread) {
        Runnable runnable = (Runnable) get();
        o00O0O0O o00o0o0o = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof o00O0O0O;
            o00O0OO0 o00o0oo0 = f27209OooOoO0;
            if (!z2) {
                if (runnable != o00o0oo0) {
                    break;
                }
            } else {
                o00o0o0o = (o00O0O0O) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == o00o0oo0 || compareAndSet(runnable, o00o0oo0)) {
                z = Thread.interrupted() || z;
                LockSupport.park(o00o0o0o);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            o00OO o00oo = this.f27211OooOo0o;
            boolean zIsDone = o00oo.isDone();
            o00O0OO0 o00o0oo0 = f27208OooOo;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f27210OooOo0O.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, o00o0oo0)) {
                            OooO00o(threadCurrentThread);
                        }
                        o00oo.OooO0Oo(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, o00o0oo0)) {
                            OooO00o(threadCurrentThread);
                        }
                        o00oo.getClass();
                        if (o00O00O.f27051OooOoOO.OooOooO(o00oo, null, o00O00O.f27052OooOoo0)) {
                            o00O00O.OooO0oo(o00oo);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, o00o0oo0)) {
                OooO00o(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            o00oo.getClass();
            if (objCall == null) {
                objCall = o00O00O.f27052OooOoo0;
            }
            if (o00O00O.f27051OooOoOO.OooOooO(o00oo, null, objCall)) {
                o00O00O.OooO0oo(o00oo);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return OooO0oO.OooOo.OooOoo(runnable == f27208OooOo ? "running=[DONE]" : runnable instanceof o00O0O0O ? "running=[INTERRUPTED]" : runnable instanceof Thread ? OooO0oO.OooOo.OooOO0O("running=[RUNNING ON ", ((Thread) runnable).getName(), C3034d9.i.f8179e) : "running=[NOT STARTED YET]", ", ", this.f27210OooOo0O.toString());
    }
}
