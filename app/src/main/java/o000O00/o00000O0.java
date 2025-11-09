package o000O00;

/* loaded from: classes2.dex */
public final class o00000O0 extends o00O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29866OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29867OooO0O0;

    public o00000O0(String str, String str2) {
        this.f29866OooO00o = str;
        this.f29867OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0) {
            o00O0 o00o0 = (o00O0) obj;
            if (this.f29866OooO00o.equals(((o00000O0) o00o0).f29866OooO00o) && this.f29867OooO0O0.equals(((o00000O0) o00o0).f29867OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29866OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29867OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f29866OooO00o);
        sb.append(", value=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29867OooO0O0, "}");
    }
}
