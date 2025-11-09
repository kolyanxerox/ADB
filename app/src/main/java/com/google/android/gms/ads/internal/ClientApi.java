package com.google.android.gms.ads.internal;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.AbstractC1641hg;
import com.google.android.gms.internal.ads.BinderC1761kq;
import com.google.android.gms.internal.ads.C1394aq;
import com.google.android.gms.internal.ads.C1504dr;
import com.google.android.gms.internal.ads.C1982qp;
import com.google.android.gms.internal.ads.C2130up;
import com.google.android.gms.internal.ads.C2249xx;
import com.google.android.gms.internal.ads.InterfaceC1499dl;
import com.google.android.gms.internal.ads.InterfaceC1563fc;
import com.google.android.gms.internal.ads.InterfaceC1570fj;
import com.google.android.gms.internal.ads.InterfaceC1605gh;
import com.google.android.gms.internal.ads.InterfaceC1674ic;
import com.google.android.gms.internal.ads.InterfaceC1863nh;
import com.google.android.gms.internal.ads.InterfaceC1892o9;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2114u9;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1403az;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2287yy;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.b90;
import com.google.android.gms.internal.ads.c90;
import com.google.android.gms.internal.ads.f90;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.ic0;
import com.google.android.gms.internal.ads.id0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.jc0;
import com.google.android.gms.internal.ads.ng0;
import com.google.android.gms.internal.ads.o20;
import com.google.android.gms.internal.ads.p31;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.r31;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.x30;
import com.google.android.gms.internal.ads.x50;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.ads.z80;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ClientApi extends zzco {
    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(OooO0O0 oooO0O0, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        return new z80(C2130up.OooOoO(context, interfaceC2156ve, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(OooO0O0 oooO0O0, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        str.getClass();
        context.getClass();
        r31 r31VarOooO00o = r31.OooO00o(context);
        r31 r31VarOooO00o2 = r31.OooO00o(str);
        C2130up c2130up = c2130upOooOoO.f24676OooO0O0;
        p31 p31Var = c2130up.f24736o000000o;
        y60 y60Var = new y60(r31VarOooO00o, p31Var, c2130up.f24733o00000, 4);
        p31 p31VarOooO0O0 = p31.OooO0O0(new o20(p31Var, 17));
        p31 p31Var2 = c2130up.f24677OooO0OO;
        r31 r31Var = c2130up.f24698OooOoOO;
        C1982qp c1982qp = c2130up.f24683OooOO0;
        return (ic0) p31.OooO0O0(new b20(r31Var, r31VarOooO00o, r31VarOooO00o2, p31.OooO0O0(new C1504dr(r31VarOooO00o, p31Var2, r31Var, y60Var, p31VarOooO0O0, c1982qp)), p31VarOooO0O0, c1982qp, c2130up.f24692OooOo)).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(OooO0O0 oooO0O0, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        context.getClass();
        zzsVar.getClass();
        str.getClass();
        r31 r31VarOooO00o = r31.OooO00o(context);
        r31 r31VarOooO00o2 = r31.OooO00o(zzsVar);
        C2130up c2130up = c2130upOooOoO.f24676OooO0O0;
        p31 p31VarOooO0O0 = p31.OooO0O0(new o20(c2130up.f24692OooOo, 11));
        jc0 jc0Var = (jc0) p31.OooO0O0(new b20(r31VarOooO00o, c2130up.f24677OooO0OO, r31VarOooO00o2, c2130up.f24698OooOoOO, p31VarOooO0O0, p31.OooO0O0(AbstractC1641hg.f19764OoooOOo), p31.OooO0O0(AbstractC1641hg.f19754Oooo0o))).zzb();
        c90 c90Var = (c90) p31VarOooO0O0.zzb();
        VersionInfoParcel versionInfoParcel = c2130up.f24675OooO00o.f20079OooO00o;
        ii0.Oooo000(versionInfoParcel);
        return new b90(context, zzsVar, str, jc0Var, c90Var, versionInfoParcel, (h20) c2130up.f24692OooOo.zzb());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(OooO0O0 oooO0O0, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        context.getClass();
        zzsVar.getClass();
        str.getClass();
        return (f90) ((p31) new p80(c2130upOooOoO.f24676OooO0O0, context, str, zzsVar).f23242OooOo0o).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(OooO0O0 oooO0O0, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, int i) {
        return new zzu((Context) OooO0OO.o000O0oO(oooO0O0), zzsVar, str, new VersionInfoParcel(244410000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) {
        return (ng0) C2130up.OooOoO((Context) OooO0OO.o000O0oO(oooO0O0), interfaceC2156ve, i).f24696OooOoO.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(OooO0O0 oooO0O0, int i) {
        return (BinderC1761kq) C2130up.OooOoO((Context) OooO0OO.o000O0oO(oooO0O0), null, i).f24697OooOoO0.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) {
        return (x30) C2130up.OooOoO((Context) OooO0OO.o000O0oO(oooO0O0), interfaceC2156ve, i).f24693OooOo00.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1892o9 zzj(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        return new ViewTreeObserverOnGlobalLayoutListenerC1403az((FrameLayout) OooO0OO.o000O0oO(oooO0O0), (FrameLayout) OooO0OO.o000O0oO(oooO0O02));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC2114u9 zzk(OooO0O0 oooO0O0, OooO0O0 oooO0O02, OooO0O0 oooO0O03) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2287yy((View) OooO0OO.o000O0oO(oooO0O0), (HashMap) OooO0OO.o000O0oO(oooO0O02), (HashMap) OooO0OO.o000O0oO(oooO0O03));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1674ic zzl(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i, InterfaceC1563fc interfaceC1563fc) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        context.getClass();
        interfaceC1563fc.getClass();
        return (t20) new C1394aq(c2130upOooOoO.f24676OooO0O0, context, interfaceC1563fc).f17084OooO0o0.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1605gh zzm(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) {
        return (x50) C2130up.OooOoO((Context) OooO0OO.o000O0oO(oooO0O0), interfaceC2156ve, i).f24707Oooo00o.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1863nh zzn(OooO0O0 oooO0O0) {
        Activity activity = (Activity) OooO0OO.o000O0oO(oooO0O0);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzw(activity) : new zzaf(activity) : new zzab(activity, adOverlayInfoParcelZza) : new zzai(activity) : new zzah(activity) : new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1570fj zzo(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        context.getClass();
        return (id0) ((p31) new C2249xx(c2130upOooOoO.f24676OooO0O0, context, (String) null).f25815OooOo0o).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC2050sj zzp(OooO0O0 oooO0O0, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Context context = (Context) OooO0OO.o000O0oO(oooO0O0);
        C2130up c2130upOooOoO = C2130up.OooOoO(context, interfaceC2156ve, i);
        context.getClass();
        return (hd0) ((p31) new C2249xx(c2130upOooOoO.f24676OooO0O0, context, str).f25813OooOo).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1499dl zzq(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) {
        return (zzau) C2130up.OooOoO((Context) OooO0OO.o000O0oO(oooO0O0), interfaceC2156ve, i).f24709Oooo0OO.zzb();
    }
}
