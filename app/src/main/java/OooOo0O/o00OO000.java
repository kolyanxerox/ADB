package Ooooo0o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import o000oooo.o000O;

/* loaded from: classes2.dex */
public final class o00OO000 extends Property {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15006OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f15007OooO0O0;

    public o00OO000() {
        super(Matrix.class, "imageMatrixProperty");
        this.f15007OooO0O0 = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f15006OooO00o) {
            case 0:
                Matrix matrix = (Matrix) this.f15007OooO0O0;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(oo0o0O0.OooO00o(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f27633OoooOOO.getColorForState(extendedFloatingActionButton.getDrawableState(), ((ExtendedFloatingActionButton) ((o000O) this.f15007OooO0O0).f31133OooO0OO).f27633OoooOOO.getDefaultColor()))));
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f15006OooO00o) {
            case 0:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                int colorForState = extendedFloatingActionButton.f27633OoooOOO.getColorForState(extendedFloatingActionButton.getDrawableState(), ((ExtendedFloatingActionButton) ((o000O) this.f15007OooO0O0).f31133OooO0OO).f27633OoooOOO.getDefaultColor());
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (oo0o0O0.OooO00o(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f.floatValue() != 1.0f) {
                    extendedFloatingActionButton.OooO0o(colorStateListValueOf);
                    break;
                } else {
                    extendedFloatingActionButton.OooO0o(extendedFloatingActionButton.f27633OoooOOO);
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(o000O o000o) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f15007OooO0O0 = o000o;
    }
}
