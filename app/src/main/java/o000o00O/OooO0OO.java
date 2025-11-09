package o000o00O;

import o000Oo.o0OO00O;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f30670OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f30671OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public String f30672OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public String f30673OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public byte f30674OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f30675OooO0o0;

    public final OooO0o OooO00o() {
        if (this.f30674OooO0o == 1 && this.f30670OooO00o != null && this.f30671OooO0O0 != null && this.f30672OooO0OO != null && this.f30673OooO0Oo != null) {
            return new OooO0o(this.f30670OooO00o, this.f30671OooO0O0, this.f30672OooO0OO, this.f30673OooO0Oo, this.f30675OooO0o0);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30670OooO00o == null) {
            sb.append(" rolloutId");
        }
        if (this.f30671OooO0O0 == null) {
            sb.append(" variantId");
        }
        if (this.f30672OooO0OO == null) {
            sb.append(" parameterKey");
        }
        if (this.f30673OooO0Oo == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f30674OooO0o) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }
}
