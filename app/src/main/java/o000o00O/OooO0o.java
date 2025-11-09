package o000o00O;

import OooO0oO.OooOo;

/* loaded from: classes2.dex */
public final class OooO0o extends OooOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30676OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30677OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30678OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f30679OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f30680OooO0o0;

    public OooO0o(String str, String str2, String str3, String str4, long j) {
        this.f30676OooO0O0 = str;
        this.f30677OooO0OO = str2;
        this.f30678OooO0Oo = str3;
        this.f30680OooO0o0 = str4;
        this.f30679OooO0o = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0) {
            OooOO0 oooOO0 = (OooOO0) obj;
            if (this.f30676OooO0O0.equals(((OooO0o) oooOO0).f30676OooO0O0)) {
                OooO0o oooO0o = (OooO0o) oooOO0;
                if (this.f30677OooO0OO.equals(oooO0o.f30677OooO0OO) && this.f30678OooO0Oo.equals(oooO0o.f30678OooO0Oo) && this.f30680OooO0o0.equals(oooO0o.f30680OooO0o0) && this.f30679OooO0o == oooO0o.f30679OooO0o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f30676OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f30677OooO0OO.hashCode()) * 1000003) ^ this.f30678OooO0Oo.hashCode()) * 1000003) ^ this.f30680OooO0o0.hashCode()) * 1000003;
        long j = this.f30679OooO0o;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f30676OooO0O0);
        sb.append(", variantId=");
        sb.append(this.f30677OooO0OO);
        sb.append(", parameterKey=");
        sb.append(this.f30678OooO0Oo);
        sb.append(", parameterValue=");
        sb.append(this.f30680OooO0o0);
        sb.append(", templateVersion=");
        return OooOo.OooOOOO(sb, this.f30679OooO0o, "}");
    }
}
