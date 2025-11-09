package o000o00O;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f30663OooO00o;

    public OooO(HashSet hashSet) {
        this.f30663OooO00o = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        return this.f30663OooO00o.equals(((OooO) obj).f30663OooO00o);
    }

    public final int hashCode() {
        return this.f30663OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f30663OooO00o + "}";
    }
}
