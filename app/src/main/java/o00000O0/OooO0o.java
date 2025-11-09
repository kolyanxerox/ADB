package o00000O0;

import Ooooo0o.oo0o0O0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.github.superadb.R;

/* loaded from: classes2.dex */
public final class OooO0o extends Oooo000 {

    /* renamed from: OooO, reason: collision with root package name */
    public ValueAnimator f29151OooO;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.OooO00o f29152OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public EditText f29153OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f29154OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public AnimatorSet f29155OooO0oo;

    public OooO0o(OooOo oooOo) {
        super(oooOo);
        this.f29152OooO0o = new com.applovin.mediation.nativeAds.OooO00o(this, 1);
        this.f29154OooO0oO = new OooO00o(this, 0);
    }

    @Override // o00000O0.Oooo000
    public final void OooO00o() {
        if (this.f29197OooO0O0.f29180Oooo0 != null) {
            return;
        }
        OooOo00(OooOo0());
    }

    @Override // o00000O0.Oooo000
    public final int OooO0OO() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // o00000O0.Oooo000
    public final int OooO0Oo() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // o00000O0.Oooo000
    public final View.OnClickListener OooO0o() {
        return this.f29152OooO0o;
    }

    @Override // o00000O0.Oooo000
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f29154OooO0oO;
    }

    @Override // o00000O0.Oooo000
    public final View.OnFocusChangeListener OooO0oO() {
        return this.f29154OooO0oO;
    }

    @Override // o00000O0.Oooo000
    public final void OooOOO0(EditText editText) {
        this.f29153OooO0o0 = editText;
        this.f29196OooO00o.setEndIconVisible(OooOo0());
    }

    @Override // o00000O0.Oooo000
    public final void OooOOOo(boolean z) {
        if (this.f29197OooO0O0.f29180Oooo0 == null) {
            return;
        }
        OooOo00(z);
    }

    @Override // o00000O0.Oooo000
    public final void OooOOo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(oo0o0O0.f15018OooO0Oo);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = oo0o0O0.f15015OooO00o;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new OooO0O0(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f29155OooO0oo = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f29155OooO0oo.addListener(new OooO0OO(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new OooO0O0(this, 0));
        this.f29151OooO = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new OooO0OO(this, 1));
    }

    @Override // o00000O0.Oooo000
    public final void OooOOoo() {
        EditText editText = this.f29153OooO0o0;
        if (editText != null) {
            editText.post(new OooOo0o.o000oOoO(this, 22));
        }
    }

    public final boolean OooOo0() {
        EditText editText = this.f29153OooO0o0;
        if (editText != null) {
            return (editText.hasFocus() || this.f29199OooO0Oo.hasFocus()) && this.f29153OooO0o0.getText().length() > 0;
        }
        return false;
    }

    public final void OooOo00(boolean z) {
        boolean z2 = this.f29197OooO0O0.OooO0OO() == z;
        if (z && !this.f29155OooO0oo.isRunning()) {
            this.f29151OooO.cancel();
            this.f29155OooO0oo.start();
            if (z2) {
                this.f29155OooO0oo.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f29155OooO0oo.cancel();
        this.f29151OooO.start();
        if (z2) {
            this.f29151OooO.end();
        }
    }
}
