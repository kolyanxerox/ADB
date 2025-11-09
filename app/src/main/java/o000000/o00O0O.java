package o000000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o00O0O extends o0ooOOo {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo f29105OooO0OO;

    public o00O0O(o00Ooo o00ooo2) {
        this.f29105OooO0OO = o00ooo2;
    }

    @Override // o000000.o0ooOOo
    public final void OooO00o(Matrix matrix, o000OOo.OooOOO oooOOO, int i, Canvas canvas) {
        o00Ooo o00ooo2 = this.f29105OooO0OO;
        float f = o00ooo2.f29113OooO0o;
        float f2 = o00ooo2.f29115OooO0oO;
        RectF rectF = new RectF(o00ooo2.f29110OooO0O0, o00ooo2.f29111OooO0OO, o00ooo2.f29112OooO0Oo, o00ooo2.f29114OooO0o0);
        oooOOO.getClass();
        boolean z = f2 < 0.0f;
        Path path = oooOOO.f30264OooO0oO;
        int[] iArr = o000OOo.OooOOO.f30257OooOO0O;
        if (z) {
            iArr[0] = 0;
            iArr[1] = oooOOO.f30262OooO0o;
            iArr[2] = oooOOO.f30263OooO0o0;
            iArr[3] = oooOOO.f30261OooO0Oo;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = oooOOO.f30261OooO0Oo;
            iArr[2] = oooOOO.f30263OooO0o0;
            iArr[3] = oooOOO.f30262OooO0o;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = o000OOo.OooOOO.OooOO0o;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = oooOOO.f30259OooO0O0;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, oooOOO.f30265OooO0oo);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
