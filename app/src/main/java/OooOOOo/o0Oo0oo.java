package OooOOOo;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0Oo0oo extends o0000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13422OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f13423OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f13424OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f13425OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f13426OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f13427OooO0o0;

    public o0Oo0oo(long j, long j2, o00O0O o00o0o, Integer num, String str, ArrayList arrayList) {
        o0000O0O o0000o0o2 = o0000O0O.f13390OooOo0O;
        this.f13422OooO00o = j;
        this.f13423OooO0O0 = j2;
        this.f13424OooO0OO = o00o0o;
        this.f13425OooO0Oo = num;
        this.f13427OooO0o0 = str;
        this.f13426OooO0o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000)) {
            return false;
        }
        o0Oo0oo o0oo0oo = (o0Oo0oo) ((o0000) obj);
        if (this.f13422OooO00o != o0oo0oo.f13422OooO00o) {
            return false;
        }
        if (this.f13423OooO0O0 != o0oo0oo.f13423OooO0O0) {
            return false;
        }
        if (!this.f13424OooO0OO.equals(o0oo0oo.f13424OooO0OO)) {
            return false;
        }
        Integer num = o0oo0oo.f13425OooO0Oo;
        Integer num2 = this.f13425OooO0Oo;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = o0oo0oo.f13427OooO0o0;
        String str2 = this.f13427OooO0o0;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f13426OooO0o.equals(o0oo0oo.f13426OooO0o)) {
            return false;
        }
        Object obj2 = o0000O0O.f13390OooOo0O;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f13422OooO00o;
        long j2 = this.f13423OooO0O0;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f13424OooO0OO.hashCode()) * 1000003;
        Integer num = this.f13425OooO0Oo;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f13427OooO0o0;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f13426OooO0o.hashCode()) * 1000003) ^ o0000O0O.f13390OooOo0O.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f13422OooO00o + ", requestUptimeMs=" + this.f13423OooO0O0 + ", clientInfo=" + this.f13424OooO0OO + ", logSource=" + this.f13425OooO0Oo + ", logSourceName=" + this.f13427OooO0o0 + ", logEvents=" + this.f13426OooO0o + ", qosTier=" + o0000O0O.f13390OooOo0O + "}";
    }
}
