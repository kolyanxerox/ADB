package OooOOO;

import OooO0oO.OooOo;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f13315OooO00o;

    public OooO0O0(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f13315OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        return this.f13315OooO00o.equals(((OooO0O0) obj).f13315OooO00o);
    }

    public final int hashCode() {
        return this.f13315OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return OooOo.OooOOOo(new StringBuilder("Encoding{name=\""), this.f13315OooO00o, "\"}");
    }
}
