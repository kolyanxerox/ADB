package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* renamed from: com.google.android.gms.internal.ads.kf */
/* loaded from: classes2.dex */
public final class C1750kf implements MediationAdLoadCallback {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BinderC1824mf f20565OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20566OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1383af f20567OooOo0o;

    public /* synthetic */ C1750kf(BinderC1824mf binderC1824mf, InterfaceC1383af interfaceC1383af, int i) {
        this.f20566OooOo0O = i;
        this.f20567OooOo0o = interfaceC1383af;
        this.f20565OooOo = binderC1824mf;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f20566OooOo0O) {
            case 0:
                InterfaceC1383af interfaceC1383af = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af.OooOoo0(adError.zza());
                    interfaceC1383af.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                    return;
                }
            case 1:
                InterfaceC1383af interfaceC1383af2 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af2.OooOoo0(adError.zza());
                    interfaceC1383af2.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af2.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                    return;
                }
            case 2:
                InterfaceC1383af interfaceC1383af3 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af3.OooOoo0(adError.zza());
                    interfaceC1383af3.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af3.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e3) {
                    zzo.zzh("", e3);
                    return;
                }
            case 3:
                InterfaceC1383af interfaceC1383af4 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af4.OooOoo0(adError.zza());
                    interfaceC1383af4.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af4.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e4) {
                    zzo.zzh("", e4);
                    return;
                }
            case 4:
                InterfaceC1383af interfaceC1383af5 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af5.OooOoo0(adError.zza());
                    interfaceC1383af5.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af5.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e5) {
                    zzo.zzh("", e5);
                    return;
                }
            default:
                InterfaceC1383af interfaceC1383af6 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    interfaceC1383af6.OooOoo0(adError.zza());
                    interfaceC1383af6.OooOoO(adError.getCode(), adError.getMessage());
                    interfaceC1383af6.OooO00o(adError.getCode());
                    break;
                } catch (RemoteException e6) {
                    zzo.zzh("", e6);
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f20566OooOo0O) {
            case 0:
                InterfaceC1383af interfaceC1383af = this.f20567OooOo0o;
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                try {
                    this.f20565OooOo.f21231OooOoO = mediationBannerAd.getView();
                    interfaceC1383af.zzo();
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                }
                return new sj0(interfaceC1383af, 9);
            case 1:
                InterfaceC1383af interfaceC1383af2 = this.f20567OooOo0o;
                try {
                    this.f20565OooOo.f21233OooOoOO = (MediationInterstitialAd) obj;
                    interfaceC1383af2.zzo();
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                }
                return new sj0(interfaceC1383af2, 9);
            case 2:
                InterfaceC1383af interfaceC1383af3 = this.f20567OooOo0o;
                try {
                    this.f20565OooOo.f21235OooOoo0 = (UnifiedNativeAdMapper) obj;
                    interfaceC1383af3.zzo();
                } catch (RemoteException e3) {
                    zzo.zzh("", e3);
                }
                return new sj0(interfaceC1383af3, 9);
            case 3:
                InterfaceC1383af interfaceC1383af4 = this.f20567OooOo0o;
                try {
                    this.f20565OooOo.f21234OooOoo = (NativeAdMapper) obj;
                    interfaceC1383af4.zzo();
                } catch (RemoteException e4) {
                    zzo.zzh("", e4);
                }
                return new sj0(interfaceC1383af4, 9);
            case 4:
                InterfaceC1383af interfaceC1383af5 = this.f20567OooOo0o;
                try {
                    this.f20565OooOo.f21236OooOooO = (MediationRewardedAd) obj;
                    interfaceC1383af5.zzo();
                } catch (RemoteException e5) {
                    zzo.zzh("", e5);
                }
                return new wj0(interfaceC1383af5, 9);
            default:
                InterfaceC1383af interfaceC1383af6 = this.f20567OooOo0o;
                try {
                    this.f20565OooOo.f21238Oooo000 = (MediationAppOpenAd) obj;
                    interfaceC1383af6.zzo();
                } catch (RemoteException e6) {
                    zzo.zzh("", e6);
                }
                return new sj0(interfaceC1383af6, 9);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f20566OooOo0O) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 1:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 2:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 3:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 4:
                InterfaceC1383af interfaceC1383af = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
                    interfaceC1383af.OooOoO(0, str);
                    interfaceC1383af.OooO00o(0);
                    break;
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                    return;
                }
            default:
                InterfaceC1383af interfaceC1383af2 = this.f20567OooOo0o;
                try {
                    zzo.zze(this.f20565OooOo.f21229OooOo0O.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
                    interfaceC1383af2.OooOoO(0, str);
                    interfaceC1383af2.OooO00o(0);
                    break;
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                }
        }
    }
}
