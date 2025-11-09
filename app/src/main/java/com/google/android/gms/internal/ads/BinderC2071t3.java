package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.t3 */
/* loaded from: classes2.dex */
public final class BinderC2071t3 extends AbstractBinderC1372a4 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f24231OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f24232OooOo0o;

    public BinderC2071t3(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f24231OooOo0O = appOpenAdLoadCallback;
        this.f24232OooOo0o = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void OooOo00(InterfaceC2256y3 interfaceC2256y3) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f24231OooOo0O;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new C2108u3(interfaceC2256y3, this.f24232OooOo0o));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void o0000oOO(zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f24231OooOo0O;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void zzb(int i) {
    }
}
