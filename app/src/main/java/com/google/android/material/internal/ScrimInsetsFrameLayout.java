package com.google.android.material.internal;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.superadb.R;
import o000Ooo.o00oO0o;
import o0ooOO0.o00000O0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: OooOo */
    public final Rect f27698OooOo;

    /* renamed from: OooOo0O */
    public Drawable f27699OooOo0O;

    /* renamed from: OooOo0o */
    public Rect f27700OooOo0o;

    /* renamed from: OooOoO */
    public boolean f27701OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f27702OooOoO0;

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void OooO00o(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f27700OooOo0o == null || this.f27699OooOo0O == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z = this.f27702OooOoO0;
        Rect rect = this.f27698OooOo;
        if (z) {
            rect.set(0, 0, width, this.f27700OooOo0o.top);
            this.f27699OooOo0O.setBounds(rect);
            this.f27699OooOo0O.draw(canvas);
        }
        if (this.f27701OooOoO) {
            rect.set(0, height - this.f27700OooOo0o.bottom, width, height);
            this.f27699OooOo0O.setBounds(rect);
            this.f27699OooOo0O.draw(canvas);
        }
        Rect rect2 = this.f27700OooOo0o;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f27699OooOo0O.setBounds(rect);
        this.f27699OooOo0O.draw(canvas);
        Rect rect3 = this.f27700OooOo0o;
        rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
        this.f27699OooOo0O.setBounds(rect);
        this.f27699OooOo0O.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f27699OooOo0O;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f27699OooOo0O;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f27701OooOoO = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f27702OooOoO0 = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f27699OooOo0O = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27698OooOo = new Rect();
        this.f27702OooOoO0 = true;
        this.f27701OooOoO = true;
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context, attributeSet, OooOo.f14991OoooO0, i, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f27699OooOo0O = typedArrayOooO0Oo.getDrawable(0);
        typedArrayOooO0Oo.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new o00oO0o(this, 20));
    }
}
