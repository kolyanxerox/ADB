package o000O00;

/* loaded from: classes2.dex */
public final class o00O000 extends o00OOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f29999OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30000OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30001OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f30002OooO0Oo;

    public o00O000(String str, int i, String str2, boolean z) {
        this.f29999OooO00o = i;
        this.f30000OooO0O0 = str;
        this.f30001OooO0OO = str2;
        this.f30002OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OOOO0) {
            o00OOOO0 o00oooo0 = (o00OOOO0) obj;
            if (this.f29999OooO00o == ((o00O000) o00oooo0).f29999OooO00o) {
                o00O000 o00o000 = (o00O000) o00oooo0;
                if (this.f30000OooO0O0.equals(o00o000.f30000OooO0O0) && this.f30001OooO0OO.equals(o00o000.f30001OooO0OO) && this.f30002OooO0Oo == o00o000.f30002OooO0Oo) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29999OooO00o ^ 1000003) * 1000003) ^ this.f30000OooO0O0.hashCode()) * 1000003) ^ this.f30001OooO0OO.hashCode()) * 1000003) ^ (this.f30002OooO0Oo ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f29999OooO00o + ", version=" + this.f30000OooO0O0 + ", buildVersion=" + this.f30001OooO0OO + ", jailbroken=" + this.f30002OooO0Oo + "}";
    }
}
