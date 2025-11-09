package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o0OO00O.OooO;
import o0OO00O.OooOO0;
import o0OO00O.OooOo00;
import o0OO00O.o00O0O;
import o0OO00O.o00Oo0;
import o0OO00O.o0OoOo0;
import o0OO00O.oo000o;

/* loaded from: classes2.dex */
public final class LinearProgressIndicator extends OooO {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f27739Oooo00O = 0;

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // o0OO00O.OooO
    public final OooOO0 OooO00o(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // o0OO00O.OooO
    public final void OooO0O0(int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (oooOO0 != null && ((LinearProgressIndicatorSpec) oooOO0).f27741OooO0oO == 0 && isIndeterminate()) {
            return;
        }
        super.OooO0O0(i);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f32830OooOo0O).f27741OooO0oO;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f32830OooOo0O).f27742OooO0oo;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooOO0 oooOO0 = this.f32830OooOo0O;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) oooOO0;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) oooOO0).f27742OooO0oo != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) oooOO0).f27742OooO0oo != 2) && (ViewCompat.getLayoutDirection(this) != 0 || ((LinearProgressIndicatorSpec) oooOO0).f27742OooO0oo != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f27740OooO = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        o0OoOo0 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        OooOo00 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (((LinearProgressIndicatorSpec) oooOO0).f27741OooO0oO == i) {
            return;
        }
        if (OooO0OO() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) oooOO0).f27741OooO0oO = i;
        ((LinearProgressIndicatorSpec) oooOO0).OooO00o();
        if (i == 0) {
            o0OoOo0 indeterminateDrawable = getIndeterminateDrawable();
            o00Oo0 o00oo0 = new o00Oo0((LinearProgressIndicatorSpec) oooOO0);
            indeterminateDrawable.f32903Oooo00o = o00oo0;
            o00oo0.f32888OooO00o = indeterminateDrawable;
        } else {
            o0OoOo0 indeterminateDrawable2 = getIndeterminateDrawable();
            oo000o oo000oVar = new oo000o(getContext(), (LinearProgressIndicatorSpec) oooOO0);
            indeterminateDrawable2.f32903Oooo00o = oo000oVar;
            oo000oVar.f32888OooO00o = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // o0OO00O.OooO
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f32830OooOo0O).OooO00o();
    }

    public void setIndicatorDirection(int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        ((LinearProgressIndicatorSpec) oooOO0).f27742OooO0oo = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) oooOO0;
        boolean z = true;
        if (i != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) oooOO0).f27742OooO0oo != 2) && (ViewCompat.getLayoutDirection(this) != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.f27740OooO = z;
        invalidate();
    }

    @Override // o0OO00O.OooO
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f32830OooOo0O).OooO00o();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f32830OooOo0O;
        setIndeterminateDrawable(new o0OoOo0(context2, linearProgressIndicatorSpec, new o00O0O(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f27741OooO0oO == 0 ? new o00Oo0(linearProgressIndicatorSpec) : new oo000o(context2, linearProgressIndicatorSpec)));
        setProgressDrawable(new OooOo00(getContext(), linearProgressIndicatorSpec, new o00O0O(linearProgressIndicatorSpec)));
    }
}
