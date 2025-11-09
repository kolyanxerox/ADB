package OooOOOo;

/* loaded from: classes2.dex */
public final class o00O0O extends o000000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f13407OooO00o;

    public o00O0O(o000oOoO o000oooo2) {
        this.f13407OooO00o = o000oooo2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000000)) {
            return false;
        }
        o000000 o000000Var = (o000000) obj;
        Object obj2 = o000OOo.f13394OooOo0O;
        ((o00O0O) o000000Var).getClass();
        return obj2.equals(obj2) && this.f13407OooO00o.equals(((o00O0O) o000000Var).f13407OooO00o);
    }

    public final int hashCode() {
        return ((o000OOo.f13394OooOo0O.hashCode() ^ 1000003) * 1000003) ^ this.f13407OooO00o.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + o000OOo.f13394OooOo0O + ", androidClientInfo=" + this.f13407OooO00o + "}";
    }
}
