package com.google.android.material.textview;

import Ooooo00.OooOo;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import o00000O.OooO00o;
import oo0o0Oo.OooO0O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (OooO0O0.OooO0O0(context, com.github.superadb.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, OooOo.f14980Oooo0);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iOooO0OO = -1;
            for (int i2 = 0; i2 < 2 && iOooO0OO < 0; i2++) {
                iOooO0OO = OooO0OO.OooO0OO(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO >= 0) {
                setLineHeight(iOooO0OO);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(OooO00o.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (OooO0O0.OooO0O0(context2, com.github.superadb.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = OooOo.f14984Oooo0O0;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int[] iArr2 = {1, 2};
            int iOooO0OO = -1;
            for (int i2 = 0; i2 < 2 && iOooO0OO < 0; i2++) {
                iOooO0OO = OooO0OO.OooO0OO(context2, typedArrayObtainStyledAttributes, iArr2[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, OooOo.f14980Oooo0);
                Context context3 = getContext();
                int[] iArr3 = {1, 2};
                int iOooO0OO2 = -1;
                for (int i3 = 0; i3 < 2 && iOooO0OO2 < 0; i3++) {
                    iOooO0OO2 = OooO0OO.OooO0OO(context3, typedArrayObtainStyledAttributes3, iArr3[i3], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iOooO0OO2 >= 0) {
                    setLineHeight(iOooO0OO2);
                }
            }
        }
    }
}
