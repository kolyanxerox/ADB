package o000O00;

/* loaded from: classes2.dex */
public final class o0000O0 {

    /* renamed from: OooO, reason: collision with root package name */
    public String f29876OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f29877OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29878OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f29879OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f29880OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f29881OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f29882OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f29883OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f29884OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public byte f29885OooOO0;

    public final o0000O0O OooO00o() {
        String str;
        String str2;
        String str3;
        if (this.f29885OooOO0 == 63 && (str = this.f29878OooO0O0) != null && (str2 = this.f29884OooO0oo) != null && (str3 = this.f29876OooO) != null) {
            return new o0000O0O(this.f29877OooO00o, str, this.f29879OooO0OO, this.f29880OooO0Oo, this.f29882OooO0o0, this.f29881OooO0o, this.f29883OooO0oO, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f29885OooOO0 & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f29878OooO0O0 == null) {
            sb.append(" model");
        }
        if ((this.f29885OooOO0 & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.f29885OooOO0 & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.f29885OooOO0 & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.f29885OooOO0 & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.f29885OooOO0 & 32) == 0) {
            sb.append(" state");
        }
        if (this.f29884OooO0oo == null) {
            sb.append(" manufacturer");
        }
        if (this.f29876OooO == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
