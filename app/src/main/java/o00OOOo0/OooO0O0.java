package o00OOOO0;

import com.google.android.gms.internal.measurement.o0OO00OO;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.OooOo;
import o000Oo0O.OooOo00;
import o00OOO0.o00000;
import o00OOO0.o000000;
import o00OOO0.o000OOo;
import o00OOO0.o000oOoO;
import o00OOO0.o00O0O;
import o00OOO0.o00oO0o;
import o00OOO0.o0O0O00;
import o00OOO0.o0OO00O;
import o00OOO0.oo0o0Oo;
import o00OOOoO.o000OO0O;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes3.dex */
public final class OooO0O0 implements o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32374OooO00o;

    public /* synthetic */ OooO0O0(int i) {
        this.f32374OooO00o = i;
    }

    public static boolean OooO0O0(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static o000000 OooO0OO(o000000 o000000Var) {
        if (o000000Var == null || o000000Var.f32215OooOoo0 == null) {
            return o000000Var;
        }
        o000OOo o000oooOooO0O0 = o000000Var.OooO0O0();
        o000oooOooO0O0.f32239OooO0oO = null;
        return o000oooOooO0O0.OooO00o();
    }

    @Override // o00OOO0.o00O0O
    public final o000000 OooO00o(OooOO0 oooOO0) throws Throwable {
        o0O0O00 o0o0o00;
        switch (this.f32374OooO00o) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                oooOO0.f32384OooO0oo.getClass();
                OooO0OO oooO0OO = oooOO0.f32379OooO0OO;
                o0OO00O o0oo00o = oooOO0.f32381OooO0o;
                oooO0OO.OooO00o(o0oo00o);
                boolean zOooOoO0 = o0OO00OO.OooOoO0(o0oo00o.f32278OooO0O0);
                o00OOO.OooO oooO = oooOO0.f32378OooO0O0;
                o000OOo responseHeaders = null;
                if (zOooOoO0 && (o0o0o00 = o0oo00o.f32280OooO0Oo) != null) {
                    if ("100-continue".equalsIgnoreCase(o0oo00o.f32279OooO0OO.OooO0OO("Expect"))) {
                        oooO0OO.flushRequest();
                        responseHeaders = oooO0OO.readResponseHeaders(true);
                    }
                    if (responseHeaders == null) {
                        oo0o0Oo oo0o0oo = (oo0o0Oo) o0o0o00;
                        int i = oo0o0oo.f32328OooO0O0;
                        o000OO0O o000oo0o = new o000OO0O(new OooO00o(oooO0OO.OooO0OO(o0oo00o, i)));
                        byte[] source = oo0o0oo.f32329OooO0OO;
                        OooOo.OooO0o0(source, "source");
                        if (o000oo0o.f32591OooOo) {
                            throw new IllegalStateException("closed");
                        }
                        o000oo0o.f32593OooOo0o.OooO0oo(source, 0, i);
                        o000oo0o.OooO00o();
                        o000oo0o.close();
                    } else if (oooOO0.f32380OooO0Oo.f32114OooO0oo == null) {
                        oooO.OooO0o0();
                    }
                }
                oooO0OO.finishRequest();
                if (responseHeaders == null) {
                    responseHeaders = oooO0OO.readResponseHeaders(false);
                }
                responseHeaders.f32233OooO00o = o0oo00o;
                responseHeaders.f32238OooO0o0 = oooO.OooO00o().f32111OooO0o;
                responseHeaders.f32242OooOO0O = jCurrentTimeMillis;
                responseHeaders.OooOO0o = System.currentTimeMillis();
                o000000 o000000VarOooO00o = responseHeaders.OooO00o();
                int i2 = o000000VarOooO00o.f32208OooOo;
                if (i2 == 100) {
                    o000OOo responseHeaders2 = oooO0OO.readResponseHeaders(false);
                    responseHeaders2.f32233OooO00o = o0oo00o;
                    responseHeaders2.f32238OooO0o0 = oooO.OooO00o().f32111OooO0o;
                    responseHeaders2.f32242OooOO0O = jCurrentTimeMillis;
                    responseHeaders2.OooOO0o = System.currentTimeMillis();
                    o000000VarOooO00o = responseHeaders2.OooO00o();
                    i2 = o000000VarOooO00o.f32208OooOo;
                }
                o000OOo o000oooOooO0O0 = o000000VarOooO00o.OooO0O0();
                o000oooOooO0O0.f32239OooO0oO = oooO0OO.OooO0O0(o000000VarOooO00o);
                o000000 o000000VarOooO00o2 = o000oooOooO0O0.OooO00o();
                if ("close".equalsIgnoreCase(o000000VarOooO00o2.f32209OooOo0O.f32279OooO0OO.OooO0OO("Connection")) || "close".equalsIgnoreCase(o000000VarOooO00o2.OooO00o("Connection"))) {
                    oooO.OooO0o0();
                }
                if (i2 == 204 || i2 == 205) {
                    o00000 o00000Var = o000000VarOooO00o2.f32215OooOoo0;
                    if (o00000Var.OooO00o() > 0) {
                        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i2, "HTTP ", " had non-zero Content-Length: ");
                        sbOooOOo0.append(o00000Var.OooO00o());
                        throw new ProtocolException(sbOooOOo0.toString());
                    }
                }
                return o000000VarOooO00o2;
            default:
                System.currentTimeMillis();
                o0OO00O o0oo00o2 = oooOO0.f32381OooO0o;
                Throwable th = null;
                OooOo00 oooOo00 = new OooOo00(14, o0oo00o2, null);
                if (o0oo00o2 != null) {
                    o00OOO0.OooO0o oooO0oOooO00o = o0oo00o2.f32281OooO0o;
                    if (oooO0oOooO00o == null) {
                        oooO0oOooO00o = o00OOO0.OooO0o.OooO00o(o0oo00o2.f32279OooO0OO);
                        o0oo00o2.f32281OooO0o = oooO0oOooO00o;
                    }
                    if (oooO0oOooO00o.f32150OooOO0) {
                        oooOo00 = new OooOo00(14, null, null);
                    }
                }
                o0OO00O o0oo00o3 = (o0OO00O) oooOo00.f30372OooOo0o;
                o000000 o000000Var = (o000000) oooOo00.f30370OooOo;
                if (o0oo00o3 == null && o000000Var == null) {
                    o000OOo o000ooo2 = new o000OOo();
                    o000ooo2.f32233OooO00o = oooOO0.f32381OooO0o;
                    o000ooo2.f32234OooO0O0 = o00oO0o.HTTP_1_1;
                    o000ooo2.f32235OooO0OO = 504;
                    o000ooo2.f32236OooO0Oo = "Unsatisfiable Request (only-if-cached)";
                    o000ooo2.f32239OooO0oO = o00OOO0O.OooO0OO.f32337OooO0OO;
                    o000ooo2.f32242OooOO0O = -1L;
                    o000ooo2.OooOO0o = System.currentTimeMillis();
                    return o000ooo2.OooO00o();
                }
                if (o0oo00o3 == null) {
                    o000OOo o000oooOooO0O02 = o000000Var.OooO0O0();
                    o000000 o000000VarOooO0OO = OooO0OO(o000000Var);
                    if (o000000VarOooO0OO != null) {
                        o000OOo.OooO0O0("cacheResponse", o000000VarOooO0OO);
                    }
                    o000oooOooO0O02.f32232OooO = o000000VarOooO0OO;
                    return o000oooOooO0O02.OooO00o();
                }
                o000000 o000000VarOooO00o3 = oooOO0.OooO00o(o0oo00o3, oooOO0.f32378OooO0O0, oooOO0.f32379OooO0OO, oooOO0.f32380OooO0Oo);
                if (o000000Var != null) {
                    if (o000000VarOooO00o3.f32208OooOo == 304) {
                        o000OOo o000oooOooO0O03 = o000000Var.OooO0O0();
                        ArrayList arrayList = new ArrayList(20);
                        o000oOoO o000oooo2 = o000000Var.f32213OooOoOO;
                        int iOooO0o = o000oooo2.OooO0o();
                        int i3 = 0;
                        while (true) {
                            o000oOoO o000oooo3 = o000000VarOooO00o3.f32213OooOoOO;
                            if (i3 >= iOooO0o) {
                                Throwable th2 = th;
                                int iOooO0o2 = o000oooo3.OooO0o();
                                for (int i4 = 0; i4 < iOooO0o2; i4++) {
                                    String strOooO0Oo = o000oooo3.OooO0Oo(i4);
                                    if (!HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strOooO0Oo) && !HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strOooO0Oo) && !"Content-Type".equalsIgnoreCase(strOooO0Oo) && OooO0O0(strOooO0Oo)) {
                                        o00OOO0.OooO0O0 oooO0O0 = o00OOO0.OooO0O0.f32137OooO0o0;
                                        String strOooO0oo = o000oooo3.OooO0oo(i4);
                                        oooO0O0.getClass();
                                        arrayList.add(strOooO0Oo);
                                        arrayList.add(strOooO0oo.trim());
                                    }
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                o000Ooo.o00oO0o o00oo0o = new o000Ooo.o00oO0o(15);
                                Collections.addAll((ArrayList) o00oo0o.f30487OooOo0o, strArr);
                                o000oooOooO0O03.f32237OooO0o = o00oo0o;
                                o000oooOooO0O03.f32242OooOO0O = o000000VarOooO00o3.f32218Oooo000;
                                o000oooOooO0O03.OooOO0o = o000000VarOooO00o3.f32219Oooo00O;
                                o000000 o000000VarOooO0OO2 = OooO0OO(o000000Var);
                                if (o000000VarOooO0OO2 != null) {
                                    o000OOo.OooO0O0("cacheResponse", o000000VarOooO0OO2);
                                }
                                o000oooOooO0O03.f32232OooO = o000000VarOooO0OO2;
                                o000000 o000000VarOooO0OO3 = OooO0OO(o000000VarOooO00o3);
                                if (o000000VarOooO0OO3 != null) {
                                    o000OOo.OooO0O0("networkResponse", o000000VarOooO0OO3);
                                }
                                o000oooOooO0O03.f32240OooO0oo = o000000VarOooO0OO3;
                                o000oooOooO0O03.OooO00o();
                                o000000VarOooO00o3.f32215OooOoo0.close();
                                throw th2;
                            }
                            Throwable th3 = th;
                            String strOooO0Oo2 = o000oooo2.OooO0Oo(i3);
                            String strOooO0oo2 = o000oooo2.OooO0oo(i3);
                            if ((!"Warning".equalsIgnoreCase(strOooO0Oo2) || !strOooO0oo2.startsWith("1")) && (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strOooO0Oo2) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strOooO0Oo2) || "Content-Type".equalsIgnoreCase(strOooO0Oo2) || !OooO0O0(strOooO0Oo2) || o000oooo3.OooO0OO(strOooO0Oo2) == null)) {
                                o00OOO0.OooO0O0.f32137OooO0o0.getClass();
                                arrayList.add(strOooO0Oo2);
                                arrayList.add(strOooO0oo2.trim());
                            }
                            i3++;
                            th = th3;
                        }
                    } else {
                        o00OOO0O.OooO0OO.OooO0o0(o000000Var.f32215OooOoo0);
                    }
                }
                o000OOo o000oooOooO0O04 = o000000VarOooO00o3.OooO0O0();
                o000000 o000000VarOooO0OO4 = OooO0OO(o000000Var);
                if (o000000VarOooO0OO4 != null) {
                    o000OOo.OooO0O0("cacheResponse", o000000VarOooO0OO4);
                }
                o000oooOooO0O04.f32232OooO = o000000VarOooO0OO4;
                o000000 o000000VarOooO0OO5 = OooO0OO(o000000VarOooO00o3);
                if (o000000VarOooO0OO5 != null) {
                    o000OOo.OooO0O0("networkResponse", o000000VarOooO0OO5);
                }
                o000oooOooO0O04.f32240OooO0oo = o000000VarOooO0OO5;
                return o000oooOooO0O04.OooO00o();
        }
    }
}
