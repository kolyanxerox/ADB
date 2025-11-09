package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activitiesInProcess;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activitiesInProcess, boolean z) {
        OooOo.OooO0o0(activitiesInProcess, "activitiesInProcess");
        this.activitiesInProcess = activitiesInProcess;
        this.isEmpty = z;
    }

    public final boolean contains(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return this.activitiesInProcess.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return OooOo.OooO00o(this.activitiesInProcess, activityStack.activitiesInProcess) && this.isEmpty == activityStack.isEmpty;
    }

    public final List<Activity> getActivitiesInProcess$window_release() {
        return this.activitiesInProcess;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEmpty) + (this.activitiesInProcess.hashCode() * 31);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityStack{activitiesInProcess=");
        sb.append(this.activitiesInProcess);
        sb.append(", isEmpty=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.isEmpty, '}');
    }
}
