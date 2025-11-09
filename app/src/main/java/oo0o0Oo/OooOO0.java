package oo0o0Oo;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final float f33215OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ColorStateList f33216OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f33217OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f33218OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33219OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final float f33220OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f33221OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final float f33222OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f33223OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public ColorStateList f33224OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public float f33225OooOO0O;
    public final int OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public Typeface f33226OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33227OooOOO0 = false;

    public OooOO0(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, OooOo.f14999OoooOoo);
        this.f33225OooOO0O = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f33224OooOO0 = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 3);
        OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 4);
        OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 5);
        this.f33218OooO0OO = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f33219OooO0Oo = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.OooOO0o = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f33217OooO0O0 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f33216OooO00o = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, 6);
        this.f33221OooO0o0 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f33220OooO0o = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f33222OooO0oO = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, OooOo.f14980Oooo0);
        this.f33223OooO0oo = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f33215OooO = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        Typeface typeface = this.f33226OooOOO;
        int i = this.f33218OooO0OO;
        if (typeface == null && (str = this.f33217OooO0O0) != null) {
            this.f33226OooOOO = Typeface.create(str, i);
        }
        if (this.f33226OooOOO == null) {
            int i2 = this.f33219OooO0Oo;
            if (i2 == 1) {
                this.f33226OooOOO = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f33226OooOOO = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f33226OooOOO = Typeface.DEFAULT;
            } else {
                this.f33226OooOOO = Typeface.MONOSPACE;
            }
            this.f33226OooOOO = Typeface.create(this.f33226OooOOO, i);
        }
    }

    public final Typeface OooO0O0(Context context) {
        if (this.f33227OooOOO0) {
            return this.f33226OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.OooOO0o);
                this.f33226OooOOO = font;
                if (font != null) {
                    this.f33226OooOOO = Typeface.create(font, this.f33218OooO0OO);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f33217OooO0O0, e);
            }
        }
        OooO00o();
        this.f33227OooOOO0 = true;
        return this.f33226OooOOO;
    }

    public final void OooO0OO(Context context, OooOO0O oooOO0O) {
        int i = this.OooOO0o;
        if ((i != 0 ? ResourcesCompat.getCachedFont(context, i) : null) != null) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        if (i == 0) {
            this.f33227OooOOO0 = true;
        }
        if (this.f33227OooOOO0) {
            oooOO0O.OooO0O0(this.f33226OooOOO, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new OooO0o(this, oooOO0O), null);
        } catch (Resources.NotFoundException unused) {
            this.f33227OooOOO0 = true;
            oooOO0O.OooO00o(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f33217OooO0O0, e);
            this.f33227OooOOO0 = true;
            oooOO0O.OooO00o(-3);
        }
    }

    public final void OooO0Oo(Context context, TextPaint textPaint, OooOO0O oooOO0O) {
        OooO0o0(context, textPaint, oooOO0O);
        ColorStateList colorStateList = this.f33224OooOO0;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        ColorStateList colorStateList2 = this.f33216OooO00o;
        textPaint.setShadowLayer(this.f33222OooO0oO, this.f33221OooO0o0, this.f33220OooO0o, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void OooO0o(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceOooO00o = OooOOO0.OooO00o(context.getResources().getConfiguration(), typeface);
        if (typefaceOooO00o != null) {
            typeface = typefaceOooO00o;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f33218OooO0OO;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f33225OooOO0O);
        if (this.f33223OooO0oo) {
            textPaint.setLetterSpacing(this.f33215OooO);
        }
    }

    public final void OooO0o0(Context context, TextPaint textPaint, OooOO0O oooOO0O) {
        int i = this.OooOO0o;
        if ((i != 0 ? ResourcesCompat.getCachedFont(context, i) : null) != null) {
            OooO0o(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0o(context, textPaint, this.f33226OooOOO);
        OooO0OO(context, new OooO(this, context, textPaint, oooOO0O));
    }
}
