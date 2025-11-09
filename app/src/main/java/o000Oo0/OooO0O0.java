package o000Oo0;

/* loaded from: classes2.dex */
public final class OooO0O0 extends Oooo0 {

    /* renamed from: OooO0O0 */
    public final String f30333OooO0O0;

    /* renamed from: OooO0OO */
    public final String f30334OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f30335OooO0Oo;

    /* renamed from: OooO0o */
    public final long f30336OooO0o;

    /* renamed from: OooO0o0 */
    public final String f30337OooO0o0;

    public OooO0O0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f30333OooO0O0 = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f30334OooO0OO = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f30335OooO0Oo = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f30337OooO0o0 = str4;
        this.f30336OooO0o = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) obj;
            if (this.f30333OooO0O0.equals(((OooO0O0) oooo0).f30333OooO0O0)) {
                OooO0O0 oooO0O0 = (OooO0O0) oooo0;
                if (this.f30334OooO0OO.equals(oooO0O0.f30334OooO0OO) && this.f30335OooO0Oo.equals(oooO0O0.f30335OooO0Oo) && this.f30337OooO0o0.equals(oooO0O0.f30337OooO0o0) && this.f30336OooO0o == oooO0O0.f30336OooO0o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f30333OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f30334OooO0OO.hashCode()) * 1000003) ^ this.f30335OooO0Oo.hashCode()) * 1000003) ^ this.f30337OooO0o0.hashCode()) * 1000003;
        long j = this.f30336OooO0o;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f30333OooO0O0);
        sb.append(", parameterKey=");
        sb.append(this.f30334OooO0OO);
        sb.append(", parameterValue=");
        sb.append(this.f30335OooO0Oo);
        sb.append(", variantId=");
        sb.append(this.f30337OooO0o0);
        sb.append(", templateVersion=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f30336OooO0o, "}");
    }
}
