package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o00000O extends o00O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f29864OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29865OooO0O0;

    public o00000O(String str, List list) {
        this.f29864OooO00o = list;
        this.f29865OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0O0) {
            o00O0O0 o00o0o0 = (o00O0O0) obj;
            if (this.f29864OooO00o.equals(((o00000O) o00o0o0).f29864OooO00o) && ((str = this.f29865OooO0O0) != null ? str.equals(((o00000O) o00o0o0).f29865OooO0O0) : ((o00000O) o00o0o0).f29865OooO0O0 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29864OooO00o.hashCode() ^ 1000003) * 1000003;
        String str = this.f29865OooO0O0;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f29864OooO00o);
        sb.append(", orgId=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29865OooO0O0, "}");
    }
}
