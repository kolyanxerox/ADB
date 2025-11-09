package o000000;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class oo000o extends o00oO0o {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public float f29129OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public float f29130OooO0OO;

    @Override // o000000.o00oO0o
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29116OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f29129OooO0O0, this.f29130OooO0OO);
        path.transform(matrix);
    }
}
