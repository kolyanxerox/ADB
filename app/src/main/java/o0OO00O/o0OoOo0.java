package o0OO00O;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends Oooo000 {

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final Oooo0 f32902Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public o000oOoO f32903Oooo00o;

    public o0OoOo0(Context context, OooOO0 oooOO0, Oooo0 oooo0, o000oOoO o000oooo2) {
        super(context, oooOO0);
        this.f32902Oooo00O = oooo0;
        oooo0.f32876OooO0O0 = this;
        this.f32903Oooo00o = o000oooo2;
        o000oooo2.f32888OooO00o = this;
    }

    @Override // o0OO00O.Oooo000
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        if (!isRunning()) {
            this.f32903Oooo00o.OooO00o();
        }
        OooO00o oooO00o = this.f32878OooOo;
        ContentResolver contentResolver = this.f32879OooOo0O.getContentResolver();
        oooO00o.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.f32903Oooo00o.OooO0o0();
        }
        return zOooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        Oooo0 oooo0 = this.f32902Oooo00O;
        Rect bounds = getBounds();
        float fOooO0O0 = OooO0O0();
        oooo0.f32875OooO00o.OooO00o();
        oooo0.OooO00o(canvas, bounds, fOooO0O0);
        Oooo0 oooo02 = this.f32902Oooo00O;
        Paint paint = this.f32886OooOooO;
        oooo02.OooO0OO(canvas, paint);
        int i = 0;
        while (true) {
            o000oOoO o000oooo2 = this.f32903Oooo00o;
            int[] iArr = o000oooo2.f32890OooO0OO;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            Oooo0 oooo03 = this.f32902Oooo00O;
            float[] fArr = o000oooo2.f32889OooO0O0;
            int i2 = i * 2;
            oooo03.OooO0O0(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f32902Oooo00O.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f32902Oooo00O.OooO0o0();
    }
}
