package o000O00;

/* loaded from: classes2.dex */
public final class o000O000 extends o00O0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f29934OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f29935OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29936OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f29937OooO0Oo;

    public o000O000(String str, String str2, long j, long j2) {
        this.f29934OooO00o = j;
        this.f29935OooO0O0 = j2;
        this.f29936OooO0OO = str;
        this.f29937OooO0Oo = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0OO) {
            o00O0OO o00o0oo = (o00O0OO) obj;
            if (this.f29934OooO00o == ((o000O000) o00o0oo).f29934OooO00o) {
                o000O000 o000o0002 = (o000O000) o00o0oo;
                if (this.f29935OooO0O0 == o000o0002.f29935OooO0O0 && this.f29936OooO0OO.equals(o000o0002.f29936OooO0OO)) {
                    String str = o000o0002.f29937OooO0Oo;
                    String str2 = this.f29937OooO0Oo;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29934OooO00o;
        long j2 = this.f29935OooO0O0;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29936OooO0OO.hashCode()) * 1000003;
        String str = this.f29937OooO0Oo;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f29934OooO00o);
        sb.append(", size=");
        sb.append(this.f29935OooO0O0);
        sb.append(", name=");
        sb.append(this.f29936OooO0OO);
        sb.append(", uuid=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29937OooO0Oo, "}");
    }
}
