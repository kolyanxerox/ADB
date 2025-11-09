package o000O0O;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO0Oo */
    public static final OooO0o f30098OooO0Oo = new OooO0o();

    /* renamed from: OooO00o */
    public final OooO0O0 f30099OooO00o;

    /* renamed from: OooO0O0 */
    public final OooO0O0 f30100OooO0O0;

    /* renamed from: OooO0OO */
    public final OooO0O0 f30101OooO0OO;

    public OooO(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        OooOo.OooO0o0(backgroundExecutorService, "backgroundExecutorService");
        OooOo.OooO0o0(blockingExecutorService, "blockingExecutorService");
        this.f30099OooO00o = new OooO0O0(backgroundExecutorService);
        this.f30100OooO0O0 = new OooO0O0(backgroundExecutorService);
        Tasks.forResult(null);
        this.f30101OooO0OO = new OooO0O0(blockingExecutorService);
    }

    public static final void OooO00o() {
        if (((Boolean) new OooO0OO(0, f30098OooO0Oo, OooO0o.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void OooO0O0() {
        if (((Boolean) new OooO0OO(0, f30098OooO0Oo, OooO0o.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
