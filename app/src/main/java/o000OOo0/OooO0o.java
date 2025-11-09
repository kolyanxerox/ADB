package o000Ooo0;

import OooO0oO.OooOo;

/* loaded from: classes2.dex */
public final class OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30534OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30535OooO0O0;

    public OooO0o(String str, String str2) {
        this.f30534OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f30535OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) obj;
            if (this.f30534OooO00o.equals(oooO0o.f30534OooO00o) && this.f30535OooO0O0.equals(oooO0o.f30535OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30534OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30535OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f30534OooO00o);
        sb.append(", version=");
        return OooOo.OooOOOo(sb, this.f30535OooO0O0, "}");
    }
}
