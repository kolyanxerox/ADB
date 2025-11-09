package com.google.android.material.imageview;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.superadb.R;
import o000000.OooOOO0;
import o000000.Oooo0;
import o000000.Oooo000;
import o000000.o000oOoO;
import o000000.o0Oo0oo;
import o00000O.OooO00o;
import o00oO0O.OooOOO;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements o0Oo0oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final RectF f27654OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000oOoO f27655OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final RectF f27656OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Paint f27657OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Paint f27658OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Path f27659OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public OooOOO0 f27660OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public ColorStateList f27661OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Oooo000 f27662OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public float f27663OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final int f27664Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final Path f27665Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final int f27666Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final int f27667Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final int f27668Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final int f27669Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public boolean f27670Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final int f27671Oooo0o0;

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean OooO00o() {
        return getLayoutDirection() == 1;
    }

    public final void OooO0O0(int i, int i2) {
        RectF rectF = this.f27656OooOo0o;
        rectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        Oooo000 oooo000 = this.f27662OooOooO;
        Path path = this.f27659OooOoOO;
        this.f27655OooOo0O.OooO00o(oooo000, 1.0f, rectF, null, path);
        Path path2 = this.f27665Oooo000;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f27654OooOo;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f27668Oooo0O0;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.f27671Oooo0o0;
        return i != Integer.MIN_VALUE ? i : OooO00o() ? this.f27666Oooo00O : this.f27664Oooo0;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.f27669Oooo0OO != Integer.MIN_VALUE || this.f27671Oooo0o0 != Integer.MIN_VALUE) {
            if (OooO00o() && (i2 = this.f27671Oooo0o0) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!OooO00o() && (i = this.f27669Oooo0OO) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f27666Oooo00O;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.f27669Oooo0OO != Integer.MIN_VALUE || this.f27671Oooo0o0 != Integer.MIN_VALUE) {
            if (OooO00o() && (i2 = this.f27669Oooo0OO) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!OooO00o() && (i = this.f27671Oooo0o0) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f27664Oooo0;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.f27669Oooo0OO;
        return i != Integer.MIN_VALUE ? i : OooO00o() ? this.f27664Oooo0 : this.f27666Oooo00O;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f27667Oooo00o;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public Oooo000 getShapeAppearanceModel() {
        return this.f27662OooOooO;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f27661OooOoo0;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f27663OooOooo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f27665Oooo000, this.f27657OooOoO);
        if (this.f27661OooOoo0 == null) {
            return;
        }
        Paint paint = this.f27658OooOoO0;
        paint.setStrokeWidth(this.f27663OooOooo);
        int colorForState = this.f27661OooOoo0.getColorForState(getDrawableState(), this.f27661OooOoo0.getDefaultColor());
        if (this.f27663OooOooo <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f27659OooOoOO, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f27670Oooo0o && isLayoutDirectionResolved()) {
            this.f27670Oooo0o = true;
            if (!isPaddingRelative() && this.f27669Oooo0OO == Integer.MIN_VALUE && this.f27671Oooo0o0 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OooO0O0(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // o000000.o0Oo0oo
    public void setShapeAppearanceModel(@NonNull Oooo000 oooo000) {
        this.f27662OooOooO = oooo000;
        OooOOO0 oooOOO0 = this.f27660OooOoo;
        if (oooOOO0 != null) {
            oooOOO0.setShapeAppearanceModel(oooo000);
        }
        OooO0O0(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f27661OooOoo0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.f27663OooOooo != f) {
            this.f27663OooOooo = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.f27655OooOo0O = Oooo0.f29081OooO00o;
        this.f27659OooOoOO = new Path();
        this.f27670Oooo0o = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f27657OooOoO = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f27656OooOo0o = new RectF();
        this.f27654OooOo = new RectF();
        this.f27665Oooo000 = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, OooOo.f14994OoooOO0, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f27661OooOoo0 = OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 9);
        this.f27663OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f27666Oooo00O = dimensionPixelSize;
        this.f27667Oooo00o = dimensionPixelSize;
        this.f27664Oooo0 = dimensionPixelSize;
        this.f27668Oooo0O0 = dimensionPixelSize;
        this.f27666Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f27667Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f27664Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f27668Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f27669Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f27671Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f27658OooOoO0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f27662OooOooO = Oooo000.OooO0O0(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).OooO00o();
        setOutlineProvider(new OooOOO(this));
    }
}
