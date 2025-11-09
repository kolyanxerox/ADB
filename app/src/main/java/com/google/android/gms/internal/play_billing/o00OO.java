package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class o00OO extends o00O0 implements RunnableFuture {

    /* renamed from: OooOoo */
    public volatile oo0O f27061OooOoo;

    public o00OO(Callable callable) {
        this.f27061OooOoo = new oo0O(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.o00O00O
    public final String OooO0O0() {
        oo0O oo0o = this.f27061OooOoo;
        return oo0o != null ? OooO0oO.OooOo.OooOO0O("task=[", oo0o.toString(), C3034d9.i.f8179e) : super.OooO0O0();
    }

    @Override // com.google.android.gms.internal.play_billing.o00O00O
    public final void OooO0OO() {
        oo0O oo0o;
        Object obj = this.f27054OooOo0O;
        if (((obj instanceof o000O) && ((o000O) obj).f26996OooO00o) && (oo0o = this.f27061OooOoo) != null) {
            o00O0OO0 o00o0oo0 = oo0O.f27209OooOoO0;
            o00O0OO0 o00o0oo02 = oo0O.f27208OooOo;
            Runnable runnable = (Runnable) oo0o.get();
            if (runnable instanceof Thread) {
                o00O0O0O o00o0o0o = new o00O0O0O(oo0o);
                o00o0o0o.setExclusiveOwnerThread(Thread.currentThread());
                if (oo0o.compareAndSet(runnable, o00o0o0o)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) oo0o.getAndSet(o00o0oo02)) == o00o0oo0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) oo0o.getAndSet(o00o0oo02)) == o00o0oo0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f27061OooOoo = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        oo0O oo0o = this.f27061OooOoo;
        if (oo0o != null) {
            oo0o.run();
        }
        this.f27061OooOoo = null;
    }
}
