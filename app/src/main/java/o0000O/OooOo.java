package o0000O;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooOo extends o0000.OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29339OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29340OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f29341OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f29342OooO0o0;

    public OooOo(int i, int i2, OooO0o oooO0o, OooO0o oooO0o2) {
        this.f29339OooO0O0 = i;
        this.f29340OooO0OO = i2;
        this.f29341OooO0Oo = oooO0o;
        this.f29342OooO0o0 = oooO0o2;
    }

    public final int OooO0O0() {
        OooO0o oooO0o = OooO0o.f29329OooOOOO;
        int i = this.f29340OooO0OO;
        OooO0o oooO0o2 = this.f29341OooO0Oo;
        if (oooO0o2 == oooO0o) {
            return i;
        }
        if (oooO0o2 == OooO0o.OooOO0o) {
            return i + 5;
        }
        if (oooO0o2 == OooO0o.f29328OooOOO0) {
            return i + 5;
        }
        if (oooO0o2 == OooO0o.f29327OooOOO) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return oooOo.f29339OooO0O0 == this.f29339OooO0O0 && oooOo.OooO0O0() == OooO0O0() && oooOo.f29341OooO0Oo == this.f29341OooO0Oo && oooOo.f29342OooO0o0 == this.f29342OooO0o0;
    }

    public final int hashCode() {
        return Objects.hash(OooOo.class, Integer.valueOf(this.f29339OooO0O0), Integer.valueOf(this.f29340OooO0OO), this.f29341OooO0Oo, this.f29342OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f29341OooO0Oo);
        sb.append(", hashType: ");
        sb.append(this.f29342OooO0o0);
        sb.append(", ");
        sb.append(this.f29340OooO0OO);
        sb.append("-byte tags, and ");
        return OooO0oO.OooOo.OooOOO(sb, this.f29339OooO0O0, "-byte key)");
    }
}
