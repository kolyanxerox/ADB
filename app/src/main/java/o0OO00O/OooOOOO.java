package o0OO00O;

import androidx.dynamicanimation.animation.FloatPropertyCompat;

/* loaded from: classes2.dex */
public final class OooOOOO extends FloatPropertyCompat {
    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        return ((OooOo00) obj).f32873Oooo0O0 * 10000.0f;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f) {
        OooOo00 oooOo00 = (OooOo00) obj;
        oooOo00.f32873Oooo0O0 = f / 10000.0f;
        oooOo00.invalidateSelf();
    }
}
