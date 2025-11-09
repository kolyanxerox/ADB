package OooOo;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f13539OooO0o = new OooO00o(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13540OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f13541OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f13542OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f13543OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f13544OooO0o0;

    public OooO00o(long j, int i, int i2, long j2, int i3) {
        this.f13540OooO00o = j;
        this.f13541OooO0O0 = i;
        this.f13542OooO0OO = i2;
        this.f13543OooO0Oo = j2;
        this.f13544OooO0o0 = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (this.f13540OooO00o == oooO00o.f13540OooO00o && this.f13541OooO0O0 == oooO00o.f13541OooO0O0 && this.f13542OooO0OO == oooO00o.f13542OooO0OO && this.f13543OooO0Oo == oooO00o.f13543OooO0Oo && this.f13544OooO0o0 == oooO00o.f13544OooO0o0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13540OooO00o;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13541OooO0O0) * 1000003) ^ this.f13542OooO0OO) * 1000003;
        long j2 = this.f13543OooO0Oo;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f13544OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f13540OooO00o);
        sb.append(", loadBatchSize=");
        sb.append(this.f13541OooO0O0);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f13542OooO0OO);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f13543OooO0Oo);
        sb.append(", maxBlobByteSizePerRow=");
        return OooO0oO.OooOo.OooOOO(sb, this.f13544OooO0o0, "}");
    }
}
