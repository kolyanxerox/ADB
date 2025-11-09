package o000Oooo;

import OooOo.OooOO0;
import android.util.Log;
import androidx.arch.core.executor.OooO00o;
import androidx.webkit.internal.OooO0O0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o000Ooo.o00oO0o;
import o000OooO.o000oOoO;

/* loaded from: classes2.dex */
public final class o000OOo {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f30640OooO0Oo = new HashMap();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f30641OooO0o0 = new OooO00o(2);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Executor f30642OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f30643OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Task f30644OooO0OO = null;

    public o000OOo(Executor executor, o0000O0 o0000o02) {
        this.f30642OooO00o = executor;
        this.f30643OooO0O0 = o0000o02;
    }

    public static Object OooO00o(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o00oO0o o00oo0o = new o00oO0o(1);
        Executor executor = f30641OooO0o0;
        task.addOnSuccessListener(executor, o00oo0o);
        task.addOnFailureListener(executor, o00oo0o);
        task.addOnCanceledListener(executor, o00oo0o);
        if (!((CountDownLatch) o00oo0o.f30487OooOo0o).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task OooO0O0() {
        try {
            Task task = this.f30644OooO0OO;
            if (task == null || (task.isComplete() && !this.f30644OooO0OO.isSuccessful())) {
                this.f30644OooO0OO = Tasks.call(this.f30642OooO00o, new OooO0O0(this.f30643OooO0O0, 6));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f30644OooO0OO;
    }

    public final o000000 OooO0OO() {
        synchronized (this) {
            try {
                Task task = this.f30644OooO0OO;
                if (task != null && task.isSuccessful()) {
                    return (o000000) this.f30644OooO0OO.getResult();
                }
                try {
                    Task taskOooO0O0 = OooO0O0();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (o000000) OooO00o(taskOooO0O0);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task OooO0Oo(o000000 o000000Var) {
        o000oOoO o000oooo2 = new o000oOoO(2, this, o000000Var);
        Executor executor = this.f30642OooO00o;
        return Tasks.call(executor, o000oooo2).onSuccessTask(executor, new OooOO0(10, this, o000000Var));
    }
}
