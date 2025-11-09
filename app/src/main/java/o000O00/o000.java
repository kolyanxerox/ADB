package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000 extends o00OO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f29826OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0o f29827OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oo00o f29828OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0 f29829OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final List f29830OooO0o0;

    public o000(List list, o000O0o o000o0o2, oo00o oo00oVar, o000Oo0 o000oo02, List list2) {
        this.f29826OooO00o = list;
        this.f29827OooO0O0 = o000o0o2;
        this.f29828OooO0OO = oo00oVar;
        this.f29829OooO0Oo = o000oo02;
        this.f29830OooO0o0 = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00OO00O)) {
            return false;
        }
        o00OO00O o00oo00o = (o00OO00O) obj;
        List list = this.f29826OooO00o;
        if (list == null) {
            if (((o000) o00oo00o).f29826OooO00o != null) {
                return false;
            }
        } else if (!list.equals(((o000) o00oo00o).f29826OooO00o)) {
            return false;
        }
        o000O0o o000o0o2 = this.f29827OooO0O0;
        if (o000o0o2 == null) {
            if (((o000) o00oo00o).f29827OooO0O0 != null) {
                return false;
            }
        } else if (!o000o0o2.equals(((o000) o00oo00o).f29827OooO0O0)) {
            return false;
        }
        oo00o oo00oVar = this.f29828OooO0OO;
        if (oo00oVar == null) {
            if (((o000) o00oo00o).f29828OooO0OO != null) {
                return false;
            }
        } else if (!oo00oVar.equals(((o000) o00oo00o).f29828OooO0OO)) {
            return false;
        }
        o000 o000Var = (o000) o00oo00o;
        return this.f29829OooO0Oo.equals(o000Var.f29829OooO0Oo) && this.f29830OooO0o0.equals(o000Var.f29830OooO0o0);
    }

    public final int hashCode() {
        List list = this.f29826OooO00o;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        o000O0o o000o0o2 = this.f29827OooO0O0;
        int iHashCode2 = (iHashCode ^ (o000o0o2 == null ? 0 : o000o0o2.hashCode())) * 1000003;
        oo00o oo00oVar = this.f29828OooO0OO;
        return (((((oo00oVar != null ? oo00oVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f29829OooO0Oo.hashCode()) * 1000003) ^ this.f29830OooO0o0.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f29826OooO00o + ", exception=" + this.f29827OooO0O0 + ", appExitInfo=" + this.f29828OooO0OO + ", signal=" + this.f29829OooO0Oo + ", binaries=" + this.f29830OooO0o0 + "}";
    }
}
