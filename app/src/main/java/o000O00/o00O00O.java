package o000O00;

/* loaded from: classes2.dex */
public final class o00O00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30006OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30007OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30008OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30009OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final OooO0oO.OooOOO0 f30010OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f30011OooO0o0;

    public o00O00O(String str, String str2, String str3, String str4, int i, OooO0oO.OooOOO0 oooOOO0) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f30006OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f30007OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f30008OooO0OO = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f30009OooO0Oo = str4;
        this.f30011OooO0o0 = i;
        this.f30010OooO0o = oooOOO0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O00O)) {
            return false;
        }
        o00O00O o00o00o = (o00O00O) obj;
        return this.f30006OooO00o.equals(o00o00o.f30006OooO00o) && this.f30007OooO0O0.equals(o00o00o.f30007OooO0O0) && this.f30008OooO0OO.equals(o00o00o.f30008OooO0OO) && this.f30009OooO0Oo.equals(o00o00o.f30009OooO0Oo) && this.f30011OooO0o0 == o00o00o.f30011OooO0o0 && this.f30010OooO0o.equals(o00o00o.f30010OooO0o);
    }

    public final int hashCode() {
        return ((((((((((this.f30006OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30007OooO0O0.hashCode()) * 1000003) ^ this.f30008OooO0OO.hashCode()) * 1000003) ^ this.f30009OooO0Oo.hashCode()) * 1000003) ^ this.f30011OooO0o0) * 1000003) ^ this.f30010OooO0o.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f30006OooO00o + ", versionCode=" + this.f30007OooO0O0 + ", versionName=" + this.f30008OooO0OO + ", installUuid=" + this.f30009OooO0Oo + ", deliveryMechanism=" + this.f30011OooO0o0 + ", developmentPlatformProvider=" + this.f30010OooO0o + "}";
    }
}
