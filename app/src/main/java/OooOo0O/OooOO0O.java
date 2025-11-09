package OooOo0o;

import java.util.Set;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13609OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f13610OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Set f13611OooO0OO;

    public OooOO0O(long j, long j2, Set set) {
        this.f13609OooO00o = j;
        this.f13610OooO0O0 = j2;
        this.f13611OooO0OO = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            OooOO0O oooOO0O = (OooOO0O) obj;
            if (this.f13609OooO00o == oooOO0O.f13609OooO00o && this.f13610OooO0O0 == oooOO0O.f13610OooO0O0 && this.f13611OooO0OO.equals(oooOO0O.f13611OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13609OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f13610OooO0O0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f13611OooO0OO.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f13609OooO00o + ", maxAllowedDelay=" + this.f13610OooO0O0 + ", flags=" + this.f13611OooO0OO + "}";
    }
}
