package o0OO00O;

import OooooOO.ooooO0O0;
import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class OooOOO extends o000oOoO {

    /* renamed from: OooOOOO, reason: collision with root package name */
    public static final o00oO0o.Oooo000 f32856OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public static final o00oO0o.Oooo000 f32857OooOOOo;

    /* renamed from: OooO, reason: collision with root package name */
    public float f32858OooO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f32859OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final FastOutSlowInInterpolator f32860OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f32861OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f32862OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f32863OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public float f32864OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public OooO0OO f32865OooOO0O;
    public static final int[] OooOO0o = {0, 1350, 2700, 4050};

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f32855OooOOO0 = {667, 2017, 3367, 4717};

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f32854OooOOO = {1000, 2350, 3700, 5050};

    static {
        Class<Float> cls = Float.class;
        f32856OooOOOO = new o00oO0o.Oooo000(4, cls, "animationFraction");
        f32857OooOOOo = new o00oO0o.Oooo000(5, cls, "completeEndFraction");
    }

    public OooOOO(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f32863OooO0oo = 0;
        this.f32865OooOO0O = null;
        this.f32862OooO0oO = circularProgressIndicatorSpec;
        this.f32860OooO0o = new FastOutSlowInInterpolator();
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f32859OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0O0() {
        this.f32863OooO0oo = 0;
        this.f32890OooO0OO[0] = OooO00o.OooO00o.OooO0O0(this.f32862OooO0oO.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo);
        this.f32864OooOO0 = 0.0f;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0OO(OooO0OO oooO0OO) {
        this.f32865OooOO0O = oooO0OO;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f32861OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f32888OooO00o.isVisible()) {
            this.f32861OooO0o0.start();
        } else {
            OooO00o();
        }
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o() {
        this.f32865OooOO0O = null;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o0() {
        if (this.f32859OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f32856OooOOOO, 0.0f, 1.0f);
            this.f32859OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f32859OooO0Oo.setInterpolator(null);
            this.f32859OooO0Oo.setRepeatCount(-1);
            this.f32859OooO0Oo.addListener(new ooooO0O0(this, 4));
        }
        if (this.f32861OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f32857OooOOOo, 0.0f, 1.0f);
            this.f32861OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f32861OooO0o0.setInterpolator(this.f32860OooO0o);
            this.f32861OooO0o0.addListener(new OooOOO0(this));
        }
        this.f32863OooO0oo = 0;
        this.f32890OooO0OO[0] = OooO00o.OooO00o.OooO0O0(this.f32862OooO0oO.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo);
        this.f32864OooOO0 = 0.0f;
        this.f32859OooO0Oo.start();
    }
}
