package o000o00o;

/* loaded from: classes2.dex */
public final class o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f30845OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0 f30846OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final double f30847OooO0OO;

    public o00O0O(o0OoOo0 o0oooo0, o0OoOo0 o0oooo02, double d) {
        this.f30845OooO00o = o0oooo0;
        this.f30846OooO0O0 = o0oooo02;
        this.f30847OooO0OO = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o = (o00O0O) obj;
        return this.f30845OooO00o == o00o0o.f30845OooO00o && this.f30846OooO0O0 == o00o0o.f30846OooO0O0 && Double.compare(this.f30847OooO0OO, o00o0o.f30847OooO0OO) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f30847OooO0OO) + ((this.f30846OooO0O0.hashCode() + (this.f30845OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f30845OooO00o + ", crashlytics=" + this.f30846OooO0O0 + ", sessionSamplingRate=" + this.f30847OooO0OO + ')';
    }
}
