package o000O00;

/* loaded from: classes2.dex */
public final class o00O000o extends o00OOOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30005OooO00o;

    public o00O000o(String str) {
        this.f30005OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOOOo)) {
            return false;
        }
        return this.f30005OooO00o.equals(((o00O000o) ((o00OOOOo) obj)).f30005OooO00o);
    }

    public final int hashCode() {
        return this.f30005OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOOo(new StringBuilder("User{identifier="), this.f30005OooO00o, "}");
    }
}
