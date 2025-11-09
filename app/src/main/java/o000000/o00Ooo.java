package o000000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class o00Ooo extends o00oO0o {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final RectF f29109OooO0oo = new RectF();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final float f29110OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final float f29111OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final float f29112OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public float f29113OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f29114OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public float f29115OooO0oO;

    public o00Ooo(float f, float f2, float f3, float f4) {
        this.f29110OooO0O0 = f;
        this.f29111OooO0OO = f2;
        this.f29112OooO0Oo = f3;
        this.f29114OooO0o0 = f4;
    }

    @Override // o000000.o00oO0o
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29116OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f29109OooO0oo;
        rectF.set(this.f29110OooO0O0, this.f29111OooO0OO, this.f29112OooO0Oo, this.f29114OooO0o0);
        path.arcTo(rectF, this.f29113OooO0o, this.f29115OooO0oO, false);
        path.transform(matrix);
    }
}
