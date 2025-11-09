package o000O00;

/* loaded from: classes2.dex */
public final class o00O00OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30012OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30013OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f30014OooO0OO;

    public o00O00OO(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f30012OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f30013OooO0O0 = str2;
        this.f30014OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O00OO) {
            o00O00OO o00o00oo = (o00O00OO) obj;
            if (this.f30012OooO00o.equals(o00o00oo.f30012OooO00o) && this.f30013OooO0O0.equals(o00o00oo.f30013OooO0O0) && this.f30014OooO0OO == o00o00oo.f30014OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f30012OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30013OooO0O0.hashCode()) * 1000003) ^ (this.f30014OooO0OO ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f30012OooO00o + ", osCodeName=" + this.f30013OooO0O0 + ", isRooted=" + this.f30014OooO0OO + "}";
    }
}
