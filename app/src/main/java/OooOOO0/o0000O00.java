package Oooooo0;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o0OOO0o.OooO;
import o0OOO0o.OooO0OO;

/* loaded from: classes2.dex */
public final class o0000O00 extends OooO {

    /* renamed from: OoooOoo, reason: collision with root package name */
    public final int f15095OoooOoo;

    /* renamed from: Ooooo00, reason: collision with root package name */
    public final int f15096Ooooo00;

    /* renamed from: Ooooo0o, reason: collision with root package name */
    public final int f15097Ooooo0o;

    /* renamed from: OooooO0, reason: collision with root package name */
    public final int f15098OooooO0;

    /* renamed from: OooooOO, reason: collision with root package name */
    public boolean f15099OooooOO;

    /* renamed from: OooooOo, reason: collision with root package name */
    public final int[] f15100OooooOo;

    public o0000O00(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f15095OoooOoo = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f15096Ooooo00 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f15097Ooooo0o = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f15098OooooO0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
        this.f15100OooooOo = new int[5];
    }

    @Override // o0OOO0o.OooO
    public final OooO0OO OooO0Oo(Context context) {
        return new o0000(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, BasicMeasure.EXACTLY);
        boolean zOooO0o0 = OooO.OooO0o0(getLabelVisibilityMode(), size2);
        int[] iArr = this.f15100OooooOo;
        int i3 = this.f15097Ooooo0o;
        if (zOooO0o0 && this.f15099OooooOO) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f15098OooooO0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f15096Ooooo00 * i4), Math.min(iMax, i3));
            int i5 = size - iMin;
            int iMin2 = Math.min(i5 / (i4 != 0 ? i4 : 1), this.f15095OoooOoo);
            int i6 = i5 - (i4 * iMin2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    int i8 = i7 == getSelectedItemPosition() ? iMin : iMin2;
                    iArr[i7] = i8;
                    if (i6 > 0) {
                        iArr[i7] = i8 + 1;
                        i6--;
                    }
                } else {
                    iArr[i7] = 0;
                }
                i7++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i3);
            int i9 = size - (size2 * iMin3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    iArr[i10] = iMin3;
                    if (i9 > 0) {
                        iArr[i10] = iMin3 + 1;
                        i9--;
                    }
                } else {
                    iArr[i10] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(iArr[i11], BasicMeasure.EXACTLY), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, BasicMeasure.EXACTLY), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f15099OooooOO = z;
    }
}
