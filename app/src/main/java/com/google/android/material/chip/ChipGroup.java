package com.google.android.material.chip;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import com.google.android.material.internal.FlowLayout;
import java.util.Iterator;
import java.util.List;
import o00000O.OooO00o;
import o0ooOO0.OooO0OO;
import o0ooOO0.OooOOO;
import o0ooOO0.o00000O0;
import ooOO.o00oO0o;
import ooOO.o0OOO0o;
import ooOO.o0ooOOo;
import ooOO.oo000o;

/* loaded from: classes2.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f27514OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f27515OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final OooO0OO f27516OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public o0ooOOo f27517OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final int f27518OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final o0OOO0o f27519OooOooo;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean OooO00o() {
        return this.f27677OooOo;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f27516OooOoo.OooO0OO();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f27516OooOoo.OooO0O0(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f27514OooOoO;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f27515OooOoOO;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f27518OooOooO;
        if (i != -1) {
            OooO0OO oooO0OO = this.f27516OooOoo;
            OooOOO oooOOO = (OooOOO) oooO0OO.f33007OooO00o.get(Integer.valueOf(i));
            if (oooOOO != null && oooO0OO.OooO00o(oooOOO)) {
                oooO0OO.OooO0Oo();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), this.f27677OooOo ? getVisibleChipCount() : -1, false, this.f27516OooOoo.f33010OooO0Oo ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.f27514OooOoO != i) {
            this.f27514OooOoO = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@DimenRes int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@Dimension int i) {
        if (this.f27515OooOoOO != i) {
            this.f27515OooOoOO = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable o00oO0o o00oo0o) {
        if (o00oo0o == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new oo000o(this));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable o0ooOOo o0ooooo) {
        this.f27517OooOoo0 = o0ooooo;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f27519OooOooo.f33289OooOo0O = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f27516OooOoo.f33011OooO0o0 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        OooO0OO oooO0OO = this.f27516OooOoo;
        if (oooO0OO.f33010OooO0Oo != z) {
            oooO0OO.f33010OooO0Oo = z;
            boolean zIsEmpty = oooO0OO.f33008OooO0O0.isEmpty();
            Iterator it = oooO0OO.f33007OooO00o.values().iterator();
            while (it.hasNext()) {
                oooO0OO.OooO0o0((OooOOO) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            oooO0OO.OooO0Oo();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        OooO0OO oooO0OO = new OooO0OO();
        this.f27516OooOoo = oooO0OO;
        o0OOO0o o0ooo0o = new o0OOO0o(this);
        this.f27519OooOooo = o0ooo0o;
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(getContext(), attributeSet, OooOo.f14959OooOO0, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayOooO0Oo.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayOooO0Oo.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayOooO0Oo.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayOooO0Oo.getBoolean(5, false));
        setSingleSelection(typedArrayOooO0Oo.getBoolean(6, false));
        setSelectionRequired(typedArrayOooO0Oo.getBoolean(4, false));
        this.f27518OooOooO = typedArrayOooO0Oo.getResourceId(0, -1);
        typedArrayOooO0Oo.recycle();
        oooO0OO.f33009OooO0OO = new oo000o(this);
        super.setOnHierarchyChangeListener(o0ooo0o);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
