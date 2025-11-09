package o0OO00O;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class o00O0O extends Oooo0 {

    /* renamed from: OooO0OO */
    public float f32891OooO0OO;

    /* renamed from: OooO0Oo */
    public float f32892OooO0Oo;

    /* renamed from: OooO0o0 */
    public float f32893OooO0o0;

    public o00O0O(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f32891OooO0OO = 300.0f;
    }

    @Override // o0OO00O.Oooo0
    public final void OooO00o(Canvas canvas, Rect rect, float f) {
        this.f32891OooO0OO = rect.width();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f32875OooO00o;
        float f2 = linearProgressIndicatorSpec.f32844OooO00o;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - linearProgressIndicatorSpec.f32844OooO00o) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (linearProgressIndicatorSpec.f27740OooO) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f32876OooO0O0.OooO0Oo() && linearProgressIndicatorSpec.f32849OooO0o0 == 1) || (this.f32876OooO0O0.OooO0OO() && linearProgressIndicatorSpec.f32848OooO0o == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f32876OooO0O0.OooO0Oo() || this.f32876OooO0O0.OooO0OO()) {
            canvas.translate(0.0f, ((f - 1.0f) * linearProgressIndicatorSpec.f32844OooO00o) / 2.0f);
        }
        float f3 = this.f32891OooO0OO;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.f32892OooO0Oo = linearProgressIndicatorSpec.f32844OooO00o * f;
        this.f32893OooO0o0 = linearProgressIndicatorSpec.f32845OooO0O0 * f;
    }

    @Override // o0OO00O.Oooo0
    public final void OooO0O0(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f32891OooO0OO;
        float f4 = (-f3) / 2.0f;
        float f5 = this.f32893OooO0o0 * 2.0f;
        float f6 = f3 - f5;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f7 = this.f32892OooO0Oo;
        RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
        float f8 = this.f32893OooO0o0;
        canvas.drawRoundRect(rectF, f8, f8, paint);
    }

    @Override // o0OO00O.Oooo0
    public final void OooO0OO(Canvas canvas, Paint paint) {
        int iOooO0O0 = OooO00o.OooO00o.OooO0O0(((LinearProgressIndicatorSpec) this.f32875OooO00o).f32847OooO0Oo, this.f32876OooO0O0.f32887OooOooo);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iOooO0O0);
        float f = this.f32891OooO0OO;
        float f2 = this.f32892OooO0Oo;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f32893OooO0o0;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // o0OO00O.Oooo0
    public final int OooO0Oo() {
        return ((LinearProgressIndicatorSpec) this.f32875OooO00o).f32844OooO00o;
    }

    @Override // o0OO00O.Oooo0
    public final int OooO0o0() {
        return -1;
    }
}
