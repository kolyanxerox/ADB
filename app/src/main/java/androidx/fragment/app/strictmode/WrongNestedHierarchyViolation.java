package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    public WrongNestedHierarchyViolation(Fragment fragment, Fragment expectedParentFragment, int i) {
        OooOo.OooO0o0(fragment, "fragment");
        OooOo.OooO0o0(expectedParentFragment, "expectedParentFragment");
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(fragment);
        sb.append(" within the view of parent fragment ");
        sb.append(expectedParentFragment);
        sb.append(" via container with ID ");
        super(fragment, OooO0oO.OooOo.OooOOO(sb, i, " without using parent's childFragmentManager"));
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
