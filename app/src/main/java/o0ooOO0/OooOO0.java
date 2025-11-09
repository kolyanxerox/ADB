package o0ooOO0;

import Ooooo0o.oo0o0O0;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.ironsource.InterfaceC3173h3;
import oo0o0Oo.OooO00o;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooO */
    public final RectF f33013OooO;

    /* renamed from: OooO00o */
    public final ViewGroup f33014OooO00o;

    /* renamed from: OooO0O0 */
    public float f33015OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f33016OooO0OO;

    /* renamed from: OooO0Oo */
    public float f33017OooO0Oo;

    /* renamed from: OooO0o */
    public int f33018OooO0o;

    /* renamed from: OooO0o0 */
    public float f33019OooO0o0;

    /* renamed from: OooO0oO */
    public final Rect f33020OooO0oO;

    /* renamed from: OooO0oo */
    public final Rect f33021OooO0oo;

    /* renamed from: OooOOO */
    public ColorStateList f33024OooOOO;

    /* renamed from: OooOOOO */
    public ColorStateList f33026OooOOOO;

    /* renamed from: OooOOOo */
    public int f33027OooOOOo;

    /* renamed from: OooOOo */
    public float f33028OooOOo;

    /* renamed from: OooOOo0 */
    public float f33029OooOOo0;

    /* renamed from: OooOOoo */
    public float f33030OooOOoo;

    /* renamed from: OooOo */
    public Typeface f33031OooOo;
    public float OooOo0;

    /* renamed from: OooOo00 */
    public float f33032OooOo00;

    /* renamed from: OooOo0O */
    public float f33033OooOo0O;

    /* renamed from: OooOo0o */
    public Typeface f33034OooOo0o;

    /* renamed from: OooOoO */
    public Typeface f33035OooOoO;

    /* renamed from: OooOoO0 */
    public Typeface f33036OooOoO0;

    /* renamed from: OooOoOO */
    public Typeface f33037OooOoOO;

    /* renamed from: OooOoo */
    public Typeface f33038OooOoo;

    /* renamed from: OooOoo0 */
    public Typeface f33039OooOoo0;

    /* renamed from: OooOooO */
    public OooO00o f33040OooOooO;

    /* renamed from: OooOooo */
    public OooO00o f33041OooOooo;

    /* renamed from: Oooo */
    public float f33042Oooo;

    /* renamed from: Oooo0 */
    public boolean f33043Oooo0;

    /* renamed from: Oooo00O */
    public CharSequence f33045Oooo00O;

    /* renamed from: Oooo00o */
    public CharSequence f33046Oooo00o;

    /* renamed from: Oooo0OO */
    public Bitmap f33048Oooo0OO;

    /* renamed from: Oooo0o */
    public float f33049Oooo0o;

    /* renamed from: Oooo0o0 */
    public float f33050Oooo0o0;

    /* renamed from: Oooo0oO */
    public float f33051Oooo0oO;

    /* renamed from: Oooo0oo */
    public float f33052Oooo0oo;

    /* renamed from: OoooO */
    public final TextPaint f33053OoooO;

    /* renamed from: OoooO0 */
    public int[] f33054OoooO0;

    /* renamed from: OoooO00 */
    public int f33055OoooO00;

    /* renamed from: OoooO0O */
    public boolean f33056OoooO0O;

    /* renamed from: OoooOO0 */
    public final TextPaint f33057OoooOO0;

    /* renamed from: OoooOOO */
    public BaseInterpolator f33058OoooOOO;

    /* renamed from: OoooOOo */
    public float f33059OoooOOo;

    /* renamed from: OoooOo0 */
    public float f33060OoooOo0;

    /* renamed from: OoooOoO */
    public float f33061OoooOoO;

    /* renamed from: OoooOoo */
    public ColorStateList f33062OoooOoo;

    /* renamed from: Ooooo00 */
    public float f33063Ooooo00;

    /* renamed from: Ooooo0o */
    public float f33064Ooooo0o;

    /* renamed from: OooooO0 */
    public float f33065OooooO0;

    /* renamed from: OooooOO */
    public ColorStateList f33066OooooOO;

    /* renamed from: OooooOo */
    public float f33067OooooOo;

    /* renamed from: Oooooo */
    public float f33068Oooooo;

    /* renamed from: Oooooo0 */
    public float f33069Oooooo0;

    /* renamed from: OoooooO */
    public StaticLayout f33070OoooooO;

    /* renamed from: Ooooooo */
    public float f33071Ooooooo;
    public TimeInterpolator o000oOoO;

    /* renamed from: o00O0O */
    public CharSequence f33072o00O0O;

    /* renamed from: o0OoOo0 */
    public float f33077o0OoOo0;

    /* renamed from: ooOO */
    public float f33078ooOO;

    /* renamed from: OooOO0 */
    public int f33022OooOO0 = 16;

    /* renamed from: OooOO0O */
    public int f33023OooOO0O = 16;
    public float OooOO0o = 15.0f;

    /* renamed from: OooOOO0 */
    public float f33025OooOOO0 = 15.0f;

    /* renamed from: Oooo000 */
    public TextUtils.TruncateAt f33044Oooo000 = TextUtils.TruncateAt.END;

    /* renamed from: Oooo0O0 */
    public boolean f33047Oooo0O0 = true;

    /* renamed from: o00Oo0 */
    public int f33073o00Oo0 = 1;

    /* renamed from: o00Ooo */
    public float f33074o00Ooo = 0.0f;

    /* renamed from: o00o0O */
    public float f33075o00o0O = 1.0f;

    /* renamed from: o00ooo */
    public int f33076o00ooo = 1;

    public OooOO0(ViewGroup viewGroup) {
        this.f33014OooO00o = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f33053OoooO = textPaint;
        this.f33057OoooOO0 = new TextPaint(textPaint);
        this.f33021OooO0oo = new Rect();
        this.f33020OooO0oO = new Rect();
        this.f33013OooO = new RectF();
        float f = this.f33017OooO0Oo;
        this.f33019OooO0o0 = OooO0oO.OooOo.OooO00o(1.0f, f, 0.5f, f);
        OooO0oo(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int OooO00o(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float OooO0oO(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return oo0o0O0.OooO00o(f, f2, f3);
    }

    public final void OooO(boolean z) {
        float fMeasureText;
        float f;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f33014OooO00o;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        OooO0OO(1.0f, z);
        CharSequence charSequence = this.f33046Oooo00o;
        TextPaint textPaint = this.f33053OoooO;
        if (charSequence != null && (staticLayout = this.f33070OoooooO) != null) {
            this.f33072o00O0O = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f33044Oooo000);
        }
        CharSequence charSequence2 = this.f33072o00O0O;
        if (charSequence2 != null) {
            this.f33071Ooooooo = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f33071Ooooooo = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f33023OooOO0O, this.f33043Oooo0 ? 1 : 0);
        int i = absoluteGravity & InterfaceC3173h3.d.b.f8827j;
        Rect rect = this.f33021OooO0oo;
        if (i == 48) {
            this.f33028OooOOo = rect.top;
        } else if (i != 80) {
            this.f33028OooOOo = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f33028OooOOo = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i2 == 1) {
            this.f33032OooOo00 = rect.centerX() - (this.f33071Ooooooo / 2.0f);
        } else if (i2 != 5) {
            this.f33032OooOo00 = rect.left;
        } else {
            this.f33032OooOo00 = rect.right - this.f33071Ooooooo;
        }
        OooO0OO(0.0f, z);
        float height = this.f33070OoooooO != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f33070OoooooO;
        if (staticLayout2 == null || this.f33073o00Oo0 <= 1) {
            CharSequence charSequence3 = this.f33046Oooo00o;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f33070OoooooO;
        this.f33027OooOOOo = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f33022OooOO0, this.f33043Oooo0 ? 1 : 0);
        int i3 = absoluteGravity2 & InterfaceC3173h3.d.b.f8827j;
        Rect rect2 = this.f33020OooO0oO;
        if (i3 == 48) {
            this.f33029OooOOo0 = rect2.top;
        } else if (i3 != 80) {
            this.f33029OooOOo0 = rect2.centerY() - (height / 2.0f);
        } else {
            this.f33029OooOOo0 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i4 == 1) {
            this.f33030OooOOoo = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.f33030OooOOoo = rect2.left;
        } else {
            this.f33030OooOOoo = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f33048Oooo0OO;
        if (bitmap != null) {
            bitmap.recycle();
            this.f33048Oooo0OO = null;
        }
        OooOOo0(this.f33015OooO0O0);
        float f2 = this.f33015OooO0O0;
        boolean z2 = this.f33016OooO0OO;
        RectF rectF = this.f33013OooO;
        if (z2) {
            if (f2 < this.f33019OooO0o0) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = OooO0oO(rect2.left, rect.left, f2, this.o000oOoO);
            rectF.top = OooO0oO(this.f33029OooOOo0, this.f33028OooOOo, f2, this.o000oOoO);
            rectF.right = OooO0oO(rect2.right, rect.right, f2, this.o000oOoO);
            rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, f2, this.o000oOoO);
        }
        if (!this.f33016OooO0OO) {
            this.OooOo0 = OooO0oO(this.f33030OooOOoo, this.f33032OooOo00, f2, this.o000oOoO);
            this.f33033OooOo0O = OooO0oO(this.f33029OooOOo0, this.f33028OooOOo, f2, this.o000oOoO);
            OooOOo0(f2);
            f = f2;
        } else if (f2 < this.f33019OooO0o0) {
            this.OooOo0 = this.f33030OooOOoo;
            this.f33033OooOo0O = this.f33029OooOOo0;
            OooOOo0(0.0f);
            f = 0.0f;
        } else {
            this.OooOo0 = this.f33032OooOo00;
            this.f33033OooOo0O = this.f33028OooOOo - Math.max(0, this.f33018OooO0o);
            OooOOo0(1.0f);
            f = 1.0f;
        }
        FastOutSlowInInterpolator fastOutSlowInInterpolator = oo0o0O0.f15016OooO0O0;
        this.f33077o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - f2, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(viewGroup);
        this.f33078ooOO = OooO0oO(1.0f, 0.0f, f2, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(viewGroup);
        ColorStateList colorStateList = this.f33026OooOOOO;
        ColorStateList colorStateList2 = this.f33024OooOOO;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(OooO00o(OooO0o(colorStateList2), OooO0o(this.f33026OooOOOO), f));
        } else {
            textPaint.setColor(OooO0o(colorStateList));
        }
        float f3 = this.f33067OooooOo;
        float f4 = this.f33069Oooooo0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(OooO0oO(f4, f3, f2, fastOutSlowInInterpolator));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.f33051Oooo0oO = oo0o0O0.OooO00o(this.f33063Ooooo00, this.f33059OoooOOo, f2);
        this.f33052Oooo0oo = oo0o0O0.OooO00o(this.f33064Ooooo0o, this.f33060OoooOo0, f2);
        this.f33042Oooo = oo0o0O0.OooO00o(this.f33065OooooO0, this.f33061OoooOoO, f2);
        int iOooO00o = OooO00o(OooO0o(this.f33066OooooOO), OooO0o(this.f33062OoooOoo), f2);
        this.f33055OoooO00 = iOooO00o;
        textPaint.setShadowLayer(this.f33051Oooo0oO, this.f33052Oooo0oo, this.f33042Oooo, iOooO00o);
        if (this.f33016OooO0OO) {
            int alpha = textPaint.getAlpha();
            float f5 = this.f33019OooO0o0;
            textPaint.setAlpha((int) ((f2 <= f5 ? oo0o0O0.OooO0O0(1.0f, 0.0f, this.f33017OooO0Oo, f5, f2) : oo0o0O0.OooO0O0(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
        }
        ViewCompat.postInvalidateOnAnimation(viewGroup);
    }

    public final boolean OooO0O0(CharSequence charSequence) {
        boolean z = ViewCompat.getLayoutDirection(this.f33014OooO00o) == 1;
        if (this.f33047Oooo0O0) {
            return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
        }
        return z;
    }

    public final void OooO0OO(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.f33045Oooo00O == null) {
            return;
        }
        float fWidth = this.f33021OooO0oo.width();
        float fWidth2 = this.f33020OooO0oO.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.f33025OooOOO0;
            f3 = this.f33067OooooOo;
            this.f33050Oooo0o0 = 1.0f;
            typeface = this.f33034OooOo0o;
        } else {
            float f4 = this.OooOO0o;
            float f5 = this.f33069Oooooo0;
            Typeface typeface2 = this.f33035OooOoO;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.f33050Oooo0o0 = 1.0f;
            } else {
                this.f33050Oooo0o0 = OooO0oO(this.OooOO0o, this.f33025OooOOO0, f, this.f33058OoooOOO) / this.OooOO0o;
            }
            float f6 = this.f33025OooOOO0 / this.OooOO0o;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f33053OoooO;
        if (fWidth > 0.0f) {
            boolean z3 = this.f33049Oooo0o != f2;
            boolean z4 = this.f33068Oooooo != f3;
            boolean z5 = this.f33038OooOoo != typeface;
            StaticLayout staticLayout = this.f33070OoooooO;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.f33056OoooO0O;
            this.f33049Oooo0o = f2;
            this.f33068Oooooo = f3;
            this.f33038OooOoo = typeface;
            this.f33056OoooO0O = false;
            textPaint.setLinearText(this.f33050Oooo0o0 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.f33046Oooo00o == null || z2) {
            textPaint.setTextSize(this.f33049Oooo0o);
            textPaint.setTypeface(this.f33038OooOoo);
            textPaint.setLetterSpacing(this.f33068Oooooo);
            boolean zOooO0O0 = OooO0O0(this.f33045Oooo00O);
            this.f33043Oooo0 = zOooO0O0;
            int i = this.f33073o00Oo0;
            if (i <= 1 || (zOooO0O0 && !this.f33016OooO0OO)) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f33022OooOO0, zOooO0O0 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f33043Oooo0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f33043Oooo0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            oo0o0Oo oo0o0oo = new oo0o0Oo(this.f33045Oooo00O, textPaint, (int) fWidth);
            oo0o0oo.OooOO0o = this.f33044Oooo000;
            oo0o0oo.f33152OooOO0O = zOooO0O0;
            oo0o0oo.f33148OooO0o0 = alignment;
            oo0o0oo.f33151OooOO0 = false;
            oo0o0oo.f33147OooO0o = i;
            float f7 = this.f33074o00Ooo;
            float f8 = this.f33075o00o0O;
            oo0o0oo.f33149OooO0oO = f7;
            oo0o0oo.f33150OooO0oo = f8;
            oo0o0oo.f33142OooO = this.f33076o00ooo;
            StaticLayout staticLayout2 = (StaticLayout) Preconditions.checkNotNull(oo0o0oo.OooO00o());
            this.f33070OoooooO = staticLayout2;
            this.f33046Oooo00o = staticLayout2.getText();
        }
    }

    public final void OooO0Oo(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f33046Oooo00o != null) {
            RectF rectF = this.f33013OooO;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.f33053OoooO;
            textPaint.setTextSize(this.f33049Oooo0o);
            float f = this.OooOo0;
            float f2 = this.f33033OooOo0O;
            float f3 = this.f33050Oooo0o0;
            if (f3 != 1.0f && !this.f33016OooO0OO) {
                canvas.scale(f3, f3, f, f2);
            }
            if (this.f33073o00Oo0 <= 1 || ((this.f33043Oooo0 && !this.f33016OooO0OO) || (this.f33016OooO0OO && this.f33015OooO0O0 <= this.f33019OooO0o0))) {
                canvas.translate(f, f2);
                this.f33070OoooooO.draw(canvas);
            } else {
                float lineStart = this.OooOo0 - this.f33070OoooooO.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                float f4 = alpha;
                textPaint.setAlpha((int) (this.f33078ooOO * f4));
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f33051Oooo0oO, this.f33052Oooo0oo, this.f33042Oooo, OooO00o.OooO00o.OooO0O0(this.f33055OoooO00, textPaint.getAlpha()));
                }
                this.f33070OoooooO.draw(canvas);
                textPaint.setAlpha((int) (this.f33077o0OoOo0 * f4));
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f33051Oooo0oO, this.f33052Oooo0oo, this.f33042Oooo, OooO00o.OooO00o.OooO0O0(this.f33055OoooO00, textPaint.getAlpha()));
                }
                int lineBaseline = this.f33070OoooooO.getLineBaseline(0);
                CharSequence charSequence = this.f33072o00O0O;
                float f5 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f33051Oooo0oO, this.f33052Oooo0oo, this.f33042Oooo, this.f33055OoooO00);
                }
                if (!this.f33016OooO0OO) {
                    String strTrim = this.f33072o00O0O.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f33070OoooooO.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                }
                canvas = canvas;
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final int OooO0o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f33054OoooO0;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float OooO0o0() {
        TextPaint textPaint = this.f33057OoooOO0;
        textPaint.setTextSize(this.f33025OooOOO0);
        textPaint.setTypeface(this.f33034OooOo0o);
        textPaint.setLetterSpacing(this.f33067OooooOo);
        return -textPaint.ascent();
    }

    public final void OooO0oo(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f33036OooOoO0;
            if (typeface != null) {
                this.f33031OooOo = oo0o0Oo.OooOOO0.OooO00o(configuration, typeface);
            }
            Typeface typeface2 = this.f33039OooOoo0;
            if (typeface2 != null) {
                this.f33037OooOoOO = oo0o0Oo.OooOOO0.OooO00o(configuration, typeface2);
            }
            Typeface typeface3 = this.f33031OooOo;
            if (typeface3 == null) {
                typeface3 = this.f33036OooOoO0;
            }
            this.f33034OooOo0o = typeface3;
            Typeface typeface4 = this.f33037OooOoOO;
            if (typeface4 == null) {
                typeface4 = this.f33039OooOoo0;
            }
            this.f33035OooOoO = typeface4;
            OooO(true);
        }
    }

    public final void OooOO0(int i) {
        ViewGroup viewGroup = this.f33014OooO00o;
        oo0o0Oo.OooOO0 oooOO0 = new oo0o0Oo.OooOO0(viewGroup.getContext(), i);
        ColorStateList colorStateList = oooOO0.f33224OooOO0;
        if (colorStateList != null) {
            this.f33026OooOOOO = colorStateList;
        }
        float f = oooOO0.f33225OooOO0O;
        if (f != 0.0f) {
            this.f33025OooOOO0 = f;
        }
        ColorStateList colorStateList2 = oooOO0.f33216OooO00o;
        if (colorStateList2 != null) {
            this.f33062OoooOoo = colorStateList2;
        }
        this.f33060OoooOo0 = oooOO0.f33221OooO0o0;
        this.f33061OoooOoO = oooOO0.f33220OooO0o;
        this.f33059OoooOOo = oooOO0.f33222OooO0oO;
        this.f33067OooooOo = oooOO0.f33215OooO;
        OooO00o oooO00o = this.f33041OooOooo;
        if (oooO00o != null) {
            oooO00o.f33212OooO0OO = true;
        }
        OooO oooO = new OooO(this, 0);
        oooOO0.OooO00o();
        this.f33041OooOooo = new OooO00o(oooO, oooOO0.f33226OooOOO);
        oooOO0.OooO0OO(viewGroup.getContext(), this.f33041OooOooo);
        OooO(false);
    }

    public final void OooOO0O(ColorStateList colorStateList) {
        if (this.f33026OooOOOO != colorStateList) {
            this.f33026OooOOOO = colorStateList;
            OooO(false);
        }
    }

    public final void OooOO0o(int i) {
        if (this.f33023OooOO0O != i) {
            this.f33023OooOO0O = i;
            OooO(false);
        }
    }

    public final void OooOOO(int i) {
        ViewGroup viewGroup = this.f33014OooO00o;
        oo0o0Oo.OooOO0 oooOO0 = new oo0o0Oo.OooOO0(viewGroup.getContext(), i);
        ColorStateList colorStateList = oooOO0.f33224OooOO0;
        if (colorStateList != null) {
            this.f33024OooOOO = colorStateList;
        }
        float f = oooOO0.f33225OooOO0O;
        if (f != 0.0f) {
            this.OooOO0o = f;
        }
        ColorStateList colorStateList2 = oooOO0.f33216OooO00o;
        if (colorStateList2 != null) {
            this.f33066OooooOO = colorStateList2;
        }
        this.f33064Ooooo0o = oooOO0.f33221OooO0o0;
        this.f33065OooooO0 = oooOO0.f33220OooO0o;
        this.f33063Ooooo00 = oooOO0.f33222OooO0oO;
        this.f33069Oooooo0 = oooOO0.f33215OooO;
        OooO00o oooO00o = this.f33040OooOooO;
        if (oooO00o != null) {
            oooO00o.f33212OooO0OO = true;
        }
        OooO oooO = new OooO(this, 1);
        oooOO0.OooO00o();
        this.f33040OooOooO = new OooO00o(oooO, oooOO0.f33226OooOOO);
        oooOO0.OooO0OO(viewGroup.getContext(), this.f33040OooOooO);
        OooO(false);
    }

    public final boolean OooOOO0(Typeface typeface) {
        OooO00o oooO00o = this.f33041OooOooo;
        if (oooO00o != null) {
            oooO00o.f33212OooO0OO = true;
        }
        if (this.f33036OooOoO0 == typeface) {
            return false;
        }
        this.f33036OooOoO0 = typeface;
        Typeface typefaceOooO00o = oo0o0Oo.OooOOO0.OooO00o(this.f33014OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f33031OooOo = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f33036OooOoO0;
        }
        this.f33034OooOo0o = typefaceOooO00o;
        return true;
    }

    public final boolean OooOOOO(Typeface typeface) {
        OooO00o oooO00o = this.f33040OooOooO;
        if (oooO00o != null) {
            oooO00o.f33212OooO0OO = true;
        }
        if (this.f33039OooOoo0 == typeface) {
            return false;
        }
        this.f33039OooOoo0 = typeface;
        Typeface typefaceOooO00o = oo0o0Oo.OooOOO0.OooO00o(this.f33014OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.f33037OooOoOO = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.f33039OooOoo0;
        }
        this.f33035OooOoO = typefaceOooO00o;
        return true;
    }

    public final void OooOOOo(float f) {
        float f2;
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (fClamp != this.f33015OooO0O0) {
            this.f33015OooO0O0 = fClamp;
            boolean z = this.f33016OooO0OO;
            RectF rectF = this.f33013OooO;
            Rect rect = this.f33021OooO0oo;
            Rect rect2 = this.f33020OooO0oO;
            if (z) {
                if (fClamp < this.f33019OooO0o0) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = OooO0oO(rect2.left, rect.left, fClamp, this.o000oOoO);
                rectF.top = OooO0oO(this.f33029OooOOo0, this.f33028OooOOo, fClamp, this.o000oOoO);
                rectF.right = OooO0oO(rect2.right, rect.right, fClamp, this.o000oOoO);
                rectF.bottom = OooO0oO(rect2.bottom, rect.bottom, fClamp, this.o000oOoO);
            }
            if (!this.f33016OooO0OO) {
                this.OooOo0 = OooO0oO(this.f33030OooOOoo, this.f33032OooOo00, fClamp, this.o000oOoO);
                this.f33033OooOo0O = OooO0oO(this.f33029OooOOo0, this.f33028OooOOo, fClamp, this.o000oOoO);
                OooOOo0(fClamp);
                f2 = fClamp;
            } else if (fClamp < this.f33019OooO0o0) {
                this.OooOo0 = this.f33030OooOOoo;
                this.f33033OooOo0O = this.f33029OooOOo0;
                OooOOo0(0.0f);
                f2 = 0.0f;
            } else {
                this.OooOo0 = this.f33032OooOo00;
                this.f33033OooOo0O = this.f33028OooOOo - Math.max(0, this.f33018OooO0o);
                OooOOo0(1.0f);
                f2 = 1.0f;
            }
            FastOutSlowInInterpolator fastOutSlowInInterpolator = oo0o0O0.f15016OooO0O0;
            this.f33077o0OoOo0 = 1.0f - OooO0oO(0.0f, 1.0f, 1.0f - fClamp, fastOutSlowInInterpolator);
            ViewGroup viewGroup = this.f33014OooO00o;
            ViewCompat.postInvalidateOnAnimation(viewGroup);
            this.f33078ooOO = OooO0oO(1.0f, 0.0f, fClamp, fastOutSlowInInterpolator);
            ViewCompat.postInvalidateOnAnimation(viewGroup);
            ColorStateList colorStateList = this.f33026OooOOOO;
            ColorStateList colorStateList2 = this.f33024OooOOO;
            TextPaint textPaint = this.f33053OoooO;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(OooO00o(OooO0o(colorStateList2), OooO0o(this.f33026OooOOOO), f2));
            } else {
                textPaint.setColor(OooO0o(colorStateList));
            }
            float f3 = this.f33067OooooOo;
            float f4 = this.f33069Oooooo0;
            if (f3 != f4) {
                textPaint.setLetterSpacing(OooO0oO(f4, f3, fClamp, fastOutSlowInInterpolator));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.f33051Oooo0oO = oo0o0O0.OooO00o(this.f33063Ooooo00, this.f33059OoooOOo, fClamp);
            this.f33052Oooo0oo = oo0o0O0.OooO00o(this.f33064Ooooo0o, this.f33060OoooOo0, fClamp);
            this.f33042Oooo = oo0o0O0.OooO00o(this.f33065OooooO0, this.f33061OoooOoO, fClamp);
            int iOooO00o = OooO00o(OooO0o(this.f33066OooooOO), OooO0o(this.f33062OoooOoo), fClamp);
            this.f33055OoooO00 = iOooO00o;
            textPaint.setShadowLayer(this.f33051Oooo0oO, this.f33052Oooo0oo, this.f33042Oooo, iOooO00o);
            if (this.f33016OooO0OO) {
                int alpha = textPaint.getAlpha();
                float f5 = this.f33019OooO0o0;
                textPaint.setAlpha((int) ((fClamp <= f5 ? oo0o0O0.OooO0O0(1.0f, 0.0f, this.f33017OooO0Oo, f5, fClamp) : oo0o0O0.OooO0O0(0.0f, 1.0f, f5, 1.0f, fClamp)) * alpha));
            }
            ViewCompat.postInvalidateOnAnimation(viewGroup);
        }
    }

    public final void OooOOo0(float f) {
        OooO0OO(f, false);
        ViewCompat.postInvalidateOnAnimation(this.f33014OooO00o);
    }
}
