package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o000000.OooOOOO;
import o000000.OooOo;

/* loaded from: classes2.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o000000.OooOOO0 f27979OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooO f27980OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f27981OooOo0o;

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO00o() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                constraintSet.constrainCircle(childAt.getId(), R.id.circle_center, this.f27981OooOo0o, f);
                f = (360.0f / (childCount - i)) + f;
            }
        }
        constraintSet.applyTo(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            OooO oooO = this.f27980OooOo0O;
            handler.removeCallbacks(oooO);
            handler.post(oooO);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        OooO00o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            OooO oooO = this.f27980OooOo0O;
            handler.removeCallbacks(oooO);
            handler.post(oooO);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f27979OooOo.OooOOO0(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.material.timepicker.OooO] */
    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
        this.f27979OooOo = oooOOO0;
        OooOOOO oooOOOO = new OooOOOO(0.5f);
        OooOo oooOoOooO0o = oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o();
        oooOoOooO0o.f29076OooO0o0 = oooOOOO;
        oooOoOooO0o.f29075OooO0o = oooOOOO;
        oooOoOooO0o.f29077OooO0oO = oooOOOO;
        oooOoOooO0o.f29078OooO0oo = oooOOOO;
        oooOOO0.setShapeAppearanceModel(oooOoOooO0o.OooO00o());
        this.f27979OooOo.OooOOO0(ColorStateList.valueOf(-1));
        ViewCompat.setBackground(this, this.f27979OooOo);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14979Oooo, i, 0);
        this.f27981OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f27980OooOo0O = new Runnable() { // from class: com.google.android.material.timepicker.OooO
            @Override // java.lang.Runnable
            public final void run() {
                this.f27972OooOo0O.OooO00o();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
