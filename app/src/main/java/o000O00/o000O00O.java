package o000O00;

/* loaded from: classes2.dex */
public final class o000O00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f29938OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29939OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f29940OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f29941OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public byte f29942OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f29943OooO0o0;

    public final o000O0 OooO00o() {
        String str;
        if (this.f29942OooO0o == 7 && (str = this.f29939OooO0O0) != null) {
            return new o000O0(this.f29938OooO00o, str, this.f29940OooO0OO, this.f29941OooO0Oo, this.f29943OooO0o0);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f29942OooO0o & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f29939OooO0O0 == null) {
            sb.append(" symbol");
        }
        if ((this.f29942OooO0o & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f29942OooO0o & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
