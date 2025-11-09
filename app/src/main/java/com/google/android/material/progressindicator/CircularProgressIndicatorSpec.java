package com.google.android.material.progressindicator;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.superadb.R;
import o0OO00O.OooOO0;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public final class CircularProgressIndicatorSpec extends OooOO0 {

    /* renamed from: OooO */
    public int f27736OooO;

    /* renamed from: OooO0oO */
    public int f27737OooO0oO;

    /* renamed from: OooO0oo */
    public int f27738OooO0oo;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    @Override // o0OO00O.OooOO0
    public final void OooO00o() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) throws Resources.NotFoundException {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i2 = CircularProgressIndicator.f27735Oooo00O;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = OooOo.f14960OooOO0O;
        o00000O0.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        o00000O0.OooO0O0(context, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.f27737OooO0oO = Math.max(OooO0OO.OooO0OO(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), this.f32844OooO00o * 2);
        this.f27738OooO0oo = OooO0OO.OooO0OO(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        this.f27736OooO = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
