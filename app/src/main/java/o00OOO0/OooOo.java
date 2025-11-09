package o00OOO0;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class OooOo {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final OooOo f32182OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOo f32183OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f32184OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f32185OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f32186OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f32187OooO0Oo;

    static {
        OooOOO oooOOO = OooOOO.f32171OooOOo0;
        OooOOO oooOOO2 = OooOOO.f32170OooOOo;
        OooOOO oooOOO3 = OooOOO.f32172OooOOoo;
        OooOOO oooOOO4 = OooOOO.f32173OooOo00;
        OooOOO oooOOO5 = OooOOO.OooOo0;
        OooOOO oooOOO6 = OooOOO.f32165OooOO0O;
        OooOOO oooOOO7 = OooOOO.f32167OooOOO0;
        OooOOO oooOOO8 = OooOOO.OooOO0o;
        OooOOO oooOOO9 = OooOOO.f32166OooOOO;
        OooOOO oooOOO10 = OooOOO.f32169OooOOOo;
        OooOOO oooOOO11 = OooOOO.f32168OooOOOO;
        OooOOO[] oooOOOArr = {oooOOO, oooOOO2, oooOOO3, oooOOO4, oooOOO5, oooOOO6, oooOOO7, oooOOO8, oooOOO9, oooOOO10, oooOOO11};
        OooOOO[] oooOOOArr2 = {oooOOO, oooOOO2, oooOOO3, oooOOO4, oooOOO5, oooOOO6, oooOOO7, oooOOO8, oooOOO9, oooOOO10, oooOOO11, OooOOO.f32156OooO, OooOOO.f32164OooOO0, OooOOO.f32162OooO0oO, OooOOO.f32163OooO0oo, OooOOO.f32161OooO0o0, OooOOO.f32160OooO0o, OooOOO.f32159OooO0Oo};
        OooOo00 oooOo00 = new OooOo00(true);
        oooOo00.OooO0O0(oooOOOArr);
        o00000O o00000o = o00000O.TLS_1_3;
        o00000O o00000o2 = o00000O.TLS_1_2;
        oooOo00.OooO0Oo(o00000o, o00000o2);
        if (!oooOo00.f32188OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooOo00.f32191OooO0Oo = true;
        new OooOo(oooOo00);
        OooOo00 oooOo002 = new OooOo00(true);
        oooOo002.OooO0O0(oooOOOArr2);
        o00000O o00000o3 = o00000O.TLS_1_1;
        o00000O o00000o4 = o00000O.TLS_1_0;
        oooOo002.OooO0Oo(o00000o, o00000o2, o00000o3, o00000o4);
        if (!oooOo002.f32188OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooOo002.f32191OooO0Oo = true;
        f32183OooO0o0 = new OooOo(oooOo002);
        OooOo00 oooOo003 = new OooOo00(true);
        oooOo003.OooO0O0(oooOOOArr2);
        oooOo003.OooO0Oo(o00000o4);
        if (!oooOo003.f32188OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooOo003.f32191OooO0Oo = true;
        new OooOo(oooOo003);
        f32182OooO0o = new OooOo(new OooOo00(false));
    }

    public OooOo(OooOo00 oooOo00) {
        this.f32184OooO00o = oooOo00.f32188OooO00o;
        this.f32186OooO0OO = oooOo00.f32189OooO0O0;
        this.f32187OooO0Oo = oooOo00.f32190OooO0OO;
        this.f32185OooO0O0 = oooOo00.f32191OooO0Oo;
    }

    public final boolean OooO00o(SSLSocket sSLSocket) {
        if (!this.f32184OooO00o) {
            return false;
        }
        String[] strArr = this.f32187OooO0Oo;
        if (strArr != null) {
            if (!o00OOO0O.OooO0OO.OooOOOo(strArr, sSLSocket.getEnabledProtocols(), o00OOO0O.OooO0OO.f32347OooOOOO)) {
                return false;
            }
        }
        String[] strArr2 = this.f32186OooO0OO;
        if (strArr2 != null) {
            return o00OOO0O.OooO0OO.OooOOOo(strArr2, sSLSocket.getEnabledCipherSuites(), OooOOO.f32157OooO0O0);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        OooOo oooOo = (OooOo) obj;
        boolean z = oooOo.f32184OooO00o;
        boolean z2 = this.f32184OooO00o;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f32186OooO0OO, oooOo.f32186OooO0OO) && Arrays.equals(this.f32187OooO0Oo, oooOo.f32187OooO0Oo) && this.f32185OooO0O0 == oooOo.f32185OooO0O0;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f32184OooO00o) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f32186OooO0OO)) * 31) + Arrays.hashCode(this.f32187OooO0Oo)) * 31) + (!this.f32185OooO0O0 ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.f32184OooO00o) {
            return "ConnectionSpec()";
        }
        String string2 = "[all enabled]";
        String[] strArr = this.f32186OooO0OO;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(OooOOO.OooO00o(str));
            }
            string = Collections.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.f32187OooO0Oo;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(o00000O.OooO00o(str2));
            }
            string2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("ConnectionSpec(cipherSuites=", string, ", tlsVersions=", string2, ", supportsTlsExtensions=");
        sbOooOOo0.append(this.f32185OooO0O0);
        sbOooOOo0.append(")");
        return sbOooOOo0.toString();
    }
}
