package o000000;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO00o implements OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final float f29023OooO00o;

    public OooO00o(float f) {
        this.f29023OooO00o = f;
    }

    @Override // o000000.OooO0OO
    public final float OooO00o(RectF rectF) {
        return this.f29023OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO00o) && this.f29023OooO00o == ((OooO00o) obj).f29023OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29023OooO00o)});
    }
}
