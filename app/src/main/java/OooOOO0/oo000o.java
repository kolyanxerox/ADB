package OooOOo0;

import android.util.Base64;

/* loaded from: classes2.dex */
public abstract class oo000o {
    public final OooOo OooO00o(OooOOO.OooO0OO oooO0OO) {
        OooOo oooOo = (OooOo) this;
        String str = oooOo.f13486OooO00o;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        if (oooO0OO != null) {
            return new OooOo(str, oooOo.f13487OooO0O0, oooO0OO);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        OooOo oooOo = (OooOo) this;
        byte[] bArr = oooOo.f13487OooO0O0;
        return "TransportContext(" + oooOo.f13486OooO00o + ", " + oooOo.f13488OooO0OO + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
