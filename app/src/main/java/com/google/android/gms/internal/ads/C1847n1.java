package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n1 */
/* loaded from: classes2.dex */
public final class C1847n1 implements Oooo00O.OooO0o, InterfaceC1390am, SignalCallbacks, vp0, bf0, InterfaceC1730jw, InterfaceC1502dp, x40, InterfaceC2318zs, zzg, h90, tc0 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21380OooOo0O;

    /* renamed from: OooOo0o */
    public Object f21381OooOo0o;

    public /* synthetic */ C1847n1(int i) {
        this.f21380OooOo0O = i;
    }

    public static C1847n1 OooO0Oo(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C1847n1 c1847n1 = new C1847n1(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C1810m1(c1847n1, 0));
                return c1847n1;
            } catch (RuntimeException unused) {
                synchronized (C1847n1.class) {
                    c1847n1.f21381OooOo0o = null;
                }
            }
        }
        return c1847n1;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(OooOooo.o000Oo0 o000oo02) {
        synchronized (((C1592g4) this.f21381OooOo0o).f19219OooO0OO) {
            C1592g4 c1592g4 = (C1592g4) this.f21381OooOo0o;
            c1592g4.f19221OooO0o = null;
            if (c1592g4.f19220OooO0Oo != null) {
                c1592g4.f19220OooO0Oo = null;
            }
            c1592g4.f19219OooO0OO.notifyAll();
        }
    }

    public f81[] OooO00o(Handler handler, t41 t41Var, t41 t41Var2) {
        C2313zn c2313zn = (C2313zn) this.f21381OooOo0o;
        Context context = c2313zn.f26213OooOo0O;
        fj0 fj0Var = new fj0(context);
        af0.OooooO0(!fj0Var.f18955OooOo0O);
        fj0Var.f18955OooOo0O = true;
        if (((bi0) fj0Var.f18958OooOoO0) == null) {
            fj0Var.f18958OooOoO0 = new bi0(new InterfaceC1723jp[0]);
        }
        if (((dx0) fj0Var.f18957OooOoO) == null) {
            fj0Var.f18957OooOoO = new dx0(context);
        }
        i71 i71Var = new i71(context, new nh0(context, 4), handler, t41Var2, new h71(fj0Var));
        Context context2 = c2313zn.f26213OooOo0O;
        return new f81[]{i71Var, new pb1(context2, new nh0(context2, 4), handler, t41Var)};
    }

    public o00000oO.OooOOO OooO0O0(C1548ey c1548ey, sc0 sc0Var, InterfaceC1691iu interfaceC1691iu) {
        C2204wp c2204wpOooo0oO = sc0Var.Oooo0oO((rc0) c1548ey.f18706OooOo);
        uc0 uc0Var = new uc0();
        switch (c2204wpOooo0oO.f25352OooO00o) {
            case 0:
                c2204wpOooo0oO.f25354OooO0OO = uc0Var;
                break;
            default:
                c2204wpOooo0oO.f25354OooO0OO = uc0Var;
                break;
        }
        InterfaceC1691iu interfaceC1691iu2 = (InterfaceC1691iu) c2204wpOooo0oO.OooO0OO();
        this.f21381OooOo0o = interfaceC1691iu2;
        C1875nt c1875ntZzb = interfaceC1691iu2.zzb();
        oe0 oe0Var = new oe0();
        tp0 tp0VarOooOOo = tp0.OooOOo(c1875ntZzb.OooO0O0());
        C1786le c1786le = new C1786le(11, oe0Var, c1875ntZzb);
        qp0 qp0Var = qp0.f23673OooOo0O;
        return ii0.Ooooooo(ii0.ooOO(tp0VarOooOOo, c1786le, qp0Var), new C2123ui(oe0Var, 7), qp0Var);
    }

    public void OooO0OO(oOOO00o0 oooo00o0, OoooOOO.o0O0oo00 o0o0oo00, wp0 wp0Var) {
        oooo00o0.zzq();
        oooo00o0.zzm("post-response");
        ((oOO0Oo00) this.f21381OooOo0o).f22818OooOo0o.post(new o000oOoO(oooo00o0, o0o0oo00, wp0Var, 1));
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void OooO0o0(AbstractC1397at abstractC1397at) {
        switch (this.f21380OooOo0O) {
            case 25:
                synchronized (((de0) this.f21381OooOo0o)) {
                    ((de0) this.f21381OooOo0o).f18243OooOoO0 = abstractC1397at.f17103OooO0o;
                    abstractC1397at.OooO00o();
                }
                return;
            default:
                f10 f10Var = (f10) abstractC1397at;
                synchronized (((hd0) this.f21381OooOo0o)) {
                    try {
                        ((hd0) this.f21381OooOo0o).f19712OooOooO = f10Var;
                        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17903o00OOOOo)).booleanValue()) {
                            f10Var.f18754OooOOoo.f24300OooO00o = ((hd0) this.f21381OooOo0o).f19708OooOoO0;
                        }
                        ((hd0) this.f21381OooOo0o).f19712OooOooO.OooO00o();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* bridge */ /* synthetic */ o00000oO.OooOOO OooO0oo(C1548ey c1548ey, sc0 sc0Var) {
        return OooO0O0(c1548ey, sc0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.x40
    public o00000oO.OooOOO Oooo000(C2197wi c2197wi) {
        return ((d50) ((n31) ((de0) this.f21381OooOo0o).f18243OooOoO0).zzb()).o000O0oo(c2197wi.zzh);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(AdError adError) {
        try {
            ((InterfaceC1604gg) this.f21381OooOo0o).OooOo(adError.zza());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onSuccess(String str) {
        try {
            ((InterfaceC1604gg) this.f21381OooOo0o).zze(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        ((C1950pu) ((C1431bq) this.f21381OooOo0o).f17571Oooo00o.zzb()).onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        C1431bq c1431bq = (C1431bq) this.f21381OooOo0o;
        c1431bq.o00Ooo().zza();
        ((C1438bx) c1431bq.f17572Oooo0O0.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* synthetic */ Object zzd() {
        return (InterfaceC1691iu) this.f21381OooOo0o;
    }

    public C1847n1(Handler handler) {
        this.f21380OooOo0O = 2;
        this.f21381OooOo0o = new oOO0Oo00(0, handler);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2318zs, com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public zzeb mo13704zza() throws yd0 {
        try {
            return ((InterfaceC1530eg) ((l60) this.f21381OooOo0o).f20809OooO0O0).zze();
        } catch (RemoteException e) {
            throw new yd0(e);
        }
    }

    public /* synthetic */ C1847n1(Object obj, int i) {
        this.f21380OooOo0O = i;
        this.f21381OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(String str) {
        try {
            ((InterfaceC1604gg) this.f21381OooOo0o).zzf(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public C1847n1(Context context, Executor executor) {
        this.f21380OooOo0O = 3;
        nq0 nq0Var = new nq0(new CallableC1736k1(context, 0));
        executor.execute(nq0Var);
        this.f21381OooOo0o = nq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.google.android.gms.internal.ads.ok] */
    @Override // com.google.android.gms.internal.ads.bf0
    public Object zza(Object obj) {
        switch (this.f21380OooOo0O) {
            case 13:
                rd0 rd0Var = (rd0) obj;
                C1872nq c1872nq = ((C1875nt) this.f21381OooOo0o).f21589OooO0Oo;
                ArrayList arrayList = (ArrayList) rd0Var.f23849OooO0O0.f24100OooOoO0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    qd0 qd0Var = (qd0) obj2;
                    String str = qd0Var.f23578OooO00o;
                    Map map = c1872nq.f21565OooO00o;
                    boolean zContainsKey = map.containsKey(str);
                    String str2 = qd0Var.f23578OooO00o;
                    JSONObject jSONObject = qd0Var.f23579OooO0O0;
                    if (zContainsKey && jSONObject != null) {
                        C2168vq c2168vq = (C2168vq) map.get(str2);
                        switch (c2168vq.f25109OooO00o) {
                            case 0:
                                if (jSONObject != null) {
                                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOo)).booleanValue()) {
                                        p30 p30Var = (p30) c2168vq.f25110OooO0O0;
                                        synchronized (p30Var) {
                                            p30Var.f23203OooOOOo = jSONObject;
                                        }
                                        break;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            default:
                                ((C1904ok) ((C2249xx) c2168vq.f25110OooO0O0).f25813OooOo).OooO00o(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                                break;
                        }
                    } else {
                        Map map2 = c1872nq.f21566OooO0O0;
                        if (map2.containsKey(str2) && jSONObject != null) {
                            InterfaceC1946pq interfaceC1946pq = (InterfaceC1946pq) map2.get(str2);
                            HashMap map3 = new HashMap();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String strOptString = jSONObject.optString(next);
                                if (strOptString != null) {
                                    map3.put(next, strOptString);
                                }
                            }
                            interfaceC1946pq.OooO00o(map3);
                        }
                    }
                }
                return rd0Var;
            default:
                if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
                    ((jf0) this.f21381OooOo0o).zzi();
                }
                return obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        switch (this.f21380OooOo0O) {
            case 9:
                C1718jk.OooOO0o.remove((o00000oO.OooOOO) this.f21381OooOo0o);
                return;
            case 10:
                ((AtomicInteger) ((Oooo0o.OooO) this.f21381OooOo0o).f13857OooO0O0).set(1);
                return;
            case 17:
                try {
                    InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) ((List) obj).get(0);
                    if (interfaceC1722jo != null) {
                        C1918oz c1918oz = (C1918oz) this.f21381OooOo0o;
                        c1918oz.getClass();
                        c1918oz.f23160OooOo.execute(new RunnableC1911os(interfaceC1722jo, 3));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0O0)).booleanValue()) {
                        zzv.zzp().OooO0oo("omid native display exp", e);
                        return;
                    }
                    return;
                }
            case 20:
                rd0 rd0Var = (rd0) obj;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue()) {
                    m50 m50Var = ((j40) this.f21381OooOo0o).f20180OooO0o0;
                    int i = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21208OooO0o;
                    synchronized (m50Var.f21086OooO0oO) {
                        m50Var.f21081OooO0O0 = i;
                    }
                    m50 m50Var2 = ((j40) this.f21381OooOo0o).f20180OooO0o0;
                    long j = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21210OooO0oO;
                    synchronized (m50Var2.f21087OooO0oo) {
                        m50Var2.f21082OooO0OO = j;
                    }
                    return;
                }
                return;
            default:
                try {
                    ((bf0) this.f21381OooOo0o).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e2) {
                    zzo.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390am, com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        switch (this.f21380OooOo0O) {
            case 6:
                ((C2155vd) this.f21381OooOo0o).f24948OooO0Oo.OooOOOO();
                return;
            case 7:
                ((C2274yl) this.f21381OooOo0o).zzd(new C1382ae("Cannot get Javascript Engine"));
                return;
            case 18:
                ((C1776l4) this.f21381OooOo0o).OooO0O0();
                return;
            case 25:
                synchronized (((de0) this.f21381OooOo0o)) {
                }
                return;
            default:
                synchronized (((hd0) this.f21381OooOo0o)) {
                    ((hd0) this.f21381OooOo0o).f19712OooOooO = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f21380OooOo0O) {
            case 14:
                ((InterfaceC1729jv) obj).Oooo0oO((AbstractC1397at) this.f21381OooOo0o);
                break;
            default:
                ((InterfaceC1584fx) obj).zze((zzbk) this.f21381OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) throws NumberFormatException {
        switch (this.f21380OooOo0O) {
            case 9:
                C1718jk.OooOO0o.remove((o00000oO.OooOOO) this.f21381OooOo0o);
                return;
            case 10:
                ((AtomicInteger) ((Oooo0o.OooO) this.f21381OooOo0o).f13857OooO0O0).set(-1);
                return;
            case 17:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0O0)).booleanValue()) {
                    zzv.zzp().OooO0oo("omid native display exp", th);
                    return;
                }
                return;
            case 20:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue()) {
                    Matcher matcher = j40.f20174OooO0oo.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        m50 m50Var = ((j40) this.f21381OooOo0o).f20180OooO0o0;
                        int i = Integer.parseInt(strGroup);
                        synchronized (m50Var.f21086OooO0oO) {
                            m50Var.f21081OooO0O0 = i;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                zzo.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                return;
        }
    }
}
