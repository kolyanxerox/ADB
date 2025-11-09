package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import com.ironsource.C3571qt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.le */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1786le implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f20854OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f20855OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ Object f20856OooO0OO;

    public /* synthetic */ C1786le(int i, Object obj, Object obj2) {
        this.f20854OooO00o = i;
        this.f20855OooO0O0 = obj;
        this.f20856OooO0OO = obj2;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) throws JSONException, C1382ae {
        int i;
        oe0 oe0Var;
        boolean z = false;
        switch (this.f20854OooO00o) {
            case 0:
                InterfaceC2266yd interfaceC2266yd = (InterfaceC2266yd) obj;
                interfaceC2266yd.OooO0oo((String) this.f20855OooO0O0, (InterfaceC2042sb) this.f20856OooO0OO);
                return ii0.OooooOO(interfaceC2266yd);
            case 1:
                ((C1860ne) this.f20855OooO0O0).getClass();
                C2274yl c2274yl = new C2274yl();
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                AbstractC2005rb.f23829OooOOOO.OooO00o(string, new C2301zb(c2274yl, 1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3007ch.f7763x, string);
                jSONObject.put("args", (JSONObject) this.f20856OooO0OO);
                ((InterfaceC2266yd) obj).OooOOO("google.afma.activeView.handleUpdate", jSONObject);
                return c2274yl;
            case 2:
                C1468cr c1468cr = (C1468cr) this.f20855OooO0O0;
                c1468cr.getClass();
                c1468cr.f18049OooO0o0.OooO00o(new RunnableC1395ar(c1468cr, (Throwable) obj, 0));
                String str = (String) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0O00);
                Uri.Builder builder = (Uri.Builder) this.f20856OooO0OO;
                builder.appendQueryParameter(str, "9");
                return ii0.OooooOO(builder.toString());
            case 3:
                C2197wi c2197wi = (C2197wi) obj;
                C1875nt c1875nt = (C1875nt) this.f20855OooO0O0;
                c2197wi.zzi = (ne0) this.f20856OooO0OO;
                de0 de0Var = c1875nt.f21593OooO0oo;
                return de0Var.OooOo0o(c2197wi, new p80((q40) de0Var.f18240OooOo, 18), new sj0(de0Var, 21), new d40(c2197wi, 2));
            case 4:
                b00 b00Var = (b00) this.f20856OooO0OO;
                b00Var.getClass();
                zzv.zzA();
                InterfaceC1722jo interfaceC1722joOooO00o = C2055so.OooO00o(new Oooo0oO.o0O0O00(0, 0, 0), b00Var.f17144OooO00o, b00Var.f17147OooO0Oo, b00Var.f17149OooO0o0, b00Var.f17146OooO0OO, b00Var.f17148OooO0o, null, b00Var.f17157OooOOOo, null, null, b00Var.f17158OooOOo0, null, "native-omid", false, false);
                C1776l4 c1776l4 = new C1776l4(interfaceC1722joOooO00o);
                interfaceC1722joOooO00o.zzN().f21533OooOoo0 = new p80(c1776l4, 15);
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO00O)).booleanValue();
                String str2 = (String) this.f20855OooO0O0;
                if (zBooleanValue) {
                    interfaceC1722joOooO00o.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                } else {
                    interfaceC1722joOooO00o.loadData(str2, "text/html", "UTF-8");
                }
                return c1776l4;
            case 5:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                j00 j00Var = (j00) this.f20855OooO0O0;
                vd0 vd0Var = j00Var.f20138OooO00o;
                C1776l4 c1776l42 = new C1776l4(interfaceC1722jo);
                if (vd0Var.f24952OooO0O0 != null) {
                    i = 0;
                    interfaceC1722jo.o0OoOo0(new Oooo0oO.o0O0O00(5, 0, 0));
                } else {
                    i = 0;
                    interfaceC1722jo.o0OoOo0(new Oooo0oO.o0O0O00(4, 0, 0));
                }
                interfaceC1722jo.zzN().f21533OooOoo0 = new f00(j00Var, interfaceC1722jo, c1776l42, i);
                interfaceC1722jo.OooOOO("google.afma.nativeAds.renderVideo", (JSONObject) this.f20856OooO0OO);
                return c1776l42;
            case 6:
                return ((u40) ((z31) this.f20855OooO0O0).zzb()).OooO00o((C2197wi) this.f20856OooO0OO);
            case 7:
                Bundle bundle = (Bundle) obj;
                C2051sk c2051sk = (C2051sk) this.f20855OooO0O0;
                C2130up c2130up = (C2130up) c2051sk.f24099OooOoO;
                Context context = c2130up.f24675OooO00o.f20080OooO0O0;
                ii0.Oooo000(context);
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                OooO0oO.Oooo0 oooo0 = (OooO0oO.Oooo0) c2051sk.f24098OooOo0o;
                C2197wi c2197wi2 = (C2197wi) oooo0.f13283OooOo;
                ii0.Oooo000(c2197wi2.zzd);
                yb0 yb0Var = new yb0();
                p31 p31Var = c2130up.f24678OooO0Oo;
                xa0 xa0Var = new xa0(yb0Var, 0L, (ScheduledExecutorService) p31Var.zzb());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) p31Var.zzb();
                Context context2 = c2130up.f24675OooO00o.f20080OooO0O0;
                ii0.Oooo000(context2);
                xa0 xa0Var2 = new xa0(new k90(scheduledExecutorService, 6), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOoo)).longValue(), (ScheduledExecutorService) p31Var.zzb());
                C1756kl c1756kl = new C1756kl();
                ii0.Oooo000(context2);
                xa0 xa0Var3 = new xa0(new sb0(c1756kl, context2, (ScheduledExecutorService) p31Var.zzb(), c2163vl, oooo0.f13285OooOo0o, c2197wi2.zzl, c2197wi2.zzk), 0L, (ScheduledExecutorService) p31Var.zzb());
                xa0 xa0Var4 = new xa0(new na0(c2163vl, 4), 0L, (ScheduledExecutorService) p31Var.zzb());
                ii0.Oooo000(context2);
                na0 na0Var = new na0(c2163vl, 3);
                ii0.Oooo000(c2163vl);
                List list = ((C2197wi) oooo0.f13283OooOo).zze;
                ii0.Oooo000(list);
                o90 o90Var = new o90(7, c2163vl, list);
                c2051sk.getClass();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                C2197wi c2197wi3 = (C2197wi) ((OooO0oO.Oooo0) c2051sk.f24098OooOo0o).f13283OooOo;
                String string2 = c2197wi3.zza.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = c2197wi3.zzf;
                o90 o90Var2 = new o90(6, c2163vl2, string2);
                kb0 kb0Var = (kb0) c2130up.f24741o00000o0.zzb();
                ii0.Oooo000(c2197wi2.zzd);
                kb0[] kb0VarArr = {o90Var2, kb0Var, new t90((C1978ql) c2130up.f24713Oooo0oo.zzb(), (ScheduledExecutorService) p31Var.zzb(), c2163vl)};
                int i2 = um0.f24660OooOo;
                Object[] objArr = new Object[9];
                objArr[0] = xa0Var;
                objArr[1] = xa0Var2;
                objArr[2] = xa0Var3;
                objArr[3] = xa0Var4;
                objArr[4] = na0Var;
                objArr[5] = o90Var;
                System.arraycopy(kb0VarArr, 0, objArr, 6, 3);
                return new mb0(context, c2163vl, um0.OooOOOo(9, objArr), (mf0) ((p31) c2051sk.f24096OooOo).zzb(), (h20) c2130up.f24692OooOo.zzb()).OooO00o(zzbc.zzb().zzi(bundle), ((C2197wi) this.f20856OooO0OO).zzm, false);
            case 8:
                return ((mb0) this.f20855OooO0O0).OooO00o(zzbc.zzb().zzi((Bundle) obj), ((C2197wi) this.f20856OooO0OO).zzm, false);
            case 9:
                JSONObject jSONObject2 = (JSONObject) obj;
                m70 m70Var = (m70) this.f20855OooO0O0;
                m70Var.getClass();
                yp0 yp0VarOooooOO = ii0.OooooOO((z00) this.f20856OooO0OO);
                fe0 fe0Var = m70Var.f21125OooO0Oo;
                synchronized (fe0Var) {
                    fe0Var.f18935OooO00o.addFirst(yp0VarOooooOO);
                }
                if (jSONObject2.optBoolean("success")) {
                    return ii0.OooooOO(jSONObject2.getJSONObject("json").getJSONArray("ads"));
                }
                throw new C1382ae("process json failed");
            case 10:
                z00 z00Var = (z00) obj;
                m70 m70Var2 = (m70) this.f20855OooO0O0;
                m70Var2.getClass();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("isNonagon", true);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0o)).booleanValue() && Oooo0OO.o00oO0o.OooO()) {
                    jSONObject3.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C3571qt.f11099n, ((kd0) this.f20856OooO0OO).f20503OooOOoo.f22975OooO0OO);
                jSONObject4.put("sdk_params", jSONObject3);
                return ii0.ooOO(z00Var.OooO00o("google.afma.nativeAds.preProcessJson", jSONObject4), new C1786le(9, m70Var2, z00Var), m70Var2.f21123OooO0O0);
            case 11:
                rd0 rd0Var = (rd0) obj;
                ((oe0) this.f20855OooO0O0).f22980OooO0O0 = rd0Var;
                Iterator it = ((List) rd0Var.f23849OooO0O0.f24098OooOo0o).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((kd0) it.next()).f20487OooO00o.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).contains("FirstPartyRenderer")) {
                                z = true;
                            }
                        }
                    } else if (z) {
                        return ((C1875nt) this.f20856OooO0OO).OooO00o(ii0.OooooOO(rd0Var));
                    }
                }
                return yp0.f25991OooOo0o;
            default:
                de0 de0Var2 = (de0) this.f20855OooO0O0;
                InterfaceC1691iu interfaceC1691iu = (InterfaceC1691iu) this.f20856OooO0OO;
                oc0 oc0Var = (oc0) obj;
                de0 de0Var3 = (de0) de0Var2.f18242OooOo0o;
                pe0 pe0Var = oc0Var.f22970OooO0O0;
                C2197wi c2197wi4 = oc0Var.f22969OooO00o;
                synchronized (de0Var3) {
                    try {
                        ie0 ie0Var = (ie0) ((ConcurrentHashMap) de0Var3.f18242OooOo0o).get(pe0Var);
                        oe0Var = null;
                        if (ie0Var != null) {
                            we0 we0Var = ie0Var.f20035OooO0Oo;
                            we0Var.getClass();
                            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                            we0Var.f25300OooO0OO = System.currentTimeMillis();
                            we0Var.f25301OooO0Oo++;
                            ie0Var.OooO00o();
                            LinkedList linkedList = ie0Var.f20032OooO00o;
                            if (!linkedList.isEmpty() && (oe0Var = (oe0) linkedList.remove()) != null) {
                                we0Var.f25303OooO0o0++;
                                we0Var.f25299OooO0O0.f24969OooOo0O = true;
                            }
                            if (oe0Var == null) {
                                ((ke0) de0Var3.f18243OooOoO0).f20564OooO0o0++;
                            }
                            ve0 ve0Var = ie0Var.f20035OooO0Oo.f25299OooO0O0;
                            ve0 ve0VarClone = ve0Var.clone();
                            ve0Var.f24969OooOo0O = false;
                            ve0Var.f24970OooOo0o = 0;
                            if (oe0Var != null) {
                                C1999r5 c1999r5OooOo0o = C2184w5.OooOo0o();
                                C1925p5 c1925p5OooOoO = C1962q5.OooOoO();
                                c1925p5OooOoO.OooO0Oo();
                                C1962q5.OooOo0o((C1962q5) c1925p5OooOoO.f25822OooOo0o);
                                C2036s5 c2036s5OooOo0o = C2073t5.OooOo0o();
                                boolean z2 = ve0VarClone.f24969OooOo0O;
                                c2036s5OooOo0o.OooO0Oo();
                                C2073t5.OooOoO0((C2073t5) c2036s5OooOo0o.f25822OooOo0o, z2);
                                int i3 = ve0VarClone.f24970OooOo0o;
                                c2036s5OooOo0o.OooO0Oo();
                                C2073t5.OooOoO((C2073t5) c2036s5OooOo0o.f25822OooOo0o, i3);
                                c1925p5OooOoO.OooO0Oo();
                                C1962q5.OooOo((C1962q5) c1925p5OooOoO.f25822OooOo0o, (C2073t5) c2036s5OooOo0o.OooO0O0());
                                c1999r5OooOo0o.OooO0Oo();
                                C2184w5.OooOo((C2184w5) c1999r5OooOo0o.f25822OooOo0o, (C1962q5) c1925p5OooOoO.OooO0O0());
                                oe0Var.f22979OooO00o.zzb().f21590OooO0o.Oooooo0((C2184w5) c1999r5OooOo0o.OooO0O0());
                            }
                            de0Var3.OooOo0();
                        } else {
                            ((ke0) de0Var3.f18243OooOoO0).f20562OooO0Oo++;
                            de0Var3.OooOo0();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (oe0Var != null && c2197wi4 != null) {
                    C1875nt c1875ntZzb = interfaceC1691iu.zzb();
                    ef0 ef0Var = ef0.NOTIFY_CACHE_HIT;
                    de0 de0Var4 = c1875ntZzb.f21593OooO0oo;
                    df0 df0VarOooO00o = c1875ntZzb.f21588OooO0OO.OooO00o(ef0Var, de0Var4.OooOo0o(c2197wi4, new wj0(de0Var4, 22), new C1847n1(de0Var4, 21), new C2094tq(5))).OooO00o();
                    df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new sj0(c1875ntZzb, 12)), c1875ntZzb.f21594OooOO0);
                    df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, (C1658hx) de0Var2.f18243OooOoO0), (cq0) de0Var2.f18240OooOo);
                }
                return ii0.OooooOO(new mc0(pe0Var, c2197wi4, oe0Var));
        }
    }

    public /* synthetic */ C1786le(b00 b00Var, String str) {
        this.f20854OooO00o = 4;
        this.f20856OooO0OO = b00Var;
        this.f20855OooO0O0 = str;
    }
}
