package OooO0OO;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ NotificationChannel OooO(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel OooO0oO(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel OooO0oo(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup OooOO0(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* synthetic */ JobWorkItem OooOO0O(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ AutofillId OooOo(Object obj) {
        return (AutofillId) obj;
    }
}
