package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* renamed from: com.google.android.gms.internal.ads.ek */
/* loaded from: classes2.dex */
public final class BinderC1534ek extends AbstractBinderC2272yj {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f18615OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18616OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AdLoadCallback f18617OooOo0o;

    public /* synthetic */ BinderC1534ek(AdLoadCallback adLoadCallback, Object obj, int i) {
        this.f18616OooOo0O = i;
        this.f18617OooOo0o = adLoadCallback;
        this.f18615OooOo = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zze(int i) {
        int i2 = this.f18616OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzf(zze zzeVar) {
        switch (this.f18616OooOo0O) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) this.f18617OooOo0o;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                    break;
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) this.f18617OooOo0o;
                if (rewardedInterstitialAdLoadCallback != null) {
                    rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzg() {
        C1682ik c1682ik;
        switch (this.f18616OooOo0O) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) this.f18617OooOo0o;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdLoaded((C1425bk) this.f18615OooOo);
                    break;
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) this.f18617OooOo0o;
                if (rewardedInterstitialAdLoadCallback != null && (c1682ik = (C1682ik) this.f18615OooOo) != null) {
                    rewardedInterstitialAdLoadCallback.onAdLoaded(c1682ik);
                    break;
                }
                break;
        }
    }

    private final void o000O0O0(int i) {
    }

    private final void o000O0o0(int i) {
    }
}
