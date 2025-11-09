package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0000OO0 extends o00OO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000 f29901OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final List f29902OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final List f29903OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Boolean f29904OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final List f29905OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00OO0O0 f29906OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f29907OooO0oO;

    public o0000OO0(o000 o000Var, List list, List list2, Boolean bool, o00OO0O0 o00oo0o0, List list3, int i) {
        this.f29901OooO00o = o000Var;
        this.f29902OooO0O0 = list;
        this.f29903OooO0OO = list2;
        this.f29904OooO0Oo = bool;
        this.f29906OooO0o0 = o00oo0o0;
        this.f29905OooO0o = list3;
        this.f29907OooO0oO = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OO0OO)) {
            return false;
        }
        o0000OO0 o0000oo02 = (o0000OO0) ((o00OO0OO) obj);
        if (!this.f29901OooO00o.equals(o0000oo02.f29901OooO00o)) {
            return false;
        }
        List list = this.f29902OooO0O0;
        if (list == null) {
            if (o0000oo02.f29902OooO0O0 != null) {
                return false;
            }
        } else if (!list.equals(o0000oo02.f29902OooO0O0)) {
            return false;
        }
        List list2 = this.f29903OooO0OO;
        if (list2 == null) {
            if (o0000oo02.f29903OooO0OO != null) {
                return false;
            }
        } else if (!list2.equals(o0000oo02.f29903OooO0OO)) {
            return false;
        }
        Boolean bool = this.f29904OooO0Oo;
        if (bool == null) {
            if (o0000oo02.f29904OooO0Oo != null) {
                return false;
            }
        } else if (!bool.equals(o0000oo02.f29904OooO0Oo)) {
            return false;
        }
        o00OO0O0 o00oo0o0 = this.f29906OooO0o0;
        if (o00oo0o0 == null) {
            if (o0000oo02.f29906OooO0o0 != null) {
                return false;
            }
        } else if (!o00oo0o0.equals(o0000oo02.f29906OooO0o0)) {
            return false;
        }
        List list3 = this.f29905OooO0o;
        if (list3 == null) {
            if (o0000oo02.f29905OooO0o != null) {
                return false;
            }
        } else if (!list3.equals(o0000oo02.f29905OooO0o)) {
            return false;
        }
        return this.f29907OooO0oO == o0000oo02.f29907OooO0oO;
    }

    public final int hashCode() {
        int iHashCode = (this.f29901OooO00o.hashCode() ^ 1000003) * 1000003;
        List list = this.f29902OooO0O0;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f29903OooO0OO;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f29904OooO0Oo;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        o00OO0O0 o00oo0o0 = this.f29906OooO0o0;
        int iHashCode5 = (iHashCode4 ^ (o00oo0o0 == null ? 0 : o00oo0o0.hashCode())) * 1000003;
        List list3 = this.f29905OooO0o;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f29907OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f29901OooO00o);
        sb.append(", customAttributes=");
        sb.append(this.f29902OooO0O0);
        sb.append(", internalKeys=");
        sb.append(this.f29903OooO0OO);
        sb.append(", background=");
        sb.append(this.f29904OooO0Oo);
        sb.append(", currentProcessDetails=");
        sb.append(this.f29906OooO0o0);
        sb.append(", appProcessDetails=");
        sb.append(this.f29905OooO0o);
        sb.append(", uiOrientation=");
        return OooO0oO.OooOo.OooOOO(sb, this.f29907OooO0oO, "}");
    }
}
