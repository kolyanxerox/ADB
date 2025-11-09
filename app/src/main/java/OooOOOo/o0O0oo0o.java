package OoooOOO;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import o00OOO0.OooO0O0;
import o00OOO0.OooOOO;
import o00OOO0.OooOOO0;
import o00OOO0.OooOo;
import o00OOO0.OooOo00;
import o00OOO0O.OooO0OO;

/* loaded from: classes2.dex */
public final class o0O0oo0o {

    /* renamed from: OooO00o */
    public int f14472OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f14473OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f14474OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f14475OooO0Oo;

    public o0O0oo0o(o0O0O0o0 o0o0o0o0, int i, boolean z, boolean z2) {
        Objects.requireNonNull(o0o0o0o0);
        this.f14475OooO0Oo = o0o0o0o0;
        this.f14472OooO00o = i;
        this.f14473OooO0O0 = z;
        this.f14474OooO0OO = z2;
    }

    public OooOo OooO00o(SSLSocket sSLSocket) throws UnknownServiceException {
        OooOo oooOo;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        boolean z2 = true;
        int i = this.f14472OooO00o;
        List list = (List) this.f14475OooO0Oo;
        int size = list.size();
        while (true) {
            if (i >= size) {
                oooOo = null;
                break;
            }
            oooOo = (OooOo) list.get(i);
            if (oooOo.OooO00o(sSLSocket)) {
                this.f14472OooO00o = i + 1;
                break;
            }
            i++;
        }
        if (oooOo == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14474OooO0OO + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i2 = this.f14472OooO00o;
        while (true) {
            if (i2 >= list.size()) {
                z = false;
                break;
            }
            if (((OooOo) list.get(i2)).OooO00o(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f14473OooO0O0 = z;
        OooO0O0 oooO0O0 = OooO0O0.f32137OooO0o0;
        boolean z3 = this.f14474OooO0OO;
        oooO0O0.getClass();
        String[] strArr = oooOo.f32186OooO0OO;
        if (strArr != null) {
            enabledCipherSuites = OooO0OO.OooOOO(sSLSocket.getEnabledCipherSuites(), strArr, OooOOO.f32157OooO0O0);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = oooOo.f32187OooO0Oo;
        if (strArr2 != null) {
            enabledProtocols = OooO0OO.OooOOO(sSLSocket.getEnabledProtocols(), strArr2, OooO0OO.f32347OooOOOO);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        OooOOO0 oooOOO0 = OooOOO.f32157OooO0O0;
        byte[] bArr = OooO0OO.f32335OooO00o;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            boolean z4 = z2;
            if (oooOOO0.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
            z2 = z4;
        }
        if (z3 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            int length2 = enabledCipherSuites.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
            strArr3[length2] = str;
            enabledCipherSuites = strArr3;
        }
        OooOo00 oooOo00 = new OooOo00();
        oooOo00.f32188OooO00o = oooOo.f32184OooO00o;
        oooOo00.f32189OooO0O0 = strArr;
        oooOo00.f32190OooO0OO = strArr2;
        oooOo00.f32191OooO0Oo = oooOo.f32185OooO0O0;
        oooOo00.OooO00o(enabledCipherSuites);
        oooOo00.OooO0OO(enabledProtocols);
        OooOo oooOo2 = new OooOo(oooOo00);
        String[] strArr4 = oooOo2.f32187OooO0Oo;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = oooOo2.f32186OooO0OO;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return oooOo;
    }

    public void OooO0O0(String str) {
        ((o0O0O0o0) this.f14475OooO0Oo).OooOo00(this.f14472OooO00o, this.f14473OooO0O0, this.f14474OooO0OO, str, null, null, null);
    }

    public void OooO0OO(Object obj, String str) {
        ((o0O0O0o0) this.f14475OooO0Oo).OooOo00(this.f14472OooO00o, this.f14473OooO0O0, this.f14474OooO0OO, str, obj, null, null);
    }

    public void OooO0Oo(Object obj, String str, Object obj2) {
        ((o0O0O0o0) this.f14475OooO0Oo).OooOo00(this.f14472OooO00o, this.f14473OooO0O0, this.f14474OooO0OO, str, obj, obj2, null);
    }

    public void OooO0o0(String str, Object obj, Object obj2, Object obj3) {
        ((o0O0O0o0) this.f14475OooO0Oo).OooOo00(this.f14472OooO00o, this.f14473OooO0O0, this.f14474OooO0OO, str, obj, obj2, obj3);
    }

    public o0O0oo0o(List list) {
        this.f14472OooO00o = 0;
        this.f14475OooO0Oo = list;
    }
}
