package androidx.work.impl.background.greedy;

import OooO0oO.OooOo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DelayedWorkTracker {
    static final String TAG = Logger.tagWithPrefix("DelayedWorkTracker");
    final GreedyScheduler mGreedyScheduler;
    private final RunnableScheduler mRunnableScheduler;
    private final Map<String, Runnable> mRunnables = new HashMap();

    /* renamed from: androidx.work.impl.background.greedy.DelayedWorkTracker$1 */
    public class RunnableC08871 implements Runnable {
        final /* synthetic */ WorkSpec val$workSpec;

        public RunnableC08871(WorkSpec workSpec) {
            workSpec = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.get().debug(DelayedWorkTracker.TAG, OooOo.OooOO0("Scheduling work ", workSpec.f129id), new Throwable[0]);
            DelayedWorkTracker.this.mGreedyScheduler.schedule(workSpec);
        }
    }

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, RunnableScheduler runnableScheduler) {
        this.mGreedyScheduler = greedyScheduler;
        this.mRunnableScheduler = runnableScheduler;
    }

    public void schedule(WorkSpec workSpec) {
        Runnable runnableRemove = this.mRunnables.remove(workSpec.f129id);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
        RunnableC08871 runnableC08871 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            final /* synthetic */ WorkSpec val$workSpec;

            public RunnableC08871(WorkSpec workSpec2) {
                workSpec = workSpec2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Logger.get().debug(DelayedWorkTracker.TAG, OooOo.OooOO0("Scheduling work ", workSpec.f129id), new Throwable[0]);
                DelayedWorkTracker.this.mGreedyScheduler.schedule(workSpec);
            }
        };
        this.mRunnables.put(workSpec2.f129id, runnableC08871);
        this.mRunnableScheduler.scheduleWithDelay(workSpec2.calculateNextRunTime() - System.currentTimeMillis(), runnableC08871);
    }

    public void unschedule(String str) {
        Runnable runnableRemove = this.mRunnables.remove(str);
        if (runnableRemove != null) {
            this.mRunnableScheduler.cancel(runnableRemove);
        }
    }
}
