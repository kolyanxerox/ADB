package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ActivityComponentInfo;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;
import o00O0oO.o0000O00;

/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!o000000.Oooo0o(ProxyConfig.MATCH_ALL_SCHEMES, str2)) {
            return false;
        }
        if (str2.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (o000000.OoooO0O(str2, ProxyConfig.MATCH_ALL_SCHEMES, 0, 6) != o000000.OoooOOO(ProxyConfig.MATCH_ALL_SCHEMES, str2, 6) || !o0000O00.OooOooo(str2, ProxyConfig.MATCH_ALL_SCHEMES, false)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return o0000O00.Oooo0OO(str, strSubstring, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean areComponentsMatching$window_release(androidx.window.core.ActivityComponentInfo r6, androidx.window.core.ActivityComponentInfo r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.OooOo.OooO0o0(r7, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L20
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = kotlin.jvm.internal.OooOo.OooO00o(r6, r0)
            if (r6 == 0) goto L6f
            java.lang.String r6 = r7.getClassName()
            boolean r6 = kotlin.jvm.internal.OooOo.OooO00o(r6, r0)
            if (r6 == 0) goto L6f
            goto L6e
        L20:
            java.lang.String r3 = r6.toString()
            boolean r0 = o00O0oO.o000000.Oooo0o(r0, r3)
            if (r0 != 0) goto L70
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = kotlin.jvm.internal.OooOo.OooO00o(r0, r3)
            if (r0 != 0) goto L49
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L47
            goto L49
        L47:
            r0 = r2
            goto L4a
        L49:
            r0 = r1
        L4a:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = kotlin.jvm.internal.OooOo.OooO00o(r3, r4)
            if (r3 != 0) goto L69
            java.lang.String r6 = r6.getClassName()
            java.lang.String r7 = r7.getClassName()
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L67
            goto L69
        L67:
            r6 = r2
            goto L6a
        L69:
            r6 = r1
        L6a:
            if (r0 == 0) goto L6f
            if (r6 == 0) goto L6f
        L6e:
            return r1
        L6f:
            return r2
        L70:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Wildcard can only be part of the rule."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(androidx.window.core.ActivityComponentInfo, androidx.window.core.ActivityComponentInfo):boolean");
    }

    public final boolean isActivityMatching$window_release(Activity activity, ActivityComponentInfo ruleComponent) {
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(ruleComponent, "ruleComponent");
        ComponentName componentName = activity.getComponentName();
        OooOo.OooO0Oo(componentName, "activity.componentName");
        if (areComponentsMatching$window_release(new ActivityComponentInfo(componentName), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window_release(intent, ruleComponent);
        }
        return false;
    }

    public final boolean isIntentMatching$window_release(Intent intent, ActivityComponentInfo ruleComponent) {
        String str;
        OooOo.OooO0o0(intent, "intent");
        OooOo.OooO0o0(ruleComponent, "ruleComponent");
        ComponentName component = intent.getComponent();
        if (areComponentsMatching$window_release(component != null ? new ActivityComponentInfo(component) : null, ruleComponent)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (str.equals(ruleComponent.getPackageName()) || wildcardMatch(str, ruleComponent.getPackageName())) && OooOo.OooO00o(ruleComponent.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return false;
    }

    public final void validateComponentName$window_release(String packageName, String className) {
        OooOo.OooO0o0(packageName, "packageName");
        OooOo.OooO0o0(className, "className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty");
        }
        if (o000000.Oooo0o(ProxyConfig.MATCH_ALL_SCHEMES, packageName) && o000000.OoooO0O(packageName, ProxyConfig.MATCH_ALL_SCHEMES, 0, 6) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (o000000.Oooo0o(ProxyConfig.MATCH_ALL_SCHEMES, className) && o000000.OoooO0O(className, ProxyConfig.MATCH_ALL_SCHEMES, 0, 6) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }
}
