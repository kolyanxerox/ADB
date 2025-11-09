package OooOOOo;

/* loaded from: classes2.dex */
public final class o00oO0o extends o00000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f13411OooO00o;

    public o00oO0o(oo000o oo000oVar) {
        this.f13411OooO00o = oo000oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00000OO) {
            return this.f13411OooO00o.equals(((o00oO0o) ((o00000OO) obj)).f13411OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13411OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f13411OooO00o + "}";
    }
}
