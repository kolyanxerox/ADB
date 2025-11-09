package o0000;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooOo00 extends OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28930OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28931OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28932OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final OooOOOO f28933OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOO f28934OooO0o0;

    public OooOo00(int i, int i2, int i3, OooOOOO oooOOOO, OooOOOO oooOOOO2) {
        this.f28930OooO0O0 = i;
        this.f28931OooO0OO = i2;
        this.f28932OooO0Oo = i3;
        this.f28934OooO0o0 = oooOOOO;
        this.f28933OooO0o = oooOOOO2;
    }

    public final int OooO0O0() {
        OooOOOO oooOOOO = OooOOOO.f28910OooOO0;
        int i = this.f28932OooO0Oo;
        OooOOOO oooOOOO2 = this.f28934OooO0o0;
        if (oooOOOO2 == oooOOOO) {
            return i + 16;
        }
        if (oooOOOO2 == OooOOOO.f28909OooO0oo || oooOOOO2 == OooOOOO.f28903OooO) {
            return i + 21;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return oooOo00.f28930OooO0O0 == this.f28930OooO0O0 && oooOo00.f28931OooO0OO == this.f28931OooO0OO && oooOo00.OooO0O0() == OooO0O0() && oooOo00.f28934OooO0o0 == this.f28934OooO0o0 && oooOo00.f28933OooO0o == this.f28933OooO0o;
    }

    public final int hashCode() {
        return Objects.hash(OooOo00.class, Integer.valueOf(this.f28930OooO0O0), Integer.valueOf(this.f28931OooO0OO), Integer.valueOf(this.f28932OooO0Oo), this.f28934OooO0o0, this.f28933OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.f28934OooO0o0);
        sb.append(", hashType: ");
        sb.append(this.f28933OooO0o);
        sb.append(", ");
        sb.append(this.f28932OooO0Oo);
        sb.append("-byte tags, and ");
        sb.append(this.f28930OooO0O0);
        sb.append("-byte AES key, and ");
        return OooO0oO.OooOo.OooOOO(sb, this.f28931OooO0OO, "-byte HMAC key)");
    }
}
