package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o0000Ooo {

    /* renamed from: OooO, reason: collision with root package name */
    public o00O000 f29908OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f29909OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29910OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f29911OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f29912OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f29913OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Long f29914OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o0000O00 f29915OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o00O000o f29916OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public o0000O0O f29917OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public List f29918OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public byte f29919OooOOO0;

    public final o0000 OooO00o() {
        String str;
        String str2;
        o0000O00 o0000o00;
        if (this.f29919OooOOO0 == 7 && (str = this.f29909OooO00o) != null && (str2 = this.f29910OooO0O0) != null && (o0000o00 = this.f29915OooO0oO) != null) {
            return new o0000(str, str2, this.f29911OooO0OO, this.f29912OooO0Oo, this.f29914OooO0o0, this.f29913OooO0o, o0000o00, this.f29916OooO0oo, this.f29908OooO, this.f29917OooOO0, this.f29918OooOO0O, this.OooOO0o);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29909OooO00o == null) {
            sb.append(" generator");
        }
        if (this.f29910OooO0O0 == null) {
            sb.append(" identifier");
        }
        if ((this.f29919OooOOO0 & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f29919OooOOO0 & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f29915OooO0oO == null) {
            sb.append(" app");
        }
        if ((this.f29919OooOOO0 & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
