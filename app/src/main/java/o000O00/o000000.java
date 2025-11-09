package o000O00;

import java.util.List;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO, reason: collision with root package name */
    public List f29845OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f29846OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f29847OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f29848OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f29849OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f29850OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f29851OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f29852OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f29853OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public byte f29854OooOO0;

    public final o000000O OooO00o() {
        String str;
        if (this.f29854OooOO0 == 63 && (str = this.f29847OooO0O0) != null) {
            return new o000000O(this.f29846OooO00o, str, this.f29848OooO0OO, this.f29849OooO0Oo, this.f29851OooO0o0, this.f29850OooO0o, this.f29852OooO0oO, this.f29853OooO0oo, this.f29845OooO);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f29854OooOO0 & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f29847OooO0O0 == null) {
            sb.append(" processName");
        }
        if ((this.f29854OooOO0 & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f29854OooOO0 & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f29854OooOO0 & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f29854OooOO0 & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f29854OooOO0 & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
