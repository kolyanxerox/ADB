package o000O00;

/* loaded from: classes2.dex */
public final class o000Oo0 extends oo0oOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29989OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29990OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f29991OooO0OO;

    public o000Oo0(long j, String str, String str2) {
        this.f29989OooO00o = str;
        this.f29990OooO0O0 = str2;
        this.f29991OooO0OO = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo0oOO0) {
            oo0oOO0 oo0ooo0 = (oo0oOO0) obj;
            if (this.f29989OooO00o.equals(((o000Oo0) oo0ooo0).f29989OooO00o)) {
                o000Oo0 o000oo02 = (o000Oo0) oo0ooo0;
                if (this.f29990OooO0O0.equals(o000oo02.f29990OooO0O0) && this.f29991OooO0OO == o000oo02.f29991OooO0OO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29989OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29990OooO0O0.hashCode()) * 1000003;
        long j = this.f29991OooO0OO;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f29989OooO00o);
        sb.append(", code=");
        sb.append(this.f29990OooO0O0);
        sb.append(", address=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f29991OooO0OO, "}");
    }
}
