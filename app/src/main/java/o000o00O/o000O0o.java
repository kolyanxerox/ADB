package o000o00o;

import java.util.Map;
import o00OO0OO.OooO00o;

/* loaded from: classes2.dex */
public final class o000O0o {
    public static final o000O000 Companion = new o000O000();

    /* renamed from: OooO0Oo */
    public static final OooO00o[] f30785OooO0Oo;

    /* renamed from: OooO00o */
    public final o000O0 f30786OooO00o;

    /* renamed from: OooO0O0 */
    public final o00O0OO0 f30787OooO0O0;

    /* renamed from: OooO0OO */
    public final Map f30788OooO0OO;

    static {
        o00OO0oo.o00Ooo o00ooo2 = o00OO0oo.o00Ooo.f32079OooO00o;
        f30785OooO0Oo = new OooO00o[]{null, null, new o00OO0oo.OooOo00(o0000O00.f30759OooO00o)};
    }

    public /* synthetic */ o000O0o(int i, o000O0 o000o0, o00O0OO0 o00o0oo0, Map map) {
        if (1 != (i & 1)) {
            o00OO0oo.Oooo0.OooO00o(i, 1, o000.f30733OooO00o.OooO0Oo());
            throw null;
        }
        this.f30786OooO00o = o000o0;
        if ((i & 2) == 0) {
            this.f30787OooO0O0 = null;
        } else {
            this.f30787OooO0O0 = o00o0oo0;
        }
        if ((i & 4) == 0) {
            this.f30788OooO0OO = null;
        } else {
            this.f30788OooO0OO = map;
        }
    }

    public static o000O0o OooO00o(o000O0o o000o0o2, o000O0 sessionDetails, o00O0OO0 o00o0oo0, Map map, int i) {
        if ((i & 1) != 0) {
            sessionDetails = o000o0o2.f30786OooO00o;
        }
        if ((i & 2) != 0) {
            o00o0oo0 = o000o0o2.f30787OooO0O0;
        }
        if ((i & 4) != 0) {
            map = o000o0o2.f30788OooO0OO;
        }
        o000o0o2.getClass();
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDetails, "sessionDetails");
        return new o000O0o(sessionDetails, o00o0oo0, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0o)) {
            return false;
        }
        o000O0o o000o0o2 = (o000O0o) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30786OooO00o, o000o0o2.f30786OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30787OooO0O0, o000o0o2.f30787OooO0O0) && kotlin.jvm.internal.OooOo.OooO00o(this.f30788OooO0OO, o000o0o2.f30788OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = this.f30786OooO00o.hashCode() * 31;
        o00O0OO0 o00o0oo0 = this.f30787OooO0O0;
        int iHashCode2 = (iHashCode + (o00o0oo0 == null ? 0 : Long.hashCode(o00o0oo0.f30860OooO00o))) * 31;
        Map map = this.f30788OooO0OO;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f30786OooO00o + ", backgroundTime=" + this.f30787OooO0O0 + ", processDataMap=" + this.f30788OooO0OO + ')';
    }

    public o000O0o(o000O0 sessionDetails, o00O0OO0 o00o0oo0, Map map) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionDetails, "sessionDetails");
        this.f30786OooO00o = sessionDetails;
        this.f30787OooO0O0 = o00o0oo0;
        this.f30788OooO0OO = map;
    }
}
