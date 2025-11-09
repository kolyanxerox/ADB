package com.google.android.material.slider;

import OooO0oO.OooOo;
import Ooooo0o.oo0o0O0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o000000.Oooo000;
import o000Ooo.o00oO0o;
import o0ooOO0.o000000;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L, T> extends View {
    public static final /* synthetic */ int o0ooOOo = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final Paint f27746OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Paint f27747OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Paint f27748OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final Paint f27749OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Paint f27750OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Paint f27751OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final AccessibilityManager f27752OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final OooO f27753OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public OooO0o f27754OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f27755OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final int f27756Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public boolean f27757Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final ArrayList f27758Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final ArrayList f27759Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final ArrayList f27760Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public ValueAnimator f27761Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public ValueAnimator f27762Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public final int f27763Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final int f27764Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final int f27765Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final int f27766Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public int f27767OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public int f27768OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public int f27769OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public int f27770OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public int f27771OoooOO0;

    /* renamed from: OoooOOO, reason: collision with root package name */
    public final int f27772OoooOOO;

    /* renamed from: OoooOOo, reason: collision with root package name */
    public float f27773OoooOOo;

    /* renamed from: OoooOo0, reason: collision with root package name */
    public MotionEvent f27774OoooOo0;

    /* renamed from: OoooOoO, reason: collision with root package name */
    public boolean f27775OoooOoO;

    /* renamed from: OoooOoo, reason: collision with root package name */
    public float f27776OoooOoo;

    /* renamed from: Ooooo00, reason: collision with root package name */
    public float f27777Ooooo00;

    /* renamed from: Ooooo0o, reason: collision with root package name */
    public ArrayList f27778Ooooo0o;

    /* renamed from: OooooO0, reason: collision with root package name */
    public int f27779OooooO0;

    /* renamed from: OooooOO, reason: collision with root package name */
    public int f27780OooooOO;

    /* renamed from: OooooOo, reason: collision with root package name */
    public float f27781OooooOo;

    /* renamed from: Oooooo, reason: collision with root package name */
    public boolean f27782Oooooo;

    /* renamed from: Oooooo0, reason: collision with root package name */
    public float[] f27783Oooooo0;

    /* renamed from: OoooooO, reason: collision with root package name */
    public int f27784OoooooO;

    /* renamed from: Ooooooo, reason: collision with root package name */
    public boolean f27785Ooooooo;
    public int o000oOoO;

    /* renamed from: o00O0O, reason: collision with root package name */
    public ColorStateList f27786o00O0O;

    /* renamed from: o00Oo0, reason: collision with root package name */
    public ColorStateList f27787o00Oo0;

    /* renamed from: o00Ooo, reason: collision with root package name */
    public ColorStateList f27788o00Ooo;

    /* renamed from: o00o0O, reason: collision with root package name */
    public ColorStateList f27789o00o0O;

    /* renamed from: o00oO0O, reason: collision with root package name */
    public float f27790o00oO0O;

    /* renamed from: o00oO0o, reason: collision with root package name */
    public List f27791o00oO0o;

    /* renamed from: o00ooo, reason: collision with root package name */
    public final o000000.OooOOO0 f27792o00ooo;

    /* renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f27793o0OoOo0;

    /* renamed from: o0ooOO0, reason: collision with root package name */
    public int f27794o0ooOO0;

    /* renamed from: oo000o, reason: collision with root package name */
    public Drawable f27795oo000o;

    /* renamed from: ooOO, reason: collision with root package name */
    public ColorStateList f27796ooOO;

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public final boolean OooO() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO00o(Drawable drawable) {
        int i = this.f27771OoooOO0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int OooO0O0() {
        int i = this.f27769OoooO00 / 2;
        int i2 = this.f27768OoooO0;
        return i + ((i2 == 1 || i2 == 3) ? ((o00000OO.OooO0O0) this.f27758Oooo000.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator OooO0OO(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f27762Oooo0OO : this.f27761Oooo0O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.setDuration(z ? 83L : 117L);
        valueAnimatorOfFloat.setInterpolator(z ? oo0o0O0.f15019OooO0o0 : oo0o0O0.f15017OooO0OO);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0(this));
        return valueAnimatorOfFloat;
    }

    public final void OooO0Oo(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f27767OoooO + ((int) (OooOOOO(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final String OooO0o(float f) {
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final void OooO0o0() {
        if (this.f27757Oooo0) {
            this.f27757Oooo0 = false;
            ValueAnimator valueAnimatorOooO0OO = OooO0OO(false);
            this.f27762Oooo0OO = valueAnimatorOooO0OO;
            this.f27761Oooo0O0 = null;
            valueAnimatorOooO0OO.addListener(new OooO0OO(this));
            this.f27762Oooo0OO.start();
        }
    }

    public final float[] OooO0oO() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f27778Ooooo0o.size() == 1) {
            fFloatValue2 = this.f27776OoooOoo;
        }
        float fOooOOOO = OooOOOO(fFloatValue2);
        float fOooOOOO2 = OooOOOO(fFloatValue);
        return OooOO0O() ? new float[]{fOooOOOO2, fOooOOOO} : new float[]{fOooOOOO, fOooOOOO2};
    }

    public final int OooO0oo(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean OooOO0(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f27781OooooOo)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean OooOO0O() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final void OooOO0o() {
        if (this.f27781OooooOo <= 0.0f) {
            return;
        }
        OooOoO0();
        int iMin = Math.min((int) (((this.f27777Ooooo00 - this.f27776OoooOoo) / this.f27781OooooOo) + 1.0f), (this.f27784OoooooO / (this.f27770OoooO0O * 2)) + 1);
        float[] fArr = this.f27783Oooooo0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f27783Oooooo0 = new float[iMin * 2];
        }
        float f = this.f27784OoooooO / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.f27783Oooooo0;
            fArr2[i] = ((i / 2) * f) + this.f27767OoooO;
            fArr2[i + 1] = OooO0O0();
        }
    }

    public final void OooOOO(int i) {
        if (OooOO0O()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        OooOOO0(i);
    }

    public final boolean OooOOO0(int i) {
        int i2 = this.f27780OooooOO;
        int iClamp = (int) MathUtils.clamp(i2 + i, 0L, this.f27778Ooooo0o.size() - 1);
        this.f27780OooooOO = iClamp;
        if (iClamp == i2) {
            return false;
        }
        if (this.f27779OooooO0 != -1) {
            this.f27779OooooO0 = iClamp;
        }
        OooOo0o();
        postInvalidate();
        return true;
    }

    public final float OooOOOO(float f) {
        float f2 = this.f27776OoooOoo;
        float f3 = (f - f2) / (this.f27777Ooooo00 - f2);
        return OooOO0O() ? 1.0f - f3 : f3;
    }

    public final void OooOOOo() {
        Iterator it = this.f27760Oooo00o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void OooOOo(o00000OO.OooO0O0 oooO0O0, float f) {
        String strOooO0o = OooO0o(f);
        if (!TextUtils.equals(oooO0O0.f29244OoooO0O, strOooO0o)) {
            oooO0O0.f29244OoooO0O = strOooO0o;
            oooO0O0.o000oOoO.f33091OooO0Oo = true;
            oooO0O0.invalidateSelf();
        }
        int iOooOOOO = (this.f27767OoooO + ((int) (OooOOOO(f) * this.f27784OoooooO))) - (oooO0O0.getIntrinsicWidth() / 2);
        int iOooO0O0 = OooO0O0() - (this.f27772OoooOOO + this.f27771OoooOO0);
        oooO0O0.setBounds(iOooOOOO, iOooO0O0 - oooO0O0.getIntrinsicHeight(), oooO0O0.getIntrinsicWidth() + iOooOOOO, iOooO0O0);
        Rect rect = new Rect(oooO0O0.getBounds());
        o0ooOO0.OooOO0O.OooO0OO(o0000oo.OooO0OO(this), this, rect);
        oooO0O0.setBounds(rect);
        ViewGroup viewGroupOooO0OO = o0000oo.OooO0OO(this);
        ((ViewOverlay) (viewGroupOooO0OO == null ? null : new o00oO0o(viewGroupOooO0OO)).f30487OooOo0o).add(oooO0O0);
    }

    public boolean OooOOo0() {
        if (this.f27779OooooO0 == -1) {
            float f = this.f27790o00oO0O;
            if (OooOO0O()) {
                f = 1.0f - f;
            }
            float f2 = this.f27777Ooooo00;
            float f3 = this.f27776OoooOoo;
            float fOooO00o = OooOo.OooO00o(f2, f3, f, f3);
            float fOooOOOO = (OooOOOO(fOooO00o) * this.f27784OoooooO) + this.f27767OoooO;
            this.f27779OooooO0 = 0;
            float fAbs = Math.abs(((Float) this.f27778Ooooo0o.get(0)).floatValue() - fOooO00o);
            for (int i = 1; i < this.f27778Ooooo0o.size(); i++) {
                float fAbs2 = Math.abs(((Float) this.f27778Ooooo0o.get(i)).floatValue() - fOooO00o);
                float fOooOOOO2 = (OooOOOO(((Float) this.f27778Ooooo0o.get(i)).floatValue()) * this.f27784OoooooO) + this.f27767OoooO;
                if (Float.compare(fAbs2, fAbs) > 1) {
                    break;
                }
                boolean z = !OooOO0O() ? fOooOOOO2 - fOooOOOO >= 0.0f : fOooOOOO2 - fOooOOOO <= 0.0f;
                if (Float.compare(fAbs2, fAbs) < 0) {
                    this.f27779OooooO0 = i;
                } else {
                    if (Float.compare(fAbs2, fAbs) != 0) {
                        continue;
                    } else {
                        if (Math.abs(fOooOOOO2 - fOooOOOO) < this.f27764Oooo0o0) {
                            this.f27779OooooO0 = -1;
                            return false;
                        }
                        if (z) {
                            this.f27779OooooO0 = i;
                        }
                    }
                }
                fAbs = fAbs2;
            }
            if (this.f27779OooooO0 == -1) {
                return false;
            }
        }
        return true;
    }

    public final void OooOOoo(ArrayList arrayList) {
        ViewGroup viewGroupOooO0OO;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f27778Ooooo0o.size() == arrayList.size() && this.f27778Ooooo0o.equals(arrayList)) {
            return;
        }
        this.f27778Ooooo0o = arrayList;
        this.f27793o0OoOo0 = true;
        int i = 0;
        this.f27780OooooOO = 0;
        OooOo0o();
        ArrayList arrayList2 = this.f27758Oooo000;
        if (arrayList2.size() > this.f27778Ooooo0o.size()) {
            List<o00000OO.OooO0O0> listSubList = arrayList2.subList(this.f27778Ooooo0o.size(), arrayList2.size());
            for (o00000OO.OooO0O0 oooO0O0 : listSubList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    ViewGroup viewGroupOooO0OO2 = o0000oo.OooO0OO(this);
                    o00oO0o o00oo0o = viewGroupOooO0OO2 == null ? null : new o00oO0o(viewGroupOooO0OO2);
                    if (o00oo0o != null) {
                        ((ViewOverlay) o00oo0o.f30487OooOo0o).remove(oooO0O0);
                        ViewGroup viewGroupOooO0OO3 = o0000oo.OooO0OO(this);
                        if (viewGroupOooO0OO3 == null) {
                            oooO0O0.getClass();
                        } else {
                            viewGroupOooO0OO3.removeOnLayoutChangeListener(oooO0O0.f29246OoooOOO);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f27778Ooooo0o.size()) {
            OooO00o oooO00o = this.f27755OooOooo;
            BaseSlider baseSlider = oooO00o.f27801OooO0OO;
            TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(baseSlider.getContext(), oooO00o.f27799OooO00o, Ooooo00.OooOo.o000oOoO, oooO00o.f27800OooO0O0, R.style.Widget_MaterialComponents_Slider, new int[0]);
            Context context = baseSlider.getContext();
            int resourceId2 = typedArrayOooO0Oo.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
            o00000OO.OooO0O0 oooO0O02 = new o00000OO.OooO0O0(context, resourceId2);
            TypedArray typedArrayOooO0Oo2 = o00000O0.OooO0Oo(oooO0O02.f29243OoooO, null, Ooooo00.OooOo.f15003OooooOO, 0, resourceId2, new int[0]);
            Context context2 = oooO0O02.f29243OoooO;
            oooO0O02.f29252Ooooo0o = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            o000000.OooOo oooOoOooO0o = oooO0O02.f29048OooOo0O.f29028OooO00o.OooO0o();
            oooOoOooO0o.f29080OooOO0O = oooO0O02.OooOo0o();
            oooO0O02.setShapeAppearanceModel(oooOoOooO0o.OooO00o());
            CharSequence text = typedArrayOooO0Oo2.getText(6);
            boolean zEquals = TextUtils.equals(oooO0O02.f29244OoooO0O, text);
            o000000 o000000Var = oooO0O02.o000oOoO;
            if (!zEquals) {
                oooO0O02.f29244OoooO0O = text;
                o000000Var.f33091OooO0Oo = true;
                oooO0O02.invalidateSelf();
            }
            oo0o0Oo.OooOO0 oooOO0 = (!typedArrayOooO0Oo2.hasValue(0) || (resourceId = typedArrayOooO0Oo2.getResourceId(0, 0)) == 0) ? null : new oo0o0Oo.OooOO0(context2, resourceId);
            if (oooOO0 != null && typedArrayOooO0Oo2.hasValue(1)) {
                oooOO0.f33224OooOO0 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayOooO0Oo2, 1);
            }
            o000000Var.OooO0O0(oooOO0, context2);
            TypedValue typedValueOooO0OO = oo0o0Oo.OooO0O0.OooO0OO(context2, o00000OO.OooO0O0.class.getCanonicalName(), R.attr.colorOnBackground);
            int i2 = typedValueOooO0OO.resourceId;
            int color = i2 != 0 ? ContextCompat.getColor(context2, i2) : typedValueOooO0OO.data;
            TypedValue typedValueOooO0OO2 = oo0o0Oo.OooO0O0.OooO0OO(context2, o00000OO.OooO0O0.class.getCanonicalName(), android.R.attr.colorBackground);
            int i3 = typedValueOooO0OO2.resourceId;
            oooO0O02.OooOOO0(ColorStateList.valueOf(typedArrayOooO0Oo2.getColor(7, ColorUtils.compositeColors(ColorUtils.setAlphaComponent(color, 153), ColorUtils.setAlphaComponent(i3 != 0 ? ContextCompat.getColor(context2, i3) : typedValueOooO0OO2.data, 229)))));
            TypedValue typedValueOooO0OO3 = oo0o0Oo.OooO0O0.OooO0OO(context2, o00000OO.OooO0O0.class.getCanonicalName(), R.attr.colorSurface);
            int i4 = typedValueOooO0OO3.resourceId;
            oooO0O02.OooOOo(ColorStateList.valueOf(i4 != 0 ? ContextCompat.getColor(context2, i4) : typedValueOooO0OO3.data));
            oooO0O02.f29248OoooOo0 = typedArrayOooO0Oo2.getDimensionPixelSize(2, 0);
            oooO0O02.f29249OoooOoO = typedArrayOooO0Oo2.getDimensionPixelSize(4, 0);
            oooO0O02.f29250OoooOoo = typedArrayOooO0Oo2.getDimensionPixelSize(5, 0);
            oooO0O02.f29251Ooooo00 = typedArrayOooO0Oo2.getDimensionPixelSize(3, 0);
            typedArrayOooO0Oo2.recycle();
            typedArrayOooO0Oo.recycle();
            arrayList2.add(oooO0O02);
            if (ViewCompat.isAttachedToWindow(this) && (viewGroupOooO0OO = o0000oo.OooO0OO(this)) != null) {
                int[] iArr = new int[2];
                viewGroupOooO0OO.getLocationOnScreen(iArr);
                oooO0O02.f29253OooooO0 = iArr[0];
                viewGroupOooO0OO.getWindowVisibleDisplayFrame(oooO0O02.f29247OoooOOo);
                viewGroupOooO0OO.addOnLayoutChangeListener(oooO0O02.f29246OoooOOO);
            }
        }
        int i5 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            o00000OO.OooO0O0 oooO0O03 = (o00000OO.OooO0O0) obj;
            oooO0O03.f29048OooOo0O.f29036OooOO0 = i5;
            oooO0O03.invalidateSelf();
        }
        ArrayList arrayList3 = this.f27759Oooo00O;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            if (obj2 != null) {
                throw new ClassCastException();
            }
            Iterator it = this.f27778Ooooo0o.iterator();
            if (it.hasNext()) {
                ((Float) it.next()).getClass();
                throw null;
            }
        }
        postInvalidate();
    }

    public final void OooOo() {
        boolean z;
        int iMax = Math.max(this.f27756Oooo, Math.max(this.f27770OoooO0O + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + (this.f27771OoooOO0 * 2)));
        boolean z2 = false;
        if (iMax == this.f27769OoooO00) {
            z = false;
        } else {
            this.f27769OoooO00 = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(this.f27771OoooOO0 - this.f27765Oooo0oO, 0), Math.max((this.f27770OoooO0O - this.f27766Oooo0oo) / 2, 0)) + this.f27763Oooo0o;
        if (this.f27767OoooO != iMax2) {
            this.f27767OoooO = iMax2;
            if (ViewCompat.isLaidOut(this)) {
                this.f27784OoooooO = Math.max(getWidth() - (this.f27767OoooO * 2), 0);
                OooOO0o();
            }
            z2 = true;
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void OooOo0() {
        double dRound;
        float f = this.f27790o00oO0O;
        float f2 = this.f27781OooooOo;
        if (f2 > 0.0f) {
            dRound = Math.round(f * r1) / ((int) ((this.f27777Ooooo00 - this.f27776OoooOoo) / f2));
        } else {
            dRound = f;
        }
        if (OooOO0O()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.f27777Ooooo00;
        OooOo00((float) ((dRound * (f3 - r1)) + this.f27776OoooOoo), this.f27779OooooO0);
    }

    public final boolean OooOo00(float f, int i) {
        this.f27780OooooOO = i;
        if (Math.abs(f - ((Float) this.f27778Ooooo0o.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f27794o0ooOO0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.f27776OoooOoo;
                minSeparation = OooOo.OooO00o(f2, this.f27777Ooooo00, (minSeparation - this.f27767OoooO) / this.f27784OoooooO, f2);
            }
        }
        if (OooOO0O()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.f27778Ooooo0o.set(i, Float.valueOf(MathUtils.clamp(f, i3 < 0 ? this.f27776OoooOoo : minSeparation + ((Float) this.f27778Ooooo0o.get(i3)).floatValue(), i2 >= this.f27778Ooooo0o.size() ? this.f27777Ooooo00 : ((Float) this.f27778Ooooo0o.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.f27759Oooo00O.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            ((Float) this.f27778Ooooo0o.get(i)).getClass();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f27752OooOoo;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        OooO0o oooO0o = this.f27754OooOooO;
        if (oooO0o == null) {
            this.f27754OooOooO = new OooO0o(this);
        } else {
            removeCallbacks(oooO0o);
        }
        OooO0o oooO0o2 = this.f27754OooOooO;
        oooO0o2.f27804OooOo0O = i;
        postDelayed(oooO0o2, 200L);
        return true;
    }

    public final void OooOo0O(int i, Rect rect) {
        int iOooOOOO = this.f27767OoooO + ((int) (OooOOOO(getValues().get(i).floatValue()) * this.f27784OoooooO));
        int iOooO0O0 = OooO0O0();
        int i2 = this.f27771OoooOO0;
        rect.set(iOooOOOO - i2, iOooO0O0 - i2, iOooOOOO + i2, iOooO0O0 + i2);
    }

    public final void OooOo0o() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iOooOOOO = (int) ((OooOOOO(((Float) this.f27778Ooooo0o.get(this.f27780OooooOO)).floatValue()) * this.f27784OoooooO) + this.f27767OoooO);
            int iOooO0O0 = OooO0O0();
            int i = this.o000oOoO;
            DrawableCompat.setHotspotBounds(background, iOooOOOO - i, iOooO0O0 - i, iOooOOOO + i, iOooO0O0 + i);
        }
    }

    public final void OooOoO0() {
        if (this.f27793o0OoOo0) {
            float f = this.f27776OoooOoo;
            float f2 = this.f27777Ooooo00;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.f27776OoooOoo + ") must be smaller than valueTo(" + this.f27777Ooooo00 + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.f27777Ooooo00 + ") must be greater than valueFrom(" + this.f27776OoooOoo + ")");
            }
            if (this.f27781OooooOo > 0.0f && !OooOO0(f2 - f)) {
                throw new IllegalStateException("The stepSize(" + this.f27781OooooOo + ") must be 0, or a factor of the valueFrom(" + this.f27776OoooOoo + ")-valueTo(" + this.f27777Ooooo00 + ") range");
            }
            ArrayList arrayList = this.f27778Ooooo0o;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Float f3 = (Float) obj;
                if (f3.floatValue() < this.f27776OoooOoo || f3.floatValue() > this.f27777Ooooo00) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.f27776OoooOoo + "), and lower or equal to valueTo(" + this.f27777Ooooo00 + ")");
                }
                if (this.f27781OooooOo > 0.0f && !OooOO0(f3.floatValue() - this.f27776OoooOoo)) {
                    float f4 = this.f27776OoooOoo;
                    float f5 = this.f27781OooooOo;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.f27781OooooOo;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.f27794o0ooOO0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f27781OooooOo + ")");
                }
                if (minSeparation < f6 || !OooOO0(minSeparation)) {
                    float f7 = this.f27781OooooOo;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            float f8 = this.f27781OooooOo;
            if (f8 != 0.0f) {
                if (((int) f8) != f8) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f8 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f9 = this.f27776OoooOoo;
                if (((int) f9) != f9) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f9 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f10 = this.f27777Ooooo00;
                if (((int) f10) != f10) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f27793o0OoOo0 = false;
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f27753OooOoo0.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f27747OooOo0O.setColor(OooO0oo(this.f27789o00o0O));
        this.f27748OooOo0o.setColor(OooO0oo(this.f27788o00Ooo));
        this.f27749OooOoO.setColor(OooO0oo(this.f27787o00Oo0));
        this.f27751OooOoOO.setColor(OooO0oo(this.f27786o00O0O));
        ArrayList arrayList = this.f27758Oooo000;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00000OO.OooO0O0 oooO0O0 = (o00000OO.OooO0O0) obj;
            if (oooO0O0.isStateful()) {
                oooO0O0.setState(getDrawableState());
            }
        }
        o000000.OooOOO0 oooOOO0 = this.f27792o00ooo;
        if (oooOOO0.isStateful()) {
            oooOOO0.setState(getDrawableState());
        }
        Paint paint = this.f27750OooOoO0;
        paint.setColor(OooO0oo(this.f27796ooOO));
        paint.setAlpha(63);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f27753OooOoo0.getAccessibilityFocusedVirtualViewId();
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getValueFrom() {
        return this.f27776OoooOoo;
    }

    public float getValueTo() {
        return this.f27777Ooooo00;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f27778Ooooo0o);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f27758Oooo000;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00000OO.OooO0O0 oooO0O0 = (o00000OO.OooO0O0) obj;
            ViewGroup viewGroupOooO0OO = o0000oo.OooO0OO(this);
            if (viewGroupOooO0OO == null) {
                oooO0O0.getClass();
            } else {
                oooO0O0.getClass();
                int[] iArr = new int[2];
                viewGroupOooO0OO.getLocationOnScreen(iArr);
                oooO0O0.f29253OooooO0 = iArr[0];
                viewGroupOooO0OO.getWindowVisibleDisplayFrame(oooO0O0.f29247OoooOOo);
                viewGroupOooO0OO.addOnLayoutChangeListener(oooO0O0.f29246OoooOOO);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        OooO0o oooO0o = this.f27754OooOooO;
        if (oooO0o != null) {
            removeCallbacks(oooO0o);
        }
        int i = 0;
        this.f27757Oooo0 = false;
        ArrayList arrayList = this.f27758Oooo000;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00000OO.OooO0O0 oooO0O0 = (o00000OO.OooO0O0) obj;
            ViewGroup viewGroupOooO0OO = o0000oo.OooO0OO(this);
            o00oO0o o00oo0o = viewGroupOooO0OO == null ? null : new o00oO0o(viewGroupOooO0OO);
            if (o00oo0o != null) {
                ((ViewOverlay) o00oo0o.f30487OooOo0o).remove(oooO0O0);
                ViewGroup viewGroupOooO0OO2 = o0000oo.OooO0OO(this);
                if (viewGroupOooO0OO2 == null) {
                    oooO0O0.getClass();
                } else {
                    viewGroupOooO0OO2.removeOnLayoutChangeListener(oooO0O0.f29246OoooOOO);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.f27793o0OoOo0) {
            OooOoO0();
            OooOO0o();
        }
        super.onDraw(canvas);
        int iOooO0O0 = OooO0O0();
        int i2 = this.f27784OoooooO;
        float[] fArrOooO0oO = OooO0oO();
        int i3 = this.f27767OoooO;
        float f = i2;
        float f2 = (fArrOooO0oO[1] * f) + i3;
        float f3 = i3 + i2;
        Paint paint = this.f27747OooOo0O;
        if (f2 < f3) {
            float f4 = iOooO0O0;
            canvas.drawLine(f2, f4, f3, f4, paint);
        }
        float f5 = this.f27767OoooO;
        int i4 = 0;
        float f6 = (fArrOooO0oO[0] * f) + f5;
        if (f6 > f5) {
            float f7 = iOooO0O0;
            canvas.drawLine(f5, f7, f6, f7, paint);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f27776OoooOoo) {
            int i5 = this.f27784OoooooO;
            float[] fArrOooO0oO2 = OooO0oO();
            float f8 = this.f27767OoooO;
            float f9 = i5;
            float f10 = (fArrOooO0oO2[1] * f9) + f8;
            float f11 = (fArrOooO0oO2[0] * f9) + f8;
            float f12 = iOooO0O0;
            canvas.drawLine(f11, f12, f10, f12, this.f27748OooOo0o);
        }
        if (this.f27782Oooooo && this.f27781OooooOo > 0.0f) {
            float[] fArrOooO0oO3 = OooO0oO();
            int iRound = Math.round(fArrOooO0oO3[0] * ((this.f27783Oooooo0.length / 2) - 1));
            int iRound2 = Math.round(fArrOooO0oO3[1] * ((this.f27783Oooooo0.length / 2) - 1));
            float[] fArr = this.f27783Oooooo0;
            int i6 = iRound * 2;
            Paint paint2 = this.f27749OooOoO;
            canvas.drawPoints(fArr, 0, i6, paint2);
            int i7 = iRound2 * 2;
            canvas.drawPoints(this.f27783Oooooo0, i6, i7 - i6, this.f27751OooOoOO);
            float[] fArr2 = this.f27783Oooooo0;
            canvas.drawPoints(fArr2, i7, fArr2.length - i7, paint2);
        }
        if ((this.f27775OoooOoO || isFocused() || this.f27768OoooO0 == 3) && isEnabled()) {
            int i8 = this.f27784OoooooO;
            if (!(getBackground() instanceof RippleDrawable)) {
                int iOooOOOO = (int) ((OooOOOO(((Float) this.f27778Ooooo0o.get(this.f27780OooooOO)).floatValue()) * i8) + this.f27767OoooO);
                if (Build.VERSION.SDK_INT < 28) {
                    int i9 = this.o000oOoO;
                    canvas.clipRect(iOooOOOO - i9, iOooO0O0 - i9, iOooOOOO + i9, i9 + iOooO0O0, Region.Op.UNION);
                }
                canvas.drawCircle(iOooOOOO, iOooO0O0, this.o000oOoO, this.f27750OooOoO0);
            }
            if (this.f27779OooooO0 == -1 && this.f27768OoooO0 != 3) {
                OooO0o0();
            } else if (this.f27768OoooO0 != 2) {
                if (!this.f27757Oooo0) {
                    this.f27757Oooo0 = true;
                    ValueAnimator valueAnimatorOooO0OO = OooO0OO(true);
                    this.f27761Oooo0O0 = valueAnimatorOooO0OO;
                    this.f27762Oooo0OO = null;
                    valueAnimatorOooO0OO.start();
                }
                ArrayList arrayList = this.f27758Oooo000;
                Iterator it = arrayList.iterator();
                for (int i10 = 0; i10 < this.f27778Ooooo0o.size() && it.hasNext(); i10++) {
                    if (i10 != this.f27780OooooOO) {
                        OooOOo((o00000OO.OooO0O0) it.next(), ((Float) this.f27778Ooooo0o.get(i10)).floatValue());
                    }
                }
                if (!it.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f27778Ooooo0o.size())));
                }
                OooOOo((o00000OO.OooO0O0) it.next(), ((Float) this.f27778Ooooo0o.get(this.f27780OooooOO)).floatValue());
            }
        } else {
            OooO0o0();
        }
        int i11 = this.f27784OoooooO;
        while (i4 < this.f27778Ooooo0o.size()) {
            float fFloatValue = ((Float) this.f27778Ooooo0o.get(i4)).floatValue();
            Drawable drawable = this.f27795oo000o;
            if (drawable != null) {
                i = iOooO0O0;
                OooO0Oo(canvas, i11, i, fFloatValue, drawable);
            } else {
                i = iOooO0O0;
                if (i4 < this.f27791o00oO0o.size()) {
                    OooO0Oo(canvas, i11, i, fFloatValue, (Drawable) this.f27791o00oO0o.get(i4));
                } else {
                    if (!isEnabled()) {
                        canvas.drawCircle((OooOOOO(fFloatValue) * i11) + this.f27767OoooO, i, this.f27771OoooOO0, this.f27746OooOo);
                    }
                    OooO0Oo(canvas, i11, i, fFloatValue, this.f27792o00ooo);
                }
            }
            i4++;
            iOooO0O0 = i;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        OooO oooO = this.f27753OooOoo0;
        if (!z) {
            this.f27779OooooO0 = -1;
            oooO.clearKeyboardFocusForVirtualView(this.f27780OooooOO);
            return;
        }
        if (i == 1) {
            OooOOO0(Integer.MAX_VALUE);
        } else if (i == 2) {
            OooOOO0(Integer.MIN_VALUE);
        } else if (i == 17) {
            OooOOO(Integer.MAX_VALUE);
        } else if (i == 66) {
            OooOOO(Integer.MIN_VALUE);
        }
        oooO.requestKeyboardFocusForVirtualView(this.f27780OooooOO);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f27785Ooooooo = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f27769OoooO00;
        int i4 = this.f27768OoooO0;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((o00000OO.OooO0O0) this.f27758Oooo000.get(0)).getIntrinsicHeight() : 0), BasicMeasure.EXACTLY));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        OooOO0 oooOO0 = (OooOO0) parcelable;
        super.onRestoreInstanceState(oooOO0.getSuperState());
        this.f27776OoooOoo = oooOO0.f27807OooOo0O;
        this.f27777Ooooo00 = oooOO0.f27808OooOo0o;
        OooOOoo(oooOO0.f27806OooOo);
        this.f27781OooooOo = oooOO0.f27810OooOoO0;
        if (oooOO0.f27809OooOoO) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        OooOO0 oooOO0 = new OooOO0(super.onSaveInstanceState());
        oooOO0.f27807OooOo0O = this.f27776OoooOoo;
        oooOO0.f27808OooOo0o = this.f27777Ooooo00;
        oooOO0.f27806OooOo = new ArrayList(this.f27778Ooooo0o);
        oooOO0.f27810OooOoO0 = this.f27781OooooOo;
        oooOO0.f27809OooOoO = hasFocus();
        return oooOO0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f27784OoooooO = Math.max(i - (this.f27767OoooO * 2), 0);
        OooOO0o();
        OooOo0o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            float x = motionEvent.getX();
            float f = (x - this.f27767OoooO) / this.f27784OoooooO;
            this.f27790o00oO0O = f;
            float fMax = Math.max(0.0f, f);
            this.f27790o00oO0O = fMax;
            this.f27790o00oO0O = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i = this.f27764Oooo0o0;
                if (actionMasked == 1) {
                    this.f27775OoooOoO = false;
                    MotionEvent motionEvent2 = this.f27774OoooOo0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        float f2 = i;
                        if (Math.abs(this.f27774OoooOo0.getX() - motionEvent.getX()) <= f2 && Math.abs(this.f27774OoooOo0.getY() - motionEvent.getY()) <= f2 && OooOOo0()) {
                            OooOOOo();
                        }
                    }
                    if (this.f27779OooooO0 != -1) {
                        OooOo0();
                        this.f27779OooooO0 = -1;
                        Iterator it = this.f27760Oooo00o.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.f27775OoooOoO) {
                        if (!OooO() || Math.abs(x - this.f27773OoooOOo) >= i) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            OooOOOo();
                        }
                    }
                    if (OooOOo0()) {
                        this.f27775OoooOoO = true;
                        OooOo0();
                        OooOo0o();
                        invalidate();
                    }
                }
            } else {
                this.f27773OoooOOo = x;
                if (!OooO()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (OooOOo0()) {
                        requestFocus();
                        this.f27775OoooOoO = true;
                        OooOo0();
                        OooOo0o();
                        invalidate();
                        OooOOOo();
                    }
                }
            }
            setPressed(this.f27775OoooOoO);
            this.f27774OoooOo0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupOooO0OO = o0000oo.OooO0OO(this);
            o00oO0o o00oo0o = viewGroupOooO0OO == null ? null : new o00oO0o(viewGroupOooO0OO);
            if (o00oo0o == null) {
                return;
            }
            ArrayList arrayList = this.f27758Oooo000;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ViewOverlay) o00oo0o.f30487OooOo0o).remove((o00000OO.OooO0O0) obj);
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f27779OooooO0 = i;
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        OooO00o(drawableNewDrawable);
        this.f27795oo000o = drawableNewDrawable;
        this.f27791o00oO0o.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f27778Ooooo0o.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f27780OooooOO = i;
        this.f27753OooOoo0.requestKeyboardFocusForVirtualView(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.o000oOoO) {
            return;
        }
        this.o000oOoO = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.o000oOoO);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27796ooOO)) {
            return;
        }
        this.f27796ooOO = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iOooO0oo = OooO0oo(colorStateList);
        Paint paint = this.f27750OooOoO0;
        paint.setColor(iOooO0oo);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f27768OoooO0 != i) {
            this.f27768OoooO0 = i;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i) {
        this.f27794o0ooOO0 = i;
        this.f27793o0OoOo0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f27781OooooOo != f) {
                this.f27781OooooOo = f;
                this.f27793o0OoOo0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f27776OoooOoo + ")-valueTo(" + this.f27777Ooooo00 + ") range");
    }

    public void setThumbElevation(float f) {
        this.f27792o00ooo.OooOO0o(f);
    }

    public void setThumbRadius(int i) {
        if (i == this.f27771OoooOO0) {
            return;
        }
        this.f27771OoooOO0 = i;
        o000000.OooO oooO = new o000000.OooO(0);
        o000000.OooO oooO2 = new o000000.OooO(0);
        o000000.OooO oooO3 = new o000000.OooO(0);
        o000000.OooO oooO4 = new o000000.OooO(0);
        float f = this.f27771OoooOO0;
        OooO00o.OooO00o oooO00oOooO0o = Oooo0o0.OooO.OooO0o(0);
        o000000.OooOo.OooO0O0(oooO00oOooO0o);
        o000000.OooOo.OooO0O0(oooO00oOooO0o);
        o000000.OooOo.OooO0O0(oooO00oOooO0o);
        o000000.OooOo.OooO0O0(oooO00oOooO0o);
        o000000.OooO00o oooO00o = new o000000.OooO00o(f);
        o000000.OooO00o oooO00o2 = new o000000.OooO00o(f);
        o000000.OooO00o oooO00o3 = new o000000.OooO00o(f);
        o000000.OooO00o oooO00o4 = new o000000.OooO00o(f);
        Oooo000 oooo000 = new Oooo000();
        oooo000.f29084OooO00o = oooO00oOooO0o;
        oooo000.f29085OooO0O0 = oooO00oOooO0o;
        oooo000.f29086OooO0OO = oooO00oOooO0o;
        oooo000.f29087OooO0Oo = oooO00oOooO0o;
        oooo000.f29089OooO0o0 = oooO00o;
        oooo000.f29088OooO0o = oooO00o2;
        oooo000.f29090OooO0oO = oooO00o3;
        oooo000.f29091OooO0oo = oooO00o4;
        oooo000.f29083OooO = oooO;
        oooo000.f29092OooOO0 = oooO2;
        oooo000.f29093OooOO0O = oooO3;
        oooo000.OooOO0o = oooO4;
        o000000.OooOOO0 oooOOO0 = this.f27792o00ooo;
        oooOOO0.setShapeAppearanceModel(oooo000);
        int i2 = this.f27771OoooOO0 * 2;
        oooOOO0.setBounds(0, 0, i2, i2);
        Drawable drawable = this.f27795oo000o;
        if (drawable != null) {
            OooO00o(drawable);
        }
        Iterator it = this.f27791o00oO0o.iterator();
        while (it.hasNext()) {
            OooO00o((Drawable) it.next());
        }
        OooOo();
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f27792o00ooo.OooOOo(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeWidth(float f) {
        o000000.OooOOO0 oooOOO0 = this.f27792o00ooo;
        oooOOO0.f29048OooOo0O.f29036OooOO0 = f;
        oooOOO0.invalidateSelf();
        postInvalidate();
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27786o00O0O)) {
            return;
        }
        this.f27786o00O0O = colorStateList;
        this.f27751OooOoOO.setColor(OooO0oo(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27787o00Oo0)) {
            return;
        }
        this.f27787o00Oo0 = colorStateList;
        this.f27749OooOoO.setColor(OooO0oo(colorStateList));
        invalidate();
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27788o00Ooo)) {
            return;
        }
        this.f27788o00Ooo = colorStateList;
        this.f27748OooOo0o.setColor(OooO0oo(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.f27770OoooO0O != i) {
            this.f27770OoooO0O = i;
            this.f27747OooOo0O.setStrokeWidth(i);
            this.f27748OooOo0o.setStrokeWidth(this.f27770OoooO0O);
            this.f27749OooOoO.setStrokeWidth(this.f27770OoooO0O / 2.0f);
            this.f27751OooOoOO.setStrokeWidth(this.f27770OoooO0O / 2.0f);
            OooOo();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27789o00o0O)) {
            return;
        }
        this.f27789o00o0O = colorStateList;
        this.f27747OooOo0O.setColor(OooO0oo(colorStateList));
        invalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        OooOOoo(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_Slider), attributeSet, i);
        this.f27758Oooo000 = new ArrayList();
        this.f27759Oooo00O = new ArrayList();
        this.f27760Oooo00o = new ArrayList();
        this.f27757Oooo0 = false;
        this.f27775OoooOoO = false;
        this.f27778Ooooo0o = new ArrayList();
        this.f27779OooooO0 = -1;
        this.f27780OooooOO = -1;
        this.f27781OooooOo = 0.0f;
        this.f27782Oooooo = true;
        this.f27785Ooooooo = false;
        o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
        this.f27792o00ooo = oooOOO0;
        this.f27791o00oO0o = Collections.EMPTY_LIST;
        this.f27794o0ooOO0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f27747OooOo0O = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f27748OooOo0o = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f27746OooOo = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f27750OooOoO0 = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f27749OooOoO = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f27751OooOoOO = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.f27756Oooo = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f27763Oooo0o = dimensionPixelOffset;
        this.f27767OoooO = dimensionPixelOffset;
        this.f27765Oooo0oO = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f27766Oooo0oo = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f27772OoooOOO = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f27755OooOooo = new OooO00o(this, attributeSet, i);
        int[] iArr = Ooooo00.OooOo.o000oOoO;
        o00000O0.OooO00o(context2, attributeSet, i, R.style.Widget_MaterialComponents_Slider);
        o00000O0.OooO0O0(context2, attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_Slider);
        this.f27776OoooOoo = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f27777Ooooo00 = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f27776OoooOoo));
        this.f27781OooooOo = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(18);
        int i2 = zHasValue ? 18 : 20;
        int i3 = zHasValue ? 18 : 19;
        ColorStateList colorStateListOooO00o = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, i2);
        setTrackInactiveTintList(colorStateListOooO00o == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_track_color) : colorStateListOooO00o);
        ColorStateList colorStateListOooO00o2 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, i3);
        setTrackActiveTintList(colorStateListOooO00o2 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_track_color) : colorStateListOooO00o2);
        oooOOO0.OooOOO0(oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 9));
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            setThumbStrokeColor(oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 12));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        ColorStateList colorStateListOooO00o3 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListOooO00o3 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_halo_color) : colorStateListOooO00o3);
        this.f27782Oooooo = typedArrayObtainStyledAttributes.getBoolean(17, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(14);
        int i4 = zHasValue2 ? 14 : 16;
        int i5 = zHasValue2 ? 14 : 15;
        ColorStateList colorStateListOooO00o4 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, i4);
        setTickInactiveTintList(colorStateListOooO00o4 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListOooO00o4);
        ColorStateList colorStateListOooO00o5 = oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, i5);
        setTickActiveTintList(colorStateListOooO00o5 == null ? AppCompatResources.getColorStateList(context2, R.color.material_slider_active_tick_marks_color) : colorStateListOooO00o5);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(10, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, 0));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        oooOOO0.OooOOo0();
        this.f27764Oooo0o0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        OooO oooO = new OooO(this);
        this.f27753OooOoo0 = oooO;
        ViewCompat.setAccessibilityDelegate(this, oooO);
        this.f27752OooOoo = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@NonNull List<Float> list) {
        OooOOoo(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f27795oo000o = null;
        this.f27791o00oO0o = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f27791o00oO0o;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            OooO00o(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}
