package o0OO00O;

import OooooOO.ooooO0O0;
import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00Oo0 extends o000oOoO {

    /* renamed from: OooOO0 */
    public static final o00oO0o.Oooo000 f32894OooOO0 = new o00oO0o.Oooo000(7, Float.class, "animationFraction");

    /* renamed from: OooO */
    public float f32895OooO;

    /* renamed from: OooO0Oo */
    public ObjectAnimator f32896OooO0Oo;

    /* renamed from: OooO0o */
    public final LinearProgressIndicatorSpec f32897OooO0o;

    /* renamed from: OooO0o0 */
    public final FastOutSlowInInterpolator f32898OooO0o0;

    /* renamed from: OooO0oO */
    public int f32899OooO0oO;

    /* renamed from: OooO0oo */
    public boolean f32900OooO0oo;

    public o00Oo0(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f32899OooO0oO = 1;
        this.f32897OooO0o = linearProgressIndicatorSpec;
        this.f32898OooO0o0 = new FastOutSlowInInterpolator();
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f32896OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0O0() {
        this.f32900OooO0oo = true;
        this.f32899OooO0oO = 1;
        Arrays.fill(this.f32890OooO0OO, OooO00o.OooO00o.OooO0O0(this.f32897OooO0o.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo));
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o0() {
        if (this.f32896OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f32894OooOO0, 0.0f, 1.0f);
            this.f32896OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f32896OooO0Oo.setInterpolator(null);
            this.f32896OooO0Oo.setRepeatCount(-1);
            this.f32896OooO0Oo.addListener(new ooooO0O0(this, 5));
        }
        this.f32900OooO0oo = true;
        this.f32899OooO0oO = 1;
        Arrays.fill(this.f32890OooO0OO, OooO00o.OooO00o.OooO0O0(this.f32897OooO0o.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo));
        this.f32896OooO0Oo.start();
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0Oo() {
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o() {
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0OO(OooO0OO oooO0OO) {
    }
}
