package o000O00;

/* loaded from: classes2.dex */
public final class o00000 extends o00O00o0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29842OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29843OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29844OooO0OO;

    public o00000(String str, String str2, String str3) {
        this.f29842OooO00o = str;
        this.f29843OooO0O0 = str2;
        this.f29844OooO0OO = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O00o0) {
            o00O00o0 o00o00o0 = (o00O00o0) obj;
            if (this.f29842OooO00o.equals(((o00000) o00o00o0).f29842OooO00o)) {
                o00000 o00000Var = (o00000) o00o00o0;
                if (this.f29843OooO0O0.equals(o00000Var.f29843OooO0O0) && this.f29844OooO0OO.equals(o00000Var.f29844OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29842OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29843OooO0O0.hashCode()) * 1000003) ^ this.f29844OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f29842OooO00o);
        sb.append(", libraryName=");
        sb.append(this.f29843OooO0O0);
        sb.append(", buildId=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f29844OooO0OO, "}");
    }
}
