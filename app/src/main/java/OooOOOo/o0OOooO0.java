package OoooOOO;

import Oooo00O.o000000O;
import android.os.Process;
import androidx.work.WorkRequest;
import java.util.AbstractQueue;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class o0OOooO0 extends Thread {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f14570OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f14571OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractQueue f14572OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f14573OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOooO0(o0OO0o00 o0oo0o00, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(o0oo0o00);
        this.f14573OooOoO0 = o0oo0o00;
        this.f14570OooOo = false;
        o000000O.OooO0oo(blockingQueue);
        this.f14571OooOo0O = new Object();
        this.f14572OooOo0o = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void OooO00o() {
        o0OO0o00 o0oo0o00 = this.f14573OooOoO0;
        synchronized (o0oo0o00.f14512OooOooO) {
            try {
                if (!this.f14570OooOo) {
                    o0oo0o00.f14513OooOooo.release();
                    o0oo0o00.f14512OooOooO.notifyAll();
                    if (this == o0oo0o00.f14506OooOo) {
                        o0oo0o00.f14506OooOo = null;
                    } else if (this == o0oo0o00.f14508OooOoO0) {
                        o0oo0o00.f14508OooOoO0 = null;
                    } else {
                        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oo0o00.f14574OooOo0O).f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14393OooOoOO.OooO0O0("Current scheduler thread is neither worker nor network");
                    }
                    this.f14570OooOo = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = false;
        while (!z) {
            try {
                this.f14573OooOoO0.f14513OooOooo.acquire();
                z = true;
            } catch (InterruptedException e) {
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14573OooOoO0.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.f14572OooOo0o;
                o0OO0O0 o0oo0o0 = (o0OO0O0) abstractQueue.poll();
                if (o0oo0o0 != null) {
                    Process.setThreadPriority(true != o0oo0o0.f14500OooOo0o ? 10 : threadPriority);
                    o0oo0o0.run();
                } else {
                    Object obj = this.f14571OooOo0O;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.f14573OooOoO0.getClass();
                            try {
                                obj.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e2) {
                                o0O0O0o0 o0o0o0o02 = ((o0OO0oO0) this.f14573OooOoO0.f14574OooOo0O).f14520OooOoOO;
                                o0OO0oO0.OooOOO0(o0o0o0o02);
                                o0o0o0o02.f14396OooOooO.OooO0OO(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f14573OooOoO0.f14512OooOooO) {
                        if (this.f14572OooOo0o.peek() == null) {
                            OooO00o();
                            OooO00o();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            OooO00o();
            throw th;
        }
    }
}
