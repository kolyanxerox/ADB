package o000000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class OooOOO0 extends Drawable implements TintAwareDrawable, o0Oo0oo {

    /* renamed from: OoooO0 */
    public static final Paint f29046OoooO0;

    /* renamed from: OooOo */
    public final o0ooOOo[] f29047OooOo;

    /* renamed from: OooOo0O */
    public OooOO0O f29048OooOo0O;

    /* renamed from: OooOo0o */
    public final o0ooOOo[] f29049OooOo0o;

    /* renamed from: OooOoO */
    public boolean f29050OooOoO;

    /* renamed from: OooOoO0 */
    public final BitSet f29051OooOoO0;

    /* renamed from: OooOoOO */
    public final Matrix f29052OooOoOO;

    /* renamed from: OooOoo */
    public final Path f29053OooOoo;

    /* renamed from: OooOoo0 */
    public final Path f29054OooOoo0;

    /* renamed from: OooOooO */
    public final RectF f29055OooOooO;

    /* renamed from: OooOooo */
    public final RectF f29056OooOooo;

    /* renamed from: Oooo */
    public final RectF f29057Oooo;

    /* renamed from: Oooo0 */
    public final Paint f29058Oooo0;

    /* renamed from: Oooo000 */
    public final Region f29059Oooo000;

    /* renamed from: Oooo00O */
    public final Region f29060Oooo00O;

    /* renamed from: Oooo00o */
    public Oooo000 f29061Oooo00o;

    /* renamed from: Oooo0O0 */
    public final Paint f29062Oooo0O0;

    /* renamed from: Oooo0OO */
    public final o000OOo.OooOOO f29063Oooo0OO;

    /* renamed from: Oooo0o */
    public final o000oOoO f29064Oooo0o;

    /* renamed from: Oooo0o0 */
    public final o000Ooo0.OooOO0 f29065Oooo0o0;

    /* renamed from: Oooo0oO */
    public PorterDuffColorFilter f29066Oooo0oO;

    /* renamed from: Oooo0oo */
    public PorterDuffColorFilter f29067Oooo0oo;

    /* renamed from: OoooO00 */
    public boolean f29068OoooO00;

    static {
        Paint paint = new Paint(1);
        f29046OoooO0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public OooOOO0() {
        this(new Oooo000());
    }

    public final float OooO() {
        return this.f29048OooOo0O.f29028OooO00o.f29089OooO0o0.OooO00o(OooO0oO());
    }

    public void OooO00o() {
        invalidateSelf();
    }

    public final void OooO0O0(RectF rectF, Path path) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        this.f29064Oooo0o.OooO00o(oooOO0O.f29028OooO00o, oooOO0O.f29027OooO, rectF, this.f29065Oooo0o0, path);
        if (this.f29048OooOo0O.f29035OooO0oo != 1.0f) {
            Matrix matrix = this.f29052OooOoOO;
            matrix.reset();
            float f = this.f29048OooOo0O.f29035OooO0oo;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f29057Oooo, true);
    }

    public final int OooO0OO(int i) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        float f = oooOO0O.f29039OooOOO0 + 0.0f + oooOO0O.OooOO0o;
        o00ooo.OooOO0O oooOO0O2 = oooOO0O.f29029OooO0O0;
        return oooOO0O2 != null ? oooOO0O2.OooO00o(f, i) : i;
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.f29051OooOoO0.cardinality() > 0) {
            Log.w("OooOOO0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f29048OooOo0O.f29041OooOOOo;
        Path path = this.f29054OooOoo0;
        o000OOo.OooOOO oooOOO = this.f29063Oooo0OO;
        if (i != 0) {
            canvas.drawPath(path, oooOOO.f30258OooO00o);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            o0ooOOo o0ooooo = this.f29049OooOo0o[i2];
            int i3 = this.f29048OooOo0O.f29040OooOOOO;
            Matrix matrix = o0ooOOo.f29127OooO0O0;
            o0ooooo.OooO00o(matrix, oooOOO, i3, canvas);
            this.f29047OooOo[i2].OooO00o(matrix, oooOOO, this.f29048OooOo0O.f29040OooOOOO, canvas);
        }
        if (this.f29068OoooO00) {
            OooOO0O oooOO0O = this.f29048OooOo0O;
            int iSin = (int) (Math.sin(Math.toRadians(oooOO0O.f29043OooOOo0)) * oooOO0O.f29041OooOOOo);
            int iOooO0oo = OooO0oo();
            canvas.translate(-iSin, -iOooO0oo);
            canvas.drawPath(path, f29046OoooO0);
            canvas.translate(iSin, iOooO0oo);
        }
    }

    public void OooO0o(Canvas canvas) {
        Paint paint = this.f29062Oooo0O0;
        Path path = this.f29053OooOoo;
        Oooo000 oooo000 = this.f29061Oooo00o;
        RectF rectF = this.f29056OooOooo;
        rectF.set(OooO0oO());
        float strokeWidth = OooOO0() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        OooO0o0(canvas, paint, path, oooo000, rectF);
    }

    public final void OooO0o0(Canvas canvas, Paint paint, Path path, Oooo000 oooo000, RectF rectF) {
        if (!oooo000.OooO0o0(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fOooO00o = oooo000.f29088OooO0o.OooO00o(rectF) * this.f29048OooOo0O.f29027OooO;
            canvas.drawRoundRect(rectF, fOooO00o, fOooO00o, paint);
        }
    }

    public final RectF OooO0oO() {
        RectF rectF = this.f29055OooOooO;
        rectF.set(getBounds());
        return rectF;
    }

    public final int OooO0oo() {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        return (int) (Math.cos(Math.toRadians(oooOO0O.f29043OooOOo0)) * oooOO0O.f29041OooOOOo);
    }

    public final boolean OooOO0() {
        Paint.Style style = this.f29048OooOo0O.f29042OooOOo;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f29062Oooo0O0.getStrokeWidth() > 0.0f;
    }

    public final void OooOO0O(Context context) {
        this.f29048OooOo0O.f29029OooO0O0 = new o00ooo.OooOO0O(context);
        OooOo0();
    }

    public final void OooOO0o(float f) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29039OooOOO0 != f) {
            oooOO0O.f29039OooOOO0 = f;
            OooOo0();
        }
    }

    public final void OooOOO(float f) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29027OooO != f) {
            oooOO0O.f29027OooO = f;
            this.f29050OooOoO = true;
            invalidateSelf();
        }
    }

    public final void OooOOO0(ColorStateList colorStateList) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29030OooO0OO != colorStateList) {
            oooOO0O.f29030OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOOO(Paint.Style style) {
        this.f29048OooOo0O.f29042OooOOo = style;
        super.invalidateSelf();
    }

    public final void OooOOOo() {
        this.f29063Oooo0OO.OooO00o(-12303292);
        this.f29048OooOo0O.getClass();
        super.invalidateSelf();
    }

    public final void OooOOo(ColorStateList colorStateList) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29031OooO0Oo != colorStateList) {
            oooOO0O.f29031OooO0Oo = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOo0() {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29038OooOOO != 2) {
            oooOO0O.f29038OooOOO = 2;
            super.invalidateSelf();
        }
    }

    public final boolean OooOOoo(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f29048OooOo0O.f29030OooO0OO == null || color2 == (colorForState2 = this.f29048OooOo0O.f29030OooO0OO.getColorForState(iArr, (color2 = (paint2 = this.f29058Oooo0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f29048OooOo0O.f29031OooO0Oo == null || color == (colorForState = this.f29048OooOo0O.f29031OooO0Oo.getColorForState(iArr, (color = (paint = this.f29062Oooo0O0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void OooOo0() {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        float f = oooOO0O.f29039OooOOO0 + 0.0f;
        oooOO0O.f29040OooOOOO = (int) Math.ceil(0.75f * f);
        this.f29048OooOo0O.f29041OooOOOo = (int) Math.ceil(f * 0.25f);
        OooOo00();
        super.invalidateSelf();
    }

    public final boolean OooOo00() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29066Oooo0oO;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f29067Oooo0oo;
        OooOO0O oooOO0O = this.f29048OooOo0O;
        ColorStateList colorStateList = oooOO0O.f29033OooO0o0;
        PorterDuff.Mode mode = oooOO0O.f29032OooO0o;
        Paint paint = this.f29058Oooo0;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iOooO0OO = OooO0OO(color);
            porterDuffColorFilter = iOooO0OO != color ? new PorterDuffColorFilter(iOooO0OO, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(OooO0OO(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f29066Oooo0oO = porterDuffColorFilter;
        this.f29048OooOo0O.getClass();
        this.f29067Oooo0oo = null;
        this.f29048OooOo0O.getClass();
        return (ObjectsCompat.equals(porterDuffColorFilter2, this.f29066Oooo0oO) && ObjectsCompat.equals(porterDuffColorFilter3, this.f29067Oooo0oo)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00f4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000000.OooOOO0.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29048OooOo0O.f29037OooOO0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f29048OooOo0O;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29038OooOOO == 2) {
            return;
        }
        if (oooOO0O.f29028OooO00o.OooO0o0(OooO0oO())) {
            outline.setRoundRect(getBounds(), OooO() * this.f29048OooOo0O.f29027OooO);
            return;
        }
        RectF rectFOooO0oO = OooO0oO();
        Path path = this.f29054OooOoo0;
        OooO0O0(rectFOooO0oO, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f29048OooOo0O.f29034OooO0oO;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f29059Oooo000;
        region.set(bounds);
        RectF rectFOooO0oO = OooO0oO();
        Path path = this.f29054OooOoo0;
        OooO0O0(rectFOooO0oO, path);
        Region region2 = this.f29060Oooo00O;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f29050OooOoO = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f29048OooOo0O.f29033OooO0o0;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f29048OooOo0O.getClass();
        ColorStateList colorStateList2 = this.f29048OooOo0O.f29031OooO0Oo;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f29048OooOo0O.f29030OooO0OO;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        OooOO0O oooOO0O2 = new OooOO0O();
        oooOO0O2.f29030OooO0OO = null;
        oooOO0O2.f29031OooO0Oo = null;
        oooOO0O2.f29033OooO0o0 = null;
        oooOO0O2.f29032OooO0o = PorterDuff.Mode.SRC_IN;
        oooOO0O2.f29034OooO0oO = null;
        oooOO0O2.f29035OooO0oo = 1.0f;
        oooOO0O2.f29027OooO = 1.0f;
        oooOO0O2.f29037OooOO0O = 255;
        oooOO0O2.OooOO0o = 0.0f;
        oooOO0O2.f29039OooOOO0 = 0.0f;
        oooOO0O2.f29038OooOOO = 0;
        oooOO0O2.f29040OooOOOO = 0;
        oooOO0O2.f29041OooOOOo = 0;
        oooOO0O2.f29043OooOOo0 = 0;
        oooOO0O2.f29042OooOOo = Paint.Style.FILL_AND_STROKE;
        oooOO0O2.f29028OooO00o = oooOO0O.f29028OooO00o;
        oooOO0O2.f29029OooO0O0 = oooOO0O.f29029OooO0O0;
        oooOO0O2.f29036OooOO0 = oooOO0O.f29036OooOO0;
        oooOO0O2.f29030OooO0OO = oooOO0O.f29030OooO0OO;
        oooOO0O2.f29031OooO0Oo = oooOO0O.f29031OooO0Oo;
        oooOO0O2.f29032OooO0o = oooOO0O.f29032OooO0o;
        oooOO0O2.f29033OooO0o0 = oooOO0O.f29033OooO0o0;
        oooOO0O2.f29037OooOO0O = oooOO0O.f29037OooOO0O;
        oooOO0O2.f29035OooO0oo = oooOO0O.f29035OooO0oo;
        oooOO0O2.f29041OooOOOo = oooOO0O.f29041OooOOOo;
        oooOO0O2.f29038OooOOO = oooOO0O.f29038OooOOO;
        oooOO0O2.f29027OooO = oooOO0O.f29027OooO;
        oooOO0O2.OooOO0o = oooOO0O.OooOO0o;
        oooOO0O2.f29039OooOOO0 = oooOO0O.f29039OooOOO0;
        oooOO0O2.f29040OooOOOO = oooOO0O.f29040OooOOOO;
        oooOO0O2.f29043OooOOo0 = oooOO0O.f29043OooOOo0;
        oooOO0O2.f29042OooOOo = oooOO0O.f29042OooOOo;
        if (oooOO0O.f29034OooO0oO != null) {
            oooOO0O2.f29034OooO0oO = new Rect(oooOO0O.f29034OooO0oO);
        }
        this.f29048OooOo0O = oooOO0O2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f29050OooOoO = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = OooOOoo(iArr) || OooOo00();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29037OooOO0O != i) {
            oooOO0O.f29037OooOO0O = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29048OooOo0O.getClass();
        super.invalidateSelf();
    }

    @Override // o000000.o0Oo0oo
    public final void setShapeAppearanceModel(Oooo000 oooo000) {
        this.f29048OooOo0O.f29028OooO00o = oooo000;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.f29048OooOo0O.f29033OooO0o0 = colorStateList;
        OooOo00();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        OooOO0O oooOO0O = this.f29048OooOo0O;
        if (oooOO0O.f29032OooO0o != mode) {
            oooOO0O.f29032OooO0o = mode;
            OooOo00();
            super.invalidateSelf();
        }
    }

    public OooOOO0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(Oooo000.OooO0O0(context, attributeSet, i, i2).OooO00o());
    }

    public OooOOO0(Oooo000 oooo000) {
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f29030OooO0OO = null;
        oooOO0O.f29031OooO0Oo = null;
        oooOO0O.f29033OooO0o0 = null;
        oooOO0O.f29032OooO0o = PorterDuff.Mode.SRC_IN;
        oooOO0O.f29034OooO0oO = null;
        oooOO0O.f29035OooO0oo = 1.0f;
        oooOO0O.f29027OooO = 1.0f;
        oooOO0O.f29037OooOO0O = 255;
        oooOO0O.OooOO0o = 0.0f;
        oooOO0O.f29039OooOOO0 = 0.0f;
        oooOO0O.f29038OooOOO = 0;
        oooOO0O.f29040OooOOOO = 0;
        oooOO0O.f29041OooOOOo = 0;
        oooOO0O.f29043OooOOo0 = 0;
        oooOO0O.f29042OooOOo = Paint.Style.FILL_AND_STROKE;
        oooOO0O.f29028OooO00o = oooo000;
        oooOO0O.f29029OooO0O0 = null;
        this(oooOO0O);
    }

    public OooOOO0(OooOO0O oooOO0O) {
        o000oOoO o000oooo2;
        this.f29049OooOo0o = new o0ooOOo[4];
        this.f29047OooOo = new o0ooOOo[4];
        this.f29051OooOoO0 = new BitSet(8);
        this.f29052OooOoOO = new Matrix();
        this.f29054OooOoo0 = new Path();
        this.f29053OooOoo = new Path();
        this.f29055OooOooO = new RectF();
        this.f29056OooOooo = new RectF();
        this.f29059Oooo000 = new Region();
        this.f29060Oooo00O = new Region();
        Paint paint = new Paint(1);
        this.f29058Oooo0 = paint;
        Paint paint2 = new Paint(1);
        this.f29062Oooo0O0 = paint2;
        this.f29063Oooo0OO = new o000OOo.OooOOO();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o000oooo2 = Oooo0.f29081OooO00o;
        } else {
            o000oooo2 = new o000oOoO();
        }
        this.f29064Oooo0o = o000oooo2;
        this.f29057Oooo = new RectF();
        this.f29068OoooO00 = true;
        this.f29048OooOo0O = oooOO0O;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOo00();
        OooOOoo(getState());
        this.f29065Oooo0o0 = new o000Ooo0.OooOO0(this, 20);
    }
}
