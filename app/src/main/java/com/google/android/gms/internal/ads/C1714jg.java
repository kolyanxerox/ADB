package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* renamed from: com.google.android.gms.internal.ads.jg */
/* loaded from: classes2.dex */
public final class C1714jg implements MediationAdLoadCallback {

    /* renamed from: OooOo */
    public final /* synthetic */ InterfaceC1383af f20303OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f20304OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ InterfaceC2305zf f20305OooOo0o;

    public /* synthetic */ C1714jg(InterfaceC2305zf interfaceC2305zf, InterfaceC1383af interfaceC1383af, int i) {
        this.f20304OooOo0O = i;
        this.f20305OooOo0o = interfaceC2305zf;
        this.f20303OooOo = interfaceC1383af;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        switch (this.f20304OooOo0O) {
            case 0:
                try {
                    this.f20305OooOo0o.zzf(adError.zza());
                    break;
                } catch (RemoteException e) {
                    zzo.zzh("", e);
                }
            default:
                try {
                    this.f20305OooOo0o.zzf(adError.zza());
                    break;
                } catch (RemoteException e2) {
                    zzo.zzh("", e2);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f20304OooOo0O) {
            case 0:
                NativeAdMapper nativeAdMapper = (NativeAdMapper) obj;
                InterfaceC2305zf interfaceC2305zf = this.f20305OooOo0o;
                if (nativeAdMapper != null) {
                    try {
                        interfaceC2305zf.o000OO(new BinderC1935pf(nativeAdMapper));
                    } catch (RemoteException e) {
                        zzo.zzh("", e);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2305zf.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e2) {
                        zzo.zzh("", e2);
                        return null;
                    }
                }
            default:
                UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
                InterfaceC2305zf interfaceC2305zf2 = this.f20305OooOo0o;
                if (unifiedNativeAdMapper != null) {
                    try {
                        interfaceC2305zf2.o000OO(new BinderC2009rf(unifiedNativeAdMapper));
                    } catch (RemoteException e3) {
                        zzo.zzh("", e3);
                    }
                    break;
                } else {
                    zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        interfaceC2305zf2.zze("Adapter returned null.");
                        break;
                    } catch (RemoteException e4) {
                        zzo.zzh("", e4);
                        return null;
                    }
                }
        }
        return new p80(this.f20303OooOo, 9);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f20304OooOo0O) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }
}
