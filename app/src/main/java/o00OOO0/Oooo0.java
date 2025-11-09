package o00OOO0;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class Oooo0 {

    /* renamed from: OooO00o */
    public final o00000O f32192OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOOO f32193OooO0O0;

    /* renamed from: OooO0OO */
    public final List f32194OooO0OO;

    /* renamed from: OooO0Oo */
    public final List f32195OooO0Oo;

    public Oooo0(o00000O o00000o, OooOOO oooOOO, List list, List list2) {
        this.f32192OooO00o = o00000o;
        this.f32193OooO0O0 = oooOOO;
        this.f32194OooO0OO = list;
        this.f32195OooO0Oo = list2;
    }

    public static Oooo0 OooO00o(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        OooOOO oooOOOOooO00o = OooOOO.OooO00o(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        o00000O o00000oOooO00o = o00000O.OooO00o(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listOooOOO0 = peerCertificates != null ? o00OOO0O.OooO0OO.OooOOO0(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new Oooo0(o00000oOooO00o, oooOOOOooO00o, listOooOOO0, localCertificates != null ? o00OOO0O.OooO0OO.OooOOO0(localCertificates) : Collections.EMPTY_LIST);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f32192OooO00o.equals(oooo0.f32192OooO00o) && this.f32193OooO0O0.equals(oooo0.f32193OooO0O0) && this.f32194OooO0OO.equals(oooo0.f32194OooO0OO) && this.f32195OooO0Oo.equals(oooo0.f32195OooO0Oo);
    }

    public final int hashCode() {
        return this.f32195OooO0Oo.hashCode() + ((this.f32194OooO0OO.hashCode() + ((this.f32193OooO0O0.hashCode() + ((this.f32192OooO00o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }
}
