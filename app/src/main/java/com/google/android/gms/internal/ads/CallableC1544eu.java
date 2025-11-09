package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eu */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC1544eu implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f18699OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f18700OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f18701OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f18702OooOoO0;

    public /* synthetic */ CallableC1544eu(df0 df0Var, C2197wi c2197wi, df0 df0Var2) {
        this.f18700OooOo0O = 2;
        this.f18699OooOo = df0Var;
        this.f18701OooOo0o = c2197wi;
        this.f18702OooOoO0 = df0Var2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws z70 {
        C2197wi c2197wi;
        Bundle bundle;
        switch (this.f18700OooOo0O) {
            case 0:
                C1618gu c1618gu = (C1618gu) this.f18701OooOo0o;
                c1618gu.getClass();
                C1581fu c1581fu = (C1581fu) ((df0) this.f18699OooOo).f18244OooOo.get();
                return new C2197wi(c1581fu.f19125OooO00o, c1618gu.f19463OooO0O0, c1618gu.f19464OooO0OO, c1618gu.f19465OooO0Oo, c1618gu.f19467OooO0o0, c1618gu.f19466OooO0o, (String) ((o00000oO.OooOOO) c1618gu.f19468OooO0oO.zzb()).get(), c1618gu.f19469OooO0oo, null, null, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0O)).booleanValue() && c1618gu.f19470OooOO0.zzN(), c1618gu.f19471OooOO0O.f24955OooO0o.matches((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17891o00OO00o)), (Bundle) this.f18702OooOoO0, c1581fu.f19126OooO0O0);
            case 1:
                C2065sy c2065sy = new C2065sy();
                JSONObject jSONObject = (JSONObject) this.f18702OooOoO0;
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (c2065sy) {
                    c2065sy.f24179OooO00o = iOptInt;
                }
                String strOptString = jSONObject.optString("custom_template_id");
                synchronized (c2065sy) {
                    c2065sy.OooOo0 = strOptString;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null;
                rd0 rd0Var = (rd0) this.f18701OooOo0o;
                synchronized (c2065sy) {
                    c2065sy.f24200OooOoO0 = strOptString2;
                }
                vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                if (!vd0Var.f24957OooO0oO.contains(Integer.toString(c2065sy.OooO0oO()))) {
                    throw new z70(1, OooO0oO.OooOo.OooO0o(c2065sy.OooO0oO(), "Invalid template ID: "));
                }
                if (c2065sy.OooO0oO() == 3) {
                    if (c2065sy.OooO00o() == null) {
                        throw new z70(1, "No custom template id for custom template ad response.");
                    }
                    if (!vd0Var.f24958OooO0oo.contains(c2065sy.OooO00o())) {
                        throw new z70(1, "Unexpected custom template id in the response.");
                    }
                }
                kd0 kd0Var = (kd0) this.f18699OooOo;
                double dOptDouble = jSONObject.optDouble("rating", -1.0d);
                synchronized (c2065sy) {
                    c2065sy.f24193OooOOo = dOptDouble;
                }
                String strOptString3 = jSONObject.optString("headline", null);
                if (kd0Var.f20522Oooo0o) {
                    zzv.zzq();
                    strOptString3 = OooO0oO.OooOo.OooOoo(zzs.zzz(), " : ", strOptString3);
                }
                c2065sy.OooO0Oo("headline", strOptString3);
                c2065sy.OooO0Oo(C3034d9.h.f8065E0, jSONObject.optString(C3034d9.h.f8065E0, null));
                c2065sy.OooO0Oo("call_to_action", jSONObject.optString("call_to_action", null));
                c2065sy.OooO0Oo(C3034d9.h.f8088U, jSONObject.optString(C3034d9.h.f8088U, null));
                c2065sy.OooO0Oo("price", jSONObject.optString("price", null));
                c2065sy.OooO0Oo(C3034d9.h.f8067F0, jSONObject.optString(C3034d9.h.f8067F0, null));
                return c2065sy;
            case 2:
                C2234xi c2234xi = (C2234xi) ((df0) this.f18699OooOo).f18244OooOo.get();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && (bundle = (c2197wi = (C2197wi) this.f18701OooOo0o).zzm) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c2234xi.f25636OooOO0);
                    c2197wi.zzm.putLong("get-ad-dictionary-sdkcore-end", c2234xi.f25637OooOO0O);
                }
                return new g50((JSONObject) ((df0) this.f18702OooOoO0).f18244OooOo.get(), c2234xi);
            default:
                d70 d70Var = (d70) this.f18701OooOo0o;
                d70Var.getClass();
                kd0 kd0Var2 = (kd0) this.f18702OooOoO0;
                rd0 rd0Var2 = (rd0) this.f18699OooOo;
                de0 de0Var = new de0(rd0Var2, kd0Var2, (String) null);
                C2249xx c2249xx = new C2249xx(27, ((vd0) rd0Var2.f23848OooO00o.f23325OooOo0o).OooO00o(), new o000oOoO(d70Var, rd0Var2, kd0Var2, 7));
                C2315zp c2315zp = (C2315zp) d70Var.f18187OooO00o;
                C2315zp c2315zp2 = c2315zp.f26243OooO0o0;
                C1764kt c1764kt = new C1764kt(de0Var, 3);
                C1764kt c1764kt2 = new C1764kt(de0Var, 0);
                int i = x31.f25505OooO0OO;
                List list = Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(c2315zp2.f26302o00000O);
                arrayList.add(c2315zp2.f26304o00000OO);
                p31 p31VarOooO0O0 = p31.OooO0O0(new C1987qu(new x31(list, arrayList), 3));
                ArrayList arrayList2 = new ArrayList(4);
                ArrayList arrayList3 = new ArrayList(4);
                arrayList2.add(c2315zp2.f26316o0000OOo);
                arrayList3.add(c2315zp2.f26318o0000Oo0);
                arrayList2.add(c2315zp2.f26317o0000Oo);
                arrayList2.add(c2315zp2.f26319o0000OoO);
                arrayList3.add(c2315zp2.f26296o000);
                arrayList3.add(c2315zp2.f26333o000O000);
                arrayList3.add(c2315zp2.f26340o000OoO);
                arrayList2.add(c2315zp2.f26322o0000o0);
                p31 p31VarOooO0O02 = p31.OooO0O0(new C1987qu(new x31(arrayList2, arrayList3), 5));
                C1984qr c1984qr = new C1984qr(c1764kt2, new C1764kt(de0Var, 1), c2315zp2.f26351o0OOO0o, new C1764kt(de0Var, 2), c2315zp2.f26250OooOOOO);
                p31 p31VarOooO0O03 = p31.OooO0O0(wz0.f25461OooOoO);
                ArrayList arrayList4 = new ArrayList(1);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(c2315zp2.f26341o000Ooo);
                arrayList4.add(c2315zp2.f26335o000O0O);
                C1987qu c1987qu = new C1987qu(new x31(arrayList4, arrayList5), 6);
                List list2 = Collections.EMPTY_LIST;
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c2315zp2.f26314o0000OO0);
                C2022rs c2022rs = (C2022rs) p31.OooO0O0(new C2280yr((q31) new C2171vt(c1764kt, c1764kt2, p31VarOooO0O0, p31VarOooO0O02, c2315zp2.f26336o000O0o, c1984qr, p31VarOooO0O03, c1987qu, p31.OooO0O0(new C1987qu(new x31(list2, arrayList6), 18))), (q31) new C2059ss(c2249xx, 1), (q31) new C2059ss(c2249xx, 0), c2315zp.f26241OooO0Oo.f24677OooO0OO, 2)).zzb();
                ii0.Oooo000(c2022rs);
                return c2022rs;
        }
    }

    public /* synthetic */ CallableC1544eu(Object obj, Object obj2, Object obj3, int i) {
        this.f18700OooOo0O = i;
        this.f18701OooOo0o = obj;
        this.f18699OooOo = obj2;
        this.f18702OooOoO0 = obj3;
    }
}
