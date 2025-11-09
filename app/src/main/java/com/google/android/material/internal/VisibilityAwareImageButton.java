package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f27703OooOo0O;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO00o(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f27703OooOo0O = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f27703OooOo0O;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        OooO00o(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27703OooOo0O = getVisibility();
    }
}
