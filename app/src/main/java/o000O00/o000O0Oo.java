package o000O00;

/* loaded from: classes2.dex */
public final class o000O0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f29951OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f29952OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f29953OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f29954OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public byte f29955OooO0o0;

    public final o000OO0O OooO00o() {
        String str;
        if (this.f29955OooO0o0 == 7 && (str = this.f29951OooO00o) != null) {
            return new o000OO0O(str, this.f29952OooO0O0, this.f29953OooO0OO, this.f29954OooO0Oo);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29951OooO00o == null) {
            sb.append(" processName");
        }
        if ((this.f29955OooO0o0 & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f29955OooO0o0 & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f29955OooO0o0 & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
