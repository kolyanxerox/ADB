package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mf */
/* loaded from: classes2.dex */
public final class BinderC1824mf extends AbstractBinderC2181w2 implements InterfaceC2230xe {

    /* renamed from: OooOo */
    public InterfaceC1828mj f21228OooOo;

    /* renamed from: OooOo0O */
    public final MediationExtrasReceiver f21229OooOo0O;

    /* renamed from: OooOo0o */
    public de0 f21230OooOo0o;

    /* renamed from: OooOoO */
    public View f21231OooOoO;

    /* renamed from: OooOoO0 */
    public Oooo0o.OooO0O0 f21232OooOoO0;

    /* renamed from: OooOoOO */
    public MediationInterstitialAd f21233OooOoOO;

    /* renamed from: OooOoo */
    public NativeAdMapper f21234OooOoo;

    /* renamed from: OooOoo0 */
    public UnifiedNativeAdMapper f21235OooOoo0;

    /* renamed from: OooOooO */
    public MediationRewardedAd f21236OooOooO;

    /* renamed from: OooOooo */
    public MediationInterscrollerAd f21237OooOooo;

    /* renamed from: Oooo000 */
    public MediationAppOpenAd f21238Oooo000;

    /* renamed from: Oooo00O */
    public final String f21239Oooo00O;

    public BinderC1824mf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final String o000O(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public static final boolean o000O0oo(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzbc.zzb();
        return zzf.zzr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooO0Oo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzo.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
        zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooO0oO() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1529ef OooOOOo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooOOoo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, InterfaceC1828mj interfaceC1828mj, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f21232OooOoO0 = oooO0O0;
            this.f21228OooOo = interfaceC1828mj;
            interfaceC1828mj.OooooOo(new Oooo0o.OooO0OO(mediationExtrasReceiver));
            return;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OooOoOO(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        boolean z = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting interstitial ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, str2), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), this.f21239Oooo00O), new C1750kf(this, interfaceC1383af, 1));
                    return;
                } catch (Throwable th) {
                    zzo.zzh("", th);
                    af0.OooOOOO(oooO0O0, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            Date date = j == -1 ? null : new Date(j);
            int i = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zO000O0oo = o000O0oo(zzmVar);
            int i2 = zzmVar.zzg;
            boolean z2 = zzmVar.zzr;
            o000O(zzmVar, str);
            C1713jf c1713jf = new C1713jf(date, i, hashSet, location, zO000O0oo, i2, z2);
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), new de0(interfaceC1383af), o000O0oO(str, zzmVar, str2), c1713jf, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzo.zzh("", th2);
            af0.OooOOOO(oooO0O0, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void Oooo(Oooo0o.OooO0O0 oooO0O0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.f21238Oooo000;
        if (mediationAppOpenAd == null) {
            zzo.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
        } catch (RuntimeException e) {
            af0.OooOOOO(oooO0O0, e, "adapter.appOpen.showAd");
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0072  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Oooo0oo(Oooo0o.OooO0O0 r10, com.google.android.gms.internal.ads.InterfaceC2154vc r11, java.util.ArrayList r12) throws android.os.RemoteException {
        /*
            r9 = this;
            com.google.android.gms.ads.mediation.MediationExtrasReceiver r0 = r9.f21229OooOo0O
            boolean r1 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r1 == 0) goto Lb8
            com.google.android.gms.internal.ads.wj0 r1 = new com.google.android.gms.internal.ads.wj0
            r2 = 8
            r1.<init>(r11, r2)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r2 = r12.size()
            r3 = 0
            r4 = r3
        L18:
            if (r4 >= r2) goto Lac
            java.lang.Object r5 = r12.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.ad r5 = (com.google.android.gms.internal.ads.C1381ad) r5
            java.lang.String r6 = r5.zza
            int r7 = r6.hashCode()
            switch(r7) {
                case -1396342996: goto L68;
                case -1052618729: goto L5e;
                case -239580146: goto L54;
                case 604727084: goto L4a;
                case 1167692200: goto L40;
                case 1778294298: goto L36;
                case 1911491517: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L72
        L2c:
            java.lang.String r7 = "rewarded_interstitial"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 3
            goto L73
        L36:
            java.lang.String r7 = "app_open_ad"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 6
            goto L73
        L40:
            java.lang.String r7 = "app_open"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 5
            goto L73
        L4a:
            java.lang.String r7 = "interstitial"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 1
            goto L73
        L54:
            java.lang.String r7 = "rewarded"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 2
            goto L73
        L5e:
            java.lang.String r7 = "native"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = 4
            goto L73
        L68:
            java.lang.String r7 = "banner"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            r6 = r3
            goto L73
        L72:
            r6 = -1
        L73:
            r7 = 0
            switch(r6) {
                case 0: goto L9c;
                case 1: goto L99;
                case 2: goto L96;
                case 3: goto L93;
                case 4: goto L90;
                case 5: goto L8d;
                case 6: goto L78;
                default: goto L77;
            }
        L77:
            goto L9e
        L78:
            com.google.android.gms.internal.ads.v6 r6 = com.google.android.gms.internal.ads.AbstractC1448c7.o0o0000
            com.google.android.gms.internal.ads.a7 r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r8.OooO00o(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L9e
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L9e
        L8d:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L9e
        L90:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L9e
        L93:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L9e
        L96:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L9e
        L99:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L9e
        L9c:
            com.google.android.gms.ads.AdFormat r7 = com.google.android.gms.ads.AdFormat.BANNER
        L9e:
            if (r7 == 0) goto L18
            com.google.android.gms.ads.mediation.MediationConfiguration r6 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r5 = r5.zzb
            r6.<init>(r7, r5)
            r11.add(r6)
            goto L18
        Lac:
            com.google.android.gms.ads.mediation.Adapter r0 = (com.google.android.gms.ads.mediation.Adapter) r0
            java.lang.Object r10 = Oooo0o.OooO0OO.o000O0oO(r10)
            android.content.Context r10 = (android.content.Context) r10
            r0.initialize(r10, r1, r11)
            return
        Lb8:
            android.os.RemoteException r10 = new android.os.RemoteException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1824mf.Oooo0oo(Oooo0o.OooO0O0, com.google.android.gms.internal.ads.vc, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void Ooooo0o(Oooo0o.OooO0O0 oooO0O0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (!(mediationExtrasReceiver instanceof Adapter) && !(mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            OooO0Oo();
            return;
        }
        zzo.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f21233OooOoOO;
        if (mediationInterstitialAd == null) {
            zzo.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
        } catch (RuntimeException e) {
            af0.OooOOOO(oooO0O0, e, "adapter.interstitial.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void OoooooO(zzm zzmVar, String str) throws RemoteException {
        o000O0O0(zzmVar, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o00000oo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, null), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), ""), new C1750kf(this, interfaceC1383af, 5));
                return;
            } catch (Exception e) {
                zzo.zzh("", e);
                af0.OooOOOO(oooO0O0, e, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0000OoO(Oooo0o.OooO0O0 oooO0O0, zzs zzsVar, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, str2), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), zzc.zze(zzsVar.zze, zzsVar.zzb), ""), new de0(this, interfaceC1383af, adapter, 10));
        } catch (Exception e) {
            zzo.zzh("", e);
            af0.OooOOOO(oooO0O0, e, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0000oO(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, null), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), ""), new C1750kf(this, interfaceC1383af, 4));
                return;
            } catch (Exception e) {
                zzo.zzh("", e);
                af0.OooOOOO(oooO0O0, e, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000O0(Oooo0o.OooO0O0 oooO0O0) {
        Context context = (Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0);
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000O00O(Oooo0o.OooO0O0 oooO0O0, zzs zzsVar, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af) throws RemoteException {
        String str3;
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        boolean z = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting banner ad from adapter.");
        AdSize adSizeZzd = zzsVar.zzn ? zzc.zzd(zzsVar.zze, zzsVar.zzb) : zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza);
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, str2), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), adSizeZzd, this.f21239Oooo00O), new C1750kf(this, interfaceC1383af, 0));
                    return;
                } catch (Throwable th) {
                    zzo.zzh("", th);
                    af0.OooOOOO(oooO0O0, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            Date date = j == -1 ? null : new Date(j);
            int i = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zO000O0oo = o000O0oo(zzmVar);
            int i2 = zzmVar.zzg;
            boolean z2 = zzmVar.zzr;
            o000O(zzmVar, str);
            C1713jf c1713jf = new C1713jf(date, i, hashSet, location, zO000O0oo, i2, z2);
            Bundle bundle = zzmVar.zzm;
            str3 = "";
            try {
                mediationBannerAdapter.requestBannerAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), new de0(interfaceC1383af), o000O0oO(str, zzmVar, str2), adSizeZzd, c1713jf, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th2) {
                th = th2;
                zzo.zzh(str3, th);
                af0.OooOOOO(oooO0O0, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    public final void o000O0O0(zzm zzmVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            o0000oO(this.f21232OooOoO0, zzmVar, str, new BinderC1899of((Adapter) mediationExtrasReceiver, this.f21228OooOo));
            return;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public final Bundle o000O0o0(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f21229OooOo0O.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final Bundle o000O0oO(String str, zzm zzmVar, String str2) throws RemoteException {
        zzo.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f21229OooOo0O instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzo.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC1383af c2267ye;
        InterfaceC1383af c2267ye2;
        InterfaceC1383af c2267ye3;
        InterfaceC1383af c2267ye4;
        InterfaceC1828mj c1754kj;
        InterfaceC1383af c2267ye5;
        InterfaceC1828mj c1754kj2;
        C1451ca c1451ca;
        InterfaceC1383af c2267ye6;
        InterfaceC2154vc c2117uc;
        InterfaceC1383af c2267ye7;
        InterfaceC1383af c2267ye8;
        InterfaceC1383af c2267ye9 = null;
        switch (i) {
            case 1:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                zzm zzmVar = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2267ye = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye = iInterfaceQueryLocalInterface instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface : new C2267ye(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o000O00O(oooO0O0O000O0o0, zzsVar, zzmVar, string, null, c2267ye);
                parcel2.writeNoException();
                return true;
            case 2:
                Oooo0o.OooO0O0 oooO0O0Zzn = zzn();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzn);
                return true;
            case 3:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar2 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c2267ye2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface2 : new C2267ye(strongBinder2);
                }
                AbstractC2218x2.OooO0O0(parcel);
                OooOoOO(oooO0O0O000O0o02, zzmVar2, string2, null, c2267ye2);
                parcel2.writeNoException();
                return true;
            case 4:
                OooO0Oo();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                zzm zzmVar3 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c2267ye3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye3 = iInterfaceQueryLocalInterface3 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface3 : new C2267ye(strongBinder3);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o000O00O(oooO0O0O000O0o03, zzsVar2, zzmVar3, string3, string4, c2267ye3);
                parcel2.writeNoException();
                return true;
            case 7:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar4 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c2267ye4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye4 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface4 : new C2267ye(strongBinder4);
                }
                AbstractC2218x2.OooO0O0(parcel);
                OooOoOO(oooO0O0O000O0o04, zzmVar4, string5, string6, c2267ye4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                OooO0oO();
                parcel2.writeNoException();
                return true;
            case 10:
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar5 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    c1754kj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c1754kj = iInterfaceQueryLocalInterface5 instanceof InterfaceC1828mj ? (InterfaceC1828mj) iInterfaceQueryLocalInterface5 : new C1754kj(strongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                }
                String string7 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                OooOOoo(oooO0O0O000O0o05, zzmVar5, c1754kj, string7);
                parcel2.writeNoException();
                return true;
            case 11:
                zzm zzmVar6 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string8 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                o000O0O0(zzmVar6, string8);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                Oooo0o.OooO0O0 oooO0O0O000O0o06 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar7 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    c2267ye5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye5 = iInterfaceQueryLocalInterface6 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface6 : new C2267ye(strongBinder6);
                }
                C1414b9 c1414b9 = (C1414b9) AbstractC2218x2.OooO00o(parcel, C1414b9.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                AbstractC2218x2.OooO0O0(parcel);
                o000Oo0(oooO0O0O000O0o06, zzmVar7, string9, string10, c2267ye5, c1414b9, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundle3);
                return true;
            case 20:
                zzm zzmVar8 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string11 = parcel.readString();
                parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                o000O0O0(zzmVar8, string11);
                parcel2.writeNoException();
                return true;
            case 21:
                Oooo0o.OooO0O0 oooO0O0O000O0o07 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o000O0(oooO0O0O000O0o07);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(0);
                return true;
            case 23:
                Oooo0o.OooO0O0 oooO0O0O000O0o08 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c1754kj2 = iInterfaceQueryLocalInterface7 instanceof InterfaceC1828mj ? (InterfaceC1828mj) iInterfaceQueryLocalInterface7 : new C1754kj(strongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                } else {
                    c1754kj2 = null;
                }
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                AbstractC2218x2.OooO0O0(parcel);
                o0ooOOo(oooO0O0O000O0o08, c1754kj2, arrayListCreateStringArrayList2);
                throw null;
            case 24:
                de0 de0Var = this.f21230OooOo0o;
                InterfaceC1415ba interfaceC1415ba = (de0Var == null || (c1451ca = (C1451ca) de0Var.f18243OooOoO0) == null) ? null : c1451ca.f17977OooO00o;
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1415ba);
                return true;
            case 25:
                boolean zOooO0o = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                ooOO(zOooO0o);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzebVarZzh = zzh();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarZzh);
                return true;
            case 27:
                InterfaceC1640hf interfaceC1640hfZzk = zzk();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1640hfZzk);
                return true;
            case 28:
                Oooo0o.OooO0O0 oooO0O0O000O0o09 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar9 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string12 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    c2267ye6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye6 = iInterfaceQueryLocalInterface8 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface8 : new C2267ye(strongBinder8);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o0000oO(oooO0O0O000O0o09, zzmVar9, string12, c2267ye6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                Oooo0o.OooO0O0 oooO0O0O000O0o010 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o00Oo0(oooO0O0O000O0o010);
                parcel2.writeNoException();
                return true;
            case 31:
                Oooo0o.OooO0O0 oooO0O0O000O0o011 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 == null) {
                    c2117uc = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    c2117uc = iInterfaceQueryLocalInterface9 instanceof InterfaceC2154vc ? (InterfaceC2154vc) iInterfaceQueryLocalInterface9 : new C2117uc(strongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C1381ad.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                Oooo0oo(oooO0O0O000O0o011, c2117uc, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                Oooo0o.OooO0O0 oooO0O0O000O0o012 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar10 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string13 = parcel.readString();
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 == null) {
                    c2267ye7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye7 = iInterfaceQueryLocalInterface10 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface10 : new C2267ye(strongBinder10);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o000OOo(oooO0O0O000O0o012, zzmVar10, string13, c2267ye7);
                parcel2.writeNoException();
                return true;
            case 33:
                C1788lg c1788lgZzl = zzl();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, c1788lgZzl);
                return true;
            case 34:
                C1788lg c1788lgZzm = zzm();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, c1788lgZzm);
                return true;
            case 35:
                Oooo0o.OooO0O0 oooO0O0O000O0o013 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                zzm zzmVar11 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 == null) {
                    c2267ye8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye8 = iInterfaceQueryLocalInterface11 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface11 : new C2267ye(strongBinder11);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o0000OoO(oooO0O0O000O0o013, zzsVar3, zzmVar11, string14, string15, c2267ye8);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC1456cf interfaceC1456cfZzj = zzj();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1456cfZzj);
                return true;
            case 37:
                Oooo0o.OooO0O0 oooO0O0O000O0o014 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                Ooooo0o(oooO0O0O000O0o014);
                parcel2.writeNoException();
                return true;
            case 38:
                Oooo0o.OooO0O0 oooO0O0O000O0o015 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzm zzmVar12 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                String string16 = parcel.readString();
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c2267ye9 = iInterfaceQueryLocalInterface12 instanceof InterfaceC1383af ? (InterfaceC1383af) iInterfaceQueryLocalInterface12 : new C2267ye(strongBinder12);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o00000oo(oooO0O0O000O0o015, zzmVar12, string16, c2267ye9);
                parcel2.writeNoException();
                return true;
            case 39:
                Oooo0o.OooO0O0 oooO0O0O000O0o016 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                Oooo(oooO0O0O000O0o016);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000OOo(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, InterfaceC1383af interfaceC1383af) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, null), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), ""), new C1750kf(this, interfaceC1383af, 4));
                return;
            } catch (Exception e) {
                af0.OooOOOO(oooO0O0, e, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o000Oo0(Oooo0o.OooO0O0 oooO0O0, zzm zzmVar, String str, String str2, InterfaceC1383af interfaceC1383af, C1414b9 c1414b9, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver;
        MediationExtrasReceiver mediationExtrasReceiver2 = this.f21229OooOo0O;
        boolean z = mediationExtrasReceiver2 instanceof MediationNativeAdapter;
        if (!z && !(mediationExtrasReceiver2 instanceof Adapter)) {
            zzo.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting native ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver2 instanceof Adapter) {
                try {
                    mediationExtrasReceiver = mediationExtrasReceiver2;
                } catch (Throwable th) {
                    th = th;
                    mediationExtrasReceiver = mediationExtrasReceiver2;
                }
                try {
                    ((Adapter) mediationExtrasReceiver2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, str2), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), this.f21239Oooo00O, c1414b9), new C1750kf(this, interfaceC1383af, 3));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    zzo.zzh("", th);
                    af0.OooOOOO(oooO0O0, th, "adapter.loadNativeAdMapper");
                    String message = th.getMessage();
                    if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                        throw new RemoteException();
                    }
                    try {
                        ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), "", o000O0oO(str, zzmVar, str2), o000O0o0(zzmVar), o000O0oo(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O(zzmVar, str), this.f21239Oooo00O, c1414b9), new C1750kf(this, interfaceC1383af, 2));
                        return;
                    } catch (Throwable th3) {
                        zzo.zzh("", th3);
                        af0.OooOOOO(oooO0O0, th3, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver2;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzmVar.zzb;
            Date date = j == -1 ? null : new Date(j);
            int i = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zO000O0oo = o000O0oo(zzmVar);
            int i2 = zzmVar.zzg;
            boolean z2 = zzmVar.zzr;
            o000O(zzmVar, str);
            C1972qf c1972qf = new C1972qf(date, i, hashSet, location, zO000O0oo, i2, c1414b9, arrayList, z2);
            Bundle bundle = zzmVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f21230OooOo0o = new de0(interfaceC1383af);
            mediationNativeAdapter.requestNativeAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), this.f21230OooOo0o, o000O0oO(str, zzmVar, str2), c1972qf, bundle2);
        } catch (Throwable th4) {
            zzo.zzh("", th4);
            af0.OooOOOO(oooO0O0, th4, "adapter.requestNativeAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o00Oo0(Oooo0o.OooO0O0 oooO0O0) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.f21236OooOooO;
        if (mediationRewardedAd == null) {
            zzo.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
        } catch (RuntimeException e) {
            af0.OooOOOO(oooO0O0, e, "adapter.rewarded.showAd");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void o0ooOOo(Oooo0o.OooO0O0 oooO0O0, InterfaceC1828mj interfaceC1828mj, List list) throws RemoteException {
        zzo.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void ooOO(boolean z) {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzo.zzh("", th);
                return;
            }
        }
        zzo.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzE() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzL() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.f21236OooOooO;
        if (mediationRewardedAd == null) {
            zzo.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(this.f21232OooOoO0));
        } catch (RuntimeException e) {
            af0.OooOOOO(this.f21232OooOoO0, e, "adapter.showVideo");
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final boolean zzN() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f21228OooOo != null;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1493df zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final zzeb zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final InterfaceC1456cf zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f21237OooOooo;
        if (mediationInterscrollerAd != null) {
            return new BinderC1861nf(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final InterfaceC1640hf zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationNativeAdapter) {
            de0 de0Var = this.f21230OooOo0o;
            if (de0Var == null || (unifiedNativeAdMapper = (UnifiedNativeAdMapper) de0Var.f18240OooOo) == null) {
                return null;
            }
            return new BinderC2009rf(unifiedNativeAdMapper);
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.f21234OooOoo;
        if (nativeAdMapper != null) {
            return new BinderC1935pf(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = this.f21235OooOoo0;
        if (unifiedNativeAdMapper2 != null) {
            return new BinderC2009rf(unifiedNativeAdMapper2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1788lg zzl() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            return C1788lg.OooO0o0(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final C1788lg zzm() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof Adapter) {
            return C1788lg.OooO0o0(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final Oooo0o.OooO0O0 zzn() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new Oooo0o.OooO0OO(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new Oooo0o.OooO0OO(this.f21231OooOoO);
        }
        zzo.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2230xe
    public final void zzo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.f21229OooOo0O;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                zzo.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public BinderC1824mf(Adapter adapter) {
        this();
        this.f21239Oooo00O = "";
        this.f21229OooOo0O = adapter;
    }

    public BinderC1824mf(MediationAdapter mediationAdapter) {
        this();
        this.f21239Oooo00O = "";
        this.f21229OooOo0O = mediationAdapter;
    }
}
