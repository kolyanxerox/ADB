package OooOOO;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f13313OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f13314OooO0O0;

    public OooO00o(Object obj, OooO0OO oooO0OO) {
        this.f13313OooO00o = obj;
        this.f13314OooO0O0 = oooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            oooO00o.getClass();
            if (this.f13313OooO00o.equals(oooO00o.f13313OooO00o) && this.f13314OooO0O0.equals(oooO00o.f13314OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13314OooO0O0.hashCode() ^ (((1000003 * 1000003) ^ this.f13313OooO00o.hashCode()) * 1000003)) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f13313OooO00o + ", priority=" + this.f13314OooO0O0 + ", productData=null, eventContext=null}";
    }
}
