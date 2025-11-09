package ooOO;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.github.superadb.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0O extends ExploreByTouchHelper {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Chip f33229OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Chip chip, Chip chip2) {
        super(chip2);
        this.f33229OooO00o = chip;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f2) {
        Rect rect = Chip.f27493Oooo0oo;
        Chip chip = this.f33229OooO00o;
        return (chip.OooO0Oo() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List list) {
        o00Ooo o00ooo2;
        list.add(0);
        Rect rect = Chip.f27493Oooo0oo;
        Chip chip = this.f33229OooO00o;
        if (!chip.OooO0Oo() || (o00ooo2 = chip.f27496OooOo0O) == null || !o00ooo2.f33244OooooOo || chip.f27499OooOoO0 == null) {
            return;
        }
        list.add(1);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f33229OooO00o;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f27499OooOoO0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f27510Oooo0OO) {
                    chip.f27509Oooo0O0.sendEventForVirtualView(1, 1);
                }
            }
        }
        return z;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Chip chip = this.f33229OooO00o;
        o00Ooo o00ooo2 = chip.f27496OooOo0O;
        accessibilityNodeInfoCompat.setCheckable(o00ooo2 != null && o00ooo2.f33288ooOO);
        accessibilityNodeInfoCompat.setClickable(chip.isClickable());
        accessibilityNodeInfoCompat.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.setText(chip.getText());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i != 1) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.f27493Oooo0oo);
            return;
        }
        Chip chip = this.f33229OooO00o;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfoCompat.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfoCompat.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f33229OooO00o;
            chip.f27504OooOooo = z;
            chip.refreshDrawableState();
        }
    }
}
