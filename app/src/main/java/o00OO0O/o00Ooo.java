package o00oO0o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class o00Ooo implements TypeEvaluator {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final float[] f32738OooO00o = new float[9];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f32739OooO0O0 = new float[9];

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f32740OooO0OO = new Matrix();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f32741OooO0Oo;

    public o00Ooo(oo0o0Oo oo0o0oo) {
        this.f32741OooO0Oo = oo0o0oo;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        this.f32741OooO0Oo.f32785OooOOOo = f;
        float[] fArr = this.f32738OooO00o;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f32739OooO0O0;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f2 = fArr2[i];
            float f3 = fArr[i];
            fArr2[i] = OooO0oO.OooOo.OooO00o(f2, f3, f, f3);
        }
        Matrix matrix = this.f32740OooO0OO;
        matrix.setValues(fArr2);
        return matrix;
    }
}
