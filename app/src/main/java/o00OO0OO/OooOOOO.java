package o00OO0oo;

import java.util.List;
import o00O0.oo000o;
import o00O0oO.o0000;

/* loaded from: classes3.dex */
public final class OooOOOO implements o00OO0o.OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0o.OooO f32063OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO0o.OooO f32064OooO0O0;

    public OooOOOO(o00OO0o.OooO keyDesc, o00OO0o.OooO valueDesc) {
        kotlin.jvm.internal.OooOo.OooO0o0(keyDesc, "keyDesc");
        kotlin.jvm.internal.OooOo.OooO0o0(valueDesc, "valueDesc");
        this.f32063OooO00o = keyDesc;
        this.f32064OooO0O0 = valueDesc;
    }

    @Override // o00OO0o.OooO
    public final boolean OooO(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // o00OO0o.OooO
    public final boolean OooO0O0() {
        return false;
    }

    @Override // o00OO0o.OooO
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        Integer numOooOoOO = o0000.OooOoOO(name);
        if (numOooOoOO != null) {
            return numOooOoOO.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // o00OO0o.OooO
    public final int OooO0Oo() {
        return 2;
    }

    @Override // o00OO0o.OooO
    public final List OooO0o(int i) {
        if (i >= 0) {
            return oo000o.f31251OooOo0O;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // o00OO0o.OooO
    public final String OooO0o0(int i) {
        return String.valueOf(i);
    }

    @Override // o00OO0o.OooO
    public final o00OO0o.OooO OooO0oO(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f32063OooO00o;
        }
        if (i2 == 1) {
            return this.f32064OooO0O0;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // o00OO0o.OooO
    public final String OooO0oo() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        oooOOOO.getClass();
        return kotlin.jvm.internal.OooOo.OooO00o(this.f32063OooO00o, oooOOOO.f32063OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f32064OooO0O0, oooOOOO.f32064OooO0O0);
    }

    @Override // o00OO0o.OooO
    public final List getAnnotations() {
        return oo000o.f31251OooOo0O;
    }

    @Override // o00OO0o.OooO
    public final Oooo0o0.OooO getKind() {
        return o00OO0o.OooOO0O.f32050OooOoOO;
    }

    public final int hashCode() {
        return this.f32064OooO0O0.hashCode() + ((this.f32063OooO00o.hashCode() + 710441009) * 31);
    }

    @Override // o00OO0o.OooO
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f32063OooO00o + ", " + this.f32064OooO0O0 + ')';
    }
}
