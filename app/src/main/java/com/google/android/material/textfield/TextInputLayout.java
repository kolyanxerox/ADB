package com.google.android.material.textfield;

import OooO00o.OooO00o;
import OooOOo0.o0ooOOo;
import Oooo0oO.o00000;
import Ooooo0o.oo0o0O0;
import Oooooo.o00Oo0;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o000000.OooO;
import o000000.OooOO0O;
import o000000.OooOOO0;
import o000000.OooOo00;
import o000000.Oooo000;
import o00000O0.OooOOOO;
import o00000O0.OooOo;
import o00000O0.o000oOoO;
import o00000O0.o00oO0o;
import o00000O0.o0OO00O;
import o00000O0.o0OOO0o;
import o00000O0.o0Oo0oo;
import o00000O0.o0OoOo0;
import o00000O0.oo000o;
import o0ooOO0.OooOO0;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;
import oo0o0Oo.OooO0O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: o0000 */
    public static final int[][] f27876o0000 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: OooOo */
    public final OooOo f27877OooOo;

    /* renamed from: OooOo0O */
    public final FrameLayout f27878OooOo0O;

    /* renamed from: OooOo0o */
    public final oo000o f27879OooOo0o;

    /* renamed from: OooOoO */
    public int f27880OooOoO;

    /* renamed from: OooOoO0 */
    public EditText f27881OooOoO0;

    /* renamed from: OooOoOO */
    public int f27882OooOoOO;

    /* renamed from: OooOoo */
    public int f27883OooOoo;

    /* renamed from: OooOoo0 */
    public int f27884OooOoo0;

    /* renamed from: OooOooO */
    public final o0OoOo0 f27885OooOooO;

    /* renamed from: OooOooo */
    public boolean f27886OooOooo;

    /* renamed from: Oooo */
    public int f27887Oooo;

    /* renamed from: Oooo0 */
    public AppCompatTextView f27888Oooo0;

    /* renamed from: Oooo000 */
    public int f27889Oooo000;

    /* renamed from: Oooo00O */
    public boolean f27890Oooo00O;

    /* renamed from: Oooo00o */
    public o0Oo0oo f27891Oooo00o;

    /* renamed from: Oooo0O0 */
    public int f27892Oooo0O0;

    /* renamed from: Oooo0OO */
    public int f27893Oooo0OO;

    /* renamed from: Oooo0o */
    public boolean f27894Oooo0o;

    /* renamed from: Oooo0o0 */
    public CharSequence f27895Oooo0o0;

    /* renamed from: Oooo0oO */
    public AppCompatTextView f27896Oooo0oO;

    /* renamed from: Oooo0oo */
    public ColorStateList f27897Oooo0oo;

    /* renamed from: OoooO */
    public ColorStateList f27898OoooO;

    /* renamed from: OoooO0 */
    public Fade f27899OoooO0;

    /* renamed from: OoooO00 */
    public Fade f27900OoooO00;

    /* renamed from: OoooO0O */
    public ColorStateList f27901OoooO0O;

    /* renamed from: OoooOO0 */
    public boolean f27902OoooOO0;

    /* renamed from: OoooOOO */
    public boolean f27903OoooOOO;

    /* renamed from: OoooOOo */
    public OooOOO0 f27904OoooOOo;

    /* renamed from: OoooOo0 */
    public OooOOO0 f27905OoooOo0;

    /* renamed from: OoooOoO */
    public StateListDrawable f27906OoooOoO;

    /* renamed from: OoooOoo */
    public boolean f27907OoooOoo;

    /* renamed from: Ooooo00 */
    public OooOOO0 f27908Ooooo00;

    /* renamed from: Ooooo0o */
    public OooOOO0 f27909Ooooo0o;

    /* renamed from: OooooO0 */
    public Oooo000 f27910OooooO0;

    /* renamed from: OooooOO */
    public boolean f27911OooooOO;

    /* renamed from: OooooOo */
    public final int f27912OooooOo;

    /* renamed from: Oooooo */
    public int f27913Oooooo;

    /* renamed from: Oooooo0 */
    public int f27914Oooooo0;

    /* renamed from: OoooooO */
    public int f27915OoooooO;

    /* renamed from: Ooooooo */
    public int f27916Ooooooo;

    /* renamed from: o00000 */
    public int f27917o00000;

    /* renamed from: o000000 */
    public int f27918o000000;

    /* renamed from: o000000O */
    public int f27919o000000O;

    /* renamed from: o000000o */
    public int f27920o000000o;

    /* renamed from: o00000O */
    public boolean f27921o00000O;

    /* renamed from: o00000O0 */
    public int f27922o00000O0;

    /* renamed from: o00000OO */
    public final OooOO0 f27923o00000OO;

    /* renamed from: o00000Oo */
    public boolean f27924o00000Oo;

    /* renamed from: o00000o0 */
    public boolean f27925o00000o0;

    /* renamed from: o00000oO */
    public boolean f27926o00000oO;

    /* renamed from: o00000oo */
    public boolean f27927o00000oo;

    /* renamed from: o0000Ooo */
    public ValueAnimator f27928o0000Ooo;

    /* renamed from: o000OOo */
    public ColorStateList f27929o000OOo;
    public CharSequence o000oOoO;

    /* renamed from: o00O0O */
    public int f27930o00O0O;

    /* renamed from: o00Oo0 */
    public final Rect f27931o00Oo0;

    /* renamed from: o00Ooo */
    public final Rect f27932o00Ooo;

    /* renamed from: o00o0O */
    public final RectF f27933o00o0O;

    /* renamed from: o00oO0O */
    public final LinkedHashSet f27934o00oO0O;

    /* renamed from: o00oO0o */
    public int f27935o00oO0o;

    /* renamed from: o00ooo */
    public Typeface f27936o00ooo;

    /* renamed from: o0O0O00 */
    public int f27937o0O0O00;

    /* renamed from: o0OO00O */
    public int f27938o0OO00O;

    /* renamed from: o0OOO0o */
    public ColorStateList f27939o0OOO0o;

    /* renamed from: o0Oo0oo */
    public ColorStateList f27940o0Oo0oo;

    /* renamed from: o0OoOo0 */
    public int f27941o0OoOo0;

    /* renamed from: o0ooOO0 */
    public ColorDrawable f27942o0ooOO0;
    public int o0ooOOo;
    public Drawable o0ooOoO;

    /* renamed from: oo000o */
    public ColorDrawable f27943oo000o;

    /* renamed from: oo0o0Oo */
    public int f27944oo0o0Oo;

    /* renamed from: ooOO */
    public int f27945ooOO;

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.github.superadb.R.attr.textInputStyle);
    }

    public static void OooOO0(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOO0((ViewGroup) childAt, z);
            }
        }
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f27881OooOoO0;
        if (!(editText instanceof AutoCompleteTextView) || o00000.OooOO0(editText)) {
            return this.f27904OoooOOo;
        }
        int iOooOO0o = OooO00o.OooOO0o(this.f27881OooOoO0, com.github.superadb.R.attr.colorControlHighlight);
        int i = this.f27914Oooooo0;
        int[][] iArr = f27876o0000;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            OooOOO0 oooOOO0 = this.f27904OoooOOo;
            int i2 = this.f27930o00O0O;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{OooO00o.OooOOo(0.1f, iOooOO0o, i2), i2}), oooOOO0, oooOOO0);
        }
        Context context = getContext();
        OooOOO0 oooOOO02 = this.f27904OoooOOo;
        TypedValue typedValueOooO0OO = OooO0O0.OooO0OO(context, "TextInputLayout", com.github.superadb.R.attr.colorSurface);
        int i3 = typedValueOooO0OO.resourceId;
        int color = i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueOooO0OO.data;
        OooOOO0 oooOOO03 = new OooOOO0(oooOOO02.f29048OooOo0O.f29028OooO00o);
        int iOooOOo = OooO00o.OooOOo(0.1f, iOooOO0o, color);
        oooOOO03.OooOOO0(new ColorStateList(iArr, new int[]{iOooOOo, 0}));
        oooOOO03.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iOooOOo, color});
        OooOOO0 oooOOO04 = new OooOOO0(oooOOO02.f29048OooOo0O.f29028OooO00o);
        oooOOO04.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, oooOOO03, oooOOO04), oooOOO02});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f27906OoooOoO == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f27906OoooOoO = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f27906OoooOoO.addState(new int[0], OooO0o0(false));
        }
        return this.f27906OoooOoO;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f27905OoooOo0 == null) {
            this.f27905OoooOo0 = OooO0o0(true);
        }
        return this.f27905OoooOo0;
    }

    private void setEditText(EditText editText) {
        if (this.f27881OooOoO0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f27881OooOoO0 = editText;
        int i = this.f27880OooOoO;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f27884OooOoo0);
        }
        int i2 = this.f27882OooOoOO;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f27883OooOoo);
        }
        this.f27907OoooOoo = false;
        OooO0oo();
        setTextInputAccessibilityDelegate(new o0OOO0o(this));
        Typeface typeface = this.f27881OooOoO0.getTypeface();
        OooOO0 oooOO0 = this.f27923o00000OO;
        boolean zOooOOO0 = oooOO0.OooOOO0(typeface);
        boolean zOooOOOO = oooOO0.OooOOOO(typeface);
        if (zOooOOO0 || zOooOOOO) {
            oooOO0.OooO(false);
        }
        float textSize = this.f27881OooOoO0.getTextSize();
        if (oooOO0.OooOO0o != textSize) {
            oooOO0.OooOO0o = textSize;
            oooOO0.OooO(false);
        }
        float letterSpacing = this.f27881OooOoO0.getLetterSpacing();
        if (oooOO0.f33069Oooooo0 != letterSpacing) {
            oooOO0.f33069Oooooo0 = letterSpacing;
            oooOO0.OooO(false);
        }
        int gravity = this.f27881OooOoO0.getGravity();
        oooOO0.OooOO0o((gravity & (-113)) | 48);
        if (oooOO0.f33022OooOO0 != gravity) {
            oooOO0.f33022OooOO0 = gravity;
            oooOO0.OooO(false);
        }
        this.f27881OooOoO0.addTextChangedListener(new o00oO0o(this));
        if (this.f27939o0OOO0o == null) {
            this.f27939o0OOO0o = this.f27881OooOoO0.getHintTextColors();
        }
        if (this.f27902OoooOO0) {
            if (TextUtils.isEmpty(this.o000oOoO)) {
                setHint(this.f27881OooOoO0.getHint());
                this.f27881OooOoO0.setHint((CharSequence) null);
            }
            this.f27903OoooOOO = true;
        }
        if (this.f27888Oooo0 != null) {
            OooOOO0(this.f27881OooOoO0.getText());
        }
        OooOOOo();
        this.f27885OooOooO.OooO0O0();
        this.f27879OooOo0o.bringToFront();
        OooOo oooOo = this.f27877OooOo;
        oooOo.bringToFront();
        Iterator it = this.f27934o00oO0O.iterator();
        while (it.hasNext()) {
            ((OooOOOO) it.next()).OooO00o(this);
        }
        oooOo.OooOO0o();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        OooOOoo(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.o000oOoO)) {
            return;
        }
        this.o000oOoO = charSequence;
        OooOO0 oooOO0 = this.f27923o00000OO;
        if (charSequence == null || !TextUtils.equals(oooOO0.f33045Oooo00O, charSequence)) {
            oooOO0.f33045Oooo00O = charSequence;
            oooOO0.f33046Oooo00o = null;
            Bitmap bitmap = oooOO0.f33048Oooo0OO;
            if (bitmap != null) {
                bitmap.recycle();
                oooOO0.f33048Oooo0OO = null;
            }
            oooOO0.OooO(false);
        }
        if (this.f27921o00000O) {
            return;
        }
        OooO();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f27894Oooo0o == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.f27896Oooo0oO;
            if (appCompatTextView != null) {
                this.f27878OooOo0O.addView(appCompatTextView);
                this.f27896Oooo0oO.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f27896Oooo0oO;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f27896Oooo0oO = null;
        }
        this.f27894Oooo0o = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooO():void");
    }

    public final void OooO00o(float f) {
        OooOO0 oooOO0 = this.f27923o00000OO;
        if (oooOO0.f33015OooO0O0 == f) {
            return;
        }
        if (this.f27928o0000Ooo == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27928o0000Ooo = valueAnimator;
            valueAnimator.setInterpolator(oo0o0O0.f15016OooO0O0);
            this.f27928o0000Ooo.setDuration(167L);
            this.f27928o0000Ooo.addUpdateListener(new o00Oo0(this, 3));
        }
        this.f27928o0000Ooo.setFloatValues(oooOO0.f33015OooO0O0, f);
        this.f27928o0000Ooo.start();
    }

    public final void OooO0O0() {
        int i;
        int i2;
        OooOOO0 oooOOO0 = this.f27904OoooOOo;
        if (oooOOO0 == null) {
            return;
        }
        Oooo000 oooo000 = oooOOO0.f29048OooOo0O.f29028OooO00o;
        Oooo000 oooo0002 = this.f27910OooooO0;
        if (oooo000 != oooo0002) {
            oooOOO0.setShapeAppearanceModel(oooo0002);
        }
        if (this.f27914Oooooo0 == 2 && (i = this.f27915OoooooO) > -1 && (i2 = this.f27945ooOO) != 0) {
            OooOOO0 oooOOO02 = this.f27904OoooOOo;
            oooOOO02.f29048OooOo0O.f29036OooOO0 = i;
            oooOOO02.invalidateSelf();
            oooOOO02.OooOOo(ColorStateList.valueOf(i2));
        }
        int iCompositeColors = this.f27930o00O0O;
        if (this.f27914Oooooo0 == 1) {
            iCompositeColors = ColorUtils.compositeColors(this.f27930o00O0O, OooO00o.OooOO0O(getContext(), com.github.superadb.R.attr.colorSurface, 0));
        }
        this.f27930o00O0O = iCompositeColors;
        this.f27904OoooOOo.OooOOO0(ColorStateList.valueOf(iCompositeColors));
        OooOOO0 oooOOO03 = this.f27908Ooooo00;
        if (oooOOO03 != null && this.f27909Ooooo0o != null) {
            if (this.f27915OoooooO > -1 && this.f27945ooOO != 0) {
                oooOOO03.OooOOO0(this.f27881OooOoO0.isFocused() ? ColorStateList.valueOf(this.f27938o0OO00O) : ColorStateList.valueOf(this.f27945ooOO));
                this.f27909Ooooo0o.OooOOO0(ColorStateList.valueOf(this.f27945ooOO));
            }
            invalidate();
        }
        OooOOo0();
    }

    public final int OooO0OO() {
        float fOooO0o0;
        if (!this.f27902OoooOO0) {
            return 0;
        }
        int i = this.f27914Oooooo0;
        OooOO0 oooOO0 = this.f27923o00000OO;
        if (i == 0) {
            fOooO0o0 = oooOO0.OooO0o0();
        } else {
            if (i != 2) {
                return 0;
            }
            fOooO0o0 = oooOO0.OooO0o0() / 2.0f;
        }
        return (int) fOooO0o0;
    }

    public final boolean OooO0Oo() {
        return this.f27902OoooOO0 && !TextUtils.isEmpty(this.o000oOoO) && (this.f27904OoooOOo instanceof o00000O0.OooOO0);
    }

    public final int OooO0o(int i, boolean z) {
        int compoundPaddingLeft = this.f27881OooOoO0.getCompoundPaddingLeft() + i;
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return getPrefixTextView().getPaddingLeft() + (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth());
    }

    public final OooOOO0 OooO0o0(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f27881OooOoO0;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        OooOo00 oooOo00 = new OooOo00();
        OooOo00 oooOo002 = new OooOo00();
        OooOo00 oooOo003 = new OooOo00();
        OooOo00 oooOo004 = new OooOo00();
        OooO oooO = new OooO(0);
        OooO oooO2 = new OooO(0);
        OooO oooO3 = new OooO(0);
        OooO oooO4 = new OooO(0);
        o000000.OooO00o oooO00o = new o000000.OooO00o(f);
        o000000.OooO00o oooO00o2 = new o000000.OooO00o(f);
        o000000.OooO00o oooO00o3 = new o000000.OooO00o(dimensionPixelOffset);
        o000000.OooO00o oooO00o4 = new o000000.OooO00o(dimensionPixelOffset);
        Oooo000 oooo000 = new Oooo000();
        oooo000.f29084OooO00o = oooOo00;
        oooo000.f29085OooO0O0 = oooOo002;
        oooo000.f29086OooO0OO = oooOo003;
        oooo000.f29087OooO0Oo = oooOo004;
        oooo000.f29089OooO0o0 = oooO00o;
        oooo000.f29088OooO0o = oooO00o2;
        oooo000.f29090OooO0oO = oooO00o4;
        oooo000.f29091OooO0oo = oooO00o3;
        oooo000.f29083OooO = oooO;
        oooo000.f29092OooOO0 = oooO2;
        oooo000.f29093OooOO0O = oooO3;
        oooo000.OooOO0o = oooO4;
        Context context = getContext();
        Paint paint = OooOOO0.f29046OoooO0;
        TypedValue typedValueOooO0OO = OooO0O0.OooO0OO(context, OooOOO0.class.getSimpleName(), com.github.superadb.R.attr.colorSurface);
        int i = typedValueOooO0OO.resourceId;
        int color = i != 0 ? ContextCompat.getColor(context, i) : typedValueOooO0OO.data;
        OooOOO0 oooOOO0 = new OooOOO0();
        oooOOO0.OooOO0O(context);
        oooOOO0.OooOOO0(ColorStateList.valueOf(color));
        oooOOO0.OooOO0o(popupElevation);
        oooOOO0.setShapeAppearanceModel(oooo000);
        OooOO0O oooOO0O = oooOOO0.f29048OooOo0O;
        if (oooOO0O.f29034OooO0oO == null) {
            oooOO0O.f29034OooO0oO = new Rect();
        }
        oooOOO0.f29048OooOo0O.f29034OooO0oO.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        oooOOO0.invalidateSelf();
        return oooOOO0;
    }

    public final int OooO0oO(int i, boolean z) {
        int compoundPaddingRight = i - this.f27881OooOoO0.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
    }

    public final void OooO0oo() {
        int i = this.f27914Oooooo0;
        if (i == 0) {
            this.f27904OoooOOo = null;
            this.f27908Ooooo00 = null;
            this.f27909Ooooo0o = null;
        } else if (i == 1) {
            this.f27904OoooOOo = new OooOOO0(this.f27910OooooO0);
            this.f27908Ooooo00 = new OooOOO0();
            this.f27909Ooooo0o = new OooOOO0();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOOO(new StringBuilder(), this.f27914Oooooo0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f27902OoooOO0 || (this.f27904OoooOOo instanceof o00000O0.OooOO0)) {
                this.f27904OoooOOo = new OooOOO0(this.f27910OooooO0);
            } else {
                this.f27904OoooOOo = new o00000O0.OooOO0(this.f27910OooooO0);
            }
            this.f27908Ooooo00 = null;
            this.f27909Ooooo0o = null;
        }
        OooOOo0();
        OooOo0O();
        if (this.f27914Oooooo0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f27913Oooooo = getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (OooO0OO.OooO0o0(getContext())) {
                this.f27913Oooooo = getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f27881OooOoO0 != null && this.f27914Oooooo0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f27881OooOoO0;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f27881OooOoO0), getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (OooO0OO.OooO0o0(getContext())) {
                EditText editText2 = this.f27881OooOoO0;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f27881OooOoO0), getResources().getDimensionPixelSize(com.github.superadb.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f27914Oooooo0 != 0) {
            OooOOo();
        }
        EditText editText3 = this.f27881OooOoO0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.f27914Oooooo0;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i2 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void OooOO0O(AppCompatTextView appCompatTextView, int i) {
        try {
            TextViewCompat.setTextAppearance(appCompatTextView, i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(appCompatTextView, com.github.superadb.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), com.github.superadb.R.color.design_error));
    }

    public final boolean OooOO0o() {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        return (o0oooo0.f29212OooO != 1 || o0oooo0.OooOO0o == null || TextUtils.isEmpty(o0oooo0.f29221OooOO0)) ? false : true;
    }

    public final void OooOOO() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f27888Oooo0;
        if (appCompatTextView != null) {
            OooOO0O(appCompatTextView, this.f27890Oooo00O ? this.f27892Oooo0O0 : this.f27893Oooo0OO);
            if (!this.f27890Oooo00O && (colorStateList2 = this.f27901OoooO0O) != null) {
                this.f27888Oooo0.setTextColor(colorStateList2);
            }
            if (!this.f27890Oooo00O || (colorStateList = this.f27898OoooO) == null) {
                return;
            }
            this.f27888Oooo0.setTextColor(colorStateList);
        }
    }

    public final void OooOOO0(Editable editable) {
        ((o0ooOOo) this.f27891Oooo00o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f27890Oooo00O;
        int i = this.f27889Oooo000;
        if (i == -1) {
            this.f27888Oooo0.setText(String.valueOf(length));
            this.f27888Oooo0.setContentDescription(null);
            this.f27890Oooo00O = false;
        } else {
            this.f27890Oooo00O = length > i;
            Context context = getContext();
            this.f27888Oooo0.setContentDescription(context.getString(this.f27890Oooo00O ? com.github.superadb.R.string.character_counter_overflowed_content_description : com.github.superadb.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f27889Oooo000)));
            if (z != this.f27890Oooo00O) {
                OooOOO();
            }
            this.f27888Oooo0.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(com.github.superadb.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f27889Oooo000))));
        }
        if (this.f27881OooOoO0 == null || z == this.f27890Oooo00O) {
            return;
        }
        OooOOoo(false, false);
        OooOo0O();
        OooOOOo();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOOO() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOOOO():boolean");
    }

    public final void OooOOOo() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f27881OooOoO0;
        if (editText == null || this.f27914Oooooo0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (OooOO0o()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f27890Oooo00O && (appCompatTextView = this.f27888Oooo0) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.f27881OooOoO0.refreshDrawableState();
        }
    }

    public final void OooOOo() {
        if (this.f27914Oooooo0 != 1) {
            FrameLayout frameLayout = this.f27878OooOo0O;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iOooO0OO = OooO0OO();
            if (iOooO0OO != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0OO;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOOo0() {
        EditText editText = this.f27881OooOoO0;
        if (editText == null || this.f27904OoooOOo == null) {
            return;
        }
        if ((this.f27907OoooOoo || editText.getBackground() == null) && this.f27914Oooooo0 != 0) {
            ViewCompat.setBackground(this.f27881OooOoO0, getEditTextBoxBackground());
            this.f27907OoooOoo = true;
        }
    }

    public final void OooOOoo(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f27881OooOoO0;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f27881OooOoO0;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f27939o0OOO0o;
        OooOO0 oooOO0 = this.f27923o00000OO;
        if (colorStateList2 != null) {
            oooOO0.OooOO0O(colorStateList2);
            ColorStateList colorStateList3 = this.f27939o0OOO0o;
            if (oooOO0.f33024OooOOO != colorStateList3) {
                oooOO0.f33024OooOOO = colorStateList3;
                oooOO0.OooO(false);
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.f27939o0OOO0o;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f27922o00000O0) : this.f27922o00000O0;
            oooOO0.OooOO0O(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (oooOO0.f33024OooOOO != colorStateListValueOf) {
                oooOO0.f33024OooOOO = colorStateListValueOf;
                oooOO0.OooO(false);
            }
        } else if (OooOO0o()) {
            AppCompatTextView appCompatTextView2 = this.f27885OooOooO.OooOO0o;
            oooOO0.OooOO0O(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f27890Oooo00O && (appCompatTextView = this.f27888Oooo0) != null) {
            oooOO0.OooOO0O(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f27940o0Oo0oo) != null) {
            oooOO0.OooOO0O(colorStateList);
        }
        OooOo oooOo = this.f27877OooOo;
        oo000o oo000oVar = this.f27879OooOo0o;
        if (z3 || !this.f27924o00000Oo || (isEnabled() && z4)) {
            if (z2 || this.f27921o00000O) {
                ValueAnimator valueAnimator = this.f27928o0000Ooo;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f27928o0000Ooo.cancel();
                }
                if (z && this.f27925o00000o0) {
                    OooO00o(1.0f);
                } else {
                    oooOO0.OooOOOo(1.0f);
                }
                this.f27921o00000O = false;
                if (OooO0Oo()) {
                    OooO();
                }
                EditText editText3 = this.f27881OooOoO0;
                OooOo00(editText3 != null ? editText3.getText() : null);
                oo000oVar.f29239OooOoo = false;
                oo000oVar.OooO0Oo();
                oooOo.f29185Oooo0OO = false;
                oooOo.OooOOO0();
                return;
            }
            return;
        }
        if (z2 || !this.f27921o00000O) {
            ValueAnimator valueAnimator2 = this.f27928o0000Ooo;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f27928o0000Ooo.cancel();
            }
            if (z && this.f27925o00000o0) {
                OooO00o(0.0f);
            } else {
                oooOO0.OooOOOo(0.0f);
            }
            if (OooO0Oo() && !((o00000O0.OooOO0) this.f27904OoooOOo).f29156OoooO0O.isEmpty() && OooO0Oo()) {
                ((o00000O0.OooOO0) this.f27904OoooOOo).OooOo0O(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f27921o00000O = true;
            AppCompatTextView appCompatTextView3 = this.f27896Oooo0oO;
            if (appCompatTextView3 != null && this.f27894Oooo0o) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.beginDelayedTransition(this.f27878OooOo0O, this.f27899OoooO0);
                this.f27896Oooo0oO.setVisibility(4);
            }
            oo000oVar.f29239OooOoo = true;
            oo000oVar.OooO0Oo();
            oooOo.f29185Oooo0OO = true;
            oooOo.OooOOO0();
        }
    }

    public final void OooOo0(boolean z, boolean z2) {
        int defaultColor = this.f27929o000OOo.getDefaultColor();
        int colorForState = this.f27929o000OOo.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f27929o000OOo.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f27945ooOO = colorForState2;
        } else if (z2) {
            this.f27945ooOO = colorForState;
        } else {
            this.f27945ooOO = defaultColor;
        }
    }

    public final void OooOo00(Editable editable) {
        ((o0ooOOo) this.f27891Oooo00o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f27878OooOo0O;
        if (length != 0 || this.f27921o00000O) {
            AppCompatTextView appCompatTextView = this.f27896Oooo0oO;
            if (appCompatTextView == null || !this.f27894Oooo0o) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(frameLayout, this.f27899OoooO0);
            this.f27896Oooo0oO.setVisibility(4);
            return;
        }
        if (this.f27896Oooo0oO == null || !this.f27894Oooo0o || TextUtils.isEmpty(this.f27895Oooo0o0)) {
            return;
        }
        this.f27896Oooo0oO.setText(this.f27895Oooo0o0);
        TransitionManager.beginDelayedTransition(frameLayout, this.f27900OoooO00);
        this.f27896Oooo0oO.setVisibility(0);
        this.f27896Oooo0oO.bringToFront();
        announceForAccessibility(this.f27895Oooo0o0);
    }

    public final void OooOo0O() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f27904OoooOOo == null || this.f27914Oooooo0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f27881OooOoO0) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f27881OooOoO0) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.f27945ooOO = this.f27922o00000O0;
        } else if (OooOO0o()) {
            if (this.f27929o000OOo != null) {
                OooOo0(z2, z);
            } else {
                this.f27945ooOO = getErrorCurrentTextColors();
            }
        } else if (!this.f27890Oooo00O || (appCompatTextView = this.f27888Oooo0) == null) {
            if (z2) {
                this.f27945ooOO = this.f27937o0O0O00;
            } else if (z) {
                this.f27945ooOO = this.f27944oo0o0Oo;
            } else {
                this.f27945ooOO = this.f27938o0OO00O;
            }
        } else if (this.f27929o000OOo != null) {
            OooOo0(z2, z);
        } else {
            this.f27945ooOO = appCompatTextView.getCurrentTextColor();
        }
        OooOo oooOo = this.f27877OooOo;
        oooOo.OooOO0O();
        CheckableImageButton checkableImageButton = oooOo.f29170OooOo;
        ColorStateList colorStateList = oooOo.f29174OooOoO0;
        TextInputLayout textInputLayout = oooOo.f29171OooOo0O;
        o0OO00OO.OooOoOO(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = oooOo.f29181Oooo000;
        CheckableImageButton checkableImageButton2 = oooOo.f29177OooOoo0;
        o0OO00OO.OooOoOO(textInputLayout, checkableImageButton2, colorStateList2);
        if (oooOo.OooO0O0() instanceof o00000O0.OooOOO0) {
            if (!textInputLayout.OooOO0o() || checkableImageButton2.getDrawable() == null) {
                o0OO00OO.OooO0OO(textInputLayout, checkableImageButton2, oooOo.f29181Oooo000, oooOo.f29182Oooo00O);
            } else {
                Drawable drawableMutate = DrawableCompat.wrap(checkableImageButton2.getDrawable()).mutate();
                DrawableCompat.setTint(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        oo000o oo000oVar = this.f27879OooOo0o;
        o0OO00OO.OooOoOO(oo000oVar.f29234OooOo0O, oo000oVar.f29237OooOoO0, oo000oVar.f29236OooOoO);
        if (this.f27914Oooooo0 == 2) {
            int i = this.f27915OoooooO;
            if (z2 && isEnabled()) {
                this.f27915OoooooO = this.f27941o0OoOo0;
            } else {
                this.f27915OoooooO = this.f27916Ooooooo;
            }
            if (this.f27915OoooooO != i && OooO0Oo() && !this.f27921o00000O) {
                if (OooO0Oo()) {
                    ((o00000O0.OooOO0) this.f27904OoooOOo).OooOo0O(0.0f, 0.0f, 0.0f, 0.0f);
                }
                OooO();
            }
        }
        if (this.f27914Oooooo0 == 1) {
            if (!isEnabled()) {
                this.f27930o00O0O = this.f27919o000000O;
            } else if (z && !z2) {
                this.f27930o00O0O = this.f27917o00000;
            } else if (z2) {
                this.f27930o00O0O = this.f27920o000000o;
            } else {
                this.f27930o00O0O = this.f27918o000000;
            }
        }
        OooO0O0();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f27878OooOo0O;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOOo();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f27927o00000oo = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27927o00000oo = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        OooOOO0 oooOOO0;
        super.draw(canvas);
        boolean z = this.f27902OoooOO0;
        OooOO0 oooOO0 = this.f27923o00000OO;
        if (z) {
            oooOO0.OooO0Oo(canvas);
        }
        if (this.f27909Ooooo0o == null || (oooOOO0 = this.f27908Ooooo00) == null) {
            return;
        }
        oooOOO0.draw(canvas);
        if (this.f27881OooOoO0.isFocused()) {
            Rect bounds = this.f27909Ooooo0o.getBounds();
            Rect bounds2 = this.f27908Ooooo00.getBounds();
            float f = oooOO0.f33015OooO0O0;
            int iCenterX = bounds2.centerX();
            bounds.left = oo0o0O0.OooO0OO(f, iCenterX, bounds2.left);
            bounds.right = oo0o0O0.OooO0OO(f, iCenterX, bounds2.right);
            this.f27909Ooooo0o.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f27926o00000oO
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f27926o00000oO = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            o0ooOO0.OooOO0 r3 = r4.f27923o00000OO
            if (r3 == 0) goto L2f
            r3.f33054OoooO0 = r1
            android.content.res.ColorStateList r1 = r3.f33026OooOOOO
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f33024OooOOO
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.OooO(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f27881OooOoO0
            if (r3 == 0) goto L45
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.OooOOoo(r0, r2)
        L45:
            r4.OooOOOo()
            r4.OooOo0O()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.f27926o00000oO = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27881OooOoO0;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0OO() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public OooOOO0 getBoxBackground() {
        int i = this.f27914Oooooo0;
        if (i == 1 || i == 2) {
            return this.f27904OoooOOo;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f27930o00O0O;
    }

    public int getBoxBackgroundMode() {
        return this.f27914Oooooo0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27913Oooooo;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        RectF rectF = this.f27933o00o0O;
        return zOooO0Oo ? this.f27910OooooO0.f29091OooO0oo.OooO00o(rectF) : this.f27910OooooO0.f29090OooO0oO.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        RectF rectF = this.f27933o00o0O;
        return zOooO0Oo ? this.f27910OooooO0.f29090OooO0oO.OooO00o(rectF) : this.f27910OooooO0.f29091OooO0oo.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        RectF rectF = this.f27933o00o0O;
        return zOooO0Oo ? this.f27910OooooO0.f29089OooO0o0.OooO00o(rectF) : this.f27910OooooO0.f29088OooO0o.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zOooO0Oo = o0000oo.OooO0Oo(this);
        RectF rectF = this.f27933o00o0O;
        return zOooO0Oo ? this.f27910OooooO0.f29088OooO0o.OooO00o(rectF) : this.f27910OooooO0.f29089OooO0o0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f27937o0O0O00;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27929o000OOo;
    }

    public int getBoxStrokeWidth() {
        return this.f27916Ooooooo;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27941o0OoOo0;
    }

    public int getCounterMaxLength() {
        return this.f27889Oooo000;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f27886OooOooo && this.f27890Oooo00O && (appCompatTextView = this.f27888Oooo0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f27901OoooO0O;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f27901OoooO0O;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f27939o0OOO0o;
    }

    @Nullable
    public EditText getEditText() {
        return this.f27881OooOoO0;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f27877OooOo.f29177OooOoo0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f27877OooOo.f29177OooOoo0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f27877OooOo.f29178OooOooO;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f27877OooOo.f29177OooOoo0;
    }

    @Nullable
    public CharSequence getError() {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (o0oooo0.f29222OooOO0O) {
            return o0oooo0.f29221OooOO0;
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f27885OooOooO.f29224OooOOO0;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f27885OooOooO.OooOO0o;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f27877OooOo.f29170OooOo.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (o0oooo0.f29228OooOOo0) {
            return o0oooo0.f29226OooOOOo;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f27885OooOooO.f29227OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f27902OoooOO0) {
            return this.o000oOoO;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f27923o00000OO.OooO0o0();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        OooOO0 oooOO0 = this.f27923o00000OO;
        return oooOO0.OooO0o(oooOO0.f33026OooOOOO);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f27940o0Oo0oo;
    }

    @NonNull
    public o0Oo0oo getLengthCounter() {
        return this.f27891Oooo00o;
    }

    public int getMaxEms() {
        return this.f27882OooOoOO;
    }

    @Px
    public int getMaxWidth() {
        return this.f27883OooOoo;
    }

    public int getMinEms() {
        return this.f27880OooOoO;
    }

    @Px
    public int getMinWidth() {
        return this.f27884OooOoo0;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27877OooOo.f29177OooOoo0.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27877OooOo.f29177OooOoo0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f27894Oooo0o) {
            return this.f27895Oooo0o0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f27887Oooo;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f27897Oooo0oo;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f27879OooOo0o.f29233OooOo;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f27879OooOo0o.f29235OooOo0o.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f27879OooOo0o.f29235OooOo0o;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f27879OooOo0o.f29237OooOoO0.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f27879OooOo0o.f29237OooOoO0.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f27877OooOo.f29180Oooo0;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f27877OooOo.f29184Oooo0O0.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f27877OooOo.f29184Oooo0O0;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f27936o00ooo;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27923o00000OO.OooO0oo(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f27881OooOoO0;
        if (editText != null) {
            Rect rect = this.f27931o00Oo0;
            o0ooOO0.OooOO0O.OooO00o(this, editText, rect);
            OooOOO0 oooOOO0 = this.f27908Ooooo00;
            if (oooOOO0 != null) {
                int i5 = rect.bottom;
                oooOOO0.setBounds(rect.left, i5 - this.f27916Ooooooo, rect.right, i5);
            }
            OooOOO0 oooOOO02 = this.f27909Ooooo0o;
            if (oooOOO02 != null) {
                int i6 = rect.bottom;
                oooOOO02.setBounds(rect.left, i6 - this.f27941o0OoOo0, rect.right, i6);
            }
            if (this.f27902OoooOO0) {
                float textSize = this.f27881OooOoO0.getTextSize();
                OooOO0 oooOO0 = this.f27923o00000OO;
                if (oooOO0.OooOO0o != textSize) {
                    oooOO0.OooOO0o = textSize;
                    oooOO0.OooO(false);
                }
                int gravity = this.f27881OooOoO0.getGravity();
                oooOO0.OooOO0o((gravity & (-113)) | 48);
                if (oooOO0.f33022OooOO0 != gravity) {
                    oooOO0.f33022OooOO0 = gravity;
                    oooOO0.OooO(false);
                }
                if (this.f27881OooOoO0 == null) {
                    throw new IllegalStateException();
                }
                boolean zOooO0Oo = o0000oo.OooO0Oo(this);
                int i7 = rect.bottom;
                Rect rect2 = this.f27932o00Ooo;
                rect2.bottom = i7;
                int i8 = this.f27914Oooooo0;
                if (i8 == 1) {
                    rect2.left = OooO0o(rect.left, zOooO0Oo);
                    rect2.top = rect.top + this.f27913Oooooo;
                    rect2.right = OooO0oO(rect.right, zOooO0Oo);
                } else if (i8 != 2) {
                    rect2.left = OooO0o(rect.left, zOooO0Oo);
                    rect2.top = getPaddingTop();
                    rect2.right = OooO0oO(rect.right, zOooO0Oo);
                } else {
                    rect2.left = this.f27881OooOoO0.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - OooO0OO();
                    rect2.right = rect.right - this.f27881OooOoO0.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = oooOO0.f33021OooO0oo;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != i11 || rect3.bottom != i12) {
                    rect3.set(i9, i10, i11, i12);
                    oooOO0.f33056OoooO0O = true;
                }
                if (this.f27881OooOoO0 == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = oooOO0.f33057OoooOO0;
                textPaint.setTextSize(oooOO0.OooOO0o);
                textPaint.setTypeface(oooOO0.f33035OooOoO);
                textPaint.setLetterSpacing(oooOO0.f33069Oooooo0);
                float f = -textPaint.ascent();
                rect2.left = this.f27881OooOoO0.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f27914Oooooo0 != 1 || this.f27881OooOoO0.getMinLines() > 1) ? rect.top + this.f27881OooOoO0.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f27881OooOoO0.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f27914Oooooo0 != 1 || this.f27881OooOoO0.getMinLines() > 1) ? rect.bottom - this.f27881OooOoO0.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = oooOO0.f33020OooO0oO;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    oooOO0.f33056OoooO0O = true;
                }
                oooOO0.OooO(false);
                if (!OooO0Oo() || this.f27921o00000O) {
                    return;
                }
                OooO();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        EditText editText2 = this.f27881OooOoO0;
        OooOo oooOo = this.f27877OooOo;
        boolean z = false;
        if (editText2 != null && this.f27881OooOoO0.getMeasuredHeight() < (iMax = Math.max(oooOo.getMeasuredHeight(), this.f27879OooOo0o.getMeasuredHeight()))) {
            this.f27881OooOoO0.setMinimumHeight(iMax);
            z = true;
        }
        boolean zOooOOOO = OooOOOO();
        if (z || zOooOOOO) {
            this.f27881OooOoO0.post(new o00000O0.o0ooOOo(this, 1));
        }
        if (this.f27896Oooo0oO != null && (editText = this.f27881OooOoO0) != null) {
            this.f27896Oooo0oO.setGravity(editText.getGravity());
            this.f27896Oooo0oO.setPadding(this.f27881OooOoO0.getCompoundPaddingLeft(), this.f27881OooOoO0.getCompoundPaddingTop(), this.f27881OooOoO0.getCompoundPaddingRight(), this.f27881OooOoO0.getCompoundPaddingBottom());
        }
        oooOo.OooOO0o();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o0OO00O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0OO00O o0oo00o = (o0OO00O) parcelable;
        super.onRestoreInstanceState(o0oo00o.getSuperState());
        setError(o0oo00o.f29209OooOo0O);
        if (o0oo00o.f29210OooOo0o) {
            post(new o00000O0.o0ooOOo(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.f27911OooooOO;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            o000000.OooO0OO oooO0OO = this.f27910OooooO0.f29089OooO0o0;
            RectF rectF = this.f27933o00o0O;
            float fOooO00o = oooO0OO.OooO00o(rectF);
            float fOooO00o2 = this.f27910OooooO0.f29088OooO0o.OooO00o(rectF);
            float fOooO00o3 = this.f27910OooooO0.f29091OooO0oo.OooO00o(rectF);
            float fOooO00o4 = this.f27910OooooO0.f29090OooO0oO.OooO00o(rectF);
            float f = z ? fOooO00o : fOooO00o2;
            if (z) {
                fOooO00o = fOooO00o2;
            }
            float f2 = z ? fOooO00o3 : fOooO00o4;
            if (z) {
                fOooO00o3 = fOooO00o4;
            }
            boolean zOooO0Oo = o0000oo.OooO0Oo(this);
            this.f27911OooooOO = zOooO0Oo;
            float f3 = zOooO0Oo ? fOooO00o : f;
            if (!zOooO0Oo) {
                f = fOooO00o;
            }
            float f4 = zOooO0Oo ? fOooO00o3 : f2;
            if (!zOooO0Oo) {
                f2 = fOooO00o3;
            }
            OooOOO0 oooOOO0 = this.f27904OoooOOo;
            if (oooOOO0 != null && oooOOO0.OooO() == f3) {
                OooOOO0 oooOOO02 = this.f27904OoooOOo;
                if (oooOOO02.f29048OooOo0O.f29028OooO00o.f29088OooO0o.OooO00o(oooOOO02.OooO0oO()) == f) {
                    OooOOO0 oooOOO03 = this.f27904OoooOOo;
                    if (oooOOO03.f29048OooOo0O.f29028OooO00o.f29091OooO0oo.OooO00o(oooOOO03.OooO0oO()) == f4) {
                        OooOOO0 oooOOO04 = this.f27904OoooOOo;
                        if (oooOOO04.f29048OooOo0O.f29028OooO00o.f29090OooO0oO.OooO00o(oooOOO04.OooO0oO()) == f2) {
                            return;
                        }
                    }
                }
            }
            o000000.OooOo oooOoOooO0o = this.f27910OooooO0.OooO0o();
            oooOoOooO0o.f29076OooO0o0 = new o000000.OooO00o(f3);
            oooOoOooO0o.f29075OooO0o = new o000000.OooO00o(f);
            oooOoOooO0o.f29078OooO0oo = new o000000.OooO00o(f4);
            oooOoOooO0o.f29077OooO0oO = new o000000.OooO00o(f2);
            this.f27910OooooO0 = oooOoOooO0o.OooO00o();
            OooO0O0();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o0OO00O o0oo00o = new o0OO00O(super.onSaveInstanceState());
        if (OooOO0o()) {
            o0oo00o.f29209OooOo0O = getError();
        }
        OooOo oooOo = this.f27877OooOo;
        o0oo00o.f29210OooOo0o = oooOo.f29178OooOooO != 0 && oooOo.f29177OooOoo0.f27675OooOo0O;
        return o0oo00o;
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f27930o00O0O != i) {
            this.f27930o00O0O = i;
            this.f27918o000000 = i;
            this.f27920o000000o = i;
            this.f27917o00000 = i;
            OooO0O0();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27918o000000 = defaultColor;
        this.f27930o00O0O = defaultColor;
        this.f27919o000000O = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27920o000000o = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f27917o00000 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0O0();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f27914Oooooo0) {
            return;
        }
        this.f27914Oooooo0 = i;
        if (this.f27881OooOoO0 != null) {
            OooO0oo();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f27913Oooooo = i;
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f27937o0O0O00 != i) {
            this.f27937o0O0O00 = i;
            OooOo0O();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f27938o0OO00O = colorStateList.getDefaultColor();
            this.f27922o00000O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27944oo0o0Oo = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f27937o0O0O00 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f27937o0O0O00 != colorStateList.getDefaultColor()) {
            this.f27937o0O0O00 = colorStateList.getDefaultColor();
        }
        OooOo0O();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f27929o000OOo != colorStateList) {
            this.f27929o000OOo = colorStateList;
            OooOo0O();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f27916Ooooooo = i;
        OooOo0O();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f27941o0OoOo0 = i;
        OooOo0O();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f27886OooOooo != z) {
            o0OoOo0 o0oooo0 = this.f27885OooOooO;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f27888Oooo0 = appCompatTextView;
                appCompatTextView.setId(com.github.superadb.R.id.textinput_counter);
                Typeface typeface = this.f27936o00ooo;
                if (typeface != null) {
                    this.f27888Oooo0.setTypeface(typeface);
                }
                this.f27888Oooo0.setMaxLines(1);
                o0oooo0.OooO00o(this.f27888Oooo0, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f27888Oooo0.getLayoutParams(), getResources().getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_textinput_counter_margin_start));
                OooOOO();
                if (this.f27888Oooo0 != null) {
                    EditText editText = this.f27881OooOoO0;
                    OooOOO0(editText != null ? editText.getText() : null);
                }
            } else {
                o0oooo0.OooO0oO(this.f27888Oooo0, 2);
                this.f27888Oooo0 = null;
            }
            this.f27886OooOooo = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f27889Oooo000 != i) {
            if (i > 0) {
                this.f27889Oooo000 = i;
            } else {
                this.f27889Oooo000 = -1;
            }
            if (!this.f27886OooOooo || this.f27888Oooo0 == null) {
                return;
            }
            EditText editText = this.f27881OooOoO0;
            OooOOO0(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f27892Oooo0O0 != i) {
            this.f27892Oooo0O0 = i;
            OooOOO();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f27898OoooO != colorStateList) {
            this.f27898OoooO = colorStateList;
            OooOOO();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f27893Oooo0OO != i) {
            this.f27893Oooo0OO = i;
            OooOOO();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f27901OoooO0O != colorStateList) {
            this.f27901OoooO0O = colorStateList;
            OooOOO();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f27939o0OOO0o = colorStateList;
        this.f27940o0Oo0oo = colorStateList;
        if (this.f27881OooOoO0 != null) {
            OooOOoo(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOO0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f27877OooOo.f29177OooOoo0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f27877OooOo.f29177OooOoo0.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        OooOo oooOo = this.f27877OooOo;
        CharSequence text = i != 0 ? oooOo.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = oooOo.f29177OooOoo0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        OooOo oooOo = this.f27877OooOo;
        Drawable drawable = i != 0 ? AppCompatResources.getDrawable(oooOo.getContext(), i) : null;
        CheckableImageButton checkableImageButton = oooOo.f29177OooOoo0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oooOo.f29181Oooo000;
            PorterDuff.Mode mode = oooOo.f29182Oooo00O;
            TextInputLayout textInputLayout = oooOo.f29171OooOo0O;
            o0OO00OO.OooO0OO(textInputLayout, checkableImageButton, colorStateList, mode);
            o0OO00OO.OooOoOO(textInputLayout, checkableImageButton, oooOo.f29181Oooo000);
        }
    }

    public void setEndIconMode(int i) {
        this.f27877OooOo.OooO0o(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        OooOo oooOo = this.f27877OooOo;
        View.OnLongClickListener onLongClickListener = oooOo.f29183Oooo00o;
        CheckableImageButton checkableImageButton = oooOo.f29177OooOoo0;
        checkableImageButton.setOnClickListener(onClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29183Oooo00o = onLongClickListener;
        CheckableImageButton checkableImageButton = oooOo.f29177OooOoo0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        OooOo oooOo = this.f27877OooOo;
        if (oooOo.f29181Oooo000 != colorStateList) {
            oooOo.f29181Oooo000 = colorStateList;
            o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29177OooOoo0, colorStateList, oooOo.f29182Oooo00O);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        OooOo oooOo = this.f27877OooOo;
        if (oooOo.f29182Oooo00O != mode) {
            oooOo.f29182Oooo00O = mode;
            o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29177OooOoo0, oooOo.f29181Oooo000, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f27877OooOo.OooO0oO(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (!o0oooo0.f29222OooOO0O) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            o0oooo0.OooO0o();
            return;
        }
        o0oooo0.OooO0OO();
        o0oooo0.f29221OooOO0 = charSequence;
        o0oooo0.OooOO0o.setText(charSequence);
        int i = o0oooo0.f29220OooO0oo;
        if (i != 1) {
            o0oooo0.f29212OooO = 1;
        }
        o0oooo0.OooO(i, o0oooo0.f29212OooO, o0oooo0.OooO0oo(o0oooo0.OooOO0o, charSequence));
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        o0oooo0.f29224OooOOO0 = charSequence;
        AppCompatTextView appCompatTextView = o0oooo0.OooOO0o;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (o0oooo0.f29222OooOO0O == z) {
            return;
        }
        o0oooo0.OooO0OO();
        TextInputLayout textInputLayout = o0oooo0.f29214OooO0O0;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o0oooo0.f29213OooO00o);
            o0oooo0.OooOO0o = appCompatTextView;
            appCompatTextView.setId(com.github.superadb.R.id.textinput_error);
            o0oooo0.OooOO0o.setTextAlignment(5);
            Typeface typeface = o0oooo0.OooOo0;
            if (typeface != null) {
                o0oooo0.OooOO0o.setTypeface(typeface);
            }
            int i = o0oooo0.f29223OooOOO;
            o0oooo0.f29223OooOOO = i;
            AppCompatTextView appCompatTextView2 = o0oooo0.OooOO0o;
            if (appCompatTextView2 != null) {
                textInputLayout.OooOO0O(appCompatTextView2, i);
            }
            ColorStateList colorStateList = o0oooo0.f29225OooOOOO;
            o0oooo0.f29225OooOOOO = colorStateList;
            AppCompatTextView appCompatTextView3 = o0oooo0.OooOO0o;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = o0oooo0.f29224OooOOO0;
            o0oooo0.f29224OooOOO0 = charSequence;
            AppCompatTextView appCompatTextView4 = o0oooo0.OooOO0o;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            o0oooo0.OooOO0o.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(o0oooo0.OooOO0o, 1);
            o0oooo0.OooO00o(o0oooo0.OooOO0o, 0);
        } else {
            o0oooo0.OooO0o();
            o0oooo0.OooO0oO(o0oooo0.OooOO0o, 0);
            o0oooo0.OooOO0o = null;
            textInputLayout.OooOOOo();
            textInputLayout.OooOo0O();
        }
        o0oooo0.f29222OooOO0O = z;
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.OooO0oo(i != 0 ? AppCompatResources.getDrawable(oooOo.getContext(), i) : null);
        o0OO00OO.OooOoOO(oooOo.f29171OooOo0O, oooOo.f29170OooOo, oooOo.f29174OooOoO0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        OooOo oooOo = this.f27877OooOo;
        CheckableImageButton checkableImageButton = oooOo.f29170OooOo;
        View.OnLongClickListener onLongClickListener = oooOo.f29175OooOoOO;
        checkableImageButton.setOnClickListener(onClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29175OooOoOO = onLongClickListener;
        CheckableImageButton checkableImageButton = oooOo.f29170OooOo;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        OooOo oooOo = this.f27877OooOo;
        if (oooOo.f29174OooOoO0 != colorStateList) {
            oooOo.f29174OooOoO0 = colorStateList;
            o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29170OooOo, colorStateList, oooOo.f29173OooOoO);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        OooOo oooOo = this.f27877OooOo;
        if (oooOo.f29173OooOoO != mode) {
            oooOo.f29173OooOoO = mode;
            o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29170OooOo, oooOo.f29174OooOoO0, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        o0oooo0.f29223OooOOO = i;
        AppCompatTextView appCompatTextView = o0oooo0.OooOO0o;
        if (appCompatTextView != null) {
            o0oooo0.f29214OooO0O0.OooOO0O(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        o0oooo0.f29225OooOOOO = colorStateList;
        AppCompatTextView appCompatTextView = o0oooo0.OooOO0o;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f27924o00000Oo != z) {
            this.f27924o00000Oo = z;
            OooOOoo(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (zIsEmpty) {
            if (o0oooo0.f29228OooOOo0) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!o0oooo0.f29228OooOOo0) {
            setHelperTextEnabled(true);
        }
        o0oooo0.OooO0OO();
        o0oooo0.f29226OooOOOo = charSequence;
        o0oooo0.f29227OooOOo.setText(charSequence);
        int i = o0oooo0.f29220OooO0oo;
        if (i != 2) {
            o0oooo0.f29212OooO = 2;
        }
        o0oooo0.OooO(i, o0oooo0.f29212OooO, o0oooo0.OooO0oo(o0oooo0.f29227OooOOo, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        o0oooo0.f29230OooOo00 = colorStateList;
        AppCompatTextView appCompatTextView = o0oooo0.f29227OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        if (o0oooo0.f29228OooOOo0 == z) {
            return;
        }
        o0oooo0.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(o0oooo0.f29213OooO00o);
            o0oooo0.f29227OooOOo = appCompatTextView;
            appCompatTextView.setId(com.github.superadb.R.id.textinput_helper_text);
            o0oooo0.f29227OooOOo.setTextAlignment(5);
            Typeface typeface = o0oooo0.OooOo0;
            if (typeface != null) {
                o0oooo0.f29227OooOOo.setTypeface(typeface);
            }
            o0oooo0.f29227OooOOo.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(o0oooo0.f29227OooOOo, 1);
            int i = o0oooo0.f29229OooOOoo;
            o0oooo0.f29229OooOOoo = i;
            AppCompatTextView appCompatTextView2 = o0oooo0.f29227OooOOo;
            if (appCompatTextView2 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView2, i);
            }
            ColorStateList colorStateList = o0oooo0.f29230OooOo00;
            o0oooo0.f29230OooOo00 = colorStateList;
            AppCompatTextView appCompatTextView3 = o0oooo0.f29227OooOOo;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            o0oooo0.OooO00o(o0oooo0.f29227OooOOo, 1);
            o0oooo0.f29227OooOOo.setAccessibilityDelegate(new o000oOoO(o0oooo0));
        } else {
            o0oooo0.OooO0OO();
            int i2 = o0oooo0.f29220OooO0oo;
            if (i2 == 2) {
                o0oooo0.f29212OooO = 0;
            }
            o0oooo0.OooO(i2, o0oooo0.f29212OooO, o0oooo0.OooO0oo(o0oooo0.f29227OooOOo, ""));
            o0oooo0.OooO0oO(o0oooo0.f29227OooOOo, 1);
            o0oooo0.f29227OooOOo = null;
            TextInputLayout textInputLayout = o0oooo0.f29214OooO0O0;
            textInputLayout.OooOOOo();
            textInputLayout.OooOo0O();
        }
        o0oooo0.f29228OooOOo0 = z;
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        o0OoOo0 o0oooo0 = this.f27885OooOooO;
        o0oooo0.f29229OooOOoo = i;
        AppCompatTextView appCompatTextView = o0oooo0.f29227OooOOo;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f27902OoooOO0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f27925o00000o0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f27902OoooOO0) {
            this.f27902OoooOO0 = z;
            if (z) {
                CharSequence hint = this.f27881OooOoO0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.o000oOoO)) {
                        setHint(hint);
                    }
                    this.f27881OooOoO0.setHint((CharSequence) null);
                }
                this.f27903OoooOOO = true;
            } else {
                this.f27903OoooOOO = false;
                if (!TextUtils.isEmpty(this.o000oOoO) && TextUtils.isEmpty(this.f27881OooOoO0.getHint())) {
                    this.f27881OooOoO0.setHint(this.o000oOoO);
                }
                setHintInternal(null);
            }
            if (this.f27881OooOoO0 != null) {
                OooOOo();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        OooOO0 oooOO0 = this.f27923o00000OO;
        oooOO0.OooOO0(i);
        this.f27940o0Oo0oo = oooOO0.f33026OooOOOO;
        if (this.f27881OooOoO0 != null) {
            OooOOoo(false, false);
            OooOOo();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f27940o0Oo0oo != colorStateList) {
            if (this.f27939o0OOO0o == null) {
                this.f27923o00000OO.OooOO0O(colorStateList);
            }
            this.f27940o0Oo0oo = colorStateList;
            if (this.f27881OooOoO0 != null) {
                OooOOoo(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull o0Oo0oo o0oo0oo) {
        this.f27891Oooo00o = o0oo0oo;
    }

    public void setMaxEms(int i) {
        this.f27882OooOoOO = i;
        EditText editText = this.f27881OooOoO0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@Px int i) {
        this.f27883OooOoo = i;
        EditText editText = this.f27881OooOoO0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f27880OooOoO = i;
        EditText editText = this.f27881OooOoO0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@Px int i) {
        this.f27884OooOoo0 = i;
        EditText editText = this.f27881OooOoO0;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29177OooOoo0.setContentDescription(i != 0 ? oooOo.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29177OooOoo0.setImageDrawable(i != 0 ? AppCompatResources.getDrawable(oooOo.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        OooOo oooOo = this.f27877OooOo;
        if (z && oooOo.f29178OooOooO != 1) {
            oooOo.OooO0o(1);
        } else if (z) {
            oooOo.getClass();
        } else {
            oooOo.OooO0o(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29181Oooo000 = colorStateList;
        o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29177OooOoo0, colorStateList, oooOo.f29182Oooo00O);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.f29182Oooo00O = mode;
        o0OO00OO.OooO0OO(oooOo.f29171OooOo0O, oooOo.f29177OooOoo0, oooOo.f29181Oooo000, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f27896Oooo0oO == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f27896Oooo0oO = appCompatTextView;
            appCompatTextView.setId(com.github.superadb.R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.f27896Oooo0oO, 2);
            Fade fade = new Fade();
            fade.setDuration(87L);
            LinearInterpolator linearInterpolator = oo0o0O0.f15015OooO00o;
            fade.setInterpolator(linearInterpolator);
            this.f27900OoooO00 = fade;
            fade.setStartDelay(67L);
            Fade fade2 = new Fade();
            fade2.setDuration(87L);
            fade2.setInterpolator(linearInterpolator);
            this.f27899OoooO0 = fade2;
            setPlaceholderTextAppearance(this.f27887Oooo);
            setPlaceholderTextColor(this.f27897Oooo0oo);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27894Oooo0o) {
                setPlaceholderTextEnabled(true);
            }
            this.f27895Oooo0o0 = charSequence;
        }
        EditText editText = this.f27881OooOoO0;
        OooOo00(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f27887Oooo = i;
        AppCompatTextView appCompatTextView = this.f27896Oooo0oO;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f27897Oooo0oo != colorStateList) {
            this.f27897Oooo0oo = colorStateList;
            AppCompatTextView appCompatTextView = this.f27896Oooo0oO;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        oo000o oo000oVar = this.f27879OooOo0o;
        oo000oVar.getClass();
        oo000oVar.f29233OooOo = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oo000oVar.f29235OooOo0o.setText(charSequence);
        oo000oVar.OooO0Oo();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f27879OooOo0o.f29235OooOo0o, i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f27879OooOo0o.f29235OooOo0o.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f27879OooOo0o.f29237OooOoO0.setCheckable(z);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27879OooOo0o.f29237OooOoO0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        oo000o oo000oVar = this.f27879OooOo0o;
        View.OnLongClickListener onLongClickListener = oo000oVar.f29240OooOoo0;
        CheckableImageButton checkableImageButton = oo000oVar.f29237OooOoO0;
        checkableImageButton.setOnClickListener(onClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        oo000o oo000oVar = this.f27879OooOo0o;
        oo000oVar.f29240OooOoo0 = onLongClickListener;
        CheckableImageButton checkableImageButton = oo000oVar.f29237OooOoO0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        oo000o oo000oVar = this.f27879OooOo0o;
        if (oo000oVar.f29236OooOoO != colorStateList) {
            oo000oVar.f29236OooOoO = colorStateList;
            o0OO00OO.OooO0OO(oo000oVar.f29234OooOo0O, oo000oVar.f29237OooOoO0, colorStateList, oo000oVar.f29238OooOoOO);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        oo000o oo000oVar = this.f27879OooOo0o;
        if (oo000oVar.f29238OooOoOO != mode) {
            oo000oVar.f29238OooOoOO = mode;
            o0OO00OO.OooO0OO(oo000oVar.f29234OooOo0O, oo000oVar.f29237OooOoO0, oo000oVar.f29236OooOoO, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f27879OooOo0o.OooO0O0(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        OooOo oooOo = this.f27877OooOo;
        oooOo.getClass();
        oooOo.f29180Oooo0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oooOo.f29184Oooo0O0.setText(charSequence);
        oooOo.OooOOO0();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.f27877OooOo.f29184Oooo0O0, i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f27877OooOo.f29184Oooo0O0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable o0OOO0o o0ooo0o) {
        EditText editText = this.f27881OooOoO0;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, o0ooo0o);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f27936o00ooo) {
            this.f27936o00ooo = typeface;
            OooOO0 oooOO0 = this.f27923o00000OO;
            boolean zOooOOO0 = oooOO0.OooOOO0(typeface);
            boolean zOooOOOO = oooOO0.OooOOOO(typeface);
            if (zOooOOO0 || zOooOOOO) {
                oooOO0.OooO(false);
            }
            o0OoOo0 o0oooo0 = this.f27885OooOooO;
            if (typeface != o0oooo0.OooOo0) {
                o0oooo0.OooOo0 = typeface;
                AppCompatTextView appCompatTextView = o0oooo0.OooOO0o;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = o0oooo0.f29227OooOOo;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f27888Oooo0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, com.github.superadb.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.f27880OooOoO = -1;
        this.f27882OooOoOO = -1;
        this.f27884OooOoo0 = -1;
        this.f27883OooOoo = -1;
        this.f27885OooOooO = new o0OoOo0(this);
        this.f27891Oooo00o = new o0ooOOo(27);
        this.f27931o00Oo0 = new Rect();
        this.f27932o00Ooo = new Rect();
        this.f27933o00o0O = new RectF();
        this.f27934o00oO0O = new LinkedHashSet();
        OooOO0 oooOO0 = new OooOO0(this);
        this.f27923o00000OO = oooOO0;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27878OooOo0O = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = oo0o0O0.f15015OooO00o;
        oooOO0.f33058OoooOOO = linearInterpolator;
        oooOO0.OooO(false);
        oooOO0.o000oOoO = linearInterpolator;
        oooOO0.OooO(false);
        oooOO0.OooOO0o(8388659);
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(context2, attributeSet, Ooooo00.OooOo.f15001Ooooo0o, i, com.github.superadb.R.style.Widget_Design_TextInputLayout, 22, 20, 35, 40, 44);
        oo000o oo000oVar = new oo000o(this, tintTypedArrayOooO0o0);
        this.f27879OooOo0o = oo000oVar;
        this.f27902OoooOO0 = tintTypedArrayOooO0o0.getBoolean(43, true);
        setHint(tintTypedArrayOooO0o0.getText(4));
        this.f27925o00000o0 = tintTypedArrayOooO0o0.getBoolean(42, true);
        this.f27924o00000Oo = tintTypedArrayOooO0o0.getBoolean(37, true);
        if (tintTypedArrayOooO0o0.hasValue(6)) {
            setMinEms(tintTypedArrayOooO0o0.getInt(6, -1));
        } else if (tintTypedArrayOooO0o0.hasValue(3)) {
            setMinWidth(tintTypedArrayOooO0o0.getDimensionPixelSize(3, -1));
        }
        if (tintTypedArrayOooO0o0.hasValue(5)) {
            setMaxEms(tintTypedArrayOooO0o0.getInt(5, -1));
        } else if (tintTypedArrayOooO0o0.hasValue(2)) {
            setMaxWidth(tintTypedArrayOooO0o0.getDimensionPixelSize(2, -1));
        }
        this.f27910OooooO0 = Oooo000.OooO0O0(context2, attributeSet, i, com.github.superadb.R.style.Widget_Design_TextInputLayout).OooO00o();
        this.f27912OooooOo = context2.getResources().getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f27913Oooooo = tintTypedArrayOooO0o0.getDimensionPixelOffset(9, 0);
        this.f27916Ooooooo = tintTypedArrayOooO0o0.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.github.superadb.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f27941o0OoOo0 = tintTypedArrayOooO0o0.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.github.superadb.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f27915OoooooO = this.f27916Ooooooo;
        float dimension = tintTypedArrayOooO0o0.getDimension(13, -1.0f);
        float dimension2 = tintTypedArrayOooO0o0.getDimension(12, -1.0f);
        float dimension3 = tintTypedArrayOooO0o0.getDimension(10, -1.0f);
        float dimension4 = tintTypedArrayOooO0o0.getDimension(11, -1.0f);
        o000000.OooOo oooOoOooO0o = this.f27910OooooO0.OooO0o();
        if (dimension >= 0.0f) {
            oooOoOooO0o.f29076OooO0o0 = new o000000.OooO00o(dimension);
        }
        if (dimension2 >= 0.0f) {
            oooOoOooO0o.f29075OooO0o = new o000000.OooO00o(dimension2);
        }
        if (dimension3 >= 0.0f) {
            oooOoOooO0o.f29077OooO0oO = new o000000.OooO00o(dimension3);
        }
        if (dimension4 >= 0.0f) {
            oooOoOooO0o.f29078OooO0oo = new o000000.OooO00o(dimension4);
        }
        this.f27910OooooO0 = oooOoOooO0o.OooO00o();
        ColorStateList colorStateListOooO0O0 = OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 7);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.f27918o000000 = defaultColor;
            this.f27930o00O0O = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.f27919o000000O = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.f27920o000000o = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f27917o00000 = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f27920o000000o = this.f27918o000000;
                ColorStateList colorStateList = AppCompatResources.getColorStateList(context2, com.github.superadb.R.color.mtrl_filled_background_color);
                this.f27919o000000O = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f27917o00000 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f27930o00O0O = 0;
            this.f27918o000000 = 0;
            this.f27919o000000O = 0;
            this.f27920o000000o = 0;
            this.f27917o00000 = 0;
        }
        if (tintTypedArrayOooO0o0.hasValue(1)) {
            ColorStateList colorStateList2 = tintTypedArrayOooO0o0.getColorStateList(1);
            this.f27940o0Oo0oo = colorStateList2;
            this.f27939o0OOO0o = colorStateList2;
        }
        ColorStateList colorStateListOooO0O02 = OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 14);
        this.f27937o0O0O00 = tintTypedArrayOooO0o0.getColor(14, 0);
        this.f27938o0OO00O = ContextCompat.getColor(context2, com.github.superadb.R.color.mtrl_textinput_default_box_stroke_color);
        this.f27922o00000O0 = ContextCompat.getColor(context2, com.github.superadb.R.color.mtrl_textinput_disabled_color);
        this.f27944oo0o0Oo = ContextCompat.getColor(context2, com.github.superadb.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O02 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O02);
        }
        if (tintTypedArrayOooO0o0.hasValue(15)) {
            setBoxStrokeErrorColor(OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 15));
        }
        if (tintTypedArrayOooO0o0.getResourceId(44, -1) != -1) {
            setHintTextAppearance(tintTypedArrayOooO0o0.getResourceId(44, 0));
        }
        int resourceId = tintTypedArrayOooO0o0.getResourceId(35, 0);
        CharSequence text = tintTypedArrayOooO0o0.getText(30);
        boolean z = tintTypedArrayOooO0o0.getBoolean(31, false);
        int resourceId2 = tintTypedArrayOooO0o0.getResourceId(40, 0);
        boolean z2 = tintTypedArrayOooO0o0.getBoolean(39, false);
        CharSequence text2 = tintTypedArrayOooO0o0.getText(38);
        int resourceId3 = tintTypedArrayOooO0o0.getResourceId(52, 0);
        CharSequence text3 = tintTypedArrayOooO0o0.getText(51);
        boolean z3 = tintTypedArrayOooO0o0.getBoolean(18, false);
        setCounterMaxLength(tintTypedArrayOooO0o0.getInt(19, -1));
        this.f27893Oooo0OO = tintTypedArrayOooO0o0.getResourceId(22, 0);
        this.f27892Oooo0O0 = tintTypedArrayOooO0o0.getResourceId(20, 0);
        setBoxBackgroundMode(tintTypedArrayOooO0o0.getInt(8, 0));
        setErrorContentDescription(text);
        setCounterOverflowTextAppearance(this.f27892Oooo0O0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f27893Oooo0OO);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (tintTypedArrayOooO0o0.hasValue(36)) {
            setErrorTextColor(tintTypedArrayOooO0o0.getColorStateList(36));
        }
        if (tintTypedArrayOooO0o0.hasValue(41)) {
            setHelperTextColor(tintTypedArrayOooO0o0.getColorStateList(41));
        }
        if (tintTypedArrayOooO0o0.hasValue(45)) {
            setHintTextColor(tintTypedArrayOooO0o0.getColorStateList(45));
        }
        if (tintTypedArrayOooO0o0.hasValue(23)) {
            setCounterTextColor(tintTypedArrayOooO0o0.getColorStateList(23));
        }
        if (tintTypedArrayOooO0o0.hasValue(21)) {
            setCounterOverflowTextColor(tintTypedArrayOooO0o0.getColorStateList(21));
        }
        if (tintTypedArrayOooO0o0.hasValue(53)) {
            setPlaceholderTextColor(tintTypedArrayOooO0o0.getColorStateList(53));
        }
        OooOo oooOo = new OooOo(this, tintTypedArrayOooO0o0);
        this.f27877OooOo = oooOo;
        boolean z4 = tintTypedArrayOooO0o0.getBoolean(0, true);
        tintTypedArrayOooO0o0.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(oo000oVar);
        frameLayout.addView(oooOo);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f27879OooOo0o.OooO00o(drawable);
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f27877OooOo.f29177OooOoo0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f27877OooOo.f29177OooOoo0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f27877OooOo.OooO0oo(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27877OooOo.f29177OooOoo0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        OooOo oooOo = this.f27877OooOo;
        CheckableImageButton checkableImageButton = oooOo.f29177OooOoo0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oooOo.f29181Oooo000;
            PorterDuff.Mode mode = oooOo.f29182Oooo00O;
            TextInputLayout textInputLayout = oooOo.f29171OooOo0O;
            o0OO00OO.OooO0OO(textInputLayout, checkableImageButton, colorStateList, mode);
            o0OO00OO.OooOoOO(textInputLayout, checkableImageButton, oooOo.f29181Oooo000);
        }
    }
}
