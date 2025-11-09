package o000O00;

/* loaded from: classes2.dex */
public final class o00O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00O00O f29996OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00OO f29997OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oOO00O f29998OooO0OO;

    public o00O00(o00O00O o00o00o, o00O00OO o00o00oo, oOO00O ooo00o) {
        this.f29996OooO00o = o00o00o;
        this.f29997OooO0O0 = o00o00oo;
        this.f29998OooO0OO = ooo00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O00) {
            o00O00 o00o00 = (o00O00) obj;
            if (this.f29996OooO00o.equals(o00o00.f29996OooO00o) && this.f29997OooO0O0.equals(o00o00.f29997OooO0O0) && this.f29998OooO0OO.equals(o00o00.f29998OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f29996OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29997OooO0O0.hashCode()) * 1000003) ^ this.f29998OooO0OO.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f29996OooO00o + ", osData=" + this.f29997OooO0O0 + ", deviceData=" + this.f29998OooO0OO + "}";
    }
}
