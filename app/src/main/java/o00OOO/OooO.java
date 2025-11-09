package o00OOO;

import com.google.android.gms.internal.ads.C1765ku;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import o000Oo0.o000oOoO;
import o000Ooo.o00oO0o;
import o00OOO0.OooOOOO;
import o00OOO0.o00000O0;
import o00OOO0.o0Oo0oo;
import o00OOO0.o0OoOo0;
import o00OOOOo.o000000;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooO {

    /* renamed from: OooO, reason: collision with root package name */
    public int f32092OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00OOO0.OooO00o f32093OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public o000oOoO f32094OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o00000O0 f32095OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOOO f32096OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o00OOO0.OooO0O0 f32097OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o0Oo0oo f32098OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Object f32099OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final C1765ku f32100OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public OooO0O0 f32101OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f32102OooOO0O;
    public boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public o00OOOO0.OooO0OO f32103OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public boolean f32104OooOOO0;

    public OooO(OooOOOO oooOOOO, o00OOO0.OooO00o oooO00o, o0Oo0oo o0oo0oo, o00OOO0.OooO0O0 oooO0O0, Object obj) {
        this.f32096OooO0Oo = oooOOOO;
        this.f32093OooO00o = oooO00o;
        this.f32098OooO0o0 = o0oo0oo;
        this.f32097OooO0o = oooO0O0;
        o00OOO0.OooO0O0.f32137OooO0o0.getClass();
        o00oO0o o00oo0o = oooOOOO.f32181OooO0o0;
        C1765ku c1765ku = new C1765ku();
        List list = Collections.EMPTY_LIST;
        c1765ku.f20687OooO0o0 = list;
        c1765ku.f20686OooO0o = list;
        c1765ku.f20688OooO0oO = new ArrayList();
        c1765ku.f20683OooO0O0 = oooO00o;
        c1765ku.f20684OooO0OO = o00oo0o;
        c1765ku.f20685OooO0Oo = oooO0O0;
        List<Proxy> listSelect = oooO00o.f32130OooO0oO.select(oooO00o.f32124OooO00o.OooOO0O());
        c1765ku.f20687OooO0o0 = (listSelect == null || listSelect.isEmpty()) ? o00OOO0O.OooO0OO.OooOOO0(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(listSelect));
        c1765ku.f20682OooO00o = 0;
        this.f32100OooO0oo = c1765ku;
        this.f32099OooO0oO = obj;
    }

    public final synchronized OooO0O0 OooO00o() {
        return this.f32101OooOO0;
    }

    public final Socket OooO0O0(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f32103OooOOO = null;
        }
        if (z2) {
            this.OooOO0o = true;
        }
        OooO0O0 oooO0O0 = this.f32101OooOO0;
        if (oooO0O0 != null) {
            if (z) {
                oooO0O0.f32116OooOO0O = true;
            }
            if (this.f32103OooOOO == null && (this.OooOO0o || oooO0O0.f32116OooOO0O)) {
                ArrayList arrayList = oooO0O0.f32117OooOOO;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f32101OooOO0.f32117OooOOO.isEmpty()) {
                            this.f32101OooOO0.f32119OooOOOO = System.nanoTime();
                            o00OOO0.OooO0O0 oooO0O02 = o00OOO0.OooO0O0.f32137OooO0o0;
                            OooO0O0 oooO0O03 = this.f32101OooOO0;
                            oooO0O02.getClass();
                            OooOOOO oooOOOO = this.f32096OooO0Oo;
                            oooOOOO.getClass();
                            if (oooO0O03.f32116OooOO0O || oooOOOO.f32176OooO00o == 0) {
                                oooOOOO.f32179OooO0Oo.remove(oooO0O03);
                                socket = this.f32101OooOO0.f32112OooO0o0;
                            } else {
                                oooOOOO.notifyAll();
                                socket = null;
                            }
                        } else {
                            socket = null;
                        }
                        this.f32101OooOO0 = null;
                        return socket;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public final OooO0O0 OooO0OO(int i, int i2, int i3, boolean z) throws Throwable {
        OooO0O0 oooO0O0;
        Socket socketOooO0O0;
        OooO0O0 oooO0O02;
        boolean z2;
        o00000O0 o00000o02;
        boolean z3;
        OooO0O0 oooO0O03;
        Socket socketOooO00o;
        o000oOoO o000oooo2;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.f32096OooO0Oo) {
            try {
                if (this.OooOO0o) {
                    throw new IllegalStateException("released");
                }
                if (this.f32103OooOOO != null) {
                    throw new IllegalStateException("codec != null");
                }
                if (this.f32104OooOOO0) {
                    throw new IOException("Canceled");
                }
                oooO0O0 = this.f32101OooOO0;
                socketOooO0O0 = (oooO0O0 == null || !oooO0O0.f32116OooOO0O) ? null : OooO0O0(false, false, true);
                oooO0O02 = this.f32101OooOO0;
                if (oooO0O02 != null) {
                    oooO0O0 = null;
                } else {
                    oooO0O02 = null;
                }
                if (!this.f32102OooOO0O) {
                    oooO0O0 = null;
                }
                if (oooO0O02 == null) {
                    o00OOO0.OooO0O0 oooO0O04 = o00OOO0.OooO0O0.f32137OooO0o0;
                    OooOOOO oooOOOO = this.f32096OooO0Oo;
                    o00OOO0.OooO00o oooO00o = this.f32093OooO00o;
                    oooO0O04.getClass();
                    o00OOO0.OooO0O0.OooO0O0(oooOOOO, oooO00o, this, null);
                    OooO0O0 oooO0O05 = this.f32101OooOO0;
                    if (oooO0O05 != null) {
                        z2 = true;
                        oooO0O02 = oooO0O05;
                    } else {
                        o00000o02 = this.f32095OooO0OO;
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                o00000o02 = null;
            } finally {
            }
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO0O0);
        if (oooO0O0 != null) {
            this.f32097OooO0o.getClass();
        }
        if (z2) {
            this.f32097OooO0o.getClass();
        }
        if (oooO0O02 != null) {
            this.f32095OooO0OO = this.f32101OooOO0.f32109OooO0OO;
            return oooO0O02;
        }
        if (o00000o02 != null || ((o000oooo2 = this.f32094OooO0O0) != null && o000oooo2.f30364OooO0O0 < o000oooo2.f30363OooO00o.size())) {
            z3 = false;
        } else {
            C1765ku c1765ku = this.f32100OooO0oo;
            if (c1765ku.f20682OooO00o >= ((List) c1765ku.f20687OooO0o0).size() && ((ArrayList) c1765ku.f20688OooO0oO).isEmpty()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList = new ArrayList();
            while (c1765ku.f20682OooO00o < ((List) c1765ku.f20687OooO0o0).size()) {
                boolean z4 = c1765ku.f20682OooO00o < ((List) c1765ku.f20687OooO0o0).size();
                o00OOO0.OooO00o oooO00o2 = (o00OOO0.OooO00o) c1765ku.f20683OooO0O0;
                if (!z4) {
                    throw new SocketException("No route to " + oooO00o2.f32124OooO00o.f32296OooO0Oo + "; exhausted proxy configurations: " + ((List) c1765ku.f20687OooO0o0));
                }
                List list = (List) c1765ku.f20687OooO0o0;
                int i4 = c1765ku.f20682OooO00o;
                c1765ku.f20682OooO00o = i4 + 1;
                Proxy proxy = (Proxy) list.get(i4);
                c1765ku.f20686OooO0o = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    o0OoOo0 o0oooo0 = oooO00o2.f32124OooO00o;
                    hostName = o0oooo0.f32296OooO0Oo;
                    port = o0oooo0.f32298OooO0o0;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    port = inetSocketAddress.getPort();
                }
                if (port < 1 || port > 65535) {
                    throw new SocketException("No route to " + hostName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + port + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    ((List) c1765ku.f20686OooO0o).add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    ((o00OOO0.OooO0O0) c1765ku.f20685OooO0Oo).getClass();
                    oooO00o2.f32125OooO0O0.getClass();
                    if (hostName == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                        if (listAsList.isEmpty()) {
                            throw new UnknownHostException(oooO00o2.f32125OooO0O0 + " returned no addresses for " + hostName);
                        }
                        int size = listAsList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((List) c1765ku.f20686OooO0o).add(new InetSocketAddress((InetAddress) listAsList.get(i5), port));
                        }
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                int size2 = ((List) c1765ku.f20686OooO0o).size();
                for (int i6 = 0; i6 < size2; i6++) {
                    o00000O0 o00000o03 = new o00000O0((o00OOO0.OooO00o) c1765ku.f20683OooO0O0, proxy, (InetSocketAddress) ((List) c1765ku.f20686OooO0o).get(i6));
                    o00oO0o o00oo0o = (o00oO0o) c1765ku.f20684OooO0OO;
                    synchronized (o00oo0o) {
                        zContains = ((LinkedHashSet) o00oo0o.f30487OooOo0o).contains(o00000o03);
                    }
                    if (zContains) {
                        ((ArrayList) c1765ku.f20688OooO0oO).add(o00000o03);
                    } else {
                        arrayList.add(o00000o03);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll((ArrayList) c1765ku.f20688OooO0oO);
                ((ArrayList) c1765ku.f20688OooO0oO).clear();
            }
            this.f32094OooO0O0 = new o000oOoO(arrayList);
            z3 = true;
        }
        synchronized (this.f32096OooO0Oo) {
            try {
                if (this.f32104OooOOO0) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    o000oOoO o000oooo3 = this.f32094OooO0O0;
                    o000oooo3.getClass();
                    ArrayList arrayList2 = new ArrayList(o000oooo3.f30363OooO00o);
                    int size3 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size3) {
                            break;
                        }
                        o00000O0 o00000o04 = (o00000O0) arrayList2.get(i7);
                        o00OOO0.OooO0O0 oooO0O06 = o00OOO0.OooO0O0.f32137OooO0o0;
                        OooOOOO oooOOOO2 = this.f32096OooO0Oo;
                        o00OOO0.OooO00o oooO00o3 = this.f32093OooO00o;
                        oooO0O06.getClass();
                        o00OOO0.OooO0O0.OooO0O0(oooOOOO2, oooO00o3, this, o00000o04);
                        OooO0O0 oooO0O07 = this.f32101OooOO0;
                        if (oooO0O07 != null) {
                            this.f32095OooO0OO = o00000o04;
                            z2 = true;
                            oooO0O02 = oooO0O07;
                            break;
                        }
                        i7++;
                    }
                }
                if (!z2) {
                    if (o00000o02 == null) {
                        o000oOoO o000oooo4 = this.f32094OooO0O0;
                        if (!(o000oooo4.f30364OooO0O0 < o000oooo4.f30363OooO00o.size())) {
                            throw new NoSuchElementException();
                        }
                        int i8 = o000oooo4.f30364OooO0O0;
                        o000oooo4.f30364OooO0O0 = i8 + 1;
                        o00000o02 = (o00000O0) o000oooo4.f30363OooO00o.get(i8);
                    }
                    this.f32095OooO0OO = o00000o02;
                    this.f32092OooO = 0;
                    oooO0O02 = new OooO0O0(this.f32096OooO0Oo, o00000o02);
                    if (this.f32101OooOO0 != null) {
                        throw new IllegalStateException();
                    }
                    this.f32101OooOO0 = oooO0O02;
                    this.f32102OooOO0O = false;
                    oooO0O02.f32117OooOOO.add(new OooO0o(this, this.f32099OooO0oO));
                }
                oooO0O03 = oooO0O02;
            } finally {
            }
        }
        if (z2) {
            this.f32097OooO0o.getClass();
            return oooO0O03;
        }
        oooO0O03.OooO0OO(i, i2, i3, z, this.f32097OooO0o);
        o00OOO0.OooO0O0.f32137OooO0o0.getClass();
        this.f32096OooO0Oo.f32181OooO0o0.OooO0Oo(oooO0O03.f32109OooO0OO);
        synchronized (this.f32096OooO0Oo) {
            try {
                this.f32102OooOO0O = true;
                o00OOO0.OooO0O0 oooO0O08 = o00OOO0.OooO0O0.f32137OooO0o0;
                OooOOOO oooOOOO3 = this.f32096OooO0Oo;
                oooO0O08.getClass();
                if (!oooOOOO3.f32180OooO0o) {
                    oooOOOO3.f32180OooO0o = true;
                    OooOOOO.f32175OooO0oO.execute(oooOOOO3.f32178OooO0OO);
                }
                oooOOOO3.f32179OooO0Oo.add(oooO0O03);
                if (oooO0O03.f32114OooO0oo != null) {
                    o00OOO0.OooO0O0 oooO0O09 = o00OOO0.OooO0O0.f32137OooO0o0;
                    OooOOOO oooOOOO4 = this.f32096OooO0Oo;
                    o00OOO0.OooO00o oooO00o4 = this.f32093OooO00o;
                    oooO0O09.getClass();
                    socketOooO00o = o00OOO0.OooO0O0.OooO00o(oooOOOO4, oooO00o4, this);
                    oooO0O03 = this.f32101OooOO0;
                } else {
                    socketOooO00o = null;
                }
            } finally {
            }
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO00o);
        this.f32097OooO0o.getClass();
        return oooO0O03;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b A[Catch: all -> 0x0018, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0007, B:6:0x000c, B:11:0x0015, B:15:0x001b), top: B:61:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00OOO.OooO0O0 OooO0Oo(int r9, int r10, int r11, boolean r12, boolean r13) throws java.lang.Throwable {
        /*
            r8 = this;
        L0:
            o00OOO.OooO0O0 r0 = r8.OooO0OO(r9, r10, r11, r12)
            o00OOO0.OooOOOO r1 = r8.f32096OooO0Oo
            monitor-enter(r1)
            int r2 = r0.OooOO0o     // Catch: java.lang.Throwable -> L18
            r3 = 1
            if (r2 != 0) goto L1b
            o00OOOOo.o00Oo0 r2 = r0.f32114OooO0oo     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 != 0) goto L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            goto L82
        L18:
            r9 = move-exception
            goto L88
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            java.net.Socket r1 = r0.f32112OooO0o0
            boolean r1 = r1.isClosed()
            if (r1 != 0) goto L83
            java.net.Socket r1 = r0.f32112OooO0o0
            boolean r1 = r1.isInputShutdown()
            if (r1 != 0) goto L83
            java.net.Socket r1 = r0.f32112OooO0o0
            boolean r1 = r1.isOutputShutdown()
            if (r1 == 0) goto L35
            goto L83
        L35:
            o00OOOOo.o00Oo0 r1 = r0.f32114OooO0oo
            if (r1 == 0) goto L5a
            long r2 = java.lang.System.nanoTime()
            monitor-enter(r1)
            boolean r4 = r1.f32464OooOoo0     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L44
            monitor-exit(r1)
            goto L83
        L44:
            long r4 = r1.f32471Oooo00o     // Catch: java.lang.Throwable -> L54
            long r6 = r1.f32470Oooo00O     // Catch: java.lang.Throwable -> L54
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L56
            long r4 = r1.f32468Oooo0     // Catch: java.lang.Throwable -> L54
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L56
            monitor-exit(r1)
            goto L83
        L54:
            r9 = move-exception
            goto L58
        L56:
            monitor-exit(r1)
            goto L82
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r9
        L5a:
            if (r13 == 0) goto L82
            java.net.Socket r1 = r0.f32112OooO0o0     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            int r1 = r1.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            java.net.Socket r2 = r0.f32112OooO0o0     // Catch: java.lang.Throwable -> L7b
            r2.setSoTimeout(r3)     // Catch: java.lang.Throwable -> L7b
            o00OOOoO.o000O0O0 r2 = r0.f32107OooO     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L75
            java.net.Socket r2 = r0.f32112OooO0o0     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r2.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            goto L83
        L75:
            java.net.Socket r2 = r0.f32112OooO0o0     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r2.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            goto L82
        L7b:
            r2 = move-exception
            java.net.Socket r3 = r0.f32112OooO0o0     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            r3.setSoTimeout(r1)     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
            throw r2     // Catch: java.net.SocketTimeoutException -> L82 java.io.IOException -> L83
        L82:
            return r0
        L83:
            r8.OooO0o0()
            goto L0
        L88:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO.OooO.OooO0Oo(int, int, int, boolean, boolean):o00OOO.OooO0O0");
    }

    public final void OooO0o() throws IOException {
        OooO0O0 oooO0O0;
        Socket socketOooO0O0;
        synchronized (this.f32096OooO0Oo) {
            oooO0O0 = this.f32101OooOO0;
            socketOooO0O0 = OooO0O0(false, true, false);
            if (this.f32101OooOO0 != null) {
                oooO0O0 = null;
            }
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO0O0);
        if (oooO0O0 != null) {
            o00OOO0.OooO0O0 oooO0O02 = o00OOO0.OooO0O0.f32137OooO0o0;
            o0Oo0oo o0oo0oo = this.f32098OooO0o0;
            oooO0O02.getClass();
            o0oo0oo.OooO0o0(null);
            this.f32097OooO0o.getClass();
            this.f32097OooO0o.getClass();
        }
    }

    public final void OooO0o0() throws IOException {
        OooO0O0 oooO0O0;
        Socket socketOooO0O0;
        synchronized (this.f32096OooO0Oo) {
            oooO0O0 = this.f32101OooOO0;
            socketOooO0O0 = OooO0O0(true, false, false);
            if (this.f32101OooOO0 != null) {
                oooO0O0 = null;
            }
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO0O0);
        if (oooO0O0 != null) {
            this.f32097OooO0o.getClass();
        }
    }

    public final void OooO0oO(IOException iOException) throws IOException {
        OooO0O0 oooO0O0;
        boolean z;
        Socket socketOooO0O0;
        synchronized (this.f32096OooO0Oo) {
            try {
                oooO0O0 = null;
                if (iOException instanceof o000000) {
                    int i = ((o000000) iOException).f32450OooOo0O;
                    if (i == 5) {
                        int i2 = this.f32092OooO + 1;
                        this.f32092OooO = i2;
                        if (i2 > 1) {
                            this.f32095OooO0OO = null;
                            z = true;
                        }
                        z = false;
                    } else {
                        if (i != 6) {
                            this.f32095OooO0OO = null;
                            z = true;
                        }
                        z = false;
                    }
                } else {
                    OooO0O0 oooO0O02 = this.f32101OooOO0;
                    if (oooO0O02 != null) {
                        if (!(oooO0O02.f32114OooO0oo != null) || (iOException instanceof o00OOOOo.OooO00o)) {
                            if (oooO0O02.OooOO0o == 0) {
                                o00000O0 o00000o02 = this.f32095OooO0OO;
                                if (o00000o02 != null && iOException != null) {
                                    this.f32100OooO0oo.OooO00o(o00000o02, iOException);
                                }
                                this.f32095OooO0OO = null;
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
                OooO0O0 oooO0O03 = this.f32101OooOO0;
                socketOooO0O0 = OooO0O0(z, false, true);
                if (this.f32101OooOO0 == null && this.f32102OooOO0O) {
                    oooO0O0 = oooO0O03;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO0O0);
        if (oooO0O0 != null) {
            this.f32097OooO0o.getClass();
        }
    }

    public final void OooO0oo(boolean z, o00OOOO0.OooO0OO oooO0OO, IOException iOException) throws IOException {
        OooO0O0 oooO0O0;
        Socket socketOooO0O0;
        boolean z2;
        this.f32097OooO0o.getClass();
        synchronized (this.f32096OooO0Oo) {
            if (oooO0OO != null) {
                try {
                    if (oooO0OO == this.f32103OooOOO) {
                        if (!z) {
                            this.f32101OooOO0.OooOO0o++;
                        }
                        oooO0O0 = this.f32101OooOO0;
                        socketOooO0O0 = OooO0O0(z, false, true);
                        if (this.f32101OooOO0 != null) {
                            oooO0O0 = null;
                        }
                        z2 = this.OooOO0o;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f32103OooOOO + " but was " + oooO0OO);
        }
        o00OOO0O.OooO0OO.OooO0o(socketOooO0O0);
        if (oooO0O0 != null) {
            this.f32097OooO0o.getClass();
        }
        if (iOException != null) {
            o00OOO0.OooO0O0 oooO0O02 = o00OOO0.OooO0O0.f32137OooO0o0;
            o0Oo0oo o0oo0oo = this.f32098OooO0o0;
            oooO0O02.getClass();
            o0oo0oo.OooO0o0(iOException);
            this.f32097OooO0o.getClass();
            return;
        }
        if (z2) {
            o00OOO0.OooO0O0 oooO0O03 = o00OOO0.OooO0O0.f32137OooO0o0;
            o0Oo0oo o0oo0oo2 = this.f32098OooO0o0;
            oooO0O03.getClass();
            o0oo0oo2.OooO0o0(null);
            this.f32097OooO0o.getClass();
        }
    }

    public final String toString() {
        OooO0O0 oooO0O0OooO00o = OooO00o();
        return oooO0O0OooO00o != null ? oooO0O0OooO00o.toString() : this.f32093OooO00o.toString();
    }
}
