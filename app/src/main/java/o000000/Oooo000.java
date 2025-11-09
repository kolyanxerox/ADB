package o000000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooOOO0 */
    public static final OooOOOO f29082OooOOO0 = new OooOOOO(0.5f);

    /* renamed from: OooO00o */
    public OooO00o.OooO00o f29084OooO00o = new OooOo00();

    /* renamed from: OooO0O0 */
    public OooO00o.OooO00o f29085OooO0O0 = new OooOo00();

    /* renamed from: OooO0OO */
    public OooO00o.OooO00o f29086OooO0OO = new OooOo00();

    /* renamed from: OooO0Oo */
    public OooO00o.OooO00o f29087OooO0Oo = new OooOo00();

    /* renamed from: OooO0o0 */
    public OooO0OO f29089OooO0o0 = new OooO00o(0.0f);

    /* renamed from: OooO0o */
    public OooO0OO f29088OooO0o = new OooO00o(0.0f);

    /* renamed from: OooO0oO */
    public OooO0OO f29090OooO0oO = new OooO00o(0.0f);

    /* renamed from: OooO0oo */
    public OooO0OO f29091OooO0oo = new OooO00o(0.0f);

    /* renamed from: OooO */
    public OooO f29083OooO = new OooO(0);

    /* renamed from: OooOO0 */
    public OooO f29092OooOO0 = new OooO(0);

    /* renamed from: OooOO0O */
    public OooO f29093OooOO0O = new OooO(0);
    public OooO OooOO0o = new OooO(0);

    public static OooOo OooO00o(Context context, int i, int i2, OooO0OO oooO0OO) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(Ooooo00.OooOo.f14990OoooO);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            OooO0OO OooO0Oo2 = OooO0Oo(typedArrayObtainStyledAttributes, 5, oooO0OO);
            OooO0OO OooO0Oo3 = OooO0Oo(typedArrayObtainStyledAttributes, 8, OooO0Oo2);
            OooO0OO OooO0Oo4 = OooO0Oo(typedArrayObtainStyledAttributes, 9, OooO0Oo2);
            OooO0OO OooO0Oo5 = OooO0Oo(typedArrayObtainStyledAttributes, 7, OooO0Oo2);
            OooO0OO OooO0Oo6 = OooO0Oo(typedArrayObtainStyledAttributes, 6, OooO0Oo2);
            OooOo oooOo = new OooOo();
            OooO00o.OooO00o oooO00oOooO0o = Oooo0o0.OooO.OooO0o(i4);
            oooOo.f29071OooO00o = oooO00oOooO0o;
            OooOo.OooO0O0(oooO00oOooO0o);
            oooOo.f29076OooO0o0 = OooO0Oo3;
            OooO00o.OooO00o oooO00oOooO0o2 = Oooo0o0.OooO.OooO0o(i5);
            oooOo.f29072OooO0O0 = oooO00oOooO0o2;
            OooOo.OooO0O0(oooO00oOooO0o2);
            oooOo.f29075OooO0o = OooO0Oo4;
            OooO00o.OooO00o oooO00oOooO0o3 = Oooo0o0.OooO.OooO0o(i6);
            oooOo.f29073OooO0OO = oooO00oOooO0o3;
            OooOo.OooO0O0(oooO00oOooO0o3);
            oooOo.f29077OooO0oO = OooO0Oo5;
            OooO00o.OooO00o oooO00oOooO0o4 = Oooo0o0.OooO.OooO0o(i7);
            oooOo.f29074OooO0Oo = oooO00oOooO0o4;
            OooOo.OooO0O0(oooO00oOooO0o4);
            oooOo.f29078OooO0oo = OooO0Oo6;
            return oooOo;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static OooOo OooO0O0(Context context, AttributeSet attributeSet, int i, int i2) {
        return OooO0OO(context, attributeSet, i, i2, new OooO00o(0));
    }

    public static OooOo OooO0OO(Context context, AttributeSet attributeSet, int i, int i2, OooO0OO oooO0OO) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ooooo00.OooOo.f14982Oooo00O, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return OooO00o(context, resourceId, resourceId2, oooO0OO);
    }

    public static OooO0OO OooO0Oo(TypedArray typedArray, int i, OooO0OO oooO0OO) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new OooO00o(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new OooOOOO(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return oooO0OO;
    }

    public final OooOo OooO0o() {
        OooOo oooOo = new OooOo();
        oooOo.f29071OooO00o = this.f29084OooO00o;
        oooOo.f29072OooO0O0 = this.f29085OooO0O0;
        oooOo.f29073OooO0OO = this.f29086OooO0OO;
        oooOo.f29074OooO0Oo = this.f29087OooO0Oo;
        oooOo.f29076OooO0o0 = this.f29089OooO0o0;
        oooOo.f29075OooO0o = this.f29088OooO0o;
        oooOo.f29077OooO0oO = this.f29090OooO0oO;
        oooOo.f29078OooO0oo = this.f29091OooO0oo;
        oooOo.f29070OooO = this.f29083OooO;
        oooOo.f29079OooOO0 = this.f29092OooOO0;
        oooOo.f29080OooOO0O = this.f29093OooOO0O;
        oooOo.OooOO0o = this.OooOO0o;
        return oooOo;
    }

    public final boolean OooO0o0(RectF rectF) {
        boolean z = this.OooOO0o.getClass().equals(OooO.class) && this.f29092OooOO0.getClass().equals(OooO.class) && this.f29083OooO.getClass().equals(OooO.class) && this.f29093OooOO0O.getClass().equals(OooO.class);
        float fOooO00o = this.f29089OooO0o0.OooO00o(rectF);
        return z && ((this.f29088OooO0o.OooO00o(rectF) > fOooO00o ? 1 : (this.f29088OooO0o.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f29091OooO0oo.OooO00o(rectF) > fOooO00o ? 1 : (this.f29091OooO0oo.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f29090OooO0oO.OooO00o(rectF) > fOooO00o ? 1 : (this.f29090OooO0oO.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0) && ((this.f29085OooO0O0 instanceof OooOo00) && (this.f29084OooO00o instanceof OooOo00) && (this.f29086OooO0OO instanceof OooOo00) && (this.f29087OooO0Oo instanceof OooOo00));
    }
}
