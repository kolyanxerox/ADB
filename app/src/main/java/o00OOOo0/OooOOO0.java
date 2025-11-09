package o00OOOO0;

import OooO0oO.OooOo;
import java.io.IOException;
import java.net.ProtocolException;
import javax.net.ssl.SSLSocketFactory;
import o00OOO0.o000000;
import o00OOO0.o000OOo;
import o00OOO0.o00O0O;
import o00OOO0.o0OO00O;
import o00OOO0.o0Oo0oo;
import o00OOO0.o0OoOo0;
import o00OOO0.oo000o;
import o00OOOo.OooOOOO;

/* loaded from: classes3.dex */
public final class OooOOO0 implements o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f32390OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile o00OOO.OooO f32391OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Object f32392OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f32393OooO0Oo;

    public OooOOO0(oo000o oo000oVar) {
        this.f32390OooO00o = oo000oVar;
    }

    public static boolean OooO0o0(o000000 o000000Var, o0OoOo0 o0oooo0) {
        o0OoOo0 o0oooo02 = o000000Var.f32209OooOo0O.f32277OooO00o;
        return o0oooo02.f32296OooO0Oo.equals(o0oooo0.f32296OooO0Oo) && o0oooo02.f32298OooO0o0 == o0oooo0.f32298OooO0o0 && o0oooo02.f32293OooO00o.equals(o0oooo0.f32293OooO00o);
    }

    @Override // o00OOO0.o00O0O
    public final o000000 OooO00o(OooOO0 oooOO0) throws IOException {
        o000000 o000000VarOooO00o;
        OooO0OO oooO0OO;
        o0OO00O o0oo00o = oooOO0.f32381OooO0o;
        o0Oo0oo o0oo0oo = oooOO0.f32383OooO0oO;
        o00OOO0.OooO0O0 oooO0O0 = oooOO0.f32384OooO0oo;
        o00OOO.OooO oooO = new o00OOO.OooO(this.f32390OooO00o.f32320Oooo0OO, OooO0O0(o0oo00o.f32277OooO00o), o0oo0oo, oooO0O0, this.f32392OooO0OO);
        this.f32391OooO0O0 = oooO;
        o00OOO.OooO oooO2 = oooO;
        int i = 0;
        o000000 o000000Var = null;
        o0OO00O o0oo00o2 = o0oo00o;
        while (!this.f32393OooO0Oo) {
            try {
                try {
                    o000000VarOooO00o = oooOO0.OooO00o(o0oo00o2, oooO2, null, null);
                    if (o000000Var != null) {
                        o000OOo o000oooOooO0O0 = o000000VarOooO00o.OooO0O0();
                        o000OOo o000oooOooO0O02 = o000000Var.OooO0O0();
                        o000oooOooO0O02.f32239OooO0oO = null;
                        o000000 o000000VarOooO00o2 = o000oooOooO0O02.OooO00o();
                        if (o000000VarOooO00o2.f32215OooOoo0 != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        o000oooOooO0O0.f32241OooOO0 = o000000VarOooO00o2;
                        o000000VarOooO00o = o000oooOooO0O0.OooO00o();
                    }
                } catch (IOException e) {
                    if (!OooO0Oo(e, oooO2, !(e instanceof o00OOOOo.OooO00o), o0oo00o2)) {
                        throw e;
                    }
                } catch (o00OOO.OooO0OO e2) {
                    if (!OooO0Oo(e2.f32121OooOo0o, oooO2, false, o0oo00o2)) {
                        throw e2.f32120OooOo0O;
                    }
                }
                try {
                    o0OO00O o0oo00oOooO0OO = OooO0OO(o000000VarOooO00o, oooO2.f32095OooO0OO);
                    if (o0oo00oOooO0OO == null) {
                        oooO2.OooO0o();
                        return o000000VarOooO00o;
                    }
                    o00OOO0O.OooO0OO.OooO0o0(o000000VarOooO00o.f32215OooOoo0);
                    int i2 = i + 1;
                    if (i2 > 20) {
                        oooO2.OooO0o();
                        throw new ProtocolException(OooOo.OooO0o(i2, "Too many follow-up requests: "));
                    }
                    if (OooO0o0(o000000VarOooO00o, o0oo00oOooO0OO.f32277OooO00o)) {
                        synchronized (oooO2.f32096OooO0Oo) {
                            oooO0OO = oooO2.f32103OooOOO;
                        }
                        if (oooO0OO != null) {
                            throw new IllegalStateException("Closing the body of " + o000000VarOooO00o + " didn't close its backing stream. Bad interceptor?");
                        }
                    } else {
                        oooO2.OooO0o();
                        o00OOO.OooO oooO3 = new o00OOO.OooO(this.f32390OooO00o.f32320Oooo0OO, OooO0O0(o0oo00oOooO0OO.f32277OooO00o), o0oo0oo, oooO0O0, this.f32392OooO0OO);
                        this.f32391OooO0O0 = oooO3;
                        oooO2 = oooO3;
                    }
                    o000000Var = o000000VarOooO00o;
                    o0oo00o2 = o0oo00oOooO0OO;
                    i = i2;
                } catch (IOException e3) {
                    oooO2.OooO0o();
                    throw e3;
                }
            } catch (Throwable th) {
                oooO2.OooO0oO(null);
                oooO2.OooO0o();
                throw th;
            }
        }
        oooO2.OooO0o();
        throw new IOException("Canceled");
    }

    public final o00OOO0.OooO00o OooO0O0(o0OoOo0 o0oooo0) {
        SSLSocketFactory sSLSocketFactory;
        OooOOOO oooOOOO;
        o00OOO0.OooOO0O oooOO0O;
        boolean zEquals = o0oooo0.f32293OooO00o.equals("https");
        oo000o oo000oVar = this.f32390OooO00o;
        if (zEquals) {
            sSLSocketFactory = oo000oVar.f32313OooOooo;
            oooOOOO = oo000oVar.f32317Oooo00O;
            oooOO0O = oo000oVar.f32318Oooo00o;
        } else {
            sSLSocketFactory = null;
            oooOOOO = null;
            oooOO0O = null;
        }
        return new o00OOO0.OooO00o(o0oooo0.f32296OooO0Oo, o0oooo0.f32298OooO0o0, oo000oVar.f32322Oooo0o0, oo000oVar.f32312OooOooO, sSLSocketFactory, oooOOOO, oooOO0O, oo000oVar.f32315Oooo0, oo000oVar.f32306OooOo0o, oo000oVar.f32304OooOo, oo000oVar.f32311OooOoo0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00OOO0.o0OO00O OooO0OO(o00OOO0.o000000 r12, o00OOO0.o00000O0 r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOO0.OooOOO0.OooO0OO(o00OOO0.o000000, o00OOO0.o00000O0):o00OOO0.o0OO00O");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        if (r4 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(java.io.IOException r2, o00OOO.OooO r3, boolean r4, o00OOO0.o0OO00O r5) throws java.io.IOException {
        /*
            r1 = this;
            r3.OooO0oO(r2)
            o00OOO0.oo000o r5 = r1.f32390OooO00o
            boolean r5 = r5.f32324Oooo0oo
            r0 = 0
            if (r5 != 0) goto Lb
            goto L2e
        Lb:
            if (r4 == 0) goto L12
            boolean r5 = r2 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto L12
            return r0
        L12:
            boolean r5 = r2 instanceof java.net.ProtocolException
            if (r5 == 0) goto L17
            return r0
        L17:
            boolean r5 = r2 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L22
            boolean r2 = r2 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto L2e
            if (r4 != 0) goto L2e
            goto L34
        L22:
            boolean r4 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L2f
            java.lang.Throwable r4 = r2.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L2f
        L2e:
            return r0
        L2f:
            boolean r2 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L34
            return r0
        L34:
            o00OOO0.o00000O0 r2 = r3.f32095OooO0OO
            if (r2 != 0) goto L62
            o000Oo0.o000oOoO r2 = r3.f32094OooO0O0
            if (r2 == 0) goto L47
            int r4 = r2.f30364OooO0O0
            java.util.ArrayList r2 = r2.f30363OooO00o
            int r2 = r2.size()
            if (r4 >= r2) goto L47
            goto L62
        L47:
            com.google.android.gms.internal.ads.ku r2 = r3.f32100OooO0oo
            int r3 = r2.f20682OooO00o
            java.lang.Object r4 = r2.f20687OooO0o0
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            if (r3 >= r4) goto L56
            goto L62
        L56:
            java.lang.Object r2 = r2.f20688OooO0oO
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L61
            goto L62
        L61:
            return r0
        L62:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOO0.OooOOO0.OooO0Oo(java.io.IOException, o00OOO.OooO, boolean, o00OOO0.o0OO00O):boolean");
    }
}
