package androidx.window.core;

import android.content.ComponentName;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class ActivityComponentInfo {
    private final String className;
    private final String packageName;

    public ActivityComponentInfo(String packageName, String className) {
        OooOo.OooO0o0(packageName, "packageName");
        OooOo.OooO0o0(className, "className");
        this.packageName = packageName;
        this.className = className;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ActivityComponentInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
        ActivityComponentInfo activityComponentInfo = (ActivityComponentInfo) obj;
        return OooOo.OooO00o(this.packageName, activityComponentInfo.packageName) && OooOo.OooO00o(this.className, activityComponentInfo.className);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.className.hashCode() + (this.packageName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClassInfo { packageName: ");
        sb.append(this.packageName);
        sb.append(", className: ");
        return OooO0oO.OooOo.OooOOOo(sb, this.className, " }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityComponentInfo(ComponentName componentName) {
        OooOo.OooO0o0(componentName, "componentName");
        String packageName = componentName.getPackageName();
        OooOo.OooO0Oo(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        OooOo.OooO0Oo(className, "componentName.className");
        this(packageName, className);
    }
}
