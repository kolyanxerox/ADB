package o00000O0;

import Oooo0oO.o00000;
import Ooooo0o.oo0o0O0;
import OooooOO.ooooO0O0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class OooOOO0 extends Oooo000 {

    /* renamed from: OooO */
    public boolean f29159OooO;

    /* renamed from: OooO0o */
    public final com.applovin.mediation.nativeAds.OooO00o f29160OooO0o;

    /* renamed from: OooO0o0 */
    public AutoCompleteTextView f29161OooO0o0;

    /* renamed from: OooO0oO */
    public final OooO00o f29162OooO0oO;

    /* renamed from: OooO0oo */
    public final OooO0oo.o00Oo0 f29163OooO0oo;

    /* renamed from: OooOO0 */
    public boolean f29164OooOO0;

    /* renamed from: OooOO0O */
    public boolean f29165OooOO0O;
    public long OooOO0o;

    /* renamed from: OooOOO */
    public ValueAnimator f29166OooOOO;

    /* renamed from: OooOOO0 */
    public AccessibilityManager f29167OooOOO0;

    /* renamed from: OooOOOO */
    public ValueAnimator f29168OooOOOO;

    public OooOOO0(OooOo oooOo) {
        super(oooOo);
        this.f29160OooO0o = new com.applovin.mediation.nativeAds.OooO00o(this, 2);
        this.f29162OooO0oO = new OooO00o(this, 1);
        this.f29163OooO0oo = new OooO0oo.o00Oo0(this, 19);
        this.OooOO0o = LocationRequestCompat.PASSIVE_INTERVAL;
    }

    @Override // o00000O0.Oooo000
    public final boolean OooO(int i) {
        return i != 0;
    }

    @Override // o00000O0.Oooo000
    public final void OooO00o() {
        if (this.f29167OooOOO0.isTouchExplorationEnabled() && o00000.OooOO0(this.f29161OooO0o0) && !this.f29199OooO0Oo.hasFocus()) {
            this.f29161OooO0o0.dismissDropDown();
        }
        this.f29161OooO0o0.post(new OooOo0o.o000oOoO(this, 23));
    }

    @Override // o00000O0.Oooo000
    public final int OooO0OO() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // o00000O0.Oooo000
    public final int OooO0Oo() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // o00000O0.Oooo000
    public final View.OnClickListener OooO0o() {
        return this.f29160OooO0o;
    }

    @Override // o00000O0.Oooo000
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f29162OooO0oO;
    }

    @Override // o00000O0.Oooo000
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener OooO0oo() {
        return this.f29163OooO0oo;
    }

    @Override // o00000O0.Oooo000
    public final boolean OooOO0() {
        return this.f29159OooO;
    }

    @Override // o00000O0.Oooo000
    public final boolean OooOO0o() {
        return this.f29165OooOO0O;
    }

    @Override // o00000O0.Oooo000
    public final void OooOOO(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!o00000.OooOO0(this.f29161OooO0o0)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // o00000O0.Oooo000
    public final void OooOOO0(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f29161OooO0o0 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new com.unity3d.ads.adplayer.OooO00o(this, 1));
        this.f29161OooO0o0.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o00000O0.OooOO0O
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                OooOOO0 oooOOO0 = this.f29157OooO00o;
                oooOOO0.f29164OooOO0 = true;
                oooOOO0.OooOO0o = System.currentTimeMillis();
                oooOOO0.OooOo00(false);
            }
        });
        this.f29161OooO0o0.setThreshold(0);
        TextInputLayout textInputLayout = this.f29196OooO00o;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!o00000.OooOO0(editText) && this.f29167OooOOO0.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.f29199OooO0Oo, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // o00000O0.Oooo000
    public final void OooOOOO(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f29167OooOOO0.isEnabled() && !o00000.OooOO0(this.f29161OooO0o0)) {
            OooOo0();
            this.f29164OooOO0 = true;
            this.OooOO0o = System.currentTimeMillis();
        }
    }

    @Override // o00000O0.Oooo000
    public final void OooOOo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = oo0o0O0.f15015OooO00o;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0(this, 2));
        this.f29168OooOOOO = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0(this, 2));
        this.f29166OooOOO = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new ooooO0O0(this, 1));
        this.f29167OooOOO0 = (AccessibilityManager) this.f29198OooO0OO.getSystemService("accessibility");
    }

    @Override // o00000O0.Oooo000
    public final void OooOOoo() {
        AutoCompleteTextView autoCompleteTextView = this.f29161OooO0o0;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f29161OooO0o0.setOnDismissListener(null);
        }
    }

    public final void OooOo0() {
        if (this.f29161OooO0o0 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.OooOO0o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f29164OooOO0 = false;
        }
        if (this.f29164OooOO0) {
            this.f29164OooOO0 = false;
            return;
        }
        OooOo00(!this.f29165OooOO0O);
        if (!this.f29165OooOO0O) {
            this.f29161OooO0o0.dismissDropDown();
        } else {
            this.f29161OooO0o0.requestFocus();
            this.f29161OooO0o0.showDropDown();
        }
    }

    public final void OooOo00(boolean z) {
        if (this.f29165OooOO0O != z) {
            this.f29165OooOO0O = z;
            this.f29168OooOOOO.cancel();
            this.f29166OooOOO.start();
        }
    }
}
