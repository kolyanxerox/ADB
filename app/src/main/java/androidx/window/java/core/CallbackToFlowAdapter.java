package androidx.window.java.core;

import androidx.core.util.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o0000OO0;
import o00O0oOo.o00O0O00;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class CallbackToFlowAdapter {
    private final ReentrantLock lock = new ReentrantLock();
    private final Map<Consumer<?>, o00O0O00> consumerToJobMap = new LinkedHashMap();

    public final <T> void connect(Executor executor, Consumer<T> consumer, o0OoOoOo flow) {
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(consumer, "consumer");
        OooOo.OooO0o0(flow, "flow");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(consumer) == null) {
                this.consumerToJobMap.put(consumer, o0000OO0.OooOo0(o0000OO0.OooO0O0(o0000OO0.OooOOO(executor)), null, new CallbackToFlowAdapter$connect$1$1(flow, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void disconnect(Consumer<?> consumer) {
        OooOo.OooO0o0(consumer, "consumer");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            o00O0O00 o00o0o00 = this.consumerToJobMap.get(consumer);
            if (o00o0o00 != null) {
                o00o0o00.OooO00o(null);
            }
            this.consumerToJobMap.remove(consumer);
        } finally {
            reentrantLock.unlock();
        }
    }
}
