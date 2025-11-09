package o00OO0oo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class o00Oo0 implements o00OO0o.OooO, OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0o.OooO f32076OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f32077OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Set f32078OooO0OO;

    public o00Oo0(o00OO0o.OooO original) {
        Set setOooO00o;
        kotlin.jvm.internal.OooOo.OooO0o0(original, "original");
        this.f32076OooO00o = original;
        this.f32077OooO0O0 = original.OooO0oo() + '?';
        kotlin.jvm.internal.OooOo.OooO0o0(original, "<this>");
        if (original instanceof OooO) {
            setOooO00o = ((OooO) original).OooO00o();
        } else {
            HashSet hashSet = new HashSet(original.OooO0Oo());
            int iOooO0Oo = original.OooO0Oo();
            for (int i = 0; i < iOooO0Oo; i++) {
                hashSet.add(original.OooO0o0(i));
            }
            setOooO00o = hashSet;
        }
        this.f32078OooO0OO = setOooO00o;
    }

    @Override // o00OO0o.OooO
    public final boolean OooO(int i) {
        return this.f32076OooO00o.OooO(i);
    }

    @Override // o00OO0oo.OooO
    public final Set OooO00o() {
        return this.f32078OooO0OO;
    }

    @Override // o00OO0o.OooO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // o00OO0o.OooO
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        return this.f32076OooO00o.OooO0OO(name);
    }

    @Override // o00OO0o.OooO
    public final int OooO0Oo() {
        return this.f32076OooO00o.OooO0Oo();
    }

    @Override // o00OO0o.OooO
    public final List OooO0o(int i) {
        return this.f32076OooO00o.OooO0o(i);
    }

    @Override // o00OO0o.OooO
    public final String OooO0o0(int i) {
        return this.f32076OooO00o.OooO0o0(i);
    }

    @Override // o00OO0o.OooO
    public final o00OO0o.OooO OooO0oO(int i) {
        return this.f32076OooO00o.OooO0oO(i);
    }

    @Override // o00OO0o.OooO
    public final String OooO0oo() {
        return this.f32077OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00Oo0) {
            return kotlin.jvm.internal.OooOo.OooO00o(this.f32076OooO00o, ((o00Oo0) obj).f32076OooO00o);
        }
        return false;
    }

    @Override // o00OO0o.OooO
    public final List getAnnotations() {
        return this.f32076OooO00o.getAnnotations();
    }

    @Override // o00OO0o.OooO
    public final Oooo0o0.OooO getKind() {
        return this.f32076OooO00o.getKind();
    }

    public final int hashCode() {
        return this.f32076OooO00o.hashCode() * 31;
    }

    @Override // o00OO0o.OooO
    public final boolean isInline() {
        return this.f32076OooO00o.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32076OooO00o);
        sb.append('?');
        return sb.toString();
    }
}
