package OoooooO;

import OooO00o.OooO00o;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.button.MaterialButton;
import o000000.OooOOO0;
import o000000.Oooo000;
import o000000.o0Oo0oo;

/* loaded from: classes2.dex */
public final class oo00 {

    /* renamed from: OooO, reason: collision with root package name */
    public PorterDuff.Mode f15108OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final MaterialButton f15109OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Oooo000 f15110OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f15111OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f15112OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f15113OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f15114OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f15115OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f15116OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public ColorStateList f15117OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public ColorStateList f15118OooOO0O;
    public ColorStateList OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public OooOOO0 f15120OooOOO0;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15124OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public RippleDrawable f15125OooOOoo;

    /* renamed from: OooOo00, reason: collision with root package name */
    public int f15126OooOo00;

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f15119OooOOO = false;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public boolean f15121OooOOOO = false;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public boolean f15122OooOOOo = false;

    /* renamed from: OooOOo, reason: collision with root package name */
    public boolean f15123OooOOo = true;

    public oo00(MaterialButton materialButton, Oooo000 oooo000) {
        this.f15109OooO00o = materialButton;
        this.f15110OooO0O0 = oooo000;
    }

    public final o0Oo0oo OooO00o() {
        RippleDrawable rippleDrawable = this.f15125OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f15125OooOOoo.getNumberOfLayers() > 2 ? (o0Oo0oo) this.f15125OooOOoo.getDrawable(2) : (o0Oo0oo) this.f15125OooOOoo.getDrawable(1);
    }

    public final OooOOO0 OooO0O0(boolean z) {
        RippleDrawable rippleDrawable = this.f15125OooOOoo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (OooOOO0) ((LayerDrawable) ((InsetDrawable) this.f15125OooOOoo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void OooO0OO(Oooo000 oooo000) {
        this.f15110OooO0O0 = oooo000;
        if (OooO0O0(false) != null) {
            OooO0O0(false).setShapeAppearanceModel(oooo000);
        }
        if (OooO0O0(true) != null) {
            OooO0O0(true).setShapeAppearanceModel(oooo000);
        }
        if (OooO00o() != null) {
            OooO00o().setShapeAppearanceModel(oooo000);
        }
    }

    public final void OooO0Oo(int i, int i2) {
        MaterialButton materialButton = this.f15109OooO00o;
        int paddingStart = ViewCompat.getPaddingStart(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f15114OooO0o0;
        int i4 = this.f15113OooO0o;
        this.f15113OooO0o = i2;
        this.f15114OooO0o0 = i;
        if (!this.f15121OooOOOO) {
            OooO0o0();
        }
        ViewCompat.setPaddingRelative(materialButton, paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void OooO0o() {
        OooOOO0 oooOOO0OooO0O0 = OooO0O0(false);
        OooOOO0 oooOOO0OooO0O02 = OooO0O0(true);
        if (oooOOO0OooO0O0 != null) {
            float f = this.f15116OooO0oo;
            ColorStateList colorStateList = this.f15118OooOO0O;
            oooOOO0OooO0O0.f29048OooOo0O.f29036OooOO0 = f;
            oooOOO0OooO0O0.invalidateSelf();
            oooOOO0OooO0O0.OooOOo(colorStateList);
            if (oooOOO0OooO0O02 != null) {
                float f2 = this.f15116OooO0oo;
                int iOooOO0o = this.f15119OooOOO ? OooO00o.OooOO0o(this.f15109OooO00o, R.attr.colorSurface) : 0;
                oooOOO0OooO0O02.f29048OooOo0O.f29036OooOO0 = f2;
                oooOOO0OooO0O02.invalidateSelf();
                oooOOO0OooO0O02.OooOOo(ColorStateList.valueOf(iOooOO0o));
            }
        }
    }

    public final void OooO0o0() {
        OooOOO0 oooOOO0 = new OooOOO0(this.f15110OooO0O0);
        MaterialButton materialButton = this.f15109OooO00o;
        oooOOO0.OooOO0O(materialButton.getContext());
        DrawableCompat.setTintList(oooOOO0, this.f15117OooOO0);
        PorterDuff.Mode mode = this.f15108OooO;
        if (mode != null) {
            DrawableCompat.setTintMode(oooOOO0, mode);
        }
        float f = this.f15116OooO0oo;
        ColorStateList colorStateList = this.f15118OooOO0O;
        oooOOO0.f29048OooOo0O.f29036OooOO0 = f;
        oooOOO0.invalidateSelf();
        oooOOO0.OooOOo(colorStateList);
        OooOOO0 oooOOO02 = new OooOOO0(this.f15110OooO0O0);
        oooOOO02.setTint(0);
        float f2 = this.f15116OooO0oo;
        int iOooOO0o = this.f15119OooOOO ? OooO00o.OooOO0o(materialButton, R.attr.colorSurface) : 0;
        oooOOO02.f29048OooOo0O.f29036OooOO0 = f2;
        oooOOO02.invalidateSelf();
        oooOOO02.OooOOo(ColorStateList.valueOf(iOooOO0o));
        OooOOO0 oooOOO03 = new OooOOO0(this.f15110OooO0O0);
        this.f15120OooOOO0 = oooOOO03;
        DrawableCompat.setTint(oooOOO03, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(o0O0O00.OooO00o.OooO0OO(this.OooOO0o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{oooOOO02, oooOOO0}), this.f15111OooO0OO, this.f15114OooO0o0, this.f15112OooO0Oo, this.f15113OooO0o), this.f15120OooOOO0);
        this.f15125OooOOoo = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        OooOOO0 oooOOO0OooO0O0 = OooO0O0(false);
        if (oooOOO0OooO0O0 != null) {
            oooOOO0OooO0O0.OooOO0o(this.f15126OooOo00);
            oooOOO0OooO0O0.setState(materialButton.getDrawableState());
        }
    }
}
