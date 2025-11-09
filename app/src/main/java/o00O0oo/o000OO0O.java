package o00O0oo;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000OO0O {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O0Oo f31627OooO0O0 = new o000O0Oo();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f31628OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof o000OO0O) {
            return OooOo.OooO00o(this.f31628OooO00o, ((o000OO0O) obj).f31628OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f31628OooO00o;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f31628OooO00o;
        if (obj instanceof o000O0) {
            return ((o000O0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
