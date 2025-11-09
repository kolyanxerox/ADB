package o00000O0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes2.dex */
public final class OooOO0 extends o000000.OooOOO0 {

    /* renamed from: OoooO0O, reason: collision with root package name */
    public final RectF f29156OoooO0O;

    public OooOO0(o000000.Oooo000 oooo000) {
        super(oooo000 == null ? new o000000.Oooo000() : oooo000);
        this.f29156OoooO0O = new RectF();
    }

    @Override // o000000.OooOOO0
    public final void OooO0o(Canvas canvas) {
        RectF rectF = this.f29156OoooO0O;
        if (rectF.isEmpty()) {
            super.OooO0o(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.OooO0o(canvas);
        canvas.restore();
    }

    public final void OooOo0O(float f, float f2, float f3, float f4) {
        RectF rectF = this.f29156OoooO0O;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
