package o0OO00O;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class OooOO0O extends Oooo0 {

    /* renamed from: OooO0OO */
    public int f32850OooO0OO;

    /* renamed from: OooO0Oo */
    public float f32851OooO0Oo;

    /* renamed from: OooO0o */
    public float f32852OooO0o;

    /* renamed from: OooO0o0 */
    public float f32853OooO0o0;

    public OooOO0O(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f32850OooO0OO = 1;
    }

    @Override // o0OO00O.Oooo0
    public final void OooO00o(Canvas canvas, Rect rect, float f) {
        float fWidth = rect.width() / OooO0oO();
        float fHeight = rect.height() / OooO0oO();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f32875OooO00o;
        float f2 = (circularProgressIndicatorSpec.f27737OooO0oO / 2.0f) + circularProgressIndicatorSpec.f27738OooO0oo;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f32850OooO0OO = circularProgressIndicatorSpec.f27736OooO == 0 ? 1 : -1;
        this.f32851OooO0Oo = circularProgressIndicatorSpec.f32844OooO00o * f;
        this.f32853OooO0o0 = circularProgressIndicatorSpec.f32845OooO0O0 * f;
        this.f32852OooO0o = (circularProgressIndicatorSpec.f27737OooO0oO - r9) / 2.0f;
        if ((this.f32876OooO0O0.OooO0Oo() && circularProgressIndicatorSpec.f32849OooO0o0 == 2) || (this.f32876OooO0O0.OooO0OO() && circularProgressIndicatorSpec.f32848OooO0o == 1)) {
            this.f32852OooO0o = (((1.0f - f) * circularProgressIndicatorSpec.f32844OooO00o) / 2.0f) + this.f32852OooO0o;
        } else if ((this.f32876OooO0O0.OooO0Oo() && circularProgressIndicatorSpec.f32849OooO0o0 == 1) || (this.f32876OooO0O0.OooO0OO() && circularProgressIndicatorSpec.f32848OooO0o == 2)) {
            this.f32852OooO0o -= ((1.0f - f) * circularProgressIndicatorSpec.f32844OooO00o) / 2.0f;
        }
    }

    @Override // o0OO00O.Oooo0
    public final void OooO0O0(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f32851OooO0Oo);
        float f3 = this.f32850OooO0OO;
        float f4 = f * 360.0f * f3;
        float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
        float f6 = this.f32852OooO0o;
        float f7 = -f6;
        canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
        if (this.f32853OooO0o0 <= 0.0f || Math.abs(f5) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        OooO0o(canvas, paint, this.f32851OooO0Oo, this.f32853OooO0o0, f4);
        OooO0o(canvas, paint, this.f32851OooO0Oo, this.f32853OooO0o0, f4 + f5);
    }

    @Override // o0OO00O.Oooo0
    public final void OooO0OO(Canvas canvas, Paint paint) {
        int iOooO0O0 = OooO00o.OooO00o.OooO0O0(((CircularProgressIndicatorSpec) this.f32875OooO00o).f32847OooO0Oo, this.f32876OooO0O0.f32887OooOooo);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iOooO0O0);
        paint.setStrokeWidth(this.f32851OooO0Oo);
        float f = this.f32852OooO0o;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // o0OO00O.Oooo0
    public final int OooO0Oo() {
        return OooO0oO();
    }

    public final void OooO0o(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f32852OooO0o;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    @Override // o0OO00O.Oooo0
    public final int OooO0o0() {
        return OooO0oO();
    }

    public final int OooO0oO() {
        OooOO0 oooOO0 = this.f32875OooO00o;
        return (((CircularProgressIndicatorSpec) oooOO0).f27738OooO0oo * 2) + ((CircularProgressIndicatorSpec) oooOO0).f27737OooO0oO;
    }
}
