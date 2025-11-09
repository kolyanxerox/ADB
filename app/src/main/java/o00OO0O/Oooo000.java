package o00oO0o;

import OooO00o.OooO00o;
import Ooooo0o.o00O0OOO;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.Arrays;
import o0OO00O.OooOOO;

/* loaded from: classes2.dex */
public final class Oooo000 extends Property {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f32728OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Oooo000(int i, Class cls, String str) {
        super(cls, str);
        this.f32728OooO00o = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f32728OooO00o) {
            case 0:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 1:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 2:
                return Float.valueOf(ViewCompat.getPaddingStart((View) obj));
            case 3:
                return Float.valueOf(ViewCompat.getPaddingEnd((View) obj));
            case 4:
                return Float.valueOf(((OooOOO) obj).f32858OooO);
            case 5:
                return Float.valueOf(((OooOOO) obj).f32864OooOO0);
            case 6:
                return Float.valueOf(((o0OO00O.Oooo000) obj).OooO0O0());
            case 7:
                return Float.valueOf(((o0OO00O.o00Oo0) obj).f32895OooO);
            default:
                return Float.valueOf(((o0OO00O.oo000o) obj).f32912OooOO0);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f32728OooO00o) {
            case 0:
                View view = (View) obj;
                view.getLayoutParams().width = ((Float) obj2).intValue();
                view.requestLayout();
                break;
            case 1:
                View view2 = (View) obj;
                view2.getLayoutParams().height = ((Float) obj2).intValue();
                view2.requestLayout();
                break;
            case 2:
                View view3 = (View) obj;
                ViewCompat.setPaddingRelative(view3, ((Float) obj2).intValue(), view3.getPaddingTop(), ViewCompat.getPaddingEnd(view3), view3.getPaddingBottom());
                break;
            case 3:
                View view4 = (View) obj;
                ViewCompat.setPaddingRelative(view4, ViewCompat.getPaddingStart(view4), view4.getPaddingTop(), ((Float) obj2).intValue(), view4.getPaddingBottom());
                break;
            case 4:
                OooOOO oooOOO = (OooOOO) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                oooOOO.f32858OooO = fFloatValue;
                int i = (int) (5400.0f * fFloatValue);
                float f = fFloatValue * 1520.0f;
                float[] fArr = oooOOO.f32889OooO0O0;
                fArr[0] = (-20.0f) + f;
                fArr[1] = f;
                int i2 = 0;
                while (true) {
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = oooOOO.f32860OooO0o;
                    if (i2 >= 4) {
                        float f2 = fArr[0];
                        float f3 = fArr[1];
                        float f4 = ((f3 - f2) * oooOOO.f32864OooOO0) + f2;
                        fArr[0] = f4;
                        fArr[0] = f4 / 360.0f;
                        fArr[1] = f3 / 360.0f;
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                float f5 = (i - OooOOO.f32854OooOOO[i3]) / 333;
                                if (f5 < 0.0f || f5 > 1.0f) {
                                    i3++;
                                } else {
                                    int i4 = i3 + oooOOO.f32863OooO0oo;
                                    CircularProgressIndicatorSpec circularProgressIndicatorSpec = oooOOO.f32862OooO0oO;
                                    int[] iArr = circularProgressIndicatorSpec.f32846OooO0OO;
                                    int length = i4 % iArr.length;
                                    oooOOO.f32890OooO0OO[0] = o00O0OOO.OooO00o(fastOutSlowInInterpolator.getInterpolation(f5), Integer.valueOf(OooO00o.OooO0O0(iArr[length], oooOOO.f32888OooO00o.f32887OooOooo)), Integer.valueOf(OooO00o.OooO0O0(circularProgressIndicatorSpec.f32846OooO0OO[(length + 1) % iArr.length], oooOOO.f32888OooO00o.f32887OooOooo))).intValue();
                                }
                            }
                        }
                        oooOOO.f32888OooO00o.invalidateSelf();
                        break;
                    } else {
                        float f6 = 667;
                        fArr[1] = (fastOutSlowInInterpolator.getInterpolation((i - OooOOO.OooOO0o[i2]) / f6) * 250.0f) + fArr[1];
                        fArr[0] = (fastOutSlowInInterpolator.getInterpolation((i - OooOOO.f32855OooOOO0[i2]) / f6) * 250.0f) + fArr[0];
                        i2++;
                    }
                }
                break;
            case 5:
                ((OooOOO) obj).f32864OooOO0 = ((Float) obj2).floatValue();
                break;
            case 6:
                o0OO00O.Oooo000 oooo000 = (o0OO00O.Oooo000) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (oooo000.f32884OooOoo != fFloatValue2) {
                    oooo000.f32884OooOoo = fFloatValue2;
                    oooo000.invalidateSelf();
                    break;
                }
                break;
            case 7:
                o0OO00O.o00Oo0 o00oo0 = (o0OO00O.o00Oo0) obj;
                o00oo0.f32895OooO = ((Float) obj2).floatValue();
                float[] fArr2 = o00oo0.f32889OooO0O0;
                fArr2[0] = 0.0f;
                float f7 = ((int) (r11 * 333.0f)) / 667;
                FastOutSlowInInterpolator fastOutSlowInInterpolator2 = o00oo0.f32898OooO0o0;
                float interpolation = fastOutSlowInInterpolator2.getInterpolation(f7);
                fArr2[2] = interpolation;
                fArr2[1] = interpolation;
                float interpolation2 = fastOutSlowInInterpolator2.getInterpolation(f7 + 0.49925038f);
                fArr2[4] = interpolation2;
                fArr2[3] = interpolation2;
                fArr2[5] = 1.0f;
                if (o00oo0.f32900OooO0oo && interpolation2 < 1.0f) {
                    int[] iArr2 = o00oo0.f32890OooO0OO;
                    iArr2[2] = iArr2[1];
                    iArr2[1] = iArr2[0];
                    iArr2[0] = OooO00o.OooO0O0(o00oo0.f32897OooO0o.f32846OooO0OO[o00oo0.f32899OooO0oO], o00oo0.f32888OooO00o.f32887OooOooo);
                    o00oo0.f32900OooO0oo = false;
                }
                o00oo0.f32888OooO00o.invalidateSelf();
                break;
            default:
                o0OO00O.oo000o oo000oVar = (o0OO00O.oo000o) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                oo000oVar.f32912OooOO0 = fFloatValue3;
                int i5 = (int) (fFloatValue3 * 1800.0f);
                for (int i6 = 0; i6 < 4; i6++) {
                    oo000oVar.f32889OooO0O0[i6] = Math.max(0.0f, Math.min(1.0f, oo000oVar.f32908OooO0o[i6].getInterpolation((i5 - o0OO00O.oo000o.f32905OooOOO0[i6]) / o0OO00O.oo000o.OooOO0o[i6])));
                }
                if (oo000oVar.f32906OooO) {
                    Arrays.fill(oo000oVar.f32890OooO0OO, OooO00o.OooO0O0(oo000oVar.f32910OooO0oO.f32846OooO0OO[oo000oVar.f32911OooO0oo], oo000oVar.f32888OooO00o.f32887OooOooo));
                    oo000oVar.f32906OooO = false;
                }
                oo000oVar.f32888OooO00o.invalidateSelf();
                break;
        }
    }
}
