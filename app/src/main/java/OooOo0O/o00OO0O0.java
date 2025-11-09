package Ooooo0o;

import OooO0oO.OooOo;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class o00OO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f15010OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public TimeInterpolator f15012OooO0OO = null;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f15013OooO0Oo = 0;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f15014OooO0o0 = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f15011OooO0O0 = 150;

    public o00OO0O0(long j) {
        this.f15010OooO00o = j;
    }

    public final void OooO00o(Animator animator) {
        animator.setStartDelay(this.f15010OooO00o);
        animator.setDuration(this.f15011OooO0O0);
        animator.setInterpolator(OooO0O0());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f15013OooO0Oo);
            valueAnimator.setRepeatMode(this.f15014OooO0o0);
        }
    }

    public final TimeInterpolator OooO0O0() {
        TimeInterpolator timeInterpolator = this.f15012OooO0OO;
        return timeInterpolator != null ? timeInterpolator : oo0o0O0.f15016OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OO0O0)) {
            return false;
        }
        o00OO0O0 o00oo0o0 = (o00OO0O0) obj;
        if (this.f15010OooO00o == o00oo0o0.f15010OooO00o && this.f15011OooO0O0 == o00oo0o0.f15011OooO0O0 && this.f15013OooO0Oo == o00oo0o0.f15013OooO0Oo && this.f15014OooO0o0 == o00oo0o0.f15014OooO0o0) {
            return OooO0O0().getClass().equals(o00oo0o0.OooO0O0().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15010OooO00o;
        long j2 = this.f15011OooO0O0;
        return ((((OooO0O0().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f15013OooO0Oo) * 31) + this.f15014OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(o00OO0O0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f15010OooO00o);
        sb.append(" duration: ");
        sb.append(this.f15011OooO0O0);
        sb.append(" interpolator: ");
        sb.append(OooO0O0().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f15013OooO0Oo);
        sb.append(" repeatMode: ");
        return OooOo.OooOOO(sb, this.f15014OooO0o0, "}\n");
    }
}
