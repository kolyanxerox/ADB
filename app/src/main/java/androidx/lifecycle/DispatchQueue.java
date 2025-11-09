package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;
import o00O0oOo.o000O0O0;
import o00O0oo0.o0Oo0oo;
import o00OO000.Oooo0;

/* loaded from: classes.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue this$0, Runnable runnable) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(runnable, "$runnable");
        this$0.enqueue(runnable);
    }

    private final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        drainQueue();
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void dispatchAndEnqueue(OooOOO0 context, Runnable runnable) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(runnable, "runnable");
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        o0Oo0oo o0oo0oo = Oooo0.f31951OooO00o.f31652OooOo;
        if (o0oo0oo.isDispatchNeeded(context) || canRun()) {
            o0oo0oo.dispatch(context, new OooO0Oo.OooO0O0(5, this, runnable));
        } else {
            enqueue(runnable);
        }
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            drainQueue();
        }
    }
}
