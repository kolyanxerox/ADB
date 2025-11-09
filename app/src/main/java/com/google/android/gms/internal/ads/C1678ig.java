package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* renamed from: com.google.android.gms.internal.ads.ig */
/* loaded from: classes2.dex */
public final class C1678ig implements MediationAdLoadCallback {

    /* renamed from: OooOo */
    public final /* synthetic */ InterfaceC1383af f20040OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f20041OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ InterfaceC2157vf f20042OooOo0o;

    public /* synthetic */ C1678ig(InterfaceC2157vf interfaceC2157vf, InterfaceC1383af interfaceC1383af, int i) {
        this.f20041OooOo0O = i;
        this.f20042OooOo0o = interfaceC2157vf;
        this.f20040OooOo = interfaceC1383af;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f20041OooOo0O) {
            case 0:
                try {
                    this.f20042OooOo0o.zzf(adError.zza());
                    break;
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                }
            default:
                try {
                    this.f20042OooOo0o.zzf(adError.zza());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        switch (this.f20041OooOo0O) {
            case 0:
                MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
                InterfaceC2157vf interfaceC2157vf = this.f20042OooOo0o;
                if (mediationBannerAd != null) {
                    try {
                        interfaceC2157vf.OooOOo0(new Oooo0o.OooO0OO(mediationBannerAd.getView()));
                    } catch (RemoteException e) {
                        zzo.zzh("", e);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2157vf.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e2) {
                        zzo.zzh("", e2);
                        return null;
                    }
                }
            default:
                MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
                InterfaceC2157vf interfaceC2157vf2 = this.f20042OooOo0o;
                if (mediationInterscrollerAd != null) {
                    try {
                        interfaceC2157vf2.o000O000(new BinderC1861nf(mediationInterscrollerAd));
                    } catch (RemoteException e3) {
                        zzo.zzh("", e3);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2157vf2.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e4) {
                        zzo.zzh("", e4);
                        return null;
                    }
                }
        }
        return new p80(this.f20040OooOo, 9);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f20041OooOo0O) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }
}
