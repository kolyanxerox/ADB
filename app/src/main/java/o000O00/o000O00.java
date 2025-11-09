package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000O00 extends o00OO000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29931OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29932OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final List f29933OooO0OO;

    public o000O00(String str, List list, int i) {
        this.f29931OooO00o = str;
        this.f29932OooO0O0 = i;
        this.f29933OooO0OO = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OO000) {
            o00OO000 o00oo000 = (o00OO000) obj;
            if (this.f29931OooO00o.equals(((o000O00) o00oo000).f29931OooO00o)) {
                o000O00 o000o002 = (o000O00) o00oo000;
                if (this.f29932OooO0O0 == o000o002.f29932OooO0O0 && this.f29933OooO0OO.equals(o000o002.f29933OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29931OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29932OooO0O0) * 1000003) ^ this.f29933OooO0OO.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f29931OooO00o + ", importance=" + this.f29932OooO0O0 + ", frames=" + this.f29933OooO0OO + "}";
    }
}
