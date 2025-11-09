package androidx.work;

import java.util.concurrent.CancellationException;
import o00000oO.OooOOO;
import o00O0.o000OOo;
import o00O0oOo.o0Oo0oo;

/* loaded from: classes.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ o0Oo0oo $cancellableContinuation;
    final /* synthetic */ OooOOO $this_await;

    public ListenableFutureKt$await$2$1(o0Oo0oo o0oo0oo, OooOOO oooOOO) {
        this.$cancellableContinuation = o0oo0oo;
        this.$this_await = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.$cancellableContinuation.resumeWith(this.$this_await.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.OooO0oO(cause);
            } else {
                this.$cancellableContinuation.resumeWith(o000OOo.OooO0O0(cause));
            }
        }
    }
}
