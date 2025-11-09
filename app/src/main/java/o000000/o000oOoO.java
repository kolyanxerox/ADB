package o000000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO00o */
    public final o0OOO0o[] f29095OooO00o = new o0OOO0o[4];

    /* renamed from: OooO0O0 */
    public final Matrix[] f29096OooO0O0 = new Matrix[4];

    /* renamed from: OooO0OO */
    public final Matrix[] f29097OooO0OO = new Matrix[4];

    /* renamed from: OooO0Oo */
    public final PointF f29098OooO0Oo = new PointF();

    /* renamed from: OooO0o0 */
    public final Path f29100OooO0o0 = new Path();

    /* renamed from: OooO0o */
    public final Path f29099OooO0o = new Path();

    /* renamed from: OooO0oO */
    public final o0OOO0o f29101OooO0oO = new o0OOO0o();

    /* renamed from: OooO0oo */
    public final float[] f29102OooO0oo = new float[2];

    /* renamed from: OooO */
    public final float[] f29094OooO = new float[2];

    /* renamed from: OooOO0 */
    public final Path f29103OooOO0 = new Path();

    /* renamed from: OooOO0O */
    public final Path f29104OooOO0O = new Path();
    public final boolean OooOO0o = true;

    public o000oOoO() {
        for (int i = 0; i < 4; i++) {
            this.f29095OooO00o[i] = new o0OOO0o();
            this.f29096OooO0O0[i] = new Matrix();
            this.f29097OooO0OO[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void OooO00o(Oooo000 oooo000, float f, RectF rectF, o000Ooo0.OooOO0 oooOO0, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        o0OOO0o[] o0ooo0oArr;
        int i;
        boolean z;
        float[] fArr;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.f29100OooO0o0;
        path2.rewind();
        Path path3 = this.f29099OooO0o;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.f29097OooO0OO;
            matrixArr2 = this.f29096OooO0O0;
            o0ooo0oArr = this.f29095OooO00o;
            z = 0;
            fArr = this.f29102OooO0oo;
            if (i3 >= 4) {
                break;
            }
            OooO0OO oooO0OO = i3 != 1 ? i3 != 2 ? i3 != 3 ? oooo000.f29088OooO0o : oooo000.f29089OooO0o0 : oooo000.f29091OooO0oo : oooo000.f29090OooO0oO;
            OooO00o.OooO00o oooO00o = i3 != 1 ? i3 != 2 ? i3 != 3 ? oooo000.f29085OooO0O0 : oooo000.f29084OooO00o : oooo000.f29087OooO0Oo : oooo000.f29086OooO0OO;
            o0OOO0o o0ooo0o = o0ooo0oArr[i3];
            oooO00o.getClass();
            oooO00o.OooOOO0(o0ooo0o, f, oooO0OO.OooO00o(rectF));
            int i4 = i3 + 1;
            float f2 = i4 * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.f29098OooO0Oo;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            o0OOO0o o0ooo0o2 = o0ooo0oArr[i2];
            fArr[0] = o0ooo0o2.f29119OooO0OO;
            fArr[1] = o0ooo0o2.f29120OooO0Oo;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            o0OOO0o o0ooo0o3 = o0ooo0oArr[i5];
            fArr[z] = o0ooo0o3.f29117OooO00o;
            fArr[1] = o0ooo0o3.f29118OooO0O0;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[z], fArr[1]);
            } else {
                path.lineTo(fArr[z], fArr[1]);
            }
            o0ooo0oArr[i5].OooO0OO(matrixArr2[i5], path);
            if (oooOO0 != null) {
                o0OOO0o o0ooo0o4 = o0ooo0oArr[i5];
                Matrix matrix = matrixArr2[i5];
                OooOOO0 oooOOO0 = (OooOOO0) oooOO0.f30538OooOo0o;
                BitSet bitSet = oooOOO0.f29051OooOoO0;
                o0ooo0o4.getClass();
                bitSet.set(i5, z);
                o0ooo0o4.OooO0O0(o0ooo0o4.f29121OooO0o);
                oooOOO0.f29049OooOo0o[i5] = new o0OoOo0(new ArrayList(o0ooo0o4.f29124OooO0oo), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            o0OOO0o o0ooo0o5 = o0ooo0oArr[i5];
            fArr[0] = o0ooo0o5.f29119OooO0OO;
            fArr[1] = o0ooo0o5.f29120OooO0Oo;
            matrixArr2[i5].mapPoints(fArr);
            o0OOO0o o0ooo0o6 = o0ooo0oArr[i7];
            float f3 = o0ooo0o6.f29117OooO00o;
            float[] fArr2 = this.f29094OooO;
            fArr2[0] = f3;
            fArr2[1] = o0ooo0o6.f29118OooO0O0;
            matrixArr2[i7].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            o0OOO0o[] o0ooo0oArr2 = o0ooo0oArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            o0OOO0o o0ooo0o7 = o0ooo0oArr2[i5];
            fArr[0] = o0ooo0o7.f29119OooO0OO;
            fArr[1] = o0ooo0o7.f29120OooO0Oo;
            matrixArr3[i5].mapPoints(fArr);
            float fAbs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            o0OOO0o o0ooo0o8 = this.f29101OooO0oO;
            o0ooo0o8.OooO0o0(0.0f, 0.0f, 270.0f, 0.0f);
            OooO oooO = i5 != 1 ? i5 != 2 ? i5 != 3 ? oooo000.f29092OooOO0 : oooo000.f29083OooO : oooo000.OooOO0o : oooo000.f29093OooOO0O;
            oooO.OooO(fMax, fAbs, f, o0ooo0o8);
            Path path4 = this.f29103OooOO0;
            path4.reset();
            o0ooo0o8.OooO0OO(matrixArr[i5], path4);
            if (this.OooOO0o && (oooO.OooO0oo() || OooO0O0(path4, i5) || OooO0O0(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = o0ooo0o8.f29117OooO00o;
                fArr[1] = o0ooo0o8.f29118OooO0O0;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                o0ooo0o8.OooO0OO(matrixArr[i5], path2);
            } else {
                o0ooo0o8.OooO0OO(matrixArr[i5], path);
            }
            if (oooOO0 != null) {
                Matrix matrix2 = matrixArr[i5];
                OooOOO0 oooOOO02 = (OooOOO0) oooOO0.f30538OooOo0o;
                z2 = false;
                oooOOO02.f29051OooOoO0.set(i5 + 4, false);
                o0ooo0o8.OooO0O0(o0ooo0o8.f29121OooO0o);
                oooOOO02.f29047OooOo[i5] = new o0OoOo0(new ArrayList(o0ooo0o8.f29124OooO0oo), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            i5 = i6;
            z = z2;
            o0ooo0oArr = o0ooo0oArr2;
            matrixArr2 = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean OooO0O0(Path path, int i) {
        Path path2 = this.f29104OooOO0O;
        path2.reset();
        this.f29095OooO00o[i].OooO0OO(this.f29096OooO0O0[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
