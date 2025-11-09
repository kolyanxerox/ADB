package o000o0O;

import com.ironsource.C3037dc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0oOo.o000OO;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Oooo000 extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f30919OooOo;

    /* renamed from: OooOo0O */
    public int f30920OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Oooo0 f30921OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ OooOo00 f30922OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ OooOOOO f30923OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Oooo0 oooo0, Map map, OooOOOO oooOOOO, OooOo00 oooOo00, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30921OooOo0o = oooo0;
        this.f30919OooOo = map;
        this.f30923OooOoO0 = oooOOOO;
        this.f30922OooOoO = oooOo00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        OooOOOO oooOOOO = this.f30923OooOoO0;
        OooOo00 oooOo00 = this.f30922OooOoO;
        return new Oooo000(this.f30921OooOo0o, this.f30919OooOo, oooOOOO, oooOo00, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((Oooo000) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f30920OooOo0O;
        OooOo00 oooOo002 = this.f30922OooOoO;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.f30920OooOo0O = 3;
            oooOo002.invoke(message, this);
            if (oooOo == oooOo00) {
            }
        }
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            URLConnection uRLConnectionOpenConnection = Oooo0.OooO00o(this.f30921OooOo0o).openConnection();
            kotlin.jvm.internal.OooOo.OooO0OO(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", C3037dc.f8236L);
            for (Map.Entry entry : this.f30919OooOo.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb.toString());
                OooOOOO oooOOOO = this.f30923OooOoO0;
                this.f30920OooOo0O = 1;
                if (oooOOOO.invoke(jSONObject, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                this.f30920OooOo0O = 2;
                oooOo002.invoke("Bad response code: " + responseCode, this);
                if (oooOo == oooOo00) {
                    return oooOo00;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return oooOo;
    }
}
