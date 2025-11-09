package o000000;

/* loaded from: classes2.dex */
public final class OooOO0 extends OooO {

    /* renamed from: Oooo, reason: collision with root package name */
    public final float f29026Oooo;

    public OooOO0(float f) {
        super(0);
        this.f29026Oooo = f - 0.001f;
    }

    @Override // o000000.OooO
    public final void OooO(float f, float f2, float f3, o0OOO0o o0ooo0o) {
        double d = this.f29026Oooo;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        o0ooo0o.OooO0o0(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        o0ooo0o.OooO0Oo(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        o0ooo0o.OooO0Oo(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
