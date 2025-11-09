package com.google.android.material.circularreveal.cardview;

import OooOOo0.o0OOO0o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.material.card.MaterialCardView;
import o00O0O.OooO;
import o00O0O.OooO0o;

/* loaded from: classes2.dex */
public class CircularRevealCardView extends MaterialCardView implements OooO {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final o0OOO0o f27524OooOoo;

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27524OooOoo = new o0OOO0o(this);
    }

    @Override // o00O0O.OooO
    public final void OooO00o() {
        this.f27524OooOoo.getClass();
    }

    @Override // o00O0O.OooO
    public final void OooO0O0() {
        this.f27524OooOoo.getClass();
    }

    @Override // o00O0O.OooO
    public final void OooO0OO(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // o00O0O.OooO
    public final boolean OooO0Oo() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o0OOO0o o0ooo0o = this.f27524OooOoo;
        if (o0ooo0o != null) {
            o0ooo0o.OooO0o0(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.f27524OooOoo.f13521OooOoOO;
    }

    @Override // o00O0O.OooO
    public int getCircularRevealScrimColor() {
        return ((Paint) this.f27524OooOoo.f13520OooOoO0).getColor();
    }

    @Override // o00O0O.OooO
    @Nullable
    public OooO0o getRevealInfo() {
        return this.f27524OooOoo.OooO0oO();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        o0OOO0o o0ooo0o = this.f27524OooOoo;
        return o0ooo0o != null ? o0ooo0o.OooOO0O() : super.isOpaque();
    }

    @Override // o00O0O.OooO
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f27524OooOoo.OooOOOo(drawable);
    }

    @Override // o00O0O.OooO
    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.f27524OooOoo.OooOOo0(i);
    }

    @Override // o00O0O.OooO
    public void setRevealInfo(@Nullable OooO0o oooO0o) {
        this.f27524OooOoo.OooOOo(oooO0o);
    }
}
