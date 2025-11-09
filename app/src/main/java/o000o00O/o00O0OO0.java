package o000o00o;

/* loaded from: classes2.dex */
public final class o00O0OO0 {
    public static final o00O0O0O Companion = new o00O0O0O();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f30860OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f30861OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f30862OooO0OO;

    public /* synthetic */ o00O0OO0(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            o00OO0oo.Oooo0.OooO00o(i, 1, o00O0O0.f30848OooO00o.OooO0Oo());
            throw null;
        }
        this.f30860OooO00o = j;
        this.f30861OooO0O0 = (i & 2) == 0 ? 1000 * j : j2;
        if ((i & 4) == 0) {
            this.f30862OooO0OO = j / 1000;
        } else {
            this.f30862OooO0OO = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o00O0OO0) && this.f30860OooO00o == ((o00O0OO0) obj).f30860OooO00o;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30860OooO00o);
    }

    public final String toString() {
        return "Time(ms=" + this.f30860OooO00o + ')';
    }

    public o00O0OO0(long j) {
        this.f30860OooO00o = j;
        long j2 = 1000;
        this.f30861OooO0O0 = j * j2;
        this.f30862OooO0OO = j / j2;
    }
}
