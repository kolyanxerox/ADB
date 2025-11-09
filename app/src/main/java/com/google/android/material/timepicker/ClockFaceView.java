package com.google.android.material.timepicker;

import Ooooo00.OooOo;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import java.util.Arrays;

/* loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements OooO0o {

    /* renamed from: OooOoO */
    public final Rect f27948OooOoO;

    /* renamed from: OooOoO0 */
    public final ClockHandView f27949OooOoO0;

    /* renamed from: OooOoOO */
    public final RectF f27950OooOoOO;

    /* renamed from: OooOoo */
    public final OooO0OO f27951OooOoo;

    /* renamed from: OooOoo0 */
    public final SparseArray f27952OooOoo0;

    /* renamed from: OooOooO */
    public final int[] f27953OooOooO;

    /* renamed from: OooOooo */
    public final float[] f27954OooOooo;

    /* renamed from: Oooo0 */
    public final int f27955Oooo0;

    /* renamed from: Oooo000 */
    public final int f27956Oooo000;

    /* renamed from: Oooo00O */
    public final int f27957Oooo00O;

    /* renamed from: Oooo00o */
    public final int f27958Oooo00o;

    /* renamed from: Oooo0O0 */
    public final String[] f27959Oooo0O0;

    /* renamed from: Oooo0OO */
    public float f27960Oooo0OO;

    /* renamed from: Oooo0o0 */
    public final ColorStateList f27961Oooo0o0;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public final void OooO0O0() {
        RadialGradient radialGradient;
        RectF rectF = this.f27949OooOoO0.f27965OooOoO;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f27952OooOoo0;
            if (i >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i);
            if (textView != null) {
                Rect rect = this.f27948OooOoO;
                textView.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(textView, rect);
                textView.setSelected(rectF.contains(rect.centerX(), rect.centerY()));
                RectF rectF2 = this.f27950OooOoOO;
                rectF2.set(rect);
                rectF2.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f27953OooOooO, this.f27954OooOooo, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f27959Oooo0O0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0O0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f27955Oooo0 / Math.max(Math.max(this.f27957Oooo00O / displayMetrics.heightPixels, this.f27958Oooo00o / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, BasicMeasure.EXACTLY);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27948OooOoO = new Rect();
        this.f27950OooOoOO = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f27952OooOoo0 = sparseArray;
        this.f27954OooOooo = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo.OooOO0o, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListOooO00o = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 1);
        this.f27961Oooo0o0 = colorStateListOooO00o;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f27949OooOoO0 = clockHandView;
        this.f27956Oooo000 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListOooO00o.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListOooO00o.getDefaultColor());
        this.f27953OooOooO = new int[]{colorForState, colorForState, colorStateListOooO00o.getDefaultColor()};
        clockHandView.f27963OooOo0O.add(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListOooO00o2 = oo0o0Oo.OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListOooO00o2 != null ? colorStateListOooO00o2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new OooO0O0(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27951OooOoo = new OooO0OO(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f27959Oooo0O0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f27959Oooo0O0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f27959Oooo0O0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f27959Oooo0O0[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                ViewCompat.setAccessibilityDelegate(textView, this.f27951OooOoo);
                textView.setTextColor(this.f27961Oooo0o0);
            }
        }
        this.f27957Oooo00O = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f27958Oooo00o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f27955Oooo0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
