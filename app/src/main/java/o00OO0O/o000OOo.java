package o00oO0o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.github.superadb.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o000000.OooOOO0;
import o0O0O00.OooO00o;

/* loaded from: classes2.dex */
public final class o000OOo extends oo0o0Oo {

    /* renamed from: Oooo0oO */
    public StateListAnimator f32729Oooo0oO;

    @Override // o00oO0o.oo0o0Oo
    public final void OooO() {
        OooOOo();
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooO0o(Rect rect) {
        if (((FloatingActionButton) this.f32792OooOo0o.f30487OooOo0o).f27647Oooo000) {
            super.OooO0o(rect);
            return;
        }
        if (this.f32776OooO0o) {
            FloatingActionButton floatingActionButton = this.f32791OooOo0O;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.f32781OooOO0O;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // o00oO0o.oo0o0Oo
    public final float OooO0o0() {
        return this.f32791OooOo0O.getElevation();
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooO0oO(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        o0O0O00 o0o0o00 = new o0O0O00((o000000.Oooo000) Preconditions.checkNotNull(this.f32772OooO00o));
        this.f32773OooO0O0 = o0o0o00;
        o0o0o00.setTintList(colorStateList);
        if (mode != null) {
            this.f32773OooO0O0.setTintMode(mode);
        }
        OooOOO0 oooOOO0 = this.f32773OooO0O0;
        FloatingActionButton floatingActionButton = this.f32791OooOo0O;
        oooOOO0.OooOO0O(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            OooOo00 oooOo00 = new OooOo00((o000000.Oooo000) Preconditions.checkNotNull(this.f32772OooO00o));
            int color = ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color);
            oooOo00.f32710OooO = color;
            oooOo00.f32719OooOO0 = color2;
            oooOo00.f32720OooOO0O = color3;
            oooOo00.OooOO0o = color4;
            float f = i;
            if (oooOo00.f32718OooO0oo != f) {
                oooOo00.f32718OooO0oo = f;
                oooOo00.f32712OooO0O0.setStrokeWidth(f * 1.3333f);
                oooOo00.f32721OooOOO = true;
                oooOo00.invalidateSelf();
            }
            if (colorStateList != null) {
                oooOo00.f32722OooOOO0 = colorStateList.getColorForState(oooOo00.getState(), oooOo00.f32722OooOOO0);
            }
            oooOo00.f32724OooOOOo = colorStateList;
            oooOo00.f32721OooOOO = true;
            oooOo00.invalidateSelf();
            this.f32775OooO0Oo = oooOo00;
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f32775OooO0Oo), (Drawable) Preconditions.checkNotNull(this.f32773OooO0O0)});
        } else {
            this.f32775OooO0Oo = null;
            layerDrawable = this.f32773OooO0O0;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(OooO00o.OooO0OO(colorStateList2), layerDrawable, null);
        this.f32774OooO0OO = rippleDrawable;
        this.f32777OooO0o0 = rippleDrawable;
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooOO0O(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f32791OooOo0O;
        if (floatingActionButton.getStateListAnimator() == this.f32729Oooo0oO) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(oo0o0Oo.f32766Oooo00o, OooOOoo(f, f3));
            stateListAnimator.addState(oo0o0Oo.f32763Oooo0, OooOOoo(f, f2));
            stateListAnimator.addState(oo0o0Oo.f32767Oooo0O0, OooOOoo(f, f2));
            stateListAnimator.addState(oo0o0Oo.f32768Oooo0OO, OooOOoo(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(oo0o0Oo.f32760OooOoo);
            stateListAnimator.addState(oo0o0Oo.f32770Oooo0o0, animatorSet);
            stateListAnimator.addState(oo0o0Oo.f32769Oooo0o, OooOOoo(0.0f, 0.0f));
            this.f32729Oooo0oO = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (OooOOOo()) {
            OooOOo();
        }
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooOOO(ColorStateList colorStateList) {
        Drawable drawable = this.f32774OooO0OO;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(OooO00o.OooO0OO(colorStateList));
        } else {
            super.OooOOO(colorStateList);
        }
    }

    @Override // o00oO0o.oo0o0Oo
    public final boolean OooOOOo() {
        if (((FloatingActionButton) this.f32792OooOo0o.f30487OooOo0o).f27647Oooo000) {
            return true;
        }
        return this.f32776OooO0o && this.f32791OooOo0O.getSizeDimension() < this.f32781OooOO0O;
    }

    public final AnimatorSet OooOOoo(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f32791OooOo0O;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(oo0o0Oo.f32760OooOoo);
        return animatorSet;
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooO0oo() {
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooOOo0() {
    }

    @Override // o00oO0o.oo0o0Oo
    public final void OooOO0(int[] iArr) {
    }
}
