package OooOOo0;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooOo extends oo000o {

    /* renamed from: OooO00o */
    public final String f13486OooO00o;

    /* renamed from: OooO0O0 */
    public final byte[] f13487OooO0O0;

    /* renamed from: OooO0OO */
    public final OooOOO.OooO0OO f13488OooO0OO;

    public OooOo(String str, byte[] bArr, OooOOO.OooO0OO oooO0OO) {
        this.f13486OooO00o = str;
        this.f13487OooO0O0 = bArr;
        this.f13488OooO0OO = oooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo000o) {
            oo000o oo000oVar = (oo000o) obj;
            if (this.f13486OooO00o.equals(((OooOo) oo000oVar).f13486OooO00o)) {
                if (Arrays.equals(this.f13487OooO0O0, (oo000oVar instanceof OooOo ? (OooOo) oo000oVar : (OooOo) oo000oVar).f13487OooO0O0) && this.f13488OooO0OO.equals(((OooOo) oo000oVar).f13488OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13486OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13487OooO0O0)) * 1000003) ^ this.f13488OooO0OO.hashCode();
    }
}
