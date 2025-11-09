package o000O00;

/* loaded from: classes2.dex */
public final class o000OOo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public o00O0000 f29984OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29985OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f29986OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f29987OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public byte f29988OooO0o0;

    public final o00 OooO00o() {
        o00O0000 o00o0000;
        String str;
        String str2;
        if (this.f29988OooO0o0 == 1 && (o00o0000 = this.f29984OooO00o) != null && (str = this.f29985OooO0O0) != null && (str2 = this.f29986OooO0OO) != null) {
            return new o00(o00o0000, str, str2, this.f29987OooO0Oo);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29984OooO00o == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f29985OooO0O0 == null) {
            sb.append(" parameterKey");
        }
        if (this.f29986OooO0OO == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f29988OooO0o0) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
