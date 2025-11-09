package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kg */
/* loaded from: classes2.dex */
public final class BinderC1751kg extends AbstractBinderC2181w2 implements InterfaceC1530eg {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f20585OooOoOO = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public MediationRewardedAd f20586OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final RtbAdapter f20587OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public MediationInterstitialAd f20588OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public String f20589OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public MediationAppOpenAd f20590OooOoO0;

    public BinderC1751kg(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f20589OooOoO = "";
        this.f20587OooOo0O = rtbAdapter;
    }

    public static final Bundle o000O0o0(String str) throws RemoteException {
        zzo.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzo.zzh("", e);
            throw new RemoteException();
        }
    }

    public static final boolean o000O0oO(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzbc.zzb();
        return zzf.zzr();
    }

    public static final String o000O0oo(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final boolean OooOO0o(Oooo0o.OooO0O0 oooO0O0) {
        MediationAppOpenAd mediationAppOpenAd = this.f20590OooOoO0;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
            return true;
        } catch (Throwable th) {
            zzo.zzh("", th);
            af0.OooOOOO(oooO0O0, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final boolean OooOOO0(Oooo0o.OooO0O0 oooO0O0) {
        MediationInterstitialAd mediationInterstitialAd = this.f20588OooOo0o;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
            return true;
        } catch (Throwable th) {
            zzo.zzh("", th);
            af0.OooOOOO(oooO0O0, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void OooOooo(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC2305zf interfaceC2305zf, InterfaceC1383af interfaceC1383af, C1414b9 c1414b9) throws RemoteException {
        RtbAdapter rtbAdapter = this.f20587OooOo0O;
        try {
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO, c1414b9), new C1714jg(interfaceC2305zf, interfaceC1383af, 0));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render native ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO, c1414b9), new C1714jg(interfaceC2305zf, interfaceC1383af, 1));
            } catch (Throwable th2) {
                zzo.zzh("Adapter failed to render native ad.", th2);
                af0.OooOOOO(oooO0O0, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void OoooO00(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC2231xf interfaceC2231xf, InterfaceC1383af interfaceC1383af) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO), new de0(this, interfaceC2231xf, interfaceC1383af, 12));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render interstitial ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void OoooOoO(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC2157vf interfaceC2157vf, InterfaceC1383af interfaceC1383af, zzs zzsVar) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.f20589OooOoO), new C1678ig(interfaceC2157vf, interfaceC1383af, 0));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render banner ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o00000(Oooo0o.OooO0O0 r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, com.google.android.gms.ads.internal.client.zzs r9, com.google.android.gms.internal.ads.InterfaceC1604gg r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.n1 r0 = new com.google.android.gms.internal.ads.n1     // Catch: java.lang.Throwable -> L73
            r1 = 8
            r0.<init>(r10, r1)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f20587OooOo0O     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch: java.lang.Throwable -> L73
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L73
            switch(r2) {
                case -1396342996: goto L4f;
                case -1052618729: goto L45;
                case -239580146: goto L3b;
                case 604727084: goto L31;
                case 1167692200: goto L27;
                case 1778294298: goto L1d;
                case 1911491517: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 3
            goto L5a
        L1d:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 6
            goto L5a
        L27:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 5
            goto L5a
        L31:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 1
            goto L5a
        L3b:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 2
            goto L5a
        L45:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 4
            goto L5a
        L4f:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L59
            r6 = 0
            goto L5a
        L59:
            r6 = -1
        L5a:
            switch(r6) {
                case 0: goto L8c;
                case 1: goto L89;
                case 2: goto L86;
                case 3: goto L83;
                case 4: goto L80;
                case 5: goto L7d;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L75
        L5e:
            com.google.android.gms.internal.ads.v6 r6 = com.google.android.gms.internal.ads.AbstractC1448c7.o0o0000     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r2.OooO00o(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L73
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L75
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L73
            goto L8e
        L73:
            r6 = move-exception
            goto Lb2
        L75:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L73
            throw r6     // Catch: java.lang.Throwable -> L73
        L7d:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L73
            goto L8e
        L80:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch: java.lang.Throwable -> L73
            goto L8e
        L83:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L73
            goto L8e
        L86:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L73
            goto L8e
        L89:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L73
            goto L8e
        L8c:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L73
        L8e:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L73
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
            r6.add(r1)     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r8 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = Oooo0o.OooO0OO.o000O0oO(r5)     // Catch: java.lang.Throwable -> L73
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L73
            int r2 = r9.zze     // Catch: java.lang.Throwable -> L73
            int r3 = r9.zzb     // Catch: java.lang.Throwable -> L73
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.ads.AdSize r9 = com.google.android.gms.ads.zzc.zzc(r2, r3, r9)     // Catch: java.lang.Throwable -> L73
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L73
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L73
            return
        Lb2:
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.af0.OooOOOO(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1751kg.o00000(Oooo0o.OooO0O0, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzs, com.google.android.gms.internal.ads.gg):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void o00000Oo(String str, String str2, zzm zzmVar, Oooo0o.OooO0OO oooO0OO, n70 n70Var, InterfaceC1383af interfaceC1383af) throws RemoteException {
        OooOooo(str, str2, zzmVar, oooO0OO, n70Var, interfaceC1383af, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final boolean o0000o0O(Oooo0o.OooO0O0 oooO0O0) {
        MediationRewardedAd mediationRewardedAd = this.f20586OooOo;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
            return true;
        } catch (Throwable th) {
            zzo.zzh("", th);
            af0.OooOOOO(oooO0O0, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void o0000oOo(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC2083tf interfaceC2083tf, InterfaceC1383af interfaceC1383af) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO), new de0(this, interfaceC2083tf, interfaceC1383af, 13));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render app open ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    public final Bundle o000O0O0(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f20587OooOo0O.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC1604gg c1567fg = null;
        InterfaceC2083tf c2046sf = null;
        InterfaceC2305zf c2268yf = null;
        InterfaceC2157vf c2120uf = null;
        InterfaceC1457cg c1384ag = null;
        InterfaceC2305zf c2268yf2 = null;
        InterfaceC1457cg c1384ag2 = null;
        InterfaceC2231xf c2194wf = null;
        InterfaceC2157vf c2120uf2 = null;
        if (i == 1) {
            Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, creator);
            zzs zzsVar = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c1567fg = iInterfaceQueryLocalInterface instanceof InterfaceC1604gg ? (InterfaceC1604gg) iInterfaceQueryLocalInterface : new C1567fg(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            }
            AbstractC2218x2.OooO0O0(parcel);
            o00000(oooO0O0O000O0o0, string, bundle, bundle2, zzsVar, c1567fg);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            C1788lg c1788lgZzf = zzf();
            parcel2.writeNoException();
            AbstractC2218x2.OooO0Oo(parcel2, c1788lgZzf);
            return true;
        }
        if (i == 3) {
            C1788lg c1788lgZzg = zzg();
            parcel2.writeNoException();
            AbstractC2218x2.OooO0Oo(parcel2, c1788lgZzg);
            return true;
        }
        if (i == 5) {
            zzeb zzebVarZze = zze();
            parcel2.writeNoException();
            AbstractC2218x2.OooO0o0(parcel2, zzebVarZze);
            return true;
        }
        if (i == 10) {
            Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            AbstractC2218x2.OooO0O0(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                zzm zzmVar = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2120uf2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2157vf ? (InterfaceC2157vf) iInterfaceQueryLocalInterface2 : new C2120uf(strongBinder2);
                }
                InterfaceC2157vf interfaceC2157vf = c2120uf2;
                InterfaceC1383af interfaceC1383afO000O0O0 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                OoooOoO(string2, string3, zzmVar, oooO0O0O000O0o02, interfaceC2157vf, interfaceC1383afO000O0O0, zzsVar2);
                parcel2.writeNoException();
                break;
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzm zzmVar2 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    c2194wf = iInterfaceQueryLocalInterface3 instanceof InterfaceC2231xf ? (InterfaceC2231xf) iInterfaceQueryLocalInterface3 : new C2194wf(strongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                }
                InterfaceC1383af interfaceC1383afO000O0O02 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                OoooO00(string4, string5, zzmVar2, oooO0O0O000O0o03, c2194wf, interfaceC1383afO000O0O02);
                parcel2.writeNoException();
                break;
            case 15:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooOOO0 = OooOOO0(oooO0O0O000O0o04);
                parcel2.writeNoException();
                parcel2.writeInt(zOooOOO0 ? 1 : 0);
                break;
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                zzm zzmVar3 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1384ag2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC1457cg ? (InterfaceC1457cg) iInterfaceQueryLocalInterface4 : new C1384ag(strongBinder4);
                }
                InterfaceC1383af interfaceC1383afO000O0O03 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o00oO0o(string6, string7, zzmVar3, oooO0O0O000O0o05, c1384ag2, interfaceC1383afO000O0O03);
                parcel2.writeNoException();
                break;
            case 17:
                Oooo0o.OooO0O0 oooO0O0O000O0o06 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                boolean zO0000o0O = o0000o0O(oooO0O0O000O0o06);
                parcel2.writeNoException();
                parcel2.writeInt(zO0000o0O ? 1 : 0);
                break;
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                zzm zzmVar4 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o07 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2268yf2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC2305zf ? (InterfaceC2305zf) iInterfaceQueryLocalInterface5 : new C2268yf(strongBinder5);
                }
                InterfaceC1383af interfaceC1383afO000O0O04 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                OooOooo(string8, string9, zzmVar4, oooO0O0O000O0o07, c2268yf2, interfaceC1383afO000O0O04, null);
                parcel2.writeNoException();
                break;
            case 19:
                String string10 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                this.f20589OooOoO = string10;
                parcel2.writeNoException();
                break;
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzm zzmVar5 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o08 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1384ag = iInterfaceQueryLocalInterface6 instanceof InterfaceC1457cg ? (InterfaceC1457cg) iInterfaceQueryLocalInterface6 : new C1384ag(strongBinder6);
                }
                InterfaceC1383af interfaceC1383afO000O0O05 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o00o0O(string11, string12, zzmVar5, oooO0O0O000O0o08, c1384ag, interfaceC1383afO000O0O05);
                parcel2.writeNoException();
                break;
            case 21:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                zzm zzmVar6 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o09 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2120uf = iInterfaceQueryLocalInterface7 instanceof InterfaceC2157vf ? (InterfaceC2157vf) iInterfaceQueryLocalInterface7 : new C2120uf(strongBinder7);
                }
                InterfaceC2157vf interfaceC2157vf2 = c2120uf;
                InterfaceC1383af interfaceC1383afO000O0O06 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o0OOO0o(string13, string14, zzmVar6, oooO0O0O000O0o09, interfaceC2157vf2, interfaceC1383afO000O0O06, zzsVar3);
                parcel2.writeNoException();
                break;
            case 22:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                zzm zzmVar7 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o010 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2268yf = iInterfaceQueryLocalInterface8 instanceof InterfaceC2305zf ? (InterfaceC2305zf) iInterfaceQueryLocalInterface8 : new C2268yf(strongBinder8);
                }
                InterfaceC1383af interfaceC1383afO000O0O07 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                C1414b9 c1414b9 = (C1414b9) AbstractC2218x2.OooO00o(parcel, C1414b9.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                OooOooo(string15, string16, zzmVar7, oooO0O0O000O0o010, c2268yf, interfaceC1383afO000O0O07, c1414b9);
                parcel2.writeNoException();
                break;
            case 23:
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                zzm zzmVar8 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o011 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    c2046sf = iInterfaceQueryLocalInterface9 instanceof InterfaceC2083tf ? (InterfaceC2083tf) iInterfaceQueryLocalInterface9 : new C2046sf(strongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                }
                InterfaceC1383af interfaceC1383afO000O0O08 = AbstractBinderC2304ze.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o0000oOo(string17, string18, zzmVar8, oooO0O0O000O0o011, c2046sf, interfaceC1383afO000O0O08);
                parcel2.writeNoException();
                break;
            case 24:
                Oooo0o.OooO0O0 oooO0O0O000O0o012 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooOO0o = OooOO0o(oooO0O0O000O0o012);
                parcel2.writeNoException();
                parcel2.writeInt(zOooOO0o ? 1 : 0);
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void o00o0O(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC1457cg interfaceC1457cg, InterfaceC1383af interfaceC1383af) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO), new de0(this, interfaceC1457cg, interfaceC1383af, 14));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render rewarded interstitial ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void o00oO0o(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC1457cg interfaceC1457cg, InterfaceC1383af interfaceC1383af) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), this.f20589OooOoO), new de0(this, interfaceC1457cg, interfaceC1383af, 14));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render rewarded ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void o0OOO0o(String str, String str2, zzm zzmVar, Oooo0o.OooO0O0 oooO0O0, InterfaceC2157vf interfaceC2157vf, InterfaceC1383af interfaceC1383af, zzs zzsVar) throws RemoteException {
        try {
            this.f20587OooOo0O.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0), str, o000O0o0(str2), o000O0O0(zzmVar), o000O0oO(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, o000O0oo(zzmVar, str2), zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.f20589OooOoO), new C1678ig(interfaceC2157vf, interfaceC1383af, 1));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render interscroller ad.", th);
            af0.OooOOOO(oooO0O0, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final void oo0o0Oo(String str) {
        this.f20589OooOoO = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final zzeb zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f20587OooOo0O;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final C1788lg zzf() {
        return C1788lg.OooO0o0(this.f20587OooOo0O.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1530eg
    public final C1788lg zzg() {
        return C1788lg.OooO0o0(this.f20587OooOo0O.getSDKVersionInfo());
    }
}
