package OooOOo;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f13441OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f13442OooO0O0;

    public OooOO0O(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f13441OooO00o = i;
        this.f13442OooO0O0 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return OooOOO.OooO00o(this.f13441OooO00o, oooOO0O.f13441OooO00o) && this.f13442OooO0O0 == oooOO0O.f13442OooO0O0;
    }

    public final int hashCode() {
        int iOooO0O0 = (OooOOO.OooO0O0(this.f13441OooO00o) ^ 1000003) * 1000003;
        long j = this.f13442OooO0O0;
        return iOooO0O0 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f13441OooO00o;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f13442OooO0O0, "}");
    }
}
