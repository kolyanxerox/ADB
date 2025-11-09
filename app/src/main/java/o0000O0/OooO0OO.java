package o0000O0;

import OooO0oO.OooOo;
import java.util.Objects;
import o00000oo.OooOo00;

/* loaded from: classes2.dex */
public final class OooO0OO extends OooOo00 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29358OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f29359OooO0OO;

    public OooO0OO(int i, OooO0O0 oooO0O0) {
        this.f29358OooO0O0 = i;
        this.f29359OooO0OO = oooO0O0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return oooO0OO.f29358OooO0O0 == this.f29358OooO0O0 && oooO0OO.f29359OooO0OO == this.f29359OooO0OO;
    }

    public final int hashCode() {
        return Objects.hash(OooO0OO.class, Integer.valueOf(this.f29358OooO0O0), this.f29359OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesSiv Parameters (variant: ");
        sb.append(this.f29359OooO0OO);
        sb.append(", ");
        return OooOo.OooOOO(sb, this.f29358OooO0O0, "-byte key)");
    }
}
