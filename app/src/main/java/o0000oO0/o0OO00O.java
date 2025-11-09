package o0000oo0;

/* loaded from: classes2.dex */
public final class o0OO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO f29677OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f29678OooO0O0;

    public o0OO00O(o00000OO o00000oo2, boolean z) {
        this.f29677OooO00o = o00000oo2;
        this.f29678OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0OO00O) {
            o0OO00O o0oo00o = (o0OO00O) obj;
            if (o0oo00o.f29677OooO00o.equals(this.f29677OooO00o) && o0oo00o.f29678OooO0O0 == this.f29678OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29677OooO00o.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f29678OooO0O0).hashCode();
    }
}
