package o000OOO;

/* loaded from: classes2.dex */
public final class OooO00o implements OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f30243OooO00o;

    public OooO00o(int i) {
        this.f30243OooO00o = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return OooO0o.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) ((OooO0o) obj);
        if (this.f30243OooO00o != oooO00o.f30243OooO00o) {
            return false;
        }
        Object obj2 = OooO0OO.f30245OooOo0O;
        oooO00o.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f30243OooO00o) + (OooO0OO.f30245OooOo0O.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f30243OooO00o + "intEncoding=" + OooO0OO.f30245OooOo0O + ')';
    }
}
