package o000O00;

/* loaded from: classes2.dex */
public final class o000OO0O extends o00OO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f29969OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29970OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29971OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f29972OooO0Oo;

    public o000OO0O(String str, int i, int i2, boolean z) {
        this.f29969OooO00o = str;
        this.f29970OooO0O0 = i;
        this.f29971OooO0OO = i2;
        this.f29972OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00OO0O0) {
            o00OO0O0 o00oo0o0 = (o00OO0O0) obj;
            if (this.f29969OooO00o.equals(((o000OO0O) o00oo0o0).f29969OooO00o)) {
                o000OO0O o000oo0o = (o000OO0O) o00oo0o0;
                if (this.f29970OooO0O0 == o000oo0o.f29970OooO0O0 && this.f29971OooO0OO == o000oo0o.f29971OooO0OO && this.f29972OooO0Oo == o000oo0o.f29972OooO0Oo) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f29969OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f29970OooO0O0) * 1000003) ^ this.f29971OooO0OO) * 1000003) ^ (this.f29972OooO0Oo ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f29969OooO00o + ", pid=" + this.f29970OooO0O0 + ", importance=" + this.f29971OooO0OO + ", defaultProcess=" + this.f29972OooO0Oo + "}";
    }
}
