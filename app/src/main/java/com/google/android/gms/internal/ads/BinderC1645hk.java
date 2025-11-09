package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.hk */
/* loaded from: classes2.dex */
public final class BinderC1645hk extends AbstractBinderC2124uj {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public FullScreenContentCallback f19806OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public OnUserEarnedRewardListener f19807OooOo0o;

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void OooOO0O(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void Oooo00o(InterfaceC1939pj interfaceC1939pj) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f19807OooOo0o;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new sj0(interfaceC1939pj, 10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void o00ooo(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f19806OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f19806OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f19806OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f19806OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f19806OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
