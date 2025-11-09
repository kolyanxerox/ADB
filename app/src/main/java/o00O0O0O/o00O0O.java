package o00O0o0O;

import Oooo0oO.o00000;
import java.util.Iterator;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public class o00O0O implements Iterable, OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f31436OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f31437OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f31438OooOo0o;

    public o00O0O(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f31437OooOo0O = i;
        this.f31438OooOo0o = o00000.OooO0oO(i, i2, i3);
        this.f31436OooOo = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        if (isEmpty() && ((o00O0O) obj).isEmpty()) {
            return true;
        }
        o00O0O o00o0o = (o00O0O) obj;
        return this.f31437OooOo0O == o00o0o.f31437OooOo0O && this.f31438OooOo0o == o00o0o.f31438OooOo0o && this.f31436OooOo == o00o0o.f31436OooOo;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f31437OooOo0O * 31) + this.f31438OooOo0o) * 31) + this.f31436OooOo;
    }

    public boolean isEmpty() {
        int i = this.f31436OooOo;
        int i2 = this.f31438OooOo0o;
        int i3 = this.f31437OooOo0O;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o00Oo0(this.f31437OooOo0O, this.f31438OooOo0o, this.f31436OooOo);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f31438OooOo0o;
        int i2 = this.f31437OooOo0O;
        int i3 = this.f31436OooOo;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
