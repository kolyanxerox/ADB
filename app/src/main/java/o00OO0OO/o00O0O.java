package o00OO0oo;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.List;
import o00O0.oo000o;

/* loaded from: classes3.dex */
public final class o00O0O implements o00OO0o.OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f32074OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO0o.OooO0o f32075OooO0O0;

    public o00O0O(String str, o00OO0o.OooO0o kind) {
        kotlin.jvm.internal.OooOo.OooO0o0(kind, "kind");
        this.f32074OooO00o = str;
        this.f32075OooO0O0 = kind;
    }

    @Override // o00OO0o.OooO
    public final boolean OooO(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o00OO0o.OooO
    public final boolean OooO0O0() {
        return false;
    }

    @Override // o00OO0o.OooO
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o00OO0o.OooO
    public final int OooO0Oo() {
        return 0;
    }

    @Override // o00OO0o.OooO
    public final List OooO0o(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o00OO0o.OooO
    public final String OooO0o0(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o00OO0o.OooO
    public final o00OO0o.OooO OooO0oO(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o00OO0o.OooO
    public final String OooO0oo() {
        return this.f32074OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o = (o00O0O) obj;
        if (kotlin.jvm.internal.OooOo.OooO00o(this.f32074OooO00o, o00o0o.f32074OooO00o)) {
            if (kotlin.jvm.internal.OooOo.OooO00o(this.f32075OooO0O0, o00o0o.f32075OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OO0o.OooO
    public final List getAnnotations() {
        return oo000o.f31251OooOo0O;
    }

    @Override // o00OO0o.OooO
    public final Oooo0o0.OooO getKind() {
        return this.f32075OooO0O0;
    }

    public final int hashCode() {
        return (this.f32075OooO0O0.hashCode() * 31) + this.f32074OooO00o.hashCode();
    }

    @Override // o00OO0o.OooO
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return OooO00o.OooO0oO(')', this.f32074OooO00o, new StringBuilder("PrimitiveDescriptor("));
    }
}
