package OooOOOo;

/* loaded from: classes2.dex */
public final class o00Oo0 extends o00000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f13408OooO00o;

    public o00Oo0(o00oO0o o00oo0o) {
        o000000O o000000o2 = o000000O.f13386OooOo0O;
        this.f13408OooO00o = o00oo0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00000)) {
            return false;
        }
        o00000 o00000Var = (o00000) obj;
        if (!this.f13408OooO00o.equals(((o00Oo0) o00000Var).f13408OooO00o)) {
            return false;
        }
        Object obj2 = o000000O.f13386OooOo0O;
        ((o00Oo0) o00000Var).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f13408OooO00o.hashCode() ^ 1000003) * 1000003) ^ o000000O.f13386OooOo0O.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f13408OooO00o + ", productIdOrigin=" + o000000O.f13386OooOo0O + "}";
    }
}
