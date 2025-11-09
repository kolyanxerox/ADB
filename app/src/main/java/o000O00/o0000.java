package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0000 extends o00Oo00 {

    /* renamed from: OooO */
    public final o00O000 f29831OooO;

    /* renamed from: OooO00o */
    public final String f29832OooO00o;

    /* renamed from: OooO0O0 */
    public final String f29833OooO0O0;

    /* renamed from: OooO0OO */
    public final String f29834OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f29835OooO0Oo;

    /* renamed from: OooO0o */
    public final boolean f29836OooO0o;

    /* renamed from: OooO0o0 */
    public final Long f29837OooO0o0;

    /* renamed from: OooO0oO */
    public final o0000O00 f29838OooO0oO;

    /* renamed from: OooO0oo */
    public final o00O000o f29839OooO0oo;

    /* renamed from: OooOO0 */
    public final o0000O0O f29840OooOO0;

    /* renamed from: OooOO0O */
    public final List f29841OooOO0O;
    public final int OooOO0o;

    public o0000(String str, String str2, String str3, long j, Long l, boolean z, o0000O00 o0000o00, o00O000o o00o000o, o00O000 o00o000, o0000O0O o0000o0o2, List list, int i) {
        this.f29832OooO00o = str;
        this.f29833OooO0O0 = str2;
        this.f29834OooO0OO = str3;
        this.f29835OooO0Oo = j;
        this.f29837OooO0o0 = l;
        this.f29836OooO0o = z;
        this.f29838OooO0oO = o0000o00;
        this.f29839OooO0oo = o00o000o;
        this.f29831OooO = o00o000;
        this.f29840OooOO0 = o0000o0o2;
        this.f29841OooOO0O = list;
        this.OooOO0o = i;
    }

    public final o0000Ooo OooO00o() {
        o0000Ooo o0000ooo = new o0000Ooo();
        o0000ooo.f29909OooO00o = this.f29832OooO00o;
        o0000ooo.f29910OooO0O0 = this.f29833OooO0O0;
        o0000ooo.f29911OooO0OO = this.f29834OooO0OO;
        o0000ooo.f29912OooO0Oo = this.f29835OooO0Oo;
        o0000ooo.f29914OooO0o0 = this.f29837OooO0o0;
        o0000ooo.f29913OooO0o = this.f29836OooO0o;
        o0000ooo.f29915OooO0oO = this.f29838OooO0oO;
        o0000ooo.f29916OooO0oo = this.f29839OooO0oo;
        o0000ooo.f29908OooO = this.f29831OooO;
        o0000ooo.f29917OooOO0 = this.f29840OooOO0;
        o0000ooo.f29918OooOO0O = this.f29841OooOO0O;
        o0000ooo.OooOO0o = this.OooOO0o;
        o0000ooo.f29919OooOOO0 = (byte) 7;
        return o0000ooo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo00)) {
            return false;
        }
        o0000 o0000Var = (o0000) ((o00Oo00) obj);
        if (!this.f29832OooO00o.equals(o0000Var.f29832OooO00o)) {
            return false;
        }
        if (!this.f29833OooO0O0.equals(o0000Var.f29833OooO0O0)) {
            return false;
        }
        String str = o0000Var.f29834OooO0OO;
        String str2 = this.f29834OooO0OO;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f29835OooO0Oo != o0000Var.f29835OooO0Oo) {
            return false;
        }
        Long l = o0000Var.f29837OooO0o0;
        Long l2 = this.f29837OooO0o0;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (!l2.equals(l)) {
            return false;
        }
        if (this.f29836OooO0o != o0000Var.f29836OooO0o || !this.f29838OooO0oO.equals(o0000Var.f29838OooO0oO)) {
            return false;
        }
        o00O000o o00o000o = o0000Var.f29839OooO0oo;
        o00O000o o00o000o2 = this.f29839OooO0oo;
        if (o00o000o2 == null) {
            if (o00o000o != null) {
                return false;
            }
        } else if (!o00o000o2.equals(o00o000o)) {
            return false;
        }
        o00O000 o00o000 = o0000Var.f29831OooO;
        o00O000 o00o0002 = this.f29831OooO;
        if (o00o0002 == null) {
            if (o00o000 != null) {
                return false;
            }
        } else if (!o00o0002.equals(o00o000)) {
            return false;
        }
        o0000O0O o0000o0o2 = o0000Var.f29840OooOO0;
        o0000O0O o0000o0o3 = this.f29840OooOO0;
        if (o0000o0o3 == null) {
            if (o0000o0o2 != null) {
                return false;
            }
        } else if (!o0000o0o3.equals(o0000o0o2)) {
            return false;
        }
        List list = o0000Var.f29841OooOO0O;
        List list2 = this.f29841OooOO0O;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.OooOO0o == o0000Var.OooOO0o;
    }

    public final int hashCode() {
        int iHashCode = (((this.f29832OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29833OooO0O0.hashCode()) * 1000003;
        String str = this.f29834OooO0OO;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f29835OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f29837OooO0o0;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f29836OooO0o ? 1231 : 1237)) * 1000003) ^ this.f29838OooO0oO.hashCode()) * 1000003;
        o00O000o o00o000o = this.f29839OooO0oo;
        int iHashCode4 = (iHashCode3 ^ (o00o000o == null ? 0 : o00o000o.hashCode())) * 1000003;
        o00O000 o00o000 = this.f29831OooO;
        int iHashCode5 = (iHashCode4 ^ (o00o000 == null ? 0 : o00o000.hashCode())) * 1000003;
        o0000O0O o0000o0o2 = this.f29840OooOO0;
        int iHashCode6 = (iHashCode5 ^ (o0000o0o2 == null ? 0 : o0000o0o2.hashCode())) * 1000003;
        List list = this.f29841OooOO0O;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.OooOO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f29832OooO00o);
        sb.append(", identifier=");
        sb.append(this.f29833OooO0O0);
        sb.append(", appQualitySessionId=");
        sb.append(this.f29834OooO0OO);
        sb.append(", startedAt=");
        sb.append(this.f29835OooO0Oo);
        sb.append(", endedAt=");
        sb.append(this.f29837OooO0o0);
        sb.append(", crashed=");
        sb.append(this.f29836OooO0o);
        sb.append(", app=");
        sb.append(this.f29838OooO0oO);
        sb.append(", user=");
        sb.append(this.f29839OooO0oo);
        sb.append(", os=");
        sb.append(this.f29831OooO);
        sb.append(", device=");
        sb.append(this.f29840OooOO0);
        sb.append(", events=");
        sb.append(this.f29841OooOO0O);
        sb.append(", generatorType=");
        return OooO0oO.OooOo.OooOOO(sb, this.OooOO0o, "}");
    }
}
