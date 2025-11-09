package ooOO;

import Ooooo0o.o00OO00O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o000000.OooOO0O;
import o000000.OooOOO0;
import o000000.OooOo;
import o0O0O00.OooO00o;
import o0ooOO0.o000000;
import o0ooOO0.o0000oo;
import o0ooOO0.o000OOo;
import oo0o0Oo.OooOO0;

/* loaded from: classes2.dex */
public final class o00Ooo extends OooOOO0 implements Drawable.Callback, o000OOo {

    /* renamed from: o0000OOo */
    public static final int[] f33230o0000OOo = {R.attr.state_enabled};

    /* renamed from: o0000Oo0 */
    public static final ShapeDrawable f33231o0000Oo0 = new ShapeDrawable(new OvalShape());

    /* renamed from: OoooO */
    public ColorStateList f33232OoooO;

    /* renamed from: OoooO0O */
    public ColorStateList f33233OoooO0O;

    /* renamed from: OoooOO0 */
    public float f33234OoooOO0;

    /* renamed from: OoooOOO */
    public ColorStateList f33235OoooOOO;

    /* renamed from: OoooOOo */
    public float f33236OoooOOo;

    /* renamed from: OoooOo0 */
    public ColorStateList f33237OoooOo0;

    /* renamed from: OoooOoO */
    public CharSequence f33238OoooOoO;

    /* renamed from: OoooOoo */
    public boolean f33239OoooOoo;

    /* renamed from: Ooooo00 */
    public Drawable f33240Ooooo00;

    /* renamed from: Ooooo0o */
    public ColorStateList f33241Ooooo0o;

    /* renamed from: OooooO0 */
    public float f33242OooooO0;

    /* renamed from: OooooOO */
    public boolean f33243OooooOO;

    /* renamed from: OooooOo */
    public boolean f33244OooooOo;

    /* renamed from: Oooooo */
    public RippleDrawable f33245Oooooo;

    /* renamed from: Oooooo0 */
    public Drawable f33246Oooooo0;

    /* renamed from: OoooooO */
    public ColorStateList f33247OoooooO;

    /* renamed from: Ooooooo */
    public float f33248Ooooooo;

    /* renamed from: o0000 */
    public ColorFilter f33249o0000;

    /* renamed from: o00000 */
    public int f33250o00000;

    /* renamed from: o000000 */
    public final PointF f33251o000000;

    /* renamed from: o000000O */
    public final Path f33252o000000O;

    /* renamed from: o000000o */
    public final o000000 f33253o000000o;

    /* renamed from: o00000O */
    public int f33254o00000O;

    /* renamed from: o00000O0 */
    public int f33255o00000O0;

    /* renamed from: o00000OO */
    public int f33256o00000OO;

    /* renamed from: o00000Oo */
    public int f33257o00000Oo;

    /* renamed from: o00000o0 */
    public int f33258o00000o0;

    /* renamed from: o00000oO */
    public int f33259o00000oO;

    /* renamed from: o00000oo */
    public int f33260o00000oo;

    /* renamed from: o0000O */
    public TextUtils.TruncateAt f33261o0000O;

    /* renamed from: o0000O0 */
    public int[] f33262o0000O0;

    /* renamed from: o0000O00 */
    public PorterDuffColorFilter f33263o0000O00;

    /* renamed from: o0000O0O */
    public ColorStateList f33264o0000O0O;

    /* renamed from: o0000OO */
    public int f33265o0000OO;

    /* renamed from: o0000OO0 */
    public boolean f33266o0000OO0;

    /* renamed from: o0000OOO */
    public boolean f33267o0000OOO;

    /* renamed from: o0000Ooo */
    public boolean f33268o0000Ooo;

    /* renamed from: o0000oO */
    public PorterDuff.Mode f33269o0000oO;

    /* renamed from: o0000oo */
    public ColorStateList f33270o0000oo;

    /* renamed from: o000OO */
    public WeakReference f33271o000OO;

    /* renamed from: o000OOo */
    public final RectF f33272o000OOo;
    public float o000oOoO;

    /* renamed from: o00O0O */
    public boolean f33273o00O0O;

    /* renamed from: o00Oo0 */
    public Drawable f33274o00Oo0;

    /* renamed from: o00Ooo */
    public ColorStateList f33275o00Ooo;

    /* renamed from: o00o0O */
    public o00OO00O f33276o00o0O;

    /* renamed from: o00oO0O */
    public float f33277o00oO0O;

    /* renamed from: o00oO0o */
    public float f33278o00oO0o;

    /* renamed from: o00ooo */
    public o00OO00O f33279o00ooo;

    /* renamed from: o0O0O00 */
    public final Paint.FontMetrics f33280o0O0O00;

    /* renamed from: o0OO00O */
    public final Context f33281o0OO00O;

    /* renamed from: o0OOO0o */
    public float f33282o0OOO0o;

    /* renamed from: o0Oo0oo */
    public float f33283o0Oo0oo;

    /* renamed from: o0OoOo0 */
    public CharSequence f33284o0OoOo0;

    /* renamed from: o0ooOO0 */
    public float f33285o0ooOO0;
    public float o0ooOOo;
    public float o0ooOoO;

    /* renamed from: oo000o */
    public float f33286oo000o;

    /* renamed from: oo0o0Oo */
    public final Paint f33287oo0o0Oo;

    /* renamed from: ooOO */
    public boolean f33288ooOO;

    public o00Ooo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, com.github.superadb.R.style.Widget_MaterialComponents_Chip_Action);
        this.o000oOoO = -1.0f;
        this.f33287oo0o0Oo = new Paint(1);
        this.f33280o0O0O00 = new Paint.FontMetrics();
        this.f33272o000OOo = new RectF();
        this.f33251o000000 = new PointF();
        this.f33252o000000O = new Path();
        this.f33260o00000oo = 255;
        this.f33269o0000oO = PorterDuff.Mode.SRC_IN;
        this.f33271o000OO = new WeakReference(null);
        OooOO0O(context);
        this.f33281o0OO00O = context;
        o000000 o000000Var = new o000000(this);
        this.f33253o000000o = o000000Var;
        this.f33238OoooOoO = "";
        o000000Var.f33088OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f33230o0000OOo;
        setState(iArr);
        if (!Arrays.equals(this.f33262o0000O0, iArr)) {
            this.f33262o0000O0 = iArr;
            if (OoooOoo()) {
                OooOooO(getState(), iArr);
            }
        }
        this.f33266o0000OO0 = true;
        int[] iArr2 = OooO00o.f32822OooO00o;
        f33231o0000Oo0.setTint(-1);
    }

    public static boolean OooOoOO(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean OooOoo0(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void Ooooo00(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // o000000.OooOOO0, o0ooOO0.o000OOo
    public final void OooO00o() {
        OooOoo();
        invalidateSelf();
    }

    public final float OooOo() {
        if (!OoooOoO() && !OoooOo0()) {
            return 0.0f;
        }
        float f = this.f33278o00oO0o;
        Drawable drawable = this.f33268o0000Ooo ? this.f33274o00Oo0 : this.f33240Ooooo00;
        float intrinsicWidth = this.f33242OooooO0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f33277o00oO0O;
    }

    public final void OooOo0O(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f33246Oooooo0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f33262o0000O0);
            }
            DrawableCompat.setTintList(drawable, this.f33247OoooooO);
            return;
        }
        Drawable drawable2 = this.f33240Ooooo00;
        if (drawable == drawable2 && this.f33243OooooOO) {
            DrawableCompat.setTintList(drawable2, this.f33241Ooooo0o);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void OooOo0o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (OoooOoO() || OoooOo0()) {
            float f = this.f33286oo000o + this.f33278o00oO0o;
            Drawable drawable = this.f33268o0000Ooo ? this.f33274o00Oo0 : this.f33240Ooooo00;
            float intrinsicWidth = this.f33242OooooO0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f33268o0000Ooo ? this.f33274o00Oo0 : this.f33240Ooooo00;
            float fCeil = this.f33242OooooO0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(o0000oo.OooO0O0(this.f33281o0OO00O, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float OooOoO() {
        return this.f33267o0000OOO ? OooO() : this.o000oOoO;
    }

    public final float OooOoO0() {
        if (OoooOoo()) {
            return this.o0ooOoO + this.f33248Ooooooo + this.f33282o0OOO0o;
        }
        return 0.0f;
    }

    public final void OooOoo() {
        o00Oo0 o00oo0 = (o00Oo0) this.f33271o000OO.get();
        if (o00oo0 != null) {
            Chip chip = (Chip) o00oo0;
            chip.OooO0OO(chip.f27508Oooo00o);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean OooOooO(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean state = true;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f33233OoooO0O;
        int iOooO0OO = OooO0OO(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f33250o00000) : 0);
        if (this.f33250o00000 != iOooO0OO) {
            this.f33250o00000 = iOooO0OO;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f33232OoooO;
        int iOooO0OO2 = OooO0OO(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f33255o00000O0) : 0);
        if (this.f33255o00000O0 != iOooO0OO2) {
            this.f33255o00000O0 = iOooO0OO2;
            zOnStateChange = true;
        }
        int iCompositeColors = ColorUtils.compositeColors(iOooO0OO2, iOooO0OO);
        if ((this.f33254o00000O != iCompositeColors) | (this.f29048OooOo0O.f29030OooO0OO == null)) {
            this.f33254o00000O = iCompositeColors;
            OooOOO0(ColorStateList.valueOf(iCompositeColors));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f33235OoooOOO;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f33256o00000OO) : 0;
        if (this.f33256o00000OO != colorForState) {
            this.f33256o00000OO = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f33264o0000O0O == null || !OooO00o.OooO0Oo(iArr)) ? 0 : this.f33264o0000O0O.getColorForState(iArr, this.f33257o00000Oo);
        if (this.f33257o00000Oo != colorForState2) {
            this.f33257o00000Oo = colorForState2;
        }
        OooOO0 oooOO0 = this.f33253o000000o.f33092OooO0o;
        int colorForState3 = (oooOO0 == null || (colorStateList = oooOO0.f33224OooOO0) == null) ? 0 : colorStateList.getColorForState(iArr, this.f33258o00000o0);
        if (this.f33258o00000o0 != colorForState3) {
            this.f33258o00000o0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.f33288ooOO) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f33268o0000Ooo == z || this.f33274o00Oo0 == null) {
            z2 = false;
        } else {
            float fOooOo = OooOo();
            this.f33268o0000Ooo = z;
            if (fOooOo != OooOo()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.f33270o0000oo;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f33259o00000oO) : 0;
        if (this.f33259o00000oO != colorForState4) {
            this.f33259o00000oO = colorForState4;
            ColorStateList colorStateList6 = this.f33270o0000oo;
            PorterDuff.Mode mode = this.f33269o0000oO;
            this.f33263o0000O00 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (OooOoo0(this.f33240Ooooo00)) {
            state |= this.f33240Ooooo00.setState(iArr);
        }
        if (OooOoo0(this.f33274o00Oo0)) {
            state |= this.f33274o00Oo0.setState(iArr);
        }
        if (OooOoo0(this.f33246Oooooo0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f33246Oooooo0.setState(iArr3);
        }
        int[] iArr4 = OooO00o.f32822OooO00o;
        if (OooOoo0(this.f33245Oooooo)) {
            state |= this.f33245Oooooo.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            OooOoo();
        }
        return state;
    }

    public final void OooOooo(boolean z) {
        if (this.f33288ooOO != z) {
            this.f33288ooOO = z;
            float fOooOo = OooOo();
            if (!z && this.f33268o0000Ooo) {
                this.f33268o0000Ooo = false;
            }
            float fOooOo2 = OooOo();
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    public final void Oooo(Drawable drawable) {
        Drawable drawable2 = this.f33246Oooooo0;
        Drawable drawableUnwrap = drawable2 != null ? DrawableCompat.unwrap(drawable2) : null;
        if (drawableUnwrap != drawable) {
            float fOooOoO0 = OooOoO0();
            this.f33246Oooooo0 = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            int[] iArr = OooO00o.f32822OooO00o;
            this.f33245Oooooo = new RippleDrawable(OooO00o.OooO0OO(this.f33237OoooOo0), this.f33246Oooooo0, f33231o0000Oo0);
            float fOooOoO02 = OooOoO0();
            Ooooo00(drawableUnwrap);
            if (OoooOoo()) {
                OooOo0O(this.f33246Oooooo0);
            }
            invalidateSelf();
            if (fOooOoO0 != fOooOoO02) {
                OooOoo();
            }
        }
    }

    public final void Oooo0(float f) {
        if (this.o000oOoO != f) {
            this.o000oOoO = f;
            OooOo oooOoOooO0o = this.f29048OooOo0O.f29028OooO00o.OooO0o();
            oooOoOooO0o.OooO0OO(f);
            setShapeAppearanceModel(oooOoOooO0o.OooO00o());
        }
    }

    public final void Oooo000(Drawable drawable) {
        if (this.f33274o00Oo0 != drawable) {
            float fOooOo = OooOo();
            this.f33274o00Oo0 = drawable;
            float fOooOo2 = OooOo();
            Ooooo00(this.f33274o00Oo0);
            OooOo0O(this.f33274o00Oo0);
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    public final void Oooo00O(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f33275o00Ooo != colorStateList) {
            this.f33275o00Ooo = colorStateList;
            if (this.f33273o00O0O && (drawable = this.f33274o00Oo0) != null && this.f33288ooOO) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo00o(boolean z) {
        if (this.f33273o00O0O != z) {
            boolean zOoooOo0 = OoooOo0();
            this.f33273o00O0O = z;
            boolean zOoooOo02 = OoooOo0();
            if (zOoooOo0 != zOoooOo02) {
                if (zOoooOo02) {
                    OooOo0O(this.f33274o00Oo0);
                } else {
                    Ooooo00(this.f33274o00Oo0);
                }
                invalidateSelf();
                OooOoo();
            }
        }
    }

    public final void Oooo0O0(Drawable drawable) {
        Drawable drawable2 = this.f33240Ooooo00;
        Drawable drawableUnwrap = drawable2 != null ? DrawableCompat.unwrap(drawable2) : null;
        if (drawableUnwrap != drawable) {
            float fOooOo = OooOo();
            this.f33240Ooooo00 = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float fOooOo2 = OooOo();
            Ooooo00(drawableUnwrap);
            if (OoooOoO()) {
                OooOo0O(this.f33240Ooooo00);
            }
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    public final void Oooo0OO(float f) {
        if (this.f33242OooooO0 != f) {
            float fOooOo = OooOo();
            this.f33242OooooO0 = f;
            float fOooOo2 = OooOo();
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    public final void Oooo0o(boolean z) {
        if (this.f33239OoooOoo != z) {
            boolean zOoooOoO = OoooOoO();
            this.f33239OoooOoo = z;
            boolean zOoooOoO2 = OoooOoO();
            if (zOoooOoO != zOoooOoO2) {
                if (zOoooOoO2) {
                    OooOo0O(this.f33240Ooooo00);
                } else {
                    Ooooo00(this.f33240Ooooo00);
                }
                invalidateSelf();
                OooOoo();
            }
        }
    }

    public final void Oooo0o0(ColorStateList colorStateList) {
        this.f33243OooooOO = true;
        if (this.f33241Ooooo0o != colorStateList) {
            this.f33241Ooooo0o = colorStateList;
            if (OoooOoO()) {
                DrawableCompat.setTintList(this.f33240Ooooo00, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oO(ColorStateList colorStateList) {
        if (this.f33235OoooOOO != colorStateList) {
            this.f33235OoooOOO = colorStateList;
            if (this.f33267o0000OOO) {
                OooOOo(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oo(float f) {
        if (this.f33236OoooOOo != f) {
            this.f33236OoooOOo = f;
            this.f33287oo0o0Oo.setStrokeWidth(f);
            if (this.f33267o0000OOO) {
                this.f29048OooOo0O.f29036OooOO0 = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void OoooO(ColorStateList colorStateList) {
        if (this.f33247OoooooO != colorStateList) {
            this.f33247OoooooO = colorStateList;
            if (OoooOoo()) {
                DrawableCompat.setTintList(this.f33246Oooooo0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OoooO0(float f) {
        if (this.f33248Ooooooo != f) {
            this.f33248Ooooooo = f;
            invalidateSelf();
            if (OoooOoo()) {
                OooOoo();
            }
        }
    }

    public final void OoooO00(float f) {
        if (this.f33282o0OOO0o != f) {
            this.f33282o0OOO0o = f;
            invalidateSelf();
            if (OoooOoo()) {
                OooOoo();
            }
        }
    }

    public final void OoooO0O(float f) {
        if (this.o0ooOoO != f) {
            this.o0ooOoO = f;
            invalidateSelf();
            if (OoooOoo()) {
                OooOoo();
            }
        }
    }

    public final void OoooOO0(boolean z) {
        if (this.f33244OooooOo != z) {
            boolean zOoooOoo = OoooOoo();
            this.f33244OooooOo = z;
            boolean zOoooOoo2 = OoooOoo();
            if (zOoooOoo != zOoooOoo2) {
                if (zOoooOoo2) {
                    OooOo0O(this.f33246Oooooo0);
                } else {
                    Ooooo00(this.f33246Oooooo0);
                }
                invalidateSelf();
                OooOoo();
            }
        }
    }

    public final void OoooOOO(float f) {
        if (this.f33278o00oO0o != f) {
            float fOooOo = OooOo();
            this.f33278o00oO0o = f;
            float fOooOo2 = OooOo();
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    public final void OoooOOo(ColorStateList colorStateList) {
        if (this.f33237OoooOo0 != colorStateList) {
            this.f33237OoooOo0 = colorStateList;
            this.f33264o0000O0O = null;
            onStateChange(getState());
        }
    }

    public final boolean OoooOo0() {
        return this.f33273o00O0O && this.f33274o00Oo0 != null && this.f33268o0000Ooo;
    }

    public final boolean OoooOoO() {
        return this.f33239OoooOoo && this.f33240Ooooo00 != null;
    }

    public final boolean OoooOoo() {
        return this.f33244OooooOo && this.f33246Oooooo0 != null;
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f33260o00000oo) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f33267o0000OOO;
        Paint paint = this.f33287oo0o0Oo;
        RectF rectF = this.f33272o000OOo;
        if (!z) {
            paint.setColor(this.f33250o00000);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, OooOoO(), OooOoO(), paint);
        }
        if (!this.f33267o0000OOO) {
            paint.setColor(this.f33255o00000O0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f33249o0000;
            if (colorFilter == null) {
                colorFilter = this.f33263o0000O00;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, OooOoO(), OooOoO(), paint);
        }
        if (this.f33267o0000OOO) {
            super.draw(canvas);
        }
        if (this.f33236OoooOOo > 0.0f && !this.f33267o0000OOO) {
            paint.setColor(this.f33256o00000OO);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f33267o0000OOO) {
                ColorFilter colorFilter2 = this.f33249o0000;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f33263o0000O00;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.f33236OoooOOo / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.o000oOoO - (this.f33236OoooOOo / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.f33257o00000Oo);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f33267o0000OOO) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f33252o000000O;
            OooOO0O oooOO0O = this.f29048OooOo0O;
            this.f29064Oooo0o.OooO00o(oooOO0O.f29028OooO00o, oooOO0O.f29027OooO, rectF2, this.f29065Oooo0o0, path);
            OooO0o0(canvas2, paint, path, this.f29048OooOo0O.f29028OooO00o, OooO0oO());
        } else {
            canvas2.drawRoundRect(rectF, OooOoO(), OooOoO(), paint);
        }
        if (OoooOoO()) {
            OooOo0o(bounds, rectF);
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas2.translate(f4, f5);
            this.f33240Ooooo00.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f33240Ooooo00.draw(canvas2);
            canvas2.translate(-f4, -f5);
        }
        if (OoooOo0()) {
            OooOo0o(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f33274o00Oo0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f33274o00Oo0.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (this.f33266o0000OO0 && this.f33238OoooOoO != null) {
            PointF pointF = this.f33251o000000;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f33238OoooOoO;
            o000000 o000000Var = this.f33253o000000o;
            if (charSequence != null) {
                float fOooOo = OooOo() + this.f33286oo000o + this.f33285o0ooOO0;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    pointF.x = bounds.left + fOooOo;
                } else {
                    pointF.x = bounds.right - fOooOo;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = o000000Var.f33088OooO00o;
                Paint.FontMetrics fontMetrics = this.f33280o0O0O00;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f33238OoooOoO != null) {
                float fOooOo2 = OooOo() + this.f33286oo000o + this.f33285o0ooOO0;
                float fOooOoO0 = OooOoO0() + this.f33283o0Oo0oo + this.o0ooOOo;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    rectF.left = bounds.left + fOooOo2;
                    rectF.right = bounds.right - fOooOoO0;
                } else {
                    rectF.left = bounds.left + fOooOoO0;
                    rectF.right = bounds.right - fOooOo2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            OooOO0 oooOO0 = o000000Var.f33092OooO0o;
            TextPaint textPaint2 = o000000Var.f33088OooO00o;
            if (oooOO0 != null) {
                textPaint2.drawableState = getState();
                o000000Var.f33092OooO0o.OooO0Oo(this.f33281o0OO00O, textPaint2, o000000Var.f33089OooO0O0);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(o000000Var.OooO00o(this.f33238OoooOoO.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f33238OoooOoO;
            if (z2 && this.f33261o0000O != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f33261o0000O);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (OoooOoo()) {
            rectF.setEmpty();
            if (OoooOoo()) {
                float f8 = this.f33283o0Oo0oo + this.f33282o0OOO0o;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    float f9 = bounds.right - f8;
                    rectF.right = f9;
                    rectF.left = f9 - this.f33248Ooooooo;
                } else {
                    float f10 = bounds.left + f8;
                    rectF.left = f10;
                    rectF.right = f10 + this.f33248Ooooooo;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f11 = this.f33248Ooooooo;
                float f12 = fExactCenterY - (f11 / 2.0f);
                rectF.top = f12;
                rectF.bottom = f12 + f11;
            }
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f33246Oooooo0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = OooO00o.f32822OooO00o;
            this.f33245Oooooo.setBounds(this.f33246Oooooo0.getBounds());
            this.f33245Oooooo.jumpToCurrentState();
            this.f33245Oooooo.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (this.f33260o00000oo < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f33260o00000oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f33249o0000;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f33234OoooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(OooOoO0() + this.f33253o000000o.OooO00o(this.f33238OoooOoO.toString()) + OooOo() + this.f33286oo000o + this.f33285o0ooOO0 + this.o0ooOOo + this.f33283o0Oo0oo), this.f33265o0000OO);
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f33267o0000OOO) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f33234OoooOO0, this.o000oOoO);
        } else {
            outline.setRoundRect(bounds, this.o000oOoO);
            outline2 = outline;
        }
        outline2.setAlpha(this.f33260o00000oo / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (OooOoOO(this.f33233OoooO0O) || OooOoOO(this.f33232OoooO) || OooOoOO(this.f33235OoooOOO)) {
            return true;
        }
        OooOO0 oooOO0 = this.f33253o000000o.f33092OooO0o;
        if (oooOO0 == null || (colorStateList = oooOO0.f33224OooOO0) == null || !colorStateList.isStateful()) {
            return (this.f33273o00O0O && this.f33274o00Oo0 != null && this.f33288ooOO) || OooOoo0(this.f33240Ooooo00) || OooOoo0(this.f33274o00Oo0) || OooOoOO(this.f33270o0000oo);
        }
        return true;
    }

    public final void o000oOoO(float f) {
        if (this.f33277o00oO0O != f) {
            float fOooOo = OooOo();
            this.f33277o00oO0O = f;
            float fOooOo2 = OooOo();
            invalidateSelf();
            if (fOooOo != fOooOo2) {
                OooOoo();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (OoooOoO()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f33240Ooooo00, i);
        }
        if (OoooOo0()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f33274o00Oo0, i);
        }
        if (OoooOoo()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f33246Oooooo0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (OoooOoO()) {
            zOnLevelChange |= this.f33240Ooooo00.setLevel(i);
        }
        if (OoooOo0()) {
            zOnLevelChange |= this.f33274o00Oo0.setLevel(i);
        }
        if (OoooOoo()) {
            zOnLevelChange |= this.f33246Oooooo0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f33267o0000OOO) {
            super.onStateChange(iArr);
        }
        return OooOooO(iArr, this.f33262o0000O0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f33260o00000oo != i) {
            this.f33260o00000oo = i;
            invalidateSelf();
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f33249o0000 != colorFilter) {
            this.f33249o0000 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f33270o0000oo != colorStateList) {
            this.f33270o0000oo = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f33269o0000oO != mode) {
            this.f33269o0000oO = mode;
            ColorStateList colorStateList = this.f33270o0000oo;
            this.f33263o0000O00 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (OoooOoO()) {
            visible |= this.f33240Ooooo00.setVisible(z, z2);
        }
        if (OoooOo0()) {
            visible |= this.f33274o00Oo0.setVisible(z, z2);
        }
        if (OoooOoo()) {
            visible |= this.f33246Oooooo0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
