package o000O00;

/* loaded from: classes2.dex */
public final class o000O0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Double f29944OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f29945OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f29946OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f29947OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f29948OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f29949OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public byte f29950OooO0oO;

    public final o000O OooO00o() {
        if (this.f29950OooO0oO == 31) {
            return new o000O(this.f29944OooO00o, this.f29945OooO0O0, this.f29946OooO0OO, this.f29947OooO0Oo, this.f29949OooO0o0, this.f29948OooO0o);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f29950OooO0oO & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f29950OooO0oO & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f29950OooO0oO & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f29950OooO0oO & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f29950OooO0oO & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
