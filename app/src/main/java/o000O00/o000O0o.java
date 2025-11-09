package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000O0o extends o00O0OOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29956OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29957OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final List f29958OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0OOO f29959OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f29960OooO0o0;

    public o000O0o(String str, String str2, List list, o00O0OOO o00o0ooo, int i) {
        this.f29956OooO00o = str;
        this.f29957OooO0O0 = str2;
        this.f29958OooO0OO = list;
        this.f29959OooO0Oo = o00o0ooo;
        this.f29960OooO0o0 = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0OOO) {
            o00O0OOO o00o0ooo = (o00O0OOO) obj;
            if (this.f29956OooO00o.equals(((o000O0o) o00o0ooo).f29956OooO00o) && ((str = this.f29957OooO0O0) != null ? str.equals(((o000O0o) o00o0ooo).f29957OooO0O0) : ((o000O0o) o00o0ooo).f29957OooO0O0 == null)) {
                o000O0o o000o0o2 = (o000O0o) o00o0ooo;
                if (this.f29958OooO0OO.equals(o000o0o2.f29958OooO0OO)) {
                    o00O0OOO o00o0ooo2 = o000o0o2.f29959OooO0Oo;
                    o00O0OOO o00o0ooo3 = this.f29959OooO0Oo;
                    if (o00o0ooo3 != null ? o00o0ooo3.equals(o00o0ooo2) : o00o0ooo2 == null) {
                        if (this.f29960OooO0o0 == o000o0o2.f29960OooO0o0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29956OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f29957OooO0O0;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f29958OooO0OO.hashCode()) * 1000003;
        o00O0OOO o00o0ooo = this.f29959OooO0Oo;
        return ((iHashCode2 ^ (o00o0ooo != null ? o00o0ooo.hashCode() : 0)) * 1000003) ^ this.f29960OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f29956OooO00o);
        sb.append(", reason=");
        sb.append(this.f29957OooO0O0);
        sb.append(", frames=");
        sb.append(this.f29958OooO0OO);
        sb.append(", causedBy=");
        sb.append(this.f29959OooO0Oo);
        sb.append(", overflowCount=");
        return OooO0oO.OooOo.OooOOO(sb, this.f29960OooO0o0, "}");
    }
}
