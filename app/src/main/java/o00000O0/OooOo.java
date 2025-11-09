package o00000O0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.github.superadb.R;
import com.google.android.gms.internal.ads.o0O0OOO0;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class OooOo extends LinearLayout {

    /* renamed from: OooOo */
    public final CheckableImageButton f29170OooOo;

    /* renamed from: OooOo0O */
    public final TextInputLayout f29171OooOo0O;

    /* renamed from: OooOo0o */
    public final FrameLayout f29172OooOo0o;

    /* renamed from: OooOoO */
    public PorterDuff.Mode f29173OooOoO;

    /* renamed from: OooOoO0 */
    public ColorStateList f29174OooOoO0;

    /* renamed from: OooOoOO */
    public View.OnLongClickListener f29175OooOoOO;

    /* renamed from: OooOoo */
    public final o0O0OOO0 f29176OooOoo;

    /* renamed from: OooOoo0 */
    public final CheckableImageButton f29177OooOoo0;

    /* renamed from: OooOooO */
    public int f29178OooOooO;

    /* renamed from: OooOooo */
    public final LinkedHashSet f29179OooOooo;

    /* renamed from: Oooo0 */
    public CharSequence f29180Oooo0;

    /* renamed from: Oooo000 */
    public ColorStateList f29181Oooo000;

    /* renamed from: Oooo00O */
    public PorterDuff.Mode f29182Oooo00O;

    /* renamed from: Oooo00o */
    public View.OnLongClickListener f29183Oooo00o;

    /* renamed from: Oooo0O0 */
    public final AppCompatTextView f29184Oooo0O0;

    /* renamed from: Oooo0OO */
    public boolean f29185Oooo0OO;

    /* renamed from: Oooo0o */
    public final AccessibilityManager f29186Oooo0o;

    /* renamed from: Oooo0o0 */
    public EditText f29187Oooo0o0;

    /* renamed from: Oooo0oO */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener f29188Oooo0oO;

    /* renamed from: Oooo0oo */
    public final OooOOO f29189Oooo0oo;

    public OooOo(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f29178OooOooO = 0;
        this.f29179OooOooo = new LinkedHashSet();
        this.f29189Oooo0oo = new OooOOO(this);
        OooOOOO oooOOOO = new OooOOOO(this);
        this.f29186Oooo0o = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f29171OooOo0O = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f29172OooOo0o = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonOooO00o = OooO00o(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f29170OooOo = checkableImageButtonOooO00o;
        CheckableImageButton checkableImageButtonOooO00o2 = OooO00o(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f29177OooOoo0 = checkableImageButtonOooO00o2;
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0();
        o0o0ooo0.f21963OooO0OO = new SparseArray();
        o0o0ooo0.f21964OooO0Oo = this;
        o0o0ooo0.f21961OooO00o = tintTypedArray.getResourceId(26, 0);
        o0o0ooo0.f21962OooO0O0 = tintTypedArray.getResourceId(47, 0);
        this.f29176OooOoo = o0o0ooo0;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f29184Oooo0O0 = appCompatTextView;
        if (tintTypedArray.hasValue(33)) {
            this.f29174OooOoO0 = oo0o0Oo.OooO0OO.OooO0O0(getContext(), tintTypedArray, 33);
        }
        if (tintTypedArray.hasValue(34)) {
            this.f29173OooOoO = o0000oo.OooO0o0(tintTypedArray.getInt(34, -1), null);
        }
        if (tintTypedArray.hasValue(32)) {
            OooO0oo(tintTypedArray.getDrawable(32));
        }
        checkableImageButtonOooO00o.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(checkableImageButtonOooO00o, 2);
        checkableImageButtonOooO00o.setClickable(false);
        checkableImageButtonOooO00o.setPressable(false);
        checkableImageButtonOooO00o.setFocusable(false);
        if (!tintTypedArray.hasValue(48)) {
            if (tintTypedArray.hasValue(28)) {
                this.f29181Oooo000 = oo0o0Oo.OooO0OO.OooO0O0(getContext(), tintTypedArray, 28);
            }
            if (tintTypedArray.hasValue(29)) {
                this.f29182Oooo00O = o0000oo.OooO0o0(tintTypedArray.getInt(29, -1), null);
            }
        }
        if (tintTypedArray.hasValue(27)) {
            OooO0o(tintTypedArray.getInt(27, 0));
            if (tintTypedArray.hasValue(25) && checkableImageButtonOooO00o2.getContentDescription() != (text = tintTypedArray.getText(25))) {
                checkableImageButtonOooO00o2.setContentDescription(text);
            }
            checkableImageButtonOooO00o2.setCheckable(tintTypedArray.getBoolean(24, true));
        } else if (tintTypedArray.hasValue(48)) {
            if (tintTypedArray.hasValue(49)) {
                this.f29181Oooo000 = oo0o0Oo.OooO0OO.OooO0O0(getContext(), tintTypedArray, 49);
            }
            if (tintTypedArray.hasValue(50)) {
                this.f29182Oooo00O = o0000oo.OooO0o0(tintTypedArray.getInt(50, -1), null);
            }
            OooO0o(tintTypedArray.getBoolean(48, false) ? 1 : 0);
            CharSequence text2 = tintTypedArray.getText(46);
            if (checkableImageButtonOooO00o2.getContentDescription() != text2) {
                checkableImageButtonOooO00o2.setContentDescription(text2);
            }
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(65, 0));
        if (tintTypedArray.hasValue(66)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(66));
        }
        CharSequence text3 = tintTypedArray.getText(64);
        this.f29180Oooo0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        OooOOO0();
        frameLayout.addView(checkableImageButtonOooO00o2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonOooO00o);
        textInputLayout.f27934o00oO0O.add(oooOOOO);
        if (textInputLayout.f27881OooOoO0 != null) {
            oooOOOO.OooO00o(textInputLayout);
        }
        addOnAttachStateChangeListener(new OooOo00(this));
    }

    public final void OooO(Oooo000 oooo000) {
        if (this.f29187Oooo0o0 == null) {
            return;
        }
        if (oooo000.OooO0o0() != null) {
            this.f29187Oooo0o0.setOnFocusChangeListener(oooo000.OooO0o0());
        }
        if (oooo000.OooO0oO() != null) {
            this.f29177OooOoo0.setOnFocusChangeListener(oooo000.OooO0oO());
        }
    }

    public final CheckableImageButton OooO00o(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (oo0o0Oo.OooO0OO.OooO0o0(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final Oooo000 OooO0O0() {
        Oooo000 oooO;
        int i = this.f29178OooOooO;
        o0O0OOO0 o0o0ooo0 = this.f29176OooOoo;
        SparseArray sparseArray = (SparseArray) o0o0ooo0.f21963OooO0OO;
        Oooo000 oooo000 = (Oooo000) sparseArray.get(i);
        if (oooo000 != null) {
            return oooo000;
        }
        OooOo oooOo = (OooOo) o0o0ooo0.f21964OooO0Oo;
        if (i == -1) {
            oooO = new OooO(oooOo, 0);
        } else if (i == 0) {
            oooO = new OooO(oooOo, 1);
        } else if (i == 1) {
            oooO = new o00Ooo(oooOo, o0o0ooo0.f21962OooO0O0);
        } else if (i == 2) {
            oooO = new OooO0o(oooOo);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "Invalid end icon mode: "));
            }
            oooO = new OooOOO0(oooOo);
        }
        sparseArray.append(i, oooO);
        return oooO;
    }

    public final boolean OooO0OO() {
        return this.f29172OooOo0o.getVisibility() == 0 && this.f29177OooOoo0.getVisibility() == 0;
    }

    public final boolean OooO0Oo() {
        return this.f29170OooOo.getVisibility() == 0;
    }

    public final void OooO0o(int i) {
        if (this.f29178OooOooO == i) {
            return;
        }
        Oooo000 oooo000OooO0O0 = OooO0O0();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f29188Oooo0oO;
        AccessibilityManager accessibilityManager = this.f29186Oooo0o;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.f29188Oooo0oO = null;
        oooo000OooO0O0.OooOOoo();
        this.f29178OooOooO = i;
        Iterator it = this.f29179OooOooo.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        OooO0oO(i != 0);
        Oooo000 oooo000OooO0O02 = OooO0O0();
        int iOooO0Oo = this.f29176OooOoo.f21961OooO00o;
        if (iOooO0Oo == 0) {
            iOooO0Oo = oooo000OooO0O02.OooO0Oo();
        }
        Drawable drawable = iOooO0Oo != 0 ? AppCompatResources.getDrawable(getContext(), iOooO0Oo) : null;
        CheckableImageButton checkableImageButton = this.f29177OooOoo0;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f29171OooOo0O;
        if (drawable != null) {
            o0OO00OO.OooO0OO(textInputLayout, checkableImageButton, this.f29181Oooo000, this.f29182Oooo00O);
            o0OO00OO.OooOoOO(textInputLayout, checkableImageButton, this.f29181Oooo000);
        }
        int iOooO0OO = oooo000OooO0O02.OooO0OO();
        CharSequence text = iOooO0OO != 0 ? getResources().getText(iOooO0OO) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(oooo000OooO0O02.OooOO0O());
        if (!oooo000OooO0O02.OooO(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        oooo000OooO0O02.OooOOo();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListenerOooO0oo = oooo000OooO0O02.OooO0oo();
        this.f29188Oooo0oO = touchExplorationStateChangeListenerOooO0oo;
        if (touchExplorationStateChangeListenerOooO0oo != null && accessibilityManager != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, this.f29188Oooo0oO);
        }
        View.OnClickListener onClickListenerOooO0o = oooo000OooO0O02.OooO0o();
        View.OnLongClickListener onLongClickListener = this.f29183Oooo00o;
        checkableImageButton.setOnClickListener(onClickListenerOooO0o);
        o0OO00OO.OooOooO(checkableImageButton, onLongClickListener);
        EditText editText = this.f29187Oooo0o0;
        if (editText != null) {
            oooo000OooO0O02.OooOOO0(editText);
            OooO(oooo000OooO0O02);
        }
        o0OO00OO.OooO0OO(textInputLayout, checkableImageButton, this.f29181Oooo000, this.f29182Oooo00O);
        OooO0o0(true);
    }

    public final void OooO0o0(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        Oooo000 oooo000OooO0O0 = OooO0O0();
        boolean zOooOO0O = oooo000OooO0O0.OooOO0O();
        CheckableImageButton checkableImageButton = this.f29177OooOoo0;
        boolean z4 = true;
        if (!zOooOO0O || (z3 = checkableImageButton.f27675OooOo0O) == oooo000OooO0O0.OooOO0o()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(oooo000OooO0O0 instanceof OooOOO0) || (zIsActivated = checkableImageButton.isActivated()) == oooo000OooO0O0.OooOO0()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            o0OO00OO.OooOoOO(this.f29171OooOo0O, checkableImageButton, this.f29181Oooo000);
        }
    }

    public final void OooO0oO(boolean z) {
        if (OooO0OO() != z) {
            this.f29177OooOoo0.setVisibility(z ? 0 : 8);
            OooOO0();
            OooOO0o();
            this.f29171OooOo0O.OooOOOO();
        }
    }

    public final void OooO0oo(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f29170OooOo;
        checkableImageButton.setImageDrawable(drawable);
        OooOO0O();
        o0OO00OO.OooO0OO(this.f29171OooOo0O, checkableImageButton, this.f29174OooOoO0, this.f29173OooOoO);
    }

    public final void OooOO0() {
        this.f29172OooOo0o.setVisibility((this.f29177OooOoo0.getVisibility() != 0 || OooO0Oo()) ? 8 : 0);
        setVisibility((OooO0OO() || OooO0Oo() || !((this.f29180Oooo0 == null || this.f29185Oooo0OO) ? 8 : false)) ? 0 : 8);
    }

    public final void OooOO0O() {
        CheckableImageButton checkableImageButton = this.f29170OooOo;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f29171OooOo0O;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f27885OooOooO.f29222OooOO0O && textInputLayout.OooOO0o()) ? 0 : 8);
        OooOO0();
        OooOO0o();
        if (this.f29178OooOooO != 0) {
            return;
        }
        textInputLayout.OooOOOO();
    }

    public final void OooOO0o() {
        TextInputLayout textInputLayout = this.f29171OooOo0O;
        if (textInputLayout.f27881OooOoO0 == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f29184Oooo0O0, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f27881OooOoO0.getPaddingTop(), (OooO0OO() || OooO0Oo()) ? 0 : ViewCompat.getPaddingEnd(textInputLayout.f27881OooOoO0), textInputLayout.f27881OooOoO0.getPaddingBottom());
    }

    public final void OooOOO0() {
        AppCompatTextView appCompatTextView = this.f29184Oooo0O0;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.f29180Oooo0 == null || this.f29185Oooo0OO) ? 8 : 0;
        if (visibility != i) {
            OooO0O0().OooOOOo(i == 0);
        }
        OooOO0();
        appCompatTextView.setVisibility(i);
        this.f29171OooOo0O.OooOOOO();
    }
}
