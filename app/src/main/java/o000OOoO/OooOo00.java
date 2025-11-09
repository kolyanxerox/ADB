package o000OooO;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class OooOo00 extends OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f30539OooO00o;

    public OooOo00(HashSet hashSet) {
        this.f30539OooO00o = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        return this.f30539OooO00o.equals(((OooOo00) ((OooOo) obj)).f30539OooO00o);
    }

    public final int hashCode() {
        return this.f30539OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f30539OooO00o + "}";
    }
}
