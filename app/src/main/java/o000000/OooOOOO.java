package o000000;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooOOOO implements OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final float f29069OooO00o;

    public OooOOOO(float f) {
        this.f29069OooO00o = f;
    }

    @Override // o000000.OooO0OO
    public final float OooO00o(RectF rectF) {
        return rectF.height() * this.f29069OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOOOO) && this.f29069OooO00o == ((OooOOOO) obj).f29069OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29069OooO00o)});
    }
}
