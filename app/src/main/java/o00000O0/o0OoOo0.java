package o00000O0;

import Ooooo0o.o00O0OO;
import Ooooo0o.oo0o0O0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0OoOo0 {

    /* renamed from: OooO, reason: collision with root package name */
    public int f29212OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f29213OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final TextInputLayout f29214OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public LinearLayout f29215OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f29216OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public AnimatorSet f29217OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public FrameLayout f29218OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final float f29219OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f29220OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f29221OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f29222OooOO0O;
    public AppCompatTextView OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f29223OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public CharSequence f29224OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public ColorStateList f29225OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public CharSequence f29226OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public AppCompatTextView f29227OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public boolean f29228OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public int f29229OooOOoo;
    public Typeface OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public ColorStateList f29230OooOo00;

    public o0OoOo0(TextInputLayout textInputLayout) {
        this.f29213OooO00o = textInputLayout.getContext();
        this.f29214OooO0O0 = textInputLayout;
        this.f29219OooO0oO = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView textViewOooO0o0;
        TextView textViewOooO0o02;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f29217OooO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.f29228OooOOo0, this.f29227OooOOo, 2, i, i2);
            OooO0Oo(arrayList, this.f29222OooOO0O, this.OooOO0o, 1, i, i2);
            o00O0OO.OooO00o(animatorSet, arrayList);
            animatorSet.addListener(new Oooo0(this, i2, OooO0o0(i), i, OooO0o0(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewOooO0o02 = OooO0o0(i2)) != null) {
                textViewOooO0o02.setVisibility(0);
                textViewOooO0o02.setAlpha(1.0f);
            }
            if (i != 0 && (textViewOooO0o0 = OooO0o0(i)) != null) {
                textViewOooO0o0.setVisibility(4);
                if (i == 1) {
                    textViewOooO0o0.setText((CharSequence) null);
                }
            }
            this.f29220OooO0oo = i2;
        }
        TextInputLayout textInputLayout = this.f29214OooO0O0;
        textInputLayout.OooOOOo();
        textInputLayout.OooOOoo(z, false);
        textInputLayout.OooOo0O();
    }

    public final void OooO00o(AppCompatTextView appCompatTextView, int i) {
        if (this.f29215OooO0OO == null && this.f29218OooO0o0 == null) {
            Context context = this.f29213OooO00o;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f29215OooO0OO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f29215OooO0OO;
            TextInputLayout textInputLayout = this.f29214OooO0O0;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f29218OooO0o0 = new FrameLayout(context);
            this.f29215OooO0OO.addView(this.f29218OooO0o0, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.f29218OooO0o0.setVisibility(0);
            this.f29218OooO0o0.addView(appCompatTextView);
        } else {
            this.f29215OooO0OO.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f29215OooO0OO.setVisibility(0);
        this.f29216OooO0Oo++;
    }

    public final void OooO0O0() {
        if (this.f29215OooO0OO != null) {
            TextInputLayout textInputLayout = this.f29214OooO0O0;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f29213OooO00o;
                boolean zOooO0o0 = oo0o0Oo.OooO0OO.OooO0o0(context);
                LinearLayout linearLayout = this.f29215OooO0OO;
                int paddingStart = ViewCompat.getPaddingStart(editText);
                if (zOooO0o0) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zOooO0o0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = ViewCompat.getPaddingEnd(editText);
                if (zOooO0o0) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                ViewCompat.setPaddingRelative(linearLayout, paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void OooO0OO() {
        AnimatorSet animatorSet = this.f29217OooO0o;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void OooO0Oo(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(oo0o0O0.f15015OooO00o);
            arrayList.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f29219OooO0oO, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(oo0o0O0.f15018OooO0Oo);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    public final void OooO0o() {
        this.f29221OooOO0 = null;
        OooO0OO();
        if (this.f29220OooO0oo == 1) {
            if (!this.f29228OooOOo0 || TextUtils.isEmpty(this.f29226OooOOOo)) {
                this.f29212OooO = 0;
            } else {
                this.f29212OooO = 2;
            }
        }
        OooO(this.f29220OooO0oo, this.f29212OooO, OooO0oo(this.OooOO0o, ""));
    }

    public final TextView OooO0o0(int i) {
        if (i == 1) {
            return this.OooOO0o;
        }
        if (i != 2) {
            return null;
        }
        return this.f29227OooOOo;
    }

    public final void OooO0oO(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f29215OooO0OO;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f29218OooO0o0) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.f29216OooO0Oo - 1;
        this.f29216OooO0Oo = i2;
        LinearLayout linearLayout2 = this.f29215OooO0OO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooO0oo(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f29214OooO0O0;
        if (ViewCompat.isLaidOut(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f29212OooO == this.f29220OooO0oo && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
