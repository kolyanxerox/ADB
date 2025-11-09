package Oooooo;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class o00oO0o implements AccessibilityViewCommand {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15080OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f15081OooOo0o;

    public o00oO0o(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f15081OooOo0o = bottomSheetBehavior;
        this.f15080OooOo0O = i;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f15081OooOo0o.OooO(this.f15080OooOo0O);
        return true;
    }
}
