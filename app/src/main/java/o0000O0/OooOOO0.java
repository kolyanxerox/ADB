package o0000o0;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f29578OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f29579OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f29580OooO0OO;

    public OooOOO0(long j, long j2, long j3) {
        this.f29578OooO00o = j;
        this.f29579OooO0O0 = j2;
        this.f29580OooO0OO = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOO0) {
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            if (this.f29578OooO00o == oooOOO0.f29578OooO00o && this.f29579OooO0O0 == oooOOO0.f29579OooO0O0 && this.f29580OooO0OO == oooOOO0.f29580OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29578OooO00o;
        long j2 = this.f29579OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f29580OooO0OO;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f29578OooO00o);
        sb.append(", elapsedRealtime=");
        sb.append(this.f29579OooO0O0);
        sb.append(", uptimeMillis=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f29580OooO0OO, "}");
    }
}
