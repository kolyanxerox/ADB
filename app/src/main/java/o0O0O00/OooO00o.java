package o0O0O00;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;

/* loaded from: classes2.dex */
public abstract class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f32822OooO00o = {R.attr.state_pressed};

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f32823OooO0O0 = {R.attr.state_focused};

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f32824OooO0OO = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f32825OooO0Oo = {R.attr.state_selected};

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f32827OooO0o0 = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final String f32826OooO0o = OooO00o.class.getSimpleName();

    public static ColorStateList OooO00o(ColorStateList colorStateList) {
        int[] iArr = f32823OooO0O0;
        return new ColorStateList(new int[][]{f32825OooO0Oo, iArr, StateSet.NOTHING}, new int[]{OooO0O0(colorStateList, f32824OooO0OO), OooO0O0(colorStateList, iArr), OooO0O0(colorStateList, f32822OooO00o)});
    }

    public static int OooO0O0(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ColorUtils.setAlphaComponent(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList OooO0OO(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f32827OooO0o0, 0)) != 0) {
            Log.w(f32826OooO0o, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean OooO0Oo(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
