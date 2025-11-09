package o000O00;

/* loaded from: classes2.dex */
public final class o000O0 extends o00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f29926OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29927OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29928OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f29929OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f29930OooO0o0;

    public o000O0(long j, String str, String str2, long j2, int i) {
        this.f29926OooO00o = j;
        this.f29927OooO0O0 = str;
        this.f29928OooO0OO = str2;
        this.f29929OooO0Oo = j2;
        this.f29930OooO0o0 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O) {
            o00O o00o = (o00O) obj;
            if (this.f29926OooO00o == ((o000O0) o00o).f29926OooO00o) {
                o000O0 o000o0 = (o000O0) o00o;
                if (this.f29927OooO0O0.equals(o000o0.f29927OooO0O0)) {
                    String str = o000o0.f29928OooO0OO;
                    String str2 = this.f29928OooO0OO;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f29929OooO0Oo == o000o0.f29929OooO0Oo && this.f29930OooO0o0 == o000o0.f29930OooO0o0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29926OooO00o;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29927OooO0O0.hashCode()) * 1000003;
        String str = this.f29928OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f29929OooO0Oo;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f29930OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f29926OooO00o);
        sb.append(", symbol=");
        sb.append(this.f29927OooO0O0);
        sb.append(", file=");
        sb.append(this.f29928OooO0OO);
        sb.append(", offset=");
        sb.append(this.f29929OooO0Oo);
        sb.append(", importance=");
        return OooO0oO.OooOo.OooOOO(sb, this.f29930OooO0o0, "}");
    }
}
