package o0000Oo0;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class OooOO0O extends o0000.OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f29506OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f29507OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f29508OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Integer f29509OooO0o0;

    public OooOO0O(Integer num, Integer num2, OooO0OO oooO0OO, Integer num3) {
        this.f29506OooO0O0 = num;
        this.f29507OooO0OO = num2;
        this.f29508OooO0Oo = oooO0OO;
        this.f29509OooO0o0 = num3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return oooOO0O.f29506OooO0O0.intValue() == this.f29506OooO0O0.intValue() && oooOO0O.f29507OooO0OO.intValue() == this.f29507OooO0OO.intValue() && oooOO0O.f29508OooO0Oo == this.f29508OooO0Oo && oooOO0O.f29509OooO0o0.intValue() == this.f29509OooO0o0.intValue();
    }

    public final int hashCode() {
        return Objects.hash(OooOO0O.class, this.f29506OooO0O0, this.f29507OooO0OO, this.f29508OooO0Oo, this.f29509OooO0o0);
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.f29506OooO0O0 + ", " + this.f29507OooO0OO + "-byte AES GCM key, " + this.f29508OooO0Oo + " for HKDF " + this.f29509OooO0o0 + "-byte ciphertexts)";
    }
}
