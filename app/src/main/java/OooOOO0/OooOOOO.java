package OooOOo0;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class OooOOOO {

    /* renamed from: OooO, reason: collision with root package name */
    public byte[] f13476OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f13477OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public Integer f13478OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o000oOoO f13479OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Long f13480OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public HashMap f13481OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Long f13482OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public Integer f13483OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public String f13484OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public byte[] f13485OooOO0;

    public final void OooO00o(String str, String str2) {
        HashMap map = this.f13481OooO0o;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public final OooOo00 OooO0O0() {
        String strOooOoo0 = this.f13477OooO00o == null ? " transportName" : "";
        if (this.f13479OooO0OO == null) {
            strOooOoo0 = strOooOoo0.concat(" encodedPayload");
        }
        if (this.f13480OooO0Oo == null) {
            strOooOoo0 = OooO0oO.OooOo.OooOoo0(strOooOoo0, " eventMillis");
        }
        if (this.f13482OooO0o0 == null) {
            strOooOoo0 = OooO0oO.OooOo.OooOoo0(strOooOoo0, " uptimeMillis");
        }
        if (this.f13481OooO0o == null) {
            strOooOoo0 = OooO0oO.OooOo.OooOoo0(strOooOoo0, " autoMetadata");
        }
        if (strOooOoo0.isEmpty()) {
            return new OooOo00(this.f13477OooO00o, this.f13478OooO0O0, this.f13479OooO0OO, this.f13480OooO0Oo.longValue(), this.f13482OooO0o0.longValue(), this.f13481OooO0o, this.f13483OooO0oO, this.f13484OooO0oo, this.f13476OooO, this.f13485OooOO0);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooOoo0));
    }
}
