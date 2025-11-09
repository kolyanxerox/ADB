package OooooOO;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public final class oOOO000o implements AccessibilityViewCommand {

    /* renamed from: OooOo0O */
    public final /* synthetic */ SwipeDismissBehavior f15045OooOo0O;

    public oOOO000o(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15045OooOo0O = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        SwipeDismissBehavior swipeDismissBehavior = this.f15045OooOo0O;
        if (!swipeDismissBehavior.OooO00o(view)) {
            return false;
        }
        boolean z = ViewCompat.getLayoutDirection(view) == 1;
        int i = swipeDismissBehavior.f27340OooO0OO;
        ViewCompat.offsetLeftAndRight(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}
