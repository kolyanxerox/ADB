package Ooooo0o;

import OooO0oO.OooOo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* loaded from: classes2.dex */
public abstract class oo0o0O0 {

    /* renamed from: OooO00o */
    public static final LinearInterpolator f15015OooO00o = new LinearInterpolator();

    /* renamed from: OooO0O0 */
    public static final FastOutSlowInInterpolator f15016OooO0O0 = new FastOutSlowInInterpolator();

    /* renamed from: OooO0OO */
    public static final FastOutLinearInInterpolator f15017OooO0OO = new FastOutLinearInInterpolator();

    /* renamed from: OooO0Oo */
    public static final LinearOutSlowInInterpolator f15018OooO0Oo = new LinearOutSlowInInterpolator();

    /* renamed from: OooO0o0 */
    public static final DecelerateInterpolator f15019OooO0o0 = new DecelerateInterpolator();

    public static float OooO00o(float f, float f2, float f3) {
        return OooOo.OooO00o(f2, f, f3, f);
    }

    public static float OooO0O0(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : OooO00o(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int OooO0OO(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
