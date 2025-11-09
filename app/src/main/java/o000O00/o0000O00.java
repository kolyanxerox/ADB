package o000O00;

/* loaded from: classes2.dex */
public final class o0000O00 extends o00O0OO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29886OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29887OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29888OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f29889OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f29890OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f29891OooO0o0;

    public o0000O00(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f29886OooO00o = str;
        this.f29887OooO0O0 = str2;
        this.f29888OooO0OO = str3;
        this.f29889OooO0Oo = str4;
        this.f29891OooO0o0 = str5;
        this.f29890OooO0o = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0OO0) {
            o00O0OO0 o00o0oo0 = (o00O0OO0) obj;
            if (this.f29886OooO00o.equals(((o0000O00) o00o0oo0).f29886OooO00o)) {
                o0000O00 o0000o00 = (o0000O00) o00o0oo0;
                if (this.f29887OooO0O0.equals(o0000o00.f29887OooO0O0)) {
                    String str = o0000o00.f29888OooO0OO;
                    String str2 = this.f29888OooO0OO;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = o0000o00.f29889OooO0Oo;
                        String str4 = this.f29889OooO0Oo;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = o0000o00.f29891OooO0o0;
                            String str6 = this.f29891OooO0o0;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = o0000o00.f29890OooO0o;
                                String str8 = this.f29890OooO0o;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29886OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29887OooO0O0.hashCode()) * 1000003;
        String str = this.f29888OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f29889OooO0Oo;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f29891OooO0o0;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f29890OooO0o;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f29886OooO00o);
        sb.append(", version=");
        sb.append(this.f29887OooO0O0);
        sb.append(", displayVersion=");
        sb.append(this.f29888OooO0OO);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f29889OooO0Oo);
        sb.append(", developmentPlatform=");
        sb.append(this.f29891OooO0o0);
        sb.append(", developmentPlatformVersion=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29890OooO0o, "}");
    }
}
