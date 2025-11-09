package o00O0o0O;

/* loaded from: classes3.dex */
public final class o00Ooo extends o00O0O implements o0OoOo0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final o00Ooo f31443OooOoO0 = new o00Ooo(1, 0, 1);

    @Override // o00O0o0O.o00O0O
    public final boolean equals(Object obj) {
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        if (isEmpty() && ((o00Ooo) obj).isEmpty()) {
            return true;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        if (this.f31437OooOo0O == o00ooo2.f31437OooOo0O) {
            return this.f31438OooOo0o == o00ooo2.f31438OooOo0o;
        }
        return false;
    }

    @Override // o00O0o0O.o0OoOo0
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f31438OooOo0o);
    }

    @Override // o00O0o0O.o0OoOo0
    public final Comparable getStart() {
        return Integer.valueOf(this.f31437OooOo0O);
    }

    @Override // o00O0o0O.o00O0O
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f31437OooOo0O * 31) + this.f31438OooOo0o;
    }

    @Override // o00O0o0O.o00O0O
    public final boolean isEmpty() {
        return this.f31437OooOo0O > this.f31438OooOo0o;
    }

    @Override // o00O0o0O.o00O0O
    public final String toString() {
        return this.f31437OooOo0O + ".." + this.f31438OooOo0o;
    }
}
