package o000OO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f30181OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Class f30182OooO0O0;

    public o00Ooo(Class cls, Class cls2) {
        this.f30181OooO00o = cls;
        this.f30182OooO0O0 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return o00ooo2.f30181OooO00o.equals(this.f30181OooO00o) && o00ooo2.f30182OooO0O0.equals(this.f30182OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f30181OooO00o, this.f30182OooO0O0);
    }

    public final String toString() {
        return this.f30181OooO00o.getSimpleName() + " with serialization type: " + this.f30182OooO0O0.getSimpleName();
    }
}
