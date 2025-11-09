package o000o0O;

/* loaded from: classes2.dex */
public final class o00O0O {
    public static final o0OoOo0 Companion = new o0OoOo0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Boolean f30925OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Double f30926OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f30927OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f30928OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Long f30929OooO0o0;

    public /* synthetic */ o00O0O(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            o00OO0oo.Oooo0.OooO00o(i, 31, o000oOoO.f30924OooO00o.OooO0Oo());
            throw null;
        }
        this.f30925OooO00o = bool;
        this.f30926OooO0O0 = d;
        this.f30927OooO0OO = num;
        this.f30928OooO0Oo = num2;
        this.f30929OooO0o0 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o = (o00O0O) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30925OooO00o, o00o0o.f30925OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30926OooO0O0, o00o0o.f30926OooO0O0) && kotlin.jvm.internal.OooOo.OooO00o(this.f30927OooO0OO, o00o0o.f30927OooO0OO) && kotlin.jvm.internal.OooOo.OooO00o(this.f30928OooO0Oo, o00o0o.f30928OooO0Oo) && kotlin.jvm.internal.OooOo.OooO00o(this.f30929OooO0o0, o00o0o.f30929OooO0o0);
    }

    public final int hashCode() {
        Boolean bool = this.f30925OooO00o;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f30926OooO0O0;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f30927OooO0OO;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f30928OooO0Oo;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f30929OooO0o0;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f30925OooO00o + ", sessionSamplingRate=" + this.f30926OooO0O0 + ", sessionTimeoutSeconds=" + this.f30927OooO0OO + ", cacheDurationSeconds=" + this.f30928OooO0Oo + ", cacheUpdatedTimeSeconds=" + this.f30929OooO0o0 + ')';
    }

    public o00O0O(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f30925OooO00o = bool;
        this.f30926OooO0O0 = d;
        this.f30927OooO0OO = num;
        this.f30928OooO0Oo = num2;
        this.f30929OooO0o0 = l;
    }
}
