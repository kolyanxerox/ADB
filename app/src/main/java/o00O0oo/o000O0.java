package o00O0oo;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000O0 extends o000O0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Throwable f31609OooO00o;

    public o000O0(Throwable th) {
        this.f31609OooO00o = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000O0) {
            return OooOo.OooO00o(this.f31609OooO00o, ((o000O0) obj).f31609OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f31609OooO00o;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o00O0oo.o000O0Oo
    public final String toString() {
        return "Closed(" + this.f31609OooO00o + ')';
    }
}
