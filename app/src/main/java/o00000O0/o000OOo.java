package o00000o0;

/* loaded from: classes2.dex */
public final class o000OOo extends o0O0O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f29279OooOo0O;

    public o000OOo(Object obj) {
        this.f29279OooOo0O = obj;
    }

    @Override // o00000o0.o0O0O00
    public final Object OooO00o() {
        return this.f29279OooOo0O;
    }

    @Override // o00000o0.o0O0O00
    public final boolean OooO0O0() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000OOo) {
            return this.f29279OooOo0O.equals(((o000OOo) obj).f29279OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29279OooOo0O.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f29279OooOo0O);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
