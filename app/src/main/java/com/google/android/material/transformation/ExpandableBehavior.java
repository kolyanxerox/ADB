package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import o00000Oo.OooO0OO;
import oo000o.OooO00o;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f27984OooO00o;

    public ExpandableBehavior() {
        this.f27984OooO00o = 0;
    }

    public abstract void OooO00o(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (OooO00o) view2;
        boolean z = ((FloatingActionButton) obj).f27650Oooo0O0.f26093OooO00o;
        if (z) {
            int i = this.f27984OooO00o;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f27984OooO00o != 1) {
            return false;
        }
        this.f27984OooO00o = z ? 1 : 2;
        OooO00o((View) obj, view, z, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooO00o oooO00o;
        int i2;
        if (!ViewCompat.isLaidOut(view)) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    oooO00o = null;
                    break;
                }
                View view2 = dependencies.get(i3);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    oooO00o = (OooO00o) view2;
                    break;
                }
                i3++;
            }
            if (oooO00o != null) {
                boolean z = ((FloatingActionButton) oooO00o).f27650Oooo0O0.f26093OooO00o;
                if (!z ? this.f27984OooO00o == 1 : !((i2 = this.f27984OooO00o) != 0 && i2 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.f27984OooO00o = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new OooO0OO(this, view, i4, oooO00o));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27984OooO00o = 0;
    }
}
