package o00O0;

/* loaded from: classes3.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f31248OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f31249OooO0O0;

    public o0OOO0o(int i, Object obj) {
        this.f31248OooO00o = i;
        this.f31249OooO0O0 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o = (o0OOO0o) obj;
        return this.f31248OooO00o == o0ooo0o.f31248OooO00o && kotlin.jvm.internal.OooOo.OooO00o(this.f31249OooO0O0, o0ooo0o.f31249OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f31248OooO00o) * 31;
        Object obj = this.f31249OooO0O0;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f31248OooO00o + ", value=" + this.f31249OooO0O0 + ')';
    }
}
