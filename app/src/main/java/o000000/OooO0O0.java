package o000000;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO0O0 implements OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f29024OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final float f29025OooO0O0;

    public OooO0O0(float f, OooO0OO oooO0OO) {
        while (oooO0OO instanceof OooO0O0) {
            oooO0OO = ((OooO0O0) oooO0OO).f29024OooO00o;
            f += ((OooO0O0) oooO0OO).f29025OooO0O0;
        }
        this.f29024OooO00o = oooO0OO;
        this.f29025OooO0O0 = f;
    }

    @Override // o000000.OooO0OO
    public final float OooO00o(RectF rectF) {
        return Math.max(0.0f, this.f29024OooO00o.OooO00o(rectF) + this.f29025OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return this.f29024OooO00o.equals(oooO0O0.f29024OooO00o) && this.f29025OooO0O0 == oooO0O0.f29025OooO0O0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29024OooO00o, Float.valueOf(this.f29025OooO0O0)});
    }
}
