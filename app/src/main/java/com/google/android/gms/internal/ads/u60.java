package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzc;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class u60 implements p60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24566OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f24567OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f24568OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f24569OooO0Oo;

    public /* synthetic */ u60(Context context, Object obj, Executor executor, int i) {
        this.f24566OooO00o = i;
        this.f24567OooO0O0 = context;
        this.f24568OooO0OO = obj;
        this.f24569OooO0Oo = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object OooO0OO(com.google.android.gms.internal.ads.rd0 r63, com.google.android.gms.internal.ads.kd0 r64, com.google.android.gms.internal.ads.l60 r65) throws com.google.android.gms.internal.ads.z70 {
        /*
            Method dump skipped, instructions count: 3029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u60.OooO0OO(com.google.android.gms.internal.ads.rd0, com.google.android.gms.internal.ads.kd0, com.google.android.gms.internal.ads.l60):java.lang.Object");
    }

    public static final boolean OooO0Oo(rd0 rd0Var, int i) {
        return ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24957OooO0oO.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final Object OooO00o(rd0 rd0Var, kd0 kd0Var, l60 l60Var) throws yd0 {
        yd0 yd0Var;
        View view;
        switch (this.f24566OooO00o) {
            case 0:
                de0 de0Var = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                C2249xx c2249xx = new C2249xx(29, new p80(l60Var, 20), (Object) null);
                Oooo0oO.o0000Ooo o0000ooo = new Oooo0oO.o0000Ooo(kd0Var.f20535OoooOoo, 2);
                C2241xp c2241xp = (C2241xp) ((AbstractC2243xr) this.f24568OooO0OO);
                C2167vp c2167vp = new C2167vp(c2241xp.f25672OooO0OO, c2241xp.f25673OooO0Oo, de0Var, c2249xx, o0000ooo);
                ((C1472cv) c2167vp.f25083OooOOoo.zzb()).o00000o0(new C2316zq((ee0) l60Var.f20809OooO0O0, 0), (cq0) this.f24569OooO0Oo);
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new m80((C1950pu) c2167vp.f25096Oooo0.zzb(), (C2322zw) c2167vp.f25101Oooo0OO.zzb(), (C2320zu) c2167vp.f25094OooOooo.zzb(), (C1508dv) c2167vp.f25099Oooo00o.zzb(), (C1619gv) c2167vp.f25103Oooo0o0.zzb(), (C1473cw) c2167vp.f25077OooOOO.f25762o0000oo0.zzb(), (C1877nv) c2167vp.f25102Oooo0o.zzb(), (C1694ix) c2167vp.f25104Oooo0oO.zzb(), (C1400aw) c2167vp.f25105Oooo0oo.zzb(), (C2246xu) c2167vp.f25107OoooO00.zzb()));
                return c2167vp.o00Ooo();
            case 1:
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue();
                Object obj = l60Var.f20809OooO0O0;
                if (zBooleanValue && kd0Var.f20542Oooooo0) {
                    try {
                        InterfaceC1456cf interfaceC1456cfZzj = ((ee0) obj).f18580OooO00o.zzj();
                        if (interfaceC1456cfZzj == null) {
                            zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new yd0(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            view = (View) Oooo0o.OooO0OO.o000O0oO(interfaceC1456cfZzj.zze());
                            boolean zZzf = interfaceC1456cfZzj.zzf();
                            if (view == null) {
                                throw new yd0(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (zZzf) {
                                try {
                                    view = (View) ii0.ooOO(yp0.f25991OooOo0o, new C1617gt(this, view, kd0Var, 4), AbstractC2200wl.f25325OooO0o).get();
                                } catch (InterruptedException | ExecutionException e) {
                                    throw new yd0(e);
                                }
                            }
                        } catch (RemoteException e2) {
                            throw new yd0(e2);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) Oooo0o.OooO0OO.o000O0oO(((ee0) obj).f18580OooO00o.zzn());
                    } finally {
                    }
                }
                de0 de0Var2 = new de0(rd0Var, kd0Var, l60Var.f20808OooO00o);
                ee0 ee0Var = (ee0) obj;
                C1386ai c1386ai = new C1386ai(view, (InterfaceC1722jo) null, new wj0(ee0Var, 25), (ld0) kd0Var.OooOo0.get(0));
                C2315zp c2315zp = (C2315zp) ((AbstractC1837ms) this.f24568OooO0OO);
                C2278yp c2278yp = new C2278yp(c2315zp.f26241OooO0Oo, c2315zp.f26243OooO0o0, de0Var2, c1386ai);
                ((C2285yw) c2278yp.f25987OoooO0.zzb()).o00000oo(view);
                ((C1472cv) c2278yp.f25964OooOOoo.zzb()).o00000o0(new C2316zq(ee0Var, 0), this.f24569OooO0Oo);
                ((e70) l60Var.f20810OooO0OO).o000O0o0(new m80((C1950pu) c2278yp.f25974OooOooO.zzb(), (C2322zw) c2278yp.f25981Oooo0O0.zzb(), (C2320zu) c2278yp.f25979Oooo00O.zzb(), (C1508dv) c2278yp.f25973OooOoo0.zzb(), c2278yp.o00o0O(), (C1473cw) c2278yp.f25959OooOOO0.f26326o0000oO0.zzb(), (C1877nv) c2278yp.f25983Oooo0o.zzb(), (C1694ix) c2278yp.f25985Oooo0oO.zzb(), (C1400aw) c2278yp.f25986Oooo0oo.zzb(), (C2246xu) c2278yp.f25976Oooo.zzb()));
                return c2278yp.o00Ooo();
            default:
                return OooO0OO(rd0Var, kd0Var, l60Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void OooO0O0(rd0 rd0Var, kd0 kd0Var, l60 l60Var) throws JSONException, IOException {
        yd0 yd0Var;
        zzs zzsVar;
        switch (this.f24566OooO00o) {
            case 0:
                ee0 ee0Var = (ee0) l60Var.f20809OooO0O0;
                vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                String string = kd0Var.f20506OooOo0O.toString();
                Context context = this.f24567OooO0O0;
                try {
                    ee0Var.f18580OooO00o.o00000oo(new Oooo0o.OooO0OO(context), vd0Var.f24954OooO0Oo, string, (InterfaceC1383af) l60Var.f20810OooO0OO);
                    return;
                } finally {
                }
            case 1:
                zzs zzsVar2 = ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24956OooO0o0;
                boolean z = zzsVar2.zzn;
                boolean z2 = kd0Var.f20542Oooooo0;
                Context context2 = this.f24567OooO0O0;
                if (z) {
                    zzsVar = new zzs(context2, zzc.zzd(zzsVar2.zze, zzsVar2.zzb));
                } else {
                    zzsVar = (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue() && z2) ? new zzs(context2, zzc.zze(zzsVar2.zze, zzsVar2.zzb)) : ze0.OooO0o(context2, kd0Var.OooOo0);
                }
                zzs zzsVar3 = zzsVar;
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.oooOO0)).booleanValue();
                pd0 pd0Var = rd0Var.f23848OooO00o;
                od0 od0Var = kd0Var.f20503OooOOoo;
                JSONObject jSONObject = kd0Var.f20506OooOo0O;
                IInterface iInterface = l60Var.f20810OooO0OO;
                Object obj = l60Var.f20809OooO0O0;
                vd0 vd0Var2 = (vd0) pd0Var.f23325OooOo0o;
                if (zBooleanValue && z2) {
                    ee0 ee0Var2 = (ee0) obj;
                    try {
                        ee0Var2.f18580OooO00o.o0000OoO(new Oooo0o.OooO0OO(context2), zzsVar3, vd0Var2.f24954OooO0Oo, jSONObject.toString(), zzbs.zzm(od0Var), (InterfaceC1383af) iInterface);
                        return;
                    } finally {
                    }
                }
                ee0 ee0Var3 = (ee0) obj;
                try {
                    ee0Var3.f18580OooO00o.o000O00O(new Oooo0o.OooO0OO(context2), zzsVar3, vd0Var2.f24954OooO0Oo, jSONObject.toString(), zzbs.zzm(od0Var), (InterfaceC1383af) iInterface);
                    return;
                } finally {
                }
            default:
                ee0 ee0Var4 = (ee0) l60Var.f20809OooO0O0;
                vd0 vd0Var3 = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                String string2 = kd0Var.f20506OooOo0O.toString();
                String strZzm = zzbs.zzm(kd0Var.f20503OooOOoo);
                InterfaceC1383af interfaceC1383af = (InterfaceC1383af) l60Var.f20810OooO0OO;
                vd0 vd0Var4 = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
                Context context3 = this.f24567OooO0O0;
                try {
                    ee0Var4.f18580OooO00o.o000Oo0(new Oooo0o.OooO0OO(context3), vd0Var3.f24954OooO0Oo, string2, strZzm, interfaceC1383af, vd0Var4.f24950OooO, vd0Var4.f24957OooO0oO);
                    return;
                } finally {
                }
        }
    }
}
