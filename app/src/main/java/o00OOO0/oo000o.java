package o00OOO0;

import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import oOooo0o.o00OOOOo;

/* loaded from: classes3.dex */
public final class oo000o implements Cloneable {

    /* renamed from: OooOo */
    public final List f32304OooOo;

    /* renamed from: OooOo0O */
    public final C2051sk f32305OooOo0O;

    /* renamed from: OooOo0o */
    public final List f32306OooOo0o;

    /* renamed from: OooOoO */
    public final List f32307OooOoO;

    /* renamed from: OooOoO0 */
    public final List f32308OooOoO0;

    /* renamed from: OooOoOO */
    public final OooO0O0 f32309OooOoOO;

    /* renamed from: OooOoo */
    public final OooO0O0 f32310OooOoo;

    /* renamed from: OooOoo0 */
    public final ProxySelector f32311OooOoo0;

    /* renamed from: OooOooO */
    public final SocketFactory f32312OooOooO;

    /* renamed from: OooOooo */
    public final SSLSocketFactory f32313OooOooo;

    /* renamed from: Oooo */
    public final int f32314Oooo;

    /* renamed from: Oooo0 */
    public final OooO0O0 f32315Oooo0;

    /* renamed from: Oooo000 */
    public final o0OO0O0 f32316Oooo000;

    /* renamed from: Oooo00O */
    public final o00OOOo.OooOOOO f32317Oooo00O;

    /* renamed from: Oooo00o */
    public final OooOO0O f32318Oooo00o;

    /* renamed from: Oooo0O0 */
    public final OooO0O0 f32319Oooo0O0;

    /* renamed from: Oooo0OO */
    public final OooOOOO f32320Oooo0OO;

    /* renamed from: Oooo0o */
    public final boolean f32321Oooo0o;

    /* renamed from: Oooo0o0 */
    public final OooO0O0 f32322Oooo0o0;

    /* renamed from: Oooo0oO */
    public final boolean f32323Oooo0oO;

    /* renamed from: Oooo0oo */
    public final boolean f32324Oooo0oo;

    /* renamed from: OoooO0 */
    public final int f32325OoooO0;

    /* renamed from: OoooO00 */
    public final int f32326OoooO00;

    /* renamed from: OoooO0O */
    public static final List f32303OoooO0O = o00OOO0O.OooO0OO.OooOOO0(o00oO0o.HTTP_2, o00oO0o.HTTP_1_1);

    /* renamed from: OoooO */
    public static final List f32302OoooO = o00OOO0O.OooO0OO.OooOOO0(OooOo.f32183OooO0o0, OooOo.f32182OooO0o);

    static {
        OooO0O0.f32137OooO0o0 = new OooO0O0();
    }

    public oo000o() {
        this(new o00Ooo());
    }

    public oo000o(o00Ooo o00ooo2) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        boolean z;
        this.f32305OooOo0O = o00ooo2.f32249OooO00o;
        this.f32306OooOo0o = o00ooo2.f32250OooO0O0;
        List list = o00ooo2.f32251OooO0OO;
        this.f32304OooOo = list;
        this.f32308OooOoO0 = Collections.unmodifiableList(new ArrayList(o00ooo2.f32252OooO0Oo));
        this.f32307OooOoO = Collections.unmodifiableList(new ArrayList(o00ooo2.f32254OooO0o0));
        this.f32309OooOoOO = o00ooo2.f32253OooO0o;
        this.f32311OooOoo0 = o00ooo2.f32255OooO0oO;
        this.f32310OooOoo = o00ooo2.f32256OooO0oo;
        this.f32312OooOooO = o00ooo2.f32248OooO;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || ((OooOo) it.next()).f32184OooO00o) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = o00ooo2.f32257OooOO0;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            o00OOOOo o00ooooo = o00OOOOo.f33168OooO00o;
                            SSLContext sSLContextOooO0oo = o00ooooo.OooO0oo();
                            sSLContextOooO0oo.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f32313OooOooo = sSLContextOooO0oo.getSocketFactory();
                            this.f32316Oooo000 = o00ooooo.OooO0OO(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw o00OOO0O.OooO0OO.OooO00o(e, "No System TLS");
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw o00OOO0O.OooO0OO.OooO00o(e2, "No System TLS");
            }
        }
        this.f32313OooOooo = sSLSocketFactory;
        this.f32316Oooo000 = o00ooo2.f32258OooOO0O;
        SSLSocketFactory sSLSocketFactory2 = this.f32313OooOooo;
        if (sSLSocketFactory2 != null) {
            o00OOOOo.f33168OooO00o.OooO0o0(sSLSocketFactory2);
        }
        this.f32317Oooo00O = o00ooo2.OooOO0o;
        o0OO0O0 o0oo0o0 = this.f32316Oooo000;
        OooOO0O oooOO0O = o00ooo2.f32260OooOOO0;
        this.f32318Oooo00o = o00OOO0O.OooO0OO.OooOO0O(oooOO0O.f32155OooO0O0, o0oo0o0) ? oooOO0O : new OooOO0O(oooOO0O.f32154OooO00o, o0oo0o0);
        this.f32315Oooo0 = o00ooo2.f32259OooOOO;
        this.f32319Oooo0O0 = o00ooo2.f32261OooOOOO;
        this.f32320Oooo0OO = o00ooo2.f32262OooOOOo;
        this.f32322Oooo0o0 = o00ooo2.f32264OooOOo0;
        this.f32321Oooo0o = o00ooo2.f32263OooOOo;
        this.f32323Oooo0oO = o00ooo2.f32265OooOOoo;
        this.f32324Oooo0oo = o00ooo2.f32266OooOo00;
        this.f32314Oooo = o00ooo2.OooOo0;
        this.f32326OoooO00 = o00ooo2.f32267OooOo0O;
        this.f32325OoooO0 = o00ooo2.f32268OooOo0o;
        if (this.f32308OooOoO0.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f32308OooOoO0);
        }
        if (this.f32307OooOoO.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f32307OooOoO);
        }
    }
}
