package o000O00;

/* loaded from: classes2.dex */
public final class o0O0O00 {

    /* renamed from: OooO */
    public String f30040OooO;

    /* renamed from: OooO00o */
    public String f30041OooO00o;

    /* renamed from: OooO0O0 */
    public String f30042OooO0O0;

    /* renamed from: OooO0OO */
    public int f30043OooO0OO;

    /* renamed from: OooO0Oo */
    public String f30044OooO0Oo;

    /* renamed from: OooO0o */
    public String f30045OooO0o;

    /* renamed from: OooO0o0 */
    public String f30046OooO0o0;

    /* renamed from: OooO0oO */
    public String f30047OooO0oO;

    /* renamed from: OooO0oo */
    public String f30048OooO0oo;

    /* renamed from: OooOO0 */
    public o0000 f30049OooOO0;

    /* renamed from: OooOO0O */
    public o00000O f30050OooOO0O;
    public o000000O OooOO0o;

    /* renamed from: OooOOO0 */
    public byte f30051OooOOO0;

    public final o000OOo OooO00o() {
        if (this.f30051OooOOO0 == 1 && this.f30041OooO00o != null && this.f30042OooO0O0 != null && this.f30044OooO0Oo != null && this.f30048OooO0oo != null && this.f30040OooO != null) {
            return new o000OOo(this.f30041OooO00o, this.f30042OooO0O0, this.f30043OooO0OO, this.f30044OooO0Oo, this.f30046OooO0o0, this.f30045OooO0o, this.f30047OooO0oO, this.f30048OooO0oo, this.f30040OooO, this.f30049OooOO0, this.f30050OooOO0O, this.OooOO0o);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30041OooO00o == null) {
            sb.append(" sdkVersion");
        }
        if (this.f30042OooO0O0 == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f30051OooOOO0) == 0) {
            sb.append(" platform");
        }
        if (this.f30044OooO0Oo == null) {
            sb.append(" installationUuid");
        }
        if (this.f30048OooO0oo == null) {
            sb.append(" buildVersion");
        }
        if (this.f30040OooO == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(o000Oo.o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
