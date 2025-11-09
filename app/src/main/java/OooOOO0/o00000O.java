package OooooO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o000000.OooOOO0;
import o000000.OooOo;
import o0ooOO0.o000000;
import o0ooOO0.o00000O0;
import o0ooOO0.o000OOo;
import oo0o0Oo.OooOO0;

/* loaded from: classes2.dex */
public final class o00000O extends Drawable implements o000OOo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o000000 f15021OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final WeakReference f15022OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOO0 f15023OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o0000Ooo f15024OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Rect f15025OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public float f15026OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f15027OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public float f15028OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public float f15029OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public float f15030OooOooo;

    /* renamed from: Oooo000, reason: collision with root package name */
    public float f15031Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public WeakReference f15032Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public WeakReference f15033Oooo00o;

    public o00000O(Context context, o00000OO o00000oo2) throws Resources.NotFoundException {
        OooOO0 oooOO0;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.f15022OooOo0O = weakReference;
        o00000O0.OooO0OO(context, "Theme.MaterialComponents", o00000O0.f33096OooO0O0);
        this.f15025OooOoO0 = new Rect();
        OooOOO0 oooOOO0 = new OooOOO0();
        this.f15023OooOo0o = oooOOO0;
        o000000 o000000Var = new o000000(this);
        this.f15021OooOo = o000000Var;
        TextPaint textPaint = o000000Var.f33088OooO00o;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = (Context) weakReference.get();
        if (context3 != null && o000000Var.f33092OooO0o != (oooOO0 = new OooOO0(context3, R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = (Context) weakReference.get()) != null) {
            o000000Var.OooO0O0(oooOO0, context2);
            OooO0oO();
        }
        o0000Ooo o0000ooo = new o0000Ooo(context, o00000oo2);
        this.f15024OooOoO = o0000ooo;
        o00000OO o00000oo3 = o0000ooo.f15035OooO0O0;
        this.f15027OooOoo = ((int) Math.pow(10.0d, o00000oo3.maxCharacterCount - 1.0d)) - 1;
        o000000Var.f33091OooO0Oo = true;
        OooO0oO();
        invalidateSelf();
        o000000Var.f33091OooO0Oo = true;
        OooO0oO();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(o00000oo3.backgroundColor.intValue());
        if (oooOOO0.f29048OooOo0O.f29030OooO0OO != colorStateListValueOf) {
            oooOOO0.OooOOO0(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(o00000oo3.badgeTextColor.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f15032Oooo00O;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f15032Oooo00O.get();
            WeakReference weakReference3 = this.f15033Oooo00o;
            OooO0o(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        OooO0oO();
        setVisible(o00000oo3.isVisible.booleanValue(), false);
    }

    @Override // o0ooOO0.o000OOo
    public final void OooO00o() {
        invalidateSelf();
    }

    public final String OooO0O0() {
        int iOooO0Oo = OooO0Oo();
        int i = this.f15027OooOoo;
        o0000Ooo o0000ooo = this.f15024OooOoO;
        if (iOooO0Oo <= i) {
            return NumberFormat.getInstance(o0000ooo.f15035OooO0O0.numberLocale).format(OooO0Oo());
        }
        Context context = (Context) this.f15022OooOo0O.get();
        return context == null ? "" : String.format(o0000ooo.f15035OooO0O0.numberLocale, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f15027OooOoo), "+");
    }

    public final CharSequence OooO0OO() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zOooO0o0 = OooO0o0();
        o0000Ooo o0000ooo = this.f15024OooOoO;
        if (!zOooO0o0) {
            return o0000ooo.f15035OooO0O0.contentDescriptionNumberless;
        }
        if (o0000ooo.f15035OooO0O0.contentDescriptionQuantityStrings == 0 || (context = (Context) this.f15022OooOo0O.get()) == null) {
            return null;
        }
        int iOooO0Oo = OooO0Oo();
        int i = this.f15027OooOoo;
        o00000OO o00000oo2 = o0000ooo.f15035OooO0O0;
        return iOooO0Oo <= i ? context.getResources().getQuantityString(o00000oo2.contentDescriptionQuantityStrings, OooO0Oo(), Integer.valueOf(OooO0Oo())) : context.getString(o00000oo2.contentDescriptionExceedsMaxBadgeNumberRes, Integer.valueOf(this.f15027OooOoo));
    }

    public final int OooO0Oo() {
        if (OooO0o0()) {
            return this.f15024OooOoO.f15035OooO0O0.number;
        }
        return 0;
    }

    public final void OooO0o(View view, FrameLayout frameLayout) throws Resources.NotFoundException {
        this.f15032Oooo00O = new WeakReference(view);
        this.f15033Oooo00o = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        OooO0oO();
        invalidateSelf();
    }

    public final boolean OooO0o0() {
        return this.f15024OooOoO.f15035OooO0O0.number != -1;
    }

    public final void OooO0oO() throws Resources.NotFoundException {
        Context context = (Context) this.f15022OooOo0O.get();
        WeakReference weakReference = this.f15032Oooo00O;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f15025OooOoO0;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference2 = this.f15033Oooo00o;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zOooO0o0 = OooO0o0();
        o0000Ooo o0000ooo = this.f15024OooOoO;
        int iIntValue = o0000ooo.f15035OooO0O0.additionalVerticalOffset.intValue() + (zOooO0o0 ? o0000ooo.f15035OooO0O0.verticalOffsetWithText.intValue() : o0000ooo.f15035OooO0O0.verticalOffsetWithoutText.intValue());
        o00000OO o00000oo2 = o0000ooo.f15035OooO0O0;
        int iIntValue2 = o00000oo2.badgeGravity.intValue();
        if (iIntValue2 == 8388691 || iIntValue2 == 8388693) {
            this.f15028OooOoo0 = rect3.bottom - iIntValue;
        } else {
            this.f15028OooOoo0 = rect3.top + iIntValue;
        }
        int iOooO0Oo = OooO0Oo();
        float f = o0000ooo.f15037OooO0Oo;
        if (iOooO0Oo <= 9) {
            if (!OooO0o0()) {
                f = o0000ooo.f15036OooO0OO;
            }
            this.f15029OooOooO = f;
            this.f15031Oooo000 = f;
            this.f15030OooOooo = f;
        } else {
            this.f15029OooOooO = f;
            this.f15031Oooo000 = f;
            this.f15030OooOooo = (this.f15021OooOo.OooO00o(OooO0O0()) / 2.0f) + o0000ooo.f15038OooO0o0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(OooO0o0() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int iIntValue3 = o00000oo2.additionalHorizontalOffset.intValue() + (OooO0o0() ? o00000oo2.horizontalOffsetWithText.intValue() : o00000oo2.horizontalOffsetWithoutText.intValue());
        int iIntValue4 = o00000oo2.badgeGravity.intValue();
        if (iIntValue4 == 8388659 || iIntValue4 == 8388691) {
            this.f15026OooOoOO = ViewCompat.getLayoutDirection(view) == 0 ? (rect3.left - this.f15030OooOooo) + dimensionPixelSize + iIntValue3 : ((rect3.right + this.f15030OooOooo) - dimensionPixelSize) - iIntValue3;
        } else {
            this.f15026OooOoOO = ViewCompat.getLayoutDirection(view) == 0 ? ((rect3.right + this.f15030OooOooo) - dimensionPixelSize) - iIntValue3 : (rect3.left - this.f15030OooOooo) + dimensionPixelSize + iIntValue3;
        }
        float f2 = this.f15026OooOoOO;
        float f3 = this.f15028OooOoo0;
        float f4 = this.f15030OooOooo;
        float f5 = this.f15031Oooo000;
        rect2.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
        float f6 = this.f15029OooOooO;
        OooOOO0 oooOOO0 = this.f15023OooOo0o;
        OooOo oooOoOooO0o = oooOOO0.f29048OooOo0O.f29028OooO00o.OooO0o();
        oooOoOooO0o.OooO0OO(f6);
        oooOOO0.setShapeAppearanceModel(oooOoOooO0o.OooO00o());
        if (rect.equals(rect2)) {
            return;
        }
        oooOOO0.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f15023OooOo0o.draw(canvas);
        if (OooO0o0()) {
            Rect rect = new Rect();
            String strOooO0O0 = OooO0O0();
            o000000 o000000Var = this.f15021OooOo;
            o000000Var.f33088OooO00o.getTextBounds(strOooO0O0, 0, strOooO0O0.length(), rect);
            canvas.drawText(strOooO0O0, this.f15026OooOoOO, this.f15028OooOoo0 + (rect.height() / 2), o000000Var.f33088OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15024OooOoO.f15035OooO0O0.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15025OooOoO0.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15025OooOoO0.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, o0ooOO0.o000OOo
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        o0000Ooo o0000ooo = this.f15024OooOoO;
        o0000ooo.f15034OooO00o.alpha = i;
        o0000ooo.f15035OooO0O0.alpha = i;
        this.f15021OooOo.f33088OooO00o.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
