package o000O00;

/* loaded from: classes2.dex */
public final class oOO00O {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f30073OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f30074OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30075OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f30076OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f30077OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f30078OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f30079OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f30080OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f30081OooO0oo;

    public oOO00O(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f30074OooO00o = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f30075OooO0O0 = str;
        this.f30076OooO0OO = i2;
        this.f30077OooO0Oo = j;
        this.f30079OooO0o0 = j2;
        this.f30078OooO0o = z;
        this.f30080OooO0oO = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f30081OooO0oo = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f30073OooO = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oOO00O) {
            oOO00O ooo00o = (oOO00O) obj;
            if (this.f30074OooO00o == ooo00o.f30074OooO00o && this.f30075OooO0O0.equals(ooo00o.f30075OooO0O0) && this.f30076OooO0OO == ooo00o.f30076OooO0OO && this.f30077OooO0Oo == ooo00o.f30077OooO0Oo && this.f30079OooO0o0 == ooo00o.f30079OooO0o0 && this.f30078OooO0o == ooo00o.f30078OooO0o && this.f30080OooO0oO == ooo00o.f30080OooO0oO && this.f30081OooO0oo.equals(ooo00o.f30081OooO0oo) && this.f30073OooO.equals(ooo00o.f30073OooO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f30074OooO00o ^ 1000003) * 1000003) ^ this.f30075OooO0O0.hashCode()) * 1000003) ^ this.f30076OooO0OO) * 1000003;
        long j = this.f30077OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f30079OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f30078OooO0o ? 1231 : 1237)) * 1000003) ^ this.f30080OooO0oO) * 1000003) ^ this.f30081OooO0oo.hashCode()) * 1000003) ^ this.f30073OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f30074OooO00o);
        sb.append(", model=");
        sb.append(this.f30075OooO0O0);
        sb.append(", availableProcessors=");
        sb.append(this.f30076OooO0OO);
        sb.append(", totalRam=");
        sb.append(this.f30077OooO0Oo);
        sb.append(", diskSpace=");
        sb.append(this.f30079OooO0o0);
        sb.append(", isEmulator=");
        sb.append(this.f30078OooO0o);
        sb.append(", state=");
        sb.append(this.f30080OooO0oO);
        sb.append(", manufacturer=");
        sb.append(this.f30081OooO0oo);
        sb.append(", modelClass=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f30073OooO, "}");
    }
}
