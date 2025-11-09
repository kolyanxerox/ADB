package o00000OO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import o000000.OooOO0;
import o000000.OooOOO;
import o000000.OooOOO0;
import o000000.OooOo;
import o0ooOO0.o000000;
import o0ooOO0.o000OOo;

/* loaded from: classes2.dex */
public final class OooO0O0 extends OooOOO0 implements o000OOo {

    /* renamed from: OoooO */
    public final Context f29243OoooO;

    /* renamed from: OoooO0O */
    public CharSequence f29244OoooO0O;

    /* renamed from: OoooOO0 */
    public final Paint.FontMetrics f29245OoooOO0;

    /* renamed from: OoooOOO */
    public final OooO00o f29246OoooOOO;

    /* renamed from: OoooOOo */
    public final Rect f29247OoooOOo;

    /* renamed from: OoooOo0 */
    public int f29248OoooOo0;

    /* renamed from: OoooOoO */
    public int f29249OoooOoO;

    /* renamed from: OoooOoo */
    public int f29250OoooOoo;

    /* renamed from: Ooooo00 */
    public int f29251Ooooo00;

    /* renamed from: Ooooo0o */
    public int f29252Ooooo0o;

    /* renamed from: OooooO0 */
    public int f29253OooooO0;

    /* renamed from: OooooOO */
    public float f29254OooooOO;

    /* renamed from: OooooOo */
    public float f29255OooooOo;

    /* renamed from: Oooooo */
    public float f29256Oooooo;

    /* renamed from: Oooooo0 */
    public float f29257Oooooo0;
    public final o000000 o000oOoO;

    public OooO0O0(Context context, int i) {
        super(context, null, 0, i);
        this.f29245OoooOO0 = new Paint.FontMetrics();
        o000000 o000000Var = new o000000(this);
        this.o000oOoO = o000000Var;
        this.f29246OoooOOO = new OooO00o(this, 0);
        this.f29247OoooOOo = new Rect();
        this.f29254OooooOO = 1.0f;
        this.f29255OooooOo = 1.0f;
        this.f29257Oooooo0 = 0.5f;
        this.f29256Oooooo = 1.0f;
        this.f29243OoooO = context;
        TextPaint textPaint = o000000Var.f33088OooO00o;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float OooOo0O() {
        int i;
        Rect rect = this.f29247OoooOOo;
        if (((rect.right - getBounds().right) - this.f29253OooooO0) - this.f29251Ooooo00 < 0) {
            i = ((rect.right - getBounds().right) - this.f29253OooooO0) - this.f29251Ooooo00;
        } else {
            if (((rect.left - getBounds().left) - this.f29253OooooO0) + this.f29251Ooooo00 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f29253OooooO0) + this.f29251Ooooo00;
        }
        return i;
    }

    public final OooOOO OooOo0o() {
        float f = -OooOo0O();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f29252Ooooo0o))) / 2.0f;
        return new OooOOO(new OooOO0(this.f29252Ooooo0o), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fOooOo0O = OooOo0O();
        float f = (float) (-((Math.sqrt(2.0d) * this.f29252Ooooo0o) - this.f29252Ooooo0o));
        canvas.scale(this.f29254OooooOO, this.f29255OooooOo, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f29257Oooooo0) + getBounds().top);
        canvas.translate(fOooOo0O, f);
        super.draw(canvas);
        if (this.f29244OoooO0O == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            o000000 o000000Var = this.o000oOoO;
            TextPaint textPaint = o000000Var.f33088OooO00o;
            Paint.FontMetrics fontMetrics = this.f29245OoooOO0;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            oo0o0Oo.OooOO0 oooOO0 = o000000Var.f33092OooO0o;
            TextPaint textPaint2 = o000000Var.f33088OooO00o;
            if (oooOO0 != null) {
                textPaint2.drawableState = getState();
                o000000Var.f33092OooO0o.OooO0Oo(this.f29243OoooO, textPaint2, o000000Var.f33089OooO0O0);
                textPaint2.setAlpha((int) (this.f29256Oooooo * 255.0f));
            }
            CharSequence charSequence = this.f29244OoooO0O;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint2);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.o000oOoO.f33088OooO00o.getTextSize(), this.f29250OoooOoo);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f29248OoooOo0 * 2;
        CharSequence charSequence = this.f29244OoooO0O;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.o000oOoO.OooO00o(charSequence.toString())), this.f29249OoooOoO);
    }

    @Override // o000000.OooOOO0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooOo oooOoOooO0o = this.f29048OooOo0O.f29028OooO00o.OooO0o();
        oooOoOooO0o.f29080OooOO0O = OooOo0o();
        setShapeAppearanceModel(oooOoOooO0o.OooO00o());
    }
}
