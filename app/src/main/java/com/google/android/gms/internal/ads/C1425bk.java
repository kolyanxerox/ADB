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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* renamed from: com.google.android.gms.internal.ads.bk */
/* loaded from: classes2.dex */
public final class C1425bk extends RewardedAd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f17512OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC2050sj f17513OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f17514OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final BinderC1645hk f17515OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public OnPaidEventListener f17516OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public OnAdMetadataChangedListener f17517OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public FullScreenContentCallback f17518OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final long f17519OooO0oo;

    public C1425bk(Context context, String str) {
        this(context.getApplicationContext(), str, zzbc.zza().zzs(context, str, new BinderC2082te()), new BinderC1645hk());
    }

    public final void OooO00o(zzei zzeiVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
        if (interfaceC2050sj != null) {
            try {
                zzeiVar.zzq(this.f17519OooO0oo);
                interfaceC2050sj.zzf(zzr.zza.zza(this.f17514OooO0OO, zzeiVar), new BinderC1534ek(rewardedAdLoadCallback, this, 0));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            if (interfaceC2050sj != null) {
                return interfaceC2050sj.zzb();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.f17512OooO00o;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f17518OooO0oO;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f17517OooO0o0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f17516OooO0o;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzc = null;
        try {
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            if (interfaceC2050sj != null) {
                zzdyVarZzc = interfaceC2050sj.zzc();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdyVarZzc);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            InterfaceC1939pj interfaceC1939pjZzd = interfaceC2050sj != null ? interfaceC2050sj.zzd() : null;
            return interfaceC1939pjZzd == null ? RewardItem.DEFAULT_REWARD : new sj0(interfaceC1939pjZzd, 10);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f17518OooO0oO = fullScreenContentCallback;
        this.f17515OooO0Oo.f19806OooOo0O = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzh(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f17517OooO0o0 = onAdMetadataChangedListener;
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f17516OooO0o = onPaidEventListener;
            InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
            if (interfaceC2050sj != null) {
                interfaceC2050sj.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
                if (interfaceC2050sj != null) {
                    interfaceC2050sj.zzl(new C1571fk(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        BinderC1645hk binderC1645hk = this.f17515OooO0Oo;
        binderC1645hk.f19807OooOo0o = onUserEarnedRewardListener;
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        InterfaceC2050sj interfaceC2050sj = this.f17513OooO0O0;
        if (interfaceC2050sj != null) {
            try {
                interfaceC2050sj.zzk(binderC1645hk);
                interfaceC2050sj.zzm(new Oooo0o.OooO0OO(activity));
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public C1425bk(Context context, String str, InterfaceC2050sj interfaceC2050sj, BinderC1645hk binderC1645hk) {
        this.f17519OooO0oo = System.currentTimeMillis();
        this.f17514OooO0OO = context.getApplicationContext();
        this.f17512OooO00o = str;
        this.f17513OooO0O0 = interfaceC2050sj;
        this.f17515OooO0Oo = binderC1645hk;
    }
}
