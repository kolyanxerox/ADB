package o00000o0;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00000O0 implements o000000, Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f29278OooOo0O;

    public o00000O0(Object obj) {
        this.f29278OooOo0O = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        Object obj2 = this.f29278OooOo0O;
        Object obj3 = ((o00000O0) obj).f29278OooOo0O;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    @Override // o00000o0.o000000
    public final Object get() {
        return this.f29278OooOo0O;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29278OooOo0O});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f29278OooOo0O);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
