package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w60 implements p60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25236OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f25237OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f25238OooO0OO;

    public /* synthetic */ w60(Context context, int i, Object obj) {
        this.f25236OooO00o = i;
        this.f25237OooO0O0 = context;
        this.f25238OooO0OO = obj;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final Object OooO00o(rd0 rd0Var, kd0 kd0Var, l60 l60Var) {
        switch (this.f25236OooO00o) {
            case 0:
                C1386ai c1386ai = new C1386ai(kd0Var, (InterfaceC1530eg) l60Var.f20809OooO0O0, AdFormat.APP_OPEN_AD);
                de0 de0Var = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                C2249xx c2249xx = new C2249xx(29, c1386ai, (Object) null);
                Oooo0oO.o0000Ooo o0000ooo = new Oooo0oO.o0000Ooo(kd0Var.f20535OoooOoo, 2);
                C2241xp c2241xp = (C2241xp) ((AbstractC2243xr) this.f25238OooO0OO);
                C2167vp c2167vp = new C2167vp(c2241xp.f25672OooO0OO, c2241xp.f25673OooO0Oo, de0Var, c2249xx, o0000ooo);
                c1386ai.f17045OooOoO = c2167vp.o00o0O();
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new k80((C1950pu) c2167vp.f25096Oooo0.zzb(), (C2322zw) c2167vp.f25101Oooo0OO.zzb(), (C2320zu) c2167vp.f25094OooOooo.zzb(), (C1508dv) c2167vp.f25099Oooo00o.zzb(), (C1619gv) c2167vp.f25103Oooo0o0.zzb(), (C1473cw) c2167vp.f25077OooOOO.f25762o0000oo0.zzb(), (C1877nv) c2167vp.f25102Oooo0o.zzb(), (C1694ix) c2167vp.f25104Oooo0oO.zzb(), (C1400aw) c2167vp.f25105Oooo0oo.zzb(), (C2246xu) c2167vp.f25107OoooO00.zzb()));
                return c2167vp.o00Ooo();
            case 1:
                C1386ai c1386ai2 = new C1386ai(kd0Var, (InterfaceC1530eg) l60Var.f20809OooO0O0, AdFormat.INTERSTITIAL);
                C1431bq c1431bqOooO00o = ((AbstractC1990qx) this.f25238OooO0OO).OooO00o(new de0(rd0Var, kd0Var, l60Var.f20808OooO00o), new C2249xx(29, c1386ai2, (Object) null));
                c1386ai2.f17045OooOoO = c1431bqOooO00o.o00Ooo();
                e70 e70Var = (e70) l60Var.f20810OooO0OO;
                c1431bqOooO00o.getClass();
                e70Var.o000O0o0(new k80((C1950pu) c1431bqOooO00o.f17571Oooo00o.zzb(), (C2322zw) c1431bqOooO00o.f17573Oooo0OO.zzb(), (C2320zu) c1431bqOooO00o.f17565OooOooO.zzb(), (C1508dv) c1431bqOooO00o.f17570Oooo00O.zzb(), (C1619gv) c1431bqOooO00o.f17575Oooo0o0.zzb(), (C1473cw) c1431bqOooO00o.f17550OooOOO0.f18362o0000o0.zzb(), (C1877nv) c1431bqOooO00o.f17576Oooo0oO.zzb(), (C1694ix) c1431bqOooO00o.f17577Oooo0oo.zzb(), (C1400aw) c1431bqOooO00o.f17567Oooo.zzb(), (C2246xu) c1431bqOooO00o.f17579OoooO0.zzb()));
                return c1431bqOooO00o.o00o0O();
            default:
                C1386ai c1386ai3 = new C1386ai(kd0Var, (InterfaceC1530eg) l60Var.f20809OooO0O0, AdFormat.REWARDED);
                de0 de0Var2 = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                h10 h10Var = new h10(c1386ai3, null, 0);
                C1577fq c1577fq = (C1577fq) ((i10) this.f25238OooO0OO);
                C1577fq c1577fq2 = c1577fq.f18995OooO0Oo;
                C1540eq c1540eq = new C1540eq(c1577fq.f18994OooO0OO, c1577fq2, de0Var2, h10Var);
                c1386ai3.f17045OooOoO = c1540eq.o00Ooo();
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new j80((C1950pu) c1540eq.f18666Oooo00o.zzb(), (C2322zw) c1540eq.f18667Oooo0O0.zzb(), (C2320zu) c1540eq.f18660OooOooO.zzb(), (C1508dv) c1540eq.f18665Oooo00O.zzb(), (C1619gv) c1540eq.f18668Oooo0OO.zzb(), (C2246xu) c1540eq.f18675OoooO00.zzb(), (C1473cw) c1577fq2.f19050o000.zzb(), (C1694ix) c1540eq.f18671Oooo0oO.zzb(), (C1877nv) c1540eq.f18669Oooo0o.zzb(), (C1547ex) c1540eq.f18676OoooO0O.zzb(), (C1400aw) c1540eq.f18672Oooo0oo.zzb()));
                return c1540eq.o00ooo();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void OooO0O0(rd0 rd0Var, kd0 kd0Var, l60 l60Var) throws yd0 {
        switch (this.f25236OooO00o) {
            case 0:
                Object obj = l60Var.f20809OooO0O0;
                try {
                    ((InterfaceC1530eg) obj).oo0o0Oo(kd0Var.f20534OoooOoO);
                    ((InterfaceC1530eg) obj).o0000oOo(kd0Var.f20530OoooOO0, kd0Var.f20506OooOo0O.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(this.f25237OooO0O0), new v60(l60Var), (InterfaceC1383af) l60Var.f20810OooO0OO);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Remote exception loading an app open RTB ad", e);
                    throw new yd0(e);
                }
            case 1:
                Object obj2 = l60Var.f20809OooO0O0;
                try {
                    ((InterfaceC1530eg) obj2).oo0o0Oo(kd0Var.f20534OoooOoO);
                    ((InterfaceC1530eg) obj2).OoooO00(kd0Var.f20530OoooOO0, kd0Var.f20506OooOo0O.toString(), ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo, new Oooo0o.OooO0OO(this.f25237OooO0O0), new j70(l60Var), (InterfaceC1383af) l60Var.f20810OooO0OO);
                    return;
                } catch (RemoteException e2) {
                    zze.zzb("Remote exception loading a interstitial RTB ad", e2);
                    throw new yd0(e2);
                }
            default:
                Object obj3 = l60Var.f20809OooO0O0;
                try {
                    ((InterfaceC1530eg) obj3).oo0o0Oo(kd0Var.f20534OoooOoO);
                    pd0 pd0Var = rd0Var.f23848OooO00o;
                    int i = ((vd0) pd0Var.f23325OooOo0o).f24963OooOOOO.f13884OooOo0o;
                    IInterface iInterface = l60Var.f20810OooO0OO;
                    Context context = this.f25237OooO0O0;
                    JSONObject jSONObject = kd0Var.f20506OooOo0O;
                    vd0 vd0Var = (vd0) pd0Var.f23325OooOo0o;
                    if (i == 3) {
                        ((InterfaceC1530eg) obj3).o00o0O(kd0Var.f20530OoooOO0, jSONObject.toString(), vd0Var.f24954OooO0Oo, new Oooo0o.OooO0OO(context), new d80(l60Var), (InterfaceC1383af) iInterface);
                    } else {
                        ((InterfaceC1530eg) obj3).o00oO0o(kd0Var.f20530OoooOO0, jSONObject.toString(), vd0Var.f24954OooO0Oo, new Oooo0o.OooO0OO(context), new d80(l60Var), (InterfaceC1383af) iInterface);
                    }
                    return;
                } catch (RemoteException e3) {
                    zze.zzb("Remote exception loading a rewarded RTB ad", e3);
                    return;
                }
        }
    }
}
