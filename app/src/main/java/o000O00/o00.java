package o000O00;

/* loaded from: classes2.dex */
public final class o00 extends o00OOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00O0000 f29822OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29823OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29824OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f29825OooO0Oo;

    public o00(o00O0000 o00o0000, String str, String str2, long j) {
        this.f29822OooO00o = o00o0000;
        this.f29823OooO0O0 = str;
        this.f29824OooO0OO = str2;
        this.f29825OooO0Oo = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OOO0)) {
            return false;
        }
        o00 o00Var = (o00) ((o00OOO0) obj);
        if (this.f29822OooO00o.equals(o00Var.f29822OooO00o)) {
            return this.f29823OooO0O0.equals(o00Var.f29823OooO0O0) && this.f29824OooO0OO.equals(o00Var.f29824OooO0OO) && this.f29825OooO0Oo == o00Var.f29825OooO0Oo;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f29822OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29823OooO0O0.hashCode()) * 1000003) ^ this.f29824OooO0OO.hashCode()) * 1000003;
        long j = this.f29825OooO0Oo;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f29822OooO00o);
        sb.append(", parameterKey=");
        sb.append(this.f29823OooO0O0);
        sb.append(", parameterValue=");
        sb.append(this.f29824OooO0OO);
        sb.append(", templateVersion=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f29825OooO0Oo, "}");
    }
}
