package o000O00;

/* loaded from: classes2.dex */
public final class o000O extends oo0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Double f29920OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29921OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f29922OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29923OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f29924OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f29925OooO0o0;

    public o000O(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f29920OooO00o = d;
        this.f29921OooO0O0 = i;
        this.f29922OooO0OO = z;
        this.f29923OooO0Oo = i2;
        this.f29925OooO0o0 = j;
        this.f29924OooO0o = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo0O) {
            oo0O oo0o = (oo0O) obj;
            Double d = this.f29920OooO00o;
            if (d != null ? d.equals(((o000O) oo0o).f29920OooO00o) : ((o000O) oo0o).f29920OooO00o == null) {
                if (this.f29921OooO0O0 == ((o000O) oo0o).f29921OooO0O0) {
                    o000O o000o = (o000O) oo0o;
                    if (this.f29922OooO0OO == o000o.f29922OooO0OO && this.f29923OooO0Oo == o000o.f29923OooO0Oo && this.f29925OooO0o0 == o000o.f29925OooO0o0 && this.f29924OooO0o == o000o.f29924OooO0o) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f29920OooO00o;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f29921OooO0O0) * 1000003) ^ (this.f29922OooO0OO ? 1231 : 1237)) * 1000003) ^ this.f29923OooO0Oo) * 1000003;
        long j = this.f29925OooO0o0;
        long j2 = this.f29924OooO0o;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f29920OooO00o);
        sb.append(", batteryVelocity=");
        sb.append(this.f29921OooO0O0);
        sb.append(", proximityOn=");
        sb.append(this.f29922OooO0OO);
        sb.append(", orientation=");
        sb.append(this.f29923OooO0Oo);
        sb.append(", ramUsed=");
        sb.append(this.f29925OooO0o0);
        sb.append(", diskUsed=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f29924OooO0o, "}");
    }
}
