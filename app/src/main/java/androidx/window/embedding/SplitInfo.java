package androidx.window.embedding;

import android.app.Activity;
import android.os.IBinder;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final SplitAttributes splitAttributes;
    private final IBinder token;

    public SplitInfo(ActivityStack primaryActivityStack, ActivityStack secondaryActivityStack, SplitAttributes splitAttributes, IBinder token) {
        OooOo.OooO0o0(primaryActivityStack, "primaryActivityStack");
        OooOo.OooO0o0(secondaryActivityStack, "secondaryActivityStack");
        OooOo.OooO0o0(splitAttributes, "splitAttributes");
        OooOo.OooO0o0(token, "token");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitAttributes = splitAttributes;
        this.token = token;
    }

    public final boolean contains(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        return OooOo.OooO00o(this.primaryActivityStack, splitInfo.primaryActivityStack) && OooOo.OooO00o(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && OooOo.OooO00o(this.splitAttributes, splitInfo.splitAttributes) && OooOo.OooO00o(this.token, splitInfo.token);
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final SplitAttributes getSplitAttributes() {
        return this.splitAttributes;
    }

    public final IBinder getToken$window_release() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + ((this.splitAttributes.hashCode() + ((this.secondaryActivityStack.hashCode() + (this.primaryActivityStack.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.primaryActivityStack + ", ");
        sb.append("secondaryActivityStack=" + this.secondaryActivityStack + ", ");
        sb.append("splitAttributes=" + this.splitAttributes + ", ");
        StringBuilder sb2 = new StringBuilder("token=");
        sb2.append(this.token);
        sb.append(sb2.toString());
        sb.append("}");
        String string = sb.toString();
        OooOo.OooO0Oo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
