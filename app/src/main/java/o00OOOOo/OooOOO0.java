package o00OOOOo;

import OoooO0O.o0000O00;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o000O00.o00O0O0O;
import o00OOOoO.o00;
import o00OOOoO.o0000O0;

/* loaded from: classes3.dex */
public final class OooOOO0 implements o00OOOO0.OooO0OO {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final List f32431OooO0o = o00OOO0O.OooO0OO.OooOOO0("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final List f32432OooO0oO = o00OOO0O.OooO0OO.OooOOO0("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOO0.OooOO0 f32433OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO.OooO f32434OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f32435OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public o0Oo0oo f32436OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO0.o00oO0o f32437OooO0o0;

    public OooOOO0(o00OOO0.oo000o oo000oVar, o00OOOO0.OooOO0 oooOO0, o00OOO.OooO oooO, o00Oo0 o00oo0) {
        this.f32433OooO00o = oooOO0;
        this.f32434OooO0O0 = oooO;
        this.f32435OooO0OO = o00oo0;
        o00OOO0.o00oO0o o00oo0o = o00OOO0.o00oO0o.H2_PRIOR_KNOWLEDGE;
        this.f32437OooO0o0 = oo000oVar.f32306OooOo0o.contains(o00oo0o) ? o00oo0o : o00OOO0.o00oO0o.HTTP_2;
    }

    @Override // o00OOOO0.OooO0OO
    public final void OooO00o(o00OOO0.o0OO00O o0oo00o) {
        int i;
        o0Oo0oo o0oo0oo;
        boolean z = true;
        if (this.f32436OooO0Oo != null) {
            return;
        }
        boolean z2 = o0oo00o.f32280OooO0Oo != null;
        o00OOO0.o000oOoO o000oooo2 = o0oo00o.f32279OooO0OO;
        ArrayList arrayList = new ArrayList(o000oooo2.OooO0o() + 4);
        arrayList.add(new OooO0O0(OooO0O0.f32398OooO0o, o0oo00o.f32278OooO0O0));
        o0000O0 o0000o02 = OooO0O0.f32400OooO0oO;
        o00OOO0.o0OoOo0 o0oooo0 = o0oo00o.f32277OooO00o;
        int length = o0oooo0.f32293OooO00o.length() + 3;
        String str = o0oooo0.f32292OooO;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, o00OOO0O.OooO0OO.OooO(iIndexOf, str.length(), str, "?#"));
        String strOooO0o0 = o0oooo0.OooO0o0();
        if (strOooO0o0 != null) {
            strSubstring = strSubstring + '?' + strOooO0o0;
        }
        arrayList.add(new OooO0O0(o0000o02, strSubstring));
        String strOooO0OO = o0oo00o.f32279OooO0OO.OooO0OO("Host");
        if (strOooO0OO != null) {
            arrayList.add(new OooO0O0(OooO0O0.f32396OooO, strOooO0OO));
        }
        arrayList.add(new OooO0O0(OooO0O0.f32401OooO0oo, o0oooo0.f32293OooO00o));
        int iOooO0o = o000oooo2.OooO0o();
        for (int i2 = 0; i2 < iOooO0o; i2++) {
            String lowerCase = o000oooo2.OooO0Oo(i2).toLowerCase(Locale.US);
            o0000O0 o0000o03 = o0000O0.f32553OooOoO0;
            o0000O0 o0000o0OooOOOo = o00O0O0O.OooOOOo(lowerCase);
            if (!f32431OooO0o.contains(o0000o0OooOOOo.OooOOoo())) {
                arrayList.add(new OooO0O0(o0000o0OooOOOo, o000oooo2.OooO0oo(i2)));
            }
        }
        o00Oo0 o00oo0 = this.f32435OooO0OO;
        boolean z3 = !z2;
        synchronized (o00oo0.f32477Oooo0oo) {
            synchronized (o00oo0) {
                try {
                    if (o00oo0.f32462OooOoOO > 1073741823) {
                        o00oo0.OooO0oo(5);
                    }
                    if (o00oo0.f32464OooOoo0) {
                        throw new OooO00o();
                    }
                    i = o00oo0.f32462OooOoOO;
                    o00oo0.f32462OooOoOO = i + 2;
                    o0oo0oo = new o0Oo0oo(i, o00oo0, z3, false, null);
                    if (z2 && o00oo0.f32473Oooo0OO != 0 && o0oo0oo.f32503OooO0O0 != 0) {
                        z = false;
                    }
                    if (o0oo0oo.OooO0oO()) {
                        o00oo0.f32457OooOo.put(Integer.valueOf(i), o0oo0oo);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o0OO00O o0oo00o2 = o00oo0.f32477Oooo0oo;
            synchronized (o0oo00o2) {
                if (o0oo00o2.f32497OooOoO) {
                    throw new IOException("closed");
                }
                o0oo00o2.OooO0o0(arrayList, i, z3);
            }
        }
        if (z) {
            o00oo0.f32477Oooo0oo.flush();
        }
        this.f32436OooO0Oo = o0oo0oo;
        o0OOO0o o0ooo0o = o0oo0oo.f32501OooO;
        long j = this.f32433OooO00o.f32385OooOO0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0ooo0o.OooO0oO(j);
        this.f32436OooO0Oo.f32510OooOO0.OooO0oO(this.f32433OooO00o.f32386OooOO0O);
    }

    @Override // o00OOOO0.OooO0OO
    public final o00OOOO0.OooOO0O OooO0O0(o00OOO0.o000000 o000000Var) {
        this.f32434OooO0O0.f32097OooO0o.getClass();
        return new o00OOOO0.OooOO0O(o000000Var.OooO00o("Content-Type"), o00OOOO0.OooO.OooO00o(o000000Var), o00Oo0oo.o00oO0o.OooO00o(new OooOO0O(this, this.f32436OooO0Oo.f32508OooO0oO)));
    }

    @Override // o00OOOO0.OooO0OO
    public final o00 OooO0OO(o00OOO0.o0OO00O o0oo00o, long j) {
        return this.f32436OooO0Oo.OooO0o0();
    }

    @Override // o00OOOO0.OooO0OO
    public final void cancel() {
        o0Oo0oo o0oo0oo = this.f32436OooO0Oo;
        if (o0oo0oo == null || !o0oo0oo.OooO0Oo(6)) {
            return;
        }
        o0oo0oo.f32505OooO0Oo.OooOOO0(o0oo0oo.f32504OooO0OO, 6);
    }

    @Override // o00OOOO0.OooO0OO
    public final void finishRequest() throws SocketTimeoutException {
        this.f32436OooO0Oo.OooO0o0().close();
    }

    @Override // o00OOOO0.OooO0OO
    public final void flushRequest() {
        this.f32435OooO0OO.flush();
    }

    @Override // o00OOOO0.OooO0OO
    public final o00OOO0.o000OOo readResponseHeaders(boolean z) throws ProtocolException, NumberFormatException {
        o00OOO0.o000oOoO o000oooo2;
        o0Oo0oo o0oo0oo = this.f32436OooO0Oo;
        synchronized (o0oo0oo) {
            o0oo0oo.f32501OooO.OooO0oo();
            while (o0oo0oo.f32507OooO0o0.isEmpty() && o0oo0oo.f32511OooOO0O == 0) {
                try {
                    o0oo0oo.OooO();
                } catch (Throwable th) {
                    o0oo0oo.f32501OooO.OooOO0O();
                    throw th;
                }
            }
            o0oo0oo.f32501OooO.OooOO0O();
            if (o0oo0oo.f32507OooO0o0.isEmpty()) {
                throw new o000000(o0oo0oo.f32511OooOO0O);
            }
            o000oooo2 = (o00OOO0.o000oOoO) o0oo0oo.f32507OooO0o0.removeFirst();
        }
        o00OOO0.o00oO0o o00oo0o = this.f32437OooO0o0;
        ArrayList arrayList = new ArrayList(20);
        int iOooO0o = o000oooo2.OooO0o();
        o0000O00 o0000o00OooO0o = null;
        for (int i = 0; i < iOooO0o; i++) {
            String strOooO0Oo = o000oooo2.OooO0Oo(i);
            String strOooO0oo = o000oooo2.OooO0oo(i);
            if (strOooO0Oo.equals(Header.RESPONSE_STATUS_UTF8)) {
                o0000o00OooO0o = o0000O00.OooO0o("HTTP/1.1 " + strOooO0oo);
            } else if (!f32432OooO0oO.contains(strOooO0Oo)) {
                o00OOO0.OooO0O0.f32137OooO0o0.getClass();
                arrayList.add(strOooO0Oo);
                arrayList.add(strOooO0oo.trim());
            }
        }
        if (o0000o00OooO0o == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        o00OOO0.o000OOo o000ooo2 = new o00OOO0.o000OOo();
        o000ooo2.f32234OooO0O0 = o00oo0o;
        o000ooo2.f32235OooO0OO = o0000o00OooO0o.f13928OooO0O0;
        o000ooo2.f32236OooO0Oo = (String) o0000o00OooO0o.f13929OooO0OO;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        o000Ooo.o00oO0o o00oo0o2 = new o000Ooo.o00oO0o(15);
        Collections.addAll((ArrayList) o00oo0o2.f30487OooOo0o, strArr);
        o000ooo2.f32237OooO0o = o00oo0o2;
        if (z) {
            o00OOO0.OooO0O0.f32137OooO0o0.getClass();
            if (o000ooo2.f32235OooO0OO == 100) {
                return null;
            }
        }
        return o000ooo2;
    }
}
