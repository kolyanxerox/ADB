package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.github.superadb.R;
import o0OO00O.OooO;
import o0OO00O.OooOO0;
import o0OO00O.OooOO0O;
import o0OO00O.OooOOO;
import o0OO00O.OooOo00;
import o0OO00O.o0OoOo0;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends OooO {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static final /* synthetic */ int f27735Oooo00O = 0;

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    @Override // o0OO00O.OooO
    public final OooOO0 OooO00o(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f32830OooOo0O).f27736OooO;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f32830OooOo0O).f27738OooO0oo;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f32830OooOo0O).f27737OooO0oO;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f32830OooOo0O).f27736OooO = i;
        invalidate();
    }

    public void setIndicatorInset(@Px int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (((CircularProgressIndicatorSpec) oooOO0).f27738OooO0oo != i) {
            ((CircularProgressIndicatorSpec) oooOO0).f27738OooO0oo = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (((CircularProgressIndicatorSpec) oooOO0).f27737OooO0oO != iMax) {
            ((CircularProgressIndicatorSpec) oooOO0).f27737OooO0oO = iMax;
            ((CircularProgressIndicatorSpec) oooOO0).getClass();
            invalidate();
        }
    }

    @Override // o0OO00O.OooO
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f32830OooOo0O).getClass();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f32830OooOo0O;
        setIndeterminateDrawable(new o0OoOo0(context2, circularProgressIndicatorSpec, new OooOO0O(circularProgressIndicatorSpec), new OooOOO(circularProgressIndicatorSpec)));
        setProgressDrawable(new OooOo00(getContext(), circularProgressIndicatorSpec, new OooOO0O(circularProgressIndicatorSpec)));
    }
}
