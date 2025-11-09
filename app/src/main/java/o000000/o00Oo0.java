package o000000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o00Oo0 extends o0ooOOo {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o f29106OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final float f29107OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f29108OooO0o0;

    public o00Oo0(oo000o oo000oVar, float f, float f2) {
        this.f29106OooO0OO = oo000oVar;
        this.f29107OooO0Oo = f;
        this.f29108OooO0o0 = f2;
    }

    @Override // o000000.o0ooOOo
    public final void OooO00o(Matrix matrix, o000OOo.OooOOO oooOOO, int i, Canvas canvas) {
        oo000o oo000oVar = this.f29106OooO0OO;
        float f = oo000oVar.f29130OooO0OO;
        float f2 = this.f29108OooO0o0;
        float f3 = oo000oVar.f29129OooO0O0;
        float f4 = this.f29107OooO0Oo;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f29128OooO00o;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(OooO0O0());
        oooOOO.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = o000OOo.OooOOO.f30255OooO;
        iArr[0] = oooOOO.f30262OooO0o;
        iArr[1] = oooOOO.f30263OooO0o0;
        iArr[2] = oooOOO.f30261OooO0Oo;
        Paint paint = oooOOO.f30260OooO0OO;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, o000OOo.OooOOO.f30256OooOO0, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float OooO0O0() {
        oo000o oo000oVar = this.f29106OooO0OO;
        return (float) Math.toDegrees(Math.atan((oo000oVar.f29130OooO0OO - this.f29108OooO0o0) / (oo000oVar.f29129OooO0O0 - this.f29107OooO0Oo)));
    }
}
