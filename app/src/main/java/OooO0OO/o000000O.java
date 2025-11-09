package Oooo0oO;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class o000000O extends Thread {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13880OooOo0O = 1;

    public /* synthetic */ o000000O(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        o00OOOoO.o00000O o00000oOooO00o;
        switch (this.f13880OooOo0O) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = o00OOOoO.o00000O.f32541OooO0oo;
                reentrantLock.lock();
                try {
                    o00000oOooO00o = o00O0.o000OOo.OooO00o();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (o00000oOooO00o == o00OOOoO.o00000O.OooOO0o) {
                o00OOOoO.o00000O.OooOO0o = null;
                return;
            } else {
                reentrantLock.unlock();
                if (o00000oOooO00o != null) {
                    o00000oOooO00o.OooOO0();
                }
            }
        }
    }

    public /* synthetic */ o000000O(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
