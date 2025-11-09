package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class o0OoOo0 implements OooO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Class f28881OooOo0O;

    public o0OoOo0(Class jClass) {
        OooOo.OooO0o0(jClass, "jClass");
        this.f28881OooOo0O = jClass;
    }

    @Override // kotlin.jvm.internal.OooO
    public final Class OooO00o() {
        return this.f28881OooOo0O;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0OoOo0) {
            return OooOo.OooO00o(this.f28881OooOo0O, ((o0OoOo0) obj).f28881OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28881OooOo0O.hashCode();
    }

    public final String toString() {
        return this.f28881OooOo0O + " (Kotlin reflection is not available)";
    }
}
