package o0OO00O;

import OooooOO.ooooO0O0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.github.superadb.R;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes2.dex */
public final class oo000o extends o000oOoO {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f32906OooO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f32907OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Interpolator[] f32908OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f32909OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f32910OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public int f32911OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public float f32912OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public OooO0OO f32913OooOO0O;
    public static final int[] OooOO0o = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f32905OooOOO0 = {1267, 1000, 333, 0};

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final o00oO0o.Oooo000 f32904OooOOO = new o00oO0o.Oooo000(8, Float.class, "animationFraction");

    public oo000o(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f32911OooO0oo = 0;
        this.f32913OooOO0O = null;
        this.f32910OooO0oO = linearProgressIndicatorSpec;
        this.f32908OooO0o = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f32907OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0O0() {
        this.f32911OooO0oo = 0;
        int iOooO0O0 = OooO00o.OooO00o.OooO0O0(this.f32910OooO0oO.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo);
        int[] iArr = this.f32890OooO0OO;
        iArr[0] = iOooO0O0;
        iArr[1] = iOooO0O0;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0OO(OooO0OO oooO0OO) {
        this.f32913OooOO0O = oooO0OO;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f32909OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        OooO00o();
        if (this.f32888OooO00o.isVisible()) {
            this.f32909OooO0o0.setFloatValues(this.f32912OooOO0, 1.0f);
            this.f32909OooO0o0.setDuration((long) ((1.0f - this.f32912OooOO0) * 1800.0f));
            this.f32909OooO0o0.start();
        }
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o() {
        this.f32913OooOO0O = null;
    }

    @Override // o0OO00O.o000oOoO
    public final void OooO0o0() {
        ObjectAnimator objectAnimator = this.f32907OooO0Oo;
        o00oO0o.Oooo000 oooo000 = f32904OooOOO;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooo000, 0.0f, 1.0f);
            this.f32907OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f32907OooO0Oo.setInterpolator(null);
            this.f32907OooO0Oo.setRepeatCount(-1);
            this.f32907OooO0Oo.addListener(new ooooO0O0(this, 6));
        }
        if (this.f32909OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooo000, 1.0f);
            this.f32909OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f32909OooO0o0.setInterpolator(null);
            this.f32909OooO0o0.addListener(new o00Ooo(this));
        }
        this.f32911OooO0oo = 0;
        int iOooO0O0 = OooO00o.OooO00o.OooO0O0(this.f32910OooO0oO.f32846OooO0OO[0], this.f32888OooO00o.f32887OooOooo);
        int[] iArr = this.f32890OooO0OO;
        iArr[0] = iOooO0O0;
        iArr[1] = iOooO0O0;
        this.f32907OooO0Oo.start();
    }
}
