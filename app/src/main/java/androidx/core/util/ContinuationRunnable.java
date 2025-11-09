package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import o00O0O0O.OooO0OO;
import oo00o.OooOo;

/* loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final OooO0OO continuation;

    public ContinuationRunnable(OooO0OO oooO0OO) {
        super(false);
        this.continuation = oooO0OO;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(OooOo.f33195OooO00o);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
