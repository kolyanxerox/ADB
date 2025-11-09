package OooOOOo;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends o0O0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f13428OooO00o;

    public o0OoOo0(ArrayList arrayList) {
        this.f13428OooO00o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O00)) {
            return false;
        }
        return this.f13428OooO00o.equals(((o0OoOo0) ((o0O0O00) obj)).f13428OooO00o);
    }

    public final int hashCode() {
        return this.f13428OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f13428OooO00o + "}";
    }
}
