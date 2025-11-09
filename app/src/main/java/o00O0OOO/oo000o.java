package o00O0oOo;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;

/* loaded from: classes3.dex */
public final class oo000o extends o000oOoO {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o00O000o f31573OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Thread f31574OooOoO0;

    public oo000o(OooOOO0 oooOOO0, Thread thread, o00O000o o00o000o) {
        super(oooOOO0, true);
        this.f31574OooOoO0 = thread;
        this.f31573OooOoO = o00o000o;
    }

    @Override // o00O0oOo.o00O
    public final void OooOOoo(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f31574OooOoO0;
        if (OooOo.OooO00o(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
