package o000000O;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o000000.OooOOO0;
import o000000.Oooo000;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public abstract class OooO0o extends FrameLayout {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final OooO0OO f29132OooOooO = new OooO0OO();

    /* renamed from: OooOo, reason: collision with root package name */
    public final float f29133OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Oooo000 f29134OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f29135OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f29136OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final float f29137OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f29138OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public PorterDuff.Mode f29139OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public ColorStateList f29140OooOoo0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0o(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        Drawable drawableWrap;
        super(o00000O.OooO00o.OooO00o(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, OooOo.f14995OoooOOO);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            ViewCompat.setElevation(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f29135OooOo0o = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f29134OooOo0O = Oooo000.OooO0O0(context2, attributeSet, 0, 0).OooO00o();
        }
        this.f29133OooOo = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(o0000oo.OooO0o0(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f29137OooOoO0 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f29136OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f29138OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f29132OooOooO);
        setFocusable(true);
        if (getBackground() == null) {
            int iOooOOo = OooO00o.OooO00o.OooOOo(getBackgroundOverlayColorAlpha(), OooO00o.OooO00o.OooOO0o(this, R.attr.colorSurface), OooO00o.OooO00o.OooOO0o(this, R.attr.colorOnSurface));
            Oooo000 oooo000 = this.f29134OooOo0O;
            if (oooo000 != null) {
                int i = OooO.f29131OooO00o;
                OooOOO0 oooOOO0 = new OooOOO0(oooo000);
                oooOOO0.OooOOO0(ColorStateList.valueOf(iOooOOo));
                gradientDrawable = oooOOO0;
            } else {
                Resources resources = getResources();
                int i2 = OooO.f29131OooO00o;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iOooOOo);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f29140OooOoo0 != null) {
                drawableWrap = DrawableCompat.wrap(gradientDrawable);
                DrawableCompat.setTintList(drawableWrap, this.f29140OooOoo0);
            } else {
                drawableWrap = DrawableCompat.wrap(gradientDrawable);
            }
            ViewCompat.setBackground(this, drawableWrap);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f29137OooOoO0;
    }

    public int getAnimationMode() {
        return this.f29135OooOo0o;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f29133OooOo;
    }

    public int getMaxInlineActionWidth() {
        return this.f29138OooOoOO;
    }

    public int getMaxWidth() {
        return this.f29136OooOoO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewCompat.requestApplyInsets(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f29136OooOoO;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY), i2);
    }

    public void setAnimationMode(int i) {
        this.f29135OooOo0o = i;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        if (drawable != null && this.f29140OooOoo0 != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawable, this.f29140OooOoo0);
            DrawableCompat.setTintMode(drawable, this.f29139OooOoo);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f29140OooOoo0 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
            DrawableCompat.setTintList(drawableWrap, colorStateList);
            DrawableCompat.setTintMode(drawableWrap, this.f29139OooOoo);
            if (drawableWrap != getBackground()) {
                super.setBackgroundDrawable(drawableWrap);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.f29139OooOoo = mode;
        if (getBackground() != null) {
            Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
            DrawableCompat.setTintMode(drawableWrap, mode);
            if (drawableWrap != getBackground()) {
                super.setBackgroundDrawable(drawableWrap);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f29132OooOooO);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(OooO oooO) {
    }
}
