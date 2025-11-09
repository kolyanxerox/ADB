package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0O0ooO extends o00OOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f30052OooO00o;

    public o0O0ooO(List list) {
        this.f30052OooO00o = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOO0O)) {
            return false;
        }
        return this.f30052OooO00o.equals(((o0O0ooO) ((o00OOO0O) obj)).f30052OooO00o);
    }

    public final int hashCode() {
        return this.f30052OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f30052OooO00o + "}";
    }
}
