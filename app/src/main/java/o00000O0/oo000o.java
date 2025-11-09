package o00000O0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.github.superadb.R;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class oo000o extends LinearLayout {

    /* renamed from: OooOo, reason: collision with root package name */
    public CharSequence f29233OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final TextInputLayout f29234OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AppCompatTextView f29235OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public ColorStateList f29236OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final CheckableImageButton f29237OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public PorterDuff.Mode f29238OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f29239OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public View.OnLongClickListener f29240OooOoo0;

    public oo000o(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f29234OooOo0O = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f29237OooOoO0 = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f29235OooOo0o = appCompatTextView;
        if (oo0o0Oo.OooO0OO.OooO0o0(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f29240OooOoo0;
        checkableImageButton.setOnClickListener(null);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
        this.f29240OooOoo0 = null;
        checkableImageButton.setOnLongClickListener(null);
        o0OO00OO.OooOooO(checkableImageButton, null);
        if (tintTypedArray.hasValue(62)) {
            this.f29236OooOoO = oo0o0Oo.OooO0OO.OooO0O0(getContext(), tintTypedArray, 62);
        }
        if (tintTypedArray.hasValue(63)) {
            this.f29238OooOoOO = o0000oo.OooO0o0(tintTypedArray.getInt(63, -1), null);
        }
        if (tintTypedArray.hasValue(61)) {
            OooO00o(tintTypedArray.getDrawable(61));
            if (tintTypedArray.hasValue(60) && checkableImageButton.getContentDescription() != (text = tintTypedArray.getText(60))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(tintTypedArray.getBoolean(59, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(55, 0));
        if (tintTypedArray.hasValue(56)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(56));
        }
        CharSequence text2 = tintTypedArray.getText(54);
        this.f29233OooOo = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        OooO0Oo();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void OooO00o(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f29237OooOoO0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f29236OooOoO;
            PorterDuff.Mode mode = this.f29238OooOoOO;
            TextInputLayout textInputLayout = this.f29234OooOo0O;
            o0OO00OO.OooO0OO(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO0O0(true);
            o0OO00OO.OooOoOO(textInputLayout, checkableImageButton, this.f29236OooOoO);
            return;
        }
        OooO0O0(false);
        View.OnLongClickListener onLongClickListener = this.f29240OooOoo0;
        checkableImageButton.setOnClickListener(null);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
        this.f29240OooOoo0 = null;
        checkableImageButton.setOnLongClickListener(null);
        o0OO00OO.OooOooO(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void OooO0O0(boolean z) {
        CheckableImageButton checkableImageButton = this.f29237OooOoO0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            OooO0OO();
            OooO0Oo();
        }
    }

    public final void OooO0OO() {
        EditText editText = this.f29234OooOo0O.f27881OooOoO0;
        if (editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f29235OooOo0o, this.f29237OooOoO0.getVisibility() == 0 ? 0 : ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void OooO0Oo() {
        int i = (this.f29233OooOo == null || this.f29239OooOoo) ? 8 : 0;
        setVisibility((this.f29237OooOoO0.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f29235OooOo0o.setVisibility(i);
        this.f29234OooOo0O.OooOOOO();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0OO();
    }
}
