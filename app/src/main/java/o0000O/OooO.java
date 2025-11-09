package o0000O;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooO extends o0000.OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29310OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29311OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f29312OooO0Oo;

    public OooO(int i, int i2, OooO0o oooO0o) {
        this.f29310OooO0O0 = i;
        this.f29311OooO0OO = i2;
        this.f29312OooO0Oo = oooO0o;
    }

    public final int OooO0O0() {
        OooO0o oooO0o = OooO0o.f29321OooO0o;
        int i = this.f29311OooO0OO;
        OooO0o oooO0o2 = this.f29312OooO0Oo;
        if (oooO0o2 == oooO0o) {
            return i;
        }
        if (oooO0o2 == OooO0o.f29319OooO0OO) {
            return i + 5;
        }
        if (oooO0o2 == OooO0o.f29320OooO0Oo) {
            return i + 5;
        }
        if (oooO0o2 == OooO0o.f29322OooO0o0) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return oooO.f29310OooO0O0 == this.f29310OooO0O0 && oooO.OooO0O0() == OooO0O0() && oooO.f29312OooO0Oo == this.f29312OooO0Oo;
    }

    public final int hashCode() {
        return Objects.hash(OooO.class, Integer.valueOf(this.f29310OooO0O0), Integer.valueOf(this.f29311OooO0OO), this.f29312OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f29312OooO0Oo);
        sb.append(", ");
        sb.append(this.f29311OooO0OO);
        sb.append("-byte tags, and ");
        return OooO0oO.OooOo.OooOOO(sb, this.f29310OooO0O0, "-byte key)");
    }
}
