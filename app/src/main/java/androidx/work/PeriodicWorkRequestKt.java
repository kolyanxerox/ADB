package androidx.work;

import androidx.work.PeriodicWorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class PeriodicWorkRequestKt {
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit) {
        OooOo.OooO0o0(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        OooOo.OooOO0O();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit, long j2, TimeUnit flexTimeIntervalUnit) {
        OooOo.OooO0o0(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        OooOo.OooO0o0(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        OooOo.OooOO0O();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        OooOo.OooO0o0(repeatInterval, "repeatInterval");
        OooOo.OooOO0O();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        OooOo.OooO0o0(repeatInterval, "repeatInterval");
        OooOo.OooO0o0(flexTimeInterval, "flexTimeInterval");
        OooOo.OooOO0O();
        throw null;
    }
}
