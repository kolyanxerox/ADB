package com.google.android.material.progressindicator;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.superadb.R;
import o0OO00O.OooOO0;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public final class LinearProgressIndicatorSpec extends OooOO0 {

    /* renamed from: OooO */
    public boolean f27740OooO;

    /* renamed from: OooO0oO */
    public int f27741OooO0oO;

    /* renamed from: OooO0oo */
    public int f27742OooO0oo;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // o0OO00O.OooOO0
    public final void OooO00o() {
        if (this.f27741OooO0oO == 0) {
            if (this.f32845OooO0O0 > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f32846OooO0OO.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i2 = LinearProgressIndicator.f27739Oooo00O;
        int[] iArr = OooOo.f14971OooOo0o;
        o00000O0.OooO00o(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        o00000O0.OooO0O0(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        this.f27741OooO0oO = typedArrayObtainStyledAttributes.getInt(0, 1);
        this.f27742OooO0oo = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO00o();
        this.f27740OooO = this.f27742OooO0oo == 1;
    }
}
