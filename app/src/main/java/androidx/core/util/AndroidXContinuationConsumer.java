package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import o00O0O0O.OooO0OO;

/* loaded from: classes.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    private final OooO0OO continuation;

    public AndroidXContinuationConsumer(OooO0OO oooO0OO) {
        super(false);
        this.continuation = oooO0OO;
    }

    @Override // androidx.core.util.Consumer
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
