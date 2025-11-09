package com.google.android.material.internal;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.ironsource.InterfaceC3173h3;
import o0ooOO0.o00000O0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Rect f27681OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Drawable f27682OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Rect f27683OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final boolean f27684OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f27685OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public boolean f27686OooOoOO;

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f27682OooOo0O;
        if (drawable != null) {
            if (this.f27686OooOoOO) {
                this.f27686OooOoOO = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f27684OooOoO;
                Rect rect = this.f27683OooOo0o;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f27685OooOoO0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f27681OooOo;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f27682OooOo0O;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f27682OooOo0O;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f27682OooOo0O.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f27682OooOo0O;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f27685OooOoO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f27682OooOo0O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f27686OooOoOO = z | this.f27686OooOoOO;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f27686OooOoOO = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f27682OooOo0O;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f27682OooOo0O);
            }
            this.f27682OooOo0O = drawable;
            this.f27686OooOoOO = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f27685OooOoO0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f27685OooOoO0 != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & InterfaceC3173h3.d.b.f8827j) == 0) {
                i |= 48;
            }
            this.f27685OooOoO0 = i;
            if (i == 119 && this.f27682OooOo0O != null) {
                this.f27682OooOo0O.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f27682OooOo0O;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27683OooOo0o = new Rect();
        this.f27681OooOo = new Rect();
        this.f27685OooOoO0 = 119;
        this.f27684OooOoO = true;
        this.f27686OooOoOO = false;
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context, attributeSet, OooOo.OooOo0, i, 0, new int[0]);
        this.f27685OooOoO0 = typedArrayOooO0Oo.getInt(1, this.f27685OooOoO0);
        Drawable drawable = typedArrayOooO0Oo.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f27684OooOoO = typedArrayOooO0Oo.getBoolean(2, true);
        typedArrayOooO0Oo.recycle();
    }
}
