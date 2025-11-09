package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* renamed from: com.google.android.gms.internal.ads.ik */
/* loaded from: classes2.dex */
public final class C1682ik extends RewardedInterstitialAd {

    /* renamed from: OooO00o */
    public final String f20051OooO00o;

    /* renamed from: OooO0O0 */
    public final InterfaceC2050sj f20052OooO0O0;

    /* renamed from: OooO0OO */
    public final Context f20053OooO0OO;

    /* renamed from: OooO0o */
    public OnAdMetadataChangedListener f20055OooO0o;

    /* renamed from: OooO0o0 */
    public FullScreenContentCallback f20056OooO0o0;

    /* renamed from: OooO0oO */
    public OnPaidEventListener f20057OooO0oO;

    /* renamed from: OooO0oo */
    public final long f20058OooO0oo = System.currentTimeMillis();

    /* renamed from: OooO0Oo */
    public final BinderC1645hk f20054OooO0Oo = new BinderC1645hk();

    public C1682ik(Context context, String str) {
        this.f20051OooO00o = str;
        this.f20053OooO0OO = context.getApplicationContext();
        this.f20052OooO0O0 = zzbc.zza().zzs(context, str, new BinderC2082te());
    }

    public final void OooO00o(zzei zzeiVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
        if (interfaceC2050sj != null) {
            try {
                zzeiVar.zzq(this.f20058OooO0oo);
                interfaceC2050sj.zzg(zzr.zza.zza(this.f20053OooO0OO, zzeiVar), new BinderC1534ek(rewardedInterstitialAdLoadCallback, this, 1));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                return interfaceC2050sj.zzb();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f20051OooO00o;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20056OooO0o0;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f20055OooO0o;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20057OooO0oO;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzc = null;
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                zzdyVarZzc = interfaceC2050sj.zzc();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdyVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            InterfaceC1939pj interfaceC1939pjZzd = interfaceC2050sj != null ? interfaceC2050sj.zzd() : null;
            if (interfaceC1939pjZzd != null) {
                return new sj0(interfaceC1939pjZzd, 10);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f20056OooO0o0 = fullScreenContentCallback;
        this.f20054OooO0Oo.f19806OooOo0O = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzh(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f20055OooO0o = onAdMetadataChangedListener;
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f20057OooO0oO = onPaidEventListener;
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzl(new C1571fk(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        BinderC1645hk binderC1645hk = this.f20054OooO0Oo;
        binderC1645hk.f19807OooOo0o = onUserEarnedRewardListener;
        InterfaceC2050sj interfaceC2050sj = this.f20052OooO0O0;
        if (interfaceC2050sj != null) {
            try {
                interfaceC2050sj.zzk(binderC1645hk);
                interfaceC2050sj.zzm(new Oooo0o.OooO0OO(activity));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
