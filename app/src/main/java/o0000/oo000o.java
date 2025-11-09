package o0000;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class oo000o extends OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28966OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO f28967OooO0OO;

    public oo000o(int i, OooOOOO oooOOOO) {
        this.f28966OooO0O0 = i;
        this.f28967OooO0OO = oooOOOO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return oo000oVar.f28966OooO0O0 == this.f28966OooO0O0 && oo000oVar.f28967OooO0OO == this.f28967OooO0OO;
    }

    public final int hashCode() {
        return Objects.hash(oo000o.class, Integer.valueOf(this.f28966OooO0O0), this.f28967OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f28967OooO0OO);
        sb.append(", ");
        return OooO0oO.OooOo.OooOOO(sb, this.f28966OooO0O0, "-byte key)");
    }
}
