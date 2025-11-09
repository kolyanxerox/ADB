package o0000Oo0;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooO0o extends o0000.OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f29500OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f29501OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f29502OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final Integer f29503OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f29504OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Integer f29505OooO0oO;

    public OooO0o(Integer num, Integer num2, OooO0OO oooO0OO, OooO0OO oooO0OO2, Integer num3, Integer num4) {
        this.f29500OooO0O0 = num;
        this.f29501OooO0OO = num2;
        this.f29502OooO0Oo = oooO0OO;
        this.f29504OooO0o0 = oooO0OO2;
        this.f29503OooO0o = num3;
        this.f29505OooO0oO = num4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return oooO0o.f29500OooO0O0.intValue() == this.f29500OooO0O0.intValue() && oooO0o.f29501OooO0OO.intValue() == this.f29501OooO0OO.intValue() && oooO0o.f29502OooO0Oo == this.f29502OooO0Oo && oooO0o.f29504OooO0o0 == this.f29504OooO0o0 && oooO0o.f29503OooO0o.intValue() == this.f29503OooO0o.intValue() && oooO0o.f29505OooO0oO.intValue() == this.f29505OooO0oO.intValue();
    }

    public final int hashCode() {
        return Objects.hash(OooO0o.class, this.f29500OooO0O0, this.f29501OooO0OO, this.f29502OooO0Oo, this.f29504OooO0o0, this.f29503OooO0o, this.f29505OooO0oO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesCtrHmacStreaming Parameters (IKM size: ");
        sb.append(this.f29500OooO0O0);
        sb.append(", ");
        sb.append(this.f29501OooO0OO);
        sb.append("-byte AES key, ");
        OooO0OO oooO0OO = this.f29502OooO0Oo;
        sb.append(oooO0OO);
        sb.append(" for HKDF, ");
        sb.append(oooO0OO);
        sb.append(" for HMAC, ");
        sb.append(this.f29503OooO0o);
        sb.append("-byte tags, ");
        sb.append(this.f29505OooO0oO);
        sb.append("-byte ciphertexts)");
        return sb.toString();
    }
}
