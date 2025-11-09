package oOooo0o;

import OooO0oO.OooOo;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o00OOO0.o00oO0o;
import o00OOOo.OooOOO;
import o00OOOo.OooOOO0;
import o00OOOo.OooOo00;

/* loaded from: classes3.dex */
public class o00OOOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00OOOOo f33168OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f33169OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /* JADX WARN: Type inference failed for: r1v11, types: [oOooo0o.o00OOO0O] */
    /* JADX WARN: Type inference failed for: r1v15, types: [oOooo0o.o00OOOOo] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26, types: [oOooo0o.o00OOO0] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [oOooo0o.o00OOO0] */
    static {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oOooo0o.o00OOOOo.<clinit>():void");
    }

    public static ArrayList OooO0O0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o00oO0o o00oo0o = (o00oO0o) list.get(i);
            if (o00oo0o != o00oO0o.HTTP_1_0) {
                arrayList.add(o00oo0o.f32276OooOo0O);
            }
        }
        return arrayList;
    }

    public String OooO(SSLSocket sSLSocket) {
        return null;
    }

    public o0OO0O0 OooO0OO(X509TrustManager x509TrustManager) {
        return new OooOOO0(OooO0Oo(x509TrustManager));
    }

    public OooOo00 OooO0Oo(X509TrustManager x509TrustManager) {
        return new OooOOO(x509TrustManager.getAcceptedIssuers());
    }

    public void OooO0oO(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext OooO0oo() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public Object OooOO0() {
        if (f33169OooO0O0.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean OooOO0O(String str) {
        return true;
    }

    public void OooOO0o(int i, String str, Throwable th) {
        f33169OooO0O0.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void OooOOO0(String str, Object obj) {
        if (obj == null) {
            str = OooOo.OooOoo0(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        OooOO0o(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void OooO00o(SSLSocket sSLSocket) {
    }

    public void OooO0o0(SSLSocketFactory sSLSocketFactory) {
    }

    public void OooO0o(SSLSocket sSLSocket, String str, List list) {
    }
}
