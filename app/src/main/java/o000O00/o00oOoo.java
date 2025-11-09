package o000O00;

/* loaded from: classes2.dex */
public final class o00oOoo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f30035OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f30036OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f30037OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f30038OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public byte f30039OooO0o0;

    public final o00O000 OooO00o() {
        String str;
        String str2;
        if (this.f30039OooO0o0 == 3 && (str = this.f30036OooO0O0) != null && (str2 = this.f30037OooO0OO) != null) {
            return new o00O000(str, this.f30035OooO00o, str2, this.f30038OooO0Oo);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f30039OooO0o0 & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f30036OooO0O0 == null) {
            sb.append(" version");
        }
        if (this.f30037OooO0OO == null) {
            sb.append(" buildVersion");
        }
        if ((this.f30039OooO0o0 & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
