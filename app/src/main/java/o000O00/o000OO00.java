package o000O00;

/* loaded from: classes2.dex */
public final class o000OO00 extends o00OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29968OooO00o;

    public o000OO00(String str) {
        this.f29968OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OO)) {
            return false;
        }
        return this.f29968OooO00o.equals(((o000OO00) ((o00OO) obj)).f29968OooO00o);
    }

    public final int hashCode() {
        return this.f29968OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOOOo(new StringBuilder("Log{content="), this.f29968OooO00o, "}");
    }
}
