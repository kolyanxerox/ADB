package o00OOO;

import OooOOo0.o0OOO0o;
import OoooOOO.o0O0oo0o;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.api.internal.o0OoOo0;
import com.ironsource.InterfaceC3173h3;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.OooOo;
import o00OOO0.OooOO0O;
import o00OOO0.OooOOOO;
import o00OOO0.Oooo0;
import o00OOO0.o000000;
import o00OOO0.o00000O0;
import o00OOO0.o000OOo;
import o00OOO0.o00oO0o;
import o00OOO0.oo000o;
import o00OOOOo.OooOO0;
import o00OOOOo.OooOOO0;
import o00OOOOo.o000oOoO;
import o00OOOOo.o00Oo0;
import o00OOOOo.o0OO00O;
import o00OOOOo.o0Oo0oo;
import o00OOOoO.o0000;
import o00OOOoO.o000O;
import o00OOOoO.o000O0O0;
import o00OOOoO.o000OO0O;
import o00OOOoO.o00O000;
import oOooo0o.o00OOOOo;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooO0O0 extends o000oOoO {

    /* renamed from: OooO */
    public o000O0O0 f32107OooO;

    /* renamed from: OooO0O0 */
    public final OooOOOO f32108OooO0O0;

    /* renamed from: OooO0OO */
    public final o00000O0 f32109OooO0OO;

    /* renamed from: OooO0Oo */
    public Socket f32110OooO0Oo;

    /* renamed from: OooO0o */
    public Oooo0 f32111OooO0o;

    /* renamed from: OooO0o0 */
    public Socket f32112OooO0o0;

    /* renamed from: OooO0oO */
    public o00oO0o f32113OooO0oO;

    /* renamed from: OooO0oo */
    public o00Oo0 f32114OooO0oo;

    /* renamed from: OooOO0 */
    public o000OO0O f32115OooOO0;

    /* renamed from: OooOO0O */
    public boolean f32116OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO0 */
    public int f32118OooOOO0 = 1;

    /* renamed from: OooOOO */
    public final ArrayList f32117OooOOO = new ArrayList();

    /* renamed from: OooOOOO */
    public long f32119OooOOOO = LocationRequestCompat.PASSIVE_INTERVAL;

    public OooO0O0(OooOOOO oooOOOO, o00000O0 o00000o02) {
        this.f32108OooO0O0 = oooOOOO;
        this.f32109OooO0OO = o00000o02;
    }

    public final void OooO() throws SocketException {
        int i;
        int i2 = 1;
        this.f32112OooO0o0.setSoTimeout(0);
        o0OoOo0 o0oooo0 = new o0OoOo0();
        o0oooo0.f16751OooOoOO = o000oOoO.f32452OooO00o;
        o0oooo0.f16747OooOo0O = true;
        Socket socket = this.f32112OooO0o0;
        String str = this.f32109OooO0OO.f32229OooO00o.f32124OooO00o.f32296OooO0Oo;
        o000O0O0 o000o0o02 = this.f32107OooO;
        o000OO0O o000oo0o = this.f32115OooOO0;
        o0oooo0.f16748OooOo0o = socket;
        o0oooo0.f16746OooOo = str;
        o0oooo0.f16750OooOoO0 = o000o0o02;
        o0oooo0.f16749OooOoO = o000oo0o;
        o0oooo0.f16751OooOoOO = this;
        o00Oo0 o00oo0 = new o00Oo0(o0oooo0);
        this.f32114OooO0oo = o00oo0;
        o0OO00O o0oo00o = o00oo0.f32477Oooo0oo;
        synchronized (o0oo00o) {
            try {
                if (o0oo00o.f32497OooOoO) {
                    throw new IOException("closed");
                }
                if (o0oo00o.f32496OooOo0o) {
                    Logger logger = o0OO00O.f32493OooOoo0;
                    if (logger.isLoggable(Level.FINE)) {
                        String strOooO0o = OooOO0.f32421OooO00o.OooO0o();
                        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + strOooO0o);
                    }
                    o000OO0O o000oo0o2 = o0oo00o.f32495OooOo0O;
                    byte[] bArr2 = OooOO0.f32421OooO00o.f32555OooOo0O;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                    OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
                    o000oo0o2.OooO0O0(bArrCopyOf);
                    o0oo00o.f32495OooOo0O.flush();
                }
            } finally {
            }
        }
        o0OO00O o0oo00o2 = o00oo0.f32477Oooo0oo;
        OooO0oO.Oooo0 oooo0 = o00oo0.f32475Oooo0o0;
        synchronized (o0oo00o2) {
            try {
                if (o0oo00o2.f32497OooOoO) {
                    throw new IOException("closed");
                }
                o0oo00o2.OooO0OO(0, Integer.bitCount(oooo0.f13285OooOo0o) * 6, (byte) 4, (byte) 0);
                int i3 = 0;
                while (i3 < 10) {
                    if ((((i2 << i3) & oooo0.f13285OooOo0o) != 0 ? i2 : 0) == 0) {
                        i = i2;
                    } else {
                        int i4 = i3 == 4 ? 3 : i3 == 7 ? 4 : i3;
                        o000OO0O o000oo0o3 = o0oo00o2.f32495OooOo0O;
                        if (o000oo0o3.f32591OooOo) {
                            throw new IllegalStateException("closed");
                        }
                        o0000 o0000Var = o000oo0o3.f32593OooOo0o;
                        o000O o000oOooO0o0 = o0000Var.OooO0o0(2);
                        int i5 = o000oOooO0o0.f32565OooO0OO;
                        i = i2;
                        byte[] bArr3 = o000oOooO0o0.f32563OooO00o;
                        bArr3[i5] = (byte) ((i4 >>> 8) & 255);
                        bArr3[i5 + 1] = (byte) (i4 & 255);
                        o000oOooO0o0.f32565OooO0OO = i5 + 2;
                        o0000Var.f32535OooOo0o += 2;
                        o000oo0o3.OooO00o();
                        o0oo00o2.f32495OooOo0O.OooO0Oo(((int[]) oooo0.f13283OooOo)[i3]);
                    }
                    i3++;
                    i2 = i;
                }
                o0oo00o2.f32495OooOo0O.flush();
            } finally {
            }
        }
        if (o00oo0.f32475Oooo0o0.OooO0o0() != 65535) {
            o00oo0.f32477Oooo0oo.OooO(0, r0 - 65535);
        }
        new Thread(o00oo0.f32467Oooo).start();
    }

    @Override // o00OOOOo.o000oOoO
    public final void OooO00o(o00Oo0 o00oo0) {
        synchronized (this.f32108OooO0O0) {
            this.f32118OooOOO0 = o00oo0.OooO0Oo();
        }
    }

    @Override // o00OOOOo.o000oOoO
    public final void OooO0O0(o0Oo0oo o0oo0oo) {
        o0oo0oo.OooO0OO(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0087, code lost:
    
        r9 = r8.f32109OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x008d, code lost:
    
        if (r9.f32229OooO00o.f32131OooO0oo == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0097, code lost:
    
        if (r9.f32230OooO0O0.type() != java.net.Proxy.Type.HTTP) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x009b, code lost:
    
        if (r8.f32110OooO0Oo == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00aa, code lost:
    
        throw new o00OOO.OooO0OO(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00ad, code lost:
    
        if (r8.f32114OooO0oo == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00af, code lost:
    
        r9 = r8.f32108OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00b1, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00b2, code lost:
    
        r8.f32118OooOOO0 = r8.f32114OooO0oo.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00ba, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(int r9, int r10, int r11, boolean r12, o00OOO0.OooO0O0 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO.OooO0O0.OooO0OO(int, int, int, boolean, o00OOO0.OooO0O0):void");
    }

    public final void OooO0Oo(int i, int i2, o00OOO0.OooO0O0 oooO0O0) throws IOException {
        o00000O0 o00000o02 = this.f32109OooO0OO;
        Proxy proxy = o00000o02.f32230OooO0O0;
        InetSocketAddress inetSocketAddress = o00000o02.f32231OooO0OO;
        this.f32110OooO0Oo = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? o00000o02.f32229OooO00o.f32126OooO0OO.createSocket() : new Socket(proxy);
        oooO0O0.getClass();
        this.f32110OooO0Oo.setSoTimeout(i2);
        try {
            o00OOOOo.f33168OooO00o.OooO0oO(this.f32110OooO0Oo, inetSocketAddress, i);
            try {
                this.f32107OooO = o00Oo0oo.o00oO0o.OooO00o(o00Oo0oo.o00oO0o.OooOO0o(this.f32110OooO0Oo));
                this.f32115OooOO0 = new o000OO0O(o00Oo0oo.o00oO0o.OooOO0O(this.f32110OooO0Oo));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void OooO0o(o0O0oo0o o0o0oo0o, o00OOO0.OooO0O0 oooO0O0) throws Throwable {
        o00000O0 o00000o02 = this.f32109OooO0OO;
        o00OOO0.OooO00o oooO00o = o00000o02.f32229OooO00o;
        SSLSocketFactory sSLSocketFactory = oooO00o.f32131OooO0oo;
        o00oO0o o00oo0oOooO00o = o00oO0o.HTTP_1_1;
        if (sSLSocketFactory == null) {
            o00oO0o o00oo0o = o00oO0o.H2_PRIOR_KNOWLEDGE;
            if (!oooO00o.f32129OooO0o0.contains(o00oo0o)) {
                this.f32112OooO0o0 = this.f32110OooO0Oo;
                this.f32113OooO0oO = o00oo0oOooO00o;
                return;
            } else {
                this.f32112OooO0o0 = this.f32110OooO0Oo;
                this.f32113OooO0oO = o00oo0o;
                OooO();
                return;
            }
        }
        oooO0O0.getClass();
        o00OOO0.OooO00o oooO00o2 = o00000o02.f32229OooO00o;
        SSLSocketFactory sSLSocketFactory2 = oooO00o2.f32131OooO0oo;
        o00OOO0.o0OoOo0 o0oooo0 = oooO00o2.f32124OooO00o;
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory2.createSocket(this.f32110OooO0Oo, o0oooo0.f32296OooO0Oo, o0oooo0.f32298OooO0o0, true);
                try {
                    o00OOO0.OooOo oooOoOooO00o = o0o0oo0o.OooO00o(sSLSocket2);
                    String str = o0oooo0.f32296OooO0Oo;
                    boolean z = oooOoOooO00o.f32185OooO0O0;
                    if (z) {
                        o00OOOOo.f33168OooO00o.OooO0o(sSLSocket2, str, oooO00o2.f32129OooO0o0);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    Oooo0 oooo0OooO00o = Oooo0.OooO00o(session);
                    boolean zVerify = oooO00o2.f32123OooO.verify(str, session);
                    List list = oooo0OooO00o.f32194OooO0OO;
                    if (zVerify) {
                        oooO00o2.f32132OooOO0.OooO00o(str, list);
                        String strOooO = z ? o00OOOOo.f33168OooO00o.OooO(sSLSocket2) : null;
                        this.f32112OooO0o0 = sSLSocket2;
                        this.f32107OooO = o00Oo0oo.o00oO0o.OooO00o(o00Oo0oo.o00oO0o.OooOO0o(sSLSocket2));
                        this.f32115OooOO0 = new o000OO0O(o00Oo0oo.o00oO0o.OooOO0O(this.f32112OooO0o0));
                        this.f32111OooO0o = oooo0OooO00o;
                        if (strOooO != null) {
                            o00oo0oOooO00o = o00oO0o.OooO00o(strOooO);
                        }
                        this.f32113OooO0oO = o00oo0oOooO00o;
                        o00OOOOo.f33168OooO00o.OooO00o(sSLSocket2);
                        if (this.f32113OooO0oO == o00oO0o.HTTP_2) {
                            OooO();
                            return;
                        }
                        return;
                    }
                    if (list.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) list.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + OooOO0O.OooO0O0(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + o00OOOo.OooOOOO.OooO00o(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!o00OOO0O.OooO0OO.OooOOOO(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        o00OOOOo.f33168OooO00o.OooO00o(sSLSocket);
                    }
                    o00OOO0O.OooO0OO.OooO0o(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e2) {
            e = e2;
        }
    }

    public final void OooO0o0(int i, int i2, int i3, o00OOO0.OooO0O0 oooO0O0) throws IOException {
        o0OOO0o o0ooo0o = new o0OOO0o(19);
        o00000O0 o00000o02 = this.f32109OooO0OO;
        o00OOO0.o0OoOo0 o0oooo0 = o00000o02.f32229OooO00o.f32124OooO00o;
        if (o0oooo0 == null) {
            throw new NullPointerException("url == null");
        }
        o0ooo0o.f13518OooOo0o = o0oooo0;
        o0ooo0o.OooOO0o("CONNECT", null);
        o00OOO0.OooO00o oooO00o = o00000o02.f32229OooO00o;
        ((o000Ooo.o00oO0o) o0ooo0o.f13520OooOoO0).OooO0oo("Host", o00OOO0O.OooO0OO.OooOO0o(oooO00o.f32124OooO00o, true));
        ((o000Ooo.o00oO0o) o0ooo0o.f13520OooOoO0).OooO0oo("Proxy-Connection", "Keep-Alive");
        ((o000Ooo.o00oO0o) o0ooo0o.f13520OooOoO0).OooO0oo("User-Agent", "okhttp/3.12.13");
        o00OOO0.o0OO00O o0oo00oOooO0OO = o0ooo0o.OooO0OO();
        o000OOo o000ooo2 = new o000OOo();
        o000ooo2.f32233OooO00o = o0oo00oOooO0OO;
        o000ooo2.f32234OooO0O0 = o00oO0o.HTTP_1_1;
        o000ooo2.f32235OooO0OO = InterfaceC3173h3.a.b.f8801g;
        o000ooo2.f32236OooO0Oo = "Preemptive Authenticate";
        o000ooo2.f32239OooO0oO = o00OOO0O.OooO0OO.f32337OooO0OO;
        o000ooo2.f32242OooOO0O = -1L;
        o000ooo2.OooOO0o = -1L;
        o000ooo2.f32237OooO0o.OooO0oo("Proxy-Authenticate", "OkHttp-Preemptive");
        o000ooo2.OooO00o();
        oooO00o.f32127OooO0Oo.getClass();
        OooO0Oo(i, i2, oooO0O0);
        String str = "CONNECT " + o00OOO0O.OooO0OO.OooOO0o(o0oo00oOooO0OO.f32277OooO00o, true) + " HTTP/1.1";
        o000O0O0 o000o0o02 = this.f32107OooO;
        o00OOOO.OooOO0O oooOO0O = new o00OOOO.OooOO0O(null, null, o000o0o02, this.f32115OooOO0);
        o00O000 o00o000Timeout = o000o0o02.f32577OooOo0O.timeout();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00o000Timeout.OooO0oO(j);
        this.f32115OooOO0.f32592OooOo0O.timeout().OooO0oO(i3);
        oooOO0O.OooO0o(o0oo00oOooO0OO.f32279OooO0OO, str);
        oooOO0O.finishRequest();
        o000OOo responseHeaders = oooOO0O.readResponseHeaders(false);
        responseHeaders.f32233OooO00o = o0oo00oOooO0OO;
        o000000 o000000VarOooO00o = responseHeaders.OooO00o();
        long jOooO00o = o00OOOO0.OooO.OooO00o(o000000VarOooO00o);
        if (jOooO00o == -1) {
            jOooO00o = 0;
        }
        o00OOOO.OooO oooOOooO0Oo = oooOO0O.OooO0Oo(jOooO00o);
        o00OOO0O.OooO0OO.OooOOo0(oooOOooO0Oo, Integer.MAX_VALUE);
        oooOOooO0Oo.close();
        int i4 = o000000VarOooO00o.f32208OooOo;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(OooO0oO.OooOo.OooO0o(i4, "Unexpected response code for CONNECT: "));
            }
            oooO00o.f32127OooO0Oo.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f32107OooO.f32578OooOo0o.exhausted() || !this.f32115OooOO0.f32593OooOo0o.exhausted()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final boolean OooO0oO(o00OOO0.OooO00o oooO00o, o00000O0 o00000o02) {
        if (this.f32117OooOOO.size() >= this.f32118OooOOO0 || this.f32116OooOO0O) {
            return false;
        }
        o00OOO0.OooO0O0 oooO0O0 = o00OOO0.OooO0O0.f32137OooO0o0;
        o00000O0 o00000o03 = this.f32109OooO0OO;
        o00OOO0.OooO00o oooO00o2 = o00000o03.f32229OooO00o;
        oooO0O0.getClass();
        if (!oooO00o2.OooO00o(oooO00o)) {
            return false;
        }
        o00OOO0.o0OoOo0 o0oooo0 = oooO00o.f32124OooO00o;
        if (o0oooo0.f32296OooO0Oo.equals(o00000o03.f32229OooO00o.f32124OooO00o.f32296OooO0Oo)) {
            return true;
        }
        if (this.f32114OooO0oo == null || o00000o02 == null) {
            return false;
        }
        Proxy.Type type = o00000o02.f32230OooO0O0.type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || o00000o03.f32230OooO0O0.type() != type2) {
            return false;
        }
        if (!o00000o03.f32231OooO0OO.equals(o00000o02.f32231OooO0OO) || o00000o02.f32229OooO00o.f32123OooO != o00OOOo.OooOOOO.f32532OooO00o || !OooOO0(o0oooo0)) {
            return false;
        }
        try {
            oooO00o.f32132OooOO0.OooO00o(o0oooo0.f32296OooO0Oo, this.f32111OooO0o.f32194OooO0OO);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final o00OOOO0.OooO0OO OooO0oo(oo000o oo000oVar, o00OOOO0.OooOO0 oooOO0, OooO oooO) throws SocketException {
        if (this.f32114OooO0oo != null) {
            return new OooOOO0(oo000oVar, oooOO0, oooO, this.f32114OooO0oo);
        }
        Socket socket = this.f32112OooO0o0;
        int i = oooOO0.f32385OooOO0;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f32107OooO.f32577OooOo0O.timeout().OooO0oO(i);
        this.f32115OooOO0.f32592OooOo0O.timeout().OooO0oO(oooOO0.f32386OooOO0O);
        return new o00OOOO.OooOO0O(oo000oVar, oooO, this.f32107OooO, this.f32115OooOO0);
    }

    public final boolean OooOO0(o00OOO0.o0OoOo0 o0oooo0) {
        int i = o0oooo0.f32298OooO0o0;
        o00OOO0.o0OoOo0 o0oooo02 = this.f32109OooO0OO.f32229OooO00o.f32124OooO00o;
        if (i == o0oooo02.f32298OooO0o0) {
            String str = o0oooo0.f32296OooO0Oo;
            if (str.equals(o0oooo02.f32296OooO0Oo)) {
                return true;
            }
            Oooo0 oooo0 = this.f32111OooO0o;
            if (oooo0 != null && o00OOOo.OooOOOO.OooO0OO(str, (X509Certificate) oooo0.f32194OooO0OO.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        o00000O0 o00000o02 = this.f32109OooO0OO;
        sb.append(o00000o02.f32229OooO00o.f32124OooO00o.f32296OooO0Oo);
        sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb.append(o00000o02.f32229OooO00o.f32124OooO00o.f32298OooO0o0);
        sb.append(", proxy=");
        sb.append(o00000o02.f32230OooO0O0);
        sb.append(" hostAddress=");
        sb.append(o00000o02.f32231OooO0OO);
        sb.append(" cipherSuite=");
        Oooo0 oooo0 = this.f32111OooO0o;
        sb.append(oooo0 != null ? oooo0.f32193OooO0O0 : "none");
        sb.append(" protocol=");
        sb.append(this.f32113OooO0oO);
        sb.append('}');
        return sb.toString();
    }
}
