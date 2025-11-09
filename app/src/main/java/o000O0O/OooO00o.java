package o000O0O;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final androidx.arch.core.executor.OooO00o f30102OooO00o = new androidx.arch.core.executor.OooO00o(2);

    public static Task OooO00o(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        OooOo.OooO oooO = new OooOo.OooO(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 9);
        androidx.arch.core.executor.OooO00o oooO00o = f30102OooO00o;
        task.continueWithTask(oooO00o, oooO);
        task2.continueWithTask(oooO00o, oooO);
        return taskCompletionSource.getTask();
    }
}
