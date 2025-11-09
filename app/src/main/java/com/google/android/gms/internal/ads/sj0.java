package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class sj0 implements o0Oo0oo, Oooo00O.OooO0o, InterfaceC1427bm, InterfaceC1390am, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback, RewardItem, vp0, InterfaceC1730jw, x40, InterfaceC2318zs, InterfaceC2064sx, h90, sc0, tc0 {

    /* renamed from: OooOo */
    public static sj0 f24091OooOo;

    /* renamed from: OooOoO0 */
    public static final qv0 f24092OooOoO0 = new qv0(11);

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f24093OooOo0O;

    /* renamed from: OooOo0o */
    public Object f24094OooOo0o;

    public /* synthetic */ sj0(int i, boolean z) {
        this.f24093OooOo0O = i;
    }

    public static final sj0 OooO00o(Context context) {
        sj0 sj0Var;
        synchronized (sj0.class) {
            try {
                if (f24091OooOo == null) {
                    f24091OooOo = new sj0(context);
                }
                sj0Var = f24091OooOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sj0Var;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(OooOooo.o000Oo0 o000oo02) {
        ((C2274yl) this.f24094OooOo0o).zzd(new RuntimeException("Connection failed."));
    }

    public AtomicReference OooO0O0(String str) {
        synchronized (this) {
            try {
                if (!((HashMap) this.f24094OooOo0o).containsKey(str)) {
                    ((HashMap) this.f24094OooOo0o).put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f24094OooOo0o).get(str);
    }

    public void OooO0OO(long j, r40 r40Var) {
        switch (this.f24093OooOo0O) {
            case 3:
                af0.OooOOO(j, r40Var, ((o0O0oo00) this.f24094OooOo0o).f22012Oooo00o);
                break;
            default:
                af0.OooOOO(j, r40Var, (o000O[]) ((de0) this.f24094OooOo0o).f18240OooOo);
                break;
        }
    }

    public void OooO0Oo(AdFormat adFormat, long j, Optional optional, Optional optional2) {
        C1548ey c1548eyOooO00o = ((h20) this.f24094OooOo0o).OooO00o();
        c1548eyOooO00o.OooO0oO("plaac_ts", Long.toString(j));
        c1548eyOooO00o.OooO0oO("ad_format", adFormat.name());
        c1548eyOooO00o.OooO0oO("action", "is_ad_available");
        optional.ifPresent(new og0(c1548eyOooO00o, 0));
        optional2.ifPresent(new og0(c1548eyOooO00o, 1));
        c1548eyOooO00o.OooOOO0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) throws C2027rx {
        yd0 yd0Var;
        Object obj = ((l60) this.f24094OooOo0o).f20809OooO0O0;
        try {
            ((ee0) obj).OooO0O0(z);
            try {
                ((ee0) obj).f18580OooO00o.zzL();
            } finally {
            }
        } catch (yd0 e) {
            zzo.zzk("Cannot show rewarded video.", e);
            throw new C2027rx(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void OooO0o0(AbstractC1397at abstractC1397at) {
        AbstractC1433bs abstractC1433bs = (AbstractC1433bs) abstractC1397at;
        synchronized (((b90) this.f24094OooOo0o)) {
            AbstractC1433bs abstractC1433bs2 = ((b90) this.f24094OooOo0o).f17461OooOooO;
            if (abstractC1433bs2 != null) {
                C1472cv c1472cv = abstractC1433bs2.f17101OooO0OO;
                c1472cv.getClass();
                c1472cv.o0000Ooo(new C2150v8(null));
            }
            ((b90) this.f24094OooOo0o).f17461OooOooO = abstractC1433bs;
            abstractC1433bs.OooO00o();
        }
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public /* bridge */ /* synthetic */ o00000oO.OooOOO OooO0oo(C1548ey c1548ey, sc0 sc0Var) {
        return OooOOO0(c1548ey, sc0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.o0Oo0oo
    public long OooOO0(long j) {
        o0000O0 o0000o02 = (o0000O0) this.f24094OooOo0o;
        return Math.max(0L, Math.min((j * o0000o02.f21663OooO0o0) / 1000000, o0000o02.f21666OooOO0 - 1));
    }

    public void OooOOO(boolean z) {
        synchronized (sj0.class) {
            try {
                ((C1548ey) this.f24094OooOo0o).OooOO0O(Boolean.valueOf(z), "paidv2_publisher_option");
                if (!z) {
                    ((C1548ey) this.f24094OooOo0o).OooOO0o("paidv2_creation_time");
                    ((C1548ey) this.f24094OooOo0o).OooOO0o("paidv2_id");
                    ((C1548ey) this.f24094OooOo0o).OooOO0o("vendor_scoped_gpid_v2_id");
                    ((C1548ey) this.f24094OooOo0o).OooOO0o("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized o00000oO.OooOOO OooOOO0(C1548ey c1548ey, sc0 sc0Var, InterfaceC1691iu interfaceC1691iu) {
        C1875nt c1875ntZzb;
        try {
            if (interfaceC1691iu != null) {
                this.f24094OooOo0o = interfaceC1691iu;
            } else {
                this.f24094OooOo0o = (InterfaceC1691iu) sc0Var.Oooo0oO((rc0) c1548ey.f18706OooOo).OooO0OO();
            }
            c1875ntZzb = ((InterfaceC1691iu) this.f24094OooOo0o).zzb();
        } catch (Throwable th) {
            throw th;
        }
        return c1875ntZzb.OooO00o(c1875ntZzb.OooO0O0());
    }

    public void OooOOOO(EnumMap enumMap, long j) {
        C1548ey c1548eyOooO00o = ((h20) this.f24094OooOo0o).OooO00o();
        c1548eyOooO00o.OooO0oO("action", "start_preload");
        c1548eyOooO00o.OooO0oO("sp_ts", Long.toString(j));
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            c1548eyOooO00o.OooO0oO(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        c1548eyOooO00o.OooOOO0();
    }

    public void OooOOOo(AdFormat adFormat, Optional optional, String str, long j, Optional optional2) {
        C1548ey c1548eyOooO00o = ((h20) this.f24094OooOo0o).OooO00o();
        c1548eyOooO00o.OooO0oO(str, Long.toString(j));
        c1548eyOooO00o.OooO0oO("ad_format", adFormat == null ? "unknown" : adFormat.name());
        optional.ifPresent(new og0(c1548eyOooO00o, 2));
        optional2.ifPresent(new og0(c1548eyOooO00o, 3));
        c1548eyOooO00o.OooOOO0();
    }

    public void OooOOo(s20 s20Var) throws JSONException {
        String strOooO0O0 = s20.OooO0O0(s20Var);
        zzo.zzi("Dispatching AFMA event on publisher webview: ".concat(strOooO0O0));
        ((InterfaceC1563fc) this.f24094OooOo0o).zzb(strOooO0O0);
    }

    public void OooOOo0(long j) throws JSONException {
        s20 s20Var = new s20("creation");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = "nativeObjectNotCreated";
        OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.x40
    public o00000oO.OooOOO Oooo000(C2197wi c2197wi) {
        return ((d50) ((n31) ((de0) this.f24094OooOo0o).f18243OooOoO0).zzb()).o000O0O0(c2197wi, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public C2204wp Oooo0oO(rc0 rc0Var) {
        return ((fc0) this.f24094OooOo0o).OooO0O0(rc0Var);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        InterfaceC1939pj interfaceC1939pj = (InterfaceC1939pj) this.f24094OooOo0o;
        if (interfaceC1939pj != null) {
            try {
                return interfaceC1939pj.zze();
            } catch (RemoteException e) {
                zzo.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        InterfaceC1939pj interfaceC1939pj = (InterfaceC1939pj) this.f24094OooOo0o;
        if (interfaceC1939pj != null) {
            try {
                return interfaceC1939pj.zzf();
            } catch (RemoteException e) {
                zzo.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).OoooOOo(adError.zza());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onAdLeftApplication() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzn();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzp();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoComplete.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzu();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPause() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPause.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).OooO0O0();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoPlay() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPlay.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzx();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdClicked.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdImpression.");
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzm();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2318zs, com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public zzeb mo13704zza() {
        return ((InterfaceC1722jo) this.f24094OooOo0o).zzq();
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        C2274yl c2274yl;
        switch (this.f24093OooOo0O) {
            case 11:
                String str = (String) obj;
                C1689ir c1689ir = (C1689ir) this.f24094OooOo0o;
                kd0 kd0Var = c1689ir.f20097OooOoOO;
                c1689ir.f20098OooOoo.OooO0O0(true == zzv.zzp().OooO00o(c1689ir.f20093OooOo0O) ? 2 : 1, c1689ir.f20099OooOoo0.OooO0O0(c1689ir.f20095OooOoO, kd0Var, false, "", str, kd0Var.f20489OooO0OO));
                return;
            case 12:
                ((C1875nt) this.f24094OooOo0o).f21590OooO0o.OoooO00(true);
                return;
            case 17:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                C1917oy c1917oy = (C1917oy) this.f24094OooOo0o;
                C2065sy c2065sy = c1917oy.f23140OooOO0O;
                synchronized (c2065sy) {
                    c2065sy.f24188OooOO0O = interfaceC1722jo;
                }
                C2065sy c2065sy2 = c1917oy.f23140OooOO0O;
                synchronized (c2065sy2) {
                    c2274yl = c2065sy2.f24189OooOOO;
                }
                f60 f60VarOooOOo0 = c1917oy.OooOOo0("Google", true);
                if (f60VarOooOOo0 != null && c2274yl != null) {
                    c2274yl.zzc(f60VarOooOOo0);
                    return;
                } else {
                    if (c2274yl != null) {
                        c2274yl.cancel(false);
                        return;
                    }
                    return;
                }
            case 18:
                ((InterfaceC1722jo) obj).OooO0o("sendMessageToNativeJs", (Map) this.f24094OooOo0o);
                return;
            default:
                ((t40) this.f24094OooOo0o).f24238OooO0OO.oo000o((rd0) obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.tc0
    public Object zzd() {
        InterfaceC1691iu interfaceC1691iu;
        synchronized (this) {
            interfaceC1691iu = (InterfaceC1691iu) this.f24094OooOo0o;
        }
        return interfaceC1691iu;
    }

    public /* synthetic */ sj0(Object obj, int i) {
        this.f24093OooOo0O = i;
        this.f24094OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public void mo13708zza(Object obj) {
        switch (this.f24093OooOo0O) {
            case 7:
                C2229xd c2229xd = (C2229xd) this.f24094OooOo0o;
                c2229xd.getClass();
                if (((C1822md) obj).f21202OooOo0O.OooOOO0()) {
                    c2229xd.f25606OooO0OO = 1;
                    break;
                }
                break;
            case 13:
                ((InterfaceC2172vu) obj).OoooOOo((C2027rx) this.f24094OooOo0o);
                break;
            case 14:
                ((InterfaceC2173vv) obj).oo000o((rd0) this.f24094OooOo0o);
                break;
            case 15:
                ((InterfaceC1620gw) obj).OooOOO((C2184w5) this.f24094OooOo0o);
                break;
            case 16:
                ((InterfaceC1481d3) obj).Ooooo00((C1444c3) this.f24094OooOo0o);
                break;
            default:
                df0 df0Var = (df0) this.f24094OooOo0o;
                ((hf0) obj).OooO0o0(df0Var.f18246OooOo0o);
                break;
        }
    }

    public sj0(int i) {
        this.f24093OooOo0O = i;
        switch (i) {
            case 5:
                this.f24094OooOo0o = new HashMap();
                break;
            default:
                a11 a11Var = a11.f16875OooO0OO;
                hk0 hk0Var = new hk0(new t01[]{o0O.f21862Oooo000, f24092OooOoO0}, 3);
                Charset charset = i01.f19888OooO00o;
                this.f24094OooOo0o = hk0Var;
                break;
        }
    }

    public sj0(Context context) {
        this.f24093OooOo0O = 0;
        if (C1548ey.f18705OooOoO0 == null) {
            C1548ey.f18705OooOoO0 = new C1548ey(context, 26);
        }
        this.f24094OooOo0o = C1548ey.f18705OooOoO0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onAdFailedToShow(String str) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            ((InterfaceC1383af) this.f24094OooOo0o).zzl(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390am, com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        switch (this.f24093OooOo0O) {
            case 8:
                zze.zza("Rejecting reference for JS Engine.");
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0OO)).booleanValue();
                C2155vd c2155vd = (C2155vd) this.f24094OooOo0o;
                if (zBooleanValue) {
                    c2155vd.OooOO0("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    c2155vd.OooO();
                    return;
                }
            default:
                synchronized (((b90) this.f24094OooOo0o)) {
                    ((b90) this.f24094OooOo0o).f17461OooOooO = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f24093OooOo0O) {
            case 11:
                break;
            case 12:
                ((C1875nt) this.f24094OooOo0o).f21590OooO0o.OoooO00(false);
                break;
            case 17:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0O0)).booleanValue()) {
                    zzv.zzp().OooO0oO("omid native display exp", th);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoUnmute() {
    }

    private final void OooO0oO(Throwable th) {
    }

    private final void OooOO0O(Throwable th) {
    }

    private final void OooOO0o(Throwable th) {
    }
}
