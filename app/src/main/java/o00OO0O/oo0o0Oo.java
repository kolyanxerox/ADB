package o00oO0o;

import Ooooo0o.o00O0OO;
import Ooooo0o.o00OO000;
import Ooooo0o.o00OO00O;
import Ooooo0o.oo0o0O0;
import OooooOo.oOOO00o0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.github.superadb.R;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o000000.OooOOO0;
import o0O0O00.OooO00o;

/* loaded from: classes2.dex */
public abstract class oo0o0Oo {

    /* renamed from: OooO */
    public float f32771OooO;

    /* renamed from: OooO00o */
    public o000000.Oooo000 f32772OooO00o;

    /* renamed from: OooO0O0 */
    public OooOOO0 f32773OooO0O0;

    /* renamed from: OooO0OO */
    public Drawable f32774OooO0OO;

    /* renamed from: OooO0Oo */
    public OooOo00 f32775OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f32776OooO0o;

    /* renamed from: OooO0o0 */
    public LayerDrawable f32777OooO0o0;

    /* renamed from: OooO0oo */
    public float f32779OooO0oo;

    /* renamed from: OooOO0 */
    public float f32780OooOO0;

    /* renamed from: OooOO0O */
    public int f32781OooOO0O;
    public Animator OooOO0o;

    /* renamed from: OooOOO */
    public o00OO00O f32782OooOOO;

    /* renamed from: OooOOO0 */
    public o00OO00O f32783OooOOO0;

    /* renamed from: OooOOOO */
    public float f32784OooOOOO;

    /* renamed from: OooOOo0 */
    public int f32787OooOOo0;

    /* renamed from: OooOOoo */
    public ArrayList f32788OooOOoo;
    public ArrayList OooOo0;

    /* renamed from: OooOo00 */
    public ArrayList f32790OooOo00;

    /* renamed from: OooOo0O */
    public final FloatingActionButton f32791OooOo0O;

    /* renamed from: OooOo0o */
    public final o000Ooo.o00oO0o f32792OooOo0o;

    /* renamed from: OooOoo0 */
    public o0ooOOo f32796OooOoo0;

    /* renamed from: OooOoo */
    public static final FastOutLinearInInterpolator f32760OooOoo = oo0o0O0.f15017OooO0OO;

    /* renamed from: OooOooO */
    public static final int f32761OooOooO = R.attr.motionDurationLong2;

    /* renamed from: OooOooo */
    public static final int f32762OooOooo = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: Oooo000 */
    public static final int f32764Oooo000 = R.attr.motionDurationMedium1;

    /* renamed from: Oooo00O */
    public static final int f32765Oooo00O = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: Oooo00o */
    public static final int[] f32766Oooo00o = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: Oooo0 */
    public static final int[] f32763Oooo0 = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: Oooo0O0 */
    public static final int[] f32767Oooo0O0 = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: Oooo0OO */
    public static final int[] f32768Oooo0OO = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: Oooo0o0 */
    public static final int[] f32770Oooo0o0 = {android.R.attr.state_enabled};

    /* renamed from: Oooo0o */
    public static final int[] f32769Oooo0o = new int[0];

    /* renamed from: OooO0oO */
    public boolean f32778OooO0oO = true;

    /* renamed from: OooOOOo */
    public float f32785OooOOOo = 1.0f;

    /* renamed from: OooOOo */
    public int f32786OooOOo = 0;

    /* renamed from: OooOo */
    public final Rect f32789OooOo = new Rect();

    /* renamed from: OooOoO0 */
    public final RectF f32794OooOoO0 = new RectF();

    /* renamed from: OooOoO */
    public final RectF f32793OooOoO = new RectF();

    /* renamed from: OooOoOO */
    public final Matrix f32795OooOoOO = new Matrix();

    public oo0o0Oo(FloatingActionButton floatingActionButton, o000Ooo.o00oO0o o00oo0o) {
        this.f32791OooOo0O = floatingActionButton;
        this.f32792OooOo0o = o00oo0o;
        o0ooOO0.o0Oo0oo o0oo0oo = new o0ooOO0.o0Oo0oo();
        o000OOo o000ooo2 = (o000OOo) this;
        o0oo0oo.OooO00o(f32766Oooo00o, OooO0Oo(new o0Oo0oo(o000ooo2, 1)));
        o0oo0oo.OooO00o(f32763Oooo0, OooO0Oo(new o0Oo0oo(o000ooo2, 0)));
        o0oo0oo.OooO00o(f32767Oooo0O0, OooO0Oo(new o0Oo0oo(o000ooo2, 0)));
        o0oo0oo.OooO00o(f32768Oooo0OO, OooO0Oo(new o0Oo0oo(o000ooo2, 0)));
        o0oo0oo.OooO00o(f32770Oooo0o0, OooO0Oo(new o0Oo0oo(o000ooo2, 2)));
        o0oo0oo.OooO00o(f32769Oooo0o, OooO0Oo(new o0OOO0o(o000ooo2)));
        this.f32784OooOOOO = floatingActionButton.getRotation();
    }

    public static ValueAnimator OooO0Oo(o0OO00O o0oo00o) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f32760OooOoo);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(o0oo00o);
        valueAnimator.addUpdateListener(o0oo00o);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public abstract void OooO();

    public final void OooO00o(float f, Matrix matrix) {
        matrix.reset();
        if (this.f32791OooOo0O.getDrawable() == null || this.f32787OooOOo0 == 0) {
            return;
        }
        RectF rectF = this.f32794OooOoO0;
        RectF rectF2 = this.f32793OooOoO;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f2 = this.f32787OooOOo0;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.f32787OooOOo0 / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet OooO0O0(o00OO00O o00oo00o, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f32791OooOo0O;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        o00oo00o.OooO0o("opacity").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        o00oo00o.OooO0o("scale").OooO00o(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            o00oO0o o00oo0o = new o00oO0o();
            o00oo0o.f32742OooO00o = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(o00oo0o);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        o00oo00o.OooO0o("scale").OooO00o(objectAnimatorOfFloat3);
        if (i == 26) {
            o00oO0o o00oo0o2 = new o00oO0o();
            o00oo0o2.f32742OooO00o = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(o00oo0o2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f32795OooOoOO;
        OooO00o(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new o00OO000(), new o00Ooo(this), new Matrix(matrix));
        o00oo00o.OooO0o("iconScale").OooO00o(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        o00O0OO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet OooO0OO(int i, float f, float f2, int i2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f32791OooOo0O;
        valueAnimatorOfFloat.addUpdateListener(new oo000o(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.f32785OooOOOo, f3, new Matrix(this.f32795OooOoOO)));
        arrayList.add(valueAnimatorOfFloat);
        o00O0OO.OooO00o(animatorSet, arrayList);
        animatorSet.setDuration(o0OO00OO.OooOoo0(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(o0OO00OO.OooOoo(floatingActionButton.getContext(), i2, oo0o0O0.f15016OooO0O0));
        return animatorSet;
    }

    public void OooO0o(Rect rect) {
        int sizeDimension = this.f32776OooO0o ? (this.f32781OooOO0O - this.f32791OooOo0O.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f32778OooO0oO ? OooO0o0() + this.f32780OooOO0 : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public abstract float OooO0o0();

    public abstract void OooO0oO(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    public abstract void OooO0oo();

    public abstract void OooOO0(int[] iArr);

    public abstract void OooOO0O(float f, float f2, float f3);

    public final void OooOO0o() {
        ArrayList arrayList = this.OooOo0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o00O0O o00o0o = (o00O0O) obj;
                oOOO00o0 oooo00o0 = o00o0o.f32732OooO00o;
                oooo00o0.getClass();
                BottomAppBar bottomAppBar = oooo00o0.f15050OooOo0O;
                OooOOO0 oooOOO0 = bottomAppBar.f27348OooOo0o;
                FloatingActionButton floatingActionButton = o00o0o.f32733OooO0O0;
                oooOOO0.OooOOO((floatingActionButton.getVisibility() == 0 && bottomAppBar.f27353OooOoo0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public void OooOOO(ColorStateList colorStateList) {
        Drawable drawable = this.f32774OooO0OO;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, OooO00o.OooO0OO(colorStateList));
        }
    }

    public final void OooOOO0() {
        ArrayList arrayList = this.OooOo0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o00O0O o00o0o = (o00O0O) obj;
                oOOO00o0 oooo00o0 = o00o0o.f32732OooO00o;
                oooo00o0.getClass();
                BottomAppBar bottomAppBar = oooo00o0.f15050OooOo0O;
                if (bottomAppBar.f27353OooOoo0 == 1) {
                    FloatingActionButton floatingActionButton = o00o0o.f32733OooO0O0;
                    float translationX = floatingActionButton.getTranslationX();
                    float f = bottomAppBar.getTopEdgeTreatment().f15068OoooO;
                    OooOOO0 oooOOO0 = bottomAppBar.f27348OooOo0o;
                    if (f != translationX) {
                        bottomAppBar.getTopEdgeTreatment().f15068OoooO = translationX;
                        oooOOO0.invalidateSelf();
                    }
                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.getTopEdgeTreatment().f15071OoooO0O != fMax) {
                        bottomAppBar.getTopEdgeTreatment().OooOO0o(fMax);
                        oooOOO0.invalidateSelf();
                    }
                    oooOOO0.OooOOO(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void OooOOOO(o000000.Oooo000 oooo000) {
        this.f32772OooO00o = oooo000;
        OooOOO0 oooOOO0 = this.f32773OooO0O0;
        if (oooOOO0 != null) {
            oooOOO0.setShapeAppearanceModel(oooo000);
        }
        Object obj = this.f32774OooO0OO;
        if (obj instanceof o000000.o0Oo0oo) {
            ((o000000.o0Oo0oo) obj).setShapeAppearanceModel(oooo000);
        }
        OooOo00 oooOo00 = this.f32775OooO0Oo;
        if (oooOo00 != null) {
            oooOo00.f32723OooOOOO = oooo000;
            oooOo00.invalidateSelf();
        }
    }

    public abstract boolean OooOOOo();

    public final void OooOOo() {
        Rect rect = this.f32789OooOo;
        OooO0o(rect);
        Preconditions.checkNotNull(this.f32777OooO0o0, "Didn't initialize content background");
        boolean zOooOOOo = OooOOOo();
        o000Ooo.o00oO0o o00oo0o = this.f32792OooOo0o;
        if (zOooOOOo) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f32777OooO0o0, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f32777OooO0o0;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                o00oo0o.getClass();
            }
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) o00oo0o.f30487OooOo0o;
        floatingActionButton.f27648Oooo00O.set(i, i2, i3, i4);
        int i5 = floatingActionButton.f27644OooOooO;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public abstract void OooOOo0();
}
