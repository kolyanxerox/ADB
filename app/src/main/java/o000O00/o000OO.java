package o000O00;

/* loaded from: classes2.dex */
public final class o000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f29961OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29962OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o0000OO0 f29963OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public o000O f29964OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o0O0ooO f29965OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public o000OO00 f29966OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public byte f29967OooO0oO;

    public final o0000O OooO00o() {
        String str;
        o0000OO0 o0000oo02;
        o000O o000o;
        if (this.f29967OooO0oO == 1 && (str = this.f29962OooO0O0) != null && (o0000oo02 = this.f29963OooO0OO) != null && (o000o = this.f29964OooO0Oo) != null) {
            return new o0000O(this.f29961OooO00o, str, o0000oo02, o000o, this.f29966OooO0o0, this.f29965OooO0o);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f29967OooO0oO) == 0) {
            sb.append(" timestamp");
        }
        if (this.f29962OooO0O0 == null) {
            sb.append(" type");
        }
        if (this.f29963OooO0OO == null) {
            sb.append(" app");
        }
        if (this.f29964OooO0Oo == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
