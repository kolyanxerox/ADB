package o00oO0o;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class o00oO0o implements TypeEvaluator {

    /* renamed from: OooO00o, reason: collision with root package name */
    public FloatEvaluator f32742OooO00o;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float fFloatValue = this.f32742OooO00o.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
