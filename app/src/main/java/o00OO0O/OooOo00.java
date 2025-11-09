package o00oO0o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import o000000.OooO0OO;

/* loaded from: classes2.dex */
public final class OooOo00 extends Drawable {

    /* renamed from: OooO, reason: collision with root package name */
    public int f32710OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Paint f32712OooO0O0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public float f32718OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int f32719OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f32720OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public int f32722OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public o000000.Oooo000 f32723OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public ColorStateList f32724OooOOOo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000000.o000oOoO f32711OooO00o = o000000.Oooo0.f29081OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Path f32713OooO0OO = new Path();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f32714OooO0Oo = new Rect();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f32716OooO0o0 = new RectF();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final RectF f32715OooO0o = new RectF();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOOO f32717OooO0oO = new OooOOOO(this);

    /* renamed from: OooOOO, reason: collision with root package name */
    public boolean f32721OooOOO = true;

    public OooOo00(o000000.Oooo000 oooo000) {
        this.f32723OooOOOO = oooo000;
        Paint paint = new Paint(1);
        this.f32712OooO0O0 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.f32721OooOOO;
        Paint paint = this.f32712OooO0O0;
        Rect rect = this.f32714OooO0Oo;
        if (z) {
            copyBounds(rect);
            float fHeight = this.f32718OooO0oo / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f32710OooO, this.f32722OooOOO0), ColorUtils.compositeColors(this.f32719OooOO0, this.f32722OooOOO0), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f32719OooOO0, 0), this.f32722OooOOO0), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.OooOO0o, 0), this.f32722OooOOO0), ColorUtils.compositeColors(this.OooOO0o, this.f32722OooOOO0), ColorUtils.compositeColors(this.f32720OooOO0O, this.f32722OooOOO0)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f32721OooOOO = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f32716OooO0o0;
        rectF.set(rect);
        OooO0OO oooO0OO = this.f32723OooOOOO.f29089OooO0o0;
        RectF rectF2 = this.f32715OooO0o;
        rectF2.set(getBounds());
        float fMin = Math.min(oooO0OO.OooO00o(rectF2), rectF.width() / 2.0f);
        o000000.Oooo000 oooo000 = this.f32723OooOOOO;
        rectF2.set(getBounds());
        if (oooo000.OooO0o0(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f32717OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f32718OooO0oo > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        o000000.Oooo000 oooo000 = this.f32723OooOOOO;
        RectF rectF = this.f32715OooO0o;
        rectF.set(getBounds());
        if (oooo000.OooO0o0(rectF)) {
            OooO0OO oooO0OO = this.f32723OooOOOO.f29089OooO0o0;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), oooO0OO.OooO00o(rectF));
            return;
        }
        Rect rect = this.f32714OooO0Oo;
        copyBounds(rect);
        RectF rectF2 = this.f32716OooO0o0;
        rectF2.set(rect);
        o000000.Oooo000 oooo0002 = this.f32723OooOOOO;
        Path path = this.f32713OooO0OO;
        this.f32711OooO00o.OooO00o(oooo0002, 1.0f, rectF2, null, path);
        if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o000000.Oooo000 oooo000 = this.f32723OooOOOO;
        RectF rectF = this.f32715OooO0o;
        rectF.set(getBounds());
        if (!oooo000.OooO0o0(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f32718OooO0oo);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f32724OooOOOo;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f32721OooOOO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f32724OooOOOo;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f32722OooOOO0)) != this.f32722OooOOO0) {
            this.f32721OooOOO = true;
            this.f32722OooOOO0 = colorForState;
        }
        if (this.f32721OooOOO) {
            invalidateSelf();
        }
        return this.f32721OooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f32712OooO0O0.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32712OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
