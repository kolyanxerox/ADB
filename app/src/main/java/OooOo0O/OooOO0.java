package OooOo0o;

import OooOOO.OooO0OO;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooOoO.o000oOoO f13607OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f13608OooO0O0;

    public OooOO0(OooOoO.o000oOoO o000oooo2, HashMap map) {
        this.f13607OooO00o = o000oooo2;
        this.f13608OooO0O0 = map;
    }

    public final long OooO00o(OooO0OO oooO0OO, long j, int i) {
        long jOooO00o = j - this.f13607OooO00o.OooO00o();
        OooOO0O oooOO0O = (OooOO0O) this.f13608OooO0O0.get(oooO0OO);
        long j2 = oooOO0O.f13609OooO00o;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jOooO00o), oooOO0O.f13610OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO0 = (OooOO0) obj;
        return this.f13607OooO00o.equals(oooOO0.f13607OooO00o) && this.f13608OooO0O0.equals(oooOO0.f13608OooO0O0);
    }

    public final int hashCode() {
        return ((this.f13607OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f13608OooO0O0.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f13607OooO00o + ", values=" + this.f13608OooO0O0 + "}";
    }
}
