package o00O0O;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class OooO00o implements TypeEvaluator {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f31306OooO0O0 = new OooO00o();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f31307OooO00o = new OooO0o();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        OooO0o oooO0o = (OooO0o) obj;
        OooO0o oooO0o2 = (OooO0o) obj2;
        float f2 = oooO0o.f31310OooO00o;
        float f3 = 1.0f - f;
        float f4 = (oooO0o2.f31310OooO00o * f) + (f2 * f3);
        float f5 = oooO0o.f31311OooO0O0;
        float f6 = (oooO0o2.f31311OooO0O0 * f) + (f5 * f3);
        float f7 = oooO0o.f31312OooO0OO;
        float f8 = (f * oooO0o2.f31312OooO0OO) + (f3 * f7);
        OooO0o oooO0o3 = this.f31307OooO00o;
        oooO0o3.f31310OooO00o = f4;
        oooO0o3.f31311OooO0O0 = f6;
        oooO0o3.f31312OooO0OO = f8;
        return oooO0o3;
    }
}
