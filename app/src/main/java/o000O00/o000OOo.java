package o000O00;

/* loaded from: classes2.dex */
public final class o000OOo extends o0oOO {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f29973OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29974OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29975OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29976OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f29977OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f29978OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f29979OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f29980OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final String f29981OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final o0000 f29982OooOO0O;
    public final o00000O OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final o000000O f29983OooOOO0;

    public o000OOo(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, o0000 o0000Var, o00000O o00000o, o000000O o000000o2) {
        this.f29974OooO0O0 = str;
        this.f29975OooO0OO = str2;
        this.f29976OooO0Oo = i;
        this.f29978OooO0o0 = str3;
        this.f29977OooO0o = str4;
        this.f29979OooO0oO = str5;
        this.f29980OooO0oo = str6;
        this.f29973OooO = str7;
        this.f29981OooOO0 = str8;
        this.f29982OooOO0O = o0000Var;
        this.OooOO0o = o00000o;
        this.f29983OooOOO0 = o000000o2;
    }

    public final o0O0O00 OooO00o() {
        o0O0O00 o0o0o00 = new o0O0O00();
        o0o0o00.f30041OooO00o = this.f29974OooO0O0;
        o0o0o00.f30042OooO0O0 = this.f29975OooO0OO;
        o0o0o00.f30043OooO0OO = this.f29976OooO0Oo;
        o0o0o00.f30044OooO0Oo = this.f29978OooO0o0;
        o0o0o00.f30046OooO0o0 = this.f29977OooO0o;
        o0o0o00.f30045OooO0o = this.f29979OooO0oO;
        o0o0o00.f30047OooO0oO = this.f29980OooO0oo;
        o0o0o00.f30048OooO0oo = this.f29973OooO;
        o0o0o00.f30040OooO = this.f29981OooOO0;
        o0o0o00.f30049OooOO0 = this.f29982OooOO0O;
        o0o0o00.f30050OooOO0O = this.OooOO0o;
        o0o0o00.OooOO0o = this.f29983OooOOO0;
        o0o0o00.f30051OooOOO0 = (byte) 1;
        return o0o0o00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0oOO)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) ((o0oOO) obj);
        if (!this.f29974OooO0O0.equals(o000ooo2.f29974OooO0O0)) {
            return false;
        }
        if (!this.f29975OooO0OO.equals(o000ooo2.f29975OooO0OO) || this.f29976OooO0Oo != o000ooo2.f29976OooO0Oo || !this.f29978OooO0o0.equals(o000ooo2.f29978OooO0o0)) {
            return false;
        }
        String str = o000ooo2.f29977OooO0o;
        String str2 = this.f29977OooO0o;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = o000ooo2.f29979OooO0oO;
        String str4 = this.f29979OooO0oO;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = o000ooo2.f29980OooO0oo;
        String str6 = this.f29980OooO0oo;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.f29973OooO.equals(o000ooo2.f29973OooO) || !this.f29981OooOO0.equals(o000ooo2.f29981OooOO0)) {
            return false;
        }
        o0000 o0000Var = o000ooo2.f29982OooOO0O;
        o0000 o0000Var2 = this.f29982OooOO0O;
        if (o0000Var2 == null) {
            if (o0000Var != null) {
                return false;
            }
        } else if (!o0000Var2.equals(o0000Var)) {
            return false;
        }
        o00000O o00000o = o000ooo2.OooOO0o;
        o00000O o00000o2 = this.OooOO0o;
        if (o00000o2 == null) {
            if (o00000o != null) {
                return false;
            }
        } else if (!o00000o2.equals(o00000o)) {
            return false;
        }
        o000000O o000000o2 = o000ooo2.f29983OooOOO0;
        o000000O o000000o3 = this.f29983OooOOO0;
        return o000000o3 == null ? o000000o2 == null : o000000o3.equals(o000000o2);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f29974OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f29975OooO0OO.hashCode()) * 1000003) ^ this.f29976OooO0Oo) * 1000003) ^ this.f29978OooO0o0.hashCode()) * 1000003;
        String str = this.f29977OooO0o;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f29979OooO0oO;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f29980OooO0oo;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f29973OooO.hashCode()) * 1000003) ^ this.f29981OooOO0.hashCode()) * 1000003;
        o0000 o0000Var = this.f29982OooOO0O;
        int iHashCode5 = (iHashCode4 ^ (o0000Var == null ? 0 : o0000Var.hashCode())) * 1000003;
        o00000O o00000o = this.OooOO0o;
        int iHashCode6 = (iHashCode5 ^ (o00000o == null ? 0 : o00000o.hashCode())) * 1000003;
        o000000O o000000o2 = this.f29983OooOOO0;
        return iHashCode6 ^ (o000000o2 != null ? o000000o2.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f29974OooO0O0 + ", gmpAppId=" + this.f29975OooO0OO + ", platform=" + this.f29976OooO0Oo + ", installationUuid=" + this.f29978OooO0o0 + ", firebaseInstallationId=" + this.f29977OooO0o + ", firebaseAuthenticationToken=" + this.f29979OooO0oO + ", appQualitySessionId=" + this.f29980OooO0oo + ", buildVersion=" + this.f29973OooO + ", displayVersion=" + this.f29981OooOO0 + ", session=" + this.f29982OooOO0O + ", ndkPayload=" + this.OooOO0o + ", appExitInfo=" + this.f29983OooOOO0 + "}";
    }
}
