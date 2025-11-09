package o000Oo0O;

/* loaded from: classes2.dex */
public final class OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30365OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f30366OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f30367OooO0OO;

    public OooOOOO(String str, long j, long j2) {
        this.f30365OooO00o = str;
        this.f30366OooO0O0 = j;
        this.f30367OooO0OO = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOOO) {
            OooOOOO oooOOOO = (OooOOOO) obj;
            if (this.f30365OooO00o.equals(oooOOOO.f30365OooO00o) && this.f30366OooO0O0 == oooOOOO.f30366OooO0O0 && this.f30367OooO0OO == oooOOOO.f30367OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f30365OooO00o.hashCode() ^ 1000003) * 1000003;
        long j = this.f30366OooO0O0;
        long j2 = this.f30367OooO0OO;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f30365OooO00o);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f30366OooO0O0);
        sb.append(", tokenCreationTimestamp=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f30367OooO0OO, "}");
    }
}
