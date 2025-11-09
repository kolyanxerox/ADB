package o0OO00O;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.github.superadb.R;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o */
    public int f32844OooO00o;

    /* renamed from: OooO0O0 */
    public int f32845OooO0O0;

    /* renamed from: OooO0OO */
    public int[] f32846OooO0OO;

    /* renamed from: OooO0Oo */
    public int f32847OooO0Oo;

    /* renamed from: OooO0o */
    public int f32848OooO0o;

    /* renamed from: OooO0o0 */
    public int f32849OooO0o0;

    public OooOO0(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        this.f32846OooO0OO = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = Ooooo00.OooOo.f14954OooO0Oo;
        o00000O0.OooO00o(context, attributeSet, i, i2);
        o00000O0.OooO0O0(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.f32844OooO00o = oo0o0Oo.OooO0OO.OooO0OO(context, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        this.f32845OooO0O0 = Math.min(oo0o0Oo.OooO0OO.OooO0OO(context, typedArrayObtainStyledAttributes, 7, 0), this.f32844OooO00o / 2);
        this.f32849OooO0o0 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f32848OooO0o = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f32846OooO0OO = new int[]{OooO00o.OooO00o.OooOO0O(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            this.f32846OooO0OO = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            this.f32846OooO0OO = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f32847OooO0Oo = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            this.f32847OooO0Oo = this.f32846OooO0OO[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f32847OooO0Oo = OooO00o.OooO00o.OooO0O0(this.f32847OooO0Oo, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public abstract void OooO00o();
}
