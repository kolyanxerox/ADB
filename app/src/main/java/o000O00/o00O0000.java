package o000O00;

/* loaded from: classes2.dex */
public final class o00O0000 extends o00OOO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30003OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30004OooO0O0;

    public o00O0000(String str, String str2) {
        this.f30003OooO00o = str;
        this.f30004OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OOO00) {
            o00OOO00 o00ooo00 = (o00OOO00) obj;
            if (this.f30003OooO00o.equals(((o00O0000) o00ooo00).f30003OooO00o) && this.f30004OooO0O0.equals(((o00O0000) o00ooo00).f30004OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30003OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30004OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f30003OooO00o);
        sb.append(", variantId=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f30004OooO0O0, "}");
    }
}
