package oo00o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OooOO0 implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f33185OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f33186OooOo0o;

    public OooOO0(Object obj, Object obj2) {
        this.f33185OooOo0O = obj;
        this.f33186OooOo0o = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO0 = (OooOO0) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f33185OooOo0O, oooOO0.f33185OooOo0O) && kotlin.jvm.internal.OooOo.OooO00o(this.f33186OooOo0o, oooOO0.f33186OooOo0o);
    }

    public final int hashCode() {
        Object obj = this.f33185OooOo0O;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f33186OooOo0o;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f33185OooOo0O + ", " + this.f33186OooOo0o + ')';
    }
}
