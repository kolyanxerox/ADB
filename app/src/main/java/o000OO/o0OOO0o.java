package o000Oo;

import OooOOo.OooOOO;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30306OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f30307OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f30308OooO0OO;

    public o0OOO0o(int i, long j, String str) {
        this.f30306OooO00o = str;
        this.f30307OooO0O0 = j;
        this.f30308OooO0OO = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o = (o0OOO0o) obj;
        String str = this.f30306OooO00o;
        if (str == null) {
            if (o0ooo0o.f30306OooO00o != null) {
                return false;
            }
        } else if (!str.equals(o0ooo0o.f30306OooO00o)) {
            return false;
        }
        if (this.f30307OooO0O0 != o0ooo0o.f30307OooO0O0) {
            return false;
        }
        int i = o0ooo0o.f30308OooO0OO;
        int i2 = this.f30308OooO0OO;
        return i2 == 0 ? i == 0 : OooOOO.OooO00o(i2, i);
    }

    public final int hashCode() {
        String str = this.f30306OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f30307OooO0O0;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.f30308OooO0OO;
        return (i2 != 0 ? OooOOO.OooO0O0(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f30306OooO00o);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f30307OooO0O0);
        sb.append(", responseCode=");
        int i = this.f30308OooO0OO;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
