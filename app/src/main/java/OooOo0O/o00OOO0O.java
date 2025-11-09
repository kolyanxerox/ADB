package oOooo0o;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public final class o00OOO0O extends o00OOOOo {
    public static o00OOO0O OooOOO() throws ClassNotFoundException {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new o00OOO0O();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider OooOOOO() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // oOooo0o.o00OOOOo
    public final String OooO(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // oOooo0o.o00OOOOo
    public final void OooO0o(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) o00OOOOo.OooO0O0(list).toArray(new String[0]));
        }
    }

    @Override // oOooo0o.o00OOOOo
    public final void OooO0o0(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // oOooo0o.o00OOOOo
    public final SSLContext OooO0oo() {
        try {
            return SSLContext.getInstance("TLSv1.3", OooOOOO());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", OooOOOO());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }
}
