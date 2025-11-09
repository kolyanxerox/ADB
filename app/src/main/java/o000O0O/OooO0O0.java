package o000O0O;

import OooO0oo.o00Oo0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class OooO0O0 implements Executor {

    /* renamed from: OooOo0O */
    public final ExecutorService f30104OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f30105OooOo0o = new Object();

    /* renamed from: OooOo */
    public Task f30103OooOo = Tasks.forResult(null);

    public OooO0O0(ExecutorService executorService) {
        this.f30104OooOo0O = executorService;
    }

    public final Task OooO00o(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f30105OooOo0o) {
            taskContinueWithTask = this.f30103OooOo.continueWithTask(this.f30104OooOo0O, new o00Oo0(runnable, 24));
            this.f30103OooOo = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30104OooOo0O.execute(runnable);
    }
}
