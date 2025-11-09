package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final OooO0OO continuation;

    public ContinuationConsumer(OooO0OO oooO0OO) {
        super(false);
        this.continuation = oooO0OO;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(t);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
