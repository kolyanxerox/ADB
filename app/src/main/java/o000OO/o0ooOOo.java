package o000Oo;

import OooOOo.OooOOO;

/* loaded from: classes2.dex */
public final class o0ooOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30314OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30315OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30316OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f30317OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f30318OooO0o0;

    public o0ooOOo(String str, String str2, String str3, o0OOO0o o0ooo0o, int i) {
        this.f30314OooO00o = str;
        this.f30315OooO0O0 = str2;
        this.f30316OooO0OO = str3;
        this.f30317OooO0Oo = o0ooo0o;
        this.f30318OooO0o0 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        String str = this.f30314OooO00o;
        if (str == null) {
            if (o0ooooo.f30314OooO00o != null) {
                return false;
            }
        } else if (!str.equals(o0ooooo.f30314OooO00o)) {
            return false;
        }
        String str2 = this.f30315OooO0O0;
        if (str2 == null) {
            if (o0ooooo.f30315OooO0O0 != null) {
                return false;
            }
        } else if (!str2.equals(o0ooooo.f30315OooO0O0)) {
            return false;
        }
        String str3 = this.f30316OooO0OO;
        if (str3 == null) {
            if (o0ooooo.f30316OooO0OO != null) {
                return false;
            }
        } else if (!str3.equals(o0ooooo.f30316OooO0OO)) {
            return false;
        }
        o0OOO0o o0ooo0o = this.f30317OooO0Oo;
        if (o0ooo0o == null) {
            if (o0ooooo.f30317OooO0Oo != null) {
                return false;
            }
        } else if (!o0ooo0o.equals(o0ooooo.f30317OooO0Oo)) {
            return false;
        }
        int i = this.f30318OooO0o0;
        return i == 0 ? o0ooooo.f30318OooO0o0 == 0 : OooOOO.OooO00o(i, o0ooooo.f30318OooO0o0);
    }

    public final int hashCode() {
        String str = this.f30314OooO00o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f30315OooO0O0;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30316OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        o0OOO0o o0ooo0o = this.f30317OooO0Oo;
        int iHashCode4 = (iHashCode3 ^ (o0ooo0o == null ? 0 : o0ooo0o.hashCode())) * 1000003;
        int i = this.f30318OooO0o0;
        return (i != 0 ? OooOOO.OooO0O0(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f30314OooO00o);
        sb.append(", fid=");
        sb.append(this.f30315OooO0O0);
        sb.append(", refreshToken=");
        sb.append(this.f30316OooO0OO);
        sb.append(", authToken=");
        sb.append(this.f30317OooO0Oo);
        sb.append(", responseCode=");
        int i = this.f30318OooO0o0;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
