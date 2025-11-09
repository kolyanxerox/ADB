package o00OOO;

import OooOOo0.o0OOO0o;
import com.ironsource.C3037dc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000Ooo.o00oO0o;
import o00OOO0.Oooo000;
import o00OOO0.o000000;
import o00OOO0.o000OOo;
import o00OOO0.o000oOoO;
import o00OOO0.o00O0O;
import o00OOO0.o00Oo0;
import o00OOO0.o0O0O00;
import o00OOO0.o0OO00O;
import o00OOO0.o0OoOo0;
import o00OOO0.oo000o;
import o00OOO0.oo0o0Oo;
import o00OOOO0.OooOO0;
import o00OOOO0.OooOO0O;
import o00OOOoO.o000O000;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes3.dex */
public final class OooO00o implements o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32105OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f32106OooO0O0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f32105OooO00o = i;
        this.f32106OooO0O0 = obj;
    }

    @Override // o00OOO0.o00O0O
    public final o000000 OooO00o(OooOO0 oooOO0) throws InterruptedException, NumberFormatException {
        boolean z;
        switch (this.f32105OooO00o) {
            case 0:
                o0OO00O o0oo00o = oooOO0.f32381OooO0o;
                OooO oooO = oooOO0.f32378OooO0O0;
                boolean z2 = !o0oo00o.f32278OooO0O0.equals("GET");
                oo000o oo000oVar = (oo000o) this.f32106OooO0O0;
                oooO.getClass();
                try {
                    o00OOOO0.OooO0OO OooO0oo2 = oooO.OooO0Oo(oooOO0.f32376OooO, oooOO0.f32385OooOO0, oooOO0.f32386OooOO0O, oo000oVar.f32324Oooo0oo, z2).OooO0oo(oo000oVar, oooOO0, oooO);
                    synchronized (oooO.f32096OooO0Oo) {
                        oooO.f32103OooOOO = OooO0oo2;
                    }
                    return oooOO0.OooO00o(o0oo00o, oooO, OooO0oo2, oooO.OooO00o());
                } catch (IOException e) {
                    throw new OooO0OO(e);
                }
            default:
                o0OO00O o0oo00o2 = oooOO0.f32381OooO0o;
                o0OOO0o o0ooo0oOooO00o = o0oo00o2.OooO00o();
                o0O0O00 o0o0o00 = o0oo00o2.f32280OooO0Oo;
                if (o0o0o00 != null) {
                    oo0o0Oo oo0o0oo = (oo0o0Oo) o0o0o00;
                    o00Oo0 o00oo0 = oo0o0oo.f32327OooO00o;
                    if (o00oo0 != null) {
                        ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Content-Type", o00oo0.f32246OooO00o);
                    }
                    long j = oo0o0oo.f32328OooO0O0;
                    if (j != -1) {
                        ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo(HttpHeaders.CONTENT_LENGTH, Long.toString(j));
                        o0ooo0oOooO00o.OooOOO0("Transfer-Encoding");
                    } else {
                        ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Transfer-Encoding", "chunked");
                        o0ooo0oOooO00o.OooOOO0(HttpHeaders.CONTENT_LENGTH);
                    }
                }
                o000oOoO o000oooo2 = o0oo00o2.f32279OooO0OO;
                String strOooO0OO = o000oooo2.OooO0OO("Host");
                o0OoOo0 o0oooo0 = o0oo00o2.f32277OooO00o;
                if (strOooO0OO == null) {
                    ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Host", o00OOO0O.OooO0OO.OooOO0o(o0oooo0, false));
                }
                if (o000oooo2.OooO0OO("Connection") == null) {
                    ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Connection", "Keep-Alive");
                }
                if (o000oooo2.OooO0OO("Accept-Encoding") == null && o000oooo2.OooO0OO("Range") == null) {
                    ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                o00OOO0.OooO0O0 oooO0O0 = (o00OOO0.OooO0O0) this.f32106OooO0O0;
                oooO0O0.getClass();
                List list = Collections.EMPTY_LIST;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        Oooo000 oooo000 = (Oooo000) list.get(i);
                        sb.append(oooo000.f32200OooO00o);
                        sb.append(C3037dc.f8244T);
                        sb.append(oooo000.f32201OooO0O0);
                    }
                    ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("Cookie", sb.toString());
                }
                if (o000oooo2.OooO0OO("User-Agent") == null) {
                    ((o00oO0o) o0ooo0oOooO00o.f13520OooOoO0).OooO0oo("User-Agent", "okhttp/3.12.13");
                }
                o000000 o000000VarOooO00o = oooOO0.OooO00o(o0ooo0oOooO00o.OooO0OO(), oooOO0.f32378OooO0O0, oooOO0.f32379OooO0OO, oooOO0.f32380OooO0Oo);
                o000oOoO o000oooo3 = o000000VarOooO00o.f32213OooOoOO;
                o00OOOO0.OooO.OooO0Oo(oooO0O0, o0oooo0, o000oooo3);
                o000OOo o000oooOooO0O0 = o000000VarOooO00o.OooO0O0();
                o000oooOooO0O0.f32233OooO00o = o0oo00o2;
                if (z && "gzip".equalsIgnoreCase(o000000VarOooO00o.OooO00o(HttpHeaders.CONTENT_ENCODING)) && o00OOOO0.OooO.OooO0O0(o000000VarOooO00o)) {
                    o000O000 o000o0002 = new o000O000(o000000VarOooO00o.f32215OooOoo0.OooO0OO());
                    o00oO0o o00oo0oOooO0o0 = o000oooo3.OooO0o0();
                    o00oo0oOooO0o0.OooO0oO(HttpHeaders.CONTENT_ENCODING);
                    o00oo0oOooO0o0.OooO0oO(HttpHeaders.CONTENT_LENGTH);
                    ArrayList arrayList = (ArrayList) o00oo0oOooO0o0.f30487OooOo0o;
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    o00oO0o o00oo0o = new o00oO0o(15);
                    Collections.addAll((ArrayList) o00oo0o.f30487OooOo0o, strArr);
                    o000oooOooO0O0.f32237OooO0o = o00oo0o;
                    o000oooOooO0O0.f32239OooO0oO = new OooOO0O(o000000VarOooO00o.OooO00o("Content-Type"), -1L, o00Oo0oo.o00oO0o.OooO00o(o000o0002));
                }
                return o000oooOooO0O0.OooO00o();
        }
    }
}
