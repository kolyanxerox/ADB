package o000Ooo;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30423OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30424OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30425OooO0OO;

    public Oooo000(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f30423OooO00o = str;
        this.f30424OooO0O0 = str2;
        this.f30425OooO0OO = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Oooo000) {
            Oooo000 oooo000 = (Oooo000) obj;
            if (this.f30423OooO00o.equals(oooo000.f30423OooO00o)) {
                String str = oooo000.f30424OooO0O0;
                String str2 = this.f30424OooO0O0;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = oooo000.f30425OooO0OO;
                    String str4 = this.f30425OooO0OO;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f30423OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f30424OooO0O0;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f30425OooO0OO;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f30423OooO00o);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f30424OooO0O0);
        sb.append(", firebaseAuthenticationToken=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f30425OooO0OO, "}");
    }
}
