package o000O00;

/* loaded from: classes2.dex */
public final class o0000O extends o0o0Oo {

    /* renamed from: OooO00o */
    public final long f29870OooO00o;

    /* renamed from: OooO0O0 */
    public final String f29871OooO0O0;

    /* renamed from: OooO0OO */
    public final o0000OO0 f29872OooO0OO;

    /* renamed from: OooO0Oo */
    public final o000O f29873OooO0Oo;

    /* renamed from: OooO0o */
    public final o0O0ooO f29874OooO0o;

    /* renamed from: OooO0o0 */
    public final o000OO00 f29875OooO0o0;

    public o0000O(long j, String str, o0000OO0 o0000oo02, o000O o000o, o000OO00 o000oo002, o0O0ooO o0o0ooo) {
        this.f29870OooO00o = j;
        this.f29871OooO0O0 = str;
        this.f29872OooO0OO = o0000oo02;
        this.f29873OooO0Oo = o000o;
        this.f29875OooO0o0 = o000oo002;
        this.f29874OooO0o = o0o0ooo;
    }

    public final o000OO OooO00o() {
        o000OO o000oo2 = new o000OO();
        o000oo2.f29961OooO00o = this.f29870OooO00o;
        o000oo2.f29962OooO0O0 = this.f29871OooO0O0;
        o000oo2.f29963OooO0OO = this.f29872OooO0OO;
        o000oo2.f29964OooO0Oo = this.f29873OooO0Oo;
        o000oo2.f29966OooO0o0 = this.f29875OooO0o0;
        o000oo2.f29965OooO0o = this.f29874OooO0o;
        o000oo2.f29967OooO0oO = (byte) 1;
        return o000oo2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0o0Oo)) {
            return false;
        }
        o0000O o0000o2 = (o0000O) ((o0o0Oo) obj);
        if (this.f29870OooO00o != o0000o2.f29870OooO00o) {
            return false;
        }
        if (!this.f29871OooO0O0.equals(o0000o2.f29871OooO0O0) || !this.f29872OooO0OO.equals(o0000o2.f29872OooO0OO) || !this.f29873OooO0Oo.equals(o0000o2.f29873OooO0Oo)) {
            return false;
        }
        o000OO00 o000oo002 = o0000o2.f29875OooO0o0;
        o000OO00 o000oo003 = this.f29875OooO0o0;
        if (o000oo003 == null) {
            if (o000oo002 != null) {
                return false;
            }
        } else if (!o000oo003.equals(o000oo002)) {
            return false;
        }
        o0O0ooO o0o0ooo = o0000o2.f29874OooO0o;
        o0O0ooO o0o0ooo2 = this.f29874OooO0o;
        return o0o0ooo2 == null ? o0o0ooo == null : o0o0ooo2.equals(o0o0ooo);
    }

    public final int hashCode() {
        long j = this.f29870OooO00o;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29871OooO0O0.hashCode()) * 1000003) ^ this.f29872OooO0OO.hashCode()) * 1000003) ^ this.f29873OooO0Oo.hashCode()) * 1000003;
        o000OO00 o000oo002 = this.f29875OooO0o0;
        int iHashCode2 = (iHashCode ^ (o000oo002 == null ? 0 : o000oo002.hashCode())) * 1000003;
        o0O0ooO o0o0ooo = this.f29874OooO0o;
        return iHashCode2 ^ (o0o0ooo != null ? o0o0ooo.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f29870OooO00o + ", type=" + this.f29871OooO0O0 + ", app=" + this.f29872OooO0OO + ", device=" + this.f29873OooO0Oo + ", log=" + this.f29875OooO0o0 + ", rollouts=" + this.f29874OooO0o + "}";
    }
}
