package oooo00o;

import kotlin.jvm.internal.OooOo;
import o000Ooo.o00Ooo;
import o00OO0O0.OooO0o;

/* loaded from: classes2.dex */
public final class o000O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f33295OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public o00Ooo f33296OooO0O0 = null;

    public o000O00(OooO0o oooO0o) {
        this.f33295OooO00o = oooO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o002 = (o000O00) obj;
        return this.f33295OooO00o.equals(o000o002.f33295OooO00o) && OooOo.OooO00o(this.f33296OooO0O0, o000o002.f33296OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f33295OooO00o.hashCode() * 31;
        o00Ooo o00ooo2 = this.f33296OooO0O0;
        return iHashCode + (o00ooo2 == null ? 0 : o00ooo2.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f33295OooO00o + ", subscriber=" + this.f33296OooO0O0 + ')';
    }
}
