package o00ooo;

import OooO00o.OooO00o;
import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.github.superadb.R;
import oo0o0Oo.OooO0O0;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final int f32816OooO0o = (int) Math.round(5.1000000000000005d);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f32817OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f32818OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f32819OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f32820OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f32821OooO0o0;

    public OooOO0O(Context context) {
        boolean zOooO0O0 = OooO0O0.OooO0O0(context, R.attr.elevationOverlayEnabled, false);
        int iOooOO0O = OooO00o.OooOO0O(context, R.attr.elevationOverlayColor, 0);
        int iOooOO0O2 = OooO00o.OooOO0O(context, R.attr.elevationOverlayAccentColor, 0);
        int iOooOO0O3 = OooO00o.OooOO0O(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f32817OooO00o = zOooO0O0;
        this.f32818OooO0O0 = iOooOO0O;
        this.f32819OooO0OO = iOooOO0O2;
        this.f32820OooO0Oo = iOooOO0O3;
        this.f32821OooO0o0 = f;
    }

    public final int OooO00o(float f, int i) {
        int i2;
        if (!this.f32817OooO00o || ColorUtils.setAlphaComponent(i, 255) != this.f32820OooO0Oo) {
            return i;
        }
        float fMin = (this.f32821OooO0o0 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iOooOOo = OooO00o.OooOOo(fMin, ColorUtils.setAlphaComponent(i, 255), this.f32818OooO0O0);
        if (fMin > 0.0f && (i2 = this.f32819OooO0OO) != 0) {
            iOooOOo = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, f32816OooO0o), iOooOOo);
        }
        return ColorUtils.setAlphaComponent(iOooOOo, iAlpha);
    }
}
