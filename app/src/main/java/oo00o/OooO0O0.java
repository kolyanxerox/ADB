package oo00o;

/* loaded from: classes3.dex */
public final class OooO0O0 implements Comparable {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0O0 f33180OooOo0o = new OooO0O0();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f33181OooOo0O = 131584;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        OooO0O0 other = (OooO0O0) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(other, "other");
        return this.f33181OooOo0O - other.f33181OooOo0O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OooO0O0 oooO0O0 = obj instanceof OooO0O0 ? (OooO0O0) obj : null;
        return oooO0O0 != null && this.f33181OooOo0O == oooO0O0.f33181OooOo0O;
    }

    public final int hashCode() {
        return this.f33181OooOo0O;
    }

    public final String toString() {
        return "2.2.0";
    }
}
