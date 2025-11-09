package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import com.ironsource.C3571qt;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sc */
/* loaded from: classes2.dex */
public final class C2043sc implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24059OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f24060OooO0O0;

    public /* synthetic */ C2043sc(gh0 gh0Var, p80 p80Var) {
        this.f24059OooO00o = 15;
        this.f24060OooO0O0 = gh0Var;
    }

    private final o00000oO.OooOOO OooO00o(Object obj) {
        gh0 gh0Var = (gh0) this.f24060OooO0O0;
        Exception exc = (Exception) obj;
        synchronized (gh0Var) {
            gh0Var.f19349OooO0O0 = true;
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) throws JSONException, a40 {
        u21 u21Var;
        ep0 ep0VarOoooooo;
        oe0 oe0Var;
        kc0 kc0Var;
        switch (this.f24059OooO00o) {
            case 0:
                C1969qc c1969qc = (C1969qc) obj;
                C2274yl c2274yl = new C2274yl();
                BinderC2006rc binderC2006rc = new BinderC2006rc(c2274yl);
                Parcel parcelOooO = c1969qc.OooO();
                AbstractC2218x2.OooO0OO(parcelOooO, (C1896oc) this.f24060OooO0O0);
                AbstractC2218x2.OooO0o0(parcelOooO, binderC2006rc);
                c1969qc.o000O0O0(parcelOooO, 2);
                return c2274yl;
            case 1:
                C1718jk c1718jk = (C1718jk) this.f24060OooO0O0;
                Map map = (Map) obj;
                c1718jk.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                synchronized (c1718jk.f20325OooO0oo) {
                                    try {
                                        int length = jSONArrayOptJSONArray.length();
                                        synchronized (c1718jk.f20325OooO0oo) {
                                            u21Var = (u21) c1718jk.f20319OooO0O0.get(str);
                                        }
                                        if (u21Var == null) {
                                            ze0.OooOOOO("Cannot find the corresponding resource object for " + str);
                                        } else {
                                            for (int i = 0; i < length; i++) {
                                                String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                                u21Var.OooO0Oo();
                                                v21.OooOoO((v21) u21Var.f25822OooOo0o, string);
                                            }
                                            c1718jk.f20322OooO0o = (length > 0) | c1718jk.f20322OooO0o;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) AbstractC1928p8.f23240OooO00o.OooOOO()).booleanValue()) {
                            zzo.zzf("Failed to get SafeBrowsing metadata", e);
                        }
                        return ii0.Ooooo00(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c1718jk.f20322OooO0o) {
                    synchronized (c1718jk.f20325OooO0oo) {
                        z11 z11Var = c1718jk.f20318OooO00o;
                        z11Var.OooO0Oo();
                        a31.Oooo0OO((a31) z11Var.f25822OooOo0o, 10);
                    }
                }
                boolean z = c1718jk.f20322OooO0o;
                if (!(z && c1718jk.f20324OooO0oO.zzg) && (!(c1718jk.f20327OooOO0O && c1718jk.f20324OooO0oO.zzf) && (z || !c1718jk.f20324OooO0oO.zzd))) {
                    return yp0.f25991OooOo0o;
                }
                synchronized (c1718jk.f20325OooO0oo) {
                    try {
                        for (u21 u21Var2 : c1718jk.f20319OooO0O0.values()) {
                            z11 z11Var2 = c1718jk.f20318OooO00o;
                            v21 v21Var = (v21) u21Var2.OooO0O0();
                            z11Var2.OooO0Oo();
                            a31.OooOoo((a31) z11Var2.f25822OooOo0o, v21Var);
                        }
                        z11 z11Var3 = c1718jk.f20318OooO00o;
                        ArrayList arrayList = c1718jk.f20320OooO0OO;
                        z11Var3.OooO0Oo();
                        a31.OooOoOO((a31) z11Var3.f25822OooOo0o, arrayList);
                        z11 z11Var4 = c1718jk.f20318OooO00o;
                        ArrayList arrayList2 = c1718jk.f20321OooO0Oo;
                        z11Var4.OooO0Oo();
                        a31.OooOoo0((a31) z11Var4.f25822OooOo0o, arrayList2);
                        if (((Boolean) AbstractC1928p8.f23240OooO00o.OooOOO()).booleanValue()) {
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + ((a31) c1718jk.f20318OooO00o.f25822OooOo0o).OooOoO0() + "\n  clickUrl: " + ((a31) c1718jk.f20318OooO00o.f25822OooOo0o).OooOo() + "\n  resources: \n");
                            for (v21 v21Var2 : Collections.unmodifiableList(((a31) c1718jk.f20318OooO00o.f25822OooOo0o).OooOoO())) {
                                sb.append("    [");
                                sb.append(v21Var2.OooOo0o());
                                sb.append("] ");
                                sb.append(v21Var2.OooOoO0());
                            }
                            ze0.OooOOOO(sb.toString());
                        }
                        o00000oO.OooOOO oooOOOZzb = new zzbo(c1718jk.f20323OooO0o0).zzb(1, c1718jk.f20324OooO0oO.zzb, null, ((a31) c1718jk.f20318OooO00o.OooO0O0()).OooO0Oo());
                        if (((Boolean) AbstractC1928p8.f23240OooO00o.OooOOO()).booleanValue()) {
                            oooOOOZzb.addListener(new RunnableC2105u0(1), AbstractC2200wl.f25321OooO00o);
                        }
                        ep0VarOoooooo = ii0.Ooooooo(oooOOOZzb, new o0O0o00O(3), AbstractC2200wl.f25327OooO0oO);
                    } finally {
                    }
                }
                return ep0VarOoooooo;
            case 2:
                String str2 = (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O00);
                Uri.Builder builder = (Uri.Builder) this.f24060OooO0O0;
                builder.appendQueryParameter(str2, "12");
                return ii0.OooooOO(builder.toString());
            case 3:
                ((OooOOo0.o0OOO0o) this.f24060OooO0O0).zza((Throwable) obj);
                return yp0.f25991OooOo0o;
            case 4:
                return ((t40) this.f24060OooO0O0).OooO00o((C2197wi) obj);
            case 5:
                return obj != null ? (ep0) this.f24060OooO0O0 : ii0.Ooooo00(new z70(1, "Retrieve required value in native ad response failed."));
            case 6:
                j00 j00Var = (j00) this.f24060OooO0O0;
                j00Var.getClass();
                InterfaceC1722jo interfaceC1722joOooO00o = j00Var.f20140OooO0OO.OooO00o(zzs.zzc(), null, null);
                C1776l4 c1776l4 = new C1776l4(interfaceC1722joOooO00o);
                j00Var.OooO00o(interfaceC1722joOooO00o);
                interfaceC1722joOooO00o.zzN().f21532OooOoo = new C1847n1(c1776l4, 18);
                interfaceC1722joOooO00o.loadUrl((String) zzbe.zzc().OooO00o(AbstractC1448c7.o00Oo0O0));
                return c1776l4;
            case 7:
                w40 w40Var = (w40) obj;
                return ii0.OooooOO(new rd0(new pd0(((j40) this.f24060OooO0O0).f20177OooO0OO, 0), C2051sk.OooO0o(new InputStreamReader(w40Var.f25181OooO00o), w40Var.f25182OooO0O0)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f24060OooO0O0;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(C3034d9.h.f8065E0, str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put(C3571qt.f11099n, jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return ii0.OooooOO(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            case 9:
                return ((C1676ie) this.f24060OooO0O0).OooO00o((JSONObject) obj);
            case 10:
                return ii0.OooooOO(new rd0(new pd0(((k40) this.f24060OooO0O0).f20439OooO0Oo, 0), C2051sk.OooO0o(new StringReader(((JSONObject) obj).toString()), null)));
            case 11:
                Throwable th = (Throwable) obj;
                xa0 xa0Var = (xa0) this.f24060OooO0O0;
                xa0Var.getClass();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17852o000ooo0)).booleanValue()) {
                    zzv.zzp().OooO0oo("OptionalSignalTimeout:" + xa0Var.f25581OooO00o.zza(), th);
                }
                return yp0.f25991OooOo0o;
            case 12:
                Throwable th2 = (Throwable) obj;
                qb0 qb0Var = (qb0) this.f24060OooO0O0;
                qb0Var.getClass();
                qb0Var.f23568OooO0OO.OooO00o(new b30(th2, 6));
                return ii0.OooooOO(th2 instanceof SecurityException ? new da0("", 2, 2) : th2 instanceof IllegalStateException ? new da0("", 3, 2) : th2 instanceof IllegalArgumentException ? new da0("", 4, 2) : th2 instanceof TimeoutException ? new da0("", 5, 2) : new da0("", 0, 2));
            case 13:
                return ii0.OooooOO(new r90((String) ((o90) this.f24060OooO0O0).f22369OooO0OO, 4));
            case 14:
                ue0 ue0Var = (ue0) obj;
                s20 s20Var = (s20) this.f24060OooO0O0;
                s20Var.getClass();
                if (ue0Var == null || (oe0Var = ue0Var.f24643OooO00o) == null || (kc0Var = ue0Var.f24644OooO0O0) == null) {
                    throw new a40(1, "Empty prefetch");
                }
                C1999r5 c1999r5OooOo0o = C2184w5.OooOo0o();
                C1925p5 c1925p5OooOoO = C1962q5.OooOoO();
                c1925p5OooOoO.OooO0Oo();
                C1962q5.OooOo0o((C1962q5) c1925p5OooOoO.f25822OooOo0o);
                C2073t5 c2073t5OooOo = C2073t5.OooOo();
                c1925p5OooOoO.OooO0Oo();
                C1962q5.OooOo((C1962q5) c1925p5OooOoO.f25822OooOo0o, c2073t5OooOo);
                c1999r5OooOo0o.OooO0Oo();
                C2184w5.OooOo((C2184w5) c1999r5OooOo0o.f25822OooOo0o, (C1962q5) c1925p5OooOoO.OooO0O0());
                oe0Var.f22979OooO00o.zzb().f21590OooO0o.OooOO0((C2184w5) c1999r5OooOo0o.OooO0O0());
                return s20Var.OooOO0o(oe0Var, kc0Var.f20477OooO0O0);
            case 15:
                return OooO00o(obj);
            default:
                return ii0.OooooOO(((bf0) this.f24060OooO0O0).zza(obj));
        }
    }

    public /* synthetic */ C2043sc(Object obj, int i) {
        this.f24059OooO00o = i;
        this.f24060OooO0O0 = obj;
    }
}
