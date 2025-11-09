package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Bundle;
import android.widget.SeekBar;
import androidx.core.math.MathUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.github.superadb.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class OooO extends ExploreByTouchHelper {

    /* renamed from: OooO00o */
    public final BaseSlider f27797OooO00o;

    /* renamed from: OooO0O0 */
    public final Rect f27798OooO0O0;

    public OooO(BaseSlider baseSlider) {
        super(baseSlider);
        this.f27798OooO0O0 = new Rect();
        this.f27797OooO00o = baseSlider;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f, float f2) {
        int i = 0;
        while (true) {
            BaseSlider baseSlider = this.f27797OooO00o;
            if (i >= baseSlider.getValues().size()) {
                return -1;
            }
            Rect rect = this.f27798OooO0O0;
            baseSlider.OooOo0O(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List list) {
        for (int i = 0; i < this.f27797OooO00o.getValues().size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        BaseSlider baseSlider = this.f27797OooO00o;
        if (!baseSlider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                return false;
            }
            float f = bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE);
            int i3 = BaseSlider.o0ooOOo;
            if (!baseSlider.OooOo00(f, i)) {
                return false;
            }
            baseSlider.OooOo0o();
            baseSlider.postInvalidate();
            invalidateVirtualView(i);
            return true;
        }
        int i4 = BaseSlider.o0ooOOo;
        float fRound = baseSlider.f27781OooooOo;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((baseSlider.f27777Ooooo00 - baseSlider.f27776OoooOoo) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (baseSlider.OooOO0O()) {
            fRound = -fRound;
        }
        if (!baseSlider.OooOo00(MathUtils.clamp(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()), i)) {
            return false;
        }
        baseSlider.OooOo0o();
        baseSlider.postInvalidate();
        invalidateVirtualView(i);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
        BaseSlider baseSlider = this.f27797OooO00o;
        List<Float> values = baseSlider.getValues();
        float fFloatValue = values.get(i).floatValue();
        float valueFrom = baseSlider.getValueFrom();
        float valueTo = baseSlider.getValueTo();
        if (baseSlider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (fFloatValue < valueTo) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
        }
        accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
        accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (baseSlider.getContentDescription() != null) {
            sb.append(baseSlider.getContentDescription());
            sb.append(",");
        }
        if (values.size() > 1) {
            sb.append(i == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(R.string.material_slider_range_end) : i == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "");
            sb.append(baseSlider.OooO0o(fFloatValue));
        }
        accessibilityNodeInfoCompat.setContentDescription(sb.toString());
        Rect rect = this.f27798OooO0O0;
        baseSlider.OooOo0O(i, rect);
        accessibilityNodeInfoCompat.setBoundsInParent(rect);
    }
}
