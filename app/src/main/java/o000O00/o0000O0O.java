package o000O00;

/* loaded from: classes2.dex */
public final class o0000O0O extends oo0o0O0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f29892OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f29893OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29894OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29895OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f29896OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f29897OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f29898OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f29899OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f29900OooO0oo;

    public o0000O0O(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f29893OooO00o = i;
        this.f29894OooO0O0 = str;
        this.f29895OooO0OO = i2;
        this.f29896OooO0Oo = j;
        this.f29898OooO0o0 = j2;
        this.f29897OooO0o = z;
        this.f29899OooO0oO = i3;
        this.f29900OooO0oo = str2;
        this.f29892OooO = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo0o0O0) {
            oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
            if (this.f29893OooO00o == ((o0000O0O) oo0o0o0).f29893OooO00o) {
                o0000O0O o0000o0o2 = (o0000O0O) oo0o0o0;
                if (this.f29894OooO0O0.equals(o0000o0o2.f29894OooO0O0) && this.f29895OooO0OO == o0000o0o2.f29895OooO0OO && this.f29896OooO0Oo == o0000o0o2.f29896OooO0Oo && this.f29898OooO0o0 == o0000o0o2.f29898OooO0o0 && this.f29897OooO0o == o0000o0o2.f29897OooO0o && this.f29899OooO0oO == o0000o0o2.f29899OooO0oO && this.f29900OooO0oo.equals(o0000o0o2.f29900OooO0oo) && this.f29892OooO.equals(o0000o0o2.f29892OooO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f29893OooO00o ^ 1000003) * 1000003) ^ this.f29894OooO0O0.hashCode()) * 1000003) ^ this.f29895OooO0OO) * 1000003;
        long j = this.f29896OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f29898OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f29897OooO0o ? 1231 : 1237)) * 1000003) ^ this.f29899OooO0oO) * 1000003) ^ this.f29900OooO0oo.hashCode()) * 1000003) ^ this.f29892OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f29893OooO00o);
        sb.append(", model=");
        sb.append(this.f29894OooO0O0);
        sb.append(", cores=");
        sb.append(this.f29895OooO0OO);
        sb.append(", ram=");
        sb.append(this.f29896OooO0Oo);
        sb.append(", diskSpace=");
        sb.append(this.f29898OooO0o0);
        sb.append(", simulator=");
        sb.append(this.f29897OooO0o);
        sb.append(", state=");
        sb.append(this.f29899OooO0oO);
        sb.append(", manufacturer=");
        sb.append(this.f29900OooO0oo);
        sb.append(", modelClass=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29892OooO, "}");
    }
}
