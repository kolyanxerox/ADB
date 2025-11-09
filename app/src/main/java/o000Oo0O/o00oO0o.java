package o000Oo0o;

import o000Oo.o0OO00O;

/* loaded from: classes2.dex */
public final class o00oO0o {

    /* renamed from: OooO00o */
    public String f30394OooO00o;

    /* renamed from: OooO0O0 */
    public int f30395OooO0O0;

    /* renamed from: OooO0OO */
    public String f30396OooO0OO;

    /* renamed from: OooO0Oo */
    public String f30397OooO0Oo;

    /* renamed from: OooO0o */
    public long f30398OooO0o;

    /* renamed from: OooO0o0 */
    public long f30399OooO0o0;

    /* renamed from: OooO0oO */
    public String f30400OooO0oO;

    /* renamed from: OooO0oo */
    public byte f30401OooO0oo;

    public final o0ooOOo OooO00o() {
        if (this.f30401OooO0oo == 3 && this.f30395OooO0O0 != 0) {
            return new o0ooOOo(this.f30394OooO00o, this.f30395OooO0O0, this.f30396OooO0OO, this.f30397OooO0Oo, this.f30399OooO0o0, this.f30398OooO0o, this.f30400OooO0oO);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30395OooO0O0 == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f30401OooO0oo & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f30401OooO0oo & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
