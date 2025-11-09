package o0000oo0;

import OooO0oO.OooOo;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import o00OoO00.OooOOO0;

/* loaded from: classes2.dex */
public final class oo0o0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO f29693OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29694OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29695OooO0OO;

    public oo0o0Oo(int i, int i2, Class cls) {
        this(o00000OO.OooO00o(cls), i, i2);
    }

    public static oo0o0Oo OooO00o(Class cls) {
        return new oo0o0Oo(1, 0, cls);
    }

    public static oo0o0Oo OooO0O0(o00000OO o00000oo2) {
        return new oo0o0Oo(o00000oo2, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return this.f29693OooO00o.equals(oo0o0oo.f29693OooO00o) && this.f29694OooO0O0 == oo0o0oo.f29694OooO0O0 && this.f29695OooO0OO == oo0o0oo.f29695OooO0OO;
    }

    public final int hashCode() {
        return ((((this.f29693OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29694OooO0O0) * 1000003) ^ this.f29695OooO0OO;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f29693OooO00o);
        sb.append(", type=");
        int i = this.f29694OooO0O0;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.f29695OooO0OO;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i2 != 2) {
                throw new AssertionError(OooOo.OooO0o(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return OooOo.OooOOOo(sb, str, "}");
    }

    public oo0o0Oo(o00000OO o00000oo2, int i, int i2) {
        OooOOO0.OooO0o0(o00000oo2, "Null dependency anInterface.");
        this.f29693OooO00o = o00000oo2;
        this.f29694OooO0O0 = i;
        this.f29695OooO0OO = i2;
    }
}
