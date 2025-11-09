package o000o00o;

/* loaded from: classes2.dex */
public final class o000O0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0O0ooO f30783OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f30784OooO0O0;

    public o000O0Oo(o0O0ooO o0o0ooo, OooOOO0 oooOOO0) {
        oo000o oo000oVar = oo000o.f30892OooOo0o;
        this.f30783OooO00o = o0o0ooo;
        this.f30784OooO0O0 = oooOOO0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        o000o0oo2.getClass();
        oo000o oo000oVar = oo000o.f30892OooOo0o;
        return this.f30783OooO00o.equals(o000o0oo2.f30783OooO00o) && this.f30784OooO0O0.equals(o000o0oo2.f30784OooO0O0);
    }

    public final int hashCode() {
        return this.f30784OooO0O0.hashCode() + ((this.f30783OooO00o.hashCode() + (oo000o.f30892OooOo0o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + oo000o.f30892OooOo0o + ", sessionData=" + this.f30783OooO00o + ", applicationInfo=" + this.f30784OooO0O0 + ')';
    }
}
