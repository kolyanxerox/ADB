package OooOo;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13545OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOo0.OooOo f13546OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOo0.OooOo00 f13547OooO0OO;

    public OooO0O0(long j, OooOOo0.OooOo oooOo, OooOOo0.OooOo00 oooOo00) {
        this.f13545OooO00o = j;
        this.f13546OooO0O0 = oooOo;
        this.f13547OooO0OO = oooOo00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return this.f13545OooO00o == oooO0O0.f13545OooO00o && this.f13546OooO0O0.equals(oooO0O0.f13546OooO0O0) && this.f13547OooO0OO.equals(oooO0O0.f13547OooO0OO);
    }

    public final int hashCode() {
        long j = this.f13545OooO00o;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13546OooO0O0.hashCode()) * 1000003) ^ this.f13547OooO0OO.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f13545OooO00o + ", transportContext=" + this.f13546OooO0O0 + ", event=" + this.f13547OooO0OO + "}";
    }
}
