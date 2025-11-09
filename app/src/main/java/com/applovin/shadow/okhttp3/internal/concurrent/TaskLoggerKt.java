package com.applovin.shadow.okhttp3.internal.concurrent;

import OooO0oO.OooOo;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.logging.Level;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? OooOo.OooOOOO(new StringBuilder(), (j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ") : j <= -999500 ? OooOo.OooOOOO(new StringBuilder(), (j - 500000) / 1000000, " ms") : j <= 0 ? OooOo.OooOOOO(new StringBuilder(), (j - UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) / 1000, " µs") : j < 999500 ? OooOo.OooOOOO(new StringBuilder(), (j + UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) / 1000, " µs") : j < 999500000 ? OooOo.OooOOOO(new StringBuilder(), (j + 500000) / 1000000, " ms") : OooOo.OooOOOO(new StringBuilder(), (j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ")}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, OooO0O0 block) {
        long jNanoTime;
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        kotlin.jvm.internal.OooOo.OooO0o0(queue, "queue");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t = (T) block.invoke();
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t;
        } catch (Throwable th) {
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, OooO0O0 messageBlock) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        kotlin.jvm.internal.OooOo.OooO0o0(queue, "queue");
        kotlin.jvm.internal.OooOo.OooO0o0(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
