package com.google.android.material.internal;

import Oooooo.o0OO00O;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0038R;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import o0ooOO0.OooO0o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: OooOoO0 */
    public static final int[] f27673OooOoO0 = {R.attr.state_checked};

    /* renamed from: OooOo */
    public boolean f27674OooOo;

    /* renamed from: OooOo0O */
    public boolean f27675OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f27676OooOo0o;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0038R.attr.imageButtonStyle);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27675OooOo0O;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f27675OooOo0O ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + 1), f27673OooOoO0) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooO0o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooO0o oooO0o = (OooO0o) parcelable;
        super.onRestoreInstanceState(oooO0o.getSuperState());
        setChecked(oooO0o.f33012OooOo0O);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        OooO0o oooO0o = new OooO0o(super.onSaveInstanceState());
        oooO0o.f33012OooOo0O = this.f27675OooOo0O;
        return oooO0o;
    }

    public void setCheckable(boolean z) {
        if (this.f27676OooOo0o != z) {
            this.f27676OooOo0o = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f27676OooOo0o || this.f27675OooOo0O == z) {
            return;
        }
        this.f27675OooOo0O = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f27674OooOo = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f27674OooOo) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f27675OooOo0O);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27676OooOo0o = true;
        this.f27674OooOo = true;
        ViewCompat.setAccessibilityDelegate(this, new o0OO00O(this, 2));
    }
}
