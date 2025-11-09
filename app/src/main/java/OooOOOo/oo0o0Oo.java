package OooOOOo;

/* loaded from: classes2.dex */
public final class oo0o0Oo extends o0000O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f13439OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f13440OooO0O0;

    public oo0o0Oo(o0000oo o0000ooVar, o0000O00 o0000o00) {
        this.f13439OooO00o = o0000ooVar;
        this.f13440OooO0O0 = o0000o00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000O0) {
            o0000O0 o0000o02 = (o0000O0) obj;
            o0000oo o0000ooVar = this.f13439OooO00o;
            if (o0000ooVar != null ? o0000ooVar.equals(((oo0o0Oo) o0000o02).f13439OooO00o) : ((oo0o0Oo) o0000o02).f13439OooO00o == null) {
                o0000O00 o0000o00 = this.f13440OooO0O0;
                if (o0000o00 != null ? o0000o00.equals(((oo0o0Oo) o0000o02).f13440OooO0O0) : ((oo0o0Oo) o0000o02).f13440OooO0O0 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        o0000oo o0000ooVar = this.f13439OooO00o;
        int iHashCode = ((o0000ooVar == null ? 0 : o0000ooVar.hashCode()) ^ 1000003) * 1000003;
        o0000O00 o0000o00 = this.f13440OooO0O0;
        return (o0000o00 != null ? o0000o00.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13439OooO00o + ", mobileSubtype=" + this.f13440OooO0O0 + "}";
    }
}
