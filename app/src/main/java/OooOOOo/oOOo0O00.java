package OooooOo;

import OooO0oO.OooOo;
import o000000.OooO;
import o000000.o0OOO0o;

/* loaded from: classes2.dex */
public final class oOOo0O00 extends OooO implements Cloneable {

    /* renamed from: Oooo, reason: collision with root package name */
    public float f15067Oooo;

    /* renamed from: OoooO, reason: collision with root package name */
    public float f15068OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public float f15069OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public float f15070OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public float f15071OoooO0O;

    /* renamed from: OoooOO0, reason: collision with root package name */
    public float f15072OoooOO0;

    @Override // o000000.OooO
    public final void OooO(float f, float f2, float f3, o0OOO0o o0ooo0o) {
        float f4;
        float f5;
        float f6 = this.f15069OoooO0;
        if (f6 == 0.0f) {
            o0ooo0o.OooO0Oo(f, 0.0f);
            return;
        }
        float f7 = ((this.f15070OoooO00 * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f15067Oooo;
        float f9 = f2 + this.f15068OoooO;
        float fOooO00o = OooOo.OooO00o(1.0f, f3, f7, this.f15071OoooO0O * f3);
        if (fOooO00o / f7 >= 1.0f) {
            o0ooo0o.OooO0Oo(f, 0.0f);
            return;
        }
        float f10 = this.f15072OoooOO0;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = fOooO00o;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        o0ooo0o.OooO0Oo(f14, 0.0f);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        o0ooo0o.OooO00o(f17, 0.0f, f18, f19, 270.0f, degrees);
        if (z) {
            o0ooo0o.OooO00o(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.f15070OoooO00;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            o0ooo0o.OooO00o(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f9 + f7;
            float f25 = this.f15070OoooO00;
            o0ooo0o.OooO0Oo(f24 - ((f25 / 2.0f) + f11), f25 + f11);
            float f26 = this.f15070OoooO00;
            o0ooo0o.OooO00o(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
        }
        o0ooo0o.OooO00o(f15 - f8, 0.0f, f15 + f8, f19, 270.0f - degrees, degrees);
        o0ooo0o.OooO0Oo(f, 0.0f);
    }

    public final void OooOO0o(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f15071OoooO0O = f;
    }
}
