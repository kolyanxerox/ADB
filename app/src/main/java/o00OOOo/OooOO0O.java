package o00OOOO;

import OoooO0O.o0000O00;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import o00OOO0.o000000;
import o00OOO0.o000OOo;
import o00OOO0.o000oOoO;
import o00OOO0.o0OO00O;
import o00OOO0.o0OoOo0;
import o00OOO0.oo000o;
import o00OOOoO.o00;
import o00OOOoO.o000O0O0;
import o00OOOoO.o000OO0O;
import o00Oo0oo.o00oO0o;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooOO0O implements o00OOOO0.OooO0OO {

    /* renamed from: OooO00o */
    public final oo000o f32367OooO00o;

    /* renamed from: OooO0O0 */
    public final o00OOO.OooO f32368OooO0O0;

    /* renamed from: OooO0OO */
    public final o000O0O0 f32369OooO0OO;

    /* renamed from: OooO0Oo */
    public final o000OO0O f32370OooO0Oo;

    /* renamed from: OooO0o0 */
    public int f32372OooO0o0 = 0;

    /* renamed from: OooO0o */
    public long f32371OooO0o = 262144;

    public OooOO0O(oo000o oo000oVar, o00OOO.OooO oooO, o000O0O0 o000o0o02, o000OO0O o000oo0o) {
        this.f32367OooO00o = oo000oVar;
        this.f32368OooO0O0 = oooO;
        this.f32369OooO0OO = o000o0o02;
        this.f32370OooO0Oo = o000oo0o;
    }

    @Override // o00OOOO0.OooO0OO
    public final void OooO00o(o0OO00O o0oo00o) {
        Proxy.Type type = this.f32368OooO0O0.OooO00o().f32109OooO0OO.f32230OooO0O0.type();
        StringBuilder sb = new StringBuilder();
        sb.append(o0oo00o.f32278OooO0O0);
        sb.append(' ');
        o0OoOo0 o0oooo0 = o0oo00o.f32277OooO00o;
        if (o0oooo0.f32293OooO00o.equals("https") || type != Proxy.Type.HTTP) {
            int length = o0oooo0.f32293OooO00o.length() + 3;
            String str = o0oooo0.f32292OooO;
            int iIndexOf = str.indexOf(47, length);
            String strSubstring = str.substring(iIndexOf, o00OOO0O.OooO0OO.OooO(iIndexOf, str.length(), str, "?#"));
            String strOooO0o0 = o0oooo0.OooO0o0();
            if (strOooO0o0 != null) {
                strSubstring = strSubstring + '?' + strOooO0o0;
            }
            sb.append(strSubstring);
        } else {
            sb.append(o0oooo0);
        }
        sb.append(" HTTP/1.1");
        OooO0o(o0oo00o.f32279OooO0OO, sb.toString());
    }

    @Override // o00OOOO0.OooO0OO
    public final o00OOOO0.OooOO0O OooO0O0(o000000 o000000Var) throws IOException {
        o00OOO.OooO oooO = this.f32368OooO0O0;
        oooO.f32097OooO0o.getClass();
        String strOooO00o = o000000Var.OooO00o("Content-Type");
        if (!o00OOOO0.OooO.OooO0O0(o000000Var)) {
            return new o00OOOO0.OooOO0O(strOooO00o, 0L, o00oO0o.OooO00o(OooO0Oo(0L)));
        }
        if ("chunked".equalsIgnoreCase(o000000Var.OooO00o("Transfer-Encoding"))) {
            o0OoOo0 o0oooo0 = o000000Var.f32209OooOo0O.f32277OooO00o;
            if (this.f32372OooO0o0 == 4) {
                this.f32372OooO0o0 = 5;
                return new o00OOOO0.OooOO0O(strOooO00o, -1L, o00oO0o.OooO00o(new OooO0OO(this, o0oooo0)));
            }
            throw new IllegalStateException("state: " + this.f32372OooO0o0);
        }
        long jOooO00o = o00OOOO0.OooO.OooO00o(o000000Var);
        if (jOooO00o != -1) {
            return new o00OOOO0.OooOO0O(strOooO00o, jOooO00o, o00oO0o.OooO00o(OooO0Oo(jOooO00o)));
        }
        if (this.f32372OooO0o0 == 4) {
            this.f32372OooO0o0 = 5;
            oooO.OooO0o0();
            return new o00OOOO0.OooOO0O(strOooO00o, -1L, o00oO0o.OooO00o(new OooOO0(this)));
        }
        throw new IllegalStateException("state: " + this.f32372OooO0o0);
    }

    @Override // o00OOOO0.OooO0OO
    public final o00 OooO0OO(o0OO00O o0oo00o, long j) {
        if ("chunked".equalsIgnoreCase(o0oo00o.f32279OooO0OO.OooO0OO("Transfer-Encoding"))) {
            if (this.f32372OooO0o0 == 1) {
                this.f32372OooO0o0 = 2;
                return new OooO0O0(this);
            }
            throw new IllegalStateException("state: " + this.f32372OooO0o0);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f32372OooO0o0 == 1) {
            this.f32372OooO0o0 = 2;
            return new OooO0o(this, j);
        }
        throw new IllegalStateException("state: " + this.f32372OooO0o0);
    }

    public final OooO OooO0Oo(long j) {
        if (this.f32372OooO0o0 != 4) {
            throw new IllegalStateException("state: " + this.f32372OooO0o0);
        }
        this.f32372OooO0o0 = 5;
        OooO oooO = new OooO(this);
        oooO.f32350OooOoO = j;
        if (j == 0) {
            oooO.OooO00o(null, true);
        }
        return oooO;
    }

    public final void OooO0o(o000oOoO o000oooo2, String str) {
        if (this.f32372OooO0o0 != 0) {
            throw new IllegalStateException("state: " + this.f32372OooO0o0);
        }
        o000OO0O o000oo0o = this.f32370OooO0Oo;
        o000oo0o.writeUtf8(str);
        o000oo0o.writeUtf8("\r\n");
        int iOooO0o = o000oooo2.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            o000oo0o.writeUtf8(o000oooo2.OooO0Oo(i));
            o000oo0o.writeUtf8(": ");
            o000oo0o.writeUtf8(o000oooo2.OooO0oo(i));
            o000oo0o.writeUtf8("\r\n");
        }
        o000oo0o.writeUtf8("\r\n");
        this.f32372OooO0o0 = 1;
    }

    public final o000oOoO OooO0o0() throws EOFException {
        o000Ooo.o00oO0o o00oo0o = new o000Ooo.o00oO0o(15);
        while (true) {
            String utf8LineStrict = this.f32369OooO0OO.readUtf8LineStrict(this.f32371OooO0o);
            this.f32371OooO0o -= utf8LineStrict.length();
            if (utf8LineStrict.length() == 0) {
                return new o000oOoO(o00oo0o);
            }
            o00OOO0.OooO0O0.f32137OooO0o0.getClass();
            int iIndexOf = utf8LineStrict.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 1);
            if (iIndexOf != -1) {
                o00oo0o.OooO0OO(utf8LineStrict.substring(0, iIndexOf), utf8LineStrict.substring(iIndexOf + 1));
            } else if (utf8LineStrict.startsWith(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                o00oo0o.OooO0OO("", utf8LineStrict.substring(1));
            } else {
                o00oo0o.OooO0OO("", utf8LineStrict);
            }
        }
    }

    @Override // o00OOOO0.OooO0OO
    public final void cancel() throws IOException {
        o00OOO.OooO0O0 oooO0O0OooO00o = this.f32368OooO0O0.OooO00o();
        if (oooO0O0OooO00o != null) {
            o00OOO0O.OooO0OO.OooO0o(oooO0O0OooO00o.f32110OooO0Oo);
        }
    }

    @Override // o00OOOO0.OooO0OO
    public final void finishRequest() {
        this.f32370OooO0Oo.flush();
    }

    @Override // o00OOOO0.OooO0OO
    public final void flushRequest() {
        this.f32370OooO0Oo.flush();
    }

    @Override // o00OOOO0.OooO0OO
    public final o000OOo readResponseHeaders(boolean z) {
        int i = this.f32372OooO0o0;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f32372OooO0o0);
        }
        try {
            String utf8LineStrict = this.f32369OooO0OO.readUtf8LineStrict(this.f32371OooO0o);
            this.f32371OooO0o -= utf8LineStrict.length();
            o0000O00 o0000o00OooO0o = o0000O00.OooO0o(utf8LineStrict);
            int i2 = o0000o00OooO0o.f13928OooO0O0;
            o000OOo o000ooo2 = new o000OOo();
            o000ooo2.f32234OooO0O0 = (o00OOO0.o00oO0o) o0000o00OooO0o.f13930OooO0Oo;
            o000ooo2.f32235OooO0OO = i2;
            o000ooo2.f32236OooO0Oo = (String) o0000o00OooO0o.f13929OooO0OO;
            o000ooo2.f32237OooO0o = OooO0o0().OooO0o0();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f32372OooO0o0 = 3;
                return o000ooo2;
            }
            this.f32372OooO0o0 = 4;
            return o000ooo2;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f32368OooO0O0);
            iOException.initCause(e);
            throw iOException;
        }
    }
}
