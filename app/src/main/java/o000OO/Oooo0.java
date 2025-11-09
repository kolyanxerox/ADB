package o000OO;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Oooo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f30174OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Class f30175OooO0O0;

    public Oooo0(Class cls, Class cls2) {
        this.f30174OooO00o = cls;
        this.f30175OooO0O0 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return oooo0.f30174OooO00o.equals(this.f30174OooO00o) && oooo0.f30175OooO0O0.equals(this.f30175OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f30174OooO00o, this.f30175OooO0O0);
    }

    public final String toString() {
        return this.f30174OooO00o.getSimpleName() + " with primitive type: " + this.f30175OooO0O0.getSimpleName();
    }
}
