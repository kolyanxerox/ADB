package o000OO;

import java.util.Objects;
import o0000OoO.o00OOO0O;

/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f30179OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO0O f30180OooO0O0;

    public o00Oo0(Class cls, o00OOO0O o00ooo0o) {
        this.f30179OooO00o = cls;
        this.f30180OooO0O0 = o00ooo0o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo0 = (o00Oo0) obj;
        return o00oo0.f30179OooO00o.equals(this.f30179OooO00o) && o00oo0.f30180OooO0O0.equals(this.f30180OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f30179OooO00o, this.f30180OooO0O0);
    }

    public final String toString() {
        return this.f30179OooO00o.getSimpleName() + ", object identifier: " + this.f30180OooO0O0;
    }
}
