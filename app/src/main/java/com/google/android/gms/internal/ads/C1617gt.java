package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gt */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1617gt implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f19454OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f19455OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ Object f19456OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ Object f19457OooO0Oo;

    public /* synthetic */ C1617gt(i60 i60Var, kd0 kd0Var, rd0 rd0Var, C1658hx c1658hx, int i) {
        this.f19454OooO00o = i;
        this.f19455OooO0O0 = i60Var;
        this.f19456OooO0OO = kd0Var;
        this.f19457OooO0Oo = rd0Var;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) throws JSONException {
        switch (this.f19454OooO00o) {
            case 0:
                AbstractC1397at abstractC1397at = (AbstractC1397at) obj;
                C1727jt c1727jt = (C1727jt) this.f19455OooO0O0;
                if (abstractC1397at != null) {
                    ((OooOOo0.o0OOO0o) this.f19456OooO0OO).mo13705zzb(abstractC1397at);
                }
                return ii0.o00Oo0((o00000oO.OooOOO) this.f19457OooO0Oo, ((Long) AbstractC2039s8.f24033OooO00o.OooOOO()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) c1727jt.f20384OooOo);
            case 1:
                String str = (String) this.f19456OooO0OO;
                JSONObject jSONObject = (JSONObject) this.f19457OooO0Oo;
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                C1895ob c1895ob = ((z00) this.f19455OooO0O0).f26058OooO0oo;
                c1895ob.getClass();
                C2274yl c2274yl = new C2274yl();
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                c1895ob.OooO00o(string, new C2301zb(c2274yl, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C3007ch.f7763x, string);
                    jSONObject2.put("args", jSONObject);
                    interfaceC1722jo.OooOOO(str, jSONObject2);
                } catch (Exception e) {
                    c2274yl.zzd(e);
                }
                return c2274yl;
            case 2:
                r60 r60Var = (r60) this.f19455OooO0O0;
                r60Var.getClass();
                C2148v6 c2148v6 = AbstractC1448c7.f17846o000oo;
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue();
                f20 f20Var = r60Var.f23773OooO;
                if (zBooleanValue) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var.f18768OooO0OO, "rendering-webview-creation-start");
                }
                rd0 rd0Var = (rd0) this.f19457OooO0Oo;
                C2051sk c2051sk = rd0Var.f23849OooO0O0;
                vd0 vd0Var = r60Var.f23776OooO0OO;
                kd0 kd0Var = (kd0) this.f19456OooO0OO;
                final InterfaceC1722jo interfaceC1722joOooO00o = r60Var.f23775OooO0O0.OooO00o(vd0Var.f24956OooO0o0, kd0Var, (md0) c2051sk.f24096OooOo);
                interfaceC1722joOooO00o.OooOOOO(kd0Var.f20531OoooOOO);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var.f18768OooO0OO, "rendering-webview-creation-end");
                }
                C2274yl c2274yl2 = new C2274yl();
                de0 de0Var = new de0(rd0Var, kd0Var, (String) null);
                VersionInfoParcel versionInfoParcel = r60Var.f23779OooO0o0;
                boolean z = r60Var.f23780OooO0oO;
                C2116ub c2116ub = r60Var.f23778OooO0o;
                C2116ub c2116ub2 = c2116ub;
                C2249xx c2249xx = new C2249xx(29, new t60(versionInfoParcel, c2274yl2, kd0Var, interfaceC1722joOooO00o, vd0Var, z, c2116ub, r60Var.f23781OooO0oo, r60Var.f23782OooOO0), interfaceC1722joOooO00o);
                Oooo0oO.o0000Ooo o0000ooo = new Oooo0oO.o0000Ooo(kd0Var.f20535OoooOoo, 2);
                C2241xp c2241xp = (C2241xp) r60Var.f23774OooO00o;
                C2167vp c2167vp = new C2167vp(c2241xp.f25672OooO0OO, c2241xp.f25673OooO0Oo, de0Var, c2249xx, o0000ooo);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v6)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var.f18768OooO0OO, "rendering-ad-component-creation-end");
                }
                p31 p31Var = c2167vp.f25106OoooO0;
                m10 m10Var = (m10) p31Var.zzb();
                if (!r60Var.f23780OooO0oO) {
                    c2116ub2 = null;
                }
                m10Var.OooO00o(interfaceC1722joOooO00o, false, c2116ub2, f20Var.f18768OooO0OO);
                c2274yl2.zzc(c2167vp);
                final int i = 0;
                c2167vp.o00o0O().o00000o0(new InterfaceC1399av() { // from class: com.google.android.gms.internal.ads.q60
                    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
                    public final void zzr() {
                        switch (i) {
                            case 0:
                                InterfaceC1722jo interfaceC1722jo2 = interfaceC1722joOooO00o;
                                if (interfaceC1722jo2.zzN() != null) {
                                    interfaceC1722jo2.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC1722jo interfaceC1722jo3 = interfaceC1722joOooO00o;
                                if (interfaceC1722jo3.zzN() != null) {
                                    interfaceC1722jo3.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC1722jo interfaceC1722jo4 = interfaceC1722joOooO00o;
                                if (interfaceC1722jo4.zzN() != null) {
                                    interfaceC1722jo4.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC1722jo interfaceC1722jo5 = interfaceC1722joOooO00o;
                                if (interfaceC1722jo5.zzN() != null) {
                                    interfaceC1722jo5.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC2200wl.f25327OooO0oO);
                od0 od0Var = kd0Var.f20503OooOOoo;
                String strOooO0O0 = od0Var.f22973OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && ((e60) c2167vp.f25091OooOoo.zzb()).OooO0Oo()) {
                    strOooO0O0 = AbstractC1430bp.OooO0O0(strOooO0O0, AbstractC1430bp.OooO00o(kd0Var));
                }
                return ii0.Ooooooo(m10.OooO0O0(interfaceC1722joOooO00o, od0Var.f22974OooO0O0, strOooO0O0, f20Var.f18768OooO0OO), new C1398au(interfaceC1722joOooO00o, kd0Var, c2167vp, 1), r60Var.f23777OooO0Oo);
            case 3:
                x60 x60Var = (x60) this.f19455OooO0O0;
                x60Var.getClass();
                C2148v6 c2148v62 = AbstractC1448c7.f17846o000oo;
                boolean zBooleanValue2 = ((Boolean) zzbe.zzc().OooO00o(c2148v62)).booleanValue();
                f20 f20Var2 = x60Var.f25535OooO0oO;
                if (zBooleanValue2) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var2.f18768OooO0OO, "rendering-webview-creation-start");
                }
                kd0 kd0Var2 = (kd0) this.f19457OooO0Oo;
                Context context = x60Var.f25530OooO0O0;
                zzs zzsVarOooO0o = ze0.OooO0o(context, kd0Var2.OooOo0);
                rd0 rd0Var2 = (rd0) this.f19456OooO0OO;
                final InterfaceC1722jo interfaceC1722joOooO00o2 = x60Var.f25531OooO0OO.OooO00o(zzsVarOooO0o, kd0Var2, (md0) rd0Var2.f23849OooO0O0.f24096OooOo);
                interfaceC1722joOooO00o2.OooOOOO(kd0Var2.f20531OoooOOO);
                View viewOooO00o = (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue() && kd0Var2.f20542Oooooo0) ? ViewTreeObserverOnScrollChangedListenerC2096ts.OooO00o(context, interfaceC1722joOooO00o2.OooO0oO(), kd0Var2) : new p10(context, interfaceC1722joOooO00o2.OooO0oO(), (zzau) x60Var.f25533OooO0o.apply(kd0Var2));
                if (((Boolean) zzbe.zzc().OooO00o(c2148v62)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var2.f18768OooO0OO, "rendering-webview-creation-end");
                }
                de0 de0Var2 = new de0(rd0Var2, kd0Var2, (String) null);
                C1386ai c1386ai = new C1386ai(viewOooO00o, interfaceC1722joOooO00o2, new sj0(interfaceC1722joOooO00o2, 22), zzsVarOooO0o.zzi ? new ld0(-3, 0, true) : new ld0(zzsVarOooO0o.zze, zzsVarOooO0o.zzb, false));
                C2315zp c2315zp = (C2315zp) x60Var.f25529OooO00o;
                C2278yp c2278yp = new C2278yp(c2315zp.f26241OooO0Oo, c2315zp.f26243OooO0o0, de0Var2, c1386ai);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v62)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var2.f18768OooO0OO, "rendering-ad-component-creation-end");
                }
                p31 p31Var2 = c2278yp.f25989OoooO0O;
                ((m10) p31Var2.zzb()).OooO00o(interfaceC1722joOooO00o2, false, null, f20Var2.f18768OooO0OO);
                C2320zu c2320zu = (C2320zu) c2278yp.f25979Oooo00O.zzb();
                final int i2 = 1;
                InterfaceC1399av interfaceC1399av = new InterfaceC1399av() { // from class: com.google.android.gms.internal.ads.q60
                    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
                    public final void zzr() {
                        switch (i2) {
                            case 0:
                                InterfaceC1722jo interfaceC1722jo2 = interfaceC1722joOooO00o2;
                                if (interfaceC1722jo2.zzN() != null) {
                                    interfaceC1722jo2.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC1722jo interfaceC1722jo3 = interfaceC1722joOooO00o2;
                                if (interfaceC1722jo3.zzN() != null) {
                                    interfaceC1722jo3.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC1722jo interfaceC1722jo4 = interfaceC1722joOooO00o2;
                                if (interfaceC1722jo4.zzN() != null) {
                                    interfaceC1722jo4.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC1722jo interfaceC1722jo5 = interfaceC1722joOooO00o2;
                                if (interfaceC1722jo5.zzN() != null) {
                                    interfaceC1722jo5.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                        }
                    }
                };
                C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
                c2320zu.o00000o0(interfaceC1399av, c2163vl);
                od0 od0Var2 = kd0Var2.f20503OooOOoo;
                String strOooO0O02 = od0Var2.f22973OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && ((e60) c2278yp.f25975OooOooo.zzb()).OooO0Oo()) {
                    strOooO0O02 = AbstractC1430bp.OooO0O0(strOooO0O02, AbstractC1430bp.OooO00o(kd0Var2));
                }
                C2274yl c2274ylOooO0O0 = m10.OooO0O0(interfaceC1722joOooO00o2, od0Var2.f22974OooO0O0, strOooO0O02, f20Var2.f18768OooO0OO);
                boolean z2 = kd0Var2.f20522Oooo0o;
                Executor executor = x60Var.f25534OooO0o0;
                if (z2) {
                    c2274ylOooO0O0.addListener(new RunnableC1911os(interfaceC1722joOooO00o2, 5), executor);
                }
                c2274ylOooO0O0.addListener(new c60(1, x60Var, interfaceC1722joOooO00o2), executor);
                return ii0.Ooooooo(c2274ylOooO0O0, new C2123ui(c2278yp, 2), c2163vl);
            case 4:
                return ii0.OooooOO(ViewTreeObserverOnScrollChangedListenerC2096ts.OooO00o(((u60) this.f19455OooO0O0).f24567OooO0O0, (View) this.f19456OooO0OO, (kd0) this.f19457OooO0Oo));
            case 5:
                return ii0.OooooOO(ViewTreeObserverOnScrollChangedListenerC2096ts.OooO00o(((a70) this.f19455OooO0O0).f16931OooO0O0, (View) this.f19456OooO0OO, (kd0) this.f19457OooO0Oo));
            case 6:
                g70 g70Var = (g70) this.f19455OooO0O0;
                g70Var.getClass();
                C2148v6 c2148v63 = AbstractC1448c7.f17846o000oo;
                boolean zBooleanValue3 = ((Boolean) zzbe.zzc().OooO00o(c2148v63)).booleanValue();
                f20 f20Var3 = g70Var.f19256OooOO0;
                if (zBooleanValue3) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var3.f18768OooO0OO, "rendering-webview-creation-start");
                }
                rd0 rd0Var3 = (rd0) this.f19457OooO0Oo;
                C2051sk c2051sk2 = rd0Var3.f23849OooO0O0;
                vd0 vd0Var2 = g70Var.f19251OooO0Oo;
                kd0 kd0Var3 = (kd0) this.f19456OooO0OO;
                final InterfaceC1722jo interfaceC1722joOooO00o3 = g70Var.f19250OooO0OO.OooO00o(vd0Var2.f24956OooO0o0, kd0Var3, (md0) c2051sk2.f24096OooOo);
                interfaceC1722joOooO00o3.OooOOOO(kd0Var3.f20531OoooOOO);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v63)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var3.f18768OooO0OO, "rendering-webview-creation-end");
                }
                C2274yl c2274yl3 = new C2274yl();
                de0 de0Var3 = new de0(rd0Var3, kd0Var3, (String) null);
                VersionInfoParcel versionInfoParcel2 = g70Var.f19252OooO0o;
                boolean z3 = g70Var.f19255OooO0oo;
                C2116ub c2116ub3 = g70Var.f19254OooO0oO;
                C1431bq c1431bqOooO00o = ((AbstractC1990qx) g70Var.OooOO0o).OooO00o(de0Var3, new C2249xx(29, new C1643hi(g70Var.f19249OooO0O0, versionInfoParcel2, c2274yl3, kd0Var3, interfaceC1722joOooO00o3, vd0Var2, z3, c2116ub3, g70Var.f19247OooO, g70Var.f19257OooOO0O), interfaceC1722joOooO00o3));
                c2274yl3.zzc(c1431bqOooO00o);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v63)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var3.f18768OooO0OO, "rendering-ad-component-creation-end");
                }
                final int i3 = 2;
                c1431bqOooO00o.o00Ooo().o00000o0(new InterfaceC1399av() { // from class: com.google.android.gms.internal.ads.q60
                    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
                    public final void zzr() {
                        switch (i3) {
                            case 0:
                                InterfaceC1722jo interfaceC1722jo2 = interfaceC1722joOooO00o3;
                                if (interfaceC1722jo2.zzN() != null) {
                                    interfaceC1722jo2.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC1722jo interfaceC1722jo3 = interfaceC1722joOooO00o3;
                                if (interfaceC1722jo3.zzN() != null) {
                                    interfaceC1722jo3.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC1722jo interfaceC1722jo4 = interfaceC1722joOooO00o3;
                                if (interfaceC1722jo4.zzN() != null) {
                                    interfaceC1722jo4.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC1722jo interfaceC1722jo5 = interfaceC1722joOooO00o3;
                                if (interfaceC1722jo5.zzN() != null) {
                                    interfaceC1722jo5.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC2200wl.f25327OooO0oO);
                od0 od0Var3 = kd0Var3.f20503OooOOoo;
                String strOooO0O03 = od0Var3.f22973OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && ((e60) c1431bqOooO00o.f17564OooOoo0.zzb()).OooO0Oo()) {
                    strOooO0O03 = AbstractC1430bp.OooO0O0(strOooO0O03, AbstractC1430bp.OooO00o(kd0Var3));
                }
                p31 p31Var3 = c1431bqOooO00o.f17578OoooO;
                m10 m10Var2 = (m10) p31Var3.zzb();
                if (!g70Var.f19255OooO0oo) {
                    c2116ub3 = null;
                }
                m10Var2.OooO00o(interfaceC1722joOooO00o3, true, c2116ub3, f20Var3.f18768OooO0OO);
                return ii0.Ooooooo(m10.OooO0O0(interfaceC1722joOooO00o3, od0Var3.f22974OooO0O0, strOooO0O03, f20Var3.f18768OooO0OO), new C1398au(interfaceC1722joOooO00o3, kd0Var3, c1431bqOooO00o, 2), g70Var.f19253OooO0o0);
            case 7:
                JSONArray jSONArray = (JSONArray) obj;
                m70 m70Var = (m70) this.f19455OooO0O0;
                m70Var.getClass();
                if (jSONArray.length() == 0) {
                    return ii0.Ooooo00(new a40(3));
                }
                rd0 rd0Var4 = (rd0) this.f19456OooO0OO;
                vd0 vd0Var3 = (vd0) rd0Var4.f23848OooO00o.f23325OooOo0o;
                kd0 kd0Var4 = (kd0) this.f19457OooO0Oo;
                if (vd0Var3.f24960OooOO0O <= 1) {
                    return ii0.Ooooooo(m70Var.OooO0OO(rd0Var4, kd0Var4, jSONArray.getJSONObject(0)), new o0O0o00O(9), m70Var.f21123OooO0O0);
                }
                int length = jSONArray.length();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o000ooO0)).booleanValue()) {
                    m70Var.f21126OooO0o.OooO00o("nsl", String.valueOf(length));
                }
                vd0 vd0Var4 = (vd0) rd0Var4.f23848OooO00o.f23325OooOo0o;
                m70Var.f21125OooO0Oo.OooO0O0(Math.min(length, vd0Var4.f24960OooOO0O));
                int i4 = vd0Var4.f24960OooOO0O;
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 < length) {
                        arrayList.add(m70Var.OooO0OO(rd0Var4, kd0Var4, jSONArray.getJSONObject(i5)));
                    } else {
                        arrayList.add(ii0.Ooooo00(new a40(3)));
                    }
                }
                return ii0.OooooOO(arrayList);
            default:
                g70 g70Var2 = (g70) this.f19455OooO0O0;
                g70Var2.getClass();
                C2148v6 c2148v64 = AbstractC1448c7.f17846o000oo;
                boolean zBooleanValue4 = ((Boolean) zzbe.zzc().OooO00o(c2148v64)).booleanValue();
                f20 f20Var4 = g70Var2.f19256OooOO0;
                if (zBooleanValue4) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var4.f18768OooO0OO, "rendering-webview-creation-start");
                }
                rd0 rd0Var5 = (rd0) this.f19457OooO0Oo;
                C2051sk c2051sk3 = rd0Var5.f23849OooO0O0;
                vd0 vd0Var5 = g70Var2.f19251OooO0Oo;
                kd0 kd0Var5 = (kd0) this.f19456OooO0OO;
                final InterfaceC1722jo interfaceC1722joOooO00o4 = g70Var2.f19250OooO0OO.OooO00o(vd0Var5.f24956OooO0o0, kd0Var5, (md0) c2051sk3.f24096OooOo);
                interfaceC1722joOooO00o4.OooOOOO(kd0Var5.f20531OoooOOO);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v64)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var4.f18768OooO0OO, "rendering-webview-creation-end");
                }
                C2274yl c2274yl4 = new C2274yl();
                de0 de0Var4 = new de0(rd0Var5, kd0Var5, (String) null);
                VersionInfoParcel versionInfoParcel3 = g70Var2.f19252OooO0o;
                C2116ub c2116ub4 = g70Var2.f19254OooO0oO;
                h10 h10Var = new h10(new g80(g70Var2.f19249OooO0O0, g70Var2.f19250OooO0OO, vd0Var5, versionInfoParcel3, kd0Var5, c2274yl4, interfaceC1722joOooO00o4, c2116ub4, g70Var2.f19255OooO0oo, g70Var2.f19247OooO, g70Var2.f19256OooOO0, g70Var2.f19257OooOO0O), interfaceC1722joOooO00o4, 0);
                C1577fq c1577fq = (C1577fq) ((i10) g70Var2.OooOO0o);
                C1540eq c1540eq = new C1540eq(c1577fq.f18994OooO0OO, c1577fq.f18995OooO0Oo, de0Var4, h10Var);
                c2274yl4.zzc(c1540eq);
                if (((Boolean) zzbe.zzc().OooO00o(c2148v64)).booleanValue()) {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), f20Var4.f18768OooO0OO, "rendering-ad-component-creation-end");
                }
                interfaceC1722joOooO00o4.Oooo0OO("/reward", new C1709jb((C1547ex) c1540eq.f18676OoooO0O.zzb(), 4));
                final int i6 = 3;
                c1540eq.o00Ooo().o00000o0(new InterfaceC1399av() { // from class: com.google.android.gms.internal.ads.q60
                    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
                    public final void zzr() {
                        switch (i6) {
                            case 0:
                                InterfaceC1722jo interfaceC1722jo2 = interfaceC1722joOooO00o4;
                                if (interfaceC1722jo2.zzN() != null) {
                                    interfaceC1722jo2.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC1722jo interfaceC1722jo3 = interfaceC1722joOooO00o4;
                                if (interfaceC1722jo3.zzN() != null) {
                                    interfaceC1722jo3.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC1722jo interfaceC1722jo4 = interfaceC1722joOooO00o4;
                                if (interfaceC1722jo4.zzN() != null) {
                                    interfaceC1722jo4.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC1722jo interfaceC1722jo5 = interfaceC1722joOooO00o4;
                                if (interfaceC1722jo5.zzN() != null) {
                                    interfaceC1722jo5.zzN().o0OOO0o();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC2200wl.f25327OooO0oO);
                p31 p31Var4 = c1540eq.f18673OoooO;
                ((m10) p31Var4.zzb()).OooO00o(interfaceC1722joOooO00o4, true, g70Var2.f19255OooO0oo ? c2116ub4 : null, f20Var4.f18768OooO0OO);
                od0 od0Var4 = kd0Var5.f20503OooOOoo;
                String strOooO0O04 = od0Var4.f22973OooO00o;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o)).booleanValue() && ((e60) c1540eq.f18659OooOoo0.zzb()).OooO0Oo()) {
                    strOooO0O04 = AbstractC1430bp.OooO0O0(strOooO0O04, AbstractC1430bp.OooO00o(kd0Var5));
                }
                return ii0.Ooooooo(m10.OooO0O0(interfaceC1722joOooO00o4, od0Var4.f22974OooO0O0, strOooO0O04, f20Var4.f18768OooO0OO), new C1398au(interfaceC1722joOooO00o4, kd0Var5, c1540eq, 3), g70Var2.f19253OooO0o0);
        }
    }

    public /* synthetic */ C1617gt(Object obj, Object obj2, Object obj3, int i) {
        this.f19454OooO00o = i;
        this.f19455OooO0O0 = obj;
        this.f19456OooO0OO = obj2;
        this.f19457OooO0Oo = obj3;
    }
}
